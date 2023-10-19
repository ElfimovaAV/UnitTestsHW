/*
Задание 2.
У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */

package seminar4.book;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;



import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class BookServiceTest {
    @Mock
    private BookRepository bookRepositoryMock;
    @InjectMocks
    private BookService bookService;


    @Test
    public void testBookServiceCallsMethods() {
        // Arrange
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);

        // Act
        bookService.findBookById("2");
        bookService.findAllBooks();
        // Assert
        verify(bookRepositoryMock, times(1)).findById("2");
        verify(bookRepositoryMock, times(1)).findAll();
    }

    @Test
    public void testBookServiceReturnBookID() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));


        assertEquals("1", bookService.findBookById("1").getId(), "Метод findBookById возвращает объект с не корректным ID");
    }

    /**
     * Проверяем поведение метода findAllBooks класса BookService
     */
    @Test
    public void testBookServiceReturnAllBooksList() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);

        when(bookRepositoryMock.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));


        assertEquals(4,
                bookService.findAllBooks().size(),
                "Метод findAllBooks возвращает некорректный размер списка с книгами");
    }


}