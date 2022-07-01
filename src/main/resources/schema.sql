--CREATE database icarenow;

--USE icarenow;

DROP TABLE IF EXISTS icn_role;
CREATE TABLE icn_role (
	id integer not null auto_increment,
	name varchar(20) not null,
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS icn_user;
CREATE TABLE icn_user (
	id integer not null auto_increment,
	email varchar(80) not null,
	pwd varchar(100) not null,
	account_status integer not null,
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS icn_user_role;
CREATE TABLE icn_user_roles (
	user_id integer not null,
	role_id integer not null,
	PRIMARY KEY (user_id, role_id),
	FOREIGN KEY (user_id) REFERENCES icn_user(id),
	FOREIGN KEY (role_id) REFERENCES icn_role(id)
);

DROP TABLE IF EXISTS icn_patient;
CREATE TABLE icn_patient (
	id integer NOT NULL auto_increment,
	user_id integer NOT NULL,
	cnp varchar(14) not null unique,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	insured bit not null,
	PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES icn_user(id)
);

DROP TABLE IF EXISTS icn_doctor;
CREATE TABLE icn_doctor (
	id integer NOT NULL auto_increment,
	user_id integer not null,
	first_name varchar(40) not null,
	last_name varchar(40) not null,
	PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES icn_user(id)
);

DROP TABLE IF EXISTS icn_specialty;
CREATE TABLE icn_specialty (
	id integer NOT NULL auto_increment,
	name varchar(40) not null,
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS icn_doctor_specialty;
CREATE TABLE icn_doctor_specialty (
	doctor_id integer not null,
	specialty_id integer not null,
	PRIMARY KEY (doctor_id, specialty_id),
	FOREIGN KEY (doctor_id) REFERENCES icn_doctor(id),
	FOREIGN KEY (specialty_id) REFERENCES icn_specialty(id)
);

DROP TABLE IF EXISTS icn_appointment;
CREATE TABLE icn_appointment (
	id integer NOT NULL auto_increment,
	patient_id integer,
	doctor_id integer,
	full_name varchar(40) not null,
	email varchar(30) not null,
	appoint_date date not null,
	start_time time not null,
	end_time time not null,
	tel_number varchar(10) not null,
	injury varchar(25) not null,
	PRIMARY KEY (id),
	FOREIGN KEY (patient_id) REFERENCES icn_patient(id),
	FOREIGN KEY (doctor_id) REFERENCES icn_doctor(id)
);