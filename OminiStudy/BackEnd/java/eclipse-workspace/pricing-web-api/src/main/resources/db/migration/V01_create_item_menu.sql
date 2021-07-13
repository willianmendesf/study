CREATE TABLE menu (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	link VARCHAR(50) NOT NULL,
	icon VARCHAR(50) NOT NULL
) ENGINE=innoDB DEFAULT CHARSET=utf8;

INSERT INTO category (name, link, icon) values ('Lazer','#','painel');
INSERT INTO category (name, link, icon) values ('Alimentação','#','painel');
INSERT INTO category (name, link, icon) values ('Supermercado','#','painel');
INSERT INTO category (name, link, icon) values ('Farmácia','#','painel');
INSERT INTO category (name, link, icon) values ('Outros','#','painel');