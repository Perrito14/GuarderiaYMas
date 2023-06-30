package dominio;

public class Ahorcado {
	JugadorAhorcado[] jugadores = new JugadorAhorcado[2];
//	JugadorAhorcado jugador1 = new JugadorAhorcado();
//	JugadorAhorcado jugador2 = new JugadorAhorcado();
//	jugadores[0] = jugador1;
//	jugadores[1] = jugador2;

	public String quienEmpieza() {
		String jugadorQueComienza = "";
		int nAleatorio = (int)(Math.random() * 2) + 1;
		if(nAleatorio == 1) {
			jugadorQueComienza = jugadores[0].getNombre();
		} else if(nAleatorio == 2) {
			jugadorQueComienza = jugadores[1].getNombre();
		}
		return jugadorQueComienza;
	}
	
	public String ingresarLetra(char letra) {
		for (int i = 0; i < this.palabra; i++) {
			
		}
	}
	
	//ii. Se ofrece las siguientes opciones:
		//1. Ingresar letra
		//2. Arriesgar
		//3. Al elegir ingresar una letra:
		// Si la letra existe se muestra por pantalla las posiciones
		//donde la letra aparece (para las posiciones donde aún no
		//se adivinó la letra se debe mostrar ‘_’.
		
		// Si la letra no existe, el jugador pierde una vida (tiene 6
		//chances).
	
//	public String mostrarAyuda() {
//		if()
//	}
	
	//6. Desarrolla el juego “El Ahorcado”. El mismo debe contar con las siguientes características:
	//a. Inicio del juego:
	//i. Se debe poder ingresar el nombre del jugador 1 y el nombre del jugador 2.
	//ii. Se solicita que el jugador 1 ingrese la palabra que se debe adivinar (el
	//jugador 2 no debe mirar la pantalla).
	//iii. Se solicita que el jugador 2 ingrese la palabra que se debe adivinar (el
	//jugador 1 no debe mirar la pantalla).
	//iv. Se elige aleatoriamente quien inicia la partida.
	//b. Por cada turno:
	//i. Se muestra a modo de ayuda la dimensión de la palabra ingresada por el
	//adversario de la forma “_ _ _ _ _ _ _ _”.
	
	//4. Al elegir arriesgar:
	// El jugador que eligió dicha opción ingresa la palabra que
	//cree conocer.
	// Si acierta, el adversario tiene una oportunidad mas para
	//arriesgar. Si también acierta el resultado es un empate.
	//Caso contrario gana el primero.
	// Si no acierta, el ganador es el adversario.
}
