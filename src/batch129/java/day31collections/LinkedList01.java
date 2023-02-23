package batch129.java.day31collections;

import java.util.LinkedList;
import java.util.List;

/*
 1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
 2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
 3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
 sonra kullanilamaz.
 4)class --> class ==> extends
   class --> interface ==> implements
   interface --> interface ==> extends
   interface --> class ==> Bu mumkun degildir
 5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
 yapilacaksa ArrayList kullanmak tavsiye edilmez.
 6)LinkedList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkedList
 leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
 durumlarda LinkedList kullanmak tavsiye edilir.
 7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
 8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
 bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.


 */
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        //List<String> cityNames = new LinkedList<>();
        names.add("Steve");
        names.add("Cart");
        names.add("Ajda");
        names.add("Megan");
        names.add("Brandon");
        System.out.println("names = " + names);//[Steve, Cart, Ajda, Megan, Brandon]
        names.addFirst("Cuneyt");
        System.out.println("names = " + names);// [Cuneyt, Steve, Cart, Ajda, Megan, Brandon]
        names.addLast("Ajda");//"addLast()" is equivalent to "add()".
        System.out.println("names = " + names);

        names.add(2,"Suleyman");//Indeks kullanılabilir
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Cart, Ajda, Megan, Brandon, Ajda]

        //remove() method loop kullanıyor burada
        names.remove("Ajda");//İlk Ajdayı siler ve loop u kırar
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Cart, Ajda, Megan, Brandon]

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Cart, Brandon, Ajda]

        names.addLast("Suleyman");
        names.addLast("Suleyman");

        System.out.println(names);//[Cuneyt, Steve, Suleyman, Cart, Brandon, Ajda, Suleyman,Suleyman]
        //İlk elemanı siler size verir
        String r1 = names.remove();//Retrieves and removes the first element of this list.(Cut + Paste)
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Cart, Brandon, Ajda, Suleyman,Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Cart, Brandon, Ajda, Suleyman,Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Cart, Brandon, Ajda, Suleyman]

       // Retrieves, but does not remove, the head (first element) of this list.(Copy + paste)
       // Returns:the head of this list, or null if this list is empty
        //İlk elemanı silmeden verir

        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Cart, Brandon, Ajda, Suleyman]

        //Retrieves and removes the head (first element) of this list.(Cut + Paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos linkedlist te kullanılırsa "hata verir",pull() bos LınkedList te kullanılırsa "null" verir.
        names.poll();
        //pop() removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        //Returns:the element at the front of this list (which is the top of the stack represented by this list)
        names.pop();
    }

}
