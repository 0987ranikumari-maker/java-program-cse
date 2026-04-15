#include<stdio.h>

// Factorial
void factorial() {
    int n=5,f=1,i;
    for(i=1;i<=n;i++) f*=i;
    printf("Factorial=%d\n",f);
}

// Armstrong
void armstrong() {
    int n=153,sum=0,r,temp=n;
    while(n>0){ r=n%10; sum+=r*r*r; n/=10; }
    if(sum==temp) printf("Armstrong\n");
}

// Palindrome
void palindrome() {
    int n=121,rev=0,r,temp=n;
    while(n>0){ r=n%10; rev=rev*10+r; n/=10; }
    if(rev==temp) printf("Palindrome\n");
}

// Fibonacci
void fibonacci() {
    int a=0,b=1,c,i;
    for(i=1;i<=5;i++){
        printf("%d ",a);
        c=a+b; a=b; b=c;
    }
    printf("\n");
}

// Pattern
void pattern() {
    int i,j;
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++) printf("*");
        printf("\n");
    }
}

int main() {
    factorial();
    armstrong();
    palindrome();
    fibonacci();
    pattern();
    return 0;
}
