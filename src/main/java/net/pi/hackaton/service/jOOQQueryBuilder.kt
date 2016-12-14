package net.pi.hackaton.service

import org.jooq.SQLDialect
import org.jooq.impl.DefaultDSLContext
import org.jooq.impl.DSL.field
import org.springframework.stereotype.Service

@Service
class jOOQQueryBuilder : QueryBuilder {

    override fun sql(input: Query): String {


        val defaultDSLContext = DefaultDSLContext(SQLDialect.DEFAULT)
        val selectStatement = defaultDSLContext
                .select(input.fields.toList().map { x -> field(x) })
                .from(input.table);

        if (input.getCondition() != null) {
            selectStatement.where(input.getCondition())
        }

        return selectStatement.getSQL();
    }
}
