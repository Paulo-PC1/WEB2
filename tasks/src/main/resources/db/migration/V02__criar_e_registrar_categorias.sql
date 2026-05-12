CREATE TABLE category (
	id bigint(20) PRIMARY KEY AUTO_INCREMENT,
	name varchar(200) NOT NULL
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO category(id, name)
	values (1, 'Estudo');

INSERT INTO category(id, name)
	values (2, 'Esporte');
	
INSERT INTO category(id, name)
	values (3, 'Trabalho');

INSERT INTO category(id, name)
	values (4, 'Lazer');
