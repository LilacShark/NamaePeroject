package marker.test.service;

import marker.test.dao.CorpDAO;
import marker.test.domain.Individuals;
import marker.test.view.IndividualResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service("corpService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CorpService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorpService.class);

    @Autowired
    private CorpDAO corpDAO;


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
        individuals.setSex("M");

        corpDAO.saveAndFlush(individuals);

        return null;

    }
}
