package com.se.gsa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.gsa.Model.Patient;
import com.se.gsa.Repository.PatientRepo;

@Service
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public void savePatient(Patient patient) {
        patientRepo.save(patient);
    }

    public List<Patient> listPatients() {
        List<Patient> patients = patientRepo.findAllByOrderByFullNamesAsc();
        return patients;
    }
}
