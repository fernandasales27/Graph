package graph;

public class Graph {
	public int [][] matriz;
	public int numVertices;


	public Graph(int numVertices) {
		this.create(numVertices);
	}

	public void create(int numVertices)throws  IndexOutOfBoundsException {
		if (numVertices>0) {
		this.numVertices=numVertices;
		matriz = new int [numVertices][numVertices];
		}
		throw new IndexOutOfBoundsException("Invalid index!");
	}

	public void addEdge(int i, int j)throws  IndexOutOfBoundsException {
		if (numVertices>0 && i<=numVertices && j<=numVertices) {
			matriz[--i][--j]=1;
			System.out.println("Added!");
		}else {
			throw new IndexOutOfBoundsException("Invalid index!");
		}
	}

	public boolean isEdgeValid(int i, int j) {
		if (matriz[--i][--j]==1) {
			return true;
		} else return false;
	}

	public void listVertices() {
		int k;
		System.out.print("V = {");
		for(k=1; k<=numVertices; k++) {
			System.out.print( k + ", ");
		}
		System.out.println("}");
	}

	public void listAdjacentsVertices(int k) {
		k--;
		for (int i = 0; i < numVertices; i++) {
			if(i==k) {
				for (int j = 0; j < numVertices; j++) {
					if(matriz[i][j]==1) {
						System.out.print("(");
						System.out.print(i+1);
						System.out.print(",");
						System.out.print(j+1);
						System.out.print(")");
					}
				}
			}
		}
	}





	public void removeEdge(int i, int j) throws EmptyGraphException, IndexOutOfBoundsException{
		if (numVertices==0) {
			throw new EmptyGraphException();
		}
		if (matriz[--i][--j]==1) {
			matriz[i][j]=0;
		}
		else {
			throw new IndexOutOfBoundsException("Invalid index!");
		}
	}

	public void print() {
		System.out.print("E = {");
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				if(matriz[i][j]==1) {
					System.out.print("(");
					System.out.print(i+1);
					System.out.print(",");
					System.out.print(j+1);
					System.out.print(")");
				}
			}
		}
		System.out.println("}");
	}
	public int numOfVertices() {
		return numVertices;
	}


}