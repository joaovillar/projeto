package Control;

import DAO.AulaDAO;
import XML.InicializaChamada;

public class ControleAula {
	
	AulaDAO aulaDAO = new AulaDAO();

	public InicializaChamada inicializaChamada(Integer idTurma) {
		return aulaDAO.inicializaChamada(idTurma);
	}

}
