package by_step_aqa_q1822_hibernate_example.dao;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "wards")

public class Wards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private int building;

    private int floor;

    private String name;

    @OneToMany(mappedBy = "wards", fetch = FetchType.EAGER)
    private Set<Doctors> doctors;

    public Wards() {
    }

    public Wards(int id, int building, int floor, String name) {
        this.id = id;
        this.building = building;
        this.floor = floor;
        this.name = name;
    }

    public Set<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctors> doctors) {
        this.doctors = doctors;
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
