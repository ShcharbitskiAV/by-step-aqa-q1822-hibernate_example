package by_step_aqa_q1822_hibernate_example.dao;

import javax.persistence.*;

@Entity
@Table(name = "wards")

public class Wards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private int building;

    private int floor;

    private String name;

    public Wards() { }

    public Wards(int id, int building, int floor, String name) {
        this.id = id;
        this.building = building;
        this.floor = floor;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wards{" +
                "id: " + id +
                ", building: " + building +
                ", floor: " + floor +
                ", name: '" + name + '\'' +
                '}';
    }
}
