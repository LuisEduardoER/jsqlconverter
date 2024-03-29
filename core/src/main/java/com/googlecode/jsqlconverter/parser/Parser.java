package com.googlecode.jsqlconverter.parser;

import com.googlecode.jsqlconverter.parser.callback.ParserCallback;

import java.util.logging.Logger;

public abstract class Parser {
	protected static final Logger LOG = Logger.getLogger(Parser.class.getName());

	public abstract void parse(ParserCallback callback) throws ParserException;
}
