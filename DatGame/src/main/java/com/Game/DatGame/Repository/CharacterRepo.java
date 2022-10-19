package com.Game.DatGame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepo extends JpaRepository<Character,Integer> {

    @Query("from charactertable where characterName = :characterName")
    Character findCharacterName(@Param("characterName") String name);

}

