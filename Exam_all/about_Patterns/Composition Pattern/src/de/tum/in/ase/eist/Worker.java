package de.tum.in.ase.eist;



public class Worker extends Employee {
	public Worker(String name){
		super(name);

    }

	@Override
	public void listHierarchy(int level) {
		printName(level);
	}

}
