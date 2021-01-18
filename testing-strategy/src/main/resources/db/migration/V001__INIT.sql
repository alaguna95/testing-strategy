CREATE TABLE books (
  id BIGSERIAL PRIMARY KEY,
  name varchar(255) not null
);

insert into BOOKS (id, name) values(-1, 'Gray Mountain');
insert into BOOKS (id, name) values(-2, 'Speak English');