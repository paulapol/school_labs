package g30126.pol.paula.l4.e4;

public class Author {
	 String name;
	 String email;
	 char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	 public String getName(){
		 return name;
	 }
	 public String getEmail(){
		 return email;
	 }
	 public void setEmail(String email){
		 this.email=email;
	 }
	 public void setGender(char gender){
		 this.gender=gender;
	 }
	 public char getGender(){
		 return gender;
	 }
	 public String ToString(){
		StringBuffer message = new StringBuffer();
		message.append("Author-").append(getName()).append("(").append(getGender()).append(")").append("at email:").append(getEmail());
		return message.toString();
	}
}