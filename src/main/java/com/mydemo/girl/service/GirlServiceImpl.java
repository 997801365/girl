package com.mydemo.girl.service;

import com.mydemo.girl.dao.GirlDao;
import com.mydemo.girl.vo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GirlServiceImpl implements  IGirlService{
    @Override
    public Girl findByIdAndPassWord(Integer id,String passWord) {
        Girl girl2 = girlDao.findByIdAndPassWord(id,passWord);
        return girl2;
    }

    @Autowired
    private GirlDao girlDao;


    public Girl addGirl(Girl girl) {
        return girlDao.addGirl(girl);
    }

    public List<Girl> findAll() {
        return girlDao.findAll();
    }

    public Girl findOne(Integer id) {
        return girlDao.findOne(id);
    }

    public void delOne(Integer id) {
        girlDao.delOne(id);
    }

    public Girl updataOne(Girl girl) {
        return girlDao.updataOne(girl);
    }

    @Override
    public List<Girl> findByAge(Integer age) {
        return  girlDao.findByAge(age);
    }


}
