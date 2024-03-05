package org.example.shp.repository;

import org.example.shp.domain.GoalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalTypeRepository extends JpaRepository<GoalType, Long> {
}
