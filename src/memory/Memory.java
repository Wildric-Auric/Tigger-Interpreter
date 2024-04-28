package memory;

import ast.ASTvariable;

import java.util.HashMap;
import java.util.Stack;


public class Memory {
    public static Stack< HashMap<String, ASTvariable> >  data = new Stack<HashMap<String,ASTvariable>>();    //Ouss. Bad memory, too much cache issue, but it is java lol
    private static HashMap<String, ASTvariable>           cache= new HashMap<String,ASTvariable>();           //Ouss. To  access variable in constant time

    public static void pushScope() {
        data.push(new HashMap<String,ASTvariable>()); 
    }

    public static void Init() {
        //Ouss.Initialize main scope
        data.push(new HashMap<String,ASTvariable>());
    }

    public static void popScope() {
        HashMap<String, ASTvariable> h = data.pop();
        for (HashMap.Entry<String, ASTvariable> entry : h.entrySet()) {
            cache.remove(entry.getKey());
        }
    }

    public static void pushVar(ASTvariable value) {
        data.peek().put(value.getID(),value);
        cache.put(value.getID(),value);
    }

    public static ASTvariable getVar(String id) {
        return cache.get(id);
    }
}