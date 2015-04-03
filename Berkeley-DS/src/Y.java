import java.util.Arrays;


public class Y extends X{
	static Object y=5;
	protected static Object[]ya =new Object[3];
	public static void main(String args[]){
		ya=xa;
		System.out.println(Arrays.toString(xa));
		System.out.println(Arrays.toString(ya));
		xa=ya;
		System.out.println(Arrays.toString(xa));
		x=y;
		//This was as given in notes
		/*X objx;
		Y objy=new Y();
		objx=objy;
		objy=objx;
		X objs=new 	X();
		objy=(Y)objs;*/
		// THe below one was as given in lab5
		X objx[];
		Y objy[]=new Y[2];
		objx=objy;
		//objy=objx;
		X objs[]=new X[2];
		objy=(Y[])objs;
	}

}
