

/* First created by JCasGen Tue Sep 10 11:38:53 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Sep 10 21:13:16 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class AnswerArray extends BaseAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerArray.class);
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
  protected AnswerArray() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerArray(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerArray(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerArray(JCas jcas, int begin, int end) {
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
  //* Feature: answerArray

  /** getter for answerArray - gets 
   * @generated */
  public FSArray getAnswerArray() {
    if (AnswerArray_Type.featOkTst && ((AnswerArray_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray)));}
    
  /** setter for answerArray - sets  
   * @generated */
  public void setAnswerArray(FSArray v) {
    if (AnswerArray_Type.featOkTst && ((AnswerArray_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerArray - gets an indexed value - 
   * @generated */
  public Answer getAnswerArray(int i) {
    if (AnswerArray_Type.featOkTst && ((AnswerArray_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray), i)));}

  /** indexed setter for answerArray - sets an indexed value - 
   * @generated */
  public void setAnswerArray(int i, Answer v) { 
    if (AnswerArray_Type.featOkTst && ((AnswerArray_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.AnswerArray");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerArray_Type)jcasType).casFeatCode_answerArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    