package marker.test.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "Individuals")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // стиль представления в бд наследованых таблиц
@NamedQuery(name = "Individuals.findByBD",
        query = "SELECT i FROM Individuals i WHERE i.dateOfBirth = :dateOfBirth")
public class Individuals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "secondName")
    private String secondName;
    @Column(name = "patronymicName")
    private String patronymicName;
    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;
    @Column(name = "sex")
    private String sex;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Individuals{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex='" + sex + '\'' +
                '}';
    }
}
