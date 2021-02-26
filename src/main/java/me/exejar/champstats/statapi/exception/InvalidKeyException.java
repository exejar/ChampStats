package me.exejar.champstats.statapi.exception;

import me.exejar.champstats.utils.References;

public class InvalidKeyException extends Exception {

    public InvalidKeyException() {
        System.err.println(References.MODNAME + " Invalid API Key");
    }

}
