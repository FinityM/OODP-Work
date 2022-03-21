import java.io.*;
/*
* Screen adapter class that wraps the functionality of screen class
* This helps with very large client programs when a property type
* is difficult to change due to just how large the program is
* */

public class ScreenAdapter extends Screen{

	public void writeInt(int i)	{
		super.writeInt(new String(Integer.toString(i)));
	}
}
