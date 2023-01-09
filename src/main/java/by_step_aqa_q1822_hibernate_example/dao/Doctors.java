package by_step_aqa_q1822_hibernate_example.dao;

import javax.persistence.*;

@Entity
@Table(name = "doctors")

public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private int phone;

    private int salary;

    private int premium;

    private String name;

    private String surname;

    public Doctors () {}

    public Doctors(int id, int phone, int salary, int premium, String name, String surname) {
        this.id = id;
        this.phone = phone;
        this.salary = salary;
        this.premium = premium;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", phone=" + phone +
                ", salary=" + salary +
                ", premium=" + premium +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
