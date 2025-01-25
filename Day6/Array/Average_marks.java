class Average_marks{
    public static void main(String[] args) {
        float [] marks = {98.1f,45.7f,79.87f,99.1f,80.9f};
    System.out.println("The no of subject in array: " +(marks.length));
    float sum = 0;
    int n=marks.length;
    for(int i=0; i<n; i++){
        sum+=marks[i];
    } 
    sum/=(float)n;
    System.out.println("The average marks of the student is: "+String.format("%.2f",sum));
    }
}
// The no of subject in array: 5
// The average marks of the student is: 80.73