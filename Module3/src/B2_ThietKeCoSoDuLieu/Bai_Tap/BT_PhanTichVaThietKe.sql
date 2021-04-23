drop database if exists personnel;
create database personnel;
use personnel;
create table offices(
	officeCode  varchar(10) not null,
    city varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50) null,
    stage varchar(50) null,
    countr varchar(50) not null,
    postalCode varchar(15) not null,
    
    constraint pk_offices primary key(officeCode)
);
create table employees(
	employeeNumber int(50) not null,
    lastName varchar(50) not null,
    firstName varchar(50) not null,
    email varchar(100) not null,
    jobTitle varchar(50) not null,
    reportTo int not null,
    offices_officeCode varchar(10) not null,
    
    constraint pk_employees primary key(employeeNumber),
    constraint employee_fk foreign key(reportTo) references employees(employeeNumber),
    constraint employee_fk_offices foreign key(offices_officeCode) references offices(officeCode)
);
create table customers(
	customerNumber int(11) not null auto_increment,
    customerName varchar(50),
    contactLastName varchar(50),
    contactFirstName varchar(50),
    phone varchar(50),
    addressLine1 varchar(50),
    addressLine2 varchar(50),
    city varchar(50),
    stage varchar(50),
    salesRepEmployeeNumber varchar(50) not null,
    
    constraint pk_customers primary key(customerNumber),
    foreign key(salesRepEmployeeNumber) references employees(employeeNumber)
    
);
create table productlines(
	productLine varchar(50) not null,
    textDescription text null,
    image varchar(10) null,
    
    constraint pk_productlines primary key(productLine)
);
create table products(
	productCode varchar(15) not null,
    productName varchar(70) not null,
    productScale varchar(10) not null,
    productVendor varchar(50) not null,
    productDescription text not null,
    quantityInStock int not null,
    buyPrice decimal not null,
    MSRP decimal not null,
    productlines_productLine varchar(50) not null,

    constraint pk_product primary key(productCode),
    foreign key(productlines_productLine) references productlines(productLine)
);

create table orders(
	orderNumber int(11) not null auto_increment,
    orderDate date not null,
    requiredDate date not null,
    shippedDate  date not null,
	`status` varchar(15) not null,
    comments text null,
    quantityOrdered int not null,
    priceEach char not null,
    customers_customerNumber int,
    
	constraint pk_orders primary key(orderNumber),
    foreign key (customers_customerNumber) references customers (customerNumber)
);
create table payments(
	customerNumber int(11) not null auto_increment,
    checkNumber varchar(50) not null,
    paymentDate date not null,
    amount char not null,
    customers_customerNumber int,
    
    constraint pk_payments primary key(customerNumber),
    foreign key (customers_customerNumber) references customers (customerNumber)

);

create table orderDetails(
    products_productCode varchar(15),
    orders_orderNumber int(11),
    
    primary key(products_productCode, orders_orderNumber),
    foreign key(products_productCode) references products(productCode),
    foreign key(orders_orderNumber) references orders(orderNumber)

);


