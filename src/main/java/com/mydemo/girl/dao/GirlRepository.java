package com.mydemo.girl.dao;

import com.mydemo.girl.vo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);

    public Girl findByIdAndPassWord(Integer id,String passWord);

}
