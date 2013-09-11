
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

/** 
 * Updated by JCasGen Tue Sep 10 21:13:16 EDT 2013
 * @generated */
public class AnswerArray_Type extends BaseAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerArray_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerArray_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerArray(addr, AnswerArray_Type.this);
  			   AnswerArray_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerArray(addr, AnswerArray_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerArray.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.AnswerArray");
 
  /** @generated */
  final Feature casFeat_answerArray;
  /** @generated */
  final int     casFeatCode_answerArray;
  /** @generated */ 
  public int getAnswerArray(int addr) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerArray);
  }
  /** @generated */    
  public void setAnswerArray(int addr, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerArray, v);}
    
   /** @generated */
  public int getAnswerArray(int addr, int i) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
  }
   
  /** @generated */ 
  public void setAnswerArray(int addr, int i, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerArray_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerArray = jcas.getRequiredFeatureDE(casType, "answerArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_answerArray  = (null == casFeat_answerArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerArray).getCode();

  }
}



    