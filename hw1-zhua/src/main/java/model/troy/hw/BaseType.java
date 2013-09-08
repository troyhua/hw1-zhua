

/* First created by JCasGen Sun Sep 08 01:17:10 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Sep 08 13:03:09 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class BaseType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public String getSource() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(String v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseType");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence, v);}    
  }

    