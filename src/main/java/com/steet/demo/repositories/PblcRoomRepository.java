package com.steet.demo.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.steet.demo.entities.PubRoom;

public interface PblcRoomRepository extends JpaRepository<PubRoom,UUID>{
    
}
