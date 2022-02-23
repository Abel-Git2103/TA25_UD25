DROP table IF EXISTS articulo;
DROP table IF EXISTS fabricante;

create table fabricante(
	codigo int not null auto_increment primary key,
    nombre varchar(250) default null
    );
    
create table articulo(
    codigo int not null auto_increment primary key,
    nombre varchar(250) default null,
    precio int default null,
    fabricante int default null,
    foreign key (fabricante) references fabricante (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into fabricante (nombre)values('DELL');
insert into articulo (nombre,precio,fabricante)values('PC SOBREMESA',300,1);