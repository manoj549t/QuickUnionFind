package com.manoj.QuickUnionFind;

public class UnionFind {
	
	private int[] graphPath;

	public UnionFind(int graphSize) {
		this.graphPath = new int[graphSize];
		for (int i=0; i<graphSize; i++) {
			this.graphPath[i] = i;
		}
	}
	
	private int root(int element) throws ArrayIndexOutOfBoundsException {
		try {
			while(graphPath[element] != element) {
				element = graphPath[element];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
			}
			
		return this.graphPath[element];
	}
	
	public void union(int firstElement, int secondElement) throws ArrayIndexOutOfBoundsException{
		try {
			int firstElementRoot = root(firstElement);
			int secondElementRoot = root(secondElement);
			
			this.graphPath[firstElementRoot] = secondElementRoot;
					
		} catch(ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}
	
	public boolean find(int firstElement, int secondElement) throws ArrayIndexOutOfBoundsException{
		try {
			return root(firstElement) == root(secondElement);
		} catch(ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}
}
