CREATE TABLE products
(
    id int NOT NULL PRIMARY KEY,
    name varchar(255) NOT NULL ,
    image varchar(255),
    price float
);

CREATE TABLE cart_items
(
    user_id int NOT NULL ,
    product_id int NOT NULL ,
    quantity int NOT NULL
);

CREATE TABLE orders
(
    id int not null  primary key ,
    user_id int not null ,
    status bool DEFAULT false not null ,
    data jsonb
);

ALTER TABLE cart_items
    ADD CONSTRAINT fk_cart_items_product_id FOREIGN KEY (product_id) REFERENCES products(id);