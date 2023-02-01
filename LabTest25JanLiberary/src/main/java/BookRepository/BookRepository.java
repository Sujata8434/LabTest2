package BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.BookRecords;

public interface BookRepository extends JpaRepository<BookRecords, Integer> {
}
