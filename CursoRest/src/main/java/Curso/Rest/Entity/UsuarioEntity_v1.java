package Curso.Rest.Entity;

import java.util.ArrayList;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class UsuarioEntity_v1 {
	
	public int id;
	public String name;
	public int age;
	public ArrayList<Filhos_v1> filhos;
}
