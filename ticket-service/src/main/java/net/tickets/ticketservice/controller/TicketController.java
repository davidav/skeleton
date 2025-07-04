package net.tickets.ticketservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final RestTemplate restTemplate;

    public TicketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/test")
    public Map<String, String> test() {
        String eventMessage = restTemplate.getForObject("http://localhost:8088/api/events/test", String.class);
        return Map.of(
                "message", "ticket ok",
                "eventMessage", eventMessage != null ? eventMessage : "No response from event service");
    }
}
