/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nlp1;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.Properties;
/**
 *
 * @author VIDURSHAN
 */
public class Pipeline {
    private static Properties properties;
    private static String propertiesName ="tokenize, ssplit, pos, lemma, ner";
    private static StanfordCoreNLP stanfordCoreNLP;

    private Pipeline() { }

    static {
        properties = new Properties();
        properties.setProperty("annotators",propertiesName);
    }


    public static StanfordCoreNLP getPipeline()
    {
        if(stanfordCoreNLP ==null)
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        return stanfordCoreNLP;
    }
    
}
