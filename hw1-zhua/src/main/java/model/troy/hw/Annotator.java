package model.troy.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import model.troy.hw.Question;
import model.troy.hw.Answer;

public class Annotator extends JCasAnnotator_ImplBase {

  private Pattern mQuestionPattern = Pattern.compile("^Q\\s(.*)");
  private Pattern mAnswerPattern = Pattern.compile("A\\s(.)\\s(.*)");
//  private Pattern mAnswerPattern = Pattern.compile("^A\\s(.*)");

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    Matcher matcher = mQuestionPattern.matcher(docText);
    while (matcher.find()) {
      Question annotation = new Question(aJCas);
      annotation.setBegin(matcher.start(1));
      annotation.setEnd(matcher.end(1));
      annotation.setConfidence(1.0);
      annotation.setSource("model.troy.hw1.Annotator");
      annotation.addToIndexes();
    }
    
    matcher = mAnswerPattern.matcher(docText);
    while (matcher.find()){
      Answer annotation = new Answer(aJCas);
      annotation.setBegin(matcher.start(2));
      annotation.setEnd(matcher.end(2));
      annotation.setConfidence(1.0);
      annotation.setSource("model.troy.hw1.Annotator");
      if (matcher.group(1).equals("1"))
        annotation.setIsCorrect(true);
      else
        annotation.setIsCorrect(false);
      annotation.addToIndexes();
    }
//    All ana = new All(aJCas);
//    ana.setBegin(0);
//    ana.setEnd(docText.length() - 1);
//    ana.setContent("Fake Content");
//    ana.addToIndexes();
  }
}
