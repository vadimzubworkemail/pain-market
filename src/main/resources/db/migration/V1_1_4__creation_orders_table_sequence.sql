CREATE TABLE IF NOT EXISTS orders(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    product_id BIGSERIAL NOT NULL,
    client_id BIGSERIAL NOT NULL,
    price BIGSERIAL NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS orders_sequence START 101;
