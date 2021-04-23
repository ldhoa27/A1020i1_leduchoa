use furama;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select *
from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten) < 15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *, year(curdate()) - year(ngay_sinh) as tuoi
from khach_hang
where (ngay_sinh between 18 and 50) or
 (dia_chi = 'Đà Nẵng' or 'Quảng Trị');

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ten , count(hop_dong.id_hop_dong) as 'so lan dat phong'
from khach_hang
	inner join hop_dong on khach_hang.id_loai_khach = hop_dong.khach_hang_id_khach_hang
    inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond'
group by khach_hang.id_khach_hang;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.id_khach_hang, khach_hang.ten, loai_khach.ten_loai_khach, hop_dong.id_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, dich_vu.ten_dich_vu, sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) as 'tong tien'
from khach_hang
		 left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
         left join hop_dong on hop_dong.khach_hang_id_khach_hang = khach_hang.id_khach_hang
         left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.hop_dong_id_hop_dong
		 left join dich_vu on dich_vu.id_dich_vu = hop_dong.dich_vu_id_dich_vu
         left join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu = dich_vu.id_dich_vu
         
group by hop_dong.id_hop_dong;
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select  dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich,  dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
		inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.loai_dich_vu_id_loai_dich_vu
where not exists(
	select hop_dong.id_hop_dong 
    from hop_dong
    where(hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-03-31') and hop_dong.dich_vu_id_dich_vu = dich_vu.id_dich_vu
    
);

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
    inner join loai_dich_vu on dich_vu.loai_dich_vu_id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where exists(
		select hop_dong.id_hop_dong
        from hop_dong
        where year(hop_dong.ngay_lam_hop_dong) = '2018' and hop_dong.dich_vu_id_dich_vu = dich_vu.id_dich_vu
        )
			and not exists(
				select hop_dong.id_hop_dong
				from hop_dong
				where year(hop_dong.ngay_lam_hop_dong) = '2019' and hop_dong.dich_vu_id_dich_vu = dich_vu.id_dich_vu
			);

--     8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- cách 1:
select distinct khach_hang.ten
from khach_hang;
-- cách 2:
select khach_hang.ten
from khach_hang
group by khach_hang.ten;
-- cách 3:
select khach_hang.ten
from khach_hang
union
select khach_hang.ten
from khach_hang ;
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hop_dong.ngay_lam_hop_dong) as thangKHD, count(hop_dong.id_hop_dong) as 'so lan dat', sum(hop_dong.tong_tien) as 'doanh thu', year(hop_dong.ngay_lam_hop_dong) as 'namKHD'
from khach_hang
	inner join hop_dong on khach_hang.id_khach_hang = hop_dong.khach_hang_id_khach_hang
group by thangKHD
having namKHD = '2019';
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hop_dong.id_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc, count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as 'so luong dich vu di kem'
from hop_dong
    inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.hop_dong_id_hop_dong
group by hop_dong.id_hop_dong;
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Đà Nẵng” hoặc “Sài Gòn”.
select dich_vu_di_kem.ten_dich_vu, dich_vu_di_kem.gia, dich_vu_di_kem.don_vi
from hop_dong
	inner join hop_dong_chi_tiet on dich_vu_di_kem_id_dich_vu = hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu
    inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu = hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu
    inner join khach_hang on khach_hang.id_khach_hang = hop_dong.khach_hang_id_khach_hang
    inner join loai_khach on loai_khach.id_loai_khach = khach_hang.id_loai_khach
    
where loai_khach.ten_loai_khach = 'Diamond' and khach_hang.dia_chi in ('Sài Gòn','Đà Nẵng');

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hop_dong.id_hop_dong, hop_dong.tong_tien, hop_dong.tien_dat_coc,nhan_vien.ho_ten as 'ten nhan vien', khach_hang.ten as 'ten khach hang', khach_hang.sdt as 'sdt khach hang', dich_vu.ten_dich_vu, 
count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as 'so luong dich vu di kem'
from hop_dong
	inner join nhan_vien on hop_dong.nhan_vien_id_nhan_vien = nhan_vien.id_nhan_vien
    inner join khach_hang on khach_hang.id_khach_hang = hop_dong.khach_hang_id_khach_hang
    inner join dich_vu on dich_vu.id_dich_vu = hop_dong.dich_vu_id_dich_vu
    inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.hop_dong_id_hop_dong
