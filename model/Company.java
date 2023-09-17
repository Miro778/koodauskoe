public class Company extends LegalEntity {

    private String industry;
    private Integer employees;

    public Company(String name, String industry, Integer employees) {
        // Manually set values
        super(name);
        this.industry = industry;
        this.employees = employees;
    }

    public String getIndustry() {
        return this.industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getEmployees() {
        return this.employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }
    
}
