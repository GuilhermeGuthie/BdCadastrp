package projetobanco;

import DAO.UsuarioDAO;
import Models.Usuario;
import Utils.ConexaoBanco;
import View.TelaCadastro;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProjetoBanco {

    public static ArrayList<Usuario> listaUsuario = null;

    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {

        new TelaCadastro().setVisible(true);

    }
}
