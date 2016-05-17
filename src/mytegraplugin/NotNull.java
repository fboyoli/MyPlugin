package mytegraplugin;

import java.util.List;

import com.rhisco.tegra.bus.plugin.IPlugin;

public class NotNull<T> implements IPlugin<T> {

	@Override
	public List<String> getParamType() {
		System.out.println("Called getParamType()");
		return null;
	}

	@Override
	public String getPluginName() {
		System.out.println("Called getPluginName()");
		return null;
	}

	@Override
	public boolean hasError() {
		System.out.println("Called hasError()");
		return false;
	}

	@Override
	public Object run(List<Object> arg0) {
		System.out.println("Called run()");
		return null;
	}

}
