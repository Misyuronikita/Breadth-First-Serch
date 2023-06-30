package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex<String> v0 = new Vertex<>("Я");
        Vertex<String> v1 = new Vertex<>("Эрик");
        Vertex<String> v2 = new Vertex<>("Леха");
        Vertex<String> v3 = new Vertex<>("Илья");
        Vertex<String> v4 = new Vertex<>("Макс");
        Vertex<String> v5 = new Vertex<>("Кирилл");
        Vertex<String> v6 = new Vertex<>("Андрей");
        Vertex<String> v7 = new Vertex<>("Дима");


        Breadth_First_Search<String> breadthFirstSearch = new Breadth_First_Search<>(v0);
        v0.setNeighbors(new LinkedList<>(Arrays.asList(v1, v2, v3)));
        v1.setNeighbors(new LinkedList<>(Arrays.asList(v4, v7)));
        v2.setNeighbors(new LinkedList<>(List.of(v4)));
        v3.setNeighbors(new LinkedList<>(Arrays.asList(v5, v6)));
        breadthFirstSearch.traverse();
    }
}