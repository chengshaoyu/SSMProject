import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ietscode.dao.BookMapper;
import com.ietscode.entity.Book;
public class BookDaoTest extends BaseTest {

    @Autowired
    private BookMapper bookDao;

    @Test
    public void testQueryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.selectByPrimaryKey(bookId);
        System.out.println(book.getName());
    }

//    @Test
//    public void testQueryAll() throws Exception {
//    	 System.out.println("asas");
//        List<Book> books = bookDao.queryAll(0, 4);
//        for (Book book : books) {
//            System.out.println(book);
//        }
//        System.out.println("asas");
//    }
//
//    @Test
//    public void testReduceNumber() throws Exception {
//        long bookId = 1000;
//        int update = bookDao.reduceNumber(bookId);
//        System.out.println("update=" + update);
//    }

}