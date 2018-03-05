package com.ietscode.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ietscode.entity.Book;
import com.ietscode.service.BookService;

@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {
	@Autowired
    private BookService bookService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        Book list = bookService.getById(1001);
        model.addAttribute("list", list);
        // list.jsp + model = ModelAndView
        return "list";// WEB-INF/jsp/"list".jsp
    }


}
