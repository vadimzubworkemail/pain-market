CREATE TABLE IF NOT EXISTS product(
                                      id BIGINT PRIMARY KEY NOT NULL,
                                      name VARCHAR(128) NOT NULL,
                                      price REAL NOT NULL,
                                      discount INT NOT NULL DEFAULT 0
);

CREATE SEQUENCE IF NOT EXISTS product_sequence START 101;

INSERT INTO product(id, name, price, discount) VALUES(nextval('product_sequence'), 'Трусы', 100.00, 10);
INSERT INTO product(id, name, price, discount) VALUES(nextval('product_sequence'), 'Носки', 200.00, 20);
INSERT INTO product(id, name, price, discount) VALUES(nextval('product_sequence'), 'Майка', 300.00, 30);
INSERT INTO product(id, name, price, discount) VALUES(nextval('product_sequence'), 'Каска', 400.00, 40);
INSERT INTO product(id, name, price, discount) VALUES(nextval('product_sequence'), 'Пулемёт', 500.00, 50);

CREATE TABLE IF NOT EXISTS customer(
                                       id BIGINT PRIMARY KEY NOT NULL,
                                       email VARCHAR(256) NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS customer_sequence START 101;

INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), 'ivanov@mail.com');
INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), 'petrov@mail.com');
INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), 'sidorov@mail.com');
INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), 'pupkin@mail.com');
INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), 'mari_vana@mail.com');

CREATE TABLE IF NOT EXISTS orders(
                                     id BIGSERIAL PRIMARY KEY NOT NULL,
                                     product_id BIGSERIAL NOT NULL REFERENCES product(id),
                                     client_id BIGSERIAL NOT NULL REFERENCES customer(id),
                                     price BIGSERIAL NOT NULL
);
