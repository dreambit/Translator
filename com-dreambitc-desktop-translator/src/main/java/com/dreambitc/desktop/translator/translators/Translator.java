package com.dreambitc.desktop.translator.translators;

public interface Translator {

    /**
     * 
     * @param text
     * @return
     */
    public String translate(String text);

    /**
     * 
     * @param text
     * @return
     */
    public boolean isCorrect(String text);
}
