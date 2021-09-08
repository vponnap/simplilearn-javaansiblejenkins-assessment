package com.simpli.cicd.cm.pipeline.javaansiblejenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public DemoController() {
    }

    @GetMapping({"/hellodevops"})
    public String getNames() {
        return "Welcome to Dockers and K8S, Jenkins";
    }

    @GetMapping({"/hellopgdevopsfolks"})
    public String getKanha() {
        return "Welcome to pg devops folks and team and groups";
    }

    @GetMapping({"/helloteam"})
    public String getTeam() {
        return "Welcome to my simpli learn team and groups";
    }
}


