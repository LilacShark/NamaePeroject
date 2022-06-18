package marker.test.business;

import marker.test.dao.CorpDAO;
import marker.test.domain.Individuals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("corpManager")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CorpManager {

    @Autowired
    private CorpDAO corpDAO;

    public void findIndividuals() {

        addIndividual();

        List<Individuals> individualsList = corpDAO.findAll();
        individualsList.forEach(individuals -> System.out.println(individuals.toString()));

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
