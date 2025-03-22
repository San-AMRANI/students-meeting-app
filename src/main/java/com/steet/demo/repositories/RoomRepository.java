package com.steet.demo.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.steet.demo.entities.Room;

public interface RoomRepository extends JpaRepository<Room,UUID>{
    
}
