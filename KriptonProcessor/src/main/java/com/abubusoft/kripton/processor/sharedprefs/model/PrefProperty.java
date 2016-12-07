/*******************************************************************************
 * Copyright 2015, 2016 Francesco Benincasa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.abubusoft.kripton.processor.sharedprefs.model;

import javax.lang.model.element.Element;

import com.abubusoft.kripton.android.sharedprefs.PreferenceType;
import com.abubusoft.kripton.processor.bind.model.BindProperty;
import com.abubusoft.kripton.processor.core.ModelProperty;

public class PrefProperty extends ModelProperty {

	public PrefProperty(Element element) {
		super(element);
	}
	
	/**
	 * kind of preference associated
	 */
	protected PreferenceType preferenceType;
	
	/**
	 * <p>
	 * 		property definition to write method to manage
	 * </p>
	 */
	public BindProperty bindProperty;
		
	public PreferenceType getPreferenceType() {
		return preferenceType;
	}

	public void setPreferenceType(PreferenceType preferenceType) {
		this.preferenceType = preferenceType;
	}



}
