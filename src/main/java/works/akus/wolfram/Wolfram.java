package works.akus.wolfram;

import org.bukkit.plugin.java.JavaPlugin;

import works.akus.wolfram.assetpack.AssetPackManager;

public class Wolfram extends JavaPlugin {

	public static final String NAMESPACE = "wolfram";

	private static Wolfram instance;

	private AssetPackManager assetPackManager;

	@Override
	public void onLoad() {
		this.assetPackManager = new AssetPackManager(this);
		
	}

	@Override
	public void onEnable() {

	}

	public static Wolfram instance() {
		return instance;
	}

	public AssetPackManager assetPackManager() {
		return assetPackManager;
	}

}
