package org.example.shp.repository;

import org.example.shp.domain.PlayerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDetailRepository extends JpaRepository<PlayerDetail, Long> {
}
