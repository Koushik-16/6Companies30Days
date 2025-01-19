package Google;

public class DesignAddSearchStructure {
    class Node {
		Node [] links = new Node[26];
		boolean flag = false;
		
		public Node () {
			
		}
		boolean containsKey(char ch) {
			return (links[ch - 'a'] != null);
		}
		Node get(char ch) {
			return links[ch - 'a'];
		}
		void put(char ch , Node node) {
			links[ch - 'a'] = node;
		}
		void setEnd() {
			flag = true;
		}
		boolean isEnd() {
			return flag;
		}				      
	}

     class Trie {
		
		  Node root;
		
	   Trie(){
		   root = new Node();
	   }
	   
	  public  void insert(String word) {
		   Node node = root;
		   for(int i = 0 ; i < word.length() ; i++) {
			   if(!node.containsKey(word.charAt(i))) {
				   node.put(word.charAt(i), new Node());
			   }
			  node = node.get(word.charAt(i));
		   }
		   node.setEnd();
	   }
	   
	 public   boolean search(String word , Node curr , int ind) {
         int n = word.length();
         if(curr == null) return false;
         if(ind == n) return curr.isEnd();
		   if(word.charAt(ind) == '.') {
               for(int i = 0 ; i < 26 ; i++) {
                   if(search(word , curr.get((char)(i + 'a')) , ind + 1)) return true;
               }
           }else {
               return search(word , curr.get(word.charAt(ind)) ,ind + 1);
           }
           return false;
		  
	   }


       public boolean check(String s) {
           Node node = root;
           return search(s , root, 0);
       }

    }


class WordDictionary {

    Trie t ;

    public WordDictionary() {
        t = new Trie();
    }
    
    public void addWord(String word) {
        t.insert(word);
    }
    
    public boolean search(String word) {
        return t.check(word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
