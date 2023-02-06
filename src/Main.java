public class Main
{
    public static void main(String[] args)
    {

        double priceOfItem = 200;
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

        System.out.println("Your shipping cost is " + shippingCost);
        System.out.println("Your total price is " + totalPrice);

    }
}