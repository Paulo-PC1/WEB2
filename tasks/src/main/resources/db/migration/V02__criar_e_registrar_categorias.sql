CREATE TABLE tasks(
	id bigint(20) PRIMARY KEY AUTO_INCREMENT,
	name varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tasks(id, name)
	values (1, 'Estudo');
	
INSERT INTO tasks(id, name)
	values (2, 'Esporte');
	