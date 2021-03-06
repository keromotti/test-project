package com.tr.keromotti.patterns.behavioral.interpreter;

public class IntToBinaryExpression implements Expression
{

    private int i;

    public IntToBinaryExpression(int c)
    {
        this.i = c;
    }

    public String interpret(InterpreterContext ic)
    {
        return ic.getBinaryFormat(this.i);
    }

}