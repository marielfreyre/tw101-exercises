package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private boolean isRoot;
    private String leftChild;
    private String rightChild;
    private String root;
    public Node(String name, boolean isRoot) {
        this.name = name; this.isRoot = isRoot;
        if(this.isRoot) {
            leftChild = null;
            rightChild = null;
            root = name;
        }
    }

    public void add(String nameOfNewNode) {
        Node toAdd = new Node(nameOfNewNode, false);


    }

    public List<String> names() {
        return null;
    }
}
