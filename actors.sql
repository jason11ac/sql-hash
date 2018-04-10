-- Create table
create table Actors(name VARCHAR(40), movie VARCHAR(80), year INTEGER, role VARCHAR(40));

-- Load actors.csv into table correctly
load data local infile "./actors.csv" into table Actors
fields terminated by ',' optionally enclosed by '"';

-- Select all actors by name who were in "Die Another Day"
select name from Actors where Actors.movie = "Die Another Day";

-- Delete the created table
drop table Actors
