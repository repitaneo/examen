package pokemonGo;

public class Squirtle extends Pokemon 		
		implements Evolucionador {


	private int segundosBajoAgua;
	
	public Squirtle(String nombre) {
		super(nombre);
		segundosBajoAgua = 100;
		
	}

	@Override
	public int getTipo() {
		
		return Pokemon.POKEMON_AGUA;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int defensa() {
		// TODO Auto-generated method stub
		return 30;
	}

	
	public Pokemons evolucion() {
		
		return Evolucionador.Pokemons.WARTORTLE;
	}

}
