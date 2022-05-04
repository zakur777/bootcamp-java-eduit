/*Crear una tabla desde sql*/
/*Crear tablas*/
create table users(
    id int primary key auto_increment not null ,
    username varchar(50) not null,
    password varchar(100) not null
);
/*Insertar datos en una tabla*/
insert into users(username, password) values('eduit', 'eduit');
/*Ver los registros de una tabla*/
select * from users;
/*Ver los registros pero no todos*/
select username from users;

insert into users(username, password) values('root', '1234');
insert into users(username, password) values('admin', '12345');
insert into users(username, password) values('guess', 'guess');

select * from users;

/*Filtrar los datos de una tabla usando where*/
select * from users where username = 'guess';

/**/
create table articulos(
    id int auto_increment primary key not null,
    titulo varchar(100) not null,
    codigo varchar(10) not null,
    fecha_creacion date not null,
    precio float not null,
    stock int not null,
    marcas_id int not null ,
    categorias_id int not null
);

/*Tablas maestro*/
create table categorias (
    id int auto_increment primary key not null ,
    descripcion varchar(100),
    habilitada int not null
);
create table marcas(
    id int auto_increment primary key not null,
    descripcion varchar(100) not null,
    habilitada int not null
);

/*insertar registros en marca*/
insert into marcas(descripcion, habilitada) values('nike', 1);
insert into marcas(descripcion, habilitada) values('adidas', 1);
/*insert into marcas(descripcion, habilitada) values('adidas', 1);*/

select * from marcas;

INSERT INTO articulos(TITULO,CODIGO,PRECIO,FECHA_CREACION,MARCAS_ID,CATEGORIAS_ID,STOCK)
VALUES('ZAPATILLA NIKE', '0000000001',15000,curdate(),1,1,10);

select * from articulos;

insert into categorias (descripcion, habilitada) value ('libros', 1);

select * from categorias;

/*Crear una clave foranea via script*/
alter table articulos add constraint FK_articulos_categorias foreign key (categorias_id) references categorias(id);

select * from articulos;

/*Modificar datos de una tabala*/
update articulos
set titulo = 'ZAPATILLAS'
where id = 1
;

update articulos
set titulo = 'ZAPATILLAS', stock = 5, categorias_id = 1
where id = 1
;

select * from articulos;

/*Eliminar un registro de una tabla*/
delete from categorias where id=1;

/*Crear tabla newsletters*/
create table newsletters (
  id int auto_increment primary key not null,
    email varchar(100) not null ,
    fecha_registro date not null
);

