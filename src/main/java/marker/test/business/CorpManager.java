package marker.test.business;

import marker.test.dao.CorpDAO;
import marker.test.domain.Individuals;
import marker.test.rest.CorpController;
import marker.test.view.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("corpManager")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CorpManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorpManager.class);

    @Autowired
    private CorpDAO corpDAO;

    public Response findIndividuals() {

        LOGGER.info("CorpManager.findIndividuals called");

//        addIndividual();

//        List<Individuals> individualsList = corpDAO.findAll();

//        List<Individuals> names = corpDAO.findAllByFirstName("Тест");
//        List<Individuals> names = corpDAO.findAllByFirstNameContaining("Тест");
//        List<Individuals> names = corpDAO.findByBD(LocalDate.of(1994, 01, 01));



//        individualsList.forEach(individuals -> System.out.println(individuals.toString()));

//        names.forEach(name -> System.out.println(name));

        return new Response();

    }

    public Long addIndividual() {

        Individuals individuals = new Individuals();

//        individuals.setId(1L);
        individuals.setFirstName("Тест");
        individuals.setSecondName("Тестов");
        individuals.setPatronymicName("тестович");
        individuals.setDateOfBirth(LocalDate.of(1994,01,01));
        individuals.setSex("M");

        corpDAO.saveAndFlush(individuals);

        return null;

    }


}
