package HashMap;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class ValueOfNode{
    String parent;
    String value;

    public ValueOfNode(String parent, String value) {
        this.parent = parent;
        this.value = value;
    }
}

class ValueOfNodeInt{
    String parent;
    int value;

    public ValueOfNodeInt(String parent, int value) {
        this.parent = parent;
        this.value = value;
    }

    public String getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }
}

public class linkedHash {


    private static Object values;
    private static Object values1;
    private static Object value;

    public static void main(String a[]) throws InvocationTargetException, IllegalAccessException {
        // making the object of LinkedHashMap
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();

        // adding the elements in linkedHashMap
        linkedHashMap.put("Customer", new ValueOfNode(null, "A"));
        linkedHashMap.put("Currency", new ValueOfNode("Customer", "INR"));
        linkedHashMap.put("Funbased", new ValueOfNodeInt("Currency", 0));
        linkedHashMap.put("Secured", new ValueOfNodeInt("Funbased", 0));

        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() instanceof ValueOfNode) {
                ValueOfNode val = (ValueOfNode) entry.getValue();
                System.out.println(val.value);
            } else if (entry.getValue() instanceof ValueOfNodeInt) {
                ValueOfNodeInt val = (ValueOfNodeInt) entry.getValue();
                System.out.println(val.value);
            } else {
                throw new IllegalStateException("Expecting either String or Class as entry value");
            }
        }

        // printing the elements of LinkedHashMap
//        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
//            String key = entry.getKey();
//            Object values = entry.getValue();
////            String parent = value.parent;
////            String val = value.value;
////            System.out.println(key + "-->" + parent + "-->" + val);
//            String val = entry.getValue().getClass().toString().split("\\.")[1];
//            Method[] fields = values.getClass().getDeclaredMethods();
//            for(Object fi : fields){
//                Method method = (Method) fi;
//                method.invoke(fi);
//            }
//
//        }

//        linkedHashMap.forEach((k, v) -> {
//            Field[] fields = v.getClass().getDeclared;
//            for(Object fi: fields){
//                System.out.println(fi);
//            }
//        });
//        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
//            String key = entry.getKey();
//            Object values = entry.getValue();
//            // Field[] fields = values.getClass().getDeclaredFields();
//
//            System.out.println(values);
//
////                System.out.println(key + ":" + values);
//        }


    }
}


