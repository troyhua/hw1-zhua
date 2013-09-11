

/* First created by JCasGen Tue Sep 10 11:53:39 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;


/** ScoreScheme should be the output of a scoring component. It contains a set of whole raw data and an array of scores for all answers.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class ScoreScheme extends BaseType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoreScheme.class);
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
  protected ScoreScheme() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ScoreScheme(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ScoreScheme(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: rawData

  /** getter for rawData - gets The whole set of data.

   * @generated */
  public Block getRawData() {
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_rawData == null)
      jcasType.jcas.throwFeatMissing("rawData", "model.troy.hw.ScoreScheme");
    return (Block)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_rawData)));}
    
  /** setter for rawData - sets The whole set of data.
 
   * @generated */
  public void setRawData(Block v) {
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_rawData == null)
      jcasType.jcas.throwFeatMissing("rawData", "model.troy.hw.ScoreScheme");
    jcasType.ll_cas.ll_setRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_rawData, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scoreArray

  /** getter for scoreArray - gets The array of scores for all the answers in the data.

   * @generated */
  public FSArray getScoreArray() {
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_scoreArray == null)
      jcasType.jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray)));}
    
  /** setter for scoreArray - sets The array of scores for all the answers in the data.
 
   * @generated */
  public void setScoreArray(FSArray v) {
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_scoreArray == null)
      jcasType.jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    jcasType.ll_cas.ll_setRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for scoreArray - gets an indexed value - 
   * @generated */
  public AnswerScore getScoreArray(int i) {
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_scoreArray == null)
      jcasType.jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray), i)));}

  /** indexed setter for scoreArray - sets an indexed value - 
   * @generated */
  public void setScoreArray(int i, AnswerScore v) { 
    if (ScoreScheme_Type.featOkTst && ((ScoreScheme_Type)jcasType).casFeat_scoreArray == null)
      jcasType.jcas.throwFeatMissing("scoreArray", "model.troy.hw.ScoreScheme");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ScoreScheme_Type)jcasType).casFeatCode_scoreArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    