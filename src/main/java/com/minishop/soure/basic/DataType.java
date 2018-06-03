package com.minishop.soure.basic;

/***
 * @author ToiTD
 */
public class DataType {
    private boolean demoDataBoolean() {
        boolean b = false;
        if (b == true) {
            System.out.println(b + "boolean true");
        }
        return b;
    }

    protected void getDataBoolean() {
        boolean c = demoDataBoolean();
        System.out.print(c+"c");
        return ;
    }

}
