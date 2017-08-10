package modelo.dao;


import java.util.List;


import javax.persistence.TypedQuery;

import modelo.dominio.Cliente;

public class ClienteDAO extends JpaDAO<Cliente> {

	
	public List<Cliente> filtrarClientes(String filtro) {
		
		
		String consulta = "from Cliente c where c.cpf like :filtro order by c.idCliente desc";
		TypedQuery<Cliente> query = this.getEntityManager().createQuery(consulta, Cliente.class);
		
		
		query.setParameter("filtro", "%" + filtro + "%");
		
		return  query.getResultList();
		
	}

}
