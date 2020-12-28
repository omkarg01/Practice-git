package com.omkar.Practise.hello_world;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    //    @GetMapping(method=RequestMethod.GET,path = "hell_world") Another way of get
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }


    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        HelloWorldBean helloWorldBean = new HelloWorldBean();
        helloWorldBean.setMessage("Hello World " + name);
        helloWorldBean.setDate(15);
        helloWorldBean.setId(62);
        return helloWorldBean;
    }

//    @GetMapping(path = "new_one/{age}")
//    public NewMethod newMethod(@PathVariable int age){
//        NewMethod m = new NewMethod();
//        m.setId(50);
//        m.setName("omkar"+ age);
//        return m;
//    }


}

