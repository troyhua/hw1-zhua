

/* First created by JCasGen Sun Sep 08 13:03:09 EDT 2013 */
package model.troy.hw;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An evaluation component should take a ScoreScheme as input and output an Evaluation instance. This class contains the evaluation metric score and other parameters regarding different measurements. For other evaluation metrics, Evaluation class can be extended to add more metrics.

 * Updated by JCasGen Tue Sep 10 21:56:18 EDT 2013
 * XML source: /Users/troy/git/hw1-zhua/hw1-zhua/src/main/resources/hw1-zhua-typesystem.xml
 * @generated */
public class Evaluation extends BaseType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
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
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: N

  /** getter for N - gets N is the one in precision at N, which is also the total number of correct answers.
   * @generated */
  public int getN() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "model.troy.hw.Evaluation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluation_Type)jcasType).casFeatCode_N);}
    
  /** setter for N - sets N is the one in precision at N, which is also the total number of correct answers. 
   * @generated */
  public void setN(int v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "model.troy.hw.Evaluation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluation_Type)jcasType).casFeatCode_N, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets The precision at N.
   * @generated */
  public double getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.troy.hw.Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets The precision at N. 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "model.troy.hw.Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: rawScore

  /** getter for rawScore - gets The original score from a scoring component.

   * @generated */
  public ScoreScheme getRawScore() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_rawScore == null)
      jcasType.jcas.throwFeatMissing("rawScore", "model.troy.hw.Evaluation");
    return (ScoreScheme)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_rawScore)));}
    
  /** setter for rawScore - sets The original score from a scoring component.
 
   * @generated */
  public void setRawScore(ScoreScheme v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_rawScore == null)
      jcasType.jcas.throwFeatMissing("rawScore", "model.troy.hw.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_rawScore, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    