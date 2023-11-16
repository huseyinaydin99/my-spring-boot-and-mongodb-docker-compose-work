package tr.com.huseyinaydin.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import tr.com.huseyinaydin.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
