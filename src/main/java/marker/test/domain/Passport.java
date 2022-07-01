package marker.test.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "passport")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Passport {

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
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn (name = "individualId")
    private Individuals individual;
}
