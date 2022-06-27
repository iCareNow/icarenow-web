INSERT INTO icn_role VALUES (1, 'ADMIN');
INSERT INTO icn_role VALUES (2, 'DOCTOR');
INSERT INTO icn_role VALUES (3, 'PATIENT');
INSERT INTO icn_user VALUES (1, 'andrei.mladin@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user VALUES (2, 'radumbaciu@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user VALUES (3, 'libenciuc.adrian@yahoo.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user VALUES (4, 'florentina.mirisan@yahoo.ro', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user VALUES (5, 'sastrasalina@gmail.com', '$2a$10$sbtCxo3sMIlrhz.htDiVxOJnJfo7zVVVdce8lzauh7FJqhiacBKs2', 1);
INSERT INTO icn_user_roles VALUES (1, 1), (2, 2), (3, 3), (4, 3), (5, 3);
INSERT INTO icn_patient VALUES (1, 3, '1234567890123', 'Libenciuc', 'Adrian',1);
INSERT INTO icn_patient VALUES (2, 4, '2345678901123', 'Florentina', 'Mirisan',1);
INSERT INTO icn_patient VALUES (3, 5, '3456789012123', 'Alina', 'Sastras', 0);
INSERT INTO icn_doctor VALUES (1, 2, 'Radu', 'Baciu');
INSERT INTO icn_specialty VALUES (1, 'Allergy and immunology');
INSERT INTO icn_specialty VALUES (2, 'Anesthesiology');
INSERT INTO icn_specialty VALUES (3, 'Dermatology');
INSERT INTO icn_specialty VALUES (4, 'Diagnostic radiology');
INSERT INTO icn_specialty VALUES (5, 'Emergency medicine');
INSERT INTO icn_specialty VALUES (6, 'Family medicine');
INSERT INTO icn_specialty VALUES (7, 'Internal medicine');
INSERT INTO icn_specialty VALUES (8, 'Medical genetics');
INSERT INTO icn_doctor_specialty VALUES (1, 1), (1, 2), (1, 3), (1, 4);
INSERT INTO icn_appointment VALUES(1, 1, 1, 'detalii apointment1'), (2, 2, 1, 'detalii apointment2');