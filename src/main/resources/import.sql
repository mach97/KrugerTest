  
INSERT INTO ORDER_ENTITY (number, client, total, date_order) values ('A001', 'JUAN PEREZ', 34, NOW());
INSERT INTO ORDER_ENTITY (number, client, total, date_order) values ('A002', 'Mauro Clavijo', 35, NOW());
INSERT INTO ORDER_DETAILS_ENTITY (id_order, detail, cantidad, precio_unitario, total_detail) values (1, 'Hamburguesa', 3.0, 2.0, 2.5);
INSERT INTO ORDER_DETAILS_ENTITY (id_order, detail, cantidad, precio_unitario, total_detail) values (1, 'Cola', 1.0, 4.0, 8.5);
INSERT INTO ORDER_DETAILS_ENTITY (id_order, detail, cantidad, precio_unitario, total_detail) values (2, 'Queso', 8.0, 4.0, 5.5);