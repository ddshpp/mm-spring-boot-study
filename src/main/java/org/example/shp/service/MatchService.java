package org.example.shp.service;

import org.example.shp.domain.MatchSchedule;
import org.example.shp.model.request.PatchMatchScheduleRequest;
import org.example.shp.model.request.SaveMatchScheduleRequest;
import org.example.shp.repository.MatchScheduleDetailRepository;
import org.example.shp.repository.MatchScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    MatchScheduleRepository matchScheduleRepository;

    @Autowired
    MatchScheduleDetailRepository matchScheduleDetailRepository;

    @Transactional(readOnly = true)
    public List<MatchSchedule> getMatchScheduleList() {
        return matchScheduleRepository.findAll();
    }

    @Transactional
    public Long saveMatchSchedule(SaveMatchScheduleRequest saveMatchScheduleRequest) {
        MatchSchedule matchSchedule = matchScheduleRepository.save(saveMatchScheduleRequest.toMatchScheduleEntity());
        matchScheduleDetailRepository.save(saveMatchScheduleRequest.toMatchScheduleDetailEntity(matchSchedule.getId()));
        return matchSchedule.getId();
    }

    @Transactional
    public MatchSchedule getMatchSchedule(Long matchScheduleId) {
        return matchScheduleRepository.findOneById(matchScheduleId);
    }

    @Transactional
    public Long deleteMatchSchedule(Long matchScheduleId) {
        matchScheduleRepository.deleteById(matchScheduleId);
        matchScheduleDetailRepository.delete(matchScheduleDetailRepository.findByMatchScheduleId(matchScheduleId));

        return matchScheduleId;
    }

    @Transactional
    public Long patchMatchSchedule(PatchMatchScheduleRequest patchMatchScheduleRequest) {
        matchScheduleRepository.findOneById(patchMatchScheduleRequest.getId()).setStatus(patchMatchScheduleRequest.getStatus());

        //TODO : 0305(1) ~~Repository.save를 하지 않았는데도 업데이트가 된 이유 (= DB에 수정 저장된 이유)
        return patchMatchScheduleRequest.getId();
    }
}
