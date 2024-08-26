package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Branch")
public class Branch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long branchId; // Unique identifier for the branch
    
    private String branchName; // Name of the branch
    
    private String branchAddress; // Address of the branch
    
    private String city; // City where the branch is located
    
    private String state; // State where the branch is located
    
    private String postalCode; // Postal code for the branch location
    
    private Long branchNumber; // Contact phone number of the branch
    
 

    // Getters and Setters
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return branchName;
    }

    public void setName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return branchAddress;
    }

    public void setAddress(String branchAddress) {
        this.branchAddress = branchAddress;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Long getbranchNumber() {
        return branchNumber;
    }

    public void setbranchNumber(Long branchNumber) {
        this.branchNumber = branchNumber;
    }

}

