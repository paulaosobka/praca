package javaapplication56;
import java.util.*;
import java.lang.Math.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class JavaApplication56
{ 

    //private static List<Double> getNumbersUsingIntStreamRange;
  //  private static int wynikOstatni;
  
    public static void main(String[] args) 
    {
        double[] tab = new double[]
       {
            4, 4.096, 4.9512, 5, 6, 6.005284, 6.144, 7.3728, 8, 8.192, 9.8304, 10, 11.0592, 11.2896,
            12, 12.288, 12.5, 13, 13.5, 13.56, 14.31818, 14.3182, 14.7456, 15, 16,
            16.367667, 16.368, 16.384, 17.7456, 18.432, 19.2, 19.44, 19.6608, 20,
            22.579, 22.5792, 24, 24.576, 25, 26, 27, 28, 29
        };
        double rozmiarTablicy = tab.length;
            
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the frequency you want to reach: "+ ""); 
        double frequency = scan.nextDouble();
        System.out.println("Your frequency: " + frequency);
            
        List<Double> listNumbers =  List.of( 2.0, 4.0, 6.0, 8.0);
        
        
        for ( int i=0; i < tab.length; i++)
        {
           double number = tab[i];
           double wynik = Math.abs(tab[i] / listNumbers.get(i));
           
              
           if( wynik >= 2 && wynik <= 1) 
           {
              // double start = 50.0;                 // w którym miejscu dać ten zapis
               //double end = 432.0;                // i ten gdzie dać 
              // List<Double> listNumbers1 = getNumbersUsingIntStreamRange;  ///sprawdzić czy to jest potrzebne
               
               for ( int n=50; n<=432; n++ )
               {  
                    double wynik1 = wynik * n ;
                    System.out.println("wynik mnożenia"+ wynik1);
              
               
                    if(wynik1 >=100 && wynik1 <=432)
                    {
                        List<Double> listNumbers2 = List.of( 2.0,3.0,4.0,5.0,6.0,7.0 );
                  
                        double lista = listNumbers2.get(5);
                        
                       for(int r=2; r<7; r++)
                       {
                           double wynikOstatni = wynik1 / listNumbers2.get(i);
                           
                           if(wynikOstatni<=432)
                           {
                               System.out.println("koniec" + wynikOstatni);
                               
                               
                           }
                           double end = wynikOstatni;
                       }
                      
                        
                    }
                }
               
              
            } 
           
        }
        
    }
    
    public List<Integer> getNumbersUsingIntStreamRange(int start, int end)
    {
        return IntStream.range(start, end)
        .boxed()
        .collect(Collectors.toList());
    }
    
    private boolean checkIfIsBetween1And2(double number)
    {
        return number <= 2.0 && number >= 1.0;
    }
    
    public boolean checkEndNumbers (double end)
    {
        return end <=432;
    
    }
    public boolean equals (double end )
    {
        if(end>432)
        {
            return false;
        }
        return false;
    }
}
