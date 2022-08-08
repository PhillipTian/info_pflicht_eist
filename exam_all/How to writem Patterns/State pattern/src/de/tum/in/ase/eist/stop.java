package de.tum.in.ase.eist;

public class stop extends ElevatorState {
    public void request(int floor, Controller controller){}


    public void signal(int floor, Controller controller){
        System.out.println("Elevator stopped in floor " + controller.getCurrentFloor());
        // remove the next stop because we now reached it
        controller.getPool().remove(0);
        if (controller.getPool().isEmpty()) {
            controller.setState(new idle());
        } else {
            controller.setState(new moving());
        }
    }


    public String getName(){
        return "stop";
    }
}
