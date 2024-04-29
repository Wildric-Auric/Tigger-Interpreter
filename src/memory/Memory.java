package memory;

import frontend.FunctionCallException;
import frontend.VariableException;

import java.util.HashMap;
//Im using vectors because iteration isn't from back in stack, check doc
import java.util.Vector;


import ast.ASTfunction;


public class Memory {
    public static Vector< HashMap<String, Object> >       data = new Vector<HashMap<String,Object>>();    //Ouss. Bad memory, too much cache issue, but it is java lol
    private static HashMap<String, ASTfunction>      funcData = new HashMap<String, ASTfunction>();

    public static void init() {
        //Ouss.Initialize main scope
        data.add(new HashMap<String,Object>());
    }

    public static void pushScope() {
        data.add(new HashMap<String,Object>()); 
    }

    public static void popScope() {
        data.remove(data.size()-1);
    }

    public static void pushVar(String id, Object value) {
        for (int i = data.size()-1; i > -1; --i) {
            Object val = data.get(i).get(id);
            if (val != null) {
                data.get(i).put(id, value);
                return;
            }  
        }
        data.lastElement().put(id, value);
    }

    //Force pushing a variable, used for functions
    public static void pushVarForce(String id, Object value) {
        data.lastElement().put(id,value);
    }

    public static Object getVar(String id) {
        for (int i = data.size()-1; i > -1; --i) {
            Object val = data.get(i).get(id);
            if (val != null)
                return val;
        }
        throw new VariableException("Unknown variable : " + id);
    }

    public static void pushFunc(ASTfunction func) {
        funcData.put(func.getID(), func);
    }

    public static ASTfunction getFunc(String id) {
        ASTfunction f = funcData.get(id);
        if (f != null) 
            return f;
        throw new FunctionCallException("Unknown function: " + id);
    }
}