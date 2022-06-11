DROP TABLE IF EXISTS patient;
create table patient (
       id integer,
       CNP varchar (255),
       nume varchar(255),
       insured BIT(1),
       primary key (id)
    );

--CREATE database iCareNow;
--
--USE iCareNow;
--
--DROP TABLE IF EXISTS icn_role
--CREATE TABLE icn_role(
--	icn_role_id	integer	not null identity primary key,
--	icn_role_name varchar(20),
--	)
--
--DROP TABLE IF EXISTS icn_user;
--CREATE TABLE icn_user(
--	icn_user_id integer not null identity primary key,
--	icn_user_name varchar(20),
--)
--
--DROP TABLE IF EXISTS icn_user_role
--CREATE TABLE icn_user_role(
--	icn_user_id integer not null,
--	icn_role_id integer not null,
--	FOREIGN KEY (icn_user_id) REFERENCES icn_user(icn_user_id),
--	FOREIGN KEY (icn_role_id) REFERENCES icn_role(icn_role_id),
--	)
--
--
--INSERT INTO icn_role VALUES ('administrator'),('doctor'),('patient')
--INSERT INTO icn_user VALUES ('Andrei Mladin'),('Radu Baciu'),('Adi Libenciuc'),('Florentina Mirisan'),('Alina Sastras')
--INSERT INTO icn_user_role VALUES (1,1),(1,2),(1,3),(1,3),(1,3)
