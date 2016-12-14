package net.pi.hackaton.service

import org.jooq.SQLDialect
import org.jooq.impl.DefaultDSLContext
import org.jooq.impl.DSL.field

class jOOQQueryBuilder : QueryBuilder {

    override fun sql(input: Query): String {

        val defaultDSLContext = DefaultDSLContext(SQLDialect.DEFAULT)
        val sql = defaultDSLContext
                .select(input.fields.toList().map { x -> field(x) })
                .from(input.table).getSQL()
        return sql
    }
}
