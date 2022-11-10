
DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;



create table almacenes(
	id int auto_increment PRIMARY KEY,
	lugar varchar(100),
	capacidad INT
    );
    
create table cajas(
	numero_referencia varchar(5) PRIMARY KEY,
	contenido varchar(100),
    valor int,
    almacen_id int,
    FOREIGN KEY (almacen_id) REFERENCES almacenes(id) ON DELETE CASCADE ON UPDATE CASCADE 
	);

insert into almacenes (lugar,capacidad) values ('Tarragona', '1500');
insert into almacenes (lugar,capacidad) values ('Reus', '1200');
insert into almacenes (lugar,capacidad) values ('Barcelona', '3000');
insert into almacenes (lugar,capacidad) values ('Salou', '800');
insert into almacenes (lugar,capacidad) values ('Vilaseca', '700');

insert into cajas (numero_referencia, contenido, valor, almacen_id) values('1A','Comida', '5000','1');
insert into cajas (numero_referencia, contenido, valor, almacen_id) values('1B','Comida', '4000','1');
insert into cajas (numero_referencia, contenido, valor, almacen_id) values('1C','Tecnologia', '25000','2');
insert into cajas (numero_referencia, contenido, valor, almacen_id) values('2A','Telefonos', '20000','3');
insert into cajas (numero_referencia, contenido, valor, almacen_id) values('2B','Juguetes', '12000','4');
insert into cajas (numero_referencia, contenido, valor, almacen_id) values('2C','Libros', '8000','5');

