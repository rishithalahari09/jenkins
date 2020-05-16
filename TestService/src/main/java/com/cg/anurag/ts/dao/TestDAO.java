package com.cg.anurag.ts.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.anurag.ts.dto.Test;
@Repository
public interface TestDAO extends JpaRepository<Test,Integer>
{

}