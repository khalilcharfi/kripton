package sqlite.feature.schema;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import com.abubusoft.kripton.android.Logger;
import com.abubusoft.kripton.android.sqlite.DataSourceOptions;
import com.abubusoft.kripton.android.sqlite.SQLiteUpdateTaskHelper;
import com.abubusoft.kripton.android.sqlite.SQLiteUpdateTestHelper;

import base.BaseAndroidTest;
import sqlite.feature.schema.version2.BindSchoolDataSource;

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class TestSchemaUpdater3 extends BaseAndroidTest {

	
	/**
	 * 
	 * Destroy and recreate everything
	 * 
	 */
	@Test
	public void testCustomUpdateSingleStep() {
		SQLiteUpdateTestHelper.resetInstance(BindSchoolDataSource.class);
		BindSchoolDataSource.build(DataSourceOptions.builder().addUpdateTask(3, "schemas/school_update_2_3.sql").build());
							
		SQLiteUpdateTaskHelper.forceSchemaUpdate(BindSchoolDataSource.instance(), 3);
				
		SQLiteUpdateTaskHelper.verifySchema(BindSchoolDataSource.instance(), "schemas/school_schema_2.sql");
		
		Logger.info("finish");
	}
	


}
