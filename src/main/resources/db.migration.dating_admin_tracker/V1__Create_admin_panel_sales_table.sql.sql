CREATE TABLE admin_panel_sales (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
application_date DATE NOT NULL,
client_contact VARCHAR(255) NOT NULL,
website_name VARCHAR(255) NOT NULL,
status ENUM('IN_PROGRESS', 'CLOSED', 'CANCELED') NOT NULL,
price DOUBLE NOT NULL,
notes TEXT,
document_url VARCHAR(255)
);
