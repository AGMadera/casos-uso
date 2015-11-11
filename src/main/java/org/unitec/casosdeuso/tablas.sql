create table cliente(
id_cliente integer primary key auto_increment, 
nombre varchar(120), 
apellido_paterno varchar(120),
email varchar(120)
);

create table destino(
id_destino integer primary key auto_increment,
id_cliente integer,
ciudad varchar(120),
hotel varchar(120),
num_personas int,
constraint fk_id_cliente_dest foreign key (id_cliente) references cliente(id_cliente)
);

create table tarjeta(
id_tarjeta integer primary key auto_increment,
id_cliente integer,
nombre_tarjeta varchar (120),
saldo float,
numero_tarjeta integer,
constraint fk_id_cliente foreign key (id_cliente) references cliente(id_cliente)
);

drop table cliente;
drop table destino;