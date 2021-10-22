package org.elixir_lang.exunit

import com.intellij.psi.ResolveState
import org.elixir_lang.psi.call.Call
import org.elixir_lang.resolvesToModularName

object Assertions {
    fun resolvesTo(call: Call, state: ResolveState): Boolean =
            resolvesToModularName(call, state, "ExUnit.Assertions")
}
