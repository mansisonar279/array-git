public class Score {
   
        public static void main(String[] args) {
            int[] scores = {85, 90, 78, 92, 88}; 
            int sum = 0;
            int max = scores[0];
            int min = scores[0];
    
            for (int score : scores) {
                sum += score;
            }
            
    
            double average = (double) sum / scores.length;
    
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("maximum: " + max);
            System.out.println("minimum: " + min);
        }
    }
    
    

