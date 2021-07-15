object q6 extends App{
      def fibonacci(x : Int) : Int = x match{
          case x if x == 0 => 0;
          case x if x == 1 => 1;
          case _ => fibonacci(x - 1) + fibonacci(x- 2);
      }
      def fiboSeq(x:Int):Unit= {
          if (x > 0) fiboSeq(x - 1);
          println(fibonacci(x));
      }

      println("-----Question 6-Fibonacci Sequence-----\n");
      print("Input a value to get fibonacci sequence :");
      var value = readInt();
      fiboSeq(value);
}
