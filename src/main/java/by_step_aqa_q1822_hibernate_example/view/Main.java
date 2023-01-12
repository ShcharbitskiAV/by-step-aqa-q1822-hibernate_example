package by_step_aqa_q1822_hibernate_example.view;

import by_step_aqa_q1822_hibernate_example.dao.Doctors;
import by_step_aqa_q1822_hibernate_example.dao.Wards;
import by_step_aqa_q1822_hibernate_example.service.DoctorsService;
import by_step_aqa_q1822_hibernate_example.service.WardsService;

import java.util.List;

public class Main {

    static WardsService wardsService = new WardsService();

    static DoctorsService doctorsService = new DoctorsService();

    public static void main(String[] args) {

        showTableWithWards();

        Wards w = new Wards();
        w.setBuilding(2);
        w.setFloor(5);
        w.setName("Palata 66");

        wardsService.saveWards(w);

        Doctors d = new Doctors();

        d.setName("Petr");
        d.setPhone(323423423);
        d.setSalary(2500);
        d.setSurname("Aybolitovich");
        d.setPremium(300);
        d.setWards(w);

        doctorsService.saveDoctors(d);

        Doctors d1 = new Doctors();

        d1.setName("Ivan");
        d1.setPhone(323423423);
        d1.setSalary(2700);
        d1.setSurname("Medov");
        d1.setPremium(400);
        d1.setWards(w);

        doctorsService.saveDoctors(d1);

        showTableWithWards();


    }

    public static void showTableWithWards() {
        
        List<Wards> wards = wardsService.getAllWards();

        wards.forEach(ward -> {
                System.out.println(ward.toString());
        ward.getDoctors().forEach(doctors -> System.out.println(doctors.toString()));

        });
    }

    public static void showTableWithDoctors() {

        List<Doctors> doctors = doctorsService.getAllDoctors();

        doctors.forEach(doctor -> System.out.println(doctor.toString()));

    }

}
