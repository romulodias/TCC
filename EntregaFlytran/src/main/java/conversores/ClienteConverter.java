package conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import modelo.dao.ClienteDAO;
import modelo.dominio.Cliente;




@FacesConverter(value="produto-converter")
public class ClienteConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		ClienteDAO daoCliente = new ClienteDAO();
		
		return daoCliente.lerPorId(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if (value instanceof Cliente)
		{
			Cliente cliente = (Cliente) value;
			return cliente.getIdCliente().toString();
		}
		
		return null;
	}

}
