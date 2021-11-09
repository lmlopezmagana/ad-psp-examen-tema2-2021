insert into curso (id, nombre, categoria, num_horas) VALUES (NEXTVAL('hibernate_sequence'), 'Java para principiantes', 'Iniciación', 100); -- 1
insert into curso (id, nombre, categoria, num_horas) VALUES (NEXTVAL('hibernate_sequence'), 'Java intermedio', 'Intermedio', 100);  -- 2
insert into curso (id, nombre, categoria, num_horas) VALUES (NEXTVAL('hibernate_sequence'), 'Java avanzado', 'Avanzado', 80); -- 3
insert into curso (id, nombre, categoria, num_horas) VALUES (NEXTVAL('hibernate_sequence'), 'HTML y CSS para dummies', 'Iniciación', 150); -- 4


insert into profesor (id, nombre, email, fecha_incorporacion) values (NEXTVAL('hibernate_sequence'), 'Ángel Naranjo', 'angel.naranjo@cursos.com', '2004-10-20'); -- 5
insert into profesor (id, nombre, email, fecha_incorporacion) values (NEXTVAL('hibernate_sequence'), 'Miguel Campos', 'miguel.campos@cursos.com', '2014-05-24'); -- 6
insert into profesor (id, nombre, email, fecha_incorporacion) values (NEXTVAL('hibernate_sequence'), 'Rafael Villar', 'rafael.villar@cursos.com', '2010-01-31'); -- 7
insert into profesor (id, nombre, email, fecha_incorporacion) values (NEXTVAL('hibernate_sequence'), 'Luismi López', 'luismi.lopez@cursos.com', '2008-09-18'); -- 8

insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 5, 1, 'Teoría, práctica', '2020-09-01', '2020-09-30');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 5, 2, 'Teoría', '2021-01-08', '2021-01-31');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 8, 2, 'Práctica', '2021-01-08', '2021-01-31');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 5, 3, 'Teoría', '2021-05-01', '2021-05-31');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 8, 3, 'Práctica', '2021-05-01', '2021-05-15');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (1, 6, 3, 'Práctica', '2021-05-16', '2021-05-31');

insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (2, 6, 1, 'Teoría, práctica', '2020-09-01', '2020-09-30');

insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (3, 8, 1, 'Teoría', '2020-09-01', '2020-09-20');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (3, 6, 1, 'Práctica', '2020-09-01', '2020-09-20');

insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (3, 6, 2, 'Teoría', '2021-09-01', '2021-09-20');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (3, 8, 2, 'Práctica', '2021-09-01', '2021-09-20');

insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (4, 7, 1, 'Teoría, práctica', '2019-09-01', '2019-10-10');
insert into imparte (curso_id, profesor_id, edicion, parte, fecha_inicio, fecha_fin) values (4, 6, 1, 'Práctica', '2019-09-15', '2020-09-30');