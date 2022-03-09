//#include<iostream>
//#include<string>
//using namespace std;
// 
//string add(string a, string b)
//{
//    string res="";
//    while(a.length() < b.length()) a="0"+a;
//    while(b.length() < a.length()) b="0"+b;
//    int carry=0;
//    for(int i=a.length()-1;i>=0;i--)
//    {
//        int tmp=a[i]-48 + b[i]-48 + carry;
//        carry=tmp/10;
//        tmp=tmp%10;
//        res=(char)(tmp+48)+res;
//    }
//    if(carry>0) res="1"+res;
//    return res;
//}
// 
//string sub(string a, string b)
//{
//    string res="";
//    while(a.length() < b.length()) a="0"+a;
//    while(b.length() < a.length()) b="0"+b;
//    bool neg=false;
//    if(a<b)
//    {
//        swap(a,b);
//        neg=true;
//    }
//    int borrow=0;
//    for(int i=a.length()-1; i>=0;i--)
//    {
//        int tmp=a[i]-b[i]-borrow;
//        if(tmp<0)
//        {
//            tmp+=10;
//            borrow=1;
//        }
//        else borrow=0;
//        res=(char)(tmp%10 + 48) + res;
//    }
//    while(res.length()>1 && res[0]=='0') res.erase(0,1);
//    if(neg) res="-"+res;
//    return res;
//}
// 
//string mul(string a, string b)
//{
//    string res="";
//    int n=a.length();
//    int m=b.length();
//    int len=n+m-1;
//    int carry=0;
//    for(int i=len;i>=0;i--)
//    {
//        int tmp=0;
//        for(int j=n-1;j>=0;j--)
//            if(i-j<=m && i-j>=1)
//            {
//                int a1=a[j]-48;
//                int b1=b[i-j-1]-48;
//                tmp+=a1*b1;
//            }
//            tmp+=carry;
//            carry=tmp/10;
//            res=(char)(tmp%10 + 48)+res;
//    }
//    while(res.length()>1 && res[0]=='0') res.erase(0,1);
//    return res;
//}
//int main()
//{
//    //freopen("in.txt","r",stdin);
//    string a, b;
//    cin>>a>>b;
//    cout<<add(a,b)<<endl;
//    cout<<sub(a,b)<<endl;
//    cout<<mul(a,b);
//}

#include <iostream>
#include <conio.h>
#include <string.h>
using namespace std;

#define max 100	//so dai nhat co the la 100 chu so
#define plus 1	//bieu hien dau duong
#define minus -1	//bieu hien dau am

//khai bao cau truc
typedef struct
{
	char digits[max];
	int dau;
	int lastdigits; //so chu so , ex: 12334 ==> lastdigits=5
}bignum;


void scan_num(bignum &n)
{
	char nhap[256];
	gets(nhap);
		if(nhap[0]!='-')
		{
			n.dau=plus;
			n.lastdigits=strlen(nhap)-1;
			for(int i=0;i<=n.lastdigits;i++)
			{
				n.digits[i]=nhap[n.lastdigits-i]-48;
			}
		}
		else if(nhap[0]=='-')
		{
			n.dau=minus;
			n.lastdigits=strlen(nhap)-2;
			for(int i=0;i<=n.lastdigits;i++)
			{
				n.digits[i]=nhap[n.lastdigits-i+1]-48;
			}	
		}	
		
//		
//	for(int i=0;i<=n.lastdigits;i++)
//	{
//		cout<<n.digits[i];
//		
//	}	
}

void print_num(bignum n)
{
	if(n.dau==minus){
		cout <<'-';
	}
	for(int i=n.lastdigits;i>=0;i--)
	{
		cout<<int(n.digits[i]);
	}
	
}

	
	

int main()
{
	
	do{
		bignum a;
		cout<<"nhap a= ";
		scan_num(a);
		cout<<endl;
		print_num(a);
	}while(_getch()!=27);
	
	return 0;
}



