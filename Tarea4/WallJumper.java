package gt.edu.usac.ipc1a;
import gt.edu.usac.ipc1a.Circle;

import java.awt.Color;
import java.awt.Graphics;

public class WallJumper extends Circle{
			Color color;
			public WallJumper(){
				
				size = 150;
				color = Color.ORANGE;
			}

			@Override
			public void DetectarPared()
			{
				if(positionX+size > 800)
					{
						CambiarColor();
						System.out.println("Se detecto Pared");
					}
				if(positionX+size < 0)//
				{
					CambiarColor();
					System.out.println("Se detecto Pared");
				}
			
					
			} 
			public void CambiarColor()
			{
				color = Color.RED;
			}
			

			public void Saltar(){
				velocityX = 5f;
			}
			public void  Rebote(){
				velocityX += gravity;
			}
			
			class Rebote extends Circle{
			
			public Rebote(){
				if(positionX+size > 800);
				System.out.println("Detectar pared");

			}

			@Override
		 	public void Draw (Graphics g){		 
				 g.setColor(color);
				 g.fillOval(positionX,positionY,size,size);
			}

			}
}
	


