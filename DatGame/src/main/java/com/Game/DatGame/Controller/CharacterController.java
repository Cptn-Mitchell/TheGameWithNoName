package com.Game.DatGame.Controller;

import com.Game.DatGame.Model.Character;
import com.Game.DatGame.Repository.CharacterRepo;
import com.Game.DatGame.Service.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {


    private final CharacterService characterService;


    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping("product/{name}")
    public Character getCharacterName(@PathVariable String name){
        return characterService.getCharacterName(name);
    }

}
