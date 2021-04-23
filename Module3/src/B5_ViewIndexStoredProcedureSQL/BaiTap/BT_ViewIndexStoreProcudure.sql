drop database if exists demo;
create database demo;

create table demo.products(
	id int primary key not null auto_increment,
    productCode varchar(20) not null,
    productName varchar(20) not null,
    productAmount int not null,
    productDes text not null,
    productStatus int
);

insert into demo.products(productCode, productName, productAmount, productDes, productDes, productStatus)
values
('123456789', 'iphone', '20000', 'abc', 1),
('123456888', 'SamSung', '18000', 'bcd', 2),
('987645678', 'Oppo', '15000', 'abcedd', 3);

explain select *
from demo.products
where productCode = '123456789';

create unique index product_code_index
on demo.products(productCode);

drop index product_code_index
on demo.products;

explain select *
from demo.products
where productName = 'SamSung'
and productCode = '18000';

create unique index composite_product_index
on demo.products(productName, productPrice);

create view demo.products_view as
select productCode, productName, productPrice, productStatus
from demo.products;

select *
from demo.products_view;

delimiter //
create procedure demo.sp_get_all_info()
begin
	select *
    from products;
end;
// delimiter ;

call demo.sp_get_all_info();

delimiter //
create procedure demo.sp_add_new_product(
    pProductCode varchar(20),
    pProductName varchar(30),
    pProductPrice decimal(20,0),
    pProductAmount int,
    pProductDes text,
    pProductStatus int)
begin
	insert into products(productCode, productName, productPrice, productAmount, productDes, productStatus)
    values (pProductCode, pProductName, pProductPrice, pProductAmount, pProductDes, pProductStatus);
end;
// delimiter ;

call demo.sp_add_new_product('123456789', 'Oppo', 15000, 0, 'abc', 1);
delimiter //
create procedure demo.sp_update_product_by_id(
	pId int,
    pProductCode varchar(20), 
    pProductName varchar(30),
    pProductPrice decimal(20,2),
    pProductAmount int,
    pProductDes text,
    pProductStatus int)
begin
	update products
    set productCode = pProductCode, 
    productName = pProductName,
    productPrice = pProductPrice,
    productAmount = pProductAmount,
    pProductDes = ppProductDes,
    productStatus = pProductStatus
	where
		id = pId;
end;
// delimiter ;

call demo.sp_update_product_by_id(3, '123456789', 'Oppo', 15008, 8, 'aksdm', 0);

delimiter //
create procedure demo.sp_delete_product_by_id(pId int)
begin
	delete from products
	where id = pId;
end;
// delimiter ;

call demo.sp_delete_product_by_id(8);
