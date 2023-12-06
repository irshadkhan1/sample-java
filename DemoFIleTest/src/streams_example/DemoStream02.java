package streams_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class DemoStream02 {

	public static void main(String[] args) {
	
		List<Integer> l = Arrays.asList(1,2,5,8,3,6,7,4,9);
	 
	
			l.stream().filter(e->e % 2 ==0)
			.sorted()
	 // .map(e->e*2)
	//  .mapToInt(Integer::intValue)
	  .forEach(System.out::println);
			
		 
		//=========================================== 
		//	IntSummaryStatistics is=
		//			l.stream().filter(e->e % 2 ==0)
		//	  .map(e->e*2)
		//	  .mapToInt(Integer::intValue)
		//	  .summaryStatistics();
		//	 System.out.println(is);
	//	===============================
	//		Integer sum=  
				
   //		l.stream().filter(e->e % 2 ==0)
	//	  .map(e->e*2)
	//	  .mapToInt(Integer::intValue)
	//	  .sum();
	//	 System.out.println(sum);
			
		 
	}

}
