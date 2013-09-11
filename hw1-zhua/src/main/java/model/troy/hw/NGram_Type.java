
/* First created by JCasGen Sun Sep 08 13:03:09 EDT 2013 */
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
 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * @generated */
public class NGram_Type extends BaseAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.NGram");
 
  /** @generated */
  final Feature casFeat_tokenArray;
  /** @generated */
  final int     casFeatCode_tokenArray;
  /** @generated */ 
  public int getTokenArray(int addr) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray);
  }
  /** @generated */    
  public void setTokenArray(int addr, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenArray, v);}
    
   /** @generated */
  public int getTokenArray(int addr, int i) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  }
   
  /** @generated */ 
  public void setTokenArray(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenArray = jcas.getRequiredFeatureDE(casType, "tokenArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenArray  = (null == casFeat_tokenArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenArray).getCode();

  }
}



    