package BookServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BookRecords;

import BookRepository.BookRepository;

@Service
public interface BookServiceImpliment {

	@Autowired
	BookRepository br;

	@Override
	public BookRecords insertEntity(BookRecords bd) {
		// TODO Auto-generated method stub
		return br.save(bd);
	}

	@Override
	public BookRecords getEntity(int book_id) {
		// TODO Auto-generated method stub
		return br.findById(book_id).get();
	}

@Override
	public BookRecords updateEntity(BookRecords bd, int book_id) {
		// TODO Auto-generated method stub
	BookRecords bd1 = br.findById(book_id).get();
		bd1.setBook_title(bd.getBook_title());
		bd1.setBook_author(bd.getBook_author());
		bd1.setBook_pages(bd.getBook_pages());
		bd1.setBook_price(bd.getBook_price());
		return br.save(bd1);
	}

	@Override
	public String DeleteEntity(int book_id) {
		// TODO Auto-generated method stub
		br.deleteById(book_id);
		return "ID: " + book_id + "id deleted......";
	}

@Override
	public List<BookRecords> getalldata() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

}
