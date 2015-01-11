package universalteam.universalpower.libs;

import net.minecraftforge.fml.common.Mod;

import java.lang.annotation.Annotation;

public class ModBase implements Mod
{

    @Override
    public String modid() {
        return Book.MOD_ID;
    }

    @Override
    public String name() {
        return Book.MOD_NAME;
    }

    @Override
    public String version() {
        return Book.VERSION;
    }

    @Override
    public String dependencies() {
        return null;//required-after:UniversalCore
    }

    @Override
    public boolean useMetadata() {
        return false;
    }

    @Override
    public String acceptedMinecraftVersions() {
        return "1.8";
    }

    @Override
    public String acceptableRemoteVersions() {
        return null;
    }

    @Override
    public String acceptableSaveVersions() {
        return null;
    }

    @Override
    public String bukkitPlugin() {
        return null;
    }

    @Override
    public String certificateFingerprint() {
        return null;
    }

    @Override
    public String modLanguage() {
        return "java";
    }

    @Override
    public String asmHookClass() {
        return null;
    }

    @Override
    public boolean canBeDeactivated() {
        return false;
    }

    @Override
    public String guiFactory() {
        return null;
    }

    @Override
    public CustomProperty[] customProperties() {
        return new CustomProperty[0];
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
