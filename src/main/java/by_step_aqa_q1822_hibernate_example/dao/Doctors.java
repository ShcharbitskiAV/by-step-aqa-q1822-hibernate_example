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

    @Column (insertable = false, updatable = false)
    private int wards_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "wards_id", nullable = false)
    private Wards wards;

    public Doctors() {
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

    public int getWards_id() {
        return wards_id;
    }

    public void setWards_id(int wards_id) {
        this.wards_id = wards_id;
    }

    public Wards getWards() {
        return wards;
    }

    public void setWards(Wards wards) {
        this.wards = wards;
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
                ", wards_id=" + wards_id +
                ", wards=" + wards +
                '}';
    }
}
