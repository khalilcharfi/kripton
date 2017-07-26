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
package sqlite.feat.foreignKey;

import java.util.List;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlParam;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;
import com.abubusoft.kripton.android.annotation.BindSqlUpdate;

import sqlite.feat.foreignKey.BeanA_2;

@BindDao(BeanA_2.class)
public interface DaoBeanA_2 {
	@BindSqlSelect
	List<BeanA_2> selectAll();
	
	@BindSqlSelect(where="id=${id}")
	List<BeanA_2> selectById(long id);
	
	@BindSqlSelect(fields="id",where="valueString2=${dummy}")
	List<BeanA_2> selectByString(@BindSqlParam("dummy") String value);
	
	@BindSqlInsert
	int insert(BeanA_2 bean);
	
	@BindSqlUpdate(where="valueString2=${bean.valueString2}")
	int update(BeanA_2 bean);
}