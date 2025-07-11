package net.skeleton.ticketservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Value("${gateway.url}")
    private String gatewayUrl;

    private final RestTemplate restTemplate;

    public TicketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/test")
    public Map<String, String> test() {
        String eventMessage = restTemplate.getForObject(gatewayUrl + "/api/events/test", String.class);
        return Map.of(
                "message", "ticket ok",
                "eventMessage", eventMessage != null ? eventMessage : "No response from event service");
    }
}
