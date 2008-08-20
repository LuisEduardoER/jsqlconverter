package com.googlecode.jsqlconverter.definition.type;

public interface Type {
	/*
		// TODO: The following were taken from java.sql.Types and may need to be supported at some point

		public final static int DECIMAL		=   3;
		public final static int LONGVARCHAR 	=  -1;
		public final static int DATE 		=  91;
		public final static int TIME 		=  92;
		public final static int LONGVARBINARY 	=  -4;
		public final static int OTHER		= 1111;

		public final static int JAVA_OBJECT         = 2000;
		public final static int DISTINCT            = 2001;
		public final static int STRUCT              = 2002;
		public final static int ARRAY               = 2003;
		public final static int CLOB                = 2005;
		public final static int REF                 = 2006;

		public final static int DATALINK = 70;
		public final static int ROWID = -8;
		public static final int LONGNVARCHAR = -16;
		public static final int NCLOB = 2011;
		public static final int SQLXML = 2009;
	 */

	/*
	BIGSERIAL,
	UNKNOWN;
	*/

	/*
	PLUS, MINUS, TIMES, DIVIDE;

	// Do arithmetic op represented by this constant
	double eval(double x, double y){
		switch(this) {
			case PLUS:   return x + y;
			case MINUS:  return x - y;
			case TIMES:  return x * y;
			case DIVIDE: return x / y;
		}
		throw new AssertionError("Unknown op: " + this);
	}*/
}
