package org.example.shp.controller;

import lombok.RequiredArgsConstructor;
import org.example.shp.domain.Season;
import org.example.shp.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seasons")
@RequiredArgsConstructor
public class SeasonController {
    @Autowired
    SeasonService seasonService;

    @GetMapping
    public List<Season> getSeasonList() {
        return seasonService.getSeasonList();
    }
}
