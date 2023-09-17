import java.util.Date;
import java.util.UUID;

public class Building {
    
    private String id;
    private String location;
    private LegalEntity owner;
    private Double areaSize;
    private String equipment;
    private String connections;
    private Date constructionDate;

    public Building(String location, LegalEntity owner, Double areaSize, String equipment, String connections, Date constructionDate) {
        // Values set by parameters
        this.location = location;
        this.owner = owner;
        this.areaSize = areaSize;
        this.equipment = equipment;
        this.connections = connections;
        this.constructionDate = constructionDate;

        // Generated values
        this.id = UUID.randomUUID().toString();
    }

    // Basic Get and Set methods
    public String getId() {
        return this.id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LegalEntity getOwner() {
        return this.owner;
    }

    public void setOwner(LegalEntity owner) {
        this.owner = owner;
    }

    public Double getAreaSize() {
        return this.areaSize;
    }

    public void setAreaSize(Double areaSize) {
        this.areaSize = areaSize;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getConnections() {
        return this.connections;
    }

    public void setConnections(String connections) {
        this.connections = connections;
    }

    public Date getConstructionDate() {
        return this.constructionDate;
    }

    public void setConstructionDate(Date constructionDate) {
        this.constructionDate = constructionDate;
    }

    public Boolean isOwnedByCompany() {
        return this.owner instanceof Company;
    }
}
