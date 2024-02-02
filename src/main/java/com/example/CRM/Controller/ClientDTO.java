package com.example.CRM.Controller;

import jakarta.persistence.*;

public class ClientDTO {

//    private Integer id;

//    @ManyToMany
//    List<Client> clients = new ArrayList<>();

    @Column(name = "")
    private String company_name;
    @Column(name = "")
    private String first_name;
    @Column(name = "")
    private String last_name;
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "")
    private String address;
    @Column(name = "")
    private String zip_code;
    @Column(name = "")
    private String city;
    @Column(name = "")
    private String country;
    @Column(name = "")
    private Integer state;


    public ClientDTO() {
    }

    public ClientDTO(String company_name, String first_name, String last_name, String email, String phone, String address, String zip_code, String city, String country, Integer state) {
        this.company_name = company_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zip_code = zip_code;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "company_name='" + company_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state=" + state +
                '}';
    }
}