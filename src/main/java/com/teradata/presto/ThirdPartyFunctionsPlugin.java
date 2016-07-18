package com.teradata.presto;

import com.facebook.presto.spi.Plugin;

import java.util.List;

public class ThirdPartyFunctionsPlugin
    implements Plugin
{
    public <T> List<T> getServices(Class<T> aClass)
    {
        return null;
    }
}
