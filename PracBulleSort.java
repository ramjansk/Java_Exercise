/**class PracBulleSort{
public static void main(String []args){
int n,i,j,swap;
int a[]={15,8,12,1,8};
n=a.length;
for(i=0;i<(n);i++){
for(j=i+1;j<(n);j++){
if(a[i]==a[j]){

      System.out.println(a[i]);
}
}
}

}
} */


/**class PracBulleSort{
public static void main(String []args){
int n,i,j,swap;
int a[]={15,8,12,1,8};
n=a.length;
for(i=0;i<n;i++){
for(j=1;j<(n-i);j++){
if(a[j-1]>a[j]){
 swap=a[j-1];
a[j-1]=a[j];
a[j]=swap;
}
}
}
for (i= 0; i < n; i++)
      System.out.println(a[i]);
}
} */

class PracBulleSort{
public static void main(String []args){
int i,search,n;
int a[]={2,4,3,7,9};
n=a.length;
search=9;
for(i=0;i<n;i++){
if(a[i]==search){
System.out.println(search + " is present at location " + (i + 1) + ".");
          break;
}
}
 if (i == n)  /* Searching element is absent */
      System.out.println(search + " is not present in array.");
}
}