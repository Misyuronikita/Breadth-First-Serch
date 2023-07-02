package org.example;

import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VertexTest {
    Vertex<String> vertex;
    Vertex<String> expectedVertexNeighborName1;
    String firstNameNeighbor;
    Vertex<String> expectedVertexNeighborName2;
    String secondNameNeighbor;
    String expectedData;
    String anotherExpectedData;
    boolean expectedVertexIsVisited;
    @org.junit.jupiter.api.BeforeEach
    void prepareData(){
        expectedData = "Виталий";
        anotherExpectedData = "Константин";

        firstNameNeighbor = "Яна";
        secondNameNeighbor = "Евгений";


        vertex = new Vertex<>(expectedData);

        expectedVertexNeighborName1 = new Vertex<>(firstNameNeighbor);
        expectedVertexNeighborName2 = new Vertex<>(secondNameNeighbor);
    }

    @org.junit.jupiter.api.Test
    void testGetVertexDataMethod() {
        Assertions.assertEquals(expectedData, vertex.getData());
    }

    @org.junit.jupiter.api.Test
    void testSetVertexDataMethod() {
        vertex.setData(anotherExpectedData);
        assertEquals(anotherExpectedData, vertex.getData());
    }

    @org.junit.jupiter.api.Test
    void testSetVisitedMethod() {
        vertex = new Vertex<>(expectedData);
        vertex.setVisited(expectedVertexIsVisited);
        assertEquals(expectedVertexIsVisited, vertex.isVisited());
    }

    @org.junit.jupiter.api.Test
    void testSetNeighborsMethod() {
        List<Vertex<String>> vertexNeighbordList = new LinkedList<>();
        vertexNeighbordList.add(expectedVertexNeighborName1);
        vertexNeighbordList.add(expectedVertexNeighborName2);

        vertex.setNeighbors(vertexNeighbordList);

        assertEquals(2, vertexNeighbordList.size());
        assertEquals(vertexNeighbordList, vertex.getNeighbors());
    }
}