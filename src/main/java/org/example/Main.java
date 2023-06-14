package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall(new ArrayList<>());
        Wall wall2 = new Wall(new ArrayList<>());

        Block block1 = new CustomBlock("red", "concrete");
        Block block2 = new CustomBlock("blue", "concrete");
        Block block3 = new CustomBlock("brown", "wood");
        Block block4 = new CustomBlock("green", "wood");
        Block block5 = new CustomBlock("red", "wood");

        //dodawanie block'ów do wall1
        wall1.addBlock(block1);
        wall1.addBlock(block2);
        wall1.addBlock(block3);
        wall1.addBlock(block4);
        wall1.addBlock(block5);

        //dodawanie block'ów do wall2
        wall2.addBlock(block3);
        wall2.addBlock(block1);
        wall2.addBlock(block5);

        //wyświetlanie dowolnego materiału w podanym kolorze
        wall1.findBlockByColor("red");
        wall2.findBlockByColor("brown");

        //wyświetlanie dowolnego materiału o podanej nazwie materiału
        wall1.findBlocksByMaterial("wood");
        wall2.findBlocksByMaterial("wood");

        //wyświetlanie liczby wszystkich elementów tworzących strukturę
        wall1.count();
        wall2.count();
    }
}