

/* First created by JCasGen Sun Sep 08 13:03:09 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class NGram extends BaseAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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

  /** getter for tokenArray - gets 
   * @generated */
  public FSArray getTokenArray() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets  
   * @generated */
  public void setTokenArray(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - 
   * @generated */
  public Token getTokenArray(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - 
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "model.troy.hw.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    