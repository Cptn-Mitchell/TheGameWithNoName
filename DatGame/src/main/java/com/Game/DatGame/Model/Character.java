package com.Game.DatGame.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "charactertable")
public class Character {

    @Id
    @GeneratedValue
    private int Id;

    private String name;

    private int age;

    private long money;

}
