import java.awt.*;
import java.awt.event.*;
class TxtManager extends Frame implements TextListener
{
   TextField t;
   Label l,l1,l2,l3,l4,l5;
   int c=0,v=0,sym=0; 
   int vowel=0,num=0;
   int cons=0;
    TxtManager()
    {
       setSize(300,300);
       t=new TextField();
       l1=new Label("Text Manager");
       l=new Label("Total Char: "+c);  // char read
       l2=new Label("Total Vowel: ");
       l3=new Label("Total Consonant: ");
       l4=new Label("Total Num Digits: ");
       l5=new Label("Total Symbols: ");
       setLayout(null);
       t.setBounds(80,60,100,20);
       l.setBounds(30,100,150,20);
       l1.setBounds(90,38,150,30);
       l2.setBounds(30,140,150,20);
       l3.setBounds(30,160,150,20);
       l4.setBounds(30,180,200,20);
       l5.setBounds(30,120,200,20);
       add(t);add(l);add(l2);add(l3);add(l4);add(l5);
       add(l1);
       t.addTextListener(this);
       setVisible(true);
     }
    public void textValueChanged(TextEvent e)
    {
        c=t.getText().length();
        l.setText("Total Char: "+c);


        String s = t.getText();
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        vowel++;
      }
       if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'||c==' '||c>=33&&c<=47||(c>=33&&c<=64||c>=91&&c<=96||c>=123&&c<=125))) {
        cons++; 
        }
      if (c>=48&&c<=57){
        num++; 
      }
      //symbol
      
      if(c>=33&&c<=47||c>=58&&c<=64||c>=91&&c<=96||c>=123&&c<=125){
    sym++;
   }
}
        l2.setText("vowels: "+vowel);
        //vowel=0;
        l3.setText("consonant: "+cons);
        //cons=0;
        l4.setText("Total Num Digit: "+num);
       //num=0;
        l5.setText("Total Symbols: "+sym);
        //sym=0;

     }
   public static void main(String args[])
   {
         TxtManager ob=new TxtManager();
   }
}