DROP TABLE category;
DROP TABLE flyway_schema_history;

CREATE TABLE category (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;


INSERT INTO category (name) values ('Lazer');
INSERT INTO category (name) values ('Alimentação');
INSERT INTO category (name) values ('Supermercado');
INSERT INTO category (name) values ('Farmácia');
INSERT INTO category (name) values ('Outros');

