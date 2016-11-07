public class Fibonacci {

public static void main(String[] args) {

int a[]=new int[20];
a[0]=a[1]=1;

int count=0;
for(int i=2;i<20;i++) {
a[i]=a[i-1]+a[i-2];
}

for(int i=0;i<20;i++) {
System.out.print(a[i]+"\t");
count++;
if(count%5==0) {
System.out.println();
}
}
}
}
