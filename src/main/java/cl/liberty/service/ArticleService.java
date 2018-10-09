package cl.liberty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.liberty.dao.IArticleDAO;
import cl.liberty.entity.Interfaz;

@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;

	@Override
	public List<Interfaz> getAllArticles() {
		return articleDAO.getAllArticles();
	}
}
