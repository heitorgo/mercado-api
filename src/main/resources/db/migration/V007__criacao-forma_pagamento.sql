create table forma_pagamento(
	id bigint not null auto_increment,
	titulo varchar(60) not null,
    data_cadastro timestamp not null,
    data_atualizacao timestamp not null,
    ativo boolean not null,
    
    primary key (id)
    
)engine=InnoDB default charset=utf8mb4;