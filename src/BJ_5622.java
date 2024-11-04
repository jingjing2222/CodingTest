import java.util.Scanner;

public class BJ_5622 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] ch=sc.nextLine().toCharArray();
        int count=ch.length;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='A'||ch[i]=='B'||ch[i]=='C')
                count+=2;
            else if(ch[i]=='D'||ch[i]=='E'||ch[i]=='F')
                count+=3;
            else if(ch[i]=='G'||ch[i]=='H'||ch[i]=='I')
                count+=4;
            else if(ch[i]=='J'||ch[i]=='K'||ch[i]=='L')
                count+=5;
            else if(ch[i]=='M'||ch[i]=='N'||ch[i]=='O')
                count+=6;
            else if(ch[i]=='P'||ch[i]=='Q'||ch[i]=='R'||ch[i]=='S')
                count+=7;
            else if(ch[i]=='T'||ch[i]=='U'||ch[i]=='V')
                count+=8;
            else if(ch[i]=='W'||ch[i]=='X'||ch[i]=='Y'||ch[i]=='Z')
                count+=9;
            else
                count+=10;
        }
        System.out.println(count);
    }
}
