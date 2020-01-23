package br.com.fiap.library;

import br.com.fiap.library.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class BookControllerTest {

    @Test
    public void getAllTest(){
        BookController bookController = new BookController();

        Assert.notEmpty(bookController.getAll(null));
    }
}
