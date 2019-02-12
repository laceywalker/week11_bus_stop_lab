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
        this.busList.add(person);
    }
}
