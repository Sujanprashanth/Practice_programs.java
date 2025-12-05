Sum of digits in java:
Program:
class Main{
    public static void main(String[] args){
        int n=1234,sum=0,A=0;
        while(n!=0){
            A=n%10;
            sum+=A;
            n=n/10;
        }
        System.out.print("Sum of digits: "+sum);
    }
}
Output:
Sum of digits: 10
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count the no of digits:
Program:
class Main{
    public static void main(String[] args){
        int num = 1234,s,count++;
        while(num!=0){
            s=num/10;
            count++;
        }
        System.out.print("No of digits: "+count);
    }
}
Output:
No of Digits : 4
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse the number:
Program:
class Main{
    public static void main(String[] args){
        int n = 1234,rev=0,l=0;
        System.out.println("The number is: "+n);
        while(n!=0){
            l=n%10;
            rev=(rev*10)+l
            n=n/10;
        }
        System.out.println("The reverse of the given number: "+rev);
    }
}
Output:
The number is: 1234
The reverse of the given number: 4321
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
To check if the given number is a palindrome or not
Program:
class Main{
    public static void main(String[] args){
        int num = 121,rev=0,l=0,c=num;
        while(num!=0){
            l=num%10;
            rev=(rev*10)+l;
            num=num/10;
        }
        if(c==rev){
            System.out.println(c+" is a palindrome");
        }
        else{
            System.out.println(c+" is not a palindrome");
        }
    }
}
Output:
121 is a palindrome
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
To find an Armstrong number in java
Program:
class Main{
    public static void main(String[] args){
        int num=153,sum=0,l=0,num1=num;
        while(num!=0){
            l=num%10;
            sum+=Math.pow(l,3);
            num/=10;
        }
        if(num1==sum){
            System.out.println(num1+" is an armstrong number");
        }
        else{
            System.out.println(num1+" is not an armstrong number");
        }
    }
}
Output:
153 is an armstrong number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Factorial of a number using loops no recurssion
Program:
class Main{
    public static void main(String[] args){
        int num=5,mul=1;
        for(int i=num;i>=1;i--){
            mul*=i;       
        }
        System.out.println("The factorial of "+num+" is :"+mul);
    }
}
Output:
The factorial of 5 is :120
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Program to find the given number is a prime number or not
Program:
class Main{
    public static void main(String[]args){
        int num = 2,count=0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("Prime");
        }
        else{
            System.out.print("not a prime");
        }
    }
}
Output:
Prime
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Program to find whether a number is a perfect number or not
Program:
class Main{
    public static void main(String[]args){
        int num = 6,sum=0,num1=num;
        for(int i =0;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num1==sum){
            System.out.print(num1+" is a perfect number");
        }
        else{
            System.out.print(num1+" is not a perfect number");
        }
    }
}
Output:
6 is a perfect number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Program to find whether a number is a strong number or not
Program:
class Main{
    public static void main(String[]args){
        int num = 145,sum=0,num1=num,l=0;
        while(num!=0){
            l=num%10;
            int mul =1;
            for(int i=l;i>=1;i--){
                mul*=i;
            }
            sum+=mul
            num=num/10;
        }
        if(num1==sum){
   		    System.out.print(num1+" is a strong number");
        }
        else{
   		    System.out.print(num1+" is not a strong number");
        }
    }
}
Output:
145 is a strong number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Fionacci Series:
Program:
class Main{
    public static void main(String[] args){
        int n=8,a=0,b=1,c=0;
        System.out.print("The fibonacci series of "+n+" is:"+a+" "+b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
Output:
The fionacci series of 8 is:0 1 1 2 3 5 8 13 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Sum of N natural numbers:
Program:
class Main{
    public static void main(String[] args){
        int n=5,sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("The sum of "+n+" natural numbers is:"+sum);
    }
}
Output:
The sum of 10 natural numbers is:55 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Given number ia an automorphic number or not
Program:
class Main{
    public static void main(String[] args){
        int n=25,digits=0,l=0;
        int s=n*n;
        int temp=n
        while(temp>0){
            digits++;
            n/=10;
        }
        l = s % (int)Math.pow(10,digits);
        if(n==l){
             System.out.print(n+" is an automorphic number");
        }
        else{
             System.out.print(n+" is not an automorphic number");
        }
    }
}
Output:    
25 is an automorphic number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Given number is a spy number or not:
Program:
class Main{
    public static void main(String[] args){
        int n=134,sum=0,nl=0,m=n,mul=1,ml=0,d=n;
        while(n!=0){
            nl=n%10;
            sum+=nl;
            n/=10;
        }
        while(m!=0){
            ml=m%10;
            mul*=ml
            m/=10;
        }
        if(sum==mul){
            System.out.print(d+" is a spy number");
        }
        else{
            System.out.print(d+" is not a spy number");
        }
    }
}
Output:
134 is not a spy number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Neon number or not
Program:
class Main{
    public static void main(String[]args){
        int n=9,s=0,d=n,sum=0,l=0;
        s=n*n;
        while(s!=0){
            l=s%10;
            sum+=l
            n/=10
        }
        if(d==sum){
            System.out.print(d+" is a neon number");
        }
        else{
            System.out.print(d+" is not a neon number");
        }
    }
}
Output:
9 is a neon number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Given number is a Harshad (Niven) Number:
Program:
class Main{
    public static void main(String[] args){
        int n=18,sum=0,l=0;
        while(n!=0){
            l=n%10;
            sum+=l;
            n/=10;
        }
        if(n%sum==0){
  	        System.out.print(d+" is a Harshad number");
        }
        else{
            System.out.print(d+" is not a Harshad number");
        }
    }
}
Output:
19 is not a Harshad number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Palindrome Numbers in a Range (e.g., 1 to 150):
Program:
class Main{
    public static void main(String[] args){
        int num=0,l=0,n=0;
        for(int i=0;i<=num;i++){
            n=i;
            int rev=0;
            while(n!=0){
                l=n%10;
                rev=(rev*10)+l;
                n/=10;
            }
            if(i==rev){
                System.out.print(rev+" ");
            }
                
        }
        
    }
}
Output:
1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101 111 121 131 141 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Magic Number or not
Program:
class Main{
    public static void main(String[]args){
        int num=1729,l=o,sum=0,d=num;
        while(num!=0){
            l=num%10;
            sum+=l;
            num/=10;
        }
        while(sum>9){
            int temp = sum;
            sum=0;
            while(temp!=0){
                l=temp%10;
                sum+=l;
                temp/=10;
            }
        }
        if(d==1){
            System.out.print(d+" is a magic number");
        }
        else{
            System.out.print(d+" is not a magic number");
        }
    }
}
Output:
1729 is a Magic Number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Factorial Series (up to 5):
Program:
class Main{
    public static void main(String[]args){
        int mul=1,a=1;
        for(int i=1;i<=5;i++){
            mul*=a;
            a++;
            System.out.print(mul+" ")
        }
    }
}
Output:
1 2 6 24 120 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Duck Number:
Program:
class Main{
    public static void main(String[]args){
        int num=1123,l=0,temp=num;
        boolean a = false;
        while(num!=0){
            l=num%10;
            if(l==0){
                a=true;
                break;
            }
            num/=10;
        }
        if(a){
            System.out.print(temp+" is a duck number");
        }
        else{
            System.out.print(temp+" is not a duck number");
        }
    }
}
Output:
1123 is not a duck number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Evil number or not
Program:
class Main{
    public static void main(String[] args){
        int n=6,rem=0,quo=0,count=0,d=n;
        String r = "";
        while(n>0){
            quo=n/2;
            rem=n%2;
            r=rem+r;
            n=quo;
        }
        for(int i =0;i<r.length();i++){
            if(r.chatAt(i)=='1'){
                count++
            }
        }
        if(count%2==0){
            System.out.print(d+" is an evil number");
        }
        else{
            System.out.print(d+" is not an evil number");
        }
    }
}
Output:
6 is an evil number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Disarium Number or not:
Program:
class Main{
    public static void main(String[]args){
        int num = 135,sum=0,count=0,l=0,temp=num,c=num;
        while(num!=0){
            l=num%10;
            count++
            num/=10;
        }
        while(temp!=0){
            l=temp%10;
            sum+=Math.pow(l,count);
            temp/=10
        }
        if(c==sum){
            System.out.print(c+" is a disarium number");
        }
        else{
            System.out.print(c+" is not a disarium number");
        }
    }
}
Output:
135 is a disarium number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Happy number or not:
class Main{
    public static void main(String[]args){
        int num=19,l=0,sum=0,c=num,s=2;
        while(num!=0){
            l=num%10;
            sum+=Math.pow(l,s);
            num/=10
        }
        int temp=sum;
        while(temp>9){
            sum=0;
            while(temp!=0){
                l=temp%10;
                sum+=Math.pow(l,s);
                temp/=10;
            }
            temp=sum;
        }
        if(c==1){
            System.out.print(c+" is a Happy number");
        }
        else{
            System.out.print(c+" is not a Happy number");
        }
    }
}
Output:
19 is a Happy number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Tech Number or not
Program:
class Main{
    public static void main(String[]args){
        int n=2025,l=0,s=0,count=0,divisor=0,fh=0,sh=0,ad=0,temp=n,m=n;
        while(n!=0){
            l=n%10;
            count++;
            n/=10;
        }
        if(count%2==0){
            divisor=Math.pow(10,count/2);
            fh=temp/100;
            sh=temp%100;
            ad=fh+sh;
            s=ad*ad;
            if(s==m){
                System.out.println(m + " is a Tech Number");
            }
            else{
                System.out.println(m + " is not a Tech Number");
            }
        }
        else{
            System.out.print(m+" is not a tech number because of odd count");
        }
    }
}
Output:
2025 is a Tech Number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Sunny Number or not:
Program:
class Main {
    public static void main(String[] args) {
        int n = 80;
        int sq = (int)Math.sqrt(n + 1);
        if (sq * sq == n + 1)
            System.out.println(n + " is a Sunny Number");
        else
            System.out.println(n + " is not a Sunny Number");
    }
}
Output:
80 is a Sunny Number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Trimorphic number or not:
Program:
class Main {
    public static void main(String[] args) {
        int n = 24;
        int cube = n * n * n;
        if (String.valueOf(cube).endsWith(String.valueOf(n)))
            System.out.println(n + " is a Trimorphic Number");
        else
            System.out.println(n + " is not a Trimorphic Number");
    }
}
Output:
24 is a Trimorphic Number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Buzz Number or not:
Program:
class Main {
    public static void main(String[] args) {
        int n = 27;
        if (n % 7 == 0 || n % 10 == 7)
            System.out.println(n + " is a Buzz Number");
        else
            System.out.println(n + " is not a Buzz Number");
    }
}
Output:
27 is a Buzz Number
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Strings:
Print each character one by one:
Program:
class Main{
    public static void Main(String[]args){
        String a = "Hello";
        for(int i=0;i<=a.length()-1;i++){
            System.out.println(a.charAt(i));
        }
    }
}
Output:
H
e
l
l
o
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count total number of characters in the string (without using length()).
Program:
class Main{
    public static void main(String[]args){
        String s = "Hello";
        int count=0;
        for(char a : s.toCharArray()){
            count++;
        }
        System.out.print("Total number of characters in the string: "+count);
    }
}
Output:
Total number of characters in the string: 5
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Convert the string to uppercase.
public class Main
{
	public static void main(String[] args) {
		String s = "Hello";
		System.out.print(s.toUpperCase());
	}
}
Output:
HELLO
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Convert the string to lowercase.
public class Main
{
	public static void main(String[] args) {
		String s = "HELLO";
		System.out.print(s.toLowerCase());
	}
}
Output:
hello
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count the number of vowels and consonants.
Program:
class Main{
    public static void main(String[]args){
        String s = "ICE";
        int vowels=0,consonants=0;
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i).equalsIgnoreCase("a")||String.valueOf(s.charAt(i).equalsIgnoreCase("e")||String.valueOf(s.charAt(i).equalsIgnoreCase("i")||String.valueOf(s.charAt(i).equalsIgnoreCase("o")||String.valueOf(s.charAt(i).equalsIgnoreCase("u")){
                vowels++;
            }
            else{
                consonants++;
            }                                                                                                                                                       
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
Output:
Vowels: 2
Consonants: 1
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count digits, alphabets, and special characters
Program:
class Main{
    public static void main(String[]args){
        String s = "Sujan@2002";
        int alphabets=0,digits=0,specialcharacters=0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                alphabets++;
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else{
                specialcharacters++;
            }
        }
        System.out.println("Alphabets: "+alphabets);
        System.out.println("Digits: "+digits);
        System.out.println("Special Characters: "+specialcharacters);
    }
}
Output:
Alphabets: 5
Digits: 4
Special Characters: 1
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count how many spaces are in the string:
Program:
class Main{
    public static void main(String[]args){
        String s = "Java is fun to learn";
        int space_count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                space_count++;
            }
        }
        System.out.print(space_count);
    }
}
Output:
4
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse the string manually.
Program:
class Main{
	public static void main(String[]args){
		String s = "Sujan";
		for(int i = s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
}
Output:
najuS
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if two strings are equal (using .equals() and without .equals()).
Program:
class Main{
	public static void main(String[]args){
		String s1="Sujan",s2="Sujan";
		System.out.println(s1==s2);   // true (same reference)
		System.out.println(s1.equals(s2));   // true (same content)
	}
}
Output:
true
true
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Concatenate two strings and print the result.
Program:
class Main{
	public static void main(String[]args){
		String s1 = "Sujan",s1 = "@2002";
		String d = s1.concat(s2);
		System.out.print(d);
	}
}
Output:
Sujan@2002
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if a string is a palindrome.
Program:
class Main{
	public static void main(String[]args){
		String s = "Sujan",r="";
		for(int i=s.length()-1;i>=0;i++){
			r=r+s.charAt(i);
		}
		if(s.equalsIgnoreCase(r)){
			System.out.print(s+" is a palindrome");
		}
		else{
			System.out.print(s+" is not a palindrome");
		}
	}
}
Output:
Sujan is not a palindrome
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count the number of words in a sentence
Program:
public class Main
{
	public static void main(String[] args) {
	    String s=" Java is fun to learn";
		int count_spaces=0,count_words=0;
		s=s.trim();
		for(int i =0;i<s.length();i++){
		    if(s.charAt(i)==' '){
		        count_spaces++;
		    }
		}
		count_words=count_spaces+1;
		System.out.println("Total no of words is : "+count_words);
	}
}
Output:
Total no of words is : 5
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Replace all spaces with a - or _
Program:
class Main{
	public static void main(String[]args){
		String s = "Hello World Java";
		s=s.trim();
		System.out.print(s.replace(" ","_"));
	}
}
Output:
Replace all spaces with a - or _
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Remove all vowels from the string.
Program:
class Main{
	public static void main(String[]args){
		String s="java",d="hello";
		s=s.replaceAll("[AEIOUaeiou]","");
		d=d.replace("e","m");
		System.out.println(s);
        System.out.print(d);
	}
}
Output:
Jv
Hmllo
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Swap the first and last character of a string
Program:
class Main{
	public static void main(String[]args){
		String s = "Hello",mid="",mod_s="";
		char first_ch='',second_ch='';
		s=s.trim();
		first_ch=s.charAt(0);
		second_ch=s.charAt(s.length()-1);
		mid=s.substring(1,s.length()-1);
		mod_s=second_ch+mid+first_ch;
		System.out.print(mod_s);
	}
}
Output:
oellH
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Extract and print only numbers from an alphanumeric string
Program:
class Main{
	public static void main(String[]args){
		String s = "Java123World2025",r="";
		char ch=' ';
		boolean b = false;
		for(int i=0;i<s.length();i++){
			ch=charAt(i);
			if(ch>=0 && ch<=9){
				r+=ch;
				b=true;
			}
		}
		if(b){
			System.out.print(r);
		}
		else{
			 System.out.print("there are no numbers in the given string");
		}
	}
}
Output:
1232025
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Print all characters at even and odd positions separately
Program:
class Main{
	public static void main(String[]args){
		String s="HELLO",evenPos="",oddPos="";
		for(int i =0;i<s.length();i++){
			if(i%2!=0){
				evenPos+=s.charAt(i);
			}
			else{
				oddPos+=s.charAt(i);
			}
		}
		System.out.println("Even position characters: "+evenPos);
		System.out.println("Odd position characters: "+oddPos);
	}
}
Output:
Even position characters: E L  
Odd position characters: H L O
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count how many times a specific character occurs
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		String s="";
		char c=' ';
		int count=0;
		boolean b = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		s=sc.next();
		System.out.print("Character: ");
		c=sc.next().charAt(0);
		for(int i =0;i<s.length();i++){
			if(c==s.charAt(i)){
				count++;
				b=true;
			}
		}
		if(b){
			 System.out.print(c+" appears "+count+" times");
		}
		else{
		    System.out.print("The entered character"+c+" is not present in the string");
		}
	}
}
Output:
String:success
Character:s
s appears 3 times
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Remove duplicate characters from the string
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		String s = "",r="";
		System.out.print("Enter the string:");
		s=sc.next();
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(r.indexOf(c)==-1){
				r+=c
			}
	     }
		System.out.print(r);
	}
}
Output:
progamin
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find the frequency of each character in the string
Program:
class Main{
	public static void main(String[]args){
		String s = "banana",r="";
		char c = ' ',d=' ';
		int count=0;
		for(int i =0;i<s.length();i++){
			c=s.charAt(i);
			if(r.indexOf(c)==-1){
				r+=c
			}
		}
		for(int j =0;j<r.length();j++){
			d=r.charAt(j);
			for(int k=0;k<s.length();k++){
				if(d==s.charAt(k)){
					count++;
				}
			}
			System.out.println(r.charAt(j)+":"+count);
			count=0
		}
	}
}
Output:
b = 1  
a = 3  
n = 2
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse each word in a sentence (but keep word order same)
Program:
class Main{
	public static void main(String[]args){
		String r=" ";
		String[] s ="Java is fun to learn".split(" ");
		for(String k:s){
			StringBuilder b = new StringBuilder(s);
			b.reverse();
			r+=" "+b
		}
		System.out.print(r.trim());
	}
}
Output:
avaJ si nuf ot nrael
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse the order of words in a sentence:
Program:
class Main{
	public static void main(String[]args){
		String[] a ="Java is fun to learn".split(" ");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}
Output:
learn to fun is Java
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if two strings are anagrams
Program:
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        char[] a ="listen".toCharArray();
        char[] b ="silent".toCharArray();
        