where not exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-06-31') 
	and exists(select hop_dong.id_hop_dong where hop_dong.ngay_lam_hop_dong between '2019-09-01' and '2019-12-31');
    
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select *, count(hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu) as 'so luong dich vu di kem'
from dich_vu_di_kem
    inner join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu = hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu
group by dich_vu_di_kem_id_dich_vu
order by 'so luong dich vu di kem' desc;
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select hop_dong.id_hop_dong, dich_vu.ten_dich_vu, dich_vu_di_kem.ten_dich_vu, count(hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu) as 'so lan su dung dich vu đi kem'
from dich_vu_di_kem
	inner join hop_dong_chi_tiet on hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu = dich_vu_di_kem.id_dich_vu
    inner join hop_dong on hop_dong.id_hop_dong = hop_dong_chi_tiet.hop_dong_id_hop_dong
    inner join dich_vu on dich_vu.id_dich_vu = hop_dong.dich_vu_id_dich_vu
group by hop_dong.id_hop_dong
having 'so lan su dung dich vu đi kem' = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, nhan_vien.sdt, nhan_vien.dia_chi, trinh_do.trinh_do, bo_phan.ten_bo_phan, count(hop_dong.nhan_vien_id_nhan_vien) as 'so lan tao hop dong'
	from nhan_vien 
    inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
    inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
    inner join hop_dong on hop_dong.nhan_vien_id_nhan_vien = nhan_vien.id_nhan_vien
where hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2019-12-31'
group by nhan_vien.ho_ten
having 'so lan tao hop dong' <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
delete from nhan_vien
where not exists(
	select nhan_vien.id_nhan_vien
    from hop_dong
    where hop_dong.ngay_lam_hop_dong between '2017-01-01' and '2019-12-31' and hop_dong.nhan_vien_id_nhan_vien = nhan_vien.id_nhan_vien
);

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
   update khach_hang,
   (select hop_dong.khach_hang_id_khach_hang as id, sum(hop_dong.tong_tien) as 'tong tien'
   from hop_dong
   where year(hop_dong.ngay_lam_hop_dong) = 2019
   group by hop_dong.khach_hang_id_khach_hang
   having 'tong tien' > 1000000) as temp set khach_hang.id_loai_khach = (select loai_khach.id_loai_khach from loai_khach where loai_khach.ten_loai_khach="Diamond") 
   where khach_hang.id_loai_khach = (select loai_khach.id_loai_khach from loai_khach where loai_khach.ten_loai_khach = "Platinium")
   and  temmp.id = khach_hang.id_khach_hang;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
delete khach_hang, hop_dong, hop_dong_chi_tiet
from khach_hang 
	inner join hop_dong on khach_hang.id_khach_hang = hop_dong.khach_hang_id_khach_hang
    inner join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.hop_dong_id_hop_dong
where not exists(
	select hop_dong.id_hop_dong where year(hop_dong.ngay_lam_hop_dong) < 2016 
    and khach_hang.id_khach_hang = hop_dong.khach_hang_id_khach_hang
);

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dich_vu_di_kem inner join(select dich_vu_di_kem.ten_dich_vu as ten_dich_vu_di_kem
from hop_dong_chi_tiet inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu = hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu
group by dich_vu_di_kem.id_dich_vu
having count(hop_dong_chi_tiet.dich_vu_di_kem_id_dich_vu) > 3) as temp set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2 
where dich_vu_di_kem.ten_dich_vu = temp.ten_dich_vu_di_kem;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, nhan_vien.ngay_sinh, nhan_vien.dia_chi, nhan_vien.sdt, nhan_vien.email, 'nhan_vien' as FromTable 
from nhan_vien
union all
select khach_hang.id_khach_hang, khach_hang.ten, khach_hang.ngay_sinh, khach_hang.dia_chi, khach_hang.sdt, khach_hang.email, 'khach_hang' as FromTable 
from khach_hang;