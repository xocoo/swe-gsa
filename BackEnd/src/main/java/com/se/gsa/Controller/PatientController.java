package com.se.gsa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.gsa.Model.Patient;
import com.se.gsa.Service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/")
    public ResponseEntity<List<Patient>> getPatients() {
        List<Patient> patients = patientService.listPatients();
        return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addPatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
        return new ResponseEntity<>("Patient saved", HttpStatus.CREATED);
    }
}
