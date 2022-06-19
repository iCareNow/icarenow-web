DROP TABLE IF EXISTS patient;
create table patient (
       id integer,
       cnp varchar (255),
       nume varchar(255),
       insured BIT(1),
       primary key (id)
    );