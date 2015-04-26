




package org.xtext.assignment1.generator


import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.assignment1.einKauflist.Buyticket



/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EinKauflistGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className+".java", toJavaCode(resource.contents.head as Buyticket))
	}
	
	 def className(Resource res) {
 		 var name = res.URI.lastSegment
 		 name.substring(0, name.indexOf('.'))
 	 }
 



def toJavaCode(Buyticket bt) '''
 
 
 public class «bt.eResource.className» {
  
  «getCategoryVariables(bt)»
  
  public static void main(String[] args) {
   new «bt.eResource.className»().run();
  }
  
  protected void run() {
  		 countCategories();
  		 printOutputForCategories();
  		 
  	     System.out.println("-------------------");
  	     System.out.println("Price of all item: ");
  	     System.out.println(getSum());
  	     }
  	     
  	     «getMethodForCategoryCounting(bt)»
  	     
  	     «getMethodForSum(bt)»
  	     
  	     «getMethodPrintOutputForCategories(bt)»
  	     
  	     «getMethodCountCategories(bt)»
  	     
 }
 '''
 
 def getCategoryVariables(Buyticket bt)'''
 	«FOR category : bt.category»
 		private int «category.categoryName»;
 	«ENDFOR»
 '''
 
 def getMethodForCategoryCounting(Buyticket bt)'''
 	«FOR category : bt.category»
 		private void get«category.categoryName»(){
 		«category.categoryName» = 0;
 		
 		«FOR item : category.items»
 			«category.categoryName» += «item.price»; // «item.itemName»
 			
 		«ENDFOR»
 		}
 	«ENDFOR»
 '''
 
  def getMethodPrintOutputForCategories(Buyticket bt)'''
 	private void printOutputForCategories(){
 		«FOR category : bt.category»
 		System.out.println("«category.categoryName» :" +  «category.categoryName»);
 		«ENDFOR»
 		
 	}
 '''
 
   def getMethodCountCategories(Buyticket bt)'''
 		private void countCategories(){
 		«FOR category : bt.category»
 			get«category.categoryName»();
 		«ENDFOR»
 		}
 '''
 
 def getMethodForSum(Buyticket bt)'''
 		private int getSum(){
 		int sum = 0;
 		
 		«FOR category : bt.category»
 			sum += «category.categoryName»; // sum
 		«ENDFOR»
 		return sum;
 		}
 '''
 

 
 
 }
 