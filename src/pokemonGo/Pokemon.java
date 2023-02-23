package pokemonGo;

import peleador.Peleador;

public abstract class Pokemon implements Peleador {

	public static final int POKEMON_ELECTRICO = -4345354;
	public static final int POKEMON_FUEGO = 204560;
	public static final int POKEMON_AGUA = 3045640;

	
	protected String nombre;
	
	
	public String getNombre() {
		return nombre;
	}


	public Pokemon(String nombre) {
		
		this.nombre = nombre;
	}
	
	
	public abstract int getTipo();

	
}
