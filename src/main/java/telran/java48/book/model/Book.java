package telran.java48.book.model;

import java.io.Serializable;
import java.util.Set;
import telran.java48.book.model.Publisher;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "isbn")
@Entity
public class Book implements Serializable{
	
	private static final long serialVersionUID = 4072212431895777875L;
	@Id
	String isbn;
	String title;
	@ManyToMany //первое мэни это бук а второе это авторы
	Set<Author> authors;
	@ManyToOne
	Publisher publisher;
}
