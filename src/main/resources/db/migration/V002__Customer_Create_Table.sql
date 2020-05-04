create table tb_customer (
	id bigint not null auto_increment,
    name varchar(100) not null,
    cpf varchar(11) not null,
    user_id bigint,
    
    primary key(id),
    foreign key (user_id) references tb_user (id)
);