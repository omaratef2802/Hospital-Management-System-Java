
show databases;

Create DATABASE College;

USE College;

CREATE TABLE Patients(

    PatientID INT  PRIMARY KEY,
    Phone VARCHAR(11) NOT NULL,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Gender char(1) NOT NULL,
    Age INT NOT NULL,
    BloodGroup char(3) Not Null,
    Address VARCHAR(50) Not NULL,
    AnyMajor char(3) Not NULL,
    Symptoms varchar(50) NULL,
    Diagnosis varchar(50) NULL,
    Medicines varchar(50) NULL,
    Ward varchar(10) NULL
);

SELECT * FROM Patients;

INSERT INTO Patients (PatientID,Phone,FirstName,LastName,Gender,Age,BloodGroup,Address,AnyMajor)
values
(1,'05021302103','Ahmed','Ali','M','26' , 'A+','Cairo'    ,'Yes'),
(2,'06021330491','Ali','Nabil','M','25' , 'A-','Alexandia', 'No'),
(3,'07213943295','Fatma','Hany','F','23', 'B+','Torino'   ,'Yes'),
(4,'08134590912','Rania','Saad','F','50', 'B-','Madrid'   ,'Yes'),
(5,'09213432213','Reham','Omar','F','53', 'AB+','Barcalona', 'No');

SELECT * FROM Patients;

CREATE Table Doctors(
	
    DoctorID INT  PRIMARY KEY,
    Specialest VARCHAR(50) NOT NULL,
    Phone VARCHAR(11) NOT NULL,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Gender char(1) NOT NULL,
    Age INT NOT NULL,
    Address VARCHAR(50) Not NULL
);

INSERT INTO Doctors
values
(1,"Cardiology",'05021302103','Ahmed','Ali','M','26' ,'Cairo'),
(2,"Dermatology",'06021330491','Ali','Nabil','M','25' ,'Alexandia'),
(3,"Dentistry",'07213943295','Fatma','Hany','F','23','Torino'),
(4,"Oncology",'08134590912','Rania','Saad','F','50','Madrid'),
(5,"Psychiatry",'09213432213','Reham','Omar','F','53','Barcalona');

select * FROM Doctors;

CREATE TABLE Appointments(

	ID int Primary Key , 
    Type varchar(50) not null , 
    Date DATE not null ,
    Numberroom int not null,
    PatientID INT not null REFERENCES Patients(PatientID), 
    DoctorID INT not null REFERENCES Doctors(DoctorID)
);

insert into Appointments values 
(1,"vision correction",'2026-01-13',301,1,3),
(2, 'Checkup', '2025-01-12', 76, 2 , 4),
(3, 'Surgery', '2026-02-9', 101, 1, 1);

Select * FROM Appointments;