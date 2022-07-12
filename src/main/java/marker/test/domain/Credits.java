package marker.test.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CRED")
public class Credits extends Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long productId;
    @Column(name = "testCred")
    private String testCred;

    public String getTestCred() {
        return testCred;
    }

    public void setTestCred(String testCred) {
        this.testCred = testCred;
    }
}
