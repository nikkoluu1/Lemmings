package juego;

import java.awt.Color;

import entorno.Entorno;

public class Lemming {
        private int direccion;
	private double posX;
	private double posY;
	private boolean vivo;
	Lemming()
	{
		this.posX=10;
		this.posY=300;
		this.vivo=true;
                this.direccion=1;
	}
	public void dibujar(Entorno entorno)
	{
		entorno.dibujarRectangulo(posX, posY, 45, 80, 0, Color.blue);
	}
	public void mover()
	{
                if(this.posX==780)
                {
                  this.direccion=this.direccion=0;
                }
                this.posX=this.posX+this.direccion;         
	}

}
