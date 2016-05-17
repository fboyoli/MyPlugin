package mytegraplugin;

import com.rhisco.tegra.bus.plugin.IPlugin;

public class TestApp {

	public static void main(String[] args) {
		IPlugin<Object> notNull = new NotNull<>();
		
		notNull.getPluginName();

	}

}
