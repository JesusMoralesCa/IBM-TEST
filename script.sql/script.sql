CREATE TABLE IF NOT EXISTS proveedores (
    id_proveedor BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    `fecha de alta` DATE NOT NULL,
    id_cliente BIGINT NOT NULL
);

INSERT INTO proveedores (nombre, `fecha de alta`, id_cliente)
VALUES 
    ('Coca-cola', STR_TO_DATE('11/01/2042', '%d/%m/%Y'), 5),
    ('Pepsi', STR_TO_DATE('12/01/2024', '%d/%m/%Y'), 5),
    ('Redbull', STR_TO_DATE('21/01/2024', '%d/%m/%Y'), 6),
    ('Fanta', STR_TO_DATE('12/01/2024', '%d/%m/%Y'), 7),
    ('Casera', STR_TO_DATE('25/01/2024', '%d/%m/%Y'), 8),
    ('Trina', STR_TO_DATE('23/01/2024', '%d/%m/%Y'), 6);
