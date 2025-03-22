package com.steet.demo.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.steet.demo.entities.PblcRoom;

public interface PblcRoomRepository extends JpaRepository<PblcRoom,UUID>{
    
}
