# Installation mysql
```sql
create database db_smf;
create user 'springuser'@'%' identified by '1234';
grant all on db_smf.* to 'springuser'@'%';
```