/*******************************************************************************
 * Copyright 2015, 2017 Francesco Benincasa (info@abubusoft.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.abubusoft.kripton.processor.sqlite.transform;

import com.abubusoft.kripton.processor.sqlite.model.SQLColumnType;
import com.squareup.javapoet.MethodSpec.Builder;

/**
 * Transformer between a string and a Java Integer object
 * 
 * @author Francesco Benincasa (info@abubusoft.com)
 *
 */
public class IntegerSQLTransform extends WrappedSQLTransformation {

	public IntegerSQLTransform(boolean nullable) {
		super(nullable);
		defaultValue = "0";
		if (nullable) {
			defaultValue = "null";
		}
		
		this.READ_FROM_CURSOR="$L.getInt($L)";
		this.WRITE_COSTANT="";
	}

	@Override
	public void generateDefaultValue(Builder methodBuilder) {
		methodBuilder.addCode(defaultValue);
	}

	@Override
	public SQLColumnType getColumnType() {
		return SQLColumnType.INTEGER;
	}

}
