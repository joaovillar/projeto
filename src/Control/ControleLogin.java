package Control;

import java.util.ArrayList;
import java.util.List;

import DAO.LoginDAO;
import Model.Aluno;
import Model.Professor;
import Model.Turma;
import Model.Usuario;
import XML.TurmaLogin;
import XML.UsuarioLogin;

public class ControleLogin {

	LoginDAO loginDAO = new LoginDAO();

	public UsuarioLogin tentarLogar(String nomeUsuario, String senha) {

		UsuarioLogin usuarioLogin = new UsuarioLogin();

		usuarioLogin.setSucess(false);

		Usuario usuario = loginDAO.tentarLogar(nomeUsuario, senha);

		if (usuario instanceof Aluno) {
			usuarioLogin.setSucess(true);
			usuarioLogin.setTipo("Aluno");
		} else if (usuario instanceof Professor) {
			usuarioLogin.setSucess(true);
			usuarioLogin.setTipo("Professor");
		}

		return usuarioLogin;
	}


}
