package com.abubusoft.kripton.processor.sqlite.transform;

import com.abubusoft.kripton.processor.core.ModelProperty;
import com.squareup.javapoet.MethodSpec.Builder;
import com.squareup.javapoet.TypeName;

/**
 * 
 * Class implementing this interface can be used to generate code to read and write the property
 * 
 * @author xcesco
 *
 */
public interface Transform {

	/**
	 * Generate code to put into cursor, the bean property value
	 * @param beanClass 
	 */
	void generateReadProperty(Builder methodBuilder, TypeName beanClass, String beanName, ModelProperty property, String cursorName, String indexName);
	
	/**
	 * Generate code to read from cursor
	 * 
	 * @param methodBuilder
	 * @param cursorName
	 * @param indexName
	 */
	void generateRead(Builder methodBuilder, String cursorName, String indexName);

	/**
	 * Generate default value, null or 0 or ''
	 * 
	 * @param methodBuilder	 * 
	 */
	void generateDefaultValue(Builder methodBuilder);

	/**
	 * Generate a string representing code to write property
	 * 
	 * 
	 * @param methodBuilder
	 * @param property
	 *            property to write
	 * @param beanName
	 */
	void generateWriteProperty(Builder methodBuilder, TypeName beanClass, String beanName, ModelProperty property);

	/**
	 * Generate code to set property to null value or default value
	 * 
	 * @param methodBuilder
	 * @param property
	 * @param beanName
	 * @param cursorName
	 * @param indexName
	 */
	void generateResetProperty(Builder methodBuilder, TypeName beanClass, String beanName, ModelProperty property,  String cursorName, String indexName);

	/**
	 * Generate code to define column
	 * 
	 * @param property
	 */
	String generateColumnType(ModelProperty property);

	/**
	 * <p>Generate name</p>
	 * @param methodBuilder
	 * @param objectName
	 */
	void generateWriteProperty(Builder methodBuilder, String objectName);

}