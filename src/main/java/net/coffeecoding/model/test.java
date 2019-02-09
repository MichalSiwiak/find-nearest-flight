package net.coffeecoding.model;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test {


    public static void main(String[] args) throws ScriptException, NoSuchMethodException, IOException {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
// read script file
        engine.eval(Files.newBufferedReader(Paths.get("C:\\Users\\msiwiak\\Desktop\\cc.js"), StandardCharsets.UTF_8));

        Invocable inv = (Invocable) engine;
// call function from script file
        inv.invokeFunction("yourFunction", "param");


    }
}
