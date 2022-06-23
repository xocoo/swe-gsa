package com.se.gsa.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @NonNull
    private String patientNumber;

    @NonNull
    private Boolean isAnOutPatient;

    @NonNull
    private String fullNames;

    private String emailAddress;

    private String contactPhoneNumber;

    private LocalDate dateOfBirth;
}
