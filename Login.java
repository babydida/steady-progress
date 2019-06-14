public class Login{
	void scream(){
		System.out.println("what is your username")
	}
}

class Myclass{
	public static void main(String [] args){
		Login cow = new login();
		Login dog = new Login();
		dog.scream();
		cow.scream();
	}
}