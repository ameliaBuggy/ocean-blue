import java.util.ArrayList;

public class Enclosure {
    private String type;
    private double temperature;
    private ArrayList<Animal> animals;


    public Enclosure(String type, double temperature) {
        this.type = type;
        this.temperature = temperature;
        animals = new ArrayList<Animal>();
    }

    public String getType() {
        return type;
    }

    public double getTemperature() {
        return temperature;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}