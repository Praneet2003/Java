// Imagine Maria is developing a game, where it involves collecting resources on each planet, and the availability of resources is modeled using a geometric progression. 



// Create an abstract class Series with an abstract method nextTerm(). Implement a subclass called GeometricSeries that calculates the next term in a geometric progression for the resource collection on planets. Allow players to input the initial resource level, resource growth ratio, and the number of planets they plan to explore. 



// Display the predicted resource levels on each planet.

// Input format :
// The first line of input consists of a single positive integer, representing the initial resource level.

// The second line consists of a single positive integer, representing the growth ratio.

// The third line consists of a single positive integer, representing the number of planets.

// Output format :
// The output displays the resource levels of each planet, separated by space.



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ resource ≤ 10

// 1 ≤ growth rate ≤ 10

// 1 ≤ number of planets ≤ 8

// Sample test cases :
// Input 1 :
// 2
// 3
// 5
// Output 1 :
// 2 6 18 54 162 
// Input 2 :
// 5
// 3
// 6
// Output 2 :
// 5 15 45 135 405 1215 
// Input 3 :
// 2
// 9
// 8
// Output 3 :
// 2 18 162 1458 13122 118098 1062882 9565938 
// You are using Java
import java.util.*;
abstract class Series {
    //type your code here
    abstract int nextTerm();
}

class GeometricSeries extends Series {
    //type your code here
    int a,r,n;
    public GeometricSeries(int a, int r, int n){
        this.a = a;
        this.r = r;
        this.n = n;
    }
    static int n1 = 0;
    @Override
    public int nextTerm(){
        n1++;
        return a*(int)(Math.pow(r,(n1 -1)));
    }
}
public class GeometricmeanSeries{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTerm = scanner.nextInt();
        int commonRatio = scanner.nextInt();
        int numberOfTerms = scanner.nextInt();
        GeometricSeries geometricSeries = new GeometricSeries(firstTerm, commonRatio, numberOfTerms);
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(geometricSeries.nextTerm() + " ");
        }

        scanner.close();
    }
}