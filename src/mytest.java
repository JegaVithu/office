import java.util.Scanner;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner res = new Scanner(System.in);
	    System.out.print("Please define Result 0 or 1 :");
	    int Result = res.nextInt();  
	    
		String mama = "rothycan";
		String  mami = "fu sip";
		
		char[] arrayMama = mama.toCharArray();
		char[] defineMama = new char[mama.length() + 5];

		char[] arrayMami = mami.toCharArray();
		char[] defineMami = new char[mama.length() + 7];


		for(int x = 0; x < mama.length() + 5; x++)
		{
		Result = x+1;
		if(x== 0)
			defineMama[x] = arrayMama[x+5];
		if(x== 1)
			defineMama[x] = arrayMama[x+2];
		if(x== 2)
			defineMama[x] = arrayMama[x+4];
		if(x== 3)
			defineMama[x] = arrayMama[x+4];
		if(x== 4)
			defineMama[x] = arrayMama[x-2];
		if(x== mama.length()-3)
			defineMama[x] = arrayMama[x-2];
		if(x== 6)
			defineMama[x] = arrayMama[mama.length()-(x+2)];
		if(x== 7)
			defineMama[x] = arrayMama[mama.length()-x];
		if(x== mama.length())
			defineMama[x] = arrayMama[2];
		if(x== mama.length()+1)
			defineMama[x] = arrayMama[3];
		if(x== mama.length()+2)
			defineMama[x] = arrayMama[4];
		if(x== mama.length()+3)
			defineMama[x] = arrayMama[mama.length()- 2];
		if(x== mama.length()+4)
			defineMama[x] = arrayMama[mama.length()- 1];
		}
		
		for(int x = 0; x < mami.length() + 7; x++)
		{
		Result = Result -(x+1);
		if(x== 0)
			defineMami[x] = arrayMami[x];
		if(x== 1)
			defineMami[x] = arrayMama[mama.length()- 2];
		if(x== 2)
			defineMami[x] = arrayMami[x+1];
		if(x== 3)
			defineMami[x] = arrayMama[x+2];
		if(x== 4)
			defineMami[x] = arrayMami[x];
		if(x== mami.length()-1)
			defineMami[x] = arrayMama[mama.length()- 1];
		if(x== 6)
			defineMami[x] = arrayMama[1];
		if(x== 7)
			defineMami[x] = arrayMami[2];
		if(x== mama.length())
			defineMami[x] = arrayMami[5];
		if(x== mama.length()+1)
			defineMami[x] = arrayMama[1];
		if(x== mama.length()+2)
			defineMami[x] = arrayMama[mama.length()- 1];
		if(x== mama.length()+3)
			defineMami[x] = arrayMama[mama.length()- 1];
		if(x== mama.length()+4)
			defineMami[x] = arrayMami[1];
		if(Result == -78)
			Result = Result +(mama.length()*9) + mami.length();
		}

		String Smama = String.copyValueOf(defineMama);
		String Smami = String.copyValueOf(defineMami);
	
		String caption = "output The logical of";
		String[] Scaption = caption.split(" ");

		System.out.print(Scaption[1]+" "+Scaption[2]+" "+Scaption[0]+" "+Scaption[3]+" "+Smami+" "+"lov"+"ing "+Smama+" :");
      
		if(Result == 1)
			System.out.print("This will happen");
		if(Result == 0)
			System.out.print("vaippilla raja vaippilla");
		
	}

}
