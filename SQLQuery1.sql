CREATE database iCareNow;

USE iCareNow;

DROP TABLE IF EXISTS icn_role
CREATE TABLE icn_role(
	id	integer	not null identity primary key,
	icn_role_name varchar(20),
	)

DROP TABLE IF EXISTS icn_user;
CREATE TABLE icn_user(
	id integer not null identity primary key,
	email varchar(80),
	icn_password varchar(20),
)

DROP TABLE IF EXISTS icn_user_role
CREATE TABLE icn_user_role(
	id_user integer not null,
	id_role integer not null,
	FOREIGN KEY (id_user) REFERENCES icn_user(id),
	FOREIGN KEY (id_role) REFERENCES icn_role(id),
	)

DROP TABLE IF EXISTS patient
CREATE TABLE patient(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	id_user integer,
	cnp varchar(14),
	first_name varchar(40),
	last_name varchar(40),
	insured bit,
	FOREIGN KEY (id_user) REFERENCES icn_user(id),
	)

DROP TABLE IF EXISTS doctor
CREATE TABLE doctor(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	id_user integer,
	first_name varchar(40),
	last_name varchar(40),
	FOREIGN KEY (id_user) REFERENCES icn_user(id),
	)

DROP TABLE IF EXISTS specialization
CREATE TABLE specialization(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	s_name varchar(40),
	)

DROP TABLE IF EXISTS doctor_specialization
CREATE TABLE doctor_specialization(
	d_id integer,
	s_id integer,
	FOREIGN KEY (s_id) REFERENCES specialization(id),
	FOREIGN KEY (d_id) REFERENCES doctor(id),
	)

--DROP TABLE IF EXISTS icn_location
--CREATE TABLE icn_location(
--	id integer NOT NULL IDENTITY PRIMARY KEY,
--	details varchar(200),
--	)

DROP TABLE IF EXISTS appointment
CREATE TABLE appointment(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	Pid integer,
	Did integer,
--	Lid integer,
	Details varchar(200),
	FOREIGN KEY (Pid) REFERENCES patient(id),
	FOREIGN KEY (Did) REFERENCES doctor(id),
--	FOREIGN KEY (Lid) REFERENCES icn_location(id),
	)




INSERT INTO icn_role VALUES ('administrator'),('doctor'),('patient')
INSERT INTO icn_user VALUES ('andrei.mladin@gmail.com','pascal'),('radumbaciu@gmail.com','pascal'),('libenciuc.adrian@yahoo.com','pascal'),('florentina.mirisan@yahoo.ro','pascal'),('sastrasalina@gmail.com','pascal')
INSERT INTO icn_user_role VALUES (1,1),(2,2),(3,3),(4,3),(5,3)
--INSERT INTO icn_location VALUES ('locatia1'),('locatia2'),('locatia3')
INSERT INTO patient VALUES (3,'1234567890123','Libenciuc','Adrian',1),(4,'2345678901123','Florentina','Mirisan',1),(5,'3456789012123','Alina','Sastras',0)
INSERT INTO doctor VALUES (2,'Radu','Baciu')
INSERT INTO specialization VALUES ('Allergy and immunology'),(' Anesthesiology'),(' Dermatology'),(' Diagnostic radiology'),(' Emergency medicine'),(' Family medicine'),(' Internal medicine'),(' Medical genetics')
INSERT INTO doctor_specialization VALUES(1,1),(1,2),(1,3),(1,4)
--INSERT INTO appointment VALUES(1,1,1,'detalii apointment1'),(2,1,2,'detalii apointment2')
INSERT INTO appointment VALUES(1,1,'detalii apointment1'),(2,1,'detalii apointment2')

