package marker.test.service;

import marker.test.dao.CorpDAO;
import marker.test.domain.Individuals;
import marker.test.view.IndividualRequest;
import marker.test.view.IndividualResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("corpService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CorpService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorpService.class);

    @Autowired
    private CorpDAO corpDAO;

    public List<IndividualResponse> getIndividualsInfo(IndividualRequest request){

        List<IndividualResponse> responses = new ArrayList<>();

        List<Individuals> individuals = corpDAO.findIndividuals(request.getLastName(),
                request.getFirstName(),
                request.getMiddleName(),
                request.getDateOfBirth());

        if (individuals.isEmpty()) {
            return  Collections.EMPTY_LIST;
        }

        for (Individuals i: individuals) {
            IndividualResponse ir = new IndividualResponse();
            ir.setLastName(i.getLastName());
            ir.setFirstName(i.getFirstName());
            ir.setMiddleName(i.getMiddleName());
            ir.setDateOfBirth(i.getDateOfBirth());
            ir.setpSerial(null);
            ir.setpNumber(null);
            ir.setDateOfIssue(null);

            responses.add(ir);

        }

        return responses;

    }

    ////////////////////////////////////////////////

    public void simpleCall() {
        LOGGER.info("Called.. ");

    }

    public IndividualResponse findIndividuals() {

        LOGGER.info("============= CorpManager.findIndividuals called");

//        addIndividual();

//        List<Individuals> individualsList = corpDAO.findAll();

//        List<Individuals> names = corpDAO.findAllByFirstName("Тест");
//        List<Individuals> names = corpDAO.findAllByFirstNameContaining("Тест");
//        List<Individuals> names = corpDAO.findByBD(LocalDate.of(1994, 01, 01));



//        individualsList.forEach(individuals -> System.out.println(individuals.toString()));

//        names.forEach(name -> System.out.println(name));

        return new IndividualResponse();

    }

    public Long addIndividual() {

        Individuals individuals = new Individuals();

//        individuals.setId(1L);
        individuals.setFirstName("Тест");
        individuals.setLastName("Тестов");
        individuals.setMiddleName("тестович");
        individuals.setDateOfBirth(LocalDate.of(1994,01,01));

        corpDAO.saveAndFlush(individuals);

        return null;

    }
}
