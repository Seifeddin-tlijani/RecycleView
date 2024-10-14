package com.example.recyclerview1.data;

import com.example.recyclerview1.model.Word;

import java.util.LinkedList;

public class Datasource {


    public Datasource(){

    }

    public LinkedList<Word> loadWords(){

        LinkedList<Word> wordLinkedList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            wordLinkedList.addLast(new Word("Word " + i));
        }
        return wordLinkedList;

    }
}
