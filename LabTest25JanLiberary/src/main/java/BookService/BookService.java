package BookService;

import java.util.List;

import org.springframework.stereotype.Component;

import com.entity.BookRecords;

@Component
public interface BookService {

	BookRecords insertEntity(BookRecords bd);

	BookRecords getEntity(int book_id);

	BookRecords updateEntity(BookRecords bd, int book_id);

	String DeleteEntity(int book_id);

	List<BookRecords> getalldata();

}
