package de.tum.in.ase.eist;

public class idle extends ElevatorState{

    public void request(int floor, Controller controller){
        if (floor != controller.getCurrentFloor()) {
            controller.setState(new moving());
        }
    }


    public void signal(int floor, Controller controller){
        //nothing to do (this should not happen)
    }


    public String getName(){
        return "idle";
    }
}
