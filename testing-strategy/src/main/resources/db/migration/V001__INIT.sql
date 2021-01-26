CREATE TABLE books (
  id BIGSERIAL PRIMARY KEY,
  name varchar(255) not null,
  sheets_number NUMERIC(15) not null
);

insert into BOOKS (id, name, sheets_number) values(-1, 'Gray Mountain', 10);
insert into BOOKS (id, name, sheets_number) values(-2, 'Speak English', 200);
insert into BOOKS (id, name, sheets_number) values(-3, 'Speak English 2', 30);