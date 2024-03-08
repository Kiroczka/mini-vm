package com.experimental.compilation


interface SyntaxElement

interface SyntaxType

enum class GeneralSyntaxType : SyntaxType {
    PROGRAM,
    STATEMENT,
    EXPRESSION,
    COMMENT
}

enum class StatementSyntaxType : SyntaxType {
    VAR_INIT,
    VAR_DECLARATION,
    FUN_DECLARATION,
}

enum class ContextSyntaxType : SyntaxType {
    ARGS,
    VAR_NAME,
    FUN_NAME,
    TYPE
}

enum class ExpressionSyntaxType : SyntaxType {
    FUN_CALL,
    ARITHMETIC,
    OPERATOR,
    FUN_CALL_ARGS,
    VAR,
    LITERAL
}