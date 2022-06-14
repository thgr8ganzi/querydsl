package com.querydsl.dialect;

import org.hibernate.dialect.PostgresPlusDialect;
import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class PostgresDialect extends PostgresPlusDialect {
    public PostgresDialect() {
        registerFunction(
                "replace", new StandardSQLFunction("replace", StandardBasicTypes.STRING)

        );
        registerFunction(
                "rownum", new NoArgSQLFunction("rownum", StandardBasicTypes.LONG, false)
        );
    }
}
