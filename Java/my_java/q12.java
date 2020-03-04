package my_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class q12 {
public static void main(String[] args) {
Map<String,String> M1=new HashMap<>();
M1.put("123654","retg");
M1.put("789654","rak");
M1.put("79887","super");
//System.out.println(M1);
Set<String> keys=M1.keySet();
for(String key:keys)
{
System.out.println("phone ="+key+" "+"name="+M1.get(key));
}
}

}


