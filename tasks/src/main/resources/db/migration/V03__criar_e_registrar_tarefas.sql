CREATE TABLE tasks(
	id bigint(20) PRIMARY KEY AUTO_INCREMENT,
	description varchar(200) NOT NULL,
	creation_date date NOT NULL,
	observation varchar(200) NOT NULL,
	status varchar(50) NOT NULL,
	FOREIGN KEY (category_id) REFERENCES category(id),
	FOREIGN KEY (users_id) REFERENCES users(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO(description, creation_date, observation, status, category_id, users_id)
	values ('descricao muito foda', '2026-05-12', 'observacao muito foda', 'NOVA', 1, 1);
	
INSERT INTO(description, creation_date, observation, status, category_id, users_id)
	values ('descricao muito foda', '2025-10-10', 'observacao muito foda', 'EM ANDAMENTO', 2, 1);
	
INSERT INTO(description, creation_date, observation, status, category_id, users_id)
	values ('descricao muito foda', '2024-04-25', 'observacao muito foda', 'CONCLUIDA', 3, 2);
	
INSERT INTO(description, creation_date, observation, status, category_id, users_id)
	values ('descricao muito foda', '2026-05-12', 'observacao muito foda', 'NOVA', 4, 2);