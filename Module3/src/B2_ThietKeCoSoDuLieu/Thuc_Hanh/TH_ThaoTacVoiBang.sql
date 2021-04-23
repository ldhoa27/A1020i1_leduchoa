drop database if exists managers;

create database managers;
use managers;

create table contacts(
	contact_id int not null auto_increment,
    last_name varchar(30) not null,
    firsr_name varchar(25),
    birthday date,
    constraint contacts_pk primary key (contact_id)
);

create table suppliers(
	supplier_id int not null auto_increment,
    supplier_name varchar(50) not null,
    account_rep varchar(30) not null default 'TBD',
    constraint suppliers_pk primary key (supplier_id)
);