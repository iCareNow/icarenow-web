INSERT INTO icn_role(name) VALUES ('ADMIN');
INSERT INTO icn_role(name)  VALUES ('DOCTOR');
INSERT INTO icn_role(name)  VALUES ('PATIENT');
INSERT INTO icn_user(email, pwd, account_status) VALUES ('andrei.mladin@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user(email, pwd, account_status) VALUES ('radumbaciu@gmail.com', '$2a$10$EyMtttMDFcSNFwNTrQv.fOOwQ1rs8j0IgAef2aEtKcr.73i1YFtBm', 1);
INSERT INTO icn_user(email, pwd, account_status) VALUES ('libenciuc.adrian@yahoo.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user(email, pwd, account_status) VALUES ('florentina.mirisan@yahoo.ro', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user(email, pwd, account_status) VALUES ('sastrasalina@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user(email, pwd, account_status) VALUES ('gica.contra@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user_roles VALUES (1, 1), (2, 2), (3, 3), (4, 3), (5, 3),(6, 2);
INSERT INTO icn_patient(user_id, cnp, first_name, last_name, insured) VALUES (3, '1234567890123', 'Libenciuc', 'Adrian',1);
INSERT INTO icn_patient(user_id, cnp, first_name, last_name, insured) VALUES (4, '2345678901123', 'Florentina', 'Mirisan',1);
INSERT INTO icn_patient(user_id, cnp, first_name, last_name, insured) VALUES (5, '3456789012123', 'Alina', 'Sastras', 0);
INSERT INTO icn_doctor(user_id, first_name, last_name) VALUES (2,'Radu', 'Baciu');
INSERT INTO icn_doctor(user_id, first_name, last_name) VALUES (6,'Gica', 'Contra');
--INSERT INTO icn_specialty(name) VALUES ('Allergy and immunology');
--INSERT INTO icn_specialty(name) VALUES ('Anesthesiology');
--INSERT INTO icn_specialty(name) VALUES ('Dermatology');
--INSERT INTO icn_specialty(name) VALUES ('Diagnostic radiology');
--INSERT INTO icn_specialty(name) VALUES ('Emergency medicine');
--INSERT INTO icn_specialty(name) VALUES ('Family medicine');
--INSERT INTO icn_specialty(name) VALUES ('Internal medicine');
--INSERT INTO icn_specialty(name) VALUES ('Medical genetics');
INSERT INTO icn_specialty(name) VALUES ('Cardiology');
INSERT INTO icn_specialty(name) VALUES ('Dentistry');
INSERT INTO icn_specialty(name) VALUES ('Laboratory');
INSERT INTO icn_specialty(name) VALUES ('Pulmonology');
INSERT INTO icn_specialty(name) VALUES ('Gynecology');
INSERT INTO icn_specialty(name) VALUES ('Gastrology');
INSERT INTO icn_specialty(name) VALUES ('Neurology');
INSERT INTO icn_specialty(name) VALUES ('Physical rehabilitation');
INSERT INTO icn_doctor_specialty(doctor_id, specialty_id) VALUES (1, 1), (2, 3);
INSERT INTO icn_appointment(patient_id, doctor_id, details) VALUES(1, 1, 'detalii apointment1'), (2, 1, 'detalii apointment2');