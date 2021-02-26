package me.exejar.champstats.statapi.exception;

import me.exejar.champstats.utils.References;

public class PlayerNullException extends Exception {

    public PlayerNullException() {
        System.err.println(References.MODNAME + " Player returned as null");;
    }

}