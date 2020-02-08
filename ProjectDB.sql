create table login
(
email varchar2(100),
password varchar2(64)
);

desc login;

insert into login values('test3@test.com','pass3');

select*from login;

select * from login where email='askjd' and password='sdfas';
select * from login where email='test@test.com' and password='pass1';

commit;

create table PersonDetails(
id varchar2(12) primary key not null,
name varchar2(50) not null,
dob DATE not null,
contactNo NUMBER(10) not null unique,
emailId varchar2(100) not null unique,
houseNo varchar2(10) not null,
street varchar2(20) not null,
block varchar2(20) not null,
district varchar2(30) not null,
city varchar2(50) not null,
state varchar2(50) not null,
country varchar2(50) not null
);

desc PersonDetails;

drop table PersonDetails;

create table PersonLogin(
emailId varchar2(100) primary key references PersonDetails(emailId),
password varchar2(64) not null
);

drop table PersonLogin;

desc PersonLogin;

insert into PersonDetails values();
