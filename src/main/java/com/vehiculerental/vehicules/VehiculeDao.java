package com.vehiculerental.vehicules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VehiculeDao extends JpaRepository<VehiculeEntity, Integer> {
    VehiculeEntity findById(int id);
}
