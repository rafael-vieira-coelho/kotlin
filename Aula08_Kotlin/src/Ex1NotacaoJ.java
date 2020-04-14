import java.io.IOException;

public class Ex1NotacaoJ {
    public static void main(String[] args) {
        try {
            Ex1NotacaoKKt.bar();
        } catch (IOException e) {
            e.printStackTrace();
        }
      /*
        try {
            Ex1NotacaoKKt.foo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       */
    }
}
