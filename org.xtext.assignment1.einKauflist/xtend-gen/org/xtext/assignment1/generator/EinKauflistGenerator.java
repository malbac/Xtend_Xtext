package org.xtext.assignment1.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.assignment1.einKauflist.Buyticket;
import org.xtext.assignment1.einKauflist.Category;
import org.xtext.assignment1.einKauflist.Item;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EinKauflistGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".java");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _javaCode = this.toJavaCode(((Buyticket) _head));
    fsa.generateFile(_plus, _javaCode);
  }
  
  public String className(final Resource res) {
    String _xblockexpression = null;
    {
      URI _uRI = res.getURI();
      String name = _uRI.lastSegment();
      int _indexOf = name.indexOf(".");
      _xblockexpression = name.substring(0, _indexOf);
    }
    return _xblockexpression;
  }
  
  public CharSequence toJavaCode(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    Resource _eResource = bt.eResource();
    String _className = this.className(_eResource);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    CharSequence _categoryVariables = this.getCategoryVariables(bt);
    _builder.append(_categoryVariables, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("new ");
    Resource _eResource_1 = bt.eResource();
    String _className_1 = this.className(_eResource_1);
    _builder.append(_className_1, "  ");
    _builder.append("().run();");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("protected void run() {");
    _builder.newLine();
    _builder.append(" \t\t ");
    _builder.append("countCategories();");
    _builder.newLine();
    _builder.append(" \t\t ");
    _builder.append("printOutputForCategories();");
    _builder.newLine();
    _builder.append(" \t\t ");
    _builder.newLine();
    _builder.append(" \t     ");
    _builder.append("System.out.println(\"-------------------\");");
    _builder.newLine();
    _builder.append(" \t     ");
    _builder.append("System.out.println(\"Price of all item: \");");
    _builder.newLine();
    _builder.append(" \t     ");
    _builder.append("System.out.println(getSum());");
    _builder.newLine();
    _builder.append(" \t     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t     ");
    _builder.newLine();
    _builder.append(" \t     ");
    CharSequence _methodForCategoryCounting = this.getMethodForCategoryCounting(bt);
    _builder.append(_methodForCategoryCounting, " \t     ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t     ");
    _builder.newLine();
    _builder.append(" \t     ");
    CharSequence _methodForSum = this.getMethodForSum(bt);
    _builder.append(_methodForSum, " \t     ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t     ");
    _builder.newLine();
    _builder.append(" \t     ");
    CharSequence _methodPrintOutputForCategories = this.getMethodPrintOutputForCategories(bt);
    _builder.append(_methodPrintOutputForCategories, " \t     ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t     ");
    _builder.newLine();
    _builder.append(" \t     ");
    CharSequence _methodCountCategories = this.getMethodCountCategories(bt);
    _builder.append(_methodCountCategories, " \t     ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t     ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCategoryVariables(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Category> _category = bt.getCategory();
      for(final Category category : _category) {
        _builder.append("private int ");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence getMethodForCategoryCounting(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Category> _category = bt.getCategory();
      for(final Category category : _category) {
        _builder.append("private void get");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        String _categoryName_1 = category.getCategoryName();
        _builder.append(_categoryName_1, "");
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          EList<Item> _items = category.getItems();
          for(final Item item : _items) {
            String _categoryName_2 = category.getCategoryName();
            _builder.append(_categoryName_2, "");
            _builder.append(" += ");
            int _price = item.getPrice();
            _builder.append(_price, "");
            _builder.append("; // ");
            String _itemName = item.getItemName();
            _builder.append(_itemName, "");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence getMethodPrintOutputForCategories(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void printOutputForCategories(){");
    _builder.newLine();
    {
      EList<Category> _category = bt.getCategory();
      for(final Category category : _category) {
        _builder.append("\t");
        _builder.append("System.out.println(\"");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "\t");
        _builder.append(" :\" +  ");
        String _categoryName_1 = category.getCategoryName();
        _builder.append(_categoryName_1, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getMethodCountCategories(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void countCategories(){");
    _builder.newLine();
    {
      EList<Category> _category = bt.getCategory();
      for(final Category category : _category) {
        _builder.append("get");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getMethodForSum(final Buyticket bt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private int getSum(){");
    _builder.newLine();
    _builder.append("int sum = 0;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Category> _category = bt.getCategory();
      for(final Category category : _category) {
        _builder.append("sum += ");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "");
        _builder.append("; // sum");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("return sum;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
