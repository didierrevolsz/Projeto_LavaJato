# Projeto_LavaJato
Projeto Lava Jato. Projeto criado com finalidade de gestão administrativa e financeira. 

Libs utilizadas:
-IDE - NetBeans IDE 8.2 RC
-JAVA - 1.8
-JDK 8u111
-Mysql-connector-java - 8.0.13


Funcionalidades:
- Login;
- CRUD de usuários;
- CRUD de Clientes;
- CRUD de Veiculos;
- CRUD de Serviços;
- CRUD de Funcionarios;
- eCommerce;
- Relatorio funcional das atividades;
- Emissão de nota fiscal;
- Webservice - json - ViaCEP: API interligada ao sistema para retornar o endereço do cliente via CEP do correios.

Configuração do banco de dados:
Script do Banco: 

CREATE DATABASE projeto1_db;

USE projeto1_db;

CREATE TABLE usuarios (
    ID Int unsigned zerofill not null auto_increment,
    login Varchar(16) NOT NULL UNIQUE,
    senha Varchar(14) NOT NULL UNIQUE,
    Primary Key (ID))
    ENGINE = MyISAM;

CREATE TABLE funcionario_tb (
    id_funcionario INT (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome_funcionario VARCHAR (100) NOT NULL,
    cpf_funcionario VARCHAR (11) NOT NULL UNIQUE,
    telefone_funcionario VARCHAR (100),
    email_funcionario VARCHAR (100));
    ENGINE = InnoDB;

CREATE TABLE cliente_tb (
    id_cliente INT (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome_cliente VARCHAR (100)NOT NULL ,
    cpf_cliente VARCHAR (11) NOT NULL UNIQUE,
    telefone_cliente VARCHAR (11),
    email_cliente VARCHAR (100));
    ENGINE = InnoDB;

CREATE TABLE servicos_tb (
    id_servicos INT (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR (100),
    preco_servicos DOUBLE (15,2));
    ENGINE = InnoDB;

CREATE TABLE `veiculo_tb` (
 `id_veiculo` int(11) NOT NULL AUTO_INCREMENT,
 `placa_veiculo` varchar(7) NOT NULL,
 `marca_veiculo` varchar(100) NOT NULL,
 `modelo_veiculo` varchar(100) NOT NULL,
 `tipo_veiculo` varchar(100) NOT NULL,
 `ano_veiculo` int(4) NOT NULL,
 `cpf_clente` int(11) NOT NULL,
 PRIMARY KEY (`id_veiculo`),
 KEY `cpf_cliente_fk` (`cpf_clente`),
 CONSTRAINT `cpf_cliente_fk` FOREIGN KEY (`cpf_clente`) REFERENCES `cliente_tb` (`id_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1
    ENGINE = InnoDB;

CREATE TABLE `lavagem_tb` (
 `id_lavagem` int(11) NOT NULL AUTO_INCREMENT,
 `id_veiculo` int(11) NOT NULL UNIQUE,
 `id_servicos` int(11) NOT NULL UNIQUE,
 `id_funcionario` int(11) NOT NULL UNIQUE,
 PRIMARY KEY (`id_lavagem`),
 KEY `id_veiculo` (`id_veiculo`),
 KEY `id_servicos` (`id_servicos`),
 KEY `id_funcionario` (`id_funcionario`),
 CONSTRAINT `lavagem_tb_ibfk_1` FOREIGN KEY (`id_veiculo`) REFERENCES `veiculo_tb` (`id_veiculo`),
 CONSTRAINT `lavagem_tb_ibfk_2` FOREIGN KEY (`id_servicos`) REFERENCES `servicos_tb` (`id_servicos`),
 CONSTRAINT `lavagem_tb_ibfk_3` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario_tb` (`id_funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1



