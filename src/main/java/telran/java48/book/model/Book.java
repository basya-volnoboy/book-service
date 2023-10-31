package telran.java48.book.model;

import java.io.Serializable;
import java.util.Set;
import telran.java48.book.model.Publisher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	@Column(name = "TITLE")
	String title;
	@ManyToMany 
	@JoinTable(
			name = "BOOK_AUTHORS", //таблица связи
			joinColumns = @JoinColumn(name = "BOOK_ISBN"), //это отвечает за меня(за этот класс бук
			inverseJoinColumns = @JoinColumn(name = "AUTHORS_NAME")//в обратную сторону таблица связи смотрит на первичный ключ автора
			)
	Set<Author> authors;
	@ManyToOne
	Publisher publisher;
}
