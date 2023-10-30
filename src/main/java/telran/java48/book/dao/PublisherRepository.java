package telran.java48.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.java48.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

	//@Query(value = "SELECT b.publisher_publisher_name FROM BOOK b JOIN BOOK_AUTHORS ba ON b.isbn = ba.book_isbn WHERE ba.author_name = 'Author2'"
	//		, nativeQuery = true)
	@Query("select b.publisher.publisherName from Book b join Book_Authors ba on b.isbn = ba.book.isbn where ba.author.name = ?1")
	Iterable<String> findPublishersByAuthor(String authorName);
}





