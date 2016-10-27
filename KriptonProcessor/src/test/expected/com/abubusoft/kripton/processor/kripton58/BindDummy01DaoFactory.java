package com.abubusoft.kripton.processor.kripton58;

import com.abubusoft.kripton.android.sqlite.BindDaoFactory;
import com.abubusoft.kripton.processor.kripton58.array.Bean01;
import com.abubusoft.kripton.processor.kripton58.array.DaoBean01;
import com.abubusoft.kripton.processor.kripton58.array.Dummy01DataSource;

/**
 * <p>
 * Represents dao factory interface for Dummy01DataSource.
 * This class expose database interface through Dao attribute.
 * </p>
 *
 * @see Dummy01DataSource
 * @see DaoBean01
 * @see BindDaoBean01
 * @see Bean01
 */
public interface BindDummy01DaoFactory extends BindDaoFactory {
  /**
   *
   * retrieve dao DaoBean01
   */
  BindDaoBean01 getDaoBean01();
}
