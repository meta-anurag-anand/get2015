/**
 * Name: TestStackClass Author: Anurag Since: 2 February,2016 Description: Test
 * The Function of stack class i.e push ,pop
 */
@isTest
public class TestStackClass {

	/**
	 * Name: insertItem 
	 * Description: Checks if the Value is correctly inserted or not
	 * Param: 
	 * Return:
	 */
	@isTest
	static void insertItem() {
		// creating Instance of stack
		Stack TestStack = new Stack();

		Integer expectedSize = 2;
		// Inserting the Value
		TestStack.push(2);
		TestStack.push(-5);

		// Geeting the Size from the Stack Class
		Integer actualSize = TestStack.size();

		// Checking the Value
		System.assertEquals(expectedSize, actualSize);
	}

	/**
	 * Name: RemoveItem
	 * Description: Checks if the Value is correctly removed or not
	 * Param: 
	 *Return:
	 */
	@isTest
	static void RemoveItem() {
		Stack TestStack = new Stack();
		Integer expectedSize = 0;
		TestStack.push(7);
		TestStack.push(-35);

		// Deleting the item
		TestStack.pop();
		TestStack.pop();
		System.assertEquals(expectedSize, expectedSize);
	}
	/**
	 * Name: StackPeekValue
	 * Description: Checks if the Value is correctly fetched from top or not
	 * Param: 
	 * Return:
	 */
	@isTest
	static void StackPeekValue() {
		Stack TestStack = new Stack();
		// Value inserted First
		Integer expectedValue = 74;
		TestStack.push(74);
		TestStack.push(-35);
		// deleting the values
		TestStack.pop();
		// Checking the Value
		Integer actualValue = (Integer) TestStack.peek();
		System.assertEquals(expectedValue, actualValue);

	}
	/**
	 * Name: StackPeekValueIfStackIsEmpty
	 * Description: Checks if the Value if null
	 * Param: 
	 * Return:
	 */
	@isTest
	static void StackPeekValueIfStackIsEmpty() {

		Stack TestStack = new Stack();
		// Expected Value 
		Object expectedValue = null;
		Object actualValue = TestStack.peek();
		// Checks the value
		System.assertEquals(expectedValue, actualValue);

	}

}