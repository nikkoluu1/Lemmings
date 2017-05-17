package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Lemming lemming;
        private Dron dron[];
        private int x;
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Lemmings - Grupo 1 - Huelmo -Apellido3 - V0.01", 800, 600);
		this.lemming = new Lemming();
                this.dron = new Dron[3];
                x = 0;
                // Inicializar lo que haga falta para el juego
		

		// Inicia el juego!
		this.entorno.iniciar();
		for(int i=0;i<dron.length;i++)
                {
                    this.dron[i]=new Dron();
                }
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
                entorno.dibujarRectangulo(0, 500, 300, 20, 0, Color.yellow);
                entorno.dibujarRectangulo(0, 350, 300, 20, 0, Color.yellow);
                entorno.dibujarRectangulo(0, 200, 300, 20, 0, Color.yellow);

                lemming.dibujar(entorno);
                dron[0].dibujar(entorno,0);
                for(int i = 1;i<this.dron.length;i++){
                    dron[i].dibujar(entorno,dron[i].getAncho());
                }
                if(entorno.sePresiono(entorno.TECLA_DERECHA)){
                    if(this.x==2)
                        this.x=0;
                    else
                        this.x++;
                }
                if(entorno.sePresiono(entorno.TECLA_IZQUIERDA)){
                    if(x==0)
                        this.x=2;
                    else
                        this.x--;
                }
                if(entorno.estaPresionada(entorno.TECLA_ARRIBA)){
                   dron[x].mover(-2);
                }
                if(entorno.estaPresionada(entorno.TECLA_ABAJO)){
                   dron[x].mover(2);
                }
		lemming.mover();
		
		

	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
