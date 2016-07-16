// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirQuoteCharListBodyImpl extends ASTWrapperPsiElement implements ElixirQuoteCharListBody {

  public ElixirQuoteCharListBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitQuoteCharListBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ElixirEscapedCharacter> getEscapedCharacterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEscapedCharacter.class);
  }

  @Override
  @NotNull
  public List<ElixirEscapedEol> getEscapedEolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEscapedEol.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolation> getInterpolationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolation.class);
  }

  @Override
  @NotNull
  public List<ElixirQuoteHexadecimalEscapeSequence> getQuoteHexadecimalEscapeSequenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirQuoteHexadecimalEscapeSequence.class);
  }

}
