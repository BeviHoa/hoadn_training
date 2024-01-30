INSERT INTO products (id, name, image, price)
VALUES (1, 'Iphone 11 Pro Max', 'image://', 10220000);
INSERT INTO products (id, name, image, price)
VALUES (2, 'Iphone 12 Plus', 'image://', 12550000);
INSERT INTO products (id, name, image, price)
VALUES (3, 'Iphone 13 Pro', 'image://', 15899000);
INSERT INTO products (id, name, image, price)
VALUES (4, 'Iphone 14', 'image://', 19440000);
INSERT INTO products (id, name, image, price)
VALUES (5, 'Iphone Xr', 'image://', 8020000);



INSERT INTO orders (id, user_id, status, data)
VALUES (1, 1, true,
        '{
          "total_amount": 19000,
          "discount": 1000,
          "items": [
            {
              "product_id": 123456789,
              "price": 10000,
              "quantity": 2
            }
          ]
        }'
       );