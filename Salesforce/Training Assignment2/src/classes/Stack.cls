public class Stack {
   
        private  List<Object> al;
        
        public Stack() {
        al = new List<Object>();
        }
        
        public  void push(Object item) {
        al.add(item);
        }
        
        public Object pop() {
        if (!isEmpty())
        return al.remove(size()-1);
        else
        return null;
        }
        
        public boolean isEmpty() {
        return (al.size() == 0);
        }
        
        public Object peek() {
        if (!isEmpty())
        return al.get(size()-1);
        else
        return null;
        }
        
        public Integer size() {
        return al.size();
        }

}