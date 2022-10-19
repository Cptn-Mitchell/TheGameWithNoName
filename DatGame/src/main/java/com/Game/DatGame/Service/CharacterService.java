package com.Game.DatGame.Service;

import com.Game.DatGame.Model.Character;
import com.Game.DatGame.Repository.CharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CharacterService {

    @Autowired
    private CharacterRepo characterRepo;

    public Character getCharacterName(String name) {
        return characterRepo.findCharacterName(name);
    }
}
