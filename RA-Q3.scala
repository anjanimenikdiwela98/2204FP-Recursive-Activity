object q3 extends App {
      var b:Int = 0;
      def sum(a:Int): Unit={
           b = b + a; 
           if(a>0) sum(a - 1);
           else println(b); 
      }

      println("-----Question 3-----\n");
      println("Input a value:");
      var value = readInt();
      sum(value);
}
