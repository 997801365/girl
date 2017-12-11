package com.mydemo.girl.controller;

import com.mydemo.girl.dao.GirlRepository;
import com.mydemo.girl.service.IGirlService;
import com.mydemo.girl.vo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private IGirlService iGirlService;


//        查询所有数据

    @GetMapping(value = "/girls")
    public List<Girl> findAllGirl() {
        return iGirlService.findAll();
    }

//    增加数据参数
    /*@RequestMapping(value = "/girls", method = RequestMethod.POST)
    public Girl addGirl(@RequestParam(value = "names") String myName,
                        @RequestParam(value = "age") Integer age) {
        Girl girl = new Girl();
        girl.setName(myName);
        girl.setAge(age);
        Girl girl2 = iGirlService.addGirl(girl);
        return girl2;
    }*/
//      增加数据对象
    @RequestMapping(value = "/girls", method = RequestMethod.POST)
    public Girl addGirl(@RequestBody Girl girl) {
        System.out.println(girl.getName());
        Girl girl2 = iGirlService.addGirl(girl);
        return girl2;
    }


//    查询单个
    @RequestMapping(value = "/girls/{id}", method = RequestMethod.GET)
    public Girl findOne(@PathVariable Integer id) {
       return iGirlService.findOne(id);
    }

//    删除单个
    @RequestMapping(value = "/girls/{id}", method = RequestMethod.PUT)
    public String delOne(@PathVariable Integer id) {

        iGirlService.delOne(id);
        return "删除成功";
    }

//    更改单个
    @RequestMapping(value = "/girls/{id}", method = RequestMethod.POST)
    public Girl UpdataOne(@PathVariable Integer id,
                          @RequestParam(value = "name") String myName,
                          @RequestParam(value = "age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(myName);
        girl.setAge(age);
        return iGirlService.updataOne(girl);
    }


//    通过年龄查找列表
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> findByAge(@PathVariable Integer age){
        return iGirlService.findByAge(age);
    }

    @PostMapping(value = "/girls/login")
    public Girl login(@RequestBody Girl girl){
        return iGirlService.findByIdAndPassWord(girl.getId(),girl.getPassWord());
    }


}
