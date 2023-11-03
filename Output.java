public class Output {

	public static void main(String[] args) {
		 Graph graph = new Graph(9);
		 /** The vertices are assigned by number 0-8 respectively, so
		  * A = 0
		  * B = 1
		  * C = 2
		  * D = 3
		  * E = 4
		  * F = 5
		  * G = 6
		  * H = 7
		  * I = 8
		  */
		 
		 // Edges added for the Vertex A (B, D, E)
		 graph.addEdge(0,1);
		 graph.addEdge(0,3);
		 graph.addEdge(0,4);
		 
		 // Edges added for the Vertex B (E)
		 graph.addEdge(1,4);
		 
		 // Edges added for the Vertex C (B)
		 graph.addEdge(2,1);
		 
		 // Edges added for the Vertex D (G)
		 graph.addEdge(3,6);
		 
		 // Edges added for the Vertex E (F, H)
		 graph.addEdge(4,5);
		 graph.addEdge(4,7);
		 
		 // Edges added for the Vertex F (C, H)
		 graph.addEdge(5,2);
		 graph.addEdge(5,7);
		 
		 // Edges added for the Vertex G (H)
		 graph.addEdge(6,7);
		 
		 // Edges added for the Vertex H (I)
		 graph.addEdge(7,8);
		 
		 // Edges added for the Vertex I (F)
		 graph.addEdge(8,5);
		 
		 // prints out neighbors of the vertex E
		 graph.displayNeighbours(graph.neighbour(4),4);
		 System.out.println("\n" + "Additionally:");
		 
		 // prints out neighbors of all the vertices
		 for(int i = 0;i < 9;i++){
			 graph.displayNeighbours(graph.neighbour(i),i);
		 }
	}
}
