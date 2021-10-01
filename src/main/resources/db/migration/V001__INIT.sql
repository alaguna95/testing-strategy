CREATE TABLE book_topics (
  id varchar(500) PRIMARY KEY,
  name varchar(255) not null
);

insert into book_topics (id, name) values('7aa61656-22a8-11ec-9621-0242ac130002', 'Historical');
insert into book_topics (id, name) values('89b33296-22a8-11ec-9621-0242ac130002', 'Educational');


CREATE TABLE books (
  id varchar(500) PRIMARY KEY,
  name varchar(255) not null,
  sheets_number NUMERIC(15) not null,
  book_topic_id varchar(500) not null
);

insert into books (id, name, sheets_number, book_topic_id) values('b0359738-22a8-11ec-9621-0242ac130002', 'Gray Mountain', 10, '7aa61656-22a8-11ec-9621-0242ac130002');
insert into books (id, name, sheets_number, book_topic_id) values('b5d65808-22a8-11ec-9621-0242ac130002', 'Speak English', 200, '89b33296-22a8-11ec-9621-0242ac130002');
insert into books (id, name, sheets_number, book_topic_id) values('b9f641a0-22a8-11ec-9621-0242ac130002', 'Speak English 2', 30, '89b33296-22a8-11ec-9621-0242ac130002');