        int a1 = a.length;
        int b1 = b.length;
        boolean c = true;  // declared outside
        
        if(a1 == b1){
            for(int i=0; i<a.length; i++){
                char f = a[i];
                boolean found = false;
                
                for(int j=0; j<b.length; j++){
                    if(f == b[j]){
                        found = true;
                        break;
                    }
                }
                
                if(!found){
                    c = false;
                    break;
                }
            }
            
            if(c){
                System.out.print("The given word is an anagram");
            }
            else{
                System.out.print("The given word is not anagram");
            }
        }
        else{
            System.out.print("The given word is not anagram");
        }
    }
}
Output:
The given word is an anagram
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if a string contains only digits
Program:
class Main{
	public static void main(String[]args){
		char[] a = "12345".toCharArray();
		boolean b=false;
		for(char a1:a){
			if(a1>='0'&&a1<='9'){
				b=true;			
			}
			else{
				b=false;
				break;
			}
		}
		if(b){
			System.out.print("Contains only digits");
		}
		else{
			System.out.print("Contains non-digit characters");
		}
	}
}
Output:
Contains only digits
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find the first non-repeating character
Program:
class Main{
	public static void main(String[]args){
		String s="success",r="";
		for(int i=0;i<s.length()-1;i++){
			char b = s.charAt(i);
			if(r.indexOf(b)==-1){
				r+=b;
			}
		}
		for(int j=0;j<r.length();j++){
			char c = r.charAt(i);
			int count=0;
			for(int k=0;k<s.length();k++){
				char d=s.charAt(k);
				if(c==k){
					count++
				}
			}
			if(count==1){
				System.out.print("First non-repeating character = " + f);
	            return;
			}
		}
	}
}
Output:
First non-repeating character = u
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count how many times each word appears in a sentence
Program:
class Main{
	public static void main(String[]args){
		String[] s = "Java is fun and Java is powerful".split(" ");
		String r="";
		for(int i=0;i<s.length;i++){
			String b = s[i];
			if(!r.contains(b+" ")){
				r+=b+" ";
			}
		}
		String[] m = r.trim().split(" ");
		for(int j=0;j<m.length;j++){
			String c = m[j];
			int count=0;
			for(int k =0;k<s.length;k++){
				String d = s[k];
				if(c.equals(d)){
					count++;
				}
			}
			System.out.println(c+"="+count);
		}
	}
}
Output:
Java = 2  
is = 2  
fun = 1  
and = 1  
powerful = 1
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find the largest and smallest word in a sentence
Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String[] s = "Java is fun and Java is powerful".split(" ");
	    String r="";
	    for(int i=0;i<s.length;i++){
	        String b=s[i];
	        if(!r.contains(b+" ")){
	            r+=b+" ";
	        }
	    }
	    String[] m=r.trim().split(" ");
	    String max_word=m[0];
	    String min_word=m[0];
	    for(String m1:m){
	        if(m1.length()>max_word.length()){ 
	            max_word=m1;
	        }
	        if(m1.length()<min_word.length()){
	            min_word=m1;   
	        }
	        
	    }
	    System.out.println(min_word);
	    System.out.println(max_word);
    }
}
Output:
is 
powerful
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Capitalize the first letter of each word
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		String r="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String[] s =sc.nextLine().split(" ");
		for(String g:s){
			char[] a = g.toCharArray();
			for(int i=0;i<a.length;i++){
				if(i==0){
					r+=Character.toUpperCase(a[0]);
				}
				else{
					r+=a[i]
				}
			}
			r+=" ";
		}
		System.out.print(r);
	}
}
Output:
Enter the String: java is fun
Java Is Fun
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Arrays:
Print array elements
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("The array elements are: ");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}
}
Output:
Enter the array elements:
1
2
3
4
The array elements are: 1 2 3 4 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find min and max elements in an array:
Program:
import java.util.*
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr=new arr[n];
		System.out.print("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int j=0;j<arr.length;j++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}
Output:
Enter the size of the array: 4
Enter the array elements
5
9
12
3
Max: 12
Min: 3
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Calculate sum:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int sum=0;
		Scanner sc = new scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++){
			sum+=arr[i];
		}
		System.out.print("The sum of the array is: "+sum);
	}
}
Output:
Enter the size of the array: 4
Enter the array: 
1
2
3
4
The sum of the array is: 10
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Calculate Average:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int sum=0;
		Scanner sc = new scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++){
			sum+=arr[i];
		}
		(double) avg = (double) sum / (double) n
		System.out.print("The sum of the array is: "+sum);
		System.out.print("The average of the array is: "+avg);
	}
}
Output:
Enter the size of the array: 4
Enter the array: 
4
7
1
3
The sum of the array is: 15
The average of the array is: 3.75
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Search the element in an array
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int sum=0;
		boolean b = false;
		Scanner sc = new scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to be searched: ");
		int m = sc.nextInt();
		int found=0;
		for(int j=0;j<arr.length;j++){
			if(m==arr[j]){
				b=true;
				founf=j;
				break;
			}
		}
		if(b){
			System.out.print(m+" found at index "+found);
		}
		else{
			System.out.print("Element not found");
		}
	}
}
Output:
Enter the size of the array: 4
Enter the array: 
10
20
30
40
Enter the number to be searched: 50
Element not found
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count even or odd in arrays
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int even_count=0,odd_count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();		
		}
		for(int j=0;j<arr.length;j++){
			if(arr[i]%2==0){
				even_count++;
			}		
			else{
				odd_count++;
			}
		}
		System.out.println("Even count: "+even_count);
		System.out.println("Odd count: "+odd_count);
	}
}
Output:
Enter the size of the array: 6
Enter the array: 
1
2
3
4
5
6
Even count: 3
Odd count: 3
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse the array:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();		
		}
		System.out.print("Reversed array: [");
		for(int j=arr.length-1;j>=0;j--){
			if(j>0){
				System.out.print(arr[j]+",");
			}
			if(j==0){
				System.out.print(arr[j]+"");
			}
		}
		System.out.print("]");
	}
}
Output:
nter the size of the array: 4
Enter the array: 
1
2
3
4
Reversed array: [4,3,2,1]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
sorting arrays in java:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int temp = 0;
		boolean swapped;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();		
		}
		for(int j=0;j<n-1;j++){
			for(int k=0;k<n-i-1;k++){
				if(arr[k]>arr[k+1]){
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false){
				break;
			}
		}
		System.out.print("Sorted array: [");
		for(int l=0;l<arr.length;l++){
			if(l>0){
				System.out.print(arr[l]+",");
		    }
			if(l==0){
				System.out.print(arr[l]+"");
			}
		}
		System.out.print("]");
	} 
}
Output:
Enter the size of the array: 5
Enter the array: 
1
2
3
4
5
Sorted array = [1, 2, 5, 6, 9]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Copy one array to another
Program
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array: ");
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int[] arrc = new int[n];
		for(int j =0;j<arr.length;j++){
		    arrc[j]=arr[j];
		}
		System.out.print("The copied array: [");
		for(int k =0;k<arrc.length;k++){
		    if(k<n-1){
				System.out.print(arrc[k]+",");
			}
			else{
				System.out.print(arrc[k]+"");
			}
		}
	}
}
Output:
Enter the size of the array: 4
Enter the array: 
1
2
3
4
The copied array: [1,2,3,4]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Frequency of an element:
Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		int count = 0;
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array: ");
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("Element: ");
		int s = sc.nextInt();
		for(int j =0;j<arr.length;j++){
		    if(s==arr[j]){
		        count++;
		        b=true;
		    }
		}
		if(b){
		    System.out.print("Frequency of "+s+" = "+count);
		}
		else{
		    System.out.print("Element not found");
		}
	}
}
Output:
Enter the size of the array: 6
Enter the array: 
1
2
3
3
4
5
Element: 3
Frequency of 3 = 2
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        for(int i = 0; i < n-1; i++){
            boolean swapped = false;

            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped → array is already sorted or all elements same
            if(!swapped){
                break;
            }
        }

        // Check if all elements are same
        boolean allSame = true;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[0]){
                allSame = false;
                break;
            }
        }

        if(allSame){
            System.out.println("All elements are same try again...!");
        } else {
            System.out.println("Second largest = " + arr[n-2]);
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
2D matrix
Print Matrix
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the rows");
		int r = sc.nextInt();
		System.out.print("Enter the size of the cols");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter the matrix");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
Output:
Enter the size of rows:2
Enter the size of cols:3
Enter the matrix: 
1
2
3
4
5
6
1 2 3 
4 5 6 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Sum of Matrix
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the size of the rows");
		int r = sc.nextInt();
		System.out.print("Enter the size of the cols");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter the matrix");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				sum+=arr[i][j];
			}
		}
		System.out.print("Sum of matrix = "+sum);
	}
}
Output:
Enter the size of rows:2
Enter the size of cols:3
Enter the matrix: 
1
2
3
4
5
6
Sum of matrix = 21
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Diagonal Sum (for square matrix)
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the size of the rows");
		int r = sc.nextInt();
		System.out.print("Enter the size of the cols");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter the matrix");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i==j){
					sum+=arr[i][j];
				}
			}
		}
		System.out.print("Diagonal sum = "+sum);
	}
}
Output:
Enter the size of rows:2
Enter the size of cols:3
Enter the matrix: 
1
2
3
4
5
6
7
8
9
Diagonal sum = 15
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Transpose of a Matrix:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the size of the rows");
		int r = sc.nextInt();
		System.out.print("Enter the size of the cols");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter the matrix");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int[][] arr1 = new int[c][r]
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr1[i][j]=arr[j][i];
			}
		}
		System.out.print("Transpose ");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
