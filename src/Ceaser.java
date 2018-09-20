
public class Ceaser {
int[] numbers= {1,2,3,4};           //select the numbers according to which you want the text to be encrypted
	
	public void encode(String message) {
		String secret="";                                                       //the encrypted text goes here
		for(int i=0;i<message.length();i++) {                                   //each character in the original
			secret=secret+(char)(message.charAt(i)+(numbers[i%numbers.length]));//message will be shifted according   
		}                                                                       //to the numbers you've entered
		System.out.println(secret);                                             //and added to the empty secret String
	}
	
	public void decode(String secret) {
		String message="";                                                       //the decrypted text goes here
		for(int i=0;i<secret.length();i++) {                                     //each character in the encrypted
			message=message+(char)(secret.charAt(i)-(numbers[i%numbers.length]));//message is shifted back according
		}                                                                        //to the numbers entered
		System.out.println(message);
	}
}
