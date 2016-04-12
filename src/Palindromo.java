
public class Palindromo {

	
	public boolean isPali(String m){
		String n = m.toLowerCase();
		for(int i = 0 ; i < m.length(); i ++){
		if(n.charAt(i) != n.charAt(n.length()- i -1) ){
			return false;
			}
		}
		return true;
	}
}
