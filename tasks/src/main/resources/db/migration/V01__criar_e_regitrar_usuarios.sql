CREATE TABLE user (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(200) NOT NULL,
	password varchar(200) NOT NULL,
	phone_number varchar(14) NOT NULL,
	active tinyint(1) NOT NULL
	PRIMARY KEY(id)
) 
ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user(id, name, password, phone_number, active)
	values (1, 'Paulo Cezar', 'cjoweb2', '(12) 9999-999', 1);
	
INSERT INTO user(id, name, password, phone_number, active)
	values (2, 'Paola Henrique', 'cjoweb333', '(12) 9999-888', 1);