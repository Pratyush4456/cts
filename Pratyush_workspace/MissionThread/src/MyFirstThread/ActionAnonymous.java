package MyFirstThread;

public interface ActionAnonymous {
void action();
}
class Anonymous{
	public static void main(String args[]) {
		ActionAnonymous a1 = new ActionAnonymous() {
			public void action() {System.out.println("Action Kamen");}
			
		};
		a1.action();
	}
}
