CREATE TABLE book_topics (
  id BIGSERIAL PRIMARY KEY,
  name varchar(255) not null
);

insert into book_topics (id, name) values(-1, 'Historical');
insert into book_topics (id, name) values(-2, 'Educational');


CREATE TABLE books (
  id BIGSERIAL PRIMARY KEY,
  name varchar(255) not null,
  sheets_number NUMERIC(15) not null,
  book_topic_id NUMERIC(15) not null
);

insert into books (id, name, sheets_number, book_topic_id) values(-1, 'Gray Mountain', 10, -1);
insert into books (id, name, sheets_number, book_topic_id) values(-2, 'Speak English', 200, -2);
insert into books (id, name, sheets_number, book_topic_id) values(-3, 'Speak English 2', 30, -2);

