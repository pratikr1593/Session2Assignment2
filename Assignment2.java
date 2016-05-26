public class Assignment2{
 
        public static void main(String[] args) {
        	
        	
        	//Generate prime numbers between 1 and 100 using for loop. 
        	//A prime number (or a prime) is a natural number greater than 1 that has no positive divisors 
        	//other than 1 and itself. 
        	//A natural number greater than 1 that is not a prime number is called a composite number.
        	//Use for loop and break statement to achieve this task.

               
                
                int number = 100;
               
                System.out.println("Prime numbers between 1 and " + number);
               
                //loop through the numbers one by one
                for(int i=1; i < 100; i++){
                       
                        boolean isPrime = true;
                       
                        //check to see if the number is prime
                        for(int j=2; j < i ; j++){
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the number
                        if(isPrime)
                                System.out.print(i + " ");
                }
        }
}
 
