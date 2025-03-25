INSERT INTO skillflowai.roles (id, name) VALUES(1, 'ADMIN');
INSERT INTO skillflowai.roles (id, name) VALUES(2, 'USER');
INSERT INTO skillflowai.user (id, username, password) VALUES(1, 'olt_hemmerich@gmx.de', '$2a$12$ZW5r5pyDg9Jc5cwBfWKEoOc2zDb5sbAEkYpw9q4PAuxPWQ/vxp816');
INSERT INTO skillflowai.user (id, username, password) VALUES(2, 'hartmann.chris@gmx.de', '$2a$12$ZW5r5pyDg9Jc5cwBfWKEoOc2zDb5sbAEkYpw9q4PAuxPWQ/vxp816');
INSERT INTO skillflowai.user_roles (user_id, role_id) VALUES ( 1, 1);
INSERT INTO skillflowai.user_roles (user_id, role_id) VALUES ( 2, 2);
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 0, 1, current_timestamp, 'some desc...', 'Feuerwehr Grafenrheinfeld');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 1, 1, current_timestamp, 'some more desc...', 'Feuerwehr Bamberg');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 2, 1, current_timestamp, 'some nice desc...', 'Feuerwehr Würzburg');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 3, 1, current_timestamp, 'some hot desc...', 'Feuerwehr Kitzingen');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 4, 1, current_timestamp, 'some blurry desc...', 'Feuerwehr Volkach');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 5, 1, current_timestamp, 'some flurry desc...', 'Feuerwehr Bad Kissingen');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 6, 1, current_timestamp, 'some icy desc...', 'Feuerwehr Hammelburg');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 7, 1, current_timestamp, 'some shitty desc...', 'Feuerwehr Schweinfurt');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 8, 1, current_timestamp, 'some strange desc...', 'Feuerwehr Grettstatt');
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 9, 1, current_timestamp, 'some nice desc...', 'Feuerwehr Bergrheinfeld');
