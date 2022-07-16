package marker.test.dao;

import marker.test.domain.Individuals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository //для использования спринг дата
public interface CorpDAO extends JpaRepository<Individuals, Long> {

    // запрос по имени согалсно доке
    List<Individuals> findAllByFirstName(String name);
    List<Individuals> findAllByFirstNameContaining(String substring);

    //неймед квери
    List<Individuals> findByBD(@Param("dateOfBirth") LocalDate dateofbirth);

    //Через Анотацию квери
    @Query("SELECT i FROM Individuals i WHERE i.id > :id")
    List<Individuals> findByBD(@Param("id") Long id);

    @Query("SELECT i FROM Individuals i WHERE i.lastName = :lastName AND " +
            "i.firstName = :firstName AND " +
            "i.middleName = :middleName AND " +
            "i.dateOfBirth = :dateOfBirth")
    List<Individuals> findIndividuals(@Param("lastName") String lastName,
                                     @Param("firstName") String firstName,
                                     @Param("middleName") String middleName,
                                     @Param("dateOfBirth") LocalDate dateOfBirth);


    @Query("SELECT i FROM Individuals i JOIN i.passports p WHERE i.lastName = :lastName AND " +
            "i.firstName = :firstName AND " +
            "i.middleName = :middleName AND " +
            "i.dateOfBirth = :dateOfBirth AND " +
            "p.dateOfIssue > CURRENT_DATE")
    List<Individuals> findIndividualsWithPassports(@Param("lastName") String lastName,
                                      @Param("firstName") String firstName,
                                      @Param("middleName") String middleName,
                                      @Param("dateOfBirth") LocalDate dateOfBirth);


}
