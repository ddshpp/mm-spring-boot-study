package org.example.shp.controller;

import lombok.RequiredArgsConstructor;
import org.example.shp.domain.MatchSchedule;
import org.example.shp.model.request.PatchMatchScheduleRequest;
import org.example.shp.model.request.PutMatchScheduleRequest;
import org.example.shp.model.request.SaveMatchScheduleRequest;
import org.example.shp.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match_schedules")
@RequiredArgsConstructor
public class MatchController {
    @Autowired
    private final MatchService matchService;

    @GetMapping
    public List<MatchSchedule> getMatchScheduleList() {
        return matchService.getMatchScheduleList();
    }

    @GetMapping("/{matchScheduleId}")
    public MatchSchedule getMatchSchedule(@PathVariable Long matchScheduleId) {
        return matchService.getMatchSchedule(matchScheduleId);
    }

//    @GetMapping("/5")
//    public String getMatchSchedule3() {
//        return "이렇게 하면 getMatchSchedule 메소드에 matchScheduleId가 5인 경우를 할 수 없다. ";
//    }

    @PostMapping
    public Long saveMatchSchedule(@RequestBody SaveMatchScheduleRequest saveMatchScheduleRequest) {
        return matchService.saveMatchSchedule(saveMatchScheduleRequest);
    }

    @DeleteMapping("/{matchScheduleId}")
    public Long deleteMatchSchedule(@PathVariable Long matchScheduleId) {
        return matchService.deleteMatchSchedule(matchScheduleId);
    }

    @PatchMapping
    public Long patchMatchSchedule(@RequestBody PatchMatchScheduleRequest patchMatchScheduleRequest) {
        return matchService.patchMatchSchedule(patchMatchScheduleRequest);
    }

    @PutMapping
    public Long putMatchSchedule(@RequestBody PutMatchScheduleRequest putMatchScheduleRequest) {
        return matchService.putMatchSchedule(putMatchScheduleRequest);
    }
}
