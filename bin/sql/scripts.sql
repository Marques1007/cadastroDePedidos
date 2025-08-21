create table pedido (
	id			 uuid 		    primary key,
	nomeCliente  varchar(50) 	not null,  
	dataPedido   date           not null,
	valor        decimal(10, 2) not null,
	descricao    varchar(150)   not null
);