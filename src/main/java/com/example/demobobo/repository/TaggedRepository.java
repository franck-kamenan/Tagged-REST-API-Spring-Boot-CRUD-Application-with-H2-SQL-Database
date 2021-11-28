package com.example.demobobo.repository;

import com.example.demobobo.entity.Tagged;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaggedRepository extends JpaRepository<Tagged, Integer>{}