 package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}
	@Override
	public String upsertBook(Book book) {
		repository.save(book);
		if(book.getBookId()==null) {
			return"book Inserted";
		}else {
		return "Retrun Updated";
	}
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted";
	}

}
	
  