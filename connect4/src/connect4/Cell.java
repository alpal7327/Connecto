package connect4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public abstract class Cell implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public Cell()
	{
		this(5,5,5,5);
	}

	public Cell(int x, int y)
	{
		this(x,y,5,5);
	}

	public Cell(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}

	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setX( int x )
	{
		xPos = x;
	}
	
	public void setY( int y )
	{
		yPos = y;
	}

	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}	

	public int getWidth()
	{
		return width;
	}	
	
	public int getHeight()
	{
		return height;
	}
	
	public abstract void draw(Graphics window);
	
	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}