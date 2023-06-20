package anhvu.example.THJavaLab03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import anhvu.example.THJavaLab03.entity.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
