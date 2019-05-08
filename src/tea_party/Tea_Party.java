package tea_party;

public class Tea_Party {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	private String greeting;
	
	Tea_Party(){
	}
	
	
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {

		
		if(isWoman == true) {
			 isWoman = true;
			 if(isKnighted == true) {
		 greeting = "Hello Lady " + name ;
			}
			else {
			 greeting = "Hello Ms. " + name ;
			}
		}
		else {
			 isWoman = false;
			 if(isKnighted == true) {
				 greeting = "Hello Sir " + name ;
			}
			else {
				greeting = "Hello Mr. " + name ;
			}
		}
	return greeting;
		
    }
	
}
