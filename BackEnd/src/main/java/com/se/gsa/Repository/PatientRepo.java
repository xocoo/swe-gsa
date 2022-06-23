package com.se.gsa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.se.gsa.Model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
    List<Patient> findAllByOrderByFullNamesAsc();
}