Output:
Enter the size of rows:2
Enter the size of cols:3
Enter the matrix: 
1
2
3
4
5 
6
Transpose: 
1 4 
2 5 
3 6 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
To check if the given matrix is an identity matrix:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.print("Enter the size of the rows");
		int r = sc.nextInt();
		System.out.print("Enter the size of the cols");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter the numbers");
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i==j&&arr[i][j]==1){
					b=true;
				}
				else if(i!=j&&arr[i][j]==0){
					b=true;
				}
				else{
					b=false;
					break;
				}
			}
			if(!b){
				break;
			}
		}
		if(b){
			System.out.print("Identity matrix");
		}
		else{
			System.out.print("Not an identity matrix");
		}
	}
}
Output:
Enter the number of rows: 3
Enter the number of cols: 3
Enter the numbers: 
1
2
0
0
1
0
0
0
1
Not an identity matrix
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find all pairs with given sum
Program:
Output:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.print("Enter the size of the array:");
		int s = sc.nextInt();
		int arr = new int[s];
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum:");
		int sum = sc.nextInt();
		for(int i=0;i<s;i++){
			int first = arr[i];
		    for(int j=i+1;j<s;j++){
			    int second = arr[j]
				if(first+second==sum){
					System.out.println("("+first+","+second+")");
				}
		    }	
		}

