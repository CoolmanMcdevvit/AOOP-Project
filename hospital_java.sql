DROP DATABASE hospital_java; 
CREATE DATABASE hospital_java;
USE hospital_java;

DROP TABLE IF EXISTS Patient;
DROP TABLE IF EXISTS Facility;
DROP TABLE IF EXISTS Staff;

CREATE TABLE Facility
	(Fac_Name		ENUM("emergency", "inpatient", "outpatient"),
	 Fac_Bed_Avail	SMALLINT,
	 PRIMARY KEY(Fac_Name)
	);
    
CREATE TABLE Staff
	(St_SerialNum	INT auto_increment, #auto
	 St_Name		VARCHAR(20),
	 St_Surname		VARCHAR(40), 
     St_Role		ENUM("Doctor", "Nurse", "Clerk", "ICT officer"),
     St_Dept		ENUM("emergency", "inpatient", "outpatient"),
     St_Email		VARCHAR(100) GENERATED ALWAYS AS (CONCAT(St_Name,'_',St_Surname,'@hos.com')), #auto
	 PRIMARY KEY(St_SerialNum)
	);

CREATE TABLE Patient
	(Pati_ID		INT NOT NULL AUTO_INCREMENT, #auto
	 Pati_Name		VARCHAR(20),
	 Pati_Surname	VARCHAR(40),
	 Pati_Bdate		VARCHAR(10),	#dd.mm.yyyy
     Pati_Address	VARCHAR(400),
	 Pati_Phone		VARCHAR(8),
	 Pati_Tribe		ENUM("Asia", "US", "EU", "Africa", "Australia", "Others"),
	 PRIMARY KEY(Pati_ID)
     #FOREIGN KEY(Pati_RoomID) REFERENCES Room(Room_ID) ON DELETE SET NULL
	);

INSERT INTO Patient (Pati_Name, Pati_Surname, Pati_Bdate, Pati_Address, Pati_Phone,Pati_Tribe)
VALUES( "ds","dsd","ds","dsds","dsd","Asia"),
( "bb","dsd","ds","dsds","dsd","Asia");

INSERT INTO Staff (St_Name, St_Surname, St_Role, St_Dept)
VALUES("ww","bb",2,1);
    