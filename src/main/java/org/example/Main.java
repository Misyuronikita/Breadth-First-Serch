package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        Breadth_First_Search<Integer> breadthFirstSearch = new Breadth_First_Search<>(v0);
        v0.setNeighbors(new LinkedList<>(Arrays.asList(v1, v5, v6)));
        v1.setNeighbors(new LinkedList<>(Arrays.asList(v3, v4, v5)));
        v4.setNeighbors(new LinkedList<>(Arrays.asList(v2, v6)));
        v6.setNeighbors(new LinkedList<>(List.of(v1)));
        breadthFirstSearch.traverse();
    }
}