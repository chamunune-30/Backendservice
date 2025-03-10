Get Employees:  http://localhost:8080/myapp/api/employee
![image](https://github.com/user-attachments/assets/de0926b1-716c-45e9-a430-ad2cc3b2ab08)

Add Employee : http://localhost:8080/myapp/api/addemployee
![image](https://github.com/user-attachments/assets/7a737425-f7cb-4da7-ad32-b517e3381f5f)

Post Order : http://localhost:8080/myapp/api/orders

Kafka Installation steps :
===============================

Install Apache kafka .tar 
Extract zip file.
Go to kafka folder from terminal :
Start zookeeper :  bin/zookeeper-server-start.sh config/zookeeper.properties
Start kafka : bin/kafka-server-start.sh config/server.properties
Create topic : bin/kafka-topics.sh --create --topic orders --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
List Topics : bin/kafka-topics.sh --list --bootstrap-server localhost:9092

Staop kafka : bin/kafka-server-stop.sh
Stop zookeeper :bin/zookeeper-server-stop.sh

Postgresql:
=================
Verify orders table in following location :
schemas -> public -> Tables


