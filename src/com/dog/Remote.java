package com.dog;

public class Remote {
    private DogDoor door;
    public Remote(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing  the remote control button....");
        if(door.isOpen()){
            door.close();
            System.out.println("Door closed..");

        }else{
            door.open();
            System.out.println("Door opened..");
            door.close();

        }
    }
}
