package gt.edu.usac.ipc1a;
import java.awt.Color;
import java.awt.Graphics;
public class Circle {
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float jumpImpulse;
	public float gravity;

public void Update()
	{
		ActualizarPosicion();
		DetectarPared();
	}
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;

}
	public void DetectarPared()
	{
		if(positionX+size > 800)
			System.out.println("Detecte Pared");
	}
	

	public void Draw (Graphics g){
}
	public void AplicarGravedad()
	{
		velocityX += gravity;
	}
}