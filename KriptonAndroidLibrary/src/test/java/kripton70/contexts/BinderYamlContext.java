package kripton70.contexts;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import kripton70.core.AbstractBinderContext;
import kripton70.core.BinderType;

/**
 * @author Francesco Benincasa (abubusoft@gmail.com)
 *
 */
public class BinderYamlContext extends AbstractBinderContext {

	@Override
	public BinderType getSupportedFormat()
	{
		return BinderType.YAML;
	}
	
	@Override
	public JsonFactory createInnerFactory()
	{
		return new YAMLFactory();
	}
	
}
