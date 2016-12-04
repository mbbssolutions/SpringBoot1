package com.mbbs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pavan_Karasala on 12/3/2016.
 */

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/owner")
    @ResponseBody
    String home(){
        return "Hello Pavan Karasala!!!";
    }

    @RequestMapping("/mbbs")
    @ResponseBody
    String home1(){
        return "Welcome to MBBS solutions !!!";
    }

    @RequestMapping("/")
    @ResponseBody
    String home2(){
        return "Helloo !!!";
    }


    public static void main(String args[]){
        SpringApplication.run(SampleController.class,args);
    }
}

