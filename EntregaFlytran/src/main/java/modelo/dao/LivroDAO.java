package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.dominio.Livro;


public class LivroDAO {

	private EntityManager manager = null;

	public LivroDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("banco");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Livro livro) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(livro);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Livro livro) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(livro);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(Livro livro) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(livro);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public Livro obter(Integer idLivro) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		Livro retorno = this.manager.find(Livro.class, idLivro);
		return retorno;
	}

	public List<Livro> obterTodos() {
		List<Livro> retorno = new ArrayList<Livro>();
		String jpql = "from Bebida b  order by b.idBebida desc";
		TypedQuery<Livro> query = this.manager.createQuery(jpql, Livro.class);

		retorno = query.getResultList();
		return retorno;
	}

}
