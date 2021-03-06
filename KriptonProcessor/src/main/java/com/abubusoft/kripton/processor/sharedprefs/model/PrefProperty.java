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
package com.abubusoft.kripton.processor.sharedprefs.model;

import java.util.List;

import javax.lang.model.element.Element;

import com.abubusoft.kripton.android.annotation.BindPreference;
import com.abubusoft.kripton.android.sharedprefs.PreferenceType;
import com.abubusoft.kripton.common.CaseFormat;
import com.abubusoft.kripton.common.Converter;
import com.abubusoft.kripton.common.StringUtils;
import com.abubusoft.kripton.processor.core.AnnotationAttributeType;
import com.abubusoft.kripton.processor.core.ManagedModelProperty;
import com.abubusoft.kripton.processor.core.ModelAnnotation;
import com.abubusoft.kripton.processor.core.ModelEntity;
import com.abubusoft.kripton.processor.core.reflect.AnnotationUtility;

public class PrefProperty extends ManagedModelProperty {

	private static Converter<String, String> converter = CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE);

	public PrefProperty(@SuppressWarnings("rawtypes") ModelEntity entity, Element element, List<ModelAnnotation> modelAnnotations) {
		super(entity, element, modelAnnotations);

		String name = AnnotationUtility.extractAsString(element, BindPreference.class, AnnotationAttributeType.VALUE);
		if (!StringUtils.hasText(name)) {
			name = converter.convert(element.getSimpleName().toString());
		}

		preferenceKey = name;
	}

	protected String preferenceKey;

	public String getPreferenceKey() {
		return preferenceKey;
	}

	/**
	 * kind of preference associated
	 */
	protected PreferenceType preferenceType;

	public PreferenceType getPreferenceType() {
		return preferenceType;
	}

	public void setPreferenceType(PreferenceType preferenceType) {
		this.preferenceType = preferenceType;
	}

}
