DROP DATABASE hospital_java; 
CREATE DATABASE hospital_java;
USE hospital_java;

DROP TABLE IF EXISTS Patient;
DROP TABLE IF EXISTS Facility;
DROP TABLE IF EXISTS Staff;

CREATE TABLE Facility
	(Fac_Name		ENUM("emergency", "inpatient", "outpatient"),
	 Fac_Bed		INT,
	 PRIMARY KEY(Fac_Name)
	);
    
CREATE TABLE Staff
	(St_SerialNum	INT auto_increment, #auto
	 St_Name		VARCHAR(20),
	 St_Surname		VARCHAR(40), 
     St_Role		VARCHAR(20),#ENUM("Doctor", "Nurse", "Clerk", "ICT officer"),
     #not specificed for Clerk and ICT
     St_Dept		VARCHAR(20),
     St_Phone		VARCHAR(12),
     St_Email		VARCHAR(100), #GENERATED ALWAYS AS (CONCAT(St_Name,'_',St_Surname,'@hos.com')), #auto
	 PRIMARY KEY(St_SerialNum)
	);

CREATE TABLE Patient
	(Pati_ID		INT NOT NULL AUTO_INCREMENT, #auto
	 Pati_Name		VARCHAR(20),
	 Pati_Surname	VARCHAR(40),
	 Pati_Bdate		VARCHAR(10),	#dd.mm.yyyy
     Pati_Address	VARCHAR(400),
     Pati_Dept		VARCHAR(20),
	 Pati_Phone		INT,
	 Pati_Tribe		VARCHAR(20),
     Pati_Alive		BOOLEAN,
     Pati_Bed_num	INT,
	 PRIMARY KEY(Pati_ID)
     #FOREIGN KEY(Pati_Dept) REFERENCES Facility(Fac_Name) ON DELETE SET NULL
	);

INSERT INTO Patient (Pati_ID, Pati_Name, Pati_Surname, Pati_Bdate, Pati_Address, Pati_Phone,Pati_Tribe, Pati_Dept, Pati_Bed_num)
VALUES("10001", "Ken","simon","03.12.1232","ds32ds","23232321","Asia",2, 213),
("10002", "KK","sim","13.03.1232","ddgd46ds","65232321","Asia",2, 214),
("10003", "Sam","samson","13.04.4343","dsds4353","31231234","US",1, 122),
("10004","BB","sim","11.04.2332","dfsafadgd46ds","65232321","US",3, 3);

INSERT INTO Staff (St_Name, St_Surname, St_Role)
VALUES("Byan","Sean","wtf");

INSERT INTO Facility (Fac_Name, Fac_Bed)
VALUES(1,200),
(2,300),
(3,400);
