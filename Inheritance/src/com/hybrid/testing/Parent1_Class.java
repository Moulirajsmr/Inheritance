package com.hybrid.testing;

public class Parent1_Class {
	
	//parent1 extends parent2 - simple inheritance
	//parent2 extends child1, Parent2 extends child2 - Hierarchical Inheritance
	public void dhoni() {
		System.out.println("thala dhoni");	
	}
	
	public void Raina() {
		System.out.println("chinna thala");
	}
	
	public static void main(String[] args) {
		Parent1_Class m = new Parent1_Class();
		m.dhoni();
		m.Raina();
	}

}
