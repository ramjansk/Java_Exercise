class TrianglePattern{
public static void main(String []args){
int i,j,k,n=5,num=1;
k=2*n-2;
for(i=0;i<n;i++){
	for(j=0;j<=k;j++){
		System.out.print(" ");
	
	}
	k=k-1;
	for(j=0;j<=i;j++){
		System.out.print(num+" ");
	num++;
	}
	
	System.out.println();
	}
}
}
/**public class TrianglePattern
{
    public static void main(String args[])
    {
        int i, j;
        for(i=0; i<5; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/