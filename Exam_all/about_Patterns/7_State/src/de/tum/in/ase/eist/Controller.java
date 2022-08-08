package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	// TODO: implement attributes
	// TODO: implement methods

	private int currentFloor;
	private final List<Integer> pool;

	private ElevatorState state;


	public Controller(int currentFloor) {
		this.currentFloor=currentFloor;
		state=new idle();
		pool=new ArrayList<>();
	}

	public void request(int floor) {
		// TODO
		if (floor != currentFloor && !pool.contains(floor)) {
			pool.add(floor);
		}
		state.request(floor, this);
	}

	public void signal(int floor) {
		// TODO
		currentFloor = floor;
		state.signal(floor, this);
	}

	public ElevatorState getState() {
		// TODO
		return state;
	}

	public int getNextStop(){
		if (pool.isEmpty()) {
			return -1;
		}
		return pool.get(0);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public List<Integer> getPool() {
		return pool;
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}
}
