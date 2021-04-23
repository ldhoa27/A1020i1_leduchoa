use furama;
insert into furama.vi_tri(id_vi_tri, ten_vi_tri)
values
(1, 'Lễ tân'),
(2, 'Phục vụ'),
(3, 'Chuyên viên'),
(4, 'Giám sát'),
(5, 'Quản lý'),
(6, 'Giám đốc'),
(7, 'CEO');

insert into furama.trinh_do(id_trinh_do, trinh_do)
values
(1, 'Trung cấp'),
(2, 'Cao đẳng'),
(3, 'Đại học'),
(4, 'Sau đại học'),
(5, 'Du hoc'),
(6, 'Cấp 3');

insert into furama.bo_phan(id_bo_phan, ten_bo_phan)
values
(1, 'Sale'),
(2, 'Hành chính'),
(3, 'Phục vụ'),
(4, 'Quản lý'),
(5, 'Lau don'),
(6, 'Bảo vệ');

insert into furama.loai_dich_vu(id_loai_dich_vu, ten_loai_dich_vu)
values
(1, 'Villa'),
(2, 'House'),
(3, 'Room'),
(4, 'Villa'),
(5, 'Room'),
(6, 'House'),
(7, 'Villa');

insert into furama.dich_vu_di_kem(id_dich_vu, ten_dich_vu, gia, don_vi, trang_thai)
values
(1, 'Massege', '10000', 100, 'đã đầy'),
(2, 'Karaoke', '7000', 200, 'Còn thiếu'),
(3, 'Drink', '5000', 500, 'Sẵn sàng'),
(4, 'Food', '3000', 300, 'Đã đầy'),
(5, 'Thuê xe', '15000', 400, 'Sẵn sàng'),
(6, 'abc', '10000', 600, 'Còn thiếu');


insert into furama.kieu_thue(id_kieu_thue, ten_kieu_thue, gia)
values
(1, 'Năm', '10000'),
(2, 'Tháng', '7000'),
(3, 'Ngày', '3000'),
(4, 'Giờ', '1000'),
(5, 'Phút', '500'),
(6, 'Ngày', '800'),
(7, 'Tháng', '3500');

insert into furama.loai_khach(id_loai_khach, ten_loai_khach)
values 
(1, 'Diamond'),
(2, 'Platinium'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member'),
(6, 'Silver');

insert into furama.dich_vu(id_dich_vu, ten_dich_vu, dien_tich, so_tang, so_nguoi_toi_da, chi_phi_thue, trang_thai, kieu_thue_id_kieu_thue, loai_dich_vu_id_loai_dich_vu)
values
(1, 'Villa', '1000', 2, 10, '20000','đã đầy', 1, 1),
(2, 'House', '700', 3, 5,'10000','Còn thiếu', 2, 2),
(3, 'Room', '500', 1, 3,'5000','Sẵn sàng', 3, 3),
(4, 'Villa', '800', 2, 10, '30000', 'Sẵn sàng', 4, 4),
(5, 'House', '900', 3, 15, '40000', 'Sẵn sàng', 5, 5),
(6, 'Villa', '50', 12, 6, '9000', 'Đã đặt', 6, 6),
(7, 'Villa', '60', 78, 69, 899,'Còn trống', 7, 7);

insert into furama.khach_hang(id_khach_hang, ten, ngay_sinh, so_CMND, sdt, email, dia_chi, id_loai_khach)
values
(1,'Thuan', '1999-10-01', '123456987','0389222222', 'Zbyszek@gmail.com', 'Đà Nẵng', 1),
(2,'Quang', '1989-11-25', '432156987','0389333332', 'matti@gmail.com', 'Hải Phòng', 2),
(3,'Thiet', '2003-05-10', '987432156','0389898989', 'karl@gmail.com', 'Vinh',3),
(4,'Hoa', '1999-09-10', '189927363', '0389225696', 'hoale@gmail.com', 'Đà Nẵng', 4),
(5,'Quang', '2000-08-19', '189927987', '0389225869', 'binhnguyen@gmail.com', 'Quảng Ngãi', 5),
(6, 'Tien', '2021-10-12', '111122223', '0389222888', 'tiennguyen@gmail.com', 'Quảng Trị', 6);


insert into furama.nhan_vien(id_nhan_vien, ho_ten, ngay_sinh, so_CMND, luong, sdt, email, dia_chi, id_vi_tri, id_trinh_do, id_bo_phan)
values
(1,'Duc Hoa', '1999-10-01', '123456789', '20000', '0389228888', 'white@gmail.com', 'England', 1, 1, 1),
(2,'Van A', '1999-12-01', '6666456789', '50000', '0389229999', 'kala@gmail.com', 'Spain', 2, 2, 2),
(3,'Thi Hoai', '1997-02-10', '66664560000', '10000', '03892299898', 'Wolski@gmail.com', 'Potugal', 3, 3, 3),
(4,'Khanh Vinh', '2000-05-15', '66664561111', '30000', '03892290000', 'Cardinal@gmail.com', 'France', 4, 4, 4),
(5, 'Hong Nhung', '1989-10-21', '2223345679', '35000', '0389225686', 'kenvin@gmail.com', 'USA', 5, 5, 5),
(6, 'Mai Mai', '1980-12-21', '2223345666', '40000', '0389225555', 'mai@gmail.com', 'Russua', 6, 6, 6);

insert into furama.hop_dong(id_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, tong_tien, nhan_vien_id_nhan_vien, khach_hang_id_khach_hang, dich_vu_id_dich_vu)
values
(1, '2019-10-10', '2019-10-21', 5000, 3000000, 1, 1, 1),
(2, '2017-03-31', '2019-03-05', 3000, 1500000, 2, 2, 2),
(3, '2018-04-05', '2018-05-07', 2000, 1000000, 3, 3, 3),
(4, '2016-02-10', '2016-02-15', 2500, 1500000, 4, 4, 4),
(5, '2015-06-10', '2015-06-30', 5000, 5000000, 5, 6, 5),
(6, '2016-03-21', '2016-04-10', 5000, 8000000, 6, 2, 6);

insert into furama.hop_dong_chi_tiet(id_hop_dong_chi_tiet, so_luong, hop_dong_id_hop_dong, dich_vu_di_kem_id_dich_vu)
values
(1, 2, 1, 1),
(2, 1, 2, 2),
(3, 6, 3, 3),
(4, 4, 4, 4),
(5, 5, 5, 5),
(6, 6, 6, 6);











