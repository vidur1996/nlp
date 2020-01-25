/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nlp1;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.pipeline.CoreDocument;
import java.util.List;
import java.awt.*;
/**
 *
 * @author VIDURSHAN
 */
public class tokenize {
    public static void main(String[] args)
    {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text="hi ! this is vidurshan";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);


        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList)
        {
           System.out.println(coreLabel.originalText());
        }
    }
    
}
