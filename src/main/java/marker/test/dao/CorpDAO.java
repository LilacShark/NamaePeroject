package marker.test.dao;

import marker.test.domain.Individuals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //для использования спринг дата
public interface CorpDAO extends JpaRepository<Individuals, Long> {

}
