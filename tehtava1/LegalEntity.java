package koodauskoe.tehtava1;

import java.util.UUID;

public class LegalEntity {
    protected String name;
    protected String id;
    protected String address;

    public LegalEntity(String name) {
        this.name = name;
        // Generated values
        this.id = UUID.randomUUID().toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
    
}
