
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
 * Updated by JCasGen Sun Sep 08 13:03:09 EDT 2013
 * @generated */
public class Evaluation_Type extends BaseType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.troy.hw.Evaluation");
 
  /** @generated */
  final Feature casFeat_N;
  /** @generated */
  final int     casFeatCode_N;
  /** @generated */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "model.troy.hw.Evaluation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_N);
  }
  /** @generated */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "model.troy.hw.Evaluation");
    ll_cas.ll_setIntValue(addr, casFeatCode_N, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "model.troy.hw.Evaluation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "model.troy.hw.Evaluation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_N = jcas.getRequiredFeatureDE(casType, "N", "uima.cas.Integer", featOkTst);
    casFeatCode_N  = (null == casFeat_N) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_N).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    