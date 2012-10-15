package org.webjars.services;

import org.apache.tapestry5.ioc.MappedConfiguration;

public class AppModule {
    public static void contributeClasspathAssetAliasManager(MappedConfiguration<String, String> configuration) {
        configuration.add("webjars", "META-INF/resources/webjars");
    }
}
