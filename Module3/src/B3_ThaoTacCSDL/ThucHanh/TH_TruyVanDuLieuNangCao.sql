select productCode, productName, buyPrice, quantityInStock
from my_data3.products
where buyPrice > 56.76 and quantityInStock > 10;

select productCode, productName, productDescription
from my_data3.prodycts
inner join productslines
on products.productLine = productlines.productLine
where buyprice > 56.76 AND buyprice < 95.59;

select productCode, productName, buyPrice, quantityInStock, productVendor, productScale 
from my_data3.products 
where productScale = 'Classic Cars' or productVendor = 'Min Lin Diecast'