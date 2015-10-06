/**
 * Name:ListNode
 * @author anurag
 * Since: 2 October,2015
 * Description: Getter Setter Of node
 **/
public class ListNode 
{
	// Tag to indicate the value
	int tag;
	// Data 
	Object data;
	// Address of next
	ListNode next;
	// Getter  of tag
	public int getTag()
	{
		return tag;
	}
	// Setter of Tag
	public void setTag(int tag) 
	{
		this.tag = tag;
	}
	// Getter of Data
	public Object getData() 
	{
		return data;
	}
	// Setter of Data 
	public void setData(Object data) 
	{
		this.data = data;
	}
	// Getter of Next 
	public ListNode getNext()
	{
		return next;
	}
	// Sets The vale of Next
	public void setNext(ListNode next) 
	{
		this.next = next;
	}
	// To string Method Implemented
	@Override
	public String toString() 
	{
		return "ListNode [tag=" + tag + ", data=" + data + ", next=" + next
				+ "]";
	}
	
}
