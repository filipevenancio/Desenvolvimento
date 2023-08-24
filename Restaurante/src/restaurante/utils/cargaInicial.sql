create table cardapio(
    id UUID not null primary key,
    ativo boolean not null,
    descricao varchar not null,
    nome varchar not null,
    turno integer not null
);

create table turno(
    id integer not null primary key,
    descricao varchar not null
);

alter table cardapio
    add constraints fk_cardapio_turno foreign key (turno) references turno(id)

insert into turno values (1, 'MANHÃ');
insert into turno values (2, 'TARDE');
insert into turno values (3, 'NOITE');

create table comida (
	id uuid not null primary key,
	nome varchar(100) not null,
	ingredientes varchar(300) not null,
	preco decimal not null,
	pessoas_servidas integer not null,
	tem_lactose boolean not null,
	tem_gluten boolean not null,
	peso_grama_porcao integer not null,
	eh_vegetariano boolean not null
);

create table bebida (
	id uuid not null primary key,
	nome varchar(100) not null,
	ingredientes varchar(300) not null,
	preco decimal not null,
	pessoas_servidas integer not null,
	tem_lactose boolean not null,
	tem_gluten boolean not null,
	qtd_ml_drink integer not null,
	tem_alcool boolean not null
);

create table rl_cardapio_comida(
    id_cardapio uuid not null references cardapio(id),
    id_comida uuid not null references comida(id)
);

create table rl_cardapio_bebida(
    id_cardapio uuid not null references cardapio(id),
    id_bebida uuid not null references bebida(id)
);

insert into cardapio
values
	('44d8afdb-906b-42d1-9b49-3e019633486b', true, 'cardápio para manhã', 'café da manhã', 1),
	('8bbb1439-63b8-4cb0-b1df-6d891ac447f4', true, 'cardápio para tarde', 'almoço', 2),
	('bbf77761-914e-4322-ab1e-22c5ef220245', true, 'cardápio para manhã', 'jantar', 1);

select * from cardapio c left join turno t on c.turno = t.id;