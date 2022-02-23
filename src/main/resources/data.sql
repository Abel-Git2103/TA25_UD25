DROP table IF EXISTS articulo;
DROP table IF EXISTS fabricante;

create table fabricante(
	codigo int auto_increment primary key,
    nombre varchar(250)
    );
    
create table articulo(
    codigo int auto_increment primary key,
    nombre varchar(250),
    precio int,
    fabricante int,
    foreign key (fabricante) references fabricante (codigo)
);

insert into fabricante (nombre)values('DELL');
insert into articulo (nombre,precio,fabricante)values('PC SOBREMESA',300,1);