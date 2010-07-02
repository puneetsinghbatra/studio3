package com.aptana.editor.js.parsing.ast;

public class JSGroupNode extends JSPreUnaryOperatorNode
{
	/**
	 * JSGroupNode
	 * 
	 * @param expression
	 */
	public JSGroupNode(JSNode expression)
	{
		super(JSNodeTypes.GROUP, expression);
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.js.parsing.ast.JSNode#accept(com.aptana.editor.js.parsing.ast.JSTreeWalker)
	 */
	@Override
	public void accept(JSTreeWalker walker)
	{
		walker.visit(this);
	}
}
