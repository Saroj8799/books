package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends JpaRepository<Book,Serializable>{
	

}
