package nationwide.offclass;

public class twice {

	String newmessage="";
	public int findletter(String a){
		String word2="";
		
		int i=0;
		while (i<newmessage.length()){
			if (newmessage.substring(i,i+1).equals(a.substring(i))){
				if (word2.equals(a.substring(i))){
					return 1;
				}
				word2="";
			}
			else {
				word2=word2+newmessage.substring(i,i+1);
			}
			i++;
	}
	return 0;
	}
	public void removeduplicate(String msg){
		String word="";
		
		int i=0;
		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(msg.substring(i))){
				if (findletter(word)==0){
					newmessage+=(word);
				}
				word="";

			}
			else {
				word=word+msg.substring(i,i+1);
			}
			i++;
	}
	System.out.println(newmessage);
	}
}


