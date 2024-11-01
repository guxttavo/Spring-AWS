package com.eventostec.api.Interfaces;

import com.eventostec.api.Entities.Address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AddressInterface extends JpaRepository<Address, UUID> {

    public Optional<Address> findByEventId(UUID eventId);

}
