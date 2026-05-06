CREATE TABLE users (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(200) NOT NULL,
	email varchar(50) NOT NULL,
	password varchar(200) NOT NULL,
	phone_number varchar(14) NOT NULL,
	active tinyint(1) NOT NULL,
	PRIMARY KEY(id)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users(id, name, email, password, phone_number, active)
	values (1, 'Paulo Cezar','paulo@email.com', 'cjoweb2', '(12) 9999-999', 1);
	
INSERT INTO users(id, name, email, password, phone_number, active)
	values (2, 'Paola Henrique', 'paola@email.com', 'cjoweb333', '(12) 9999-888', 1);