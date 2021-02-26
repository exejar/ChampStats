package me.exejar.champstats.statapi.exception;

import me.exejar.champstats.utils.References;

public class ApiRequestException extends Exception {

    public ApiRequestException() {
        System.err.println(References.MODNAME + " Api Request UnSuccessful");
    }

}
