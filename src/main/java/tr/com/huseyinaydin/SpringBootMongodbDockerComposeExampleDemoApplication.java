package tr.com.huseyinaydin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import tr.com.huseyinaydin.dao.BookRepository;
import tr.com.huseyinaydin.model.Book;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringBootMongodbDockerComposeExampleDemoApplication {
    @Autowired
    private BookRepository repository;

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getBooks(){
        return repository.findAll();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongodbDockerComposeExampleDemoApplication.class, args);
    }
}