package config;

public class ConfigAccess
{
    private static Config config = new Config();

    public static Config getConfig()
    {
        return config;
    }
}
