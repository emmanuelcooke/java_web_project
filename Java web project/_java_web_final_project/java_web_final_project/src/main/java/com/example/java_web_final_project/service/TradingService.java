package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.TradingDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class TradingService {
    private final TradingRepository repository;

    public TradingService(TradingRepository tradingRepository) {
        repository = tradingRepository;
    }

    public List<Trading> getAllTrades() {
        return repository.findAll();
    }

    public void addTrade(TradingDTO newTrade) {
        Trade tradeToAdd = new Trade();

        repository.save(tradeToAdd);
    }

    public void putTrade(Trading putTrade) {
        Long id = putTrade.getId();
        Trading foundTrade = repository.findById(id).orElseThrow();
        repository.save(newTrade);
        foundTrade.setStrategy(putTrade.getStrategy());
        foundTrade.setProfit(putTrade.getProfit());
        repository.save(foundTrade);
    }

    public void deleteTrade(Long id) {
        repository.deleteById(id);
    }

    public void putTrade(TradingDTO putTrade, Long id) {
        Trading foundTrade = repository.findById(id).orElseThrow();
        foundTrade.setStrategy(putTrade.getStrategy());
        foundTrade.setProfit(putTrade.getProfit());
        repository.save(foundTrade);
    }

    @DeleteMapping("/(id)")
    public void delete(@PathVariable Long id){
        TradingService.deleteTrade(id);
    }

}