Enter the size of the array: 9
Enter the numbers: 
2
4
3
5
6
-2
4
7
8
Enter the sum: 7
(2,5)
(4,3)
(3,4)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find triplet sum
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		System.out.print("Enter the size of the array:");
		int s = sc.nextInt();
		int arr = new int[s];
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum:");
		int sum = sc.nextInt();
		for(int i=0;i<s;i++){
			int first = arr[i];
		    for(int j=i+1;j<s;j++){
			    int second = arr[j];
				for(int k=j+1;k<s;k++){
					int third = arr[k];
					if(first+second+third==sum){
					    System.out.println("("+first+","+second+","+third+")");
				}
		    }	
		}
	}
Output:
Enter the size of the array: 6
Enter the numbers: 
1
2
3
4
5
6
Enter the sum: 10
(1,3,6)
(1,4,5)
(2,3,5)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find the Missing Number (1 to n):
Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int o_n = n+1;
		int[] arr = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int total_sum=o_n*(o_n+1)/2;
		for(int j=0;j<n;j++){
		    sum+=arr[j];
		}
		int miss_no=total_sum-sum;
		System.out.print("Missing number:"+miss_no);
	}
}
Output:
Enter the size of the array: 5
Enter the numbers: 
1
2
3
5
6
Missing number:4
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find duplicate element
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            // check if it was printed earlier
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number is: " + arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Move all zeros to end
Program:
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int arr1=new int[n];
		int k=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr1[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]);
		}
	}
}
Output:
Enter size: 7
Enter elements:
1
0
2
0
3
0
4
1234000
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
OOPS:
Create a method isEven(int n)
Program:
import java.util.*;
class Main{
	static boolean isEven(int n){
		if(n%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		System.out.print(Main.isEven(a));
	}
}
Output:
Enter the number:10
true
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method factorial(int n)
Program:
import java.util.*;
class Main{
	static int factorial(int n){
		int fact=1;
		for(int i=n;i>0;i--){
			fact*=i
		}
		return fact;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int a = sc.nextInt();
		System.out.print(Main.factorial(a));
	}
}
Output:
Enter the number:5
120
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method countVowels(String s):
Program:
import java.util.*;
class Main{
	static int countVowels(String s){
		char[] d = s.toCharArray();
		int count=0;
		for(int i =0;i<d.length;i++){
			if(d[i]=='a'||d[i]=='e'||d[i]=='i'||d[i]=='o'||d[i]=='u'){
				count++
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string");
		String a = sc.nextLine();
		System.out.print(Main.countVowels(a));
	}
}
Output:
Enter the string:java programming
5
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method getMax(int[] arr):
Program:
import java.util.*;
class Main{
	static int getMax(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.print(Main.getMax(arr1));
	}
}
Output:
Enter the size of the array:5
Enter the array:
4
2
1
7
9
Max is: 9
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method reverseNumber(int n)
Program:
import java.util.*;
class Main{
	static int reverseNumber(int n){
		int l=0,rev=1;
		while(n!=0){
			l=n%10;
			rev = (rev*10) + l;
			n/=10
		}
		return rev;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n1 = sc.nextInt();
		System.out.print("Reversed is: "+Main.reverseNumber(n1));
	}
}
Output:
Enter the number:1234
Reversed is: 4321
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method isPalindrome(String word):
Program:
import java.util.*;
class Main{
	static boolean isPalindrome(String word){
		String rev="";
		for(int i=word.length()-1;i>=0;i--){
			char v = word.charAt(i);
			rev+=v;
		}
		if(word.equals(rev)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		String s = sc.next();
		System.out.print(Main.isPalindrome(s));
	}
}
Output:
Enter the string:java
false
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method sumOfDigits(int n)
Program:
import java.util.*;
public class Main
{
    static int sumOfDigits(int n){
        int l=0,sum=0;
        while(n!=0){
            l=n%10;
            sum+=l;
            n/=10;
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int s = sc.nextInt();
		System.out.print(Main.sumOfDigits(s));
	}
}
Output:
Enter the number:987
24
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method getSecondLargest(int[] arr)
Program:
import java.util.*;
public class Main
{
    static int getSecondLargest(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[1];
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.print("The second largest number is: "+Main.getSecondLargest(arr1));
	}
}
Output:
Enter the size of the array:5
10
20
5
8
40
The second largest number is: 20
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method countWords(String sentence)
Program:
import java.util.*;
public class Main
{
    static int countWords(String sentence){
        int count=0;
        String[] ar = sentence.split(" ");
        for(String a:ar){
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
	    String s = sc.nextLine();
		System.out.print(Main.countWords(s));
	}
}
Output:
Enter the string:java is super easy
4
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a method isPrime(int n)
Program:
import java.util.*;
public class Main
{
    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;    
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
	    int s = sc.nextInt();
		System.out.print(Main.isPrime(s));
	}
}
Output:
Enter the number:15
false
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a Student class with variables: id, name, marks
Program:
class Student{
    int id;
    String name;
    int marks;
    
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Marks:"+marks);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Student s1 = new Student();
		s1.id=1;
		s1.name="AAA";
		s1.marks=100;
		s1.display();
	}
}
Output:
ID: 1
Name: AAA
Marks:100
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a Car class with variables: brand, color, price:
Program:
import java.util.*;
class Car{
    String brand;
    String color;
    int price;
    
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Price:"+price);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Car c1 = new Car();
		c1.brand=sc.next();
		c1.color=sc.next();
		c1.price=sc.nextInt();
		c1.display();
	}
}
Output:
BMW
Black
567886365
Brand: BMW
Color: Black
Price:567886365
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a BankAccount class with deposit and withdraw
Program:
import java.util.*;
class BankAccount{
	int lastdeposit;
	int afterdeposit;
	int lastwithdraw;
	int afterwithdraw;
	int balance;
	BankAccount(int balance){
		this.balance=balance;
	}
	int deposit(int amount){
		lastdeposit=amount;
		balance+=amount;
		afterdeposit=balance;
		return afterdeposit;
	}
	int withdraw(int amount){
		lastwithdraw=amount;
		balance+=amount;
		afterwithdraw=balance;
		return afterwithdraw;
	}
	void display(){
		System.out.println("After Deposit ("+lastdeposit+") : " + afterDepositBalance);
        System.out.println("After Withdraw ("+lastwithdraw+") : " + afterWithdrawBalance);
	}
}
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanneer(System.in);
		BankAccount ba = new BankAccount(5000);
		int d = sc.nextInt();
		int w = sc.nextInt();
		ba.deposit(d);
		ba.withdraw(w);
		ba.display();
	}
}
Output:
2000
1500
After Deposit (2000) : 7000
After Withdraw (1500) : 5500
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a Product class with discount calculation method:
Program:
import java.util.*;
class Product{
    float discount_amount;
    float sp;
    float div;
    float calc(int amount,int discount){
        div=(float)discount/100;
        discount_amount= (float)amount*div;
        sp= (float)amount-discount_amount;
        return sp;
    } 
    void display(){
        System.out.println("Final Price:"+sp);
    }
}

public class Main{
    public static void main(String[] args) {
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        p.calc(a,d);
        p.display();
    }
}
Output:
1000
10
Final Price:900.0
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Student details using Getters and Setters
Program:
import java.util.*;
class Studentdetails{
    private String name;
    private int age;
    private int mark;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setMark(int mark){
        this.mark=mark;
    }
    public int getMark(){
        return mark;
    }
    void display(){
        System.out.println("Student name"+getName());
        System.out.println("Student age"+getAge());
        System.out.println("Student Mark"+getMark());
    }
}

public class Main{
    public static void main(String[] args) {
        Studentdetails sd = new Studentdetails();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = sc.nextInt();
        int m = sc.nextInt();
        sd.setName(n);
        sd.setAge(a);
        sd.setMark(m);
        sd.display();
        <----------------Accessible----------------------->
        System.out.println("Student name"+sd.getName());
        System.out.println("Student age"+sd.getAge());
        System.out.println("Student Mark"+sd.getMark());
    }
}
Output:
Sujan
23
87
Student nameSujan
Student age23
Student Mark87
Student nameSujan
Student age23
Student Mark87
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Employee details using Parameterized Constructor:
Program:
import java.util.*;
class Employeedetails{
    private int id;
    private String name;
    private String dep;
    private int sal;
    
