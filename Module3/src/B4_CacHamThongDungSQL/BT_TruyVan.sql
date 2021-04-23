SELECT id,ten,tuoi,khoa_hoc,so_tien 
FROM my_data3.customer
WHERE ten = 'Huong';

select ten, sum(so_tien)
from my_data3.customer
group by ten
having ten = 'Huong';

select distinct ten
from my_data3.customer
