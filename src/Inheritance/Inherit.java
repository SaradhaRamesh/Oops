package Inheritance;
class Simple{
	private int pri;
	int def;
	protected int pro;
	public int pub;
	Simple(){
		pri=10;
		def=20;
		pro=30;
		pub=40;
	}
}

public class Inherit extends Simple {
	Inherit(){
		//pri=100;--------->can't access private
		def=200;
		pro=300;
		pub=400;

	}
	public static void main(String[] args) {
		Inherit i = new Inherit();
		//System.out.println(i.pri);------->can't access private
		System.out.println(i.def);
		System.out.println(i.pro);
		System.out.println(i.pub);

	}

}
