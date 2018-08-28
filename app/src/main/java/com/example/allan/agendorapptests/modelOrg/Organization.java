package com.example.allan.agendorapptests.modelOrg;

import com.google.gson.annotations.SerializedName;

public class Organization {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("legalName")
    private Object legalName;

    @SerializedName("email")
    private String email;

    @SerializedName("cnpj")
    private String cnpj;

    @SerializedName("description")
    private String description;

    @SerializedName("logo")
    private Logo logo;

    @SerializedName("updatedAt")
    private String updatedAt;

    @SerializedName("ranking")
    private Integer ranking;

    @SerializedName("website")
    private String website;

    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("contact")
    private Contact contact;

    @SerializedName("address")
    private Address address;

    @SerializedName("category")
    private Category category;

    @SerializedName("sector")
    private Sector sector;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLegalName() {
        return legalName;
    }

    public void setLegalName(Object legalName) {
        this.legalName = legalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

}