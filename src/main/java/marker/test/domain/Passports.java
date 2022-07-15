package marker.test.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "passports")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Passports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passportId")
    private Long passportId;
    @Column(name = "pSerial")
    private String pSerial;
    @Column(name = "pNumber")
    private String pNumber;
    @Column(name = "dateOfIssue")
    private LocalDate dateOfIssue;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn (name = "individualId")
    private Individuals individual;


    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    public String getpSerial() {
        return pSerial;
    }

    public void setpSerial(String pSerial) {
        this.pSerial = pSerial;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Individuals getIndividual() {
        return individual;
    }

    public void setIndividual(Individuals individual) {
        this.individual = individual;
    }
}
