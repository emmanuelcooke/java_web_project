package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.trading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tradingRepository extends JpaRepository<trading, Long> {
   // trading findByName(String name);
}
