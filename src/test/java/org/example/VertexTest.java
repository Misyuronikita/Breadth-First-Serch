package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    @org.junit.jupiter.api.Test
    void testGetVertexDataMethod() {
        String expectedValue = "Виталик";
        Vertex<String> vertex = new Vertex<>(expectedValue);
        Assertions.assertEquals("Виталик", vertex.getData());
    }

    @org.junit.jupiter.api.Test
    void testSetVertexDataMethod() {
        String defaultValue = "Юлия";
        String expectedValue = "Виталий";
        Vertex<String> vertex = new Vertex<>(defaultValue);
        vertex.setData(expectedValue);
        assertEquals(expectedValue, vertex.getData());
    }

    @org.junit.jupiter.api.Test
    void isVisited() {
        boolean expectedValue = true;
        Vertex<String> vertex = new Vertex<>("Артем");
        vertex.setVisited(expectedValue);
        Assertions.assertEquals(expectedValue, vertex.isVisited());
    }

    @org.junit.jupiter.api.Test
    void setVisited() {
        boolean expectedValue = true;
        Vertex<Integer> vertex = new Vertex<>(15);
        vertex.setVisited(expectedValue);
        assertEquals(expectedValue, vertex.isVisited());
    }

    @org.junit.jupiter.api.Test
    void testSetNeighborsMethod() {
        Vertex<String> vertex1 = new Vertex<>("Александр");
        Vertex<String> vertex2 = new Vertex<>("Яна");
        Vertex<String> vertex3 = new Vertex<>("Евгений");

        List<Vertex<String>> vertexNeighbordList = new LinkedList<>();
        vertexNeighbordList.add(vertex2);
        vertexNeighbordList.add(vertex3);

        vertex1.setNeighbors(vertexNeighbordList);

        assertEquals(2, vertexNeighbordList.size());
        assertEquals(vertexNeighbordList, vertex1.getNeighbors());
    }
}