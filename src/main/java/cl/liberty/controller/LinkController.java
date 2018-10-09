package cl.liberty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.liberty.entity.Interfaz;
import cl.liberty.service.IArticleService;
 
@Controller
@RequestMapping("interfaz")
public class LinkController {
	@Autowired
	private IArticleService articleService;
 
    @RequestMapping(value="/obtener")
	public ResponseEntity<List<Interfaz>> getAllArticles() {
		List<Interfaz> list = articleService.getAllArticles();
		return new ResponseEntity<List<Interfaz>>(list, HttpStatus.OK);
	}
     
}
