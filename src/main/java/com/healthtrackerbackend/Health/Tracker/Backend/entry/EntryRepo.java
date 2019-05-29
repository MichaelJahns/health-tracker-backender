package com.healthtrackerbackend.Health.Tracker.Backend.entry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepo extends JpaRepository<Entry, Long> {
    Entry findEntryById(Long id);
}
