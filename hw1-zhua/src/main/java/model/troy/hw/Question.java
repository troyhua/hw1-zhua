

/* First created by JCasGen Sun Sep 08 01:17:10 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


/** Question is the type for annotating questions in the document. It also stores the token information and NGram information.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class Question extends BaseAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: tokenArray

  /** getter for tokenArray - gets This stores all the tokens in this question.

   * @generated */
  public FSArray getTokenArray() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets This stores all the tokens in this question.
 
   * @generated */
  public void setTokenArray(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - 
   * @generated */
  public Token getTokenArray(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - 
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nGramArray

  /** getter for nGramArray - gets This stores all the NGram in this question. Because we do not need to output NGram with different length separatedly, there are not separated lists for different length of NGram. And a scoring component should consider all the NGrams and have different weights inside the component, so we do not provide separated lists here.

   * @generated */
  public FSArray getNGramArray() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray)));}
    
  /** setter for nGramArray - sets This stores all the NGram in this question. Because we do not need to output NGram with different length separatedly, there are not separated lists for different length of NGram. And a scoring component should consider all the NGrams and have different weights inside the component, so we do not provide separated lists here.
 
   * @generated */
  public void setNGramArray(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nGramArray - gets an indexed value - 
   * @generated */
  public NGram getNGramArray(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray), i)));}

  /** indexed setter for nGramArray - sets an indexed value - 
   * @generated */
  public void setNGramArray(int i, NGram v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_nGramArray == null)
      jcasType.jcas.throwFeatMissing("nGramArray", "model.troy.hw.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_nGramArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    