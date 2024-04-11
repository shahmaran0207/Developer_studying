package Service;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	public int total(int n) {
		int sum=0;
		
		for (int i=0; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public Set<Integer> lotto() {
		TreeSet<Integer> list = new TreeSet<Integer>();
		
		Random ran=new Random();
		while(list.size() != 6) {
			list.add(ran.nextInt(45)+1);
		}
		
		return list;
	}
}