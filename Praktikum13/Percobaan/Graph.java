public class Graph{
    public int numVertices;
    public int[][] adjMatrix; 
    public int weight; // modifikasi untuk menambahkan weight

    public Graph (int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge (int i, int j, int weight) {
        if (i < numVertices && j < numVertices) { // menambahkan peraturan
            adjMatrix[i][j] = weight; // modifikasi untuk menambahkan weight
            adjMatrix[j][i] = weight; // modifikasi untuk menambahkan weight
        }
    }

    public void removeEdge (int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void print() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " : ");

               for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public int getEdge (int i, int j) {
        if (i < numVertices && j < numVertices) {
            return adjMatrix[i][j];
        }
        return 0; //jika i atau j di luar batas, dianggap tidak ada edge
    }

    public int getDegree(int vertex) {
        int degree = 0;
        if(vertex < numVertices) {
            for (int j = 0; j < numVertices; j++) {
                if(adjMatrix[vertex][j] != 0) {
                    degree++;
                }
            }
        }
        return degree;
    }

    public void printGetDegree() {
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Degree dari vertex " + i + ": " + getDegree(i));
        }
    }
}