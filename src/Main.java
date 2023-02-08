public class Main
{
    public static void main(String[] args)
    {
        //Declared variables
        double priceOfItem;
        double shippingCost;
        double totalPrice;

        //Prompt for input
        //Simulated prompt input will be simulated
        System.out.println("Enter the Price of the item ");

        //Simulated input here
        priceOfItem = 80;

        //Process
        //Made if else for prices gives warning cause simulated input
        if (priceOfItem < 100)
        {
            //Calculate shipping if less than 100
            shippingCost = priceOfItem * .02;
        }
        else
        {
            //Shipping cost if 100 or more
            shippingCost = 0;
        }

        //calculates total price
        totalPrice = priceOfItem + shippingCost;

        //Displays shipping and total price
        System.out.printf("Your shipping cost is $%.2f", + shippingCost);
        System.out.printf(" Your total price is $%.2f", + totalPrice);

    }
}