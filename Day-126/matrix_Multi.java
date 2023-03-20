/*Java Program to multiply two matrices
We can multiply two matrices in java using binary * operator and executing another loop.
A matrix is also known as array of arrays. We can add, subtract and multiply matrices.
In case of matrix multiplication, one row element of first matrix is multiplied by all columns of second matrix.
*/

public class Main
{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}};    

//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  

//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
}    
}} 

/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=55244:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta Main01
6 6 6 
12 12 12 
18 18 18 
Process finished with exit code 0
*/
