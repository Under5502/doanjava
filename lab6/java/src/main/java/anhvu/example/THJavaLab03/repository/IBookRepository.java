package anhvu.example.THJavaLab03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import anhvu.example.THJavaLab03.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}

