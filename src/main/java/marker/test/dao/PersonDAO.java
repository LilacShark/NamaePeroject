package marker.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersonDAO {

    @PersistenceContext
    private EntityManager entityManager;
}
