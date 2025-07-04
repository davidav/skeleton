package net.tickets.ticketservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of("message", "ticket ok");
    }
}
