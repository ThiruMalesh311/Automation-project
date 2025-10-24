package basics;

import java.time.LocalDateTime;

public class LearnTimeStamp {
   //use for myActitimeProject for record screenshot time
	public static void main(String[] args) {
       String timeStamp=LocalDateTime.now().toString().replace(':', '-');
       System.out.println(timeStamp);
	}

}
