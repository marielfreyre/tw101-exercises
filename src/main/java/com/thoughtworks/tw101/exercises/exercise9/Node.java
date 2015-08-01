package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;

    private Node leftChild = null;
    private Node rightChild = null;


    public Node(String nameOfNewNode){this.name = nameOfNewNode;}

    public void add(String nameOfNewNode) {

        if (nameOfNewNode.compareTo(this.name) <= 0) {
            if (this.leftChild == null) {
                this.leftChild = new Node(nameOfNewNode);
                return;
            } else {
                leftChild.add(nameOfNewNode);
            }
        } else {
            if (this.rightChild == null) {
                this.rightChild = new Node(nameOfNewNode);
            } else {
                rightChild.add(nameOfNewNode);
            }


        }
    }
    public List<String> names() {
            List<String> alphabeticalList = new ArrayList<>();

        if(name !=null) {
            if(leftChild != null){alphabeticalList.addAll(leftChild.names());}
            alphabeticalList.add(name);
            if(rightChild != null){alphabeticalList.addAll(rightChild.names());}
        }


        return alphabeticalList;
    }
}
