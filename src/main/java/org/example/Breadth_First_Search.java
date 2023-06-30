package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search<T> {
    private final Vertex<T> startVertex;

    public Breadth_First_Search(Vertex<T> startVertex) {
        this.startVertex = startVertex;
    }

    public void traverse() {
        Queue<Vertex<T>> vertexQueue = new LinkedList<>();
        vertexQueue.add(startVertex);
        while (!vertexQueue.isEmpty()) {
            Vertex<T> current = vertexQueue.poll();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                vertexQueue.addAll(current.getNeighbors());
            }
        }
    }
}
