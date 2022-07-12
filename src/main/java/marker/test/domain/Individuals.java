package marker.test.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "individuals")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // стиль представления в бд наследованых таблиц
@NamedQuery(name = "Individuals.findByBD",
        query = "SELECT i FROM Individuals i WHERE i.dateOfBirth = :dateOfBirth")
public class Individuals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "individualId")
    private Long individualId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, mappedBy = "individual")
    private List<Passports> passports;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Long individualId) {
        this.individualId = individualId;
    }

    public List<Passports> getPassports() {
        return passports;
    }

    public void setPassports(List<Passports> passports) {
        this.passports = passports;
    }

    @Override
    public String toString() {
        return "Individuals{" +
                "id=" + individualId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", patronymicName='" + middleName + '\'' +
                ", dateOfBirth=" + dateOfBirth + '\'' +
                '}';
    }
}
