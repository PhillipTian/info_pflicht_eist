package de.tum.in.ase.eist;

public class moving extends ElevatorState {
    public void request(int floor, Controller controller){}


    public void signal(int floor, Controller controller){
        if (floor == controller.getNextStop()) {
            controller.setState(new StopState());
        }
    }


    public String getName(){
        return "moving";
    }
}
