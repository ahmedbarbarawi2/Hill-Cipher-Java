package lab;

public class Hillcipher {
static int [] substuiotion = new int [26];  
	
public int [] [] keymanage (String key , int []substuiotion){
	int [][] Key = new int [2][2];
	int [] key_num = new int [4];
	
	for (int i = 0; i<26;i++) {
		substuiotion [i]=i;
	}
	
	
	for (int i=0;i<key.length();i++) {
		char c = key.charAt(i);
		for (int k = 0; k<26;k++) {
		if (substuiotion[k]==(int )(c-'a')) {
			
			key_num[i]=(int )(c-'a');
			
			}
			
			
		}
	}
	
	for (int i =0 ; i<2 ; i++) {
		for (int k =0 ; k<2 ; k++) {
			Key[i][k] = key_num[i+k];
		System.out.println(key_num[i+k]);
		}
	}
	return Key;
	
}
	
	public int [] dataproceessing (String data,int []substuiotion) {
		data=data.toLowerCase();
       if(data.length()%2!=0) {
  			data+='x';
		}
		int [] DATA = new int [data.length()];
		for (int i=0;i<data.length();i++) {
			char c = data.charAt(i);
			for (int k = 0; k<26;k++) {
			if (substuiotion[k]==(int )(c-'a')) {
				DATA[i]=(int )(c-'a');
				System.out.println(DATA[i]);
				}		
		}	
	}
		
		return DATA;
	}
	
	
	public String hillEncrypt (int [][] key , int [] plaintext) {
		char [] ciphertext = new char [plaintext.length];
		int [] []diagram = new int [2][1];
		int [] []cipher_diagram = new int [2][1];
		StringBuilder s = new StringBuilder ();
		for (int i =0; i<plaintext.length;i+=2) {			
			diagram [0] [0] = plaintext[i];
		    diagram [1] [0]	= plaintext [i+1];
			
		    cipher_diagram[0][0] = ((key[0][0]*diagram[0][0]) + (key[0][1]*diagram[1][0]))%26;
		    cipher_diagram[1][0] = ((key[1][0]*diagram[0][0]) + (key[1][1]*diagram[1][0]))%26;
		    		
		    ciphertext[i] =  (char) (cipher_diagram[0][0]+97);
		    ciphertext[i+1] =   (char) (cipher_diagram[1][0]+97);
		    s.append(ciphertext[i]);
            s.append(ciphertext[i+1]);
		    System.out.print(ciphertext[i]);
		    System.out.print(ciphertext[i+1]);

		}	
		return s.toString();
	}
	
	public static int postive_det(int det) {
		for(int i=0;i<26;i++) {
			if (det<0)
				det+=26;
			else
				return det;
		}
		
		return 0;
	}
	
	
	public String hilldecrypt (int [][] key , int [] cipher) {
		char [] plaintext = new char [cipher.length];
		int [] []diagram = new int [2][1];
		int [] []plain_diagram = new int [2][1];
		StringBuilder s = new StringBuilder ();
		
		
		
		int det = (key [0][0]*key[1][1])-(key[0][1]*key[1][0]);
		if (gcd(det,26)!=1) {
			System.out.println("The key invalid");
          return "The key invalid";            }
		
		key=inverse_key(key);
		for (int i =0; i<cipher.length;i+=2) {			
			diagram [0] [0] = cipher[i];
		    diagram [1] [0]	= cipher [i+1];
			
		    plain_diagram[0][0] = ((key[0][0]*diagram[0][0]) + (key[0][1]*diagram[1][0]))%26;
		    plain_diagram[1][0] = ((key[1][0]*diagram[0][0]) + (key[1][1]*diagram[1][0]))%26;
		    		
		    plaintext[i] =  (char) (plain_diagram[0][0]+97);
		    plaintext[i+1] =   (char) (plain_diagram[1][0]+97);
		
		    s.append(plaintext[i]);
            s.append(plaintext[i+1]);
		    System.out.print(plaintext[i]);
		    System.out.print(plaintext[i+1]);

		}	
		return s.toString();
	}
	
	

	public static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}
	
	
	
	public static int [] [] inverse_key( int[][] key) {
		int[][] inverse = new int[2][2];
	    int det = (key[0][0] * key[1][1] - key[0][1] * key[1][0]) ;
	    det= postive_det(det);
	    int inverse_det = inverse_claculator(det);
	    int value_one =0;
	    int value_two =0;
	    value_one = (key[1][1] * inverse_det) % 26;
	    value_two = (key[0][0] * inverse_det) % 26;
	      
	      
	      
	      
	    inverse[0][0] =value_one;
	    inverse[1][1]=value_two;
	   
	    inverse[0][1] = (my_mod(-key[0][1],inverse_det) * inverse_det ) % 26;
	    inverse[1][0] = (my_mod(-key[1][0],inverse_det)  * inverse_det ) % 26;
		return inverse;
		
	}
	
	
	
	
	
	
	
	
	
	public static int inverse_claculator(int det) {
	    for (int i = 1; i < 26; i++) {
	        if ((det * i) % 26 == 1) {
	            return i;
	        }
	    }
	    
	    return 0;
	}
	
	
	
	
	
	
	
	
	
public static int my_mod (int x ,int det) {
		
		for (int i =0 ;i<26;i++) {
	    	if ((x*det)%26<0) {
	    		x+=26;
	    	}else {
		    	return x;
	    	}
	    }
		return 0;
		
		
	}
	
	

	
	
	
}
