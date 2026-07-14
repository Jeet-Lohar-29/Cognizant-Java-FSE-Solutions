package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @Transactional(readOnly = true)
    public List<Stock> getStocksStartingWith(String prefix) {
        return stockRepository.findByCodeStartingWith(prefix);
    }

    @Transactional(readOnly = true)
    public List<Stock> getStocksContaining(String keyword) {
        return stockRepository.findByNameContaining(keyword);
    }

    @Transactional(readOnly = true)
    public List<Stock> getStocksContainingSorted(String keyword) {
        return stockRepository.findByNameContainingOrderByNameAsc(keyword);
    }

}