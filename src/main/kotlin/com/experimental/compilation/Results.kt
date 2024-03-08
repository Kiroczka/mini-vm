package com.experimental.compilation

import com.experimental.model.Program

sealed interface CompileResult
data object FailedCompileResult : CompileResult
sealed interface SuccessCompileResult : CompileResult
class RequireMoreCompilationResult(
    val codeParts: List<CodeToCompile>,
    val lastIndex: Int
) : SuccessCompileResult

open class SuccessFinalResult(
    open val value: SyntaxElement,
    val lastIndex: Int
) : SuccessCompileResult

class ProgramFinalResult(
    override val value: Program,
    lastIndex: Int
) : SuccessFinalResult(value, lastIndex)


class CodeToCompile(
    val type: SyntaxType,
    val code: String
)