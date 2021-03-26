import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countItemsMatchingRule {
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count =0;
		for(List<String> list : items) {
			String type = list.get(0);
			String color = list.get(1);
			String name = list.get(2);
			
			switch(ruleKey) {
			
			case "type":
				if(type.equals(ruleValue)){
					count++;
				}
				break;
			case "color":
				if(color.equals(ruleValue)) {
					count++;
				}
				break;
			case "name":
				if(name.equals(ruleValue)) {
					count++;
				}
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		List<String> innerList = new ArrayList<>();
		innerList.add("phone");
		innerList.add("blue");
		innerList.add("pixel");
		
		list.add(innerList);
		List<String> innerList1 = new ArrayList<>();
		innerList1.add("computer");
		innerList1.add("silver");
		innerList1.add("lenovo");
		
		list.add(innerList1);
		
		List<String> innerList2 = new ArrayList<>();
		innerList2.add("phone");
		innerList2.add("gold");
		innerList2.add("iphone");
		list.add(innerList2);
		
		String ruleKey = "type";
		String ruleValue = "phone";
		
		System.out.println(countMatches(list,ruleKey, ruleValue));
		
		
		
		
		
		
		
	}

}
