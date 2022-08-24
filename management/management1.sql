Create database management;
use management;
create table staff(
staff_id int (6) not null auto_increment,
first_name varchar(20) not null,
last_name varchar (20) not null,
position varchar (20) not null,
dob date  not null,
pay int(6) not null,
primary key(staff_id));

select * From staff;
insert INTO staff(first_name, last_name, position, dob, pay)
values ("john", "smith", "desk" , "1999-01-15", 300000); 