package com.abubusoft.kripton.processor.core.reflect;

import java.util.List;

import javax.lang.model.type.TypeMirror;

import com.abubusoft.kripton.common.Pair;
import com.abubusoft.kripton.processor.core.ModelAnnotation;
import com.abubusoft.kripton.processor.sqlite.SQLiteSelectBuilder.SelectResultType;
import com.abubusoft.kripton.processor.sqlite.model.SQLiteModelMethod;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;

public class JavaDocUtility {

	public static void generateJavaDocForSelect(MethodSpec.Builder methodBuilder, String sql, List<String> sqlParams, SQLiteModelMethod method, ModelAnnotation annotation, String fieldStatement, SelectResultType selectResultType)
	{		
		methodBuilder.addJavadoc("<p>Select query is:</p>\n", annotation.getSimpleName());
		methodBuilder.addJavadoc("<pre>$L</pre>\n\n",sql);
		
		methodBuilder.addJavadoc("<p>Its parameters are:</p>\n\n");
		methodBuilder.addJavadoc("<pre>[");
		String separator="";
		for (String param: sqlParams)
		{
			methodBuilder.addJavadoc(separator+"$L",param);
			separator=", ";
		}
		methodBuilder.addJavadoc("]</pre>\n\n");
		methodBuilder.addJavadoc("<p>Projected column are:</p>\n\n");
		methodBuilder.addJavadoc("<pre>[$L]</pre>\n\n",fieldStatement);
		
		
		ParameterSpec parameterSpec;
		for (Pair<String, TypeMirror> item : method.getParameters()) {
			parameterSpec = ParameterSpec.builder(TypeName.get(item.value1), item.value0).build();
			
			methodBuilder.addJavadoc("@param $L\n", parameterSpec.name);
		}
		
		switch(selectResultType)
		{
		case BEAN:
			methodBuilder.addJavadoc("\n@return selected bean or <code>null</code>.\n");
			break;
		case CURSOR:
			methodBuilder.addJavadoc("\n@return cursor. Closing the cursor is delegated to the calling code.\n");
			break;
		case LIST_BEAN:
			methodBuilder.addJavadoc("\n@return list of bean or empty list.\n");
			break;
		case LIST_SCALAR:
			methodBuilder.addJavadoc("\n@return list of single value extracted with query.\n");
			break;
		case LISTENER_BEAN:
		case LISTENER_CURSOR:		
			break;
		case SCALAR:
			methodBuilder.addJavadoc("\n@return single value extracted with query.\n");
			break;
		}
	}
}