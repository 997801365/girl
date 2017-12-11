package com.mydemo.girl.service;

import com.mydemo.girl.vo.Girl;

import java.util.List;


public interface IGirlService {

    public Girl addGirl(Girl girl);

    public List<Girl> findAll();

    public Girl findOne(Integer id) ;

    public void delOne(Integer id) ;

    public Girl updataOne(Girl girl);

    public List<Girl> findByAge(Integer age);

    public Girl findByIdAndPassWord(Integer id,String passWord);
}
