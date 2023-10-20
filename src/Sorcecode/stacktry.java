import java.util.Stack;

public class stacktry
{
    public static void main(String[] args) {
        Stack <Character> s = new Stack <>();
        Stack <Character> p = new Stack <>();
        s.push('r');
        System.out.println(s.peek());
        s.push('a');
        System.out.println(s.peek());
        p.push('r');
        System.out.println(s.peek());
        p.push('a');
        System.out.println(s.peek());
        System.out.println(s.peek() == p.peek());

    }
}
