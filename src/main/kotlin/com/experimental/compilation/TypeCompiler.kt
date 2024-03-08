package com.experimental.compilation

import com.experimental.Keywords
import com.experimental.context.Type
import com.experimental.exceptions.UnknownTypeException

class TypeCompiler : Compiler {

    override fun compile(code: String): SuccessFinalResult {
        val type = resolveType(code)
        return SuccessFinalResult(type, code.length - 1)
    }

    private fun resolveType(type: String): Type {
        if (type == Keywords.VAR_KEYWORD) {
            return Type.NOT_SPECIFIED
        }
        if (!Type.entries.any {
                it.name == type.uppercase()
            }) {
            throw UnknownTypeException(type)
        }
        return Type.valueOf(type.uppercase())
    }

    override fun getType(): SyntaxType = ContextSyntaxType.TYPE
}