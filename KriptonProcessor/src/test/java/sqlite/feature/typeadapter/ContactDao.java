package sqlite.feature.typeadapter;

import java.util.List;

import com.abubusoft.kripton.android.annotation.BindDao;
import com.abubusoft.kripton.android.annotation.BindSqlInsert;
import com.abubusoft.kripton.android.annotation.BindSqlSelect;
import com.abubusoft.kripton.android.annotation.BindSqlUpdate;
import com.abubusoft.kripton.android.sqlite.OnReadBeanListener;

@BindDao(Contact.class)
public interface ContactDao {

	//@BindSqlInsert
	//void insert(Contact bean);

	//@BindSqlUpdate(where = "id=${bean.id}")
	//long update(Contact bean);

//	@BindSqlDelete(where = "id=${bean.id}")
//	long delete(Contact bean);
//
	//@BindSqlSelect(where = "id=${bean.id}")
	//List<Contact> selectAll(Contact bean);
	
	@BindSqlSelect(where = "id=${bean.id} and password=${bean.password}")
	void selectAll(Contact bean, OnReadBeanListener<Contact> listener);
}