CREATE database iCareNow;

USE iCareNow;

DROP TABLE IF EXISTS icn_role
CREATE TABLE icn_role(
	id	integer	not null identity primary key,
	role_name varchar(20) not null,
	)

DROP TABLE IF EXISTS icn_user;
CREATE TABLE icn_user(
	id integer not null identity primary key,
	email varchar(80) not null,
	pwd varchar(100) not null,
	account_status integer not null,
)

DROP TABLE IF EXISTS icn_user_role
CREATE TABLE icn_user_role(
	user_id integer not null,
	role_id integer not null,
	FOREIGN KEY (user_id) REFERENCES icn_user(id),
	FOREIGN KEY (role_id) REFERENCES icn_role(id),
	)

DROP TABLE IF EXISTS icn_patient
CREATE TABLE icn_patient(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	id_user integer NOT NULL,
	cnp varchar(14) not null,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	insured bit not null,
	FOREIGN KEY (id_user) REFERENCES icn_user(id),
	)

DROP TABLE IF EXISTS icn_doctor
CREATE TABLE icn_doctor(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	id_user integer not null,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	FOREIGN KEY (id_user) REFERENCES icn_user(id),
	)

DROP TABLE IF EXISTS icn_specialization
CREATE TABLE icn_specialization(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	specialization_name varchar(40) not null,
	)

DROP TABLE IF EXISTS icn_doctor_specialization
--make primary key combo
CREATE TABLE icn_doctor_specialization(
	doctor_id integer not null,
	specialization_id integer not null,
	FOREIGN KEY (specialization_id) REFERENCES icn_specialization(id),
	FOREIGN KEY (doctor_id) REFERENCES icn_doctor(id),
	PRIMARY KEY (doctor_id,specialization_id),
	)


DROP TABLE IF EXISTS icn_appointment
CREATE TABLE icn_appointment(
	id integer NOT NULL IDENTITY PRIMARY KEY,
	patient_id integer not null,
	doctor_id integer not null,
	details varchar(200) not null,
	FOREIGN KEY (patient_id) REFERENCES icn_patient(id),
	FOREIGN KEY (doctor_id) REFERENCES icn_doctor(id),
	)




INSERT INTO icn_role VALUES ('Administrator'),('Doctor'),('Patient')
INSERT INTO icn_user VALUES ('andrei.mladin@gmail.com','$2a$10$QmIJm7WVXWml5Ztsq50w1uQsB6yNsmtelxT5DG.NYhNRY27Bm.LEC',1),('radumbaciu@gmail.com','$2a$10$QmIJm7WVXWml5Ztsq50w1uQsB6yNsmtelxT5DG.NYhNRY27Bm.LEC',1),('libenciuc.adrian@yahoo.com','$2a$10$QmIJm7WVXWml5Ztsq50w1uQsB6yNsmtelxT5DG.NYhNRY27Bm.LEC',1),('florentina.mirisan@yahoo.ro','$2a$10$QmIJm7WVXWml5Ztsq50w1uQsB6yNsmtelxT5DG.NYhNRY27Bm.LEC',1),('sastrasalina@gmail.com','$2a$10$QmIJm7WVXWml5Ztsq50w1uQsB6yNsmtelxT5DG.NYhNRY27Bm.LEC',1)
INSERT INTO icn_user_role VALUES (1,1),(2,2),(3,3),(4,3),(5,3)
INSERT INTO icn_patient VALUES (3,'1234567890123','Libenciuc','Adrian',1),(4,'2345678901123','Florentina','Mirisan',1),(5,'3456789012123','Alina','Sastras',0)
INSERT INTO icn_doctor VALUES (2,'Radu','Baciu')
INSERT INTO icn_specialization VALUES ('Allergy and immunology'),(' Anesthesiology'),(' Dermatology'),(' Diagnostic radiology'),(' Emergency medicine'),(' Family medicine'),(' Internal medicine'),(' Medical genetics')
INSERT INTO icn_doctor_specialization VALUES(1,1),(1,2),(1,3),(1,4)
INSERT INTO icn_appointment VALUES(1,1,'detalii apointment1'),(2,1,'detalii apointment2')
