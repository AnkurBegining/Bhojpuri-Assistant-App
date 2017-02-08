package com.example.android.dearbhojpuri;

/**
 * Created by Lenovo on 08-02-2017.
 */

public class Words {

    private String bhojpuriTranslation;

    private String englishTranslation;

    public Words(String englishTranslation, String bhojpuriTranslation ){
        this.bhojpuriTranslation=bhojpuriTranslation;
        this.englishTranslation=englishTranslation;
    }

    public String getBhojpuriTranslation(){
        return bhojpuriTranslation;
    }

    public String  getEnglishTranslation(){
        return  englishTranslation;
    }

}
