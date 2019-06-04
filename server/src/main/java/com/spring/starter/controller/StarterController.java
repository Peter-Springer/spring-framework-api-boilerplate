package com.spring.starter.controller;

import com.spring.starter.entity.Starter;
import com.spring.starter.json.RequestJson;
import com.spring.starter.service.StarterService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class StarterController {

    private StarterService service;

    public StarterController(StarterService service) {
        this.service = service;
    }

    @PostMapping("/gettingStarted")
    public Starter gettingStarted(@RequestBody RequestJson requestJson) {
        Starter starter = Starter.builder()
                .column(requestJson.getRequest())
                .build();

        return service.saveRecord(starter);
    }
}
