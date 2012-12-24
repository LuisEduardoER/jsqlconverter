package com.googlecode.jsqlconverter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.googlecode.jsqlconverter.definition.TestStatementSort;
import com.googlecode.jsqlconverter.parser.TestDelimitedParser;
import com.googlecode.jsqlconverter.parser.TestParserTypeMappingHandled;
import com.googlecode.jsqlconverter.producer.TestAccessMDBProducer;
import com.googlecode.jsqlconverter.producer.TestJDBCProducer;
import com.googlecode.jsqlconverter.producer.TestPostgreSQLProducer;
import com.googlecode.jsqlconverter.producer.TestProducerTypeMappingHandled;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	// statement
	TestStatementSort.class,

	// parser
	TestParserTypeMappingHandled.class,
	TestDelimitedParser.class,

	// producer
	TestProducerTypeMappingHandled.class,
	TestAccessMDBProducer.class,
	TestPostgreSQLProducer.class,
	TestJDBCProducer.class
})

public class AllTestSuite {

}