package Week6.day2;

import org.testng.annotations.Test;

public class Learngroups {
	@Test(groups="Insane")
public void run() {
	System.out.println("The Dog is chashing");
}
	@Test(groups="Helpless",dependsOnGroups ="Insane")
public void stop() {
	System.out.println("Looking for help");
}
	@Test(groups="Insane")
public void dog() {
	System.out.println("Insane State");
}
}
