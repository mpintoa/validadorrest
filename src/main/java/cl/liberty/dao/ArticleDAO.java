package cl.liberty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.liberty.entity.Interfaz;

@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Interfaz> getAllArticles() {
		String hql = "FROM Interfaz";
		return (List<Interfaz>) entityManager.createQuery(hql).getResultList();
	}

}
