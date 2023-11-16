# my-spring-boot-and-mongodb-docker-compose-work
Docker Compose ile Spring Boot ve MongoDB servislerini bir biri ile konuşturdum.

docker pull mongo:latest
docker image ls
docker run -d -p 27017:27017 --name huseyinmongodb mongo:latest
docker build -t spring-boot-mongodb:1.0 .
docker run -p 8080:8080 --name spring-boot-mongodb --link huseyinmongodb:mongo -d spring-boot-mongodb:1.0
//docker exec -it huseyinmongodb bash
docker exec -it huseyinmongodb mongosh
$> mongo
$> show dbs
$> db.books.find().pretty()

docker logs spring-boot-mongodb
docker rm -f idno


//docker-compose.yml dosyası sonrası çalıştırılacak kod.
docker-compose up
