package greatLearning;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {
	int v;
	ArrayList<Integer> adjacency[];
	public GraphSearch(int noOfVertex) {
		 v=noOfVertex;
		 adjacency = new ArrayList[noOfVertex];
		 for(int i=0;i<noOfVertex;i++) {
			 adjacency[i]=new ArrayList<>();
		 }
	}
    void edge(int x, int y) {
    	adjacency[x].add(y);
    }
    void breadthFirstSearch(int sourceVertex) {
    	boolean[] visited = new boolean[v];
    	ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
    	visited[sourceVertex]=true;
    	arrayList1.add(sourceVertex);
    	while(!arrayList1.isEmpty()) {
    		sourceVertex=arrayList1.remove(0);
    		System.out.print(sourceVertex+ " ");
    		Iterator i = adjacency[sourceVertex].iterator();
    		while(i.hasNext()) {
    			int n= (int) i.next();
    			if(!visited[n]) {
    				visited[n]=true;
    				arrayList1.add(n);
    			}
    		}
    	}
    }
    public static void main(String[] args) {
		GraphSearch graphSearch = new GraphSearch(6);
		graphSearch.edge(0, 1);
		graphSearch.edge(0, 2);
		graphSearch.edge(0, 5);
		graphSearch.edge(1, 0);
		graphSearch.edge(1, 2);
		graphSearch.edge(2, 0);
		graphSearch.edge(2, 1);
		graphSearch.edge(2, 3);
		graphSearch.edge(2, 4);
		graphSearch.edge(3, 2);
		graphSearch.edge(4, 2);
		graphSearch.edge(4, 5);
		graphSearch.edge(5, 4);
		graphSearch.breadthFirstSearch(0);
		
	}
}
