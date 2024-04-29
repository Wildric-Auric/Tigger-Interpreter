package memory;

import frontend.VariableException;

import java.util.HashMap;
import java.util.Stack;

public class Memory {
    private static Stack< HashMap<String, Object> >  data = new Stack<HashMap<String,Object>>();    //Ouss. Bad memory, too much cache issue, but it is java lol

    public static void init() {
        //Ouss.Initialize main scope
        data.push(new HashMap<String,Object>());
    }

    public static void pushScope() {
        data.push(new HashMap<String,Object>()); 
    }

    public static void popScope() {
        data.pop();
    }

    public static void pushVar(String id, Object value) {

        for (HashMap<String, Object> scope : data) {
            Object val = scope.get(id);
            if (val != null) {
                scope.put(id, value);
                return;
            }
        }
        data.peek().put(id, value);
    }

    public static Object getVar(String id) {

        for (HashMap<String, Object> scope : data) {
            Object val = scope.get(id);
            if (val != null)
                return val;
        }
        throw new VariableException("Unknown variable : " + id);
    }
}