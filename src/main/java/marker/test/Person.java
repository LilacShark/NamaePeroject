package marker.test;

import java.util.Date;

public class Person {

    private String firstName;
    private String secondName;
    private String patronymicName;
    private Date dateOfBirth;
    private int pSerial;
    private int pNumber;
    private Date pIssueDate;

    private String test;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getpSerial() {
        return pSerial;
    }

    public void setpSerial(int pSerial) {
        this.pSerial = pSerial;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public Date getpIssueDate() {
        return pIssueDate;
    }

    public void setpIssueDate(Date pIssueDate) {
        this.pIssueDate = pIssueDate;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
