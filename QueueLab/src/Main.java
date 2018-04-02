
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static class Pair{
		int number, moves;
		public Pair(int a, int b){
			number = a;
			moves = b;
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		Set<Integer> used = new TreeSet<>();
		Queue<Pair> result = new LinkedList<>();
		result.add(new Pair(a, 0));
		while(!result.isEmpty()){
			Pair current = result.poll();
			if (current.number == b){
				System.out.println(current.moves);
				break;
			}
			if(!used.contains(current.number + 1) ){
				used.add(current.number + 1);
				result.add(new Pair(current.number + 1, current.moves + 1));
			}
				
			if(!used.contains(current.number - 1)){
				used.add(current.number - 1);
				result.add(new Pair(current.number - 1, current.moves + 1));
			}
			if(!used.contains(current.number * 3)){
				used.add(current.number * 3);
				result.add(new Pair(current.number * 3, current.moves + 1));
			}
			if(!used.contains(current.number / 3)){
				used.add(current.number / 3 );
				result.add(new Pair(current.number / 3, current.moves + 1));
			}
			
		}
		
		input.close();

	}

}
