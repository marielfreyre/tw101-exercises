package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    ;
    private String leftChild = null;
    private String rightChild = null;




    public void add(String nameOfNewNode) {

        if(nameOfNewNode.compareTo(this.name) ==-1){
            if(this.leftChild==null){this.leftChild = nameOfNewNode;
            return}
         else{leftChild.add(nameOfNewNode);}}
        if(nameOfNewNode.compareTo(this.name)==1){
            if(this.rightChild==null){this.rightChild=nameOfNewNode;
        }


    }

    public List<String> names() {
        return null;
    }
}
