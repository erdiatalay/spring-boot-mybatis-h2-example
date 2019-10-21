CREATE TABLE users
(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    email_adress varchar(100) NOT NULL,
    salary float(10) DEFAULT NULL,
    PRIMARY KEY (id)
);

insert into users(name, email_adress, salary)
values('erdi', 'erdi.atly@gmail.com', 2300);

insert into users(name, email_adress, salary)
values('omercan', 'omercan.ozbay@gmail.com', 2200);

insert into users(name, email_adress, salary)
values('kata', 'kata.donmez@gmail.com', 1900);