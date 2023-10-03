class sorting
{
public static void main(String[] args)
{
int a[]={100,56,3,58,41,15,6};
int temp;
 for (int i=0;i<a.length;i++)
 {
    for (int j=i+1;j<a.length;j++)
    {
        if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
 }
System.out.println("the ascending order is:");
for(int i=0;i<a.length;i++)
{
    System.out.println(a[i]+"\n");
}
}

}