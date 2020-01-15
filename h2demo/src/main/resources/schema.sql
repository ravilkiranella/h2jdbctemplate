drop table if exists user;

create table user
(
   id integer not null,
   username varchar(255) not null,
   designation varchar(255) not null,
   primary key(id)
);