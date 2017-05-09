import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {
	class Node{
		Map<Character, Node> nodes;
		Node(){
			nodes = new LinkedHashMap<Character, Node>();
		}
	}
	
    public String alienOrder(String[] words) {
    	Node root = new Node();
    	for(String word : words){
    	   Node node = root;
		   for(int i = 0; i < word.length(); i++){
			   char c = word.charAt(i);
			   if(!node.nodes.containsKey(c)){
				   node.nodes.put(c, new Node());
			   	   //System.out.print(c + " | ");
			   }
			   node = node.nodes.get(c);
		   }		 
		   //System.out.println();
    	}
    	//System.out.println();
    	Queue<Node> bfs = new LinkedList<Node>();
    	bfs.add(root);
    	LinkedList<Queue<Character>> res = new LinkedList<Queue<Character>>();
    	while(!bfs.isEmpty()){
    		Node node = bfs.poll();
    		Map<Character, Node> child = node.nodes;
    		if(child != null && child.size() > 1){
    			Queue<Character> q = new LinkedList<Character>();
    			for(Map.Entry<Character, Node> curNode: child.entrySet()){
    				//System.out.print(curNode.getKey()+" ");
    				q.add(curNode.getKey());    				
        		}
    			res.add(q);
    		}
    		
    		if(child != null){
    			for(Map.Entry<Character, Node> curNode: child.entrySet()){
    				bfs.add(curNode.getValue());    				
        		}
    		}
    	}
    	String result = "";
    	Queue<Character> list = res.poll();
    	if(list != null){
    		for(char c : list){
        		result += c;
        	}
    	}
    	while(!res.isEmpty()){
    		for(int i = 0; i<res.size(); i++){
        		if(res.get(i).peek() == result.charAt(result.length()-1)){
        			LinkedList<Character> queue = (LinkedList)res.get(i);
        	    	for(int j = 1; j < queue.size(); j++){
        	    		if(result.indexOf(queue.get(j)+"") > -1)
        	    			return "";
        	    		else
        	    			result += queue.get(j);
        	    	}
        	    	res.remove(i);
        	    	break;
        		}
        	}
    	}
    	System.out.print(result);
    	
    	
//    	while(i < res.size()){
//    		Queue<Character> list = res.poll();
//    		if(i == 0){
//    			String
//    		}
//    	}
//    	for(Queue<Character> list : res){
//    		System.out.println();
//    		while(!list.isEmpty()){
//    			System.out.print(list.poll() + " ");
//    		}
//    	}
    	
    	return "";
    	
    }
    
//    public void bfs(List<Node> nodes, List<List<Character>> res){
//    	ArrayList
//    	for(Node node : nodes){
//    		Map<Character, Node> child = node.nodes;
//    		if(child != null && child.size() > 1){
//    			List<Character> list = new ArrayList<Character>();
//    			for(Map.Entry<Character, Node> curNode: child.entrySet()){
//    				list.add(curNode.getKey());    				
//        		}
//    		}else if(child != null){
//    			
//    		}
//    	}
//    }
}
