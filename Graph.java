package graph;

public class Graph {
	public int [][] matriz;
	public int numVertices;


	public Graph(int numVertices) throws GraphException {
		this.create(numVertices);
	}

	public void create(int numVertices)throws  GraphException {
		if (numVertices>0) {
			this.numVertices=numVertices;
			matriz = new int [numVertices][numVertices];
		}else {
			throw new GraphException();
		}
	}
	public void addEdge(int i, int j)throws  GraphException  {
		if (numVertices>0 && i<=numVertices && j<=numVertices) {
			matriz[--i][--j]=1;
			System.out.println("Added!");
		}else {
			throw new GraphException ();
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





	public void removeEdge(int i, int j) throws  GraphException{
		if(i<0 || i>numVertices || j<0 ||  j>numVertices) {
			throw new GraphException();
		}
		if (matriz[--i][--j]==1) {
			matriz[i][j]=0;
			System.out.println("removed!");
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