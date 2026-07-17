package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Attempt;

@Repository
public interface AttemptRepository extends JpaRepository<Attempt, Integer> {

    @Query("SELECT DISTINCT a FROM User u " +
            "JOIN u.attemptList a " +
            "LEFT JOIN FETCH a.attemptQuestionList aq " +
            "LEFT JOIN FETCH aq.question q " +
            "LEFT JOIN FETCH aq.attemptOptionList ao " +
            "LEFT JOIN FETCH ao.option o " +
            "LEFT JOIN FETCH q.optionList " +
            "WHERE u.id = :userId AND a.id = :attemptId")
    Attempt getAttempt(@Param("userId") int userId, @Param("attemptId") int attemptId);
}
