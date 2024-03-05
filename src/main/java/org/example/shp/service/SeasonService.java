package org.example.shp.service;

import org.example.shp.domain.Season;
import org.example.shp.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {
    @Autowired
    SeasonRepository seasonRepository;

    public List<Season> getSeasonList() {
        return seasonRepository.findAll();
    }
}
