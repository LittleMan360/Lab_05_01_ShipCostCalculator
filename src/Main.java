public class Main
{
    public static void main(String[] args)
    {

        double priceOfItem = 80;
        double shippingCost;
        double totalPrice;


        if (priceOfItem < 100)
        {
            shippingCost = priceOfItem * .02;
        }
        else
        {
            shippingCost = 0;
        }

        totalPrice = priceOfItem + shippingCost;

        System.out.printf("Your shipping cost is $%.2f", + shippingCost);
        System.out.printf(" Your total price is $%.2f", + totalPrice);

    }
}