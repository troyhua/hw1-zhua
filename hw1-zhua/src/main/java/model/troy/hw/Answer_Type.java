
/* First created by JCasGen Sun Sep 08 01:17:10 EDT 2013 */
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

/** Answer is the type for annotating answers in the document. Each instance represents one answer. It also stores the token and NGram information as well as if the answer is correct or not. Although we cannot directly get the corresponding question from this type, the scoring component should look into the Block type which contains answers and corresponding question.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * @generated */
public class Answer_Type extends BaseAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.Answer");
 
  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "model.troy.hw.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "model.troy.hw.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenArray;
  /** @generated */
  final int     casFeatCode_tokenArray;
  /** @generated */ 
  public int getTokenArray(int addr) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray);
  }
  /** @generated */    
  public void setTokenArray(int addr, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenArray, v);}
    
   /** @generated */
  public int getTokenArray(int addr, int i) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  }
   
  /** @generated */ 
  public void setTokenArray(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_nGramArray;
  /** @generated */
  final int     casFeatCode_nGramArray;
  /** @generated */ 
  public int getNGramArray(int addr) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray);
  }
  /** @generated */    
  public void setNGramArray(int addr, int v) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_nGramArray, v);}
    
   /** @generated */
  public int getNGramArray(int addr, int i) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
  }
   
  /** @generated */ 
  public void setNGramArray(int addr, int i, int v) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

 
    casFeat_tokenArray = jcas.getRequiredFeatureDE(casType, "tokenArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenArray  = (null == casFeat_tokenArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenArray).getCode();

 
    casFeat_nGramArray = jcas.getRequiredFeatureDE(casType, "nGramArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_nGramArray  = (null == casFeat_nGramArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGramArray).getCode();

  }
}



    