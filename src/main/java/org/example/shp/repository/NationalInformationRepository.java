package org.example.shp.repository;

import org.example.shp.domain.NationalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalInformationRepository extends JpaRepository<NationalInformation, Long> {
}
