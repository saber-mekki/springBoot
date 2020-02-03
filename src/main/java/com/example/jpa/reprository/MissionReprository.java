package com.example.jpa.reprository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.model.Mission;
@Repository
public interface MissionReprository  extends JpaRepository<Mission,Long> {
}