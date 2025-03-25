package com.steet.demo.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.steet.demo.entities.PubRoom;

public interface PubRoomRepository extends JpaRepository<PubRoom,UUID>{
    
}
