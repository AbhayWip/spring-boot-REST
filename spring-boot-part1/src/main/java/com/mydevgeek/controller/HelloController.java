package com.mydevgeek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DAM on 2/13/17.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome World!";
    }
}
