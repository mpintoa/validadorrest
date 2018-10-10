package cl.liberty.ws.validadorservice.dao;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.liberty.ws.validadorservice.entity.Interfaz;

@Transactional
@Repository
public class InterfazDAO implements IInterfazDAO {
//	@PersistenceContext
//	private EntityManager entityManager;

//	@SuppressWarnings("unchecked")
	@Override
	public List<Interfaz> getAllArticles() {

		Interfaz prueba = new Interfaz();
		prueba.setUsuario("marcelo");
		List<Interfaz> lista = new LinkedList<>();
		lista.add(prueba);
		// String hql = "FROM Interfaz";
		// return (List<Interfaz>) entityManager.createQuery(hql).getResultList();
		return lista;
	}

}
