package org.example.shp.service;

import org.example.shp.domain.MatchSchedule;
import org.example.shp.model.request.PatchMatchScheduleRequest;
import org.example.shp.model.request.PutMatchScheduleRequest;
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
        //1번방법
        //TODO : 0305(1) ~~Repository.save를 하지 않았는데도 업데이트가 된 이유 (= DB에 수정 저장된 이유)
//        matchScheduleRepository.findOneById(patchMatchScheduleRequest.getId()).setStatus(patchMatchScheduleRequest.getStatus());

        //1번 방법을 풀어서 보면
        MatchSchedule matchSchedule = matchScheduleRepository.findOneById(patchMatchScheduleRequest.getId());
        matchSchedule.setStatus(patchMatchScheduleRequest.getStatus());

        //2번방법(엔티티에서 함수하나 만들어서 해보기)
        MatchSchedule matchSchedule2 = matchScheduleRepository.findOneById(patchMatchScheduleRequest.getId());
        matchSchedule2.updateStatus(patchMatchScheduleRequest.getStatus());

        //3번방법(서비스에서 수정하고 세이브해서 해보기)
        MatchSchedule matchSchedule3 = matchScheduleRepository.findOneById(patchMatchScheduleRequest.getId());
        matchSchedule3.setStatus(patchMatchScheduleRequest.getStatus());
        matchScheduleRepository.save(matchSchedule3);

        return patchMatchScheduleRequest.getId();
    }

    public Long putMatchSchedule(PutMatchScheduleRequest putMatchScheduleRequest) {
        MatchSchedule matchSchedule = matchScheduleRepository.findOneById(putMatchScheduleRequest.getId());
        matchSchedule.setStatus(putMatchScheduleRequest.getStatus());
        matchScheduleRepository.save(matchSchedule);

        return putMatchScheduleRequest.getId();
    }
}
