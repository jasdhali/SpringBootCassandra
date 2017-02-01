cqlsh> create keyspace "ranga" with replication = {'class': 'SimpleStrategy', 'replication_factor': '1'};

cqlsh:system_traces> use ranga;

cqlsh:ranga> CREATE TABLE employee(id bigint PRIMARY KEY, name text, age int, salary float);

cqlsh:system_traces> INSERT INTO employee(id, name, age, salary) VALUES(1, 'Ranga', 27, 30000);

cqlsh:ranga> select * from employee;

 id | age | name  | salary
----+-----+-------+--------
  1 |  27 | Ranga |  30000