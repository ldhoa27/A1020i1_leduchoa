drop database if exists my_data3;

create database my_data3;
use my_data3;

create table customer(
	id int primary key not null,
    ten varchar(45),
    tuoi int,
    khoa_hoc varchar(45),
    so_tien varchar(45)
);

insert into customer(id, ten, tuoi, khoa_hoc, so_tien)
values
(1, 'Hoang', '21', 'CNTT', '40000'),
(2,'Viet', '19', 'DTVT', '21000'),
(3,'Thanh', '20', 'KTDN', '45000'),
(4,'Nhan', '18', 'CK', '50000'),
(5,'Huong', '21', 'TCCH', '20000'),
(6,'Huong', '19', 'TC', '45000')