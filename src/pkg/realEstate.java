package pkg;

public class realEstate {
	
	
	public static void main (String[] args)
	{
		int count = 1;
		Address a1 = new Address(23,"MapleStreet","Brooklyn");
		Address a2 = new Address(5,"Joye Raod","Newton");
		Address a3 = new Address(83,"Winslow Road","Waltham");
		House h1 = new House("Ranch",7,375000, a1);
		System.out.println(count++ +". " + h1.HousetoString());
		House h2 = new House("Colonial",9, 45000,a2);
		System.out.println(count++ +". " +h2.HousetoString());
		House h3 = new House("Cape",6, 235000, a3);
		System.out.println(count++ + ". " +h3.HousetoString());
		
	}

}
