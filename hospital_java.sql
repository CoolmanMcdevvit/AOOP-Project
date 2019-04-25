DROP DATABASE hospital_java; 
CREATE DATABASE hospital_java;
USE hospital_java;

DROP TABLE IF EXISTS Patient;
DROP TABLE IF EXISTS Facility;
DROP TABLE IF EXISTS Staff;

CREATE TABLE Facility
	(Fac_Name		ENUM("emergency", "inpatient", "outpatient"),
	 Fac_Bed	INT,
	 PRIMARY KEY(Fac_Name)
	);
    
CREATE TABLE Staff
	(St_SerialNum	INT auto_increment, #auto
	 St_Name		VARCHAR(20),
	 St_Surname		VARCHAR(40), 
     St_Role		ENUM("Doctor", "Nurse", "Clerk", "ICT officer"),
     #not specificed for Clerk and ICT
     St_Dept		ENUM("emergency", "inpatient", "outpatient", "not specificed"),
     St_Email		VARCHAR(100) GENERATED ALWAYS AS (CONCAT(St_Name,'_',St_Surname,'@hos.com')), #auto
	 PRIMARY KEY(St_SerialNum)
	);

CREATE TABLE Patient
	(Pati_ID		INT NOT NULL AUTO_INCREMENT, #auto
	 Pati_Name		VARCHAR(20),
	 Pati_Surname	VARCHAR(40),
	 Pati_Bdate		VARCHAR(10),	#dd.mm.yyyy
     Pati_Address	VARCHAR(400),
     Pati_Dept		ENUM("emergency", "inpatient", "outpatient"),
	 Pati_Phone		VARCHAR(12),
	 Pati_Tribe		ENUM("Asia", "US", "EU", "Africa", "Australia", "Others"),
	 PRIMARY KEY(Pati_ID)
     #FOREIGN KEY(Pati_Dept) REFERENCES Facility(Fac_Name) ON DELETE SET NULL
	);

INSERT INTO Patient (Pati_Name, Pati_Surname, Pati_Bdate, Pati_Address, Pati_Phone,Pati_Tribe, Pati_Dept)
VALUES( "Ken","simon","31.2.1232","ds32ds","+23232321","Asia",2),
( "KK","sim","31.3.1232","ddgd46ds","+65232321","Asia",2),
( "Sam","samson","43.4.4343","dsds4353","+31231234","US",1),
( "BB","sim","31.4.2332","dfsafadgd46ds","+265232321","US",3);

INSERT INTO Staff (St_Name, St_Surname, St_Role, St_Dept)
VALUES("Byan","Sean",2,1);

INSERT INTO Facility (Fac_Name, Fac_Bed)
VALUES(1,200),
(2,300),
(3,400);