
/* First created by JCasGen Tue Sep 10 11:38:53 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Block contains one question and an array of answers corresponding to this question. It is a unit of a whole instance of raw data of the task.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * @generated */
public class Block_Type extends BaseAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Block_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Block_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Block(addr, Block_Type.this);
  			   Block_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Block(addr, Block_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Block.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.Block");
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "model.troy.hw.Block");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "model.troy.hw.Block");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerArray;
  /** @generated */
  final int     casFeatCode_answerArray;
  /** @generated */ 
  public int getAnswerArray(int addr) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerArray);
  }
  /** @generated */    
  public void setAnswerArray(int addr, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerArray, v);}
    
   /** @generated */
  public int getAnswerArray(int addr, int i) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
  }
   
  /** @generated */ 
  public void setAnswerArray(int addr, int i, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Block_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "model.troy.hw.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_answerArray = jcas.getRequiredFeatureDE(casType, "answerArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_answerArray  = (null == casFeat_answerArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerArray).getCode();

  }
}



    