package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {

    List<Stock> findByCodeStartingWith(String prefix);

    List<Stock> findByNameContaining(String keyword);

    List<Stock> findByNameContainingOrderByNameAsc(String keyword);

}