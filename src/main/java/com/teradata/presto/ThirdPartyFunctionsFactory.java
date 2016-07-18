package com.teradata.presto;

import com.facebook.presto.metadata.FunctionFactory;
import com.facebook.presto.metadata.SqlFunction;

import java.util.List;

public class ThirdPartyFunctionsFactory
    implements FunctionFactory
{
    public List<SqlFunction> listFunctions()
    {
        return null;
    }
}
