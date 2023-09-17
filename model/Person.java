import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Person extends LegalEntity {
    
    private String firstLanguage;
    private String familyStatus;
    private List<String> nationalities;
    private Date birthDate;

    public Person(String name, String address, List<String> nationalities, String firstLanguage, String familyStatus, Date birthDate) {
        // Values set by parameters
        super(name);
        this.address = address;
        this.nationalities = nationalities;
        this.firstLanguage = firstLanguage;
        this.familyStatus = familyStatus;
        this.birthDate = birthDate;

        // Generated values
        this.id = UUID.randomUUID().toString();
    }

    public Person(String name) {
        // Values set by parameters
        super(name);

        // Generated values
        this.id = UUID.randomUUID().toString();
    }

    public String getFirstLanguage() {
        return this.firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public List<String> getNationalities() {
        return this.nationalities;
    }

    public void setNationalities(List<String> nationalities) {
        this.nationalities = nationalities;
    }

    public String getFamilyStatus() {
        return this.familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        }