package marker.test.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("DEP")
public class Deposits extends Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long productId;
    @Column(name = "testDep")
    private String testDep;


    public String getTestDep() {
        return testDep;
    }

    public void setTestDep(String testDep) {
        this.testDep = testDep;
    }
}
