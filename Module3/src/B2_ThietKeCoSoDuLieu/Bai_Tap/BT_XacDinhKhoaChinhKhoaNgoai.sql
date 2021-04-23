drop database if exists managers;
create database managers;
use managers;
create table accounts (
	`account` varchar(50),
    type_of_account varchar(10),
    date_open date,
    surplus double,
    
    primary key (`account`)
);
create table customers(
	id int primary key auto_increment,
    fullname varchar(50),
    address varchar(20),
    email varchar(10),
    phone int(10),
    customer_number varchar(50),
    
    foreign key(customer_number) references accounts(account)
);

create table transactions(
	id int,
    money double,
    date_transactions date,
    `describe` varchar(50),
    account_number  varchar(50),
    
    foreign key( account_number)  references accounts(account),
    constraint pk_transactions primary key(id)
);





