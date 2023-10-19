CREATE TABLE admin_panel_sales (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
start_date DATE NOT NULL,
end_date DATE,
client_contact VARCHAR(255) NOT NULL,
client_identifier_id VARCHAR(100),
website_name VARCHAR(255) NOT NULL,
status VARCHAR(255) NOT NULL,
price DECIMAL(19, 2) NOT NULL,
notes TEXT,
document_url TEXT
);

