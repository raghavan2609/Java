package works;

import java.util.ArrayList;
import java.util.List;

public class ChunkAList {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
			for(int i=1;i<2;i++){
				a.add(String.valueOf(i));
			}
			Integer partitionSize = 999;
			
			List<List<String>> partitions = new ArrayList<List<String>>();
			for (int i = 0; i < a.size(); i += partitionSize) {
			    partitions.add(a.subList(i,
			            Math.min(i + partitionSize, a.size())));
			}
			System.out.println(partitions);
			
			
			
	}
}
