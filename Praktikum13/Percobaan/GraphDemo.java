public class GraphDemo {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1, 3);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 2, 5);
        g.addEdge(2, 0, 2);
        g.addEdge(2, 3, 4);
        g.addEdge(6, 7, 1);

        g.print();

        // menampilkan edge
        System.out.println("Edge antara V0 dan V1 : " + g.getEdge(0,1)); // terdapat edge 
        System.out.println("Edge antara V0 dan V3 : " + g.getEdge(0, 3)); // tidak terdapat edge

        //menampilkan degree
        g.printGetDegree();
    }
}
