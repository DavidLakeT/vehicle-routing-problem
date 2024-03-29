package me.DavidLake.DatosAlgoritmos2.Taller06;

import me.DavidLake.DatosAlgoritmos2.Taller05.Digraph;

import java.util.ArrayList;

public class DigraphAM extends Digraph {

    int[][] matrix;

    public DigraphAM(int size) {
        super(size);
        matrix = new int[size][size];
    }

    public void addArc(int source, int destination, int weight) {

        matrix[source][destination] = weight;
    }

    public ArrayList<Integer> getSuccessors(int vertex) {

        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < size; ++i)

            if (matrix[vertex][i] != 0)

                s.add(i);

        return s.size() == 0 ? null : s;
    }

    public int getWeight(int source, int destination) {

        return matrix[source][destination];
    }

}