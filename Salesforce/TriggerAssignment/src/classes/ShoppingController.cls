/*
* Name: ShoppingController
* Author: anurag
* Since: 27 January,2016
* Description: Controller For the Shopping Cart
*/ 
public class ShoppingController {
    // List Of Products
    public  List <product2> products { get; set; }
    // Id of the Product to be added To the Cart
    public String idOfProductToAdd {get;set;}
    // Id of the Order in which to be added
    public String idOfPurchaseOrder {get;set;}
    public  Purchase_Order__c orders {get;set;}
    /*
* Name:ShoppingController Constructor
* Description:Takes The id of the Current Record
*/
    public ShoppingController(ApexPages.StandardController controller){     
        idOfPurchaseOrder = System.currentPageReference().getParameters().get('id');
    }
    //List That contains the items 
    public List<PurchaseOrderLineItem__c> items {get
    {
        List<PurchaseOrderLineItem__c> item = [SELECT 
                                               ID,Product_Code__c,Name,Unit_Price__c,Quantity__c,Total_Price__c 
                                               FROM PurchaseOrderLineItem__c 
                                               WHERE Purchase_Order__r.id =: idOfPurchaseOrder];
        return item;
    }   set;} 
    // To update for the Quantity in inline editing
    public Integer QuantityNumber {get;set;}
    // gets the category for the required Data to be populated
    public List<SelectOption> Category
    {
        get{   
            List<SelectOption> options = new List<SelectOption>();
            Schema.DescribeFieldResult fieldResult = product2.category__c .getDescribe();
            List<Schema.PicklistEntry> optionSelected = fieldResult.getPicklistValues();
            // Adds the Option of the selected criteria 
            for( Schema.PicklistEntry f : optionSelected)
                options.add(new SelectOption(f.getLabel(), f.getValue()));
            return options;
        }
    }
    public String SelectedCategory { get; set; }
    /*
     * Name: populateProducts
     * Description: populates the ProductList With the the Selected Category
     */
    public  void populateProducts(){
        products = [select ID,ProductCode,Name,Price__c,category__c from product2 where category__c =:SelectedCategory];
        system.debug(products);
        
    }
    /*
     * Name:RemoveFromCart
     * Description: Removes the product From the Cart
     */
    public void RemoveFromCart()
    {
        // Gets the Product to be removed
        List <PurchaseOrderLineItem__c> product = [select ID,name from PurchaseOrderLineItem__c where ID =:idOfProductToAdd Limit 1];
        PurchaseOrderLineItem__c getProduct;
        if(product.size()>0)
        {
            getProduct=product.get(0);
        }
        delete getProduct;
    }
    /*
     * Name: AddTOCart
     * Description: Adds the Item to the Cart
     */
    public void AddToCart()
    {   
        List<PurchaseOrderLineItem__c> ListItems; 
        // Query to get the product information
        List <product2> product=[SELECT  
                                 ID,ProductCode,Name,Price__c,category__c 
                                 FROM
                                 product2 
                                 WHERE ID =:idOfProductToAdd Limit 1];
        Product2 getProduct;
        PurchaseOrderLineItem__c PurchaseOrder;
        if(product.size()>0)
        {
            getProduct=product.get(0);
        }
        ListItems = [select ID,name,Quantity__c,Unit_Price__c,Total_Price__c from PurchaseOrderLineItem__c where Product__r.id =:getProduct.id and Purchase_Order__c = :idOfPurchaseOrder Limit 1];
        if(ListItems.size()>0)
        {
            PurchaseOrder=ListItems.get(0);
            PurchaseOrder.Quantity__c+=1;
            update PurchaseOrder;
        } 
        else
        {
            PurchaseOrder =new PurchaseOrderLineItem__c(name=getProduct.name,Unit_price__c=getProduct.Price__c,Product_Code__c=getproduct.ProductCode,Product__c=getProduct.id,Purchase_Order__c = Orders.id);
            insert PurchaseOrder;
        }
    }
    
    public PageReference updateQuantity()
    {
        //system.assert(false, QuantityNumber);
        List <PurchaseOrderLineItem__c> product = [select ID,name,Quantity__c from PurchaseOrderLineItem__c where ID =:idOfProductToAdd Limit 1];
        PurchaseOrderLineItem__c getProduct;
        if(product.size()>0)
        {
            getProduct=product.get(0);
        }
        System.debug(getProduct);
        getProduct.Quantity__c=QuantityNumber;
        update getProduct;
        return null;
    }
}