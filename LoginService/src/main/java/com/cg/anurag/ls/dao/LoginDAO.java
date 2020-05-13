package com.cg.anurag.ls.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.anurag.ls.dto.Login;
public interface LoginDAO extends JpaRepository<Login,String> {

}
