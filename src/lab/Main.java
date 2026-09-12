package lab;

public class Main {

	public static void main(String[] args) {
		Hillcipher c1 = new Hillcipher ();
	    int [] plaintext ;  
	    int [] ciphertext ;  

		c1.keymanage("hill", c1.substuiotion);
		plaintext= c1.dataproceessing("ahmedBarbarawi", c1.substuiotion);	
	c1.hillEncrypt(c1.keymanage("hill", c1.substuiotion), plaintext);
		ciphertext= c1.dataproceessing("ezmkdjgfhipgke", c1.substuiotion);	
		c1.hilldecrypt(c1.keymanage("hill", c1.substuiotion), ciphertext);
		
//		Kasiski k = new Kasiski ();
//		k.DataProcessing_file();
//       k.Strings_freq_add(Kasiski.ciphertext);
//		k.find_key_gcd();
//		
	}

}
