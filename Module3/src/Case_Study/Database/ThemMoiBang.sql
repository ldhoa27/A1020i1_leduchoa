drop database if exists furama;
create database furama;
use furama;

create table dich_vu_di_kem(
	id_dich_vu int(11) primary key auto_increment not null,
    ten_dich_vu varchar(45) not null,
    gia int not null,
    don_vi int not null,
    trang_thai varchar(45) not null
    
);
create table vi_tri(
	id_vi_tri int primary key auto_increment not null,
    ten_vi_tri varchar(45) not null
);
create table trinh_do(
	id_trinh_do int primary key auto_increment not null,
    trinh_do varchar(45) not null
);
create table bo_phan(
	id_bo_phan int primary key auto_increment not null,
    ten_bo_phan varchar(45) not null
);
create table loai_khach(
	id_loai_khach int primary key,
    ten_loai_khach varchar(45) not null
);
create table kieu_thue(
	id_kieu_thue int primary key auto_increment not null,
    ten_kieu_thue varchar(45) not null,
    gia int not null
);

create table loai_dich_vu(
	id_loai_dich_vu int primary key auto_increment not null,
    ten_loai_dich_vu varchar(45) not null
);

create table khach_hang(
	id_khach_hang int primary key not null,
    ten varchar(45) not null,
    ngay_sinh date not null,
    so_CMND varchar(45) not null unique,
    sdt varchar(45) not null,
    email varchar(45) not null,
    dia_chi varchar(45) not null,
    id_loai_khach int,
    
    constraint khach_hang_loai_khach_pk	foreign key(id_loai_khach) references loai_khach(id_loai_khach) on update cascade
)ENGINE=INNODB;

create table nhan_vien(
	id_nhan_vien int auto_increment not null,
    ho_ten varchar(45) not null,
    ngay_sinh date not null,
    so_CMND varchar(45) not null,
    luong varchar(45) not null,
    sdt varchar(45) not null,
    email varchar(45) not null,
    dia_chi varchar(45) not null,
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
    
    constraint nhan_vien_pk primary key(id_nhan_vien),
    constraint nhan_vien_vi_tri_fk foreign key(id_vi_tri ) references vi_tri(id_vi_tri) on delete cascade on update cascade,
	constraint nhan_vien_trinh_do_fk foreign key (id_trinh_do) references trinh_do(id_trinh_do) on delete cascade on update cascade,
	constraint nhan_vien_bo_phan_fk foreign key (id_bo_phan) references bo_phan(id_bo_phan) on delete cascade on update cascade

)ENGINE=INNODB;

create table dich_vu(
	id_dich_vu int primary key auto_increment not null,
    ten_dich_vu varchar(45) not null,
    dien_tich int not null,
    so_tang int not null,
    so_nguoi_toi_da varchar(45) not null,
    chi_phi_thue varchar(45) not null,
    trang_thai varchar(45) not null,
    kieu_thue_id_kieu_thue int,
    loai_dich_vu_id_loai_dich_vu int,
    
    constraint dich_vu_kieu_thue_fk foreign key (kieu_thue_id_kieu_thue) references kieu_thue (id_kieu_thue) on delete cascade on update cascade,
    constraint dich_vu_loai_dich_vu_fk foreign key (loai_dich_vu_id_loai_dich_vu) references loai_dich_vu (id_loai_dich_vu) on delete cascade on update cascade
    
);

create table hop_dong(
	id_hop_dong int primary key auto_increment not null,
    ngay_lam_hop_dong date not null,
    ngay_ket_thuc date not null,
    tien_dat_coc int not null,
    tong_tien int not null,
    nhan_vien_id_nhan_vien int,
    khach_hang_id_khach_hang int,
    dich_vu_id_dich_vu int,

    
    constraint hop_dong_nhan_vien_fk  foreign key (nhan_vien_id_nhan_vien) references nhan_vien (id_nhan_vien)on delete cascade on update cascade,
    constraint hop_dong_khach_hang_fk foreign key (khach_hang_id_khach_hang) references khach_hang (id_khach_hang)on delete cascade on update cascade,
    constraint hop_dong_dich_vu_fk foreign key (dich_vu_id_dich_vu) references dich_vu (id_dich_vu) on delete cascade on update cascade
)ENGINE=INNODB;

create table hop_dong_chi_tiet(
	id_hop_dong_chi_tiet int primary key auto_increment not null,
    so_luong int not null,
    hop_dong_id_hop_dong int,
    dich_vu_di_kem_id_dich_vu int,
    
   constraint hop_dong_chi_tiet_hop_dong_fk  foreign key (hop_dong_id_hop_dong) references hop_dong (id_hop_dong)on delete cascade on update cascade,
   constraint hop_dong_chi_tiet_dich_vu_di_kem_fk foreign key (dich_vu_di_kem_id_dich_vu) references dich_vu_di_kem (id_dich_vu) on delete cascade on update cascade
);
