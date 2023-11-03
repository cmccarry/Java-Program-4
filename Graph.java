import java.util.ArrayList;

public class Graph {
	
	 int vertexAssignment[][];
	 int numberofVertices;
	 
	 // default constructor
	 Graph() {
		 numberofVertices = 5;
		 vertexAssignment = new int[numberofVertices][numberofVertices];
	 }
	 
	 // constructor with int parameter
	 Graph(int numberofVertices) {
		 this.numberofVertices = numberofVertices;
		 vertexAssignment = new int[numberofVertices][numberofVertices];
	 }
	 
	 // edge values defaulted to 1
	 void addEdge(int i, int j) {
		 vertexAssignment[i][j] = 1;
	 }
	 
	 /** a method that returns neighbours of a vertex 
	  * to assign each vertex I initialized each vertex as an integer in ASCII form, starting at 65 = "A"
	  * adding 1 would mean when the integer gets converted to string it would be the next letter, so 66 = "B", 67 = "C", and so on
	  * then I converted it to string in the displayNeighbours method to get each character
	  */
	 Integer[] neighbour(int vertex) {
		 ArrayList<Integer> adjacent = new ArrayList<Integer>();
		 for(int i = 0;i < numberofVertices;i++) {
			 if(vertexAssignment[vertex][i] == 1) {
				 adjacent.add(65 + i);
			 }
		 }
		 
		 // converts the ArrayList to an Integer array
		 int size = adjacent.size();
		 Integer[] neighbours = new Integer[size];
		 for(int i = 0;i < size;i++) {
			 neighbours[i] = adjacent.get(i);
		 }
		 
		 return neighbours;
	 }// end neighbour method
	 
	 // a method that displays the neighbours
	 void displayNeighbours(Integer[] neighbours, int vertex){
		 int size = neighbours.length;
		 System.out.println("The neighbor(s) of the vertex " + Character.toString(65 + vertex) + " is/are:");
		 
		 // here the integer ASCII value gets converted to a char using the Character.toString
		 for(int i = 0; i < size; i++){
			 System.out.print(Character.toString(neighbours[i]) + " ");
		 }
		 System.out.println();
	 }// end displayNeighbours method

}
