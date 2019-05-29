package com.healthtrackerbackend.Health.Tracker.Backend.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryController {
    @Autowired
    EntryRepo repo;

    @PostMapping
    public void createEntry(
            @RequestParam String description,
            @RequestParam String length,
            @RequestParam int mood
    ) {
        Entry entry = new Entry(description, length, mood);
        repo.save(entry);
    }
}
