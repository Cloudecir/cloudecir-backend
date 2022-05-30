create table module (id varchar(255) not null, description varchar(512), name varchar(128), primary key (id));

create table operations (id varchar(255) not null, approver varchar(255), description varchar(255), displayname varchar(255), name varchar(255), requireapproval boolean, validator varchar(255), moduleid varchar(255) not null, primary key (id));
create table parameters (id varchar(255) not null, datatype varchar(255), defaultvalue varchar(255), description varchar(255), displayname varchar(255), mask varchar(255), maxvalue float8, minvalue float8, name varchar(255), required boolean, sequence int2, values varchar(255), operationid varchar(255) not null, primary key (id));
alter table if exists operations add constraint FKcninxe3swsf67choxbcqclwut foreign key (moduleid) references module;
alter table if exists parameters add constraint FK5s9nnjtq1pr3nfpahh8nf1jp0 foreign key (operationid) references operations;