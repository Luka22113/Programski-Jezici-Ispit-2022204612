create database ispitniZadatak;


use ispitniZadatak;

create table Peciva(
	pecivo_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pecivo_ime varchar(255),
    pecivo_cena int
);

create table Kupovine(
	kupovina_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    vreme_kupovine datetime,
    broj_peciva int,
    cena int,
    pecivo_id BIGINT
);

drop table Kupovine;
drop table Peciva;

insert into Peciva(pecivo_id, pecivo_ime, pecivo_cena)
values(0, "burek", 200);

select * from Peciva;
select * from Kupovine;

describe peciva;
