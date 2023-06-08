package com.example.java_web_final_project.controller;

import com.example.java_web_final_project.model.TradingDTO;
import com.example.java_web_final_project.service.TradingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trading")
@CrossOrigin
public class TradingController {
    private final TradingService tradingService;

    public TradingController(TradingService tradingService) {
        TradingService = service;
    }

    @GetMapping
    public List<trading> getAllTrades() {
        return tradingService.getAllTrades();
    }

    @PostMapping
    public void placeTrade(@RequestBody TradingDTO trade) {
        tradingService.addTrade(trade);
    }

    @PutMapping
    public void putTrade(@RequestBody Trade trade) {
        tradingService.putTrade(trade);
    }

    @PutMapping("/(id)")
    public void putTrade(@RequestBody TradingDTO trade, Long id) {
        tradingService.putTrade(trade, id);
    }
}
