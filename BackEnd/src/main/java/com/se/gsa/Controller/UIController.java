package com.se.gsa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.se.gsa.Model.Patient;
import com.se.gsa.Service.PatientService;

@Controller
public class UIController {
    @Autowired
    PatientService patientService;

    @GetMapping("/")
    public String main(Model model) {
        return "main"; // view
    }

    @GetMapping("/patients")
    public String list(Model model) {
        List<Patient> patients = patientService.listPatients();
        model.addAttribute("patients", patients);
        return "patients"; // view
    }
}
