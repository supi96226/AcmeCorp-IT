package com.developer_api_master.developer_initialization.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "developer_table",catalog = "developer_db")
public class DeveloperModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long developerId;
    private String developerName;
    private String address;
    private String city;
    private String state;
    private Date addedDate = new Date();
    public DeveloperModel(){
        super();
    }

    public DeveloperModel(long developerId, String developerName, String address, String city,
                      String state, Date addedDate) {
        this.developerId = developerId;
        this.developerName = developerName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.addedDate = addedDate;
    }

    public long getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(long developerId) {
        this.developerId = developerId;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }



}
