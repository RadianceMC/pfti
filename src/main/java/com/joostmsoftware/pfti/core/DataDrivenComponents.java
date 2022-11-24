package com.joostmsoftware.pfti.core;

import net.fabricmc.loader.api.FabricLoader;


import java.io.File;
import java.nio.file.Path;

public class DataDrivenComponents {

    private static File getPetsFromData(String fileName) {
        Path path = FabricLoader.getInstance().getGameDir();
        return path.resolve("/data/{modid}/pets/" + fileName + ".json").toFile();
    }
}
