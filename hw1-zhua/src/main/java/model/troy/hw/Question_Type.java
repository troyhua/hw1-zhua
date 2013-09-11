
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

/** Question is the type for annotating questions in the document. It also stores the token information and NGram information.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * @generated */
public class Question_Type extends BaseAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.Question");



  /** @generated */
  final Feature casFeat_tokenArray;
  /** @generated */
  final int     casFeatCode_tokenArray;
  /** @generated */ 
  public int getTokenArray(int addr) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray);
  }
  /** @generated */    
  public void setTokenArray(int addr, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenArray, v);}
    
   /** @generated */
  public int getTokenArray(int addr, int i) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  }
   
  /** @generated */ 
  public void setTokenArray(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
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
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray);
  }
  /** @generated */    
  public void setNGramArray(int addr, int v) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_nGramArray, v);}
    
   /** @generated */
  public int getNGramArray(int addr, int i) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
  }
   
  /** @generated */ 
  public void setNGramArray(int addr, int i, int v) {
        if (featOkTst && casFeat_nGramArray == null)
      jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_nGramArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenArray = jcas.getRequiredFeatureDE(casType, "tokenArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenArray  = (null == casFeat_tokenArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenArray).getCode();

 
    casFeat_nGramArray = jcas.getRequiredFeatureDE(casType, "nGramArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_nGramArray  = (null == casFeat_nGramArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGramArray).getCode();

  }
}



    