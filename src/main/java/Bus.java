import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> busList;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.busList = new ArrayList<>();
    }

    public int getPassengers(){
        return this.busList.size();
    }



    public void addPassenger(Person person){
        if (this.capacity > this.busList.size()) {
            this.busList.add(person);
            System.out.println(this.busList.size());
        }
    }


    public void removePassenger(){
        this.busList.remove(0);
    }

    public void pickUpPassenger(BusStop busStop){
        this.busList.add(busStop.removePersonFromQueue());
    }
}
