package org.example;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {
    private T data;
    private boolean visited;
    private List<Vertex<T>> neighbors = new LinkedList<>();

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    private List<T> getNeighbor(List<Vertex<T>> neighbors){
        List<T> neighborsValues = new LinkedList<>();
        for (Vertex<T> item : neighbors){
            neighborsValues.add(item.getData());
        }
        return neighborsValues;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                ", neighbors=" + getNeighbor(neighbors) +
                '}';
    }
}
