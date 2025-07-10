package net.skeleton.eventservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/events")
public class EventController {

    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of("message", "event ok");
    }
}
