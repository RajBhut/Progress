import java.util.Stack;

public class stringbackspace {
    public static void main(String[] args) {

        System.out.println(issame("ra#jk#" , "rb#ji#"));

    }
    public static boolean issame(String s ,String t)
    {
        Stack <Character> s1 = new Stack<>();
        Stack <Character> s2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
 s1.push(s.charAt(i));
 if(s.charAt(i) == '#')
 {
     s1.pop();
 }
        }
        for (int i = 0; i < t.length(); i++) {
            s2.push(t.charAt(i));
            if(t.charAt(i) == '#')
            {
                s2.pop();
            }
        }
        if(s1.size() != s2.size())
        {
            return false;
        }
        for (int i = 0 ; i < s1.size() ; i++)
        {
            if(s1.peek() == s2.peek())
            {
                s1.pop();
                s2.pop();
            }
        }
        return ( s1.isEmpty()&&s2.isEmpty());

    }
}
