class DinnerPlates {
    
    List<Stack<Integer>> stack;
    int l =0;
    int cap;
    
  

    public DinnerPlates(int capacity) {
        stack = new ArrayList<>();
        cap = capacity;
       
        
    }
    
    public void push(int val) {
        
        if(stack.size() == l) stack.add(new Stack<>());
        stack.get(l).push(val);
        while(stack.size() > l && stack.get(l).size() == cap) l++;
        
        
        
    }
    
    public int pop() {
        int size = stack.size();
        
        while(stack.size()>0 && stack.get(size-1).size()==0){
            stack.remove(size-1);
            size--;
        }
        if(stack.size()==0) return -1;
        
        return stack.get(size-1).pop();
      
        
    }
    
    public int popAtStack(int index) {
        if(index<0||index>=stack.size())return -1;
        if(stack.get(index).size()==0)return -1;
        int res=stack.get(index).pop();
        if(l>index)l=index;
        return res;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */
