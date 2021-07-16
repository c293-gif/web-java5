package model;

public class Address {
    String district, city, country;

    public Address(String district, String city, String country) {
        this.district = district;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", district=" + district + "]";
    }

    
}
