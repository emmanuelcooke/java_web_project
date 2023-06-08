package com.example.java_web_final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
@Data
public class trading {

    @Id
    @GeneratedValue
    private Long id;
    private String strategy;
    private String risk;
    private int runtime; //length of trade

    public trading() {
    }

}
