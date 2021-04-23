drop database if exists classsicmodels;
create database classsicmodels;
use classsicmodels;

create table customer(
	id int primary key auto_increment,
    namecustomer varchar(30),
    phone int,
    city varchar(10),
    country varchar(10)

);
insert into customer
values
(1, 'Tùng', '038922222', 'Viêng chăn', 'Lào'),
(2, 'Khoa', '123456789', 'Hà Nội', 'Việt Nam'),
(3, 'Tay', '0981234567', 'London', 'Anh'),
(4, 'Dung' '0388888999', 'Băng Cốc', 'Thái Lan');

insert into customer(namecustomer, phone, city, country)
values
('Tiến', '0389888888', 'hà nội', 'việt nam'),
('Nam', '038999999', 'london', 'anh');

select 'namecustomer'
from customer
where id = '1';

delete from customer
where namecustomer = "tiến";

drop table customer;

drop database classsicmodels;

update customer
set namecustomer = 'tiến'
where namecustomer = 'thành';

alter table customer
add column email varchar(30);




