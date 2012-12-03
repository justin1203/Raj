
public class Swear {

	int swearIndex = 0;
	String[] swear;

	public Swear() {}

	public boolean findSwear(int swearIndex, int swearCount) {
		if (swearIndex >= 0){
			if (swearCount == 1){
				System.out.println("Could you please refrain from using offensive language?");
			}
			else if (swearCount == 2){
				System.out.println("Sorry, but I’m going to have to disconnect this call if you keep using inappropriate language.");
			}
			else if (swearCount > 2){
				System.out.println("Goodbye [Call Disconnected]");
				return true;
			}
		}
		return false;
	}
}