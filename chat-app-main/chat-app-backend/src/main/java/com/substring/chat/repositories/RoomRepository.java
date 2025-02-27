package com.substring.chat.repositories;


import com.substring.chat.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//public interface RoomRepository extends MongoRepository<Room, String> {
//    //get room using room id
//    Room findByRoomId(String roomId);
//}
@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    //get room using room id
    Room findByRoomId(String roomId);
}
