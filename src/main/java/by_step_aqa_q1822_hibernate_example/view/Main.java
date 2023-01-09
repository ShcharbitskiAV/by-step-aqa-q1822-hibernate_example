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

        showTableWithDoctors();

    }

    public static void showTableWithWards() {
        
        List<Wards> wards = wardsService.getAllWards();

        wards.forEach(ward -> System.out.println(ward.toString()));
    }

    public static void showTableWithDoctors() {

        List<Doctors> doctors = doctorsService.getAllDoctors();

        doctors.forEach(doctor -> System.out.println(doctor.toString()));
    }

}
