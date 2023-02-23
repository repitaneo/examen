package start;


import gimnasio.Gimnasio;
import pokemonGo.Charmander;
import pokemonGo.Pikachu;
import pokemonGo.Pokemon;
import pokemonGo.Squirtle;
import robots.Robot;

public class Start {

	public static void main(String[] args) {

		System.out.println(Pokemon.POKEMON_ELECTRICO);
		
		
		Pikachu pika = new Pikachu("Pika");
		if(pika.getTipo()==Pokemon.POKEMON_ELECTRICO) {
			
			System.out.println("electricos!!!!");
		}
		
		
//		Robot doraemon = new Robot();  
//		
//		Gimnasio goFit = new Gimnasio();
//		goFit.batalla(pika, doraemon);
//		
//		
//		
//		
//		
//
//		Pokemon[] miColeccion = new Pokemon[3];
//		miColeccion[0] = new Pikachu("Pika");
//		miColeccion[1] = new Charmander("Char");
//		miColeccion[2] = new Squirtle("Quir");
//
//		
//		for(Pokemon pokemon: miColeccion) {
//			
//			// nombre del pokemon
//			System.out.println(pokemon.getNombre());
//			// tipo del pokemon
//			
//			switch(pokemon.getTipo()) {
//			
//				case Pokemon.POKEMON_ELECTRICO: System.out.println("electrico"); break;
//				case Pokemon.POKEMON_FUEGO: System.out.println("fuego"); break;
//				case Pokemon.POKEMON_AGUA: System.out.println("agua"); break;
//			}
//		}
//		
	}

}
