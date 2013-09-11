
/* First created by JCasGen Tue Sep 10 11:53:39 EDT 2013 */
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

/** ScoreScheme should be the output of a scoring component. It contains a set of whole raw data and an array of scores for all answers.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * @generated */
public class ScoreScheme_Type extends BaseType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoreScheme_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoreScheme_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoreScheme(addr, ScoreScheme_Type.this);
  			   ScoreScheme_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoreScheme(addr, ScoreScheme_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoreScheme.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.ScoreScheme");
 
  /** @generated */
  final Feature casFeat_rawData;
  /** @generated */
  final int     casFeatCode_rawData;
  /** @generated */ 
  public int getRawData(int addr) {
        if (featOkTst && casFeat_rawData == null)
      jcas.throwFeatMissing("rawData", "model.troy.hw.ScoreScheme");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rawData);
  }
  /** @generated */    
  public void setRawData(int addr, int v) {
        if (featOkTst && casFeat_rawData == null)
      jcas.throwFeatMissing("rawData", "model.troy.hw.ScoreScheme");
    ll_cas.ll_setRefValue(addr, casFeatCode_rawData, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scoreArray;
  /** @generated */
  final int     casFeatCode_scoreArray;
  /** @generated */ 
  public int getScoreArray(int addr) {
        if (featOkTst && casFeat_scoreArray == null)
      jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray);
  }
  /** @generated */    
  public void setScoreArray(int addr, int v) {
        if (featOkTst && casFeat_scoreArray == null)
      jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    ll_cas.ll_setRefValue(addr, casFeatCode_scoreArray, v);}
    
   /** @generated */
  public int getScoreArray(int addr, int i) {
        if (featOkTst && casFeat_scoreArray == null)
      jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i);
  }
   
  /** @generated */ 
  public void setScoreArray(int addr, int i, int v) {
        if (featOkTst && casFeat_scoreArray == null)
      jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scoreArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ScoreScheme_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rawData = jcas.getRequiredFeatureDE(casType, "rawData", "model.troy.hw.Block", featOkTst);
    casFeatCode_rawData  = (null == casFeat_rawData) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rawData).getCode();

 
    casFeat_scoreArray = jcas.getRequiredFeatureDE(casType, "scoreArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_scoreArray  = (null == casFeat_scoreArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoreArray).getCode();

  }
}



    