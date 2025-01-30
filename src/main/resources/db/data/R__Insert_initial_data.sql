INSERT INTO skillflowai.roles (id, name) VALUES(1, 'ADMIN');
INSERT INTO skillflowai.roles (id, name) VALUES(2, 'USER');
INSERT INTO skillflowai.user (id, username, password) VALUES(1, 'olt_hemmerich@gmx.de', '$2a$12$ZW5r5pyDg9Jc5cwBfWKEoOc2zDb5sbAEkYpw9q4PAuxPWQ/vxp816');
INSERT INTO skillflowai.user (id, username, password) VALUES(2, 'hartmann.chris@gmx.de', '$2a$12$ZW5r5pyDg9Jc5cwBfWKEoOc2zDb5sbAEkYpw9q4PAuxPWQ/vxp816');
INSERT INTO skillflowai.user_roles (user_id, role_id) VALUES ( 1, 1);
INSERT INTO skillflowai.user_roles (user_id, role_id) VALUES ( 2, 2);
INSERT INTO skillflowai.organization
(created_by_id, created_date, id, last_modified_by_id, last_modified_date, description, "name")
VALUES(1, current_timestamp, 0, 1, current_timestamp, 'some desc...', 'Feuerwehr Grafenrheinfeld');
