

/* First created by JCasGen Sun Sep 08 01:17:10 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


import org.apache.uima.jcas.tcas.Annotation;


/** The base type of all non-annotation types. Fields are similar to BaseAnnotationType.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class BaseType extends TOP {
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

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets A string feature for the annotator to provide information so that we can directly get where the annotation is generated.

   * @generated */
  public String getSource() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets A string feature for the annotator to provide information so that we can directly get where the annotation is generated.
 
   * @generated */
  public void setSource(String v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseType");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Annotators should provide a confidence score in this feature for every type.

   * @generated */
  public float getConfidence() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseType");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Annotators should provide a confidence score in this feature for every type.
 
   * @generated */
  public void setConfidence(float v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseType");
    jcasType.ll_cas.ll_setFloatValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence, v);}    
  }

    