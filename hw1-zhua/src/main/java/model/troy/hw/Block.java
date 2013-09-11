

/* First created by JCasGen Tue Sep 10 11:38:53 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


/** Block contains one question and an array of answers corresponding to this question. It is a unit of a whole instance of raw data of the task.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class Block extends BaseAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Block.class);
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
  protected Block() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Block(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Block(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Block(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets  The question in this text block.

   * @generated */
  public Question getQuestion() {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.troy.hw.Block");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets  The question in this text block.
 
   * @generated */
  public void setQuestion(Question v) {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "model.troy.hw.Block");
    jcasType.ll_cas.ll_setRefValue(addr, ((Block_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerArray

  /** getter for answerArray - gets  An array of all answers in this text block.

   * @generated */
  public FSArray getAnswerArray() {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray)));}
    
  /** setter for answerArray - sets  An array of all answers in this text block.
 
   * @generated */
  public void setAnswerArray(FSArray v) {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    jcasType.ll_cas.ll_setRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerArray - gets an indexed value - 
   * @generated */
  public Answer getAnswerArray(int i) {
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray), i)));}

  /** indexed setter for answerArray - sets an indexed value - 
   * @generated */
  public void setAnswerArray(int i, Answer v) { 
    if (Block_Type.featOkTst && ((Block_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "model.troy.hw.Block");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Block_Type)jcasType).casFeatCode_answerArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    