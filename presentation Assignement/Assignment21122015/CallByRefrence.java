public class CallByRefrence{  
 int data=50;  
  
 void change(CallByRefrence op)
 {  
 op.data=op.data+100;
 }  
     
    
 public static void main(String args[])
 {  
   CallByRefrence obj=new CallByRefrence();  
  
   System.out.println("before change "+obj.data);  
   obj.change(obj);  
   System.out.println("after change "+obj.data);  
  
 }  
}  