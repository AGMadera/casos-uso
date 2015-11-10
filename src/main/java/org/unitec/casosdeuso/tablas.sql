create table cliente(
id_usuario integer primary key auto_increment, 
nombre varchar(120), 
apellido_paterno varchar(120),
email varchar(120)
);

create table destino(
id_destino integer primary key auto_increment,
id_usuario integer,
ciudad varchar(120),
hotel varchar(120),
num_personas int,
constraint fk_id_usuario foreign key (id_usuario) references cliente(id_usuario)
);

create table tarjeta(
id_tarjeta integer primary key auto_increment,
id_destino integer,
nombre_tarjeta varchar (120),
saldo float,
numero_tarjeta integer,
constraint fk_id_destino foreign key (id_destino) references destino(id_destino)
);