package mavenjp;

import org.joda.time.LocalTime;

public class MavenJP {

    public static void main(String[] args) {
        Hello hello = new Hello();
        World world = new World();
        System.out.println(hello.Hello() + " " + world.World());
        LocalTime currentTime = new LocalTime();
	System.out.println("A hora local é: " + currentTime);
    }
    
}
