CREATE TABLE IF NOT EXISTS admin_panel_sales (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
application_date DATE NOT NULL,
client_contact VARCHAR(255) NOT NULL,
website_name VARCHAR(255) NOT NULL,
status ENUM('IN_PROGRESS', 'CLOSED', 'CANCELED') NOT NULL,
price DOUBLE NOT NULL,
notes TEXT,
document_url VARCHAR(255)
);
DROP PROCEDURE IF EXISTS alterNoFailure;;
create procedure alterNoFailure ()
begin
    declare continue handler for 1060 begin end;
    ALTER TABLE  admin_panel_sales
        ADD COLUMN client_telegram VARCHAR(255) NOT NULL,ALGORITHM=INPLACE, LOCK=NONE;
end;;
call alterNoFailure();;

DROP PROCEDURE IF EXISTS alterNoFailure;;
create procedure alterNoFailure ()
begin
    declare continue handler for 1060 begin end;
    ALTER TABLE  admin_panel_sales
        ADD COLUMN client_telegram VARCHAR(255) NOT NULL,ALGORITHM=INPLACE, LOCK=NONE;
end;;
call alterNoFailure();;