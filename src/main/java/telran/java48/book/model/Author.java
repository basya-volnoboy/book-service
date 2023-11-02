package telran.java48.book.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "name")
@Entity
public class Author implements Serializable{
	
	private static final long serialVersionUID = -5861276285892241835L;
	@Id
	 String name;
     LocalDate birthDate;
     @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL) //автор родитель по отношению к нигам - на стороне родительской енттити обозначаем мепд бай //cascade значит удалтся все книги принадлежайщие автору- каскадное удаление
     Set<Book> books;
     
	public Author(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
     
     
}
