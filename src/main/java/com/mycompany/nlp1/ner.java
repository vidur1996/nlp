/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nlp1;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author VIDURSHAN
 */
public class ner {
    public static void main(String args[])
    {
         StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
         String text = "Jim bought 300 shares of Acme Corp. in 2006 in London using vid@dfd.com when he was a teacher ..";
         
         CoreDocument coreDocument = new CoreDocument(text);
         stanfordCoreNLP.annotate(coreDocument); 
         List<CoreLabel> coreLabelList =  coreDocument.tokens();
         for(CoreLabel coreLabel : coreLabelList)
         {
             String nerr = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
             System.out.println(coreLabel.originalText() + " = " +nerr);
         }
         
    }
    
}
