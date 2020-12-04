package com.surender.au.post.lib.dataOperations;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class RandomData {
    private Faker faker;

    public RandomData(){
        this.faker = new Faker();
    }

    public String getFirstName(){
        return this.faker.name().firstName();
    }
    public String getLastName(){
        return faker.name().lastName();
    }
    public String getEmail(){
        return faker.internet().emailAddress();
    }

    public String getPhoneNo(){
        return faker.phoneNumber().phoneNumber();
    }
    public String getWebsite(){
        return faker.internet().url();
    }
    public String getRevenue(){
        return RevenueOptions.values()[faker.random().nextInt(0,RevenueOptions.values().length)].label;
    }

    public String getMessage(){
        return faker.regexify("[A-Za-z]{50}");
    }

    public String getCompanyname(){
        return faker.company().name();
    }
}
