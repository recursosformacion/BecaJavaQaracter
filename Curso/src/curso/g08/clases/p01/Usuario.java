package curso.g08.clases.p01;

public class Usuario extends Persona
	implements Salvable {
	private String codigo;
	private String contrasenya;
	private Object rol;
	
	
	public Object getRol() {
		return rol;
	}
	public void setRol(Object rol) {
		this.rol = rol;
	}
	Usuario(String codigo, String nombre,String contrasenya){
		super(nombre);
		setCodigo(codigo);
		setcontrasenya(contrasenya);
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getcontrasenya() {
		return contrasenya;
	}
	public void setcontrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	@Override
	public String aString() {
		// TODO Auto-generated method stub
		return "Usuario:" + getCodigo() + "-->" + getNombre();
	}
	private int pruebaPrivado(){
		return 23;
	}
	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("Usuario salvado");
		
	}
	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Usuario leido");
		
	}
}
