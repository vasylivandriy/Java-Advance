drop database if exists car;
create database if not exists car char set utf8;

create table car.car_table(
id int primary key auto_increment,
model varchar (30) not null,
color varchar(25) not null
);

insert into car.car_table(model, color)
values
("Tesla", "white"),
("BMW", "black");

