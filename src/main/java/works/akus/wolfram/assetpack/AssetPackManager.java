package works.akus.wolfram.assetpack;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

import works.akus.wolfram.Wolfram;

public class AssetPackManager {

	private final Wolfram plugin;
	private final ConcurrentHashMap<String, AssetPack> assetPacks;

	public AssetPackManager(final Wolfram plugin) {
		this.plugin = plugin;
		this.assetPacks = new ConcurrentHashMap<>();
	}

	public void load(final File directory) {

		assetPacks.put("namespace", new AssetPack("seafood", null));

	}

	public AssetPack byNamespace(final String namespace) {
		return assetPacks.get(namespace);
	}

}
