package Generic_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_first_repeated_and_last_unique_value {

	public static void main(String[] args) {
		
		
		Integer nos[]= {2,3,4,5,6,7,9,8,12,11,2,3,4,5};
	
		
		   List<Integer> li = Arrays.asList(nos);        
	        Set<Integer> s = new HashSet<Integer>(li);
	        Integer f = null,l = null;
	        for(int i=0;i<li.size();i++){
	            int t=li.get(i);
	            
	            if(s.contains(t)){
	                s.remove(t);
	                l=t;
	            }
	            else{
	                if(f==null)
	                f=t;
	                else continue;        // if i gave break then the loop coundn't continue so added a if else 
	                
	            }
	        }
	        if(f!=null)
	        System.out.println("first : "+f + " last : "+ l);
//		List<Integer>  list=new ArrayList<>();
//		list.addAll(Arrays.asList(nos));
//		
//		List<Integer> r=new ArrayList<>();
//		
//		
//		for(int i=0;i<list.size();i++) {
//			int count=0;
//			for(int j=i+1;j<list.size();j++) {
//				if(list.get(i)==list.get(j)) {
//					count++;
//				}
//			}
//			if(count>0) {
//				r.add(list.get(i));
//				
//			}
//		}
//		list.removeAll(r);
//		System.out.println(list.get(list.size()-1));
//		System.out.println(r.get(0));
//		int firrepno=0;
//		int lastuniqueno=0;
//		for(int i=0;i<nos.length;i++) {
//			int count=0;
//			for(int j=0;j<nos.length;j++) {
//				if(nos[i]==nos[j]) {
//					count++;
//				}
//			}
//			if(count>1) {
//				firrepno=nos[i];
//				break;
//			}
//		}
//		
//		for(int i=nos.length-1;i>=0;i--) {
//			int count=0;
//			for(int j=nos.length-1;j>=0;j--) {
//				if(nos[i]==nos[j]) {
//					count++;
//				}
//			}
//			if(count==1) {
//				lastuniqueno=nos[i];
//				break;
//			}
//		}
//		
//		System.out.println(firrepno);
//		System.out.println(lastuniqueno);
//		
		
		
		
		//List<Integer> list=Arrays.asList(nos);
//		int repeated[]=new int [nos.length];
//		int unique[]= new int [nos.length];
//		List<Integer> repeated=new ArrayList<>();
//		List<Integer> unique=new ArrayList<>();
//		//output:2,9
//		
//		Map<Integer,Integer> count=new HashMap<>();
//		for(int i=0;i<list.size();i++) {
//			count.put(list.get(i),count.getOrDefault(list.get(i), 0)+1);
//		}
//		
//		for(Map.Entry<Integer,Integer> entry: count.entrySet()) {
//			if(entry.getValue()>1) {
//				repeated.add(entry.getKey());
//			}else {
//				unique.add(entry.getKey());
//			}
//		}
//		
//	     System.out.println(count);
//		
//		System.out.println("Repeated nos are: " +repeated);
//		System.out.println("Unique nos are : "+ unique);
//		System.out.println("First repeated value is: "+repeated.get(0));
//		System.out.println("Last unique value is : "+ unique.get(unique.size()-1));
	}

}
