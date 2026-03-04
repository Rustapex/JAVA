public class Test1{
	public static void main(String[] args){
	
		//1 2 3 4 5 6 7   8 	=> 항의 순번
		//1 1 2 3 5 8 13 21 	=> 항

		// 자료 명세
		int prev = 1, curr = 1;
		long next;
	
		System.out.println(prev);
		System.out.println(curr);

		for(int i=3; i<50; i++) {
			next = prev + curr;
			System.out.println(next);
			prev = curr;
			curr = next;
		
	
		}
	}
}