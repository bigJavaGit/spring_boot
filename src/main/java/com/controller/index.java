package com.controller;

import org.springframework.boot.SpringApplication;   
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;   
import org.springframework.stereotype.Controller;   
//import org.springframework.web.bind.annotation.RequestBody;   
import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * Created by bob on 2015/10/28.
 * 模板测试
 */  
@Controller   
@EnableAutoConfiguration  
public class index {   
  
    @RequestMapping("/hello")   
    @ResponseBody
    public String hellow(){   
  
        return "嗨喽Spring Boot!Hello Velocity";   
    }   
  
    @RequestMapping("/index")
    public String body(Map<String,Object> map){

        Map<String,Object> myMap=new HashMap<String, Object>();
        myMap.put("one","第一个");
        myMap.put("two","第二个");
        myMap.put("three","第三个");
        myMap.put("four","第四");
        map.put("myMap",myMap);
        Map<String,Object> myParams=new HashMap<String, Object>();
        myParams.put("a","b");

        return "index";
}
    @RequestMapping("/login")
    public String ViewLogin(Model mode){
    	
    	mode.addAttribute("testparam", "hi boot..");
    	mode.addAttribute("params1","最坑的框架，spring boot");
    	return "login";
    }
    @RequestMapping("/goIndex")
    public String ViewIndex(Model mode,Model mode2){
    	
    	mode.addAttribute("param1", "药药切克闹");
    	mode2.addAttribute("param2","aaa测试页");
    	return "goIndex";
    }
    public static void main(String[] args) {   
        
        SpringApplication.run(index.class,args);   
  
    }   
  
}  