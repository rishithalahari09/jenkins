package com.cg.anurag.qs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.qs.dto.Question;
@Repository
public interface QuestionDAO  extends JpaRepository<Question,Integer> {

}