    Employeedetails(int id,String name,String dep,int sal){
        this.id=id;
        this.name=name;
        this.dep=dep;
        this.sal=sal;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDep(String dep){
        this.dep=dep;
    }
    public String getDep(){
        return dep;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getSal(){
        return sal;
    }
    
    void display(){
        System.out.println("Employee Id: "+getId());
        System.out.println("Employee name: "+getName());
        System.out.println("Employee dep: "+getDep());
        System.out.println("Employee sal: "+getSal());
    }
}

public class Main{
    public static void main(String[] args) {
        Employeedetails ed = new Employeedetails(1,"Sujan","IT",85000);
        ed.display();
    }
}
Output:
Employee Id: 1
Employee name: Sujan
Employee dep: IT
Employee sal: 85000
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
BankAccount with private balance + deposit() + withdraw()
Program:
class BankAccount{
    private int balance;
    private int ldeposit;
    private int adeposit;
    private int lwithdraw;
    private int awithdraw;
    private int depo;
    private int withd;
    private int initialbalance;
    BankAccount(int balance){
        this.balance=balance;
        this.initialbalance=balance;
    }
    public void setDeposit(int depo){
        this.depo=depo;
    }
    public int getDeposit(){
        return depo;
    }
    public void setWithdraw(int withd){
        this.withd=withd;
    }
    public int getWithdraw(){
        return withd;
    }
    public int deposit(){
        ldeposit=getDeposit();
        balance+=getDeposit();
        adeposit=balance;
        return adeposit;
    }
    public int withdraw(){
        lwithdraw=getWithdraw();
        balance-=getWithdraw();
        awithdraw=balance;
        return awithdraw;
    }
    void display(){
        System.out.println("Initial Balance: "+initialbalance);
        System.out.println("After Deposit ("+ldeposit+"): "+adeposit);
        System.out.println("After Withdraw ("+lwithdraw+"): "+awithdraw);
    }
}
public class Main
{
	public static void main(String[] args) {
	    BankAccount ba = new BankAccount(5000);
	    ba.setDeposit(3000);
	    ba.setWithdraw(2500);
	    ba.deposit();
	    ba.withdraw();
	    ba.display();
	}
}
Output:
Initial Balance: 5000
After Deposit (3000): 8000
After Withdraw (2500): 5500
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Car class with Constructor Overloading:
Program:
class Car{
	Car(){
		this.brand="unknown";
		this.color="white";
		this.price=0;
	}
	Car(String brand,String color,int price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	void display(){
		
	}
}
class Main{
	public static void main(String[]args){
		Car c1 = new Car();
		Car c2 = new Car("Tesla","Red",5200000);
		c1.display();
		c2.display();
	}
}
Output:
Brand: unknown
Color: white
Price: 0
Brand: Tesla
Color: Red
Price: 5200000
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
super keyword example:
class Animal {
    int x=4;
    Animal(){
        System.out.println("Animal constructor");
    }
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    int x = 14;
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
    void sound() {
        super.sound();
        System.out.println("Dog barks");
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
Output:
Animal constructor
Dog constructor
Animal makes sound
Dog barks
4
14
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Single Inheritance (Animal → Dog)
Program:
class Animal {
    void sound() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    
    void sound1() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sound1();
    }
}
Output:
Animal eats
Dog barks
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Multilevel Inheritance (A → B → C)
Program
class Animal {
    void sound() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {   
    void sound1() {
        System.out.println("Dog barks");
    }
}
class Cat extends Dog{
    void sound2() {
        System.out.println("cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sound1();
        c.sound2();
    }
}
Output:
Animal eats
Dog barks
cat meows
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Hierarchical Inheritance (Vehicle → Car, Bike):
Program:
class Vehicle {
    void sound() {
        System.out.println("Common vehicle features");
    }
}

class Car extends Vehicle {
    
    void sound1() {
        System.out.println("car runs");
    }
}
class Bike extends Vehicle{
    void sound2() {
        System.out.println("bike rides");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();
        b.sound();
        c.sound1();
        b.sound2();
    }
}
Output:
Common vehicle features
car runs
bike rides
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Method Overriding (Interview-important)
Program:
class Parent {
    void sound() {
        System.out.println("Parent: Payment processing...");
    }
}
class Child extends Parent {   
    void sound() {
        System.out.println("Child: UPI payment processed");
    }
}
public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p = new Child();
        p1.sound();
        p.sound();
    }
}
Output:
Parent: Payment processing...
Child: UPI payment processed
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Polymorphism:
Program:
class Sum{
    int c;
    double d;
    int sum(int a,int b){
        c=a+b;
        return c;
    }
    double sum(double a,double b){
        d=a+b;
        return d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Sum s = new Sum();
	    System.out.println(s.sum(10,20));
	    System.out.println(s.sum(20.5,25.0));
	}
}
Output:
30
45.5
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Shape → Circle/Rectangle overriding area():
Program:
class Circle {
    double r=5.4,a1=0.0;
    void area(){
        a1=22.0/7*r*r;
        System.out.println(a1);
    }
}
class Rectangle extends Circle{
    int l=5,b=4,a=0;
    void area(){
        a=l*b;
        System.out.println(a);
    }
}
public class Main
{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		Circle c = new Rectangle();
		c.area();
		
	}
}
Output:
20
20
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Abstract + Normal Method
Program:
abstract class Vehicle{
    abstract void start();
    void engine(){
        System.out.println("Engine started");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.print("driving car");
    }
}
public class Main
{
	public static void main(String[] args) {
		Car c = new Car();
		c.engine();
		c.start();
	}
}
Output
Engine started
Driving car...
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Interface: Printable
Program:
interface Vehicle{
    void printable();
}
class Car implements Vehicle{
    public void printable(){
        System.out.print("Printing document...");
    }
}
public class Main
{
	public static void main(String[] args) {
		Car c = new Car();
		c.printable();
	}
}
Output:
Printing document...
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Multiple interfaces:
Program:
interface Flyable{
    void flyable();
}
interface Swimable{
    void swimable();
}
class Car implements Flyable,Swimable{
    public void flyable(){
        System.out.println("Bird is flying");
    }
    public void swimable(){
        System.out.println("Bird is swimming");
    }
}
public class Main
{
	public static void main(String[] args) {
		Car c = new Car();
		c.flyable();
		c.swimable();
	}
}
Output:
Bird is flying
Bird is swimming
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Abstract class + constructor
Program:	
abstract class A{
    A(){
        System.out.println("Abstract class constructor called");
    }
    abstract void flyable();
}
class B extends A{
    void flyable(){
        System.out.println("Child class feature executed");
    }
}
public class Main
{
	public static void main(String[] args) {
		B c = new B();
		c.flyable();
	}
}
Output:
Abstract class constructor called
Child class feature executed
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Interface + overriding default method
Program:
interface A{
    void flyable();
}
class B implements A{
    public void flyable(){
        System.out.println("Default method overridden");
    }
}
public class Main
{
	public static void main(String[] args) {
		B c = new B();
		c.flyable();
	}
}
Output:
Default method overridden
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Abstract class + method chaining
Program:
abstract class Auth {
    abstract Auth login();   // returns same class type for chaining
    abstract Auth dashboard();
}

class UserAuth extends Auth {

    UserAuth login() {
        System.out.println("Login successful");
        return this;   // method chaining
    }

    UserAuth dashboard() {
        System.out.println("Dashboard loaded");
        return this;   // method chaining
    }
}

public class Main {
    public static void main(String[] args) {
        UserAuth ua = new UserAuth();

        ua.login()
          .dashboard();  // method chaining
    }
}
Output:
Login successful
Dashboard loaded
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create an ArrayList and print all elements.
Program:
class Main{
	public static void main(String[]args){
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		System.out.print(list);
	}
}
Output:
["AA","BB","CC","DD"]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Add 5 names to a List and print only names starting with 'A'.
Program:
class Main{
	public static void main(String[]args){
		List<> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("AC");
		list.add("DD");
		for(int i=0;i<list.size();i++){
			for(String a:list){
				char ch = a.charAt(0);
				if(ch=='A'){
					System.out.println(a);
				}
			}
		}
	}
}
Output:
AA
AC
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Remove all duplicate elements from an ArrayList.
Program:
class Main{
	public static void main(String[]args){
		List<String> list = new List<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("BBB");
		list.add("AAA");
		Set<String> set = new Set<>(list);
		System.out.println("Before removing duplicates: "+list);
		System.out.println("Before removing duplicates: "+set);
	}
}
Output:
Before removing duplicates: [AAA, BBB, CCC, BBB, AAA]
After removing duplicates: [AAA, BBB, CCC]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if a List contains a given element.
Program:
class Main{
	public static void main(String[]args){
		boolean b = false;
		List<String> list = new List<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("Mango");
		list.add("AAA");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=0;i<list.size();i++){
			String l = list.get(i);
			if(l.contains(a)){
				b=true;
				break;
			}
		}
		if(b){
		    System.out.print("Element found");
		}
		else{
		    System.out.print("Element not found");			
		}
	}
}
Output:
Mango
Element found
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Sort integers in ascending & descending order
Program:
class Main{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(7);
		Collections.sort(list);
		System.out.println("Ascending order: "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Descending order: "+list);
	}
}
Output:
Ascending order: [1, 2, 5, 7, 9]
Descending order: [9, 7, 5, 2, 1]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Convert array → ArrayList.
Program:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4};
	    List<Integer> list = new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        list.add(arr[i]);
	    }
	    System.out.print(list);
	}
}
Output:
[1, 2, 3, 4]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Convert ArrayList → Array.
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int n=0;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		n=list.size();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=list.get(i);
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
	}
}
Output:
1234
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Merge two ArrayLists into one.
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		int n=list.size();
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		int m=list.size();
		List<Integer> list3 = new ArrayList<>();
		for(int i=0;i<n;i++){
			list3.add(list1.get(i));
		}
		for(int i=0;i<m;i++){
			list3.add(list2.get(i));
		}
		System.out.print(list3);
	}
}
Output:
[1,2,3,4,5,6,7,8]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Count frequency of an element in a List:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		int count=0;
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<list.size();i++){
			if(list.get(i)==n){
				count++;
			}
		}
		System.out.print("The frequency of "+n+" is: "+count);
	}
}		
Output:
10
The frequency of 10 is: 3
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find the second largest element:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(50);
		Collections.sort(list,Collections.reverseOrder());
		System.out.print("The second largest: "+list.get(1));
	}
}
Output:
The second largest: 40
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse an ArrayList:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(50);
		List<Integer> list1 = new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--){
			list1.add(list.get(i));
		}
		System.out.print(list1);
	}
}
Output:
[50, 30, 20, 40, 10]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Check if two ArrayLists are equal
Program:
import java.util.*;
class Main{
	public stativ void main(String[]args){
		boolean c = false;
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		if(list.size()!=list1.size()){
			c=false;
		}
		else{
			int i=0;
			while(i<list.size()){
				String a = list.get(i);
				String b = list1.get(i);
				if(a.equals(b)){
					c=true;
				}
				else{
					c=false;
					break;
				}
				i++;
			}
			if(c){
				System.out.print("Both are equal");
			}
			else{
				System.out.print("Both are not equal");
			}
		}
	}
}
Output:
Both are equal
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Remove all odd numbers:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2!=0){
				list.remove(i);
			}
		}
		System.out.print("After removing odd numbers: "+list);
	}
}
Output:
After removing odd numbers: [10, 20, 30]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Iterate using Iterator:
Program:
import java.util.*;
class Main{
	public static void main (String[]args){
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
Output:
AA
BB
CC
DD
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Insert element at specific index in LinkedList:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("D");
		list.add(2,"C");
		System.out.print("Updated LinkedList: "+list);
	}
}
Output:
Updated LinkedList: [A, B, C, D]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find duplicate elements using Set.
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("C");
		Set<String> set = new LinkedHashSet<>();
		for(int i=0;i<list.size();i++){
		    for(int j=i+1;j<list.size();j++){
			    if(list.get(i).equals(list.get(j))){
					set.add(list.get(i));
				}
		    }	
		}
		System.out.print("Duplicate Elements: "+set);
	}
}
Output:
Duplicate Elements: [A, C]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find unique elements using Set
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("C");
		Set<String> set = new LinkedHashSet<>();
		for(int i =0;i<list.size();i++){
			set.add(list.get(i));
		}
		System.out.print("Unique Elements: "+set);
	}
}
Output:
Duplicate Elements:[A, B, C, D]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find intersection of two Sets:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		List<String> list2 = new ArrayList<>();
		list2.add("B");
		list2.add("C");
		list2.add("D");
		Set<String> list1 = new LinkedHashSet<>();
		for(int i=0;i<list1.size();i++){
			for(int j=0;j<list2.size();j++){
			    if(list1.get(i).equals(list2.get(j))){
					set.add(list1.get(i));
				}
		    }
		}
		System.out.print("Intersection: "+set3);
	}
}
Output:
Intersection: [B, C]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Find union of two Sets:
Program:
import java.util.*;
class Main{
	public static void main(String[]args){
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		Set<Integer> set3 = new LinkedHashSet<>();
		for(int i=0;i<list1.size();i++){
			set3.add(list1.get(i));
		}
		for(int i=0;i<list2.size();i++){
			set3.add(list2.get(i));
		}
		System.out.print("Union: "+set3);
	}
}
Output:
Union: [1, 2, 3, 4, 5]
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
