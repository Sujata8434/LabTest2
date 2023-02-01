package BookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.BookRecords;

import BookService.BookService;

@RestController

public class BookController {
	@Autowired
	BookService bs;

	@GetMapping("/viewall")
	public List<BookRecords> view() {
		return bs.getalldata();
	}

	@GetMapping(value = "/byid/{book_id}")
	public BookRecords viewById(@PathVariable int book_id) {
		return bs.getEntity(book_id);
	}

	@PostMapping("/add")
	public BookRecords add(@RequestBody BookRecords bd) {
		return bs.insertEntity(bd);
	}

	@PutMapping("/update/{book_id}")
	public BookRecords update(@PathVariable int book_id, @RequestBody BookRecords bd) {
		return bs.updateEntity(bd, book_id);
	}

	@DeleteMapping("/delete/{book_id}")
	public String delete(@PathVariable int book_id) {

		return bs.DeleteEntity(book_id);
	}

}
