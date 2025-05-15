package calculadora.java;
import java.util.Scanner;
public class ComptarVocals {
public static void main(String[] args) {
//Step 1: read the user input
System.out.println("Please, insert the message:");
Scanner in = new Scanner(System.in);
String input = in.nextLine();
//Step 2: read the amount of 'a' letters within input
int a = 0;
char[] ch = input.toLowerCase().toCharArray();
for(int k = 0; k < ch.length; k++)
if(ch[k] == 'a') a++;
//Step 3: read the amount of 'e' letters within input
int e = 0;
ch = input.toLowerCase().toCharArray();
for(int k = 0; k < ch.length; k++)
if(ch[k] == 'e') e++;
//Step 4: read the amount of 'i' letters within input
int i = 0;
ch = input.toLowerCase().toCharArray();
for(int k = 0; k < ch.length; k++)
if(ch[k] == 'i') i++;
//Step 5: read the amount of 'o' letters within input
int o = 0;
ch = input.toLowerCase().toCharArray();
for(int k = 0; k < ch.length; k++)
if(ch[k] == 'o') o++;
//Step 6: read the amount of 'u' letters within input
int u = 0;
ch = input.toLowerCase().toCharArray();
for(int k = 0; k < ch.length; k++)
if(ch[k] == 'u') u++;
//Step 7: write the output
System.out.println(String.format("Amount of 'a': %d", a));
System.out.println(String.format("Amount of 'e': %d", e));
System.out.println(String.format("Amount of 'i': %d", i));
System.out.println(String.format("Amount of 'o': %d", o));
System.out.println(String.format("Amount of 'u': %d", u));
System.out.println(String.format("Total amount of vowels: %d", a + e + i + o + u));
in.close();
}
}