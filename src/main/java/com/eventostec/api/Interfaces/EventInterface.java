package com.eventostec.api.Interfaces;

import com.eventostec.api.Entities.Event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventInterface extends JpaRepository<Event, UUID> {


}
