CREATE TABLE Product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         is_new BOOLEAN NOT NULL,
                         old_price VARCHAR(50),
                         new_price INT NOT NULL,
                         discounted_price DOUBLE,
                         description TEXT,
                         type VARCHAR(100),
                         stock INT DEFAULT 0,
                         brand VARCHAR(100),
                         size JSON,  -- stores string array (e.g. ["S","M","L"])
                         image VARCHAR(500),
                         rating INT DEFAULT 0,
                         category_id BIGINT NOT NULL,

                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                         CONSTRAINT fk_product_category
                             FOREIGN KEY (category_id) REFERENCES Category(id)
);