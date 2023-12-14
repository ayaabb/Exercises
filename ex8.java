//HashTable:

class MyHashTable {
    public List<List<Integer>> map = new ArrayList<>(10);
  
    public MyHashTable() {
          for (int i = 0; i < 10; i++) {
    List<Integer> innerList = new ArrayList<>();
    map.add(innerList);
     }

    }
    
    public void insert(int key) {
        map.get(key%10).add(key);
    }
    
    public int search(int key) {
         List<Integer>l= map.get(key%10);
		 for(int i=0;i<l.size();i++)
			if(l.get(i)==key)
				return i;
		 return -1;
    }
    
    public void delete(int key) {
		int i=search(key);
		if(i!=-1)
		   map.get(key%10).remove(i);
 
    }
}
