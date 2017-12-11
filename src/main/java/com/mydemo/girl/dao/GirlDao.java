package com.mydemo.girl.dao;


import com.mydemo.girl.vo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GirlDao {

    @Autowired
    private GirlRepository girlRepository;


    public Girl addGirl(Girl girl) {


        return girlRepository.save(girl);
    }

    public List<Girl> findAll() {
        return girlRepository.findAll();
    }

    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }

    public void delOne(Integer id) {
        girlRepository.delete(id);
    }

    public Girl updataOne(Girl girl) {
        return girlRepository.save(girl);
    }

    public List<Girl> findByAge(Integer age) {
        return girlRepository.findByAge(age);
    }


    public Girl findByIdAndPassWord(Integer id,String passWord){
        return girlRepository.findByIdAndPassWord(id,passWord);
    }

}
