package juego;

import java.util.Random;
import java.awt.Color;

import entorno.Entorno;

public class Dron {
	private int posX;
	private int posY;
        private int ancho;
	private boolean roto;
        
	Dron()
        {
               Random r= new Random();
               this.posX=300;
               this.posY =r.nextInt(600);
               this.ancho = r.nextInt(150);
               this.roto = false;
	}
        public int getAncho()
        {
         return this.ancho;   
        }

	public void dibujar(Entorno entorno, int Nancho)
	{       
		entorno.dibujarRectangulo(this.posX+Nancho, this.posY, this.ancho, 20, 0, Color.red);
	}
        public void mover(int x)
        {
         if(this.posY<0)
                {
                  this.posY=0;
                }
         else if(this.posY>600)
                {
                    this.posY=600;
                }
                this.posY=this.posY+x;           }
}
