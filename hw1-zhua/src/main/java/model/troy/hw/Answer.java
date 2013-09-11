

/* First created by JCasGen Sun Sep 08 01:17:10 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


/** Answer is the type for annotating answers in the document. Each instance represents one answer. It also stores the token and NGram information as well as if the answer is correct or not. Although we cannot directly get the corresponding question from this type, the scoring component should look into the Block type which contains answers and corresponding question.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class Answer extends BaseAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets Whether the answer is correct for the corresponding question.

   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.troy.hw.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Whether the answer is correct for the corresponding question.
 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "model.troy.hw.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: tokenArray

  /** getter for tokenArray - gets This stores all the tokens in this answer.

   * @generated */
  public FSArray getTokenArray() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets This stores all the tokens in this answer.
 
   * @generated */
  public void setTokenArray(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - 
   * @generated */
  public Token getTokenArray(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - 
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nGramArray

  /** getter for nGramArray - gets  This stores all the NGrams in this answer.

   * @generated */
  public FSArray getNGramArray() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray)));}
    
  /** setter for nGramArray - sets  This stores all the NGrams in this answer.
 
   * @generated */
  public void setNGramArray(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nGramArray - gets an indexed value - 
   * @generated */
  public NGram getNGramArray(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray), i)));}

  /** indexed setter for nGramArray - sets an indexed value - 
   * @generated */
  public void setNGramArray(int i, NGram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_nGramArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    