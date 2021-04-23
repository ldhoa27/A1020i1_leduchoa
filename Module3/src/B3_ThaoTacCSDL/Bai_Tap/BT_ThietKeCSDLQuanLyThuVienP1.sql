drop database if exists thuvien;
create database thuvien;
use thuvien;
create table loai_sach(
	id_loai_sach int primary key auto_increment,
    ten_loai_sach varchar(45),
    sach_id_sach int,
    foreign key(sach_id_sach) references sach(id_sach)
);
create table sach(
	id_sach int primary key auto_increment,
    ten_sach varchar(45),
    nha_sx varchar(45),
    loai_sach_id_loai_sach int,
	foreign key(loai_sach_id_loai_sach) references loai_sach(id_loai_sach)
);

create table the_muon(
	id_the_thu_vien int primary key auto_increment,
    ia_sach int,
    ngay_muon date,
    ngay_tra date
);

create table sinh_vien(
	id_the_sv varchar(15) primary key not null auto_increment,
    ten_sv varchar(50) not null,
    ngay_sinh date not null,
    so_CMND int,
    sdt int,
	email varchar(50) not null,
    dia_chi varchar(500) not null,
    image longblob not null
);
