package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    List<Pet> salon = new ArrayList<>(capacity);

    public void add(Pet pet) {
        if (salon.size() < capacity) {
            salon.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet item : salon) {
            if (item.getName().equals(name)) {
                salon.remove(item);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet item : salon) {
            if (item.getName().equals(name) && item.getOwner().equals(owner)) {
                return item;
            }
        }
        return null;
    }

    public int getCount() {
        return salon.size();
    }

    public String getStatistics() {
        String statistics = String.format("The grooming salon has the following clients:%n");
        for (Pet item : salon) {
            statistics += String.format("%s %s%n", item.getName(), item.getOwner());
        }
        return statistics;
    }
}



