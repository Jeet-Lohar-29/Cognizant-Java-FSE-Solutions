package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.service.StockService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private StockService stockService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("\n========== QUERY METHOD 1 ==========");

        List<Stock> stocks1 =
                stockService.getStocksStartingWith("A");

        stocks1.forEach(System.out::println);

        System.out.println("\n========== QUERY METHOD 2 ==========");

        List<Stock> stocks2 =
                stockService.getStocksContaining("oo");

        stocks2.forEach(System.out::println);

        System.out.println("\n========== QUERY METHOD 3 ==========");

        List<Stock> stocks3 =
                stockService.getStocksContainingSorted("o");

        stocks3.forEach(System.out::println);

    }

}