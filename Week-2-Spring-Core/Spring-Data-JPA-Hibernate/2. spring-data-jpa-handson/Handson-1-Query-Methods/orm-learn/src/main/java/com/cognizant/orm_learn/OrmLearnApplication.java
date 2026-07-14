package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("\n========== QUERY METHOD 1 ==========");

        List<Country> list1 =
                countryService.getCountriesContaining("ou");

        list1.forEach(System.out::println);

        System.out.println("\n========== QUERY METHOD 2 ==========");

        List<Country> list2 =
                countryService.getCountriesContainingSorted("ou");

        list2.forEach(System.out::println);

        System.out.println("\n========== QUERY METHOD 3 ==========");

        List<Country> list3 =
                countryService.getCountriesStartingWith("Z");

        list3.forEach(System.out::println);

    }

}