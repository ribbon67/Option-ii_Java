public class RivanAgarwalWeek1Assignment {
    public static void main(String[]args){
        storeReceipt();
        movieTicketPrice();
        countdownOddEven();
    }
    public static void storeReceipt(){
        double P = 4.5; //declaring price
        int Q = 3; //declaring quantity purcahsed
        double subtotal = P*Q; // creating a variable to calculate subtotal
        System.out.println("your subtotal is: " + subtotal); //printing subtotal
        double tax = 0.06625; //declaring NJ tax
        double Ftax = subtotal * tax; //creating a variable that calculates the final tax
        System.out.println("your sales tax is: " + Ftax); // printing final tax
        
        System.out.println("your total is: " + (subtotal + Ftax)); // printing final price by calculating final tax and subtotal

    }
    public static void movieTicketPrice(){
        int age = 29; //setting random age
        if (age<5) //beggining if else chain
            { 
            System.out.println("Free");
        } else if(age<17){
            System.out.println("Your price is 8 dollars");
        } else if(age<64){
            System.out.println("Your fee is 12 dollars");
        } else{ //ending if else chain
            System.out.println("Your fee is 9 dollars");
        }
    }
    public static void countdownOddEven(){
        int sum = 0; //declaring initial sum variable which should be nothing
        for(int n = 10; n >= 1; n--){ // declares a number variable which starts with ten, then increments down 1 each loop
            if(n%2 == 0){ //checks if number is even by dividing by two and checking for remainder
                System.out.println(n + " even");
            } else{
                System.out.println(n + " odd");
            }
            sum += n; // adds the current number to the sum variable each loop
        }
        System.out.println(sum); //prints total sum
    }
}
