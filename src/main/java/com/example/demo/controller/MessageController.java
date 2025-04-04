package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class MessageController {

    private final List<Message> messages = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    // Initialize with some sample data
    public MessageController() {
        messages.add(new Message(counter.incrementAndGet(), "Hello, World!"));
        messages.add(new Message(counter.incrementAndGet(), "Welcome to Spring Boot!"));
    }

    // Web UI endpoint
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("messages", messages);
        return "index";
    }

    // API endpoint
    @GetMapping("/api/messages")
    @ResponseBody
    public List<Message> getAllMessages() {
        return messages;
    }
}