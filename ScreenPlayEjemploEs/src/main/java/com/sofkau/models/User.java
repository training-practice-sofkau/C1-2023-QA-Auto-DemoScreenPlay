package com.sofkau.models;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class User {
    private static final Faker faker = new Faker();
    private static User user = null;
    private int title = faker.number().numberBetween(0,1);
    private String name = faker.name().firstName();
    private String lName = faker.name().lastName();
    private String email = String.format("%s.%s@gmail.com", getName(), getLName());
    private String password = faker.internet().password();
    private String company = faker.company().name();
    private String address = faker.address().fullAddress();
    private String country = faker.country().name();
    private String state = faker.harryPotter().character();
    private String city = faker.country().capital();
    private String zipCode = faker.address().zipCode();
    private String number = faker.phoneNumber().cellPhone();

    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }
}
