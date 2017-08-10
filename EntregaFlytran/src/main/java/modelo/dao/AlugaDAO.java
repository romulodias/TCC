package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.dominio.Aluga;

public class AlugaDAO {

	private EntityManager manager = null;

	public AlugaDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("banco");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Aluga aluga) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(aluga);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Aluga aluga) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(aluga);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(Aluga aluga) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(aluga);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public Aluga obter(Integer idEmprestimo) {
		
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		Aluga retorno = this.manager.find(Aluga.class, idEmprestimo);
		return retorno;
	}

	public List<Aluga> obterTodos() {
		List<Aluga> retorno = new ArrayList<Aluga>();
		return retorno;
	}

}
