package com.example.demobobo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

// @Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "taggeds")
@Table(name = "taggeds")
public class Tagged {
    
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;
    
    @Column(nullable = false)
    String tag;
}