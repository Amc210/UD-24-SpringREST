DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250)
);

insert into trabajador(nombre, trabajo)values('Pepe','peon');
insert into trabajador(nombre, trabajo)values('Miquel','peon');
insert into trabajador(nombre, trabajo)values('Alba','paleta');
insert into trabajador(nombre, trabajo)values('Carla','capataz');
insert into trabajador(nombre, trabajo)values('Pepa','peon');