package com.cognizant.ormlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.SkillRepository;

@Service
public class SkillService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkillService.class);

    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Transactional
    public Skill get(int id) {
        LOGGER.info("Start");
        LOGGER.debug("Skill id: {}", id);
        Skill skill = skillRepository.findById(id).get();
        LOGGER.debug("Skill: {}", skill);
        LOGGER.info("End");
        return skill;
    }

    @Transactional
    public void save(Skill skill) {
        LOGGER.info("Start");
        LOGGER.debug("Skill: {}", skill);
        skillRepository.save(skill);
        LOGGER.info("End");
    }

}
