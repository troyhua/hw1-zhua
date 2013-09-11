

/* First created by JCasGen Tue Sep 10 11:38:53 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is the base class for all annotation types in the system. It has two additional features, source and confidence. Source is setted by the annotator to know where the annotation is from. Confidence is a measurement how confident the annotator is when generating the annotation. All annotation types in the system should be a subclass of this one.
 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class BaseAnnotationType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotationType.class);
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
  protected BaseAnnotationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotationType(JCas jcas, int begin, int end) {
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

  /** getter for source - gets A string feature for the annotator to provide information so that we can directly get where the annotation is generated.
   * @generated */
  public String getSource() {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseAnnotationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets A string feature for the annotator to provide information so that we can directly get where the annotation is generated. 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "model.troy.hw.BaseAnnotationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Annotator should provide a confidence score in this feature for every annotation type.
   * @generated */
  public double getConfidence() {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseAnnotationType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Annotator should provide a confidence score in this feature for every annotation type. 
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.troy.hw.BaseAnnotationType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_confidence, v);}    
  }

    