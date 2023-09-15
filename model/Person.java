import generateId from './util/CommonUtil';

public class Person() {
    private String name;
    private String id;
    private String address;
    private List<String> nationalities;
    private String firstLanguage;
    private String familyStatus;
    private Date birthDate;

    public Person(String name, String address, List<String> nationalities, String firstLanguage, String familyStatus, Date birthDate) {
        // Values set by parameters
        this.name = name;
        this.address = address;
        this.nationalities = nationalities;
        this.firstLanguage = firstLanguage;
        this.familyStatus = familyStatus;
        this.birthDate = birthDate;

        // Generated values
        this.id = generateId();
    }
        }