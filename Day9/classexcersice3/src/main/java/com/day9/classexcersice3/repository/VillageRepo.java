package com.day9.classexcersice3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day9.classexcersice3.model.*;

public interface VillageRepo extends JpaRepository<Village, Integer> {

    Village findByVillageName(String villageName);

    Village findByVillagePopulation(int villagePopulation);
}
