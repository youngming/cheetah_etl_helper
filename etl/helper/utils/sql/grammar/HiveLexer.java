// $ANTLR 3.5.2 grammar/HiveLexer.g 2020-11-05 18:51:32

package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int BigintLiteral=7;
	public static final int ByteLengthLiteral=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int CharSetLiteral=12;
	public static final int CharSetName=13;
	public static final int DIV=14;
	public static final int DIVIDE=15;
	public static final int DOLLAR=16;
	public static final int DOT=17;
	public static final int DecimalLiteral=18;
	public static final int Digit=19;
	public static final int EQUAL=20;
	public static final int EQUAL_NS=21;
	public static final int Exponent=22;
	public static final int GREATERTHAN=23;
	public static final int GREATERTHANOREQUALTO=24;
	public static final int HexDigit=25;
	public static final int Identifier=26;
	public static final int KW_ABORT=27;
	public static final int KW_ADD=28;
	public static final int KW_ADMIN=29;
	public static final int KW_AFTER=30;
	public static final int KW_ALL=31;
	public static final int KW_ALTER=32;
	public static final int KW_ANALYZE=33;
	public static final int KW_AND=34;
	public static final int KW_ARCHIVE=35;
	public static final int KW_ARRAY=36;
	public static final int KW_AS=37;
	public static final int KW_ASC=38;
	public static final int KW_AUTHORIZATION=39;
	public static final int KW_AUTOCOMMIT=40;
	public static final int KW_BEFORE=41;
	public static final int KW_BETWEEN=42;
	public static final int KW_BIGINT=43;
	public static final int KW_BINARY=44;
	public static final int KW_BOOLEAN=45;
	public static final int KW_BOTH=46;
	public static final int KW_BUCKET=47;
	public static final int KW_BUCKETS=48;
	public static final int KW_BY=49;
	public static final int KW_CACHE=50;
	public static final int KW_CASCADE=51;
	public static final int KW_CASE=52;
	public static final int KW_CAST=53;
	public static final int KW_CHANGE=54;
	public static final int KW_CHAR=55;
	public static final int KW_CLUSTER=56;
	public static final int KW_CLUSTERED=57;
	public static final int KW_CLUSTERSTATUS=58;
	public static final int KW_COLLECTION=59;
	public static final int KW_COLUMN=60;
	public static final int KW_COLUMNS=61;
	public static final int KW_COMMENT=62;
	public static final int KW_COMMIT=63;
	public static final int KW_COMPACT=64;
	public static final int KW_COMPACTIONS=65;
	public static final int KW_COMPUTE=66;
	public static final int KW_CONCATENATE=67;
	public static final int KW_CONF=68;
	public static final int KW_CONSTRAINT=69;
	public static final int KW_CONTINUE=70;
	public static final int KW_CREATE=71;
	public static final int KW_CROSS=72;
	public static final int KW_CUBE=73;
	public static final int KW_CURRENT=74;
	public static final int KW_CURRENT_DATE=75;
	public static final int KW_CURRENT_TIMESTAMP=76;
	public static final int KW_CURSOR=77;
	public static final int KW_DATA=78;
	public static final int KW_DATABASE=79;
	public static final int KW_DATABASES=80;
	public static final int KW_DATE=81;
	public static final int KW_DATETIME=82;
	public static final int KW_DAY=83;
	public static final int KW_DBPROPERTIES=84;
	public static final int KW_DECIMAL=85;
	public static final int KW_DEFERRED=86;
	public static final int KW_DEFINED=87;
	public static final int KW_DELETE=88;
	public static final int KW_DELIMITED=89;
	public static final int KW_DEPENDENCY=90;
	public static final int KW_DESC=91;
	public static final int KW_DESCRIBE=92;
	public static final int KW_DIRECTORIES=93;
	public static final int KW_DIRECTORY=94;
	public static final int KW_DISABLE=95;
	public static final int KW_DISTINCT=96;
	public static final int KW_DISTRIBUTE=97;
	public static final int KW_DOUBLE=98;
	public static final int KW_DROP=99;
	public static final int KW_ELEM_TYPE=100;
	public static final int KW_ELSE=101;
	public static final int KW_ENABLE=102;
	public static final int KW_END=103;
	public static final int KW_ESCAPED=104;
	public static final int KW_EXCHANGE=105;
	public static final int KW_EXCLUSIVE=106;
	public static final int KW_EXISTS=107;
	public static final int KW_EXPLAIN=108;
	public static final int KW_EXPORT=109;
	public static final int KW_EXTENDED=110;
	public static final int KW_EXTERNAL=111;
	public static final int KW_FALSE=112;
	public static final int KW_FETCH=113;
	public static final int KW_FIELDS=114;
	public static final int KW_FILE=115;
	public static final int KW_FILEFORMAT=116;
	public static final int KW_FIRST=117;
	public static final int KW_FLOAT=118;
	public static final int KW_FOLLOWING=119;
	public static final int KW_FOR=120;
	public static final int KW_FOREIGN=121;
	public static final int KW_FORMAT=122;
	public static final int KW_FORMATTED=123;
	public static final int KW_FROM=124;
	public static final int KW_FULL=125;
	public static final int KW_FUNCTION=126;
	public static final int KW_FUNCTIONS=127;
	public static final int KW_GRANT=128;
	public static final int KW_GROUP=129;
	public static final int KW_GROUPING=130;
	public static final int KW_HAVING=131;
	public static final int KW_HOUR=132;
	public static final int KW_IDXPROPERTIES=133;
	public static final int KW_IF=134;
	public static final int KW_IMPORT=135;
	public static final int KW_IN=136;
	public static final int KW_INDEX=137;
	public static final int KW_INDEXES=138;
	public static final int KW_INNER=139;
	public static final int KW_INPATH=140;
	public static final int KW_INPUTDRIVER=141;
	public static final int KW_INPUTFORMAT=142;
	public static final int KW_INSERT=143;
	public static final int KW_INT=144;
	public static final int KW_INTERSECT=145;
	public static final int KW_INTERVAL=146;
	public static final int KW_INTO=147;
	public static final int KW_IS=148;
	public static final int KW_ISOLATION=149;
	public static final int KW_ITEMS=150;
	public static final int KW_JAR=151;
	public static final int KW_JOIN=152;
	public static final int KW_KEY=153;
	public static final int KW_KEYS=154;
	public static final int KW_KEY_TYPE=155;
	public static final int KW_LAST=156;
	public static final int KW_LATERAL=157;
	public static final int KW_LEFT=158;
	public static final int KW_LESS=159;
	public static final int KW_LEVEL=160;
	public static final int KW_LIKE=161;
	public static final int KW_LIMIT=162;
	public static final int KW_LINES=163;
	public static final int KW_LOAD=164;
	public static final int KW_LOCAL=165;
	public static final int KW_LOCATION=166;
	public static final int KW_LOCK=167;
	public static final int KW_LOCKS=168;
	public static final int KW_LOGICAL=169;
	public static final int KW_LONG=170;
	public static final int KW_MACRO=171;
	public static final int KW_MAP=172;
	public static final int KW_MAPJOIN=173;
	public static final int KW_MATERIALIZED=174;
	public static final int KW_METADATA=175;
	public static final int KW_MINUS=176;
	public static final int KW_MINUTE=177;
	public static final int KW_MONTH=178;
	public static final int KW_MORE=179;
	public static final int KW_MSCK=180;
	public static final int KW_NONE=181;
	public static final int KW_NORELY=182;
	public static final int KW_NOSCAN=183;
	public static final int KW_NOT=184;
	public static final int KW_NOVALIDATE=185;
	public static final int KW_NULL=186;
	public static final int KW_NULLS=187;
	public static final int KW_OF=188;
	public static final int KW_OFFSET=189;
	public static final int KW_ON=190;
	public static final int KW_ONLY=191;
	public static final int KW_OPTION=192;
	public static final int KW_OR=193;
	public static final int KW_ORDER=194;
	public static final int KW_OUT=195;
	public static final int KW_OUTER=196;
	public static final int KW_OUTPUTDRIVER=197;
	public static final int KW_OUTPUTFORMAT=198;
	public static final int KW_OVER=199;
	public static final int KW_OVERWRITE=200;
	public static final int KW_OWNER=201;
	public static final int KW_PARTIALSCAN=202;
	public static final int KW_PARTITION=203;
	public static final int KW_PARTITIONED=204;
	public static final int KW_PARTITIONS=205;
	public static final int KW_PERCENT=206;
	public static final int KW_PLUS=207;
	public static final int KW_PRECEDING=208;
	public static final int KW_PRESERVE=209;
	public static final int KW_PRETTY=210;
	public static final int KW_PRIMARY=211;
	public static final int KW_PRINCIPALS=212;
	public static final int KW_PROCEDURE=213;
	public static final int KW_PURGE=214;
	public static final int KW_RANGE=215;
	public static final int KW_READ=216;
	public static final int KW_READS=217;
	public static final int KW_REBUILD=218;
	public static final int KW_RECORDREADER=219;
	public static final int KW_RECORDWRITER=220;
	public static final int KW_REDUCE=221;
	public static final int KW_REFERENCES=222;
	public static final int KW_REGEXP=223;
	public static final int KW_RELOAD=224;
	public static final int KW_RELY=225;
	public static final int KW_RENAME=226;
	public static final int KW_REPAIR=227;
	public static final int KW_REPLACE=228;
	public static final int KW_REPLICATION=229;
	public static final int KW_RESTRICT=230;
	public static final int KW_REVOKE=231;
	public static final int KW_REWRITE=232;
	public static final int KW_RIGHT=233;
	public static final int KW_RLIKE=234;
	public static final int KW_ROLE=235;
	public static final int KW_ROLES=236;
	public static final int KW_ROLLBACK=237;
	public static final int KW_ROLLUP=238;
	public static final int KW_ROW=239;
	public static final int KW_ROWS=240;
	public static final int KW_SCHEMA=241;
	public static final int KW_SCHEMAS=242;
	public static final int KW_SECOND=243;
	public static final int KW_SELECT=244;
	public static final int KW_SEMI=245;
	public static final int KW_SERDE=246;
	public static final int KW_SERDEPROPERTIES=247;
	public static final int KW_SERVER=248;
	public static final int KW_SET=249;
	public static final int KW_SETS=250;
	public static final int KW_SHARED=251;
	public static final int KW_SHOW=252;
	public static final int KW_SHOW_DATABASE=253;
	public static final int KW_SKEWED=254;
	public static final int KW_SMALLINT=255;
	public static final int KW_SNAPSHOT=256;
	public static final int KW_SORT=257;
	public static final int KW_SORTED=258;
	public static final int KW_SSL=259;
	public static final int KW_START=260;
	public static final int KW_STATISTICS=261;
	public static final int KW_STORED=262;
	public static final int KW_STREAMTABLE=263;
	public static final int KW_STRING=264;
	public static final int KW_STRUCT=265;
	public static final int KW_TABLE=266;
	public static final int KW_TABLES=267;
	public static final int KW_TABLESAMPLE=268;
	public static final int KW_TBLPROPERTIES=269;
	public static final int KW_TEMPORARY=270;
	public static final int KW_TERMINATED=271;
	public static final int KW_THEN=272;
	public static final int KW_TIMESTAMP=273;
	public static final int KW_TINYINT=274;
	public static final int KW_TO=275;
	public static final int KW_TOUCH=276;
	public static final int KW_TRANSACTION=277;
	public static final int KW_TRANSACTIONS=278;
	public static final int KW_TRANSFORM=279;
	public static final int KW_TRIGGER=280;
	public static final int KW_TRUE=281;
	public static final int KW_TRUNCATE=282;
	public static final int KW_UNARCHIVE=283;
	public static final int KW_UNBOUNDED=284;
	public static final int KW_UNDO=285;
	public static final int KW_UNION=286;
	public static final int KW_UNIONTYPE=287;
	public static final int KW_UNIQUEJOIN=288;
	public static final int KW_UNLOCK=289;
	public static final int KW_UNSET=290;
	public static final int KW_UNSIGNED=291;
	public static final int KW_UPDATE=292;
	public static final int KW_URI=293;
	public static final int KW_USE=294;
	public static final int KW_USER=295;
	public static final int KW_USING=296;
	public static final int KW_UTC=297;
	public static final int KW_UTCTIMESTAMP=298;
	public static final int KW_VALIDATE=299;
	public static final int KW_VALUES=300;
	public static final int KW_VALUE_TYPE=301;
	public static final int KW_VARCHAR=302;
	public static final int KW_VIEW=303;
	public static final int KW_WHEN=304;
	public static final int KW_WHERE=305;
	public static final int KW_WHILE=306;
	public static final int KW_WINDOW=307;
	public static final int KW_WITH=308;
	public static final int KW_WORK=309;
	public static final int KW_WRITE=310;
	public static final int KW_YEAR=311;
	public static final int LCURLY=312;
	public static final int LESSTHAN=313;
	public static final int LESSTHANOREQUALTO=314;
	public static final int LPAREN=315;
	public static final int LSQUARE=316;
	public static final int Letter=317;
	public static final int MINUS=318;
	public static final int MOD=319;
	public static final int NOTEQUAL=320;
	public static final int Number=321;
	public static final int PLUS=322;
	public static final int QUESTION=323;
	public static final int QuotedIdentifier=324;
	public static final int RCURLY=325;
	public static final int RPAREN=326;
	public static final int RSQUARE=327;
	public static final int RegexComponent=328;
	public static final int SEMICOLON=329;
	public static final int STAR=330;
	public static final int SmallintLiteral=331;
	public static final int StringLiteral=332;
	public static final int TILDE=333;
	public static final int TinyintLiteral=334;
	public static final int WS=335;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "grammar/HiveLexer.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:50:9: ( 'TRUE' )
			// grammar/HiveLexer.g:50:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:51:10: ( 'FALSE' )
			// grammar/HiveLexer.g:51:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:52:8: ( 'ALL' )
			// grammar/HiveLexer.g:52:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_NONE"
	public final void mKW_NONE() throws RecognitionException {
		try {
			int _type = KW_NONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:53:8: ( 'NONE' )
			// grammar/HiveLexer.g:53:10: 'NONE'
			{
			match("NONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NONE"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:54:8: ( 'AND' )
			// grammar/HiveLexer.g:54:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:55:7: ( 'OR' )
			// grammar/HiveLexer.g:55:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:56:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// grammar/HiveLexer.g:56:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:56:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:57:9: ( 'LIKE' )
			// grammar/HiveLexer.g:57:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:59:7: ( 'IF' )
			// grammar/HiveLexer.g:59:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:60:11: ( 'EXISTS' )
			// grammar/HiveLexer.g:60:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:62:8: ( 'ASC' )
			// grammar/HiveLexer.g:62:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:63:9: ( 'DESC' )
			// grammar/HiveLexer.g:63:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_NULLS"
	public final void mKW_NULLS() throws RecognitionException {
		try {
			int _type = KW_NULLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:64:10: ( 'NULLS' )
			// grammar/HiveLexer.g:64:12: 'NULLS'
			{
			match("NULLS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULLS"

	// $ANTLR start "KW_LAST"
	public final void mKW_LAST() throws RecognitionException {
		try {
			int _type = KW_LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:65:9: ( 'LAST' )
			// grammar/HiveLexer.g:65:11: 'LAST'
			{
			match("LAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LAST"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:66:10: ( 'ORDER' )
			// grammar/HiveLexer.g:66:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:67:10: ( 'GROUP' )
			// grammar/HiveLexer.g:67:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:68:7: ( 'BY' )
			// grammar/HiveLexer.g:68:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:69:11: ( 'HAVING' )
			// grammar/HiveLexer.g:69:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:70:10: ( 'WHERE' )
			// grammar/HiveLexer.g:70:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:71:9: ( 'FROM' )
			// grammar/HiveLexer.g:71:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:72:7: ( 'AS' )
			// grammar/HiveLexer.g:72:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:73:11: ( 'SELECT' )
			// grammar/HiveLexer.g:73:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:74:13: ( 'DISTINCT' )
			// grammar/HiveLexer.g:74:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:75:11: ( 'INSERT' )
			// grammar/HiveLexer.g:75:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:76:14: ( 'OVERWRITE' )
			// grammar/HiveLexer.g:76:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:77:10: ( 'OUTER' )
			// grammar/HiveLexer.g:77:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:78:15: ( 'UNIQUEJOIN' )
			// grammar/HiveLexer.g:78:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:79:13: ( 'PRESERVE' )
			// grammar/HiveLexer.g:79:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:80:9: ( 'JOIN' )
			// grammar/HiveLexer.g:80:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:81:9: ( 'LEFT' )
			// grammar/HiveLexer.g:81:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:82:10: ( 'RIGHT' )
			// grammar/HiveLexer.g:82:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:83:9: ( 'FULL' )
			// grammar/HiveLexer.g:83:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:84:7: ( 'ON' )
			// grammar/HiveLexer.g:84:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:85:14: ( 'PARTITION' )
			// grammar/HiveLexer.g:85:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:86:15: ( 'PARTITIONS' )
			// grammar/HiveLexer.g:86:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:87:9: ( 'TABLE' )
			// grammar/HiveLexer.g:87:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:88:10: ( 'TABLES' )
			// grammar/HiveLexer.g:88:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:89:11: ( 'COLUMNS' )
			// grammar/HiveLexer.g:89:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:90:9: ( 'INDEX' )
			// grammar/HiveLexer.g:90:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:91:11: ( 'INDEXES' )
			// grammar/HiveLexer.g:91:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:92:11: ( 'REBUILD' )
			// grammar/HiveLexer.g:92:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:93:13: ( 'FUNCTIONS' )
			// grammar/HiveLexer.g:93:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:94:8: ( 'SHOW' )
			// grammar/HiveLexer.g:94:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:95:8: ( 'MSCK' )
			// grammar/HiveLexer.g:95:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:96:10: ( 'REPAIR' )
			// grammar/HiveLexer.g:96:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:97:13: ( 'DIRECTORY' )
			// grammar/HiveLexer.g:97:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:98:9: ( 'LOCAL' )
			// grammar/HiveLexer.g:98:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:99:14: ( 'TRANSFORM' )
			// grammar/HiveLexer.g:99:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:100:9: ( 'USING' )
			// grammar/HiveLexer.g:100:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:101:11: ( 'CLUSTER' )
			// grammar/HiveLexer.g:101:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:102:14: ( 'DISTRIBUTE' )
			// grammar/HiveLexer.g:102:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:103:8: ( 'SORT' )
			// grammar/HiveLexer.g:103:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:104:9: ( 'UNION' )
			// grammar/HiveLexer.g:104:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:105:8: ( 'LOAD' )
			// grammar/HiveLexer.g:105:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:106:10: ( 'EXPORT' )
			// grammar/HiveLexer.g:106:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:107:10: ( 'IMPORT' )
			// grammar/HiveLexer.g:107:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_REPLICATION"
	public final void mKW_REPLICATION() throws RecognitionException {
		try {
			int _type = KW_REPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:108:15: ( 'REPLICATION' )
			// grammar/HiveLexer.g:108:17: 'REPLICATION'
			{
			match("REPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLICATION"

	// $ANTLR start "KW_METADATA"
	public final void mKW_METADATA() throws RecognitionException {
		try {
			int _type = KW_METADATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:109:12: ( 'METADATA' )
			// grammar/HiveLexer.g:109:14: 'METADATA'
			{
			match("METADATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_METADATA"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:110:8: ( 'DATA' )
			// grammar/HiveLexer.g:110:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:111:10: ( 'INPATH' )
			// grammar/HiveLexer.g:111:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:112:6: ( 'IS' )
			// grammar/HiveLexer.g:112:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:113:8: ( 'NULL' )
			// grammar/HiveLexer.g:113:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:114:10: ( 'CREATE' )
			// grammar/HiveLexer.g:114:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:115:12: ( 'EXTERNAL' )
			// grammar/HiveLexer.g:115:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:116:9: ( 'ALTER' )
			// grammar/HiveLexer.g:116:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:117:10: ( 'CHANGE' )
			// grammar/HiveLexer.g:117:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:118:10: ( 'COLUMN' )
			// grammar/HiveLexer.g:118:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:119:9: ( 'FIRST' )
			// grammar/HiveLexer.g:119:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:120:9: ( 'AFTER' )
			// grammar/HiveLexer.g:120:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:121:12: ( 'DESCRIBE' )
			// grammar/HiveLexer.g:121:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:122:8: ( 'DROP' )
			// grammar/HiveLexer.g:122:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:123:10: ( 'RENAME' )
			// grammar/HiveLexer.g:123:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:124:6: ( 'TO' )
			// grammar/HiveLexer.g:124:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:125:11: ( 'COMMENT' )
			// grammar/HiveLexer.g:125:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:126:11: ( 'BOOLEAN' )
			// grammar/HiveLexer.g:126:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:127:11: ( 'TINYINT' )
			// grammar/HiveLexer.g:127:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:128:12: ( 'SMALLINT' )
			// grammar/HiveLexer.g:128:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:129:7: ( 'INT' )
			// grammar/HiveLexer.g:129:9: 'INT'
			{
			match("INT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:130:10: ( 'BIGINT' )
			// grammar/HiveLexer.g:130:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:131:9: ( 'FLOAT' )
			// grammar/HiveLexer.g:131:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:132:10: ( 'DOUBLE' )
			// grammar/HiveLexer.g:132:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:133:8: ( 'DATE' )
			// grammar/HiveLexer.g:133:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:134:12: ( 'DATETIME' )
			// grammar/HiveLexer.g:134:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:135:13: ( 'TIMESTAMP' )
			// grammar/HiveLexer.g:135:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_INTERVAL"
	public final void mKW_INTERVAL() throws RecognitionException {
		try {
			int _type = KW_INTERVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:136:12: ( 'INTERVAL' )
			// grammar/HiveLexer.g:136:14: 'INTERVAL'
			{
			match("INTERVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERVAL"

	// $ANTLR start "KW_DECIMAL"
	public final void mKW_DECIMAL() throws RecognitionException {
		try {
			int _type = KW_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:137:11: ( 'DECIMAL' )
			// grammar/HiveLexer.g:137:13: 'DECIMAL'
			{
			match("DECIMAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DECIMAL"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:138:10: ( 'STRING' )
			// grammar/HiveLexer.g:138:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_CHAR"
	public final void mKW_CHAR() throws RecognitionException {
		try {
			int _type = KW_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:139:8: ( 'CHAR' )
			// grammar/HiveLexer.g:139:10: 'CHAR'
			{
			match("CHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHAR"

	// $ANTLR start "KW_VARCHAR"
	public final void mKW_VARCHAR() throws RecognitionException {
		try {
			int _type = KW_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:140:11: ( 'VARCHAR' )
			// grammar/HiveLexer.g:140:13: 'VARCHAR'
			{
			match("VARCHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VARCHAR"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:141:9: ( 'ARRAY' )
			// grammar/HiveLexer.g:141:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:142:10: ( 'STRUCT' )
			// grammar/HiveLexer.g:142:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:143:7: ( 'MAP' )
			// grammar/HiveLexer.g:143:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:144:13: ( 'UNIONTYPE' )
			// grammar/HiveLexer.g:144:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:145:10: ( 'REDUCE' )
			// grammar/HiveLexer.g:145:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:146:15: ( 'PARTITIONED' )
			// grammar/HiveLexer.g:146:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:147:13: ( 'CLUSTERED' )
			// grammar/HiveLexer.g:147:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:148:10: ( 'SORTED' )
			// grammar/HiveLexer.g:148:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:149:8: ( 'INTO' )
			// grammar/HiveLexer.g:149:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:150:11: ( 'BUCKETS' )
			// grammar/HiveLexer.g:150:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:151:7: ( 'ROW' )
			// grammar/HiveLexer.g:151:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_ROWS"
	public final void mKW_ROWS() throws RecognitionException {
		try {
			int _type = KW_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:152:8: ( 'ROWS' )
			// grammar/HiveLexer.g:152:10: 'ROWS'
			{
			match("ROWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROWS"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:153:10: ( 'FORMAT' )
			// grammar/HiveLexer.g:153:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:154:13: ( 'DELIMITED' )
			// grammar/HiveLexer.g:154:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:155:10: ( 'FIELDS' )
			// grammar/HiveLexer.g:155:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:156:14: ( 'TERMINATED' )
			// grammar/HiveLexer.g:156:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:157:11: ( 'ESCAPED' )
			// grammar/HiveLexer.g:157:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:158:14: ( 'COLLECTION' )
			// grammar/HiveLexer.g:158:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:159:9: ( 'ITEMS' )
			// grammar/HiveLexer.g:159:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:160:8: ( 'KEYS' )
			// grammar/HiveLexer.g:160:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:161:12: ( '$KEY$' )
			// grammar/HiveLexer.g:161:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:162:9: ( 'LINES' )
			// grammar/HiveLexer.g:162:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:163:10: ( 'STORED' )
			// grammar/HiveLexer.g:163:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:164:14: ( 'FILEFORMAT' )
			// grammar/HiveLexer.g:164:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:165:15: ( 'INPUTFORMAT' )
			// grammar/HiveLexer.g:165:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:166:16: ( 'OUTPUTFORMAT' )
			// grammar/HiveLexer.g:166:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:167:15: ( 'INPUTDRIVER' )
			// grammar/HiveLexer.g:167:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:168:16: ( 'OUTPUTDRIVER' )
			// grammar/HiveLexer.g:168:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:169:10: ( 'ENABLE' )
			// grammar/HiveLexer.g:169:12: 'ENABLE'
			{
			match("ENABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:170:11: ( 'DISABLE' )
			// grammar/HiveLexer.g:170:13: 'DISABLE'
			{
			match("DISABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:171:12: ( 'LOCATION' )
			// grammar/HiveLexer.g:171:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:172:15: ( 'TABLESAMPLE' )
			// grammar/HiveLexer.g:172:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:173:10: ( 'BUCKET' )
			// grammar/HiveLexer.g:173:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:174:7: ( 'OUT' )
			// grammar/HiveLexer.g:174:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:175:6: ( 'OF' )
			// grammar/HiveLexer.g:175:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:176:11: ( 'PERCENT' )
			// grammar/HiveLexer.g:176:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:177:8: ( 'CAST' )
			// grammar/HiveLexer.g:177:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:178:7: ( 'ADD' )
			// grammar/HiveLexer.g:178:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:179:11: ( 'REPLACE' )
			// grammar/HiveLexer.g:179:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:180:9: ( 'RLIKE' )
			// grammar/HiveLexer.g:180:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:181:10: ( 'REGEXP' )
			// grammar/HiveLexer.g:181:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:182:13: ( 'TEMPORARY' )
			// grammar/HiveLexer.g:182:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:183:12: ( 'FUNCTION' )
			// grammar/HiveLexer.g:183:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_MACRO"
	public final void mKW_MACRO() throws RecognitionException {
		try {
			int _type = KW_MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:184:9: ( 'MACRO' )
			// grammar/HiveLexer.g:184:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MACRO"

	// $ANTLR start "KW_FILE"
	public final void mKW_FILE() throws RecognitionException {
		try {
			int _type = KW_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:185:8: ( 'FILE' )
			// grammar/HiveLexer.g:185:10: 'FILE'
			{
			match("FILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILE"

	// $ANTLR start "KW_JAR"
	public final void mKW_JAR() throws RecognitionException {
		try {
			int _type = KW_JAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:186:7: ( 'JAR' )
			// grammar/HiveLexer.g:186:9: 'JAR'
			{
			match("JAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JAR"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:187:11: ( 'EXPLAIN' )
			// grammar/HiveLexer.g:187:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:188:12: ( 'EXTENDED' )
			// grammar/HiveLexer.g:188:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:189:13: ( 'FORMATTED' )
			// grammar/HiveLexer.g:189:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_PRETTY"
	public final void mKW_PRETTY() throws RecognitionException {
		try {
			int _type = KW_PRETTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:190:10: ( 'PRETTY' )
			// grammar/HiveLexer.g:190:12: 'PRETTY'
			{
			match("PRETTY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRETTY"

	// $ANTLR start "KW_DEPENDENCY"
	public final void mKW_DEPENDENCY() throws RecognitionException {
		try {
			int _type = KW_DEPENDENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:191:14: ( 'DEPENDENCY' )
			// grammar/HiveLexer.g:191:16: 'DEPENDENCY'
			{
			match("DEPENDENCY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEPENDENCY"

	// $ANTLR start "KW_LOGICAL"
	public final void mKW_LOGICAL() throws RecognitionException {
		try {
			int _type = KW_LOGICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:192:11: ( 'LOGICAL' )
			// grammar/HiveLexer.g:192:13: 'LOGICAL'
			{
			match("LOGICAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOGICAL"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:193:9: ( 'SERDE' )
			// grammar/HiveLexer.g:193:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:194:8: ( 'WITH' )
			// grammar/HiveLexer.g:194:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:195:12: ( 'DEFERRED' )
			// grammar/HiveLexer.g:195:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:196:19: ( 'SERDEPROPERTIES' )
			// grammar/HiveLexer.g:196:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:197:16: ( 'DBPROPERTIES' )
			// grammar/HiveLexer.g:197:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:198:9: ( 'LIMIT' )
			// grammar/HiveLexer.g:198:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_OFFSET"
	public final void mKW_OFFSET() throws RecognitionException {
		try {
			int _type = KW_OFFSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:199:10: ( 'OFFSET' )
			// grammar/HiveLexer.g:199:12: 'OFFSET'
			{
			match("OFFSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFSET"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:200:7: ( 'SET' )
			// grammar/HiveLexer.g:200:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_UNSET"
	public final void mKW_UNSET() throws RecognitionException {
		try {
			int _type = KW_UNSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:201:9: ( 'UNSET' )
			// grammar/HiveLexer.g:201:11: 'UNSET'
			{
			match("UNSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:202:17: ( 'TBLPROPERTIES' )
			// grammar/HiveLexer.g:202:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:203:17: ( 'IDXPROPERTIES' )
			// grammar/HiveLexer.g:203:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:204:14: ( '$VALUE$' )
			// grammar/HiveLexer.g:204:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:205:13: ( '$ELEM$' )
			// grammar/HiveLexer.g:205:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_DEFINED"
	public final void mKW_DEFINED() throws RecognitionException {
		try {
			int _type = KW_DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:206:11: ( 'DEFINED' )
			// grammar/HiveLexer.g:206:13: 'DEFINED'
			{
			match("DEFINED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFINED"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:207:8: ( 'CASE' )
			// grammar/HiveLexer.g:207:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:208:8: ( 'WHEN' )
			// grammar/HiveLexer.g:208:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:209:8: ( 'THEN' )
			// grammar/HiveLexer.g:209:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:210:8: ( 'ELSE' )
			// grammar/HiveLexer.g:210:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:211:7: ( 'END' )
			// grammar/HiveLexer.g:211:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:212:11: ( 'MAPJOIN' )
			// grammar/HiveLexer.g:212:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:213:15: ( 'STREAMTABLE' )
			// grammar/HiveLexer.g:213:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:214:17: ( 'CLUSTERSTATUS' )
			// grammar/HiveLexer.g:214:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:215:7: ( 'UTC' )
			// grammar/HiveLexer.g:215:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:216:16: ( 'UTC_TMESTAMP' )
			// grammar/HiveLexer.g:216:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:217:8: ( 'LONG' )
			// grammar/HiveLexer.g:217:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:218:10: ( 'DELETE' )
			// grammar/HiveLexer.g:218:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:219:8: ( 'PLUS' )
			// grammar/HiveLexer.g:219:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:220:9: ( 'MINUS' )
			// grammar/HiveLexer.g:220:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:221:9: ( 'FETCH' )
			// grammar/HiveLexer.g:221:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:222:13: ( 'INTERSECT' )
			// grammar/HiveLexer.g:222:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:223:8: ( 'VIEW' )
			// grammar/HiveLexer.g:223:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:224:6: ( 'IN' )
			// grammar/HiveLexer.g:224:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:225:12: ( 'DATABASE' )
			// grammar/HiveLexer.g:225:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:226:13: ( 'DATABASES' )
			// grammar/HiveLexer.g:226:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:227:16: ( 'MATERIALIZED' )
			// grammar/HiveLexer.g:227:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:228:10: ( 'SCHEMA' )
			// grammar/HiveLexer.g:228:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:229:11: ( 'SCHEMAS' )
			// grammar/HiveLexer.g:229:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:230:9: ( 'GRANT' )
			// grammar/HiveLexer.g:230:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:231:10: ( 'REVOKE' )
			// grammar/HiveLexer.g:231:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:232:7: ( 'SSL' )
			// grammar/HiveLexer.g:232:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:233:8: ( 'UNDO' )
			// grammar/HiveLexer.g:233:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:234:8: ( 'LOCK' )
			// grammar/HiveLexer.g:234:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:235:9: ( 'LOCKS' )
			// grammar/HiveLexer.g:235:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:236:10: ( 'UNLOCK' )
			// grammar/HiveLexer.g:236:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:237:10: ( 'SHARED' )
			// grammar/HiveLexer.g:237:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:238:13: ( 'EXCLUSIVE' )
			// grammar/HiveLexer.g:238:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:239:13: ( 'PROCEDURE' )
			// grammar/HiveLexer.g:239:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:240:12: ( 'UNSIGNED' )
			// grammar/HiveLexer.g:240:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:241:9: ( 'WHILE' )
			// grammar/HiveLexer.g:241:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:242:8: ( 'READ' )
			// grammar/HiveLexer.g:242:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:243:9: ( 'READS' )
			// grammar/HiveLexer.g:243:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:244:9: ( 'PURGE' )
			// grammar/HiveLexer.g:244:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:245:9: ( 'RANGE' )
			// grammar/HiveLexer.g:245:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:246:11: ( 'ANALYZE' )
			// grammar/HiveLexer.g:246:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:247:10: ( 'BEFORE' )
			// grammar/HiveLexer.g:247:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:248:11: ( 'BETWEEN' )
			// grammar/HiveLexer.g:248:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:249:8: ( 'BOTH' )
			// grammar/HiveLexer.g:249:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:250:10: ( 'BINARY' )
			// grammar/HiveLexer.g:250:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:251:9: ( 'CROSS' )
			// grammar/HiveLexer.g:251:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:252:12: ( 'CONTINUE' )
			// grammar/HiveLexer.g:252:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:253:10: ( 'CURSOR' )
			// grammar/HiveLexer.g:253:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:254:11: ( 'TRIGGER' )
			// grammar/HiveLexer.g:254:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:255:16: ( 'RECORDREADER' )
			// grammar/HiveLexer.g:255:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:256:16: ( 'RECORDWRITER' )
			// grammar/HiveLexer.g:256:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:257:8: ( 'SEMI' )
			// grammar/HiveLexer.g:257:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:258:11: ( 'LATERAL' )
			// grammar/HiveLexer.g:258:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:259:9: ( 'TOUCH' )
			// grammar/HiveLexer.g:259:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:260:11: ( 'ARCHIVE' )
			// grammar/HiveLexer.g:260:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:261:13: ( 'UNARCHIVE' )
			// grammar/HiveLexer.g:261:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:262:11: ( 'COMPUTE' )
			// grammar/HiveLexer.g:262:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:263:14: ( 'STATISTICS' )
			// grammar/HiveLexer.g:263:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:264:7: ( 'USE' )
			// grammar/HiveLexer.g:264:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:265:10: ( 'OPTION' )
			// grammar/HiveLexer.g:265:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:266:15: ( 'CONCATENATE' )
			// grammar/HiveLexer.g:266:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:267:17: ( 'SHOW_DATABASE' )
			// grammar/HiveLexer.g:267:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:268:10: ( 'UPDATE' )
			// grammar/HiveLexer.g:268:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:269:12: ( 'RESTRICT' )
			// grammar/HiveLexer.g:269:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:270:11: ( 'CASCADE' )
			// grammar/HiveLexer.g:270:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "KW_SKEWED"
	public final void mKW_SKEWED() throws RecognitionException {
		try {
			int _type = KW_SKEWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:271:10: ( 'SKEWED' )
			// grammar/HiveLexer.g:271:12: 'SKEWED'
			{
			match("SKEWED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SKEWED"

	// $ANTLR start "KW_ROLLUP"
	public final void mKW_ROLLUP() throws RecognitionException {
		try {
			int _type = KW_ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:272:10: ( 'ROLLUP' )
			// grammar/HiveLexer.g:272:12: 'ROLLUP'
			{
			match("ROLLUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLUP"

	// $ANTLR start "KW_CUBE"
	public final void mKW_CUBE() throws RecognitionException {
		try {
			int _type = KW_CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:273:8: ( 'CUBE' )
			// grammar/HiveLexer.g:273:10: 'CUBE'
			{
			match("CUBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CUBE"

	// $ANTLR start "KW_DIRECTORIES"
	public final void mKW_DIRECTORIES() throws RecognitionException {
		try {
			int _type = KW_DIRECTORIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:274:15: ( 'DIRECTORIES' )
			// grammar/HiveLexer.g:274:17: 'DIRECTORIES'
			{
			match("DIRECTORIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORIES"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:275:7: ( 'FOR' )
			// grammar/HiveLexer.g:275:9: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "KW_WINDOW"
	public final void mKW_WINDOW() throws RecognitionException {
		try {
			int _type = KW_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:276:10: ( 'WINDOW' )
			// grammar/HiveLexer.g:276:12: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WINDOW"

	// $ANTLR start "KW_UNBOUNDED"
	public final void mKW_UNBOUNDED() throws RecognitionException {
		try {
			int _type = KW_UNBOUNDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:277:13: ( 'UNBOUNDED' )
			// grammar/HiveLexer.g:277:15: 'UNBOUNDED'
			{
			match("UNBOUNDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNBOUNDED"

	// $ANTLR start "KW_PRECEDING"
	public final void mKW_PRECEDING() throws RecognitionException {
		try {
			int _type = KW_PRECEDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:278:13: ( 'PRECEDING' )
			// grammar/HiveLexer.g:278:15: 'PRECEDING'
			{
			match("PRECEDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECEDING"

	// $ANTLR start "KW_FOLLOWING"
	public final void mKW_FOLLOWING() throws RecognitionException {
		try {
			int _type = KW_FOLLOWING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:279:13: ( 'FOLLOWING' )
			// grammar/HiveLexer.g:279:15: 'FOLLOWING'
			{
			match("FOLLOWING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOLLOWING"

	// $ANTLR start "KW_CURRENT"
	public final void mKW_CURRENT() throws RecognitionException {
		try {
			int _type = KW_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:280:11: ( 'CURRENT' )
			// grammar/HiveLexer.g:280:13: 'CURRENT'
			{
			match("CURRENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT"

	// $ANTLR start "KW_CURRENT_DATE"
	public final void mKW_CURRENT_DATE() throws RecognitionException {
		try {
			int _type = KW_CURRENT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:281:16: ( 'CURRENT_DATE' )
			// grammar/HiveLexer.g:281:18: 'CURRENT_DATE'
			{
			match("CURRENT_DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_DATE"

	// $ANTLR start "KW_CURRENT_TIMESTAMP"
	public final void mKW_CURRENT_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_CURRENT_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:282:21: ( 'CURRENT_TIMESTAMP' )
			// grammar/HiveLexer.g:282:23: 'CURRENT_TIMESTAMP'
			{
			match("CURRENT_TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_TIMESTAMP"

	// $ANTLR start "KW_LESS"
	public final void mKW_LESS() throws RecognitionException {
		try {
			int _type = KW_LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:283:8: ( 'LESS' )
			// grammar/HiveLexer.g:283:10: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LESS"

	// $ANTLR start "KW_MORE"
	public final void mKW_MORE() throws RecognitionException {
		try {
			int _type = KW_MORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:284:8: ( 'MORE' )
			// grammar/HiveLexer.g:284:10: 'MORE'
			{
			match("MORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MORE"

	// $ANTLR start "KW_OVER"
	public final void mKW_OVER() throws RecognitionException {
		try {
			int _type = KW_OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:285:8: ( 'OVER' )
			// grammar/HiveLexer.g:285:10: 'OVER'
			{
			match("OVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVER"

	// $ANTLR start "KW_GROUPING"
	public final void mKW_GROUPING() throws RecognitionException {
		try {
			int _type = KW_GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:286:12: ( 'GROUPING' )
			// grammar/HiveLexer.g:286:14: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUPING"

	// $ANTLR start "KW_SETS"
	public final void mKW_SETS() throws RecognitionException {
		try {
			int _type = KW_SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:287:8: ( 'SETS' )
			// grammar/HiveLexer.g:287:10: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SETS"

	// $ANTLR start "KW_TRUNCATE"
	public final void mKW_TRUNCATE() throws RecognitionException {
		try {
			int _type = KW_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:288:12: ( 'TRUNCATE' )
			// grammar/HiveLexer.g:288:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUNCATE"

	// $ANTLR start "KW_NOSCAN"
	public final void mKW_NOSCAN() throws RecognitionException {
		try {
			int _type = KW_NOSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:289:10: ( 'NOSCAN' )
			// grammar/HiveLexer.g:289:12: 'NOSCAN'
			{
			match("NOSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOSCAN"

	// $ANTLR start "KW_PARTIALSCAN"
	public final void mKW_PARTIALSCAN() throws RecognitionException {
		try {
			int _type = KW_PARTIALSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:290:15: ( 'PARTIALSCAN' )
			// grammar/HiveLexer.g:290:17: 'PARTIALSCAN'
			{
			match("PARTIALSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTIALSCAN"

	// $ANTLR start "KW_USER"
	public final void mKW_USER() throws RecognitionException {
		try {
			int _type = KW_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:291:8: ( 'USER' )
			// grammar/HiveLexer.g:291:10: 'USER'
			{
			match("USER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USER"

	// $ANTLR start "KW_ROLE"
	public final void mKW_ROLE() throws RecognitionException {
		try {
			int _type = KW_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:292:8: ( 'ROLE' )
			// grammar/HiveLexer.g:292:10: 'ROLE'
			{
			match("ROLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLE"

	// $ANTLR start "KW_ROLES"
	public final void mKW_ROLES() throws RecognitionException {
		try {
			int _type = KW_ROLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:293:9: ( 'ROLES' )
			// grammar/HiveLexer.g:293:11: 'ROLES'
			{
			match("ROLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLES"

	// $ANTLR start "KW_INNER"
	public final void mKW_INNER() throws RecognitionException {
		try {
			int _type = KW_INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:294:9: ( 'INNER' )
			// grammar/HiveLexer.g:294:11: 'INNER'
			{
			match("INNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INNER"

	// $ANTLR start "KW_EXCHANGE"
	public final void mKW_EXCHANGE() throws RecognitionException {
		try {
			int _type = KW_EXCHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:295:12: ( 'EXCHANGE' )
			// grammar/HiveLexer.g:295:14: 'EXCHANGE'
			{
			match("EXCHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCHANGE"

	// $ANTLR start "KW_URI"
	public final void mKW_URI() throws RecognitionException {
		try {
			int _type = KW_URI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:296:7: ( 'URI' )
			// grammar/HiveLexer.g:296:9: 'URI'
			{
			match("URI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_URI"

	// $ANTLR start "KW_SERVER"
	public final void mKW_SERVER() throws RecognitionException {
		try {
			int _type = KW_SERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:297:11: ( 'SERVER' )
			// grammar/HiveLexer.g:297:13: 'SERVER'
			{
			match("SERVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERVER"

	// $ANTLR start "KW_ADMIN"
	public final void mKW_ADMIN() throws RecognitionException {
		try {
			int _type = KW_ADMIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:298:9: ( 'ADMIN' )
			// grammar/HiveLexer.g:298:11: 'ADMIN'
			{
			match("ADMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADMIN"

	// $ANTLR start "KW_OWNER"
	public final void mKW_OWNER() throws RecognitionException {
		try {
			int _type = KW_OWNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:299:9: ( 'OWNER' )
			// grammar/HiveLexer.g:299:11: 'OWNER'
			{
			match("OWNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OWNER"

	// $ANTLR start "KW_PRINCIPALS"
	public final void mKW_PRINCIPALS() throws RecognitionException {
		try {
			int _type = KW_PRINCIPALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:300:14: ( 'PRINCIPALS' )
			// grammar/HiveLexer.g:300:16: 'PRINCIPALS'
			{
			match("PRINCIPALS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRINCIPALS"

	// $ANTLR start "KW_COMPACT"
	public final void mKW_COMPACT() throws RecognitionException {
		try {
			int _type = KW_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:301:11: ( 'COMPACT' )
			// grammar/HiveLexer.g:301:13: 'COMPACT'
			{
			match("COMPACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACT"

	// $ANTLR start "KW_COMPACTIONS"
	public final void mKW_COMPACTIONS() throws RecognitionException {
		try {
			int _type = KW_COMPACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:302:15: ( 'COMPACTIONS' )
			// grammar/HiveLexer.g:302:17: 'COMPACTIONS'
			{
			match("COMPACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACTIONS"

	// $ANTLR start "KW_TRANSACTIONS"
	public final void mKW_TRANSACTIONS() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:303:16: ( 'TRANSACTIONS' )
			// grammar/HiveLexer.g:303:18: 'TRANSACTIONS'
			{
			match("TRANSACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONS"

	// $ANTLR start "KW_REWRITE"
	public final void mKW_REWRITE() throws RecognitionException {
		try {
			int _type = KW_REWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:304:12: ( 'REWRITE' )
			// grammar/HiveLexer.g:304:14: 'REWRITE'
			{
			match("REWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REWRITE"

	// $ANTLR start "KW_AUTHORIZATION"
	public final void mKW_AUTHORIZATION() throws RecognitionException {
		try {
			int _type = KW_AUTHORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:305:17: ( 'AUTHORIZATION' )
			// grammar/HiveLexer.g:305:19: 'AUTHORIZATION'
			{
			match("AUTHORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTHORIZATION"

	// $ANTLR start "KW_CONF"
	public final void mKW_CONF() throws RecognitionException {
		try {
			int _type = KW_CONF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:306:8: ( 'CONF' )
			// grammar/HiveLexer.g:306:10: 'CONF'
			{
			match("CONF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONF"

	// $ANTLR start "KW_VALUES"
	public final void mKW_VALUES() throws RecognitionException {
		try {
			int _type = KW_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:307:10: ( 'VALUES' )
			// grammar/HiveLexer.g:307:12: 'VALUES'
			{
			match("VALUES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUES"

	// $ANTLR start "KW_RELOAD"
	public final void mKW_RELOAD() throws RecognitionException {
		try {
			int _type = KW_RELOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:308:10: ( 'RELOAD' )
			// grammar/HiveLexer.g:308:12: 'RELOAD'
			{
			match("RELOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELOAD"

	// $ANTLR start "KW_YEAR"
	public final void mKW_YEAR() throws RecognitionException {
		try {
			int _type = KW_YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:309:8: ( 'YEAR' )
			// grammar/HiveLexer.g:309:10: 'YEAR'
			{
			match("YEAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_YEAR"

	// $ANTLR start "KW_MONTH"
	public final void mKW_MONTH() throws RecognitionException {
		try {
			int _type = KW_MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:310:9: ( 'MONTH' )
			// grammar/HiveLexer.g:310:11: 'MONTH'
			{
			match("MONTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MONTH"

	// $ANTLR start "KW_DAY"
	public final void mKW_DAY() throws RecognitionException {
		try {
			int _type = KW_DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:311:7: ( 'DAY' )
			// grammar/HiveLexer.g:311:9: 'DAY'
			{
			match("DAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DAY"

	// $ANTLR start "KW_HOUR"
	public final void mKW_HOUR() throws RecognitionException {
		try {
			int _type = KW_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:312:8: ( 'HOUR' )
			// grammar/HiveLexer.g:312:10: 'HOUR'
			{
			match("HOUR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOUR"

	// $ANTLR start "KW_MINUTE"
	public final void mKW_MINUTE() throws RecognitionException {
		try {
			int _type = KW_MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:313:10: ( 'MINUTE' )
			// grammar/HiveLexer.g:313:12: 'MINUTE'
			{
			match("MINUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUTE"

	// $ANTLR start "KW_SECOND"
	public final void mKW_SECOND() throws RecognitionException {
		try {
			int _type = KW_SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:314:10: ( 'SECOND' )
			// grammar/HiveLexer.g:314:12: 'SECOND'
			{
			match("SECOND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SECOND"

	// $ANTLR start "KW_START"
	public final void mKW_START() throws RecognitionException {
		try {
			int _type = KW_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:315:9: ( 'START' )
			// grammar/HiveLexer.g:315:11: 'START'
			{
			match("START"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_START"

	// $ANTLR start "KW_TRANSACTION"
	public final void mKW_TRANSACTION() throws RecognitionException {
		try {
			int _type = KW_TRANSACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:316:15: ( 'TRANSACTION' )
			// grammar/HiveLexer.g:316:17: 'TRANSACTION'
			{
			match("TRANSACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTION"

	// $ANTLR start "KW_COMMIT"
	public final void mKW_COMMIT() throws RecognitionException {
		try {
			int _type = KW_COMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:317:10: ( 'COMMIT' )
			// grammar/HiveLexer.g:317:12: 'COMMIT'
			{
			match("COMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMIT"

	// $ANTLR start "KW_ROLLBACK"
	public final void mKW_ROLLBACK() throws RecognitionException {
		try {
			int _type = KW_ROLLBACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:318:12: ( 'ROLLBACK' )
			// grammar/HiveLexer.g:318:14: 'ROLLBACK'
			{
			match("ROLLBACK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLBACK"

	// $ANTLR start "KW_WORK"
	public final void mKW_WORK() throws RecognitionException {
		try {
			int _type = KW_WORK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:319:8: ( 'WORK' )
			// grammar/HiveLexer.g:319:10: 'WORK'
			{
			match("WORK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORK"

	// $ANTLR start "KW_ONLY"
	public final void mKW_ONLY() throws RecognitionException {
		try {
			int _type = KW_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:320:8: ( 'ONLY' )
			// grammar/HiveLexer.g:320:10: 'ONLY'
			{
			match("ONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ONLY"

	// $ANTLR start "KW_WRITE"
	public final void mKW_WRITE() throws RecognitionException {
		try {
			int _type = KW_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:321:9: ( 'WRITE' )
			// grammar/HiveLexer.g:321:11: 'WRITE'
			{
			match("WRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WRITE"

	// $ANTLR start "KW_ISOLATION"
	public final void mKW_ISOLATION() throws RecognitionException {
		try {
			int _type = KW_ISOLATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:322:13: ( 'ISOLATION' )
			// grammar/HiveLexer.g:322:15: 'ISOLATION'
			{
			match("ISOLATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ISOLATION"

	// $ANTLR start "KW_LEVEL"
	public final void mKW_LEVEL() throws RecognitionException {
		try {
			int _type = KW_LEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:323:9: ( 'LEVEL' )
			// grammar/HiveLexer.g:323:11: 'LEVEL'
			{
			match("LEVEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEVEL"

	// $ANTLR start "KW_SNAPSHOT"
	public final void mKW_SNAPSHOT() throws RecognitionException {
		try {
			int _type = KW_SNAPSHOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:324:12: ( 'SNAPSHOT' )
			// grammar/HiveLexer.g:324:14: 'SNAPSHOT'
			{
			match("SNAPSHOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SNAPSHOT"

	// $ANTLR start "KW_AUTOCOMMIT"
	public final void mKW_AUTOCOMMIT() throws RecognitionException {
		try {
			int _type = KW_AUTOCOMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:325:14: ( 'AUTOCOMMIT' )
			// grammar/HiveLexer.g:325:16: 'AUTOCOMMIT'
			{
			match("AUTOCOMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTOCOMMIT"

	// $ANTLR start "KW_CACHE"
	public final void mKW_CACHE() throws RecognitionException {
		try {
			int _type = KW_CACHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:326:9: ( 'CACHE' )
			// grammar/HiveLexer.g:326:11: 'CACHE'
			{
			match("CACHE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CACHE"

	// $ANTLR start "KW_PRIMARY"
	public final void mKW_PRIMARY() throws RecognitionException {
		try {
			int _type = KW_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:327:11: ( 'PRIMARY' )
			// grammar/HiveLexer.g:327:13: 'PRIMARY'
			{
			match("PRIMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRIMARY"

	// $ANTLR start "KW_FOREIGN"
	public final void mKW_FOREIGN() throws RecognitionException {
		try {
			int _type = KW_FOREIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:328:11: ( 'FOREIGN' )
			// grammar/HiveLexer.g:328:13: 'FOREIGN'
			{
			match("FOREIGN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOREIGN"

	// $ANTLR start "KW_REFERENCES"
	public final void mKW_REFERENCES() throws RecognitionException {
		try {
			int _type = KW_REFERENCES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:329:14: ( 'REFERENCES' )
			// grammar/HiveLexer.g:329:16: 'REFERENCES'
			{
			match("REFERENCES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REFERENCES"

	// $ANTLR start "KW_CONSTRAINT"
	public final void mKW_CONSTRAINT() throws RecognitionException {
		try {
			int _type = KW_CONSTRAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:330:14: ( 'CONSTRAINT' )
			// grammar/HiveLexer.g:330:16: 'CONSTRAINT'
			{
			match("CONSTRAINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONSTRAINT"

	// $ANTLR start "KW_VALIDATE"
	public final void mKW_VALIDATE() throws RecognitionException {
		try {
			int _type = KW_VALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:331:12: ( 'VALIDATE' )
			// grammar/HiveLexer.g:331:14: 'VALIDATE'
			{
			match("VALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALIDATE"

	// $ANTLR start "KW_NOVALIDATE"
	public final void mKW_NOVALIDATE() throws RecognitionException {
		try {
			int _type = KW_NOVALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:332:14: ( 'NOVALIDATE' )
			// grammar/HiveLexer.g:332:16: 'NOVALIDATE'
			{
			match("NOVALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOVALIDATE"

	// $ANTLR start "KW_RELY"
	public final void mKW_RELY() throws RecognitionException {
		try {
			int _type = KW_RELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:333:8: ( 'RELY' )
			// grammar/HiveLexer.g:333:10: 'RELY'
			{
			match("RELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELY"

	// $ANTLR start "KW_NORELY"
	public final void mKW_NORELY() throws RecognitionException {
		try {
			int _type = KW_NORELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:334:10: ( 'NORELY' )
			// grammar/HiveLexer.g:334:12: 'NORELY'
			{
			match("NORELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NORELY"

	// $ANTLR start "KW_KEY"
	public final void mKW_KEY() throws RecognitionException {
		try {
			int _type = KW_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:335:7: ( 'KEY' )
			// grammar/HiveLexer.g:335:9: 'KEY'
			{
			match("KEY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY"

	// $ANTLR start "KW_ABORT"
	public final void mKW_ABORT() throws RecognitionException {
		try {
			int _type = KW_ABORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:336:9: ( 'ABORT' )
			// grammar/HiveLexer.g:336:11: 'ABORT'
			{
			match("ABORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ABORT"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:341:5: ( '.' )
			// grammar/HiveLexer.g:341:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:342:7: ( ':' )
			// grammar/HiveLexer.g:342:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:343:7: ( ',' )
			// grammar/HiveLexer.g:343:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:344:11: ( ';' )
			// grammar/HiveLexer.g:344:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:346:8: ( '(' )
			// grammar/HiveLexer.g:346:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:347:8: ( ')' )
			// grammar/HiveLexer.g:347:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:348:9: ( '[' )
			// grammar/HiveLexer.g:348:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:349:9: ( ']' )
			// grammar/HiveLexer.g:349:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:350:8: ( '{' )
			// grammar/HiveLexer.g:350:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:351:8: ( '}' )
			// grammar/HiveLexer.g:351:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:353:7: ( '=' | '==' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='=') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='=') ) {
					alt2=2;
				}

				else {
					alt2=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// grammar/HiveLexer.g:353:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// grammar/HiveLexer.g:353:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUAL_NS"
	public final void mEQUAL_NS() throws RecognitionException {
		try {
			int _type = EQUAL_NS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:354:10: ( '<=>' )
			// grammar/HiveLexer.g:354:12: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_NS"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:355:10: ( '<>' | '!=' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='<') ) {
				alt3=1;
			}
			else if ( (LA3_0=='!') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// grammar/HiveLexer.g:355:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:355:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:356:19: ( '<=' )
			// grammar/HiveLexer.g:356:21: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:357:10: ( '<' )
			// grammar/HiveLexer.g:357:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:358:22: ( '>=' )
			// grammar/HiveLexer.g:358:24: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:359:13: ( '>' )
			// grammar/HiveLexer.g:359:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:361:8: ( '/' )
			// grammar/HiveLexer.g:361:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:362:6: ( '+' )
			// grammar/HiveLexer.g:362:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:363:7: ( '-' )
			// grammar/HiveLexer.g:363:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:364:6: ( '*' )
			// grammar/HiveLexer.g:364:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:365:5: ( '%' )
			// grammar/HiveLexer.g:365:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:366:5: ( 'DIV' )
			// grammar/HiveLexer.g:366:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:368:11: ( '&' )
			// grammar/HiveLexer.g:368:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:369:7: ( '~' )
			// grammar/HiveLexer.g:369:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:370:11: ( '|' )
			// grammar/HiveLexer.g:370:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:371:12: ( '^' )
			// grammar/HiveLexer.g:371:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:372:10: ( '?' )
			// grammar/HiveLexer.g:372:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:373:8: ( '$' )
			// grammar/HiveLexer.g:373:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:378:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// grammar/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:383:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// grammar/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:388:5: ( '0' .. '9' )
			// grammar/HiveLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:394:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// grammar/HiveLexer.g:395:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// grammar/HiveLexer.g:395:17: ( PLUS | MINUS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='+'||LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// grammar/HiveLexer.g:395:33: ( Digit )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:400:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR | '!' )
			// grammar/HiveLexer.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:407:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// grammar/HiveLexer.g:408:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// grammar/HiveLexer.g:408:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\'') ) {
					alt8=1;
				}
				else if ( (LA8_0=='\"') ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// grammar/HiveLexer.g:408:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// grammar/HiveLexer.g:408:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// grammar/HiveLexer.g:408:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// grammar/HiveLexer.g:408:29: ( '\\\\' . )
							{
							// grammar/HiveLexer.g:408:29: ( '\\\\' . )
							// grammar/HiveLexer.g:408:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// grammar/HiveLexer.g:409:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// grammar/HiveLexer.g:409:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// grammar/HiveLexer.g:409:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// grammar/HiveLexer.g:409:29: ( '\\\\' . )
							{
							// grammar/HiveLexer.g:409:29: ( '\\\\' . )
							// grammar/HiveLexer.g:409:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop7;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:414:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\"'||LA10_0=='\'') ) {
				alt10=1;
			}
			else if ( (LA10_0=='0') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// grammar/HiveLexer.g:415:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:416:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// grammar/HiveLexer.g:416:15: ( HexDigit | Digit )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// grammar/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "BigintLiteral"
	public final void mBigintLiteral() throws RecognitionException {
		try {
			int _type = BigintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:420:5: ( ( Digit )+ 'L' )
			// grammar/HiveLexer.g:421:5: ( Digit )+ 'L'
			{
			// grammar/HiveLexer.g:421:5: ( Digit )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('L'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BigintLiteral"

	// $ANTLR start "SmallintLiteral"
	public final void mSmallintLiteral() throws RecognitionException {
		try {
			int _type = SmallintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:425:5: ( ( Digit )+ 'S' )
			// grammar/HiveLexer.g:426:5: ( Digit )+ 'S'
			{
			// grammar/HiveLexer.g:426:5: ( Digit )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('S'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SmallintLiteral"

	// $ANTLR start "TinyintLiteral"
	public final void mTinyintLiteral() throws RecognitionException {
		try {
			int _type = TinyintLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:430:5: ( ( Digit )+ 'Y' )
			// grammar/HiveLexer.g:431:5: ( Digit )+ 'Y'
			{
			// grammar/HiveLexer.g:431:5: ( Digit )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match('Y'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TinyintLiteral"

	// $ANTLR start "DecimalLiteral"
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:435:5: ( Number 'B' 'D' )
			// grammar/HiveLexer.g:436:5: Number 'B' 'D'
			{
			mNumber(); 

			match('B'); 
			match('D'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DecimalLiteral"

	// $ANTLR start "ByteLengthLiteral"
	public final void mByteLengthLiteral() throws RecognitionException {
		try {
			int _type = ByteLengthLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:440:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// grammar/HiveLexer.g:441:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// grammar/HiveLexer.g:441:5: ( Digit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ByteLengthLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:445:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// grammar/HiveLexer.g:446:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// grammar/HiveLexer.g:446:5: ( Digit )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// grammar/HiveLexer.g:446:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='.') ) {
				alt18=1;
			}
			else if ( (LA18_0=='E'||LA18_0=='e') ) {
				alt18=2;
			}
			switch (alt18) {
				case 1 :
					// grammar/HiveLexer.g:446:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// grammar/HiveLexer.g:446:20: ( Digit )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// grammar/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					// grammar/HiveLexer.g:446:29: ( Exponent )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='E'||LA17_0=='e') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// grammar/HiveLexer.g:446:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:446:43: Exponent
					{
					mExponent(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:471:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
			int alt21=3;
			alt21 = dfa21.predict(input);
			switch (alt21) {
				case 1 :
					// grammar/HiveLexer.g:472:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// grammar/HiveLexer.g:472:22: ( Letter | Digit | '_' )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// grammar/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:473:7: {...}? QuotedIdentifier
					{
					if ( !((true)) ) {
						throw new FailedPredicateException(input, "Identifier", "true");
					}
					mQuotedIdentifier(); 

					}
					break;
				case 3 :
					// grammar/HiveLexer.g:475:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// grammar/HiveLexer.g:475:11: ( RegexComponent )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='!'||LA20_0=='$'||(LA20_0 >= '(' && LA20_0 <= '+')||(LA20_0 >= '-' && LA20_0 <= '.')||(LA20_0 >= '0' && LA20_0 <= '9')||LA20_0=='?'||(LA20_0 >= 'A' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '_')||(LA20_0 >= 'a' && LA20_0 <= '}')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// grammar/HiveLexer.g:
							{
							if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "QuotedIdentifier"
	public final void mQuotedIdentifier() throws RecognitionException {
		try {
			// grammar/HiveLexer.g:480:5: ( '`' ( '``' |~ ( '`' ) )* '`' )
			// grammar/HiveLexer.g:481:5: '`' ( '``' |~ ( '`' ) )* '`'
			{
			match('`'); 
			// grammar/HiveLexer.g:481:10: ( '``' |~ ( '`' ) )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='`') ) {
					int LA22_1 = input.LA(2);
					if ( (LA22_1=='`') ) {
						alt22=1;
					}

				}
				else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '_')||(LA22_0 >= 'a' && LA22_0 <= '\uFFFF')) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// grammar/HiveLexer.g:481:12: '``'
					{
					match("``"); 

					}
					break;
				case 2 :
					// grammar/HiveLexer.g:481:19: ~ ( '`' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop22;
				}
			}

			match('`'); 
			 setText(getText().substring(1, getText().length() -1 ).replaceAll("``", "`")); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuotedIdentifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:485:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// grammar/HiveLexer.g:486:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// grammar/HiveLexer.g:486:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '-' && LA23_0 <= '.')||(LA23_0 >= '0' && LA23_0 <= ':')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:489:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// grammar/HiveLexer.g:489:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// grammar/HiveLexer.g:493:3: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// grammar/HiveLexer.g:493:5: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// grammar/HiveLexer.g:493:10: (~ ( '\\n' | '\\r' ) )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\f')||(LA24_0 >= '\u000E' && LA24_0 <= '\uFFFF')) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// grammar/HiveLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop24;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// grammar/HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_REWRITE | KW_AUTHORIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_MONTH | KW_DAY | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_KEY | KW_ABORT | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT )
		int alt25=326;
		alt25 = dfa25.predict(input);
		switch (alt25) {
			case 1 :
				// grammar/HiveLexer.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// grammar/HiveLexer.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// grammar/HiveLexer.g:1:27: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 4 :
				// grammar/HiveLexer.g:1:34: KW_NONE
				{
				mKW_NONE(); 

				}
				break;
			case 5 :
				// grammar/HiveLexer.g:1:42: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 6 :
				// grammar/HiveLexer.g:1:49: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 7 :
				// grammar/HiveLexer.g:1:55: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 8 :
				// grammar/HiveLexer.g:1:62: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 9 :
				// grammar/HiveLexer.g:1:70: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 10 :
				// grammar/HiveLexer.g:1:76: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 11 :
				// grammar/HiveLexer.g:1:86: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 12 :
				// grammar/HiveLexer.g:1:93: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 13 :
				// grammar/HiveLexer.g:1:101: KW_NULLS
				{
				mKW_NULLS(); 

				}
				break;
			case 14 :
				// grammar/HiveLexer.g:1:110: KW_LAST
				{
				mKW_LAST(); 

				}
				break;
			case 15 :
				// grammar/HiveLexer.g:1:118: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 16 :
				// grammar/HiveLexer.g:1:127: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 17 :
				// grammar/HiveLexer.g:1:136: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 18 :
				// grammar/HiveLexer.g:1:142: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 19 :
				// grammar/HiveLexer.g:1:152: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 20 :
				// grammar/HiveLexer.g:1:161: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 21 :
				// grammar/HiveLexer.g:1:169: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 22 :
				// grammar/HiveLexer.g:1:175: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 23 :
				// grammar/HiveLexer.g:1:185: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 24 :
				// grammar/HiveLexer.g:1:197: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 25 :
				// grammar/HiveLexer.g:1:207: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 26 :
				// grammar/HiveLexer.g:1:220: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 27 :
				// grammar/HiveLexer.g:1:229: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 28 :
				// grammar/HiveLexer.g:1:243: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 29 :
				// grammar/HiveLexer.g:1:255: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 30 :
				// grammar/HiveLexer.g:1:263: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 31 :
				// grammar/HiveLexer.g:1:271: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 32 :
				// grammar/HiveLexer.g:1:280: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 33 :
				// grammar/HiveLexer.g:1:288: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 34 :
				// grammar/HiveLexer.g:1:294: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 35 :
				// grammar/HiveLexer.g:1:307: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 36 :
				// grammar/HiveLexer.g:1:321: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 37 :
				// grammar/HiveLexer.g:1:330: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 38 :
				// grammar/HiveLexer.g:1:340: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 39 :
				// grammar/HiveLexer.g:1:351: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 40 :
				// grammar/HiveLexer.g:1:360: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 41 :
				// grammar/HiveLexer.g:1:371: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 42 :
				// grammar/HiveLexer.g:1:382: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 43 :
				// grammar/HiveLexer.g:1:395: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 44 :
				// grammar/HiveLexer.g:1:403: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 45 :
				// grammar/HiveLexer.g:1:411: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 46 :
				// grammar/HiveLexer.g:1:421: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 47 :
				// grammar/HiveLexer.g:1:434: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 48 :
				// grammar/HiveLexer.g:1:443: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 49 :
				// grammar/HiveLexer.g:1:456: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 50 :
				// grammar/HiveLexer.g:1:465: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 51 :
				// grammar/HiveLexer.g:1:476: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 52 :
				// grammar/HiveLexer.g:1:490: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 53 :
				// grammar/HiveLexer.g:1:498: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 54 :
				// grammar/HiveLexer.g:1:507: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 55 :
				// grammar/HiveLexer.g:1:515: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 56 :
				// grammar/HiveLexer.g:1:525: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 57 :
				// grammar/HiveLexer.g:1:535: KW_REPLICATION
				{
				mKW_REPLICATION(); 

				}
				break;
			case 58 :
				// grammar/HiveLexer.g:1:550: KW_METADATA
				{
				mKW_METADATA(); 

				}
				break;
			case 59 :
				// grammar/HiveLexer.g:1:562: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 60 :
				// grammar/HiveLexer.g:1:570: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 61 :
				// grammar/HiveLexer.g:1:580: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 62 :
				// grammar/HiveLexer.g:1:586: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 63 :
				// grammar/HiveLexer.g:1:594: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 64 :
				// grammar/HiveLexer.g:1:604: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 65 :
				// grammar/HiveLexer.g:1:616: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 66 :
				// grammar/HiveLexer.g:1:625: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 67 :
				// grammar/HiveLexer.g:1:635: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 68 :
				// grammar/HiveLexer.g:1:645: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 69 :
				// grammar/HiveLexer.g:1:654: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 70 :
				// grammar/HiveLexer.g:1:663: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 71 :
				// grammar/HiveLexer.g:1:675: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 72 :
				// grammar/HiveLexer.g:1:683: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 73 :
				// grammar/HiveLexer.g:1:693: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 74 :
				// grammar/HiveLexer.g:1:699: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 75 :
				// grammar/HiveLexer.g:1:710: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 76 :
				// grammar/HiveLexer.g:1:721: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 77 :
				// grammar/HiveLexer.g:1:732: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 78 :
				// grammar/HiveLexer.g:1:744: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 79 :
				// grammar/HiveLexer.g:1:751: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 80 :
				// grammar/HiveLexer.g:1:761: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 81 :
				// grammar/HiveLexer.g:1:770: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 82 :
				// grammar/HiveLexer.g:1:780: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 83 :
				// grammar/HiveLexer.g:1:788: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 84 :
				// grammar/HiveLexer.g:1:800: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 85 :
				// grammar/HiveLexer.g:1:813: KW_INTERVAL
				{
				mKW_INTERVAL(); 

				}
				break;
			case 86 :
				// grammar/HiveLexer.g:1:825: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 87 :
				// grammar/HiveLexer.g:1:836: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 88 :
				// grammar/HiveLexer.g:1:846: KW_CHAR
				{
				mKW_CHAR(); 

				}
				break;
			case 89 :
				// grammar/HiveLexer.g:1:854: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 90 :
				// grammar/HiveLexer.g:1:865: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 91 :
				// grammar/HiveLexer.g:1:874: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 92 :
				// grammar/HiveLexer.g:1:884: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 93 :
				// grammar/HiveLexer.g:1:891: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 94 :
				// grammar/HiveLexer.g:1:904: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 95 :
				// grammar/HiveLexer.g:1:914: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 96 :
				// grammar/HiveLexer.g:1:929: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 97 :
				// grammar/HiveLexer.g:1:942: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 98 :
				// grammar/HiveLexer.g:1:952: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 99 :
				// grammar/HiveLexer.g:1:960: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 100 :
				// grammar/HiveLexer.g:1:971: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 101 :
				// grammar/HiveLexer.g:1:978: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 102 :
				// grammar/HiveLexer.g:1:986: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 103 :
				// grammar/HiveLexer.g:1:996: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 104 :
				// grammar/HiveLexer.g:1:1009: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 105 :
				// grammar/HiveLexer.g:1:1019: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 106 :
				// grammar/HiveLexer.g:1:1033: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 107 :
				// grammar/HiveLexer.g:1:1044: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 108 :
				// grammar/HiveLexer.g:1:1058: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 109 :
				// grammar/HiveLexer.g:1:1067: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 110 :
				// grammar/HiveLexer.g:1:1075: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 111 :
				// grammar/HiveLexer.g:1:1087: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 112 :
				// grammar/HiveLexer.g:1:1096: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 113 :
				// grammar/HiveLexer.g:1:1106: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 114 :
				// grammar/HiveLexer.g:1:1120: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 115 :
				// grammar/HiveLexer.g:1:1135: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 116 :
				// grammar/HiveLexer.g:1:1151: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 117 :
				// grammar/HiveLexer.g:1:1166: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 118 :
				// grammar/HiveLexer.g:1:1182: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 119 :
				// grammar/HiveLexer.g:1:1192: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 120 :
				// grammar/HiveLexer.g:1:1203: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 121 :
				// grammar/HiveLexer.g:1:1215: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 122 :
				// grammar/HiveLexer.g:1:1230: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 123 :
				// grammar/HiveLexer.g:1:1240: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 124 :
				// grammar/HiveLexer.g:1:1247: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 125 :
				// grammar/HiveLexer.g:1:1253: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 126 :
				// grammar/HiveLexer.g:1:1264: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 127 :
				// grammar/HiveLexer.g:1:1272: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 128 :
				// grammar/HiveLexer.g:1:1279: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 129 :
				// grammar/HiveLexer.g:1:1290: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 130 :
				// grammar/HiveLexer.g:1:1299: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 131 :
				// grammar/HiveLexer.g:1:1309: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 132 :
				// grammar/HiveLexer.g:1:1322: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 133 :
				// grammar/HiveLexer.g:1:1334: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 134 :
				// grammar/HiveLexer.g:1:1343: KW_FILE
				{
				mKW_FILE(); 

				}
				break;
			case 135 :
				// grammar/HiveLexer.g:1:1351: KW_JAR
				{
				mKW_JAR(); 

				}
				break;
			case 136 :
				// grammar/HiveLexer.g:1:1358: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 137 :
				// grammar/HiveLexer.g:1:1369: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 138 :
				// grammar/HiveLexer.g:1:1381: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 139 :
				// grammar/HiveLexer.g:1:1394: KW_PRETTY
				{
				mKW_PRETTY(); 

				}
				break;
			case 140 :
				// grammar/HiveLexer.g:1:1404: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 141 :
				// grammar/HiveLexer.g:1:1418: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 142 :
				// grammar/HiveLexer.g:1:1429: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 143 :
				// grammar/HiveLexer.g:1:1438: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 144 :
				// grammar/HiveLexer.g:1:1446: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 145 :
				// grammar/HiveLexer.g:1:1458: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 146 :
				// grammar/HiveLexer.g:1:1477: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 147 :
				// grammar/HiveLexer.g:1:1493: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 148 :
				// grammar/HiveLexer.g:1:1502: KW_OFFSET
				{
				mKW_OFFSET(); 

				}
				break;
			case 149 :
				// grammar/HiveLexer.g:1:1512: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 150 :
				// grammar/HiveLexer.g:1:1519: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 151 :
				// grammar/HiveLexer.g:1:1528: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 152 :
				// grammar/HiveLexer.g:1:1545: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 153 :
				// grammar/HiveLexer.g:1:1562: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 154 :
				// grammar/HiveLexer.g:1:1576: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 155 :
				// grammar/HiveLexer.g:1:1589: KW_DEFINED
				{
				mKW_DEFINED(); 

				}
				break;
			case 156 :
				// grammar/HiveLexer.g:1:1600: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 157 :
				// grammar/HiveLexer.g:1:1608: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 158 :
				// grammar/HiveLexer.g:1:1616: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 159 :
				// grammar/HiveLexer.g:1:1624: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 160 :
				// grammar/HiveLexer.g:1:1632: KW_END
				{
				mKW_END(); 

				}
				break;
			case 161 :
				// grammar/HiveLexer.g:1:1639: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 162 :
				// grammar/HiveLexer.g:1:1650: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 163 :
				// grammar/HiveLexer.g:1:1665: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 164 :
				// grammar/HiveLexer.g:1:1682: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 165 :
				// grammar/HiveLexer.g:1:1689: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 166 :
				// grammar/HiveLexer.g:1:1705: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 167 :
				// grammar/HiveLexer.g:1:1713: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 168 :
				// grammar/HiveLexer.g:1:1723: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 169 :
				// grammar/HiveLexer.g:1:1731: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 170 :
				// grammar/HiveLexer.g:1:1740: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 171 :
				// grammar/HiveLexer.g:1:1749: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 172 :
				// grammar/HiveLexer.g:1:1762: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 173 :
				// grammar/HiveLexer.g:1:1770: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 174 :
				// grammar/HiveLexer.g:1:1776: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 175 :
				// grammar/HiveLexer.g:1:1788: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 176 :
				// grammar/HiveLexer.g:1:1801: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 177 :
				// grammar/HiveLexer.g:1:1817: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 178 :
				// grammar/HiveLexer.g:1:1827: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 179 :
				// grammar/HiveLexer.g:1:1838: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 180 :
				// grammar/HiveLexer.g:1:1847: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 181 :
				// grammar/HiveLexer.g:1:1857: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 182 :
				// grammar/HiveLexer.g:1:1864: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 183 :
				// grammar/HiveLexer.g:1:1872: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 184 :
				// grammar/HiveLexer.g:1:1880: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 185 :
				// grammar/HiveLexer.g:1:1889: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 186 :
				// grammar/HiveLexer.g:1:1899: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 187 :
				// grammar/HiveLexer.g:1:1909: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 188 :
				// grammar/HiveLexer.g:1:1922: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 189 :
				// grammar/HiveLexer.g:1:1935: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 190 :
				// grammar/HiveLexer.g:1:1947: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 191 :
				// grammar/HiveLexer.g:1:1956: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 192 :
				// grammar/HiveLexer.g:1:1964: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 193 :
				// grammar/HiveLexer.g:1:1973: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 194 :
				// grammar/HiveLexer.g:1:1982: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 195 :
				// grammar/HiveLexer.g:1:1991: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 196 :
				// grammar/HiveLexer.g:1:2002: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 197 :
				// grammar/HiveLexer.g:1:2012: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 198 :
				// grammar/HiveLexer.g:1:2023: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 199 :
				// grammar/HiveLexer.g:1:2031: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 200 :
				// grammar/HiveLexer.g:1:2041: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 201 :
				// grammar/HiveLexer.g:1:2050: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 202 :
				// grammar/HiveLexer.g:1:2062: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 203 :
				// grammar/HiveLexer.g:1:2072: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 204 :
				// grammar/HiveLexer.g:1:2083: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 205 :
				// grammar/HiveLexer.g:1:2099: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 206 :
				// grammar/HiveLexer.g:1:2115: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 207 :
				// grammar/HiveLexer.g:1:2123: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 208 :
				// grammar/HiveLexer.g:1:2134: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 209 :
				// grammar/HiveLexer.g:1:2143: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 210 :
				// grammar/HiveLexer.g:1:2154: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 211 :
				// grammar/HiveLexer.g:1:2167: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 212 :
				// grammar/HiveLexer.g:1:2178: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 213 :
				// grammar/HiveLexer.g:1:2192: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 214 :
				// grammar/HiveLexer.g:1:2199: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 215 :
				// grammar/HiveLexer.g:1:2209: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 216 :
				// grammar/HiveLexer.g:1:2224: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 217 :
				// grammar/HiveLexer.g:1:2241: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 218 :
				// grammar/HiveLexer.g:1:2251: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 219 :
				// grammar/HiveLexer.g:1:2263: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 220 :
				// grammar/HiveLexer.g:1:2274: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 221 :
				// grammar/HiveLexer.g:1:2284: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 222 :
				// grammar/HiveLexer.g:1:2294: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 223 :
				// grammar/HiveLexer.g:1:2302: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 224 :
				// grammar/HiveLexer.g:1:2317: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 225 :
				// grammar/HiveLexer.g:1:2324: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 226 :
				// grammar/HiveLexer.g:1:2334: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 227 :
				// grammar/HiveLexer.g:1:2347: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 228 :
				// grammar/HiveLexer.g:1:2360: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 229 :
				// grammar/HiveLexer.g:1:2373: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 230 :
				// grammar/HiveLexer.g:1:2384: KW_CURRENT_DATE
				{
				mKW_CURRENT_DATE(); 

				}
				break;
			case 231 :
				// grammar/HiveLexer.g:1:2400: KW_CURRENT_TIMESTAMP
				{
				mKW_CURRENT_TIMESTAMP(); 

				}
				break;
			case 232 :
				// grammar/HiveLexer.g:1:2421: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 233 :
				// grammar/HiveLexer.g:1:2429: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 234 :
				// grammar/HiveLexer.g:1:2437: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 235 :
				// grammar/HiveLexer.g:1:2445: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 236 :
				// grammar/HiveLexer.g:1:2457: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 237 :
				// grammar/HiveLexer.g:1:2465: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 238 :
				// grammar/HiveLexer.g:1:2477: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 239 :
				// grammar/HiveLexer.g:1:2487: KW_PARTIALSCAN
				{
				mKW_PARTIALSCAN(); 

				}
				break;
			case 240 :
				// grammar/HiveLexer.g:1:2502: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 241 :
				// grammar/HiveLexer.g:1:2510: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 242 :
				// grammar/HiveLexer.g:1:2518: KW_ROLES
				{
				mKW_ROLES(); 

				}
				break;
			case 243 :
				// grammar/HiveLexer.g:1:2527: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 244 :
				// grammar/HiveLexer.g:1:2536: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 245 :
				// grammar/HiveLexer.g:1:2548: KW_URI
				{
				mKW_URI(); 

				}
				break;
			case 246 :
				// grammar/HiveLexer.g:1:2555: KW_SERVER
				{
				mKW_SERVER(); 

				}
				break;
			case 247 :
				// grammar/HiveLexer.g:1:2565: KW_ADMIN
				{
				mKW_ADMIN(); 

				}
				break;
			case 248 :
				// grammar/HiveLexer.g:1:2574: KW_OWNER
				{
				mKW_OWNER(); 

				}
				break;
			case 249 :
				// grammar/HiveLexer.g:1:2583: KW_PRINCIPALS
				{
				mKW_PRINCIPALS(); 

				}
				break;
			case 250 :
				// grammar/HiveLexer.g:1:2597: KW_COMPACT
				{
				mKW_COMPACT(); 

				}
				break;
			case 251 :
				// grammar/HiveLexer.g:1:2608: KW_COMPACTIONS
				{
				mKW_COMPACTIONS(); 

				}
				break;
			case 252 :
				// grammar/HiveLexer.g:1:2623: KW_TRANSACTIONS
				{
				mKW_TRANSACTIONS(); 

				}
				break;
			case 253 :
				// grammar/HiveLexer.g:1:2639: KW_REWRITE
				{
				mKW_REWRITE(); 

				}
				break;
			case 254 :
				// grammar/HiveLexer.g:1:2650: KW_AUTHORIZATION
				{
				mKW_AUTHORIZATION(); 

				}
				break;
			case 255 :
				// grammar/HiveLexer.g:1:2667: KW_CONF
				{
				mKW_CONF(); 

				}
				break;
			case 256 :
				// grammar/HiveLexer.g:1:2675: KW_VALUES
				{
				mKW_VALUES(); 

				}
				break;
			case 257 :
				// grammar/HiveLexer.g:1:2685: KW_RELOAD
				{
				mKW_RELOAD(); 

				}
				break;
			case 258 :
				// grammar/HiveLexer.g:1:2695: KW_YEAR
				{
				mKW_YEAR(); 

				}
				break;
			case 259 :
				// grammar/HiveLexer.g:1:2703: KW_MONTH
				{
				mKW_MONTH(); 

				}
				break;
			case 260 :
				// grammar/HiveLexer.g:1:2712: KW_DAY
				{
				mKW_DAY(); 

				}
				break;
			case 261 :
				// grammar/HiveLexer.g:1:2719: KW_HOUR
				{
				mKW_HOUR(); 

				}
				break;
			case 262 :
				// grammar/HiveLexer.g:1:2727: KW_MINUTE
				{
				mKW_MINUTE(); 

				}
				break;
			case 263 :
				// grammar/HiveLexer.g:1:2737: KW_SECOND
				{
				mKW_SECOND(); 

				}
				break;
			case 264 :
				// grammar/HiveLexer.g:1:2747: KW_START
				{
				mKW_START(); 

				}
				break;
			case 265 :
				// grammar/HiveLexer.g:1:2756: KW_TRANSACTION
				{
				mKW_TRANSACTION(); 

				}
				break;
			case 266 :
				// grammar/HiveLexer.g:1:2771: KW_COMMIT
				{
				mKW_COMMIT(); 

				}
				break;
			case 267 :
				// grammar/HiveLexer.g:1:2781: KW_ROLLBACK
				{
				mKW_ROLLBACK(); 

				}
				break;
			case 268 :
				// grammar/HiveLexer.g:1:2793: KW_WORK
				{
				mKW_WORK(); 

				}
				break;
			case 269 :
				// grammar/HiveLexer.g:1:2801: KW_ONLY
				{
				mKW_ONLY(); 

				}
				break;
			case 270 :
				// grammar/HiveLexer.g:1:2809: KW_WRITE
				{
				mKW_WRITE(); 

				}
				break;
			case 271 :
				// grammar/HiveLexer.g:1:2818: KW_ISOLATION
				{
				mKW_ISOLATION(); 

				}
				break;
			case 272 :
				// grammar/HiveLexer.g:1:2831: KW_LEVEL
				{
				mKW_LEVEL(); 

				}
				break;
			case 273 :
				// grammar/HiveLexer.g:1:2840: KW_SNAPSHOT
				{
				mKW_SNAPSHOT(); 

				}
				break;
			case 274 :
				// grammar/HiveLexer.g:1:2852: KW_AUTOCOMMIT
				{
				mKW_AUTOCOMMIT(); 

				}
				break;
			case 275 :
				// grammar/HiveLexer.g:1:2866: KW_CACHE
				{
				mKW_CACHE(); 

				}
				break;
			case 276 :
				// grammar/HiveLexer.g:1:2875: KW_PRIMARY
				{
				mKW_PRIMARY(); 

				}
				break;
			case 277 :
				// grammar/HiveLexer.g:1:2886: KW_FOREIGN
				{
				mKW_FOREIGN(); 

				}
				break;
			case 278 :
				// grammar/HiveLexer.g:1:2897: KW_REFERENCES
				{
				mKW_REFERENCES(); 

				}
				break;
			case 279 :
				// grammar/HiveLexer.g:1:2911: KW_CONSTRAINT
				{
				mKW_CONSTRAINT(); 

				}
				break;
			case 280 :
				// grammar/HiveLexer.g:1:2925: KW_VALIDATE
				{
				mKW_VALIDATE(); 

				}
				break;
			case 281 :
				// grammar/HiveLexer.g:1:2937: KW_NOVALIDATE
				{
				mKW_NOVALIDATE(); 

				}
				break;
			case 282 :
				// grammar/HiveLexer.g:1:2951: KW_RELY
				{
				mKW_RELY(); 

				}
				break;
			case 283 :
				// grammar/HiveLexer.g:1:2959: KW_NORELY
				{
				mKW_NORELY(); 

				}
				break;
			case 284 :
				// grammar/HiveLexer.g:1:2969: KW_KEY
				{
				mKW_KEY(); 

				}
				break;
			case 285 :
				// grammar/HiveLexer.g:1:2976: KW_ABORT
				{
				mKW_ABORT(); 

				}
				break;
			case 286 :
				// grammar/HiveLexer.g:1:2985: DOT
				{
				mDOT(); 

				}
				break;
			case 287 :
				// grammar/HiveLexer.g:1:2989: COLON
				{
				mCOLON(); 

				}
				break;
			case 288 :
				// grammar/HiveLexer.g:1:2995: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 289 :
				// grammar/HiveLexer.g:1:3001: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 290 :
				// grammar/HiveLexer.g:1:3011: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 291 :
				// grammar/HiveLexer.g:1:3018: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 292 :
				// grammar/HiveLexer.g:1:3025: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 293 :
				// grammar/HiveLexer.g:1:3033: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 294 :
				// grammar/HiveLexer.g:1:3041: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 295 :
				// grammar/HiveLexer.g:1:3048: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 296 :
				// grammar/HiveLexer.g:1:3055: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 297 :
				// grammar/HiveLexer.g:1:3061: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 298 :
				// grammar/HiveLexer.g:1:3070: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 299 :
				// grammar/HiveLexer.g:1:3079: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 300 :
				// grammar/HiveLexer.g:1:3097: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 301 :
				// grammar/HiveLexer.g:1:3106: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 302 :
				// grammar/HiveLexer.g:1:3127: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 303 :
				// grammar/HiveLexer.g:1:3139: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 304 :
				// grammar/HiveLexer.g:1:3146: PLUS
				{
				mPLUS(); 

				}
				break;
			case 305 :
				// grammar/HiveLexer.g:1:3151: MINUS
				{
				mMINUS(); 

				}
				break;
			case 306 :
				// grammar/HiveLexer.g:1:3157: STAR
				{
				mSTAR(); 

				}
				break;
			case 307 :
				// grammar/HiveLexer.g:1:3162: MOD
				{
				mMOD(); 

				}
				break;
			case 308 :
				// grammar/HiveLexer.g:1:3166: DIV
				{
				mDIV(); 

				}
				break;
			case 309 :
				// grammar/HiveLexer.g:1:3170: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 310 :
				// grammar/HiveLexer.g:1:3180: TILDE
				{
				mTILDE(); 

				}
				break;
			case 311 :
				// grammar/HiveLexer.g:1:3186: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 312 :
				// grammar/HiveLexer.g:1:3196: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 313 :
				// grammar/HiveLexer.g:1:3207: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 314 :
				// grammar/HiveLexer.g:1:3216: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 315 :
				// grammar/HiveLexer.g:1:3223: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 316 :
				// grammar/HiveLexer.g:1:3237: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 317 :
				// grammar/HiveLexer.g:1:3252: BigintLiteral
				{
				mBigintLiteral(); 

				}
				break;
			case 318 :
				// grammar/HiveLexer.g:1:3266: SmallintLiteral
				{
				mSmallintLiteral(); 

				}
				break;
			case 319 :
				// grammar/HiveLexer.g:1:3282: TinyintLiteral
				{
				mTinyintLiteral(); 

				}
				break;
			case 320 :
				// grammar/HiveLexer.g:1:3297: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 321 :
				// grammar/HiveLexer.g:1:3312: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 322 :
				// grammar/HiveLexer.g:1:3330: Number
				{
				mNumber(); 

				}
				break;
			case 323 :
				// grammar/HiveLexer.g:1:3337: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 324 :
				// grammar/HiveLexer.g:1:3348: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 325 :
				// grammar/HiveLexer.g:1:3360: WS
				{
				mWS(); 

				}
				break;
			case 326 :
				// grammar/HiveLexer.g:1:3363: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA21 dfa21 = new DFA21(this);
	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA21_eotS =
		"\7\uffff";
	static final String DFA21_eofS =
		"\7\uffff";
	static final String DFA21_minS =
		"\1\60\1\uffff\1\0\1\uffff\2\0\1\uffff";
	static final String DFA21_maxS =
		"\1\172\1\uffff\1\uffff\1\uffff\1\uffff\1\0\1\uffff";
	static final String DFA21_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3";
	static final String DFA21_specialS =
		"\2\uffff\1\1\1\uffff\1\2\1\0\1\uffff}>";
	static final String[] DFA21_transitionS = {
			"\12\1\7\uffff\32\1\5\uffff\1\2\32\1",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\3\35\4\uff82\3",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\5\35\4\uff82\3",
			"\1\uffff",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "470:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_5 = input.LA(1);
						 
						int index21_5 = input.index();
						input.rewind();
						s = -1;
						if ( ((true)) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index21_5);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA21_2 = input.LA(1);
						s = -1;
						if ( ((LA21_2 >= '\u0000' && LA21_2 <= ' ')||(LA21_2 >= '\"' && LA21_2 <= '#')||(LA21_2 >= '%' && LA21_2 <= '\'')||LA21_2==','||LA21_2=='/'||(LA21_2 >= ':' && LA21_2 <= '>')||LA21_2=='@'||LA21_2=='\\'||LA21_2=='`'||(LA21_2 >= '~' && LA21_2 <= '\uFFFF')) ) {s = 3;}
						else if ( (LA21_2=='!'||LA21_2=='$'||(LA21_2 >= '(' && LA21_2 <= '+')||(LA21_2 >= '-' && LA21_2 <= '.')||(LA21_2 >= '0' && LA21_2 <= '9')||LA21_2=='?'||(LA21_2 >= 'A' && LA21_2 <= '[')||(LA21_2 >= ']' && LA21_2 <= '_')||(LA21_2 >= 'a' && LA21_2 <= '}')) ) {s = 4;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA21_4 = input.LA(1);
						s = -1;
						if ( (LA21_4=='`') ) {s = 5;}
						else if ( (LA21_4=='!'||LA21_4=='$'||(LA21_4 >= '(' && LA21_4 <= '+')||(LA21_4 >= '-' && LA21_4 <= '.')||(LA21_4 >= '0' && LA21_4 <= '9')||LA21_4=='?'||(LA21_4 >= 'A' && LA21_4 <= '[')||(LA21_4 >= ']' && LA21_4 <= '_')||(LA21_4 >= 'a' && LA21_4 <= '}')) ) {s = 4;}
						else if ( ((LA21_4 >= '\u0000' && LA21_4 <= ' ')||(LA21_4 >= '\"' && LA21_4 <= '#')||(LA21_4 >= '%' && LA21_4 <= '\'')||LA21_4==','||LA21_4=='/'||(LA21_4 >= ':' && LA21_4 <= '>')||LA21_4=='@'||LA21_4=='\\'||(LA21_4 >= '~' && LA21_4 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 21, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS =
		"\1\uffff\5\65\1\130\21\65\1\u00a4\1\65\13\uffff\1\u00a7\1\u00a9\2\uffff"+
		"\1\u00ab\11\uffff\2\u00b9\3\uffff\2\65\1\u00c1\15\65\1\u00d8\7\65\1\u00e7"+
		"\2\65\1\u00eb\1\u00ed\2\65\2\uffff\4\65\1\u00fc\1\u0102\1\65\1\u0105\15"+
		"\65\1\u011f\62\65\4\uffff\1\65\1\u017d\7\uffff\1\u017f\2\uffff\1\u017f"+
		"\1\65\1\u0182\1\u00b9\1\u0183\1\u0184\1\u00b9\1\65\1\uffff\2\u018b\5\65"+
		"\1\uffff\16\65\1\u01a2\2\65\1\u01a5\1\65\1\u01a7\1\65\1\u01a9\1\uffff"+
		"\3\65\1\u01ad\4\65\1\130\5\65\1\uffff\1\65\1\u01bb\1\65\1\uffff\1\65\1"+
		"\uffff\16\65\1\uffff\3\65\1\u01d3\1\65\1\uffff\2\65\1\uffff\10\65\1\u01e1"+
		"\10\65\1\u01ed\1\65\1\u01f0\5\65\1\uffff\21\65\1\u020a\12\65\1\u0218\11"+
		"\65\1\u0225\1\u0227\1\65\1\u0229\10\65\1\u0235\15\65\1\u0246\20\65\1\u0262"+
		"\10\65\1\u026d\1\65\5\uffff\1\u026f\3\uffff\1\u00b9\3\uffff\1\u00b9\1"+
		"\u0187\1\uffff\1\u0274\12\65\1\u027f\1\65\1\u0281\1\u0282\3\65\1\u0287"+
		"\3\65\1\uffff\2\65\1\uffff\1\65\1\uffff\1\65\1\uffff\3\65\1\uffff\4\65"+
		"\1\u0296\3\65\1\u029b\1\65\1\u029e\2\65\1\uffff\1\u02a1\3\65\1\u02a5\2"+
		"\65\1\u02a8\1\65\1\u02aa\1\u02ab\2\65\1\u02b0\1\u02b1\1\65\1\u02b3\5\65"+
		"\1\u02b9\1\uffff\15\65\1\uffff\1\u02c8\1\u02ca\11\65\1\uffff\1\u02d6\1"+
		"\u02d8\1\uffff\1\u02d9\5\65\1\u02df\6\65\1\u02e6\1\65\1\u02e8\1\65\1\u02ea"+
		"\1\65\1\u02ec\4\65\1\u02f1\1\uffff\1\u02f2\1\65\1\u02f5\1\65\1\u02f8\10"+
		"\65\1\uffff\6\65\1\u0307\4\65\1\u030c\1\uffff\1\65\1\uffff\1\65\1\uffff"+
		"\10\65\1\u0317\1\65\1\u0319\1\uffff\10\65\1\u0324\4\65\1\u0329\1\65\1"+
		"\u032b\1\uffff\1\65\1\u032f\10\65\1\u033a\5\65\1\u0340\1\u0341\1\u0342"+
		"\4\65\1\u0347\1\u0348\2\65\1\uffff\3\65\1\u034f\4\65\1\u0354\1\u0355\1"+
		"\uffff\1\u0356\2\uffff\2\u00b9\1\65\1\uffff\3\65\1\u035c\1\u035d\5\65"+
		"\1\uffff\1\u0363\2\uffff\1\65\1\u0365\2\65\1\uffff\1\u0368\3\65\1\u036c"+
		"\1\u036d\1\65\1\u036f\1\u0370\1\65\1\u0372\2\65\1\u0375\1\uffff\3\65\1"+
		"\u0379\1\uffff\1\u037a\1\65\1\uffff\1\u037c\1\65\1\uffff\2\65\1\u0380"+
		"\1\uffff\1\u0381\1\u0382\1\uffff\1\65\2\uffff\1\u0384\1\u0385\1\65\1\u0387"+
		"\2\uffff\1\65\1\uffff\1\65\1\u038b\3\65\1\uffff\1\u0391\2\65\1\u0394\12"+
		"\65\1\uffff\1\65\1\uffff\13\65\1\uffff\1\65\2\uffff\2\65\1\u03af\1\u03b0"+
		"\1\65\1\uffff\6\65\1\uffff\1\u03b8\1\uffff\1\u03b9\1\uffff\1\65\1\uffff"+
		"\1\u03bb\1\65\1\u03be\1\65\2\uffff\2\65\1\uffff\2\65\1\uffff\6\65\1\u03ca"+
		"\4\65\1\u03d0\1\u03d1\1\65\1\uffff\3\65\1\u03d6\1\uffff\12\65\1\uffff"+
		"\1\u03e2\1\uffff\1\u03e3\10\65\1\u03ec\1\uffff\4\65\1\uffff\1\65\1\uffff"+
		"\2\65\1\u03f4\1\uffff\1\u03f5\1\u03f6\10\65\1\uffff\3\65\1\u0402\1\65"+
		"\3\uffff\1\65\1\u0405\2\65\2\uffff\2\65\1\u040a\1\65\1\u040c\1\65\1\uffff"+
		"\1\u040e\3\65\3\uffff\4\65\1\u0417\2\uffff\5\65\1\uffff\1\65\1\uffff\1"+
		"\u041e\1\65\1\uffff\1\u0421\2\65\2\uffff\1\65\2\uffff\1\65\1\uffff\2\65"+
		"\1\uffff\1\u0428\1\65\1\u042a\2\uffff\1\65\1\uffff\1\65\1\u042e\1\u042f"+
		"\3\uffff\1\65\2\uffff\1\65\1\uffff\1\65\1\u0433\1\65\1\uffff\1\u0435\4"+
		"\65\1\uffff\1\u043a\1\65\1\uffff\1\65\1\u043d\1\u043e\6\65\1\u0445\3\65"+
		"\1\u0449\11\65\1\u0453\2\65\2\uffff\1\65\1\u0457\1\u0458\1\u045a\1\u045b"+
		"\1\65\1\u045d\2\uffff\1\u045e\1\uffff\1\u045f\1\65\1\uffff\1\u0461\1\u0462"+
		"\1\65\1\u0464\1\u0465\1\65\1\u0467\1\u0468\1\65\1\u046a\1\65\1\uffff\1"+
		"\u046d\1\u046e\3\65\2\uffff\1\65\1\u0473\2\65\1\uffff\1\65\1\u0477\1\65"+
		"\1\u0479\7\65\2\uffff\1\65\1\u0482\2\65\1\u0485\1\u0486\1\u0487\1\u0488"+
		"\1\uffff\3\65\1\u048d\1\65\1\u048f\1\65\3\uffff\1\u0492\2\65\1\u0495\6"+
		"\65\1\u049c\1\uffff\1\u049d\1\65\1\uffff\1\u049f\3\65\1\uffff\1\65\1\uffff"+
		"\1\u04a4\1\uffff\1\65\1\u04a6\4\65\1\u04ab\1\65\1\uffff\1\u04ad\5\65\1"+
		"\uffff\2\65\1\uffff\1\u04b5\1\65\1\u04b7\1\u04b8\2\65\1\uffff\1\65\1\uffff"+
		"\3\65\2\uffff\1\u04bf\1\65\1\u04c1\1\uffff\1\u04c2\1\uffff\4\65\1\uffff"+
		"\2\65\2\uffff\1\u04c9\4\65\1\u04ce\1\uffff\1\65\1\u04d0\1\65\1\uffff\2"+
		"\65\1\u04d4\2\65\1\u04d7\3\65\1\uffff\2\65\1\u04dd\2\uffff\1\u04de\2\uffff"+
		"\1\u04df\3\uffff\1\65\2\uffff\1\65\2\uffff\1\65\2\uffff\1\65\1\uffff\1"+
		"\65\1\u04e5\2\uffff\4\65\1\uffff\3\65\1\uffff\1\65\1\uffff\3\65\1\u04f1"+
		"\2\65\1\u04f4\1\u04f5\1\uffff\1\65\1\u04f7\4\uffff\3\65\1\u04fb\1\uffff"+
		"\1\65\1\uffff\1\65\1\u04fe\1\uffff\1\65\1\u0500\1\uffff\1\u0501\1\u0503"+
		"\3\65\1\u0509\2\uffff\1\u050a\1\uffff\1\u050c\1\65\1\u050e\1\65\1\uffff"+
		"\1\u0510\1\uffff\1\65\1\u0512\2\65\1\uffff\1\65\1\uffff\4\65\1\u051b\2"+
		"\65\1\uffff\1\65\2\uffff\6\65\1\uffff\1\u0525\2\uffff\2\65\1\u0528\3\65"+
		"\1\uffff\1\u052c\1\u052d\1\65\1\u052f\1\uffff\1\u0530\1\uffff\2\65\1\u0533"+
		"\1\uffff\1\u0534\1\65\1\uffff\1\65\1\u0539\1\u053a\1\65\1\u053c\3\uffff"+
		"\2\65\1\u053f\2\65\1\uffff\1\u0542\2\65\1\u0545\3\65\1\u0549\3\65\1\uffff"+
		"\2\65\2\uffff\1\65\1\uffff\2\65\1\u0552\1\uffff\1\65\1\u0554\1\uffff\1"+
		"\65\2\uffff\1\65\1\uffff\1\u0557\4\65\2\uffff\1\65\1\uffff\1\u055e\1\uffff"+
		"\1\65\1\uffff\1\u0560\1\uffff\1\u0561\2\65\1\u0564\1\65\1\u0566\1\65\1"+
		"\u0568\1\uffff\1\65\1\u056a\1\u056b\3\65\1\u056f\2\65\1\uffff\2\65\1\uffff"+
		"\1\u0574\1\u0575\1\65\2\uffff\1\u0577\2\uffff\1\u0578\1\65\2\uffff\1\65"+
		"\1\u057b\1\65\1\u057d\2\uffff\1\65\1\uffff\2\65\1\uffff\2\65\1\uffff\1"+
		"\65\1\u0584\1\uffff\1\u0585\1\u0586\1\65\1\uffff\1\u0588\1\u0589\1\65"+
		"\1\u058d\4\65\1\uffff\1\65\1\uffff\2\65\1\uffff\2\65\1\u0597\3\65\1\uffff"+
		"\1\65\2\uffff\2\65\1\uffff\1\u059e\1\uffff\1\65\1\uffff\1\u05a0\2\uffff"+
		"\1\65\1\u05a2\1\u05a3\1\uffff\4\65\2\uffff\1\65\2\uffff\1\u05a9\1\u05aa"+
		"\1\uffff\1\65\1\uffff\4\65\1\u05b0\1\u05b1\3\uffff\1\65\2\uffff\1\u05b3"+
		"\1\u05b4\1\65\1\uffff\4\65\1\u05ba\1\u05bb\2\65\1\u05be\1\uffff\4\65\1"+
		"\u05c4\1\u05c5\1\uffff\1\65\1\uffff\1\65\2\uffff\2\65\1\u05ca\1\u05cb"+
		"\1\65\2\uffff\1\u05cd\3\65\1\u05d1\2\uffff\1\65\2\uffff\1\u05d3\1\u05d4"+
		"\1\u05d5\2\65\2\uffff\1\u05d8\1\u05d9\1\uffff\4\65\1\u05de\2\uffff\2\65"+
		"\1\u05e1\1\u05e2\2\uffff\1\65\1\uffff\1\u05e4\2\65\1\uffff\1\u05e7\3\uffff"+
		"\1\u05e8\1\u05e9\2\uffff\1\65\1\u05eb\1\65\1\u05ed\1\uffff\1\u05ee\1\u05ef"+
		"\2\uffff\1\u05f0\1\uffff\1\65\1\u05f2\3\uffff\1\u05f3\1\uffff\1\65\4\uffff"+
		"\1\65\2\uffff\1\65\1\u05f7\1\65\1\uffff\1\65\1\u05fa\1\uffff";
	static final String DFA25_eofS =
		"\u05fb\uffff";
	static final String DFA25_minS =
		"\1\11\2\101\1\102\1\117\1\106\1\75\1\101\1\104\1\114\1\101\1\122\1\105"+
		"\1\101\1\110\1\103\1\116\6\101\3\105\13\uffff\2\75\2\uffff\1\55\7\uffff"+
		"\2\0\2\56\3\uffff\1\101\1\102\1\60\2\115\1\114\1\105\1\114\1\117\1\114"+
		"\1\105\1\117\1\114\1\124\1\114\1\101\1\60\1\124\1\103\1\104\1\124\1\117"+
		"\1\116\1\114\1\60\1\105\1\124\2\60\1\124\1\116\2\uffff\1\113\1\123\1\106"+
		"\1\101\2\60\1\120\1\60\1\105\1\130\2\103\1\101\1\123\1\103\1\122\1\124"+
		"\1\117\1\125\1\120\1\101\1\60\1\117\1\107\1\103\1\106\1\126\1\125\1\105"+
		"\1\116\1\122\1\111\1\103\1\101\1\122\2\101\1\110\1\114\1\105\2\101\1\105"+
		"\1\103\1\104\1\111\1\105\2\122\1\125\1\122\1\111\1\122\1\107\1\101\1\114"+
		"\1\111\1\116\1\114\1\125\1\105\1\101\1\103\1\102\1\103\1\124\1\103\2\116"+
		"\1\114\1\105\1\131\4\uffff\1\101\1\76\5\uffff\2\0\1\42\2\0\1\42\2\60\1"+
		"\56\3\60\1\53\1\uffff\2\60\1\105\1\116\1\107\1\114\1\103\1\uffff\1\131"+
		"\1\105\1\115\2\120\1\116\1\123\1\115\1\114\1\103\1\123\1\114\1\105\1\101"+
		"\1\60\1\114\1\103\1\60\1\105\1\60\1\114\1\60\1\uffff\1\105\1\101\1\110"+
		"\1\60\1\111\1\110\1\122\1\105\1\60\1\103\1\101\1\105\1\114\1\105\1\uffff"+
		"\1\122\1\60\1\131\1\uffff\1\123\1\uffff\1\111\3\105\1\111\1\124\1\105"+
		"\1\124\1\123\1\105\1\101\1\104\1\111\1\107\1\uffff\2\105\1\101\1\60\1"+
		"\105\1\uffff\1\117\1\114\1\uffff\1\115\1\120\1\123\1\114\1\105\1\110\1"+
		"\101\1\102\1\60\1\105\1\103\1\111\3\105\1\101\1\105\1\60\1\101\1\60\1"+
		"\120\1\102\1\122\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117"+
		"\1\127\1\111\1\122\1\116\1\114\1\110\1\104\1\113\1\124\1\105\1\104\1\60"+
		"\1\111\1\117\1\127\1\122\1\124\1\114\1\105\2\122\1\105\1\60\1\127\1\120"+
		"\1\117\1\105\2\117\1\122\1\117\1\116\2\60\1\101\1\60\2\103\1\115\1\124"+
		"\1\103\1\123\1\107\1\116\1\60\1\110\1\125\2\101\1\125\1\105\1\117\1\104"+
		"\1\117\1\124\1\122\1\117\1\105\1\60\1\105\1\113\1\107\1\114\1\115\1\103"+
		"\1\123\1\101\1\123\1\116\1\103\1\110\1\122\1\105\1\113\1\101\1\60\1\122"+
		"\1\105\1\125\1\105\1\124\1\103\1\111\1\127\1\60\1\122\2\uffff\1\0\1\uffff"+
		"\1\0\1\60\3\uffff\1\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\107"+
		"\1\105\1\110\1\111\1\123\1\111\1\117\1\122\1\60\1\105\2\60\2\124\1\104"+
		"\1\60\1\124\1\101\1\111\1\uffff\1\117\1\110\1\uffff\1\122\1\uffff\1\131"+
		"\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103\1\124\1\60\1\101"+
		"\2\114\1\60\1\122\1\60\1\122\1\125\1\uffff\1\60\1\105\1\117\1\122\1\60"+
		"\1\123\1\124\1\60\1\122\2\60\2\114\2\60\1\103\1\60\1\122\1\130\2\124\1"+
		"\122\1\60\1\uffff\2\122\1\101\1\123\1\122\1\124\1\122\1\101\1\116\1\125"+
		"\1\101\1\120\1\114\1\uffff\2\60\2\115\1\124\1\116\1\122\1\116\1\111\1"+
		"\102\1\103\1\uffff\2\60\1\uffff\1\60\1\114\1\117\1\120\1\124\1\105\1\60"+
		"\1\116\1\122\1\105\1\122\1\105\1\116\1\60\1\105\1\60\1\105\1\60\1\117"+
		"\1\60\1\105\1\103\2\105\1\60\1\uffff\1\60\1\116\1\60\1\105\1\60\1\114"+
		"\1\116\1\103\1\101\1\105\1\111\1\124\1\115\1\uffff\1\105\1\123\1\125\1"+
		"\116\1\124\1\107\1\60\2\103\1\125\1\107\1\60\1\uffff\1\124\1\uffff\1\124"+
		"\1\uffff\1\105\1\124\2\105\1\103\1\101\1\111\1\105\1\60\1\105\1\60\1\uffff"+
		"\1\124\2\111\1\101\1\115\1\103\1\130\1\113\1\60\2\122\1\111\1\101\1\60"+
		"\1\122\1\60\1\uffff\1\102\1\60\2\105\1\115\2\105\1\101\1\111\1\101\1\60"+
		"\3\124\1\123\1\107\3\60\1\101\1\105\1\117\1\105\2\60\1\104\1\117\1\uffff"+
		"\1\117\1\122\1\123\1\60\2\110\1\105\1\104\2\60\1\uffff\1\60\1\uffff\3"+
		"\60\1\104\1\uffff\2\101\1\105\2\60\1\116\1\124\1\116\1\122\1\117\1\uffff"+
		"\1\60\2\uffff\1\111\1\60\1\123\1\117\1\uffff\1\60\1\124\1\107\1\127\2"+
		"\60\1\132\2\60\1\126\1\60\1\122\1\117\1\60\1\uffff\1\116\1\111\1\131\1"+
		"\60\1\uffff\1\60\1\122\1\uffff\1\60\1\124\1\uffff\1\124\1\116\1\60\1\uffff"+
		"\2\60\1\uffff\1\101\2\uffff\2\60\1\111\1\60\2\uffff\1\101\1\uffff\1\124"+
		"\1\60\1\110\1\104\1\123\1\uffff\1\60\2\124\1\60\1\117\1\123\1\124\1\111"+
		"\1\116\1\104\1\123\1\116\2\105\1\uffff\1\111\1\uffff\1\101\1\111\1\105"+
		"\1\104\1\122\1\105\1\116\1\111\1\114\1\124\1\101\1\uffff\1\111\2\uffff"+
		"\1\105\1\120\2\60\1\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\uffff"+
		"\1\60\1\uffff\1\60\1\uffff\1\127\1\uffff\1\60\1\124\1\60\1\122\2\uffff"+
		"\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115\1\104\1\123\1\60"+
		"\1\101\1\104\1\110\1\105\2\60\1\116\1\uffff\1\113\1\110\1\116\1\60\1\uffff"+
		"\1\115\1\105\1\122\1\131\2\104\1\111\1\122\1\101\1\116\1\uffff\1\60\1"+
		"\uffff\1\60\1\114\1\122\2\103\2\105\1\120\1\105\1\60\1\uffff\1\104\1\111"+
		"\1\124\1\104\1\uffff\1\105\1\uffff\1\120\1\101\1\60\1\uffff\2\60\1\116"+
		"\1\103\1\116\2\124\1\103\1\116\1\124\1\uffff\1\122\2\105\1\60\1\105\3"+
		"\uffff\1\104\1\60\1\122\1\116\2\uffff\1\101\1\111\1\60\1\111\1\60\1\105"+
		"\1\uffff\1\60\1\101\1\123\1\101\3\uffff\1\124\1\117\1\103\1\122\1\60\2"+
		"\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\1\uffff\1\60"+
		"\1\116\1\111\2\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1"+
		"\60\1\104\1\60\2\uffff\1\111\1\uffff\1\104\2\60\3\uffff\1\114\2\uffff"+
		"\1\117\1\uffff\1\114\1\60\1\123\1\uffff\1\60\1\117\1\122\1\101\1\105\1"+
		"\uffff\1\60\1\111\1\uffff\1\120\2\60\1\116\1\101\1\105\1\111\1\107\1\104"+
		"\1\60\1\102\1\114\1\124\1\60\2\105\1\104\1\103\1\102\1\105\1\117\1\123"+
		"\1\115\1\60\1\105\1\116\2\uffff\1\116\4\60\1\116\1\60\2\uffff\1\60\1\uffff"+
		"\1\60\1\122\1\uffff\2\60\1\101\2\60\1\116\2\60\1\124\1\60\1\124\1\uffff"+
		"\2\60\1\117\1\112\1\131\2\uffff\1\105\1\60\1\111\1\104\1\uffff\1\105\1"+
		"\60\1\126\1\60\1\111\1\125\1\120\1\131\1\111\1\114\1\124\2\uffff\1\104"+
		"\1\60\1\101\1\105\4\60\1\uffff\1\122\1\103\1\105\1\60\1\116\1\60\1\103"+
		"\3\uffff\1\60\2\124\1\60\1\105\1\124\1\125\1\105\1\101\1\122\1\60\1\uffff"+
		"\1\60\1\105\1\uffff\1\60\2\124\1\116\1\uffff\1\101\1\uffff\1\60\1\uffff"+
		"\1\122\1\60\1\124\1\105\1\122\1\124\1\60\1\115\1\uffff\1\60\1\115\1\124"+
		"\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\60\1\116\2\60\1\132\1"+
		"\115\1\uffff\1\101\1\uffff\1\124\1\117\1\122\2\uffff\1\60\1\116\1\60\1"+
		"\uffff\1\60\1\uffff\1\122\1\111\1\114\1\103\1\uffff\1\117\1\105\2\uffff"+
		"\1\60\1\114\1\104\1\126\1\105\1\60\1\uffff\1\105\1\60\1\105\1\uffff\1"+
		"\116\1\104\1\60\1\124\1\125\1\60\1\122\2\105\1\uffff\1\122\1\107\1\60"+
		"\2\uffff\1\60\2\uffff\1\60\3\uffff\1\117\2\uffff\1\124\2\uffff\1\124\2"+
		"\uffff\1\101\1\uffff\1\111\1\60\2\uffff\1\124\1\117\1\120\1\104\1\uffff"+
		"\1\126\1\105\1\123\1\uffff\1\105\1\uffff\1\116\1\122\1\101\1\60\1\117"+
		"\1\123\2\60\1\uffff\1\124\1\60\4\uffff\1\105\1\122\1\124\1\60\1\uffff"+
		"\1\103\1\uffff\1\113\1\60\1\uffff\1\111\1\60\1\uffff\2\60\1\105\1\116"+
		"\1\111\1\60\2\uffff\1\60\1\uffff\1\60\1\101\1\60\1\114\1\uffff\1\60\1"+
		"\uffff\1\105\1\60\1\115\1\111\1\uffff\1\120\1\uffff\1\120\1\105\1\131"+
		"\1\122\1\60\1\101\1\104\1\uffff\1\107\2\uffff\1\101\1\111\1\124\1\105"+
		"\1\122\1\111\1\uffff\1\60\2\uffff\1\115\1\126\1\60\1\124\1\116\1\122\1"+
		"\uffff\2\60\1\105\1\60\1\uffff\1\60\1\uffff\1\104\1\103\1\60\1\uffff\1"+
		"\60\1\124\1\uffff\1\111\2\60\1\124\1\60\3\uffff\1\120\1\101\1\60\1\102"+
		"\1\103\1\uffff\1\60\1\111\1\105\1\60\1\105\1\104\1\124\1\60\1\107\1\105"+
		"\1\114\1\uffff\1\116\1\103\2\uffff\1\111\1\uffff\1\101\1\111\1\60\1\uffff"+
		"\1\105\1\60\1\uffff\1\117\2\uffff\1\117\1\uffff\1\60\1\101\1\116\1\104"+
		"\1\124\2\uffff\1\104\1\uffff\1\60\1\uffff\1\111\1\uffff\1\60\1\uffff\1"+
		"\60\1\117\1\114\1\60\1\104\1\60\1\124\1\60\1\uffff\1\124\2\60\2\124\1"+
		"\105\1\60\1\115\1\126\1\uffff\1\101\1\105\1\uffff\2\60\1\124\2\uffff\1"+
		"\60\2\uffff\1\60\1\131\2\uffff\1\105\1\60\1\105\1\60\2\uffff\1\111\1\uffff"+
		"\1\105\1\102\1\uffff\1\114\1\123\1\uffff\1\116\1\60\1\uffff\2\60\1\101"+
		"\1\uffff\2\60\1\123\1\60\1\101\1\117\1\104\1\124\1\uffff\1\123\1\uffff"+
		"\2\116\1\uffff\2\124\1\60\2\101\1\111\1\uffff\1\132\2\uffff\1\116\1\105"+
		"\1\uffff\1\60\1\uffff\1\111\1\uffff\1\60\2\uffff\1\111\2\60\1\uffff\1"+
		"\101\1\105\1\124\1\122\2\uffff\1\111\2\uffff\2\60\1\uffff\1\123\1\uffff"+
		"\1\105\1\122\1\101\1\105\2\60\3\uffff\1\115\2\uffff\2\60\1\104\1\uffff"+
		"\2\116\2\105\2\60\1\123\1\105\1\60\1\uffff\2\124\1\115\1\105\2\60\1\uffff"+
		"\1\105\1\uffff\1\117\2\uffff\1\124\1\122\2\60\1\105\2\uffff\1\60\1\123"+
		"\1\124\1\123\1\60\2\uffff\1\120\2\uffff\3\60\2\122\2\uffff\2\60\1\uffff"+
		"\1\125\2\105\1\104\1\60\2\uffff\1\123\1\116\2\60\2\uffff\1\123\1\uffff"+
		"\1\60\1\111\1\105\1\uffff\1\60\3\uffff\2\60\2\uffff\1\123\1\60\1\123\1"+
		"\60\1\uffff\2\60\2\uffff\1\60\1\uffff\1\105\1\60\3\uffff\1\60\1\uffff"+
		"\1\124\4\uffff\1\123\2\uffff\1\101\1\60\1\115\1\uffff\1\120\1\60\1\uffff";
	static final String DFA25_maxS =
		"\1\176\1\122\3\125\1\127\1\75\1\117\1\124\1\130\2\122\1\131\1\117\1\122"+
		"\2\124\1\125\2\117\1\125\1\123\1\111\1\105\1\126\1\105\13\uffff\1\76\1"+
		"\75\2\uffff\1\55\7\uffff\2\uffff\2\172\3\uffff\1\125\1\102\1\172\1\116"+
		"\1\122\1\114\1\105\1\114\1\117\1\116\1\122\1\117\1\122\2\124\1\104\1\172"+
		"\1\124\1\122\1\115\1\124\1\117\1\126\1\114\1\172\1\105\1\124\2\172\1\124"+
		"\1\116\2\uffff\1\116\1\124\1\126\1\116\2\172\1\120\1\172\1\105\1\130\1"+
		"\124\1\103\1\104\2\123\1\126\1\131\1\117\1\125\1\120\1\117\1\172\1\124"+
		"\1\116\1\103\1\124\1\126\1\125\1\111\1\124\1\122\1\111\1\124\1\117\1\122"+
		"\1\101\1\122\1\110\1\114\1\105\1\101\1\123\1\111\1\103\1\104\1\111\1\117"+
		"\2\122\1\125\1\122\1\111\1\122\1\107\2\127\1\111\2\116\1\125\1\117\1\101"+
		"\1\123\1\122\1\103\2\124\1\116\2\122\1\105\1\131\4\uffff\1\101\1\76\5"+
		"\uffff\2\uffff\1\47\2\uffff\1\47\1\146\4\172\1\145\1\71\1\uffff\2\172"+
		"\2\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1"+
		"\115\1\114\1\103\1\123\1\114\1\105\1\101\1\172\1\114\1\103\1\172\1\105"+
		"\1\172\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\111\1\117\1\122\1"+
		"\105\1\172\1\103\1\101\1\105\1\114\1\105\1\uffff\1\122\1\172\1\131\1\uffff"+
		"\1\123\1\uffff\1\111\3\105\1\111\1\124\1\105\1\124\1\123\1\105\1\113\1"+
		"\104\1\111\1\107\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\114\1"+
		"\uffff\1\115\1\120\1\123\1\117\1\105\1\114\1\101\1\102\1\172\1\105\1\103"+
		"\2\111\1\105\1\111\1\124\1\105\1\172\1\105\1\172\1\120\1\102\1\122\1\125"+
		"\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111\2\122\1"+
		"\114\1\110\1\104\1\113\1\124\1\105\1\126\1\172\1\111\1\117\1\127\1\122"+
		"\1\124\1\114\1\125\1\122\1\124\1\105\1\172\1\127\1\120\1\121\1\111\2\117"+
		"\1\122\1\117\1\116\2\172\1\101\1\172\1\124\1\103\1\116\1\124\1\103\1\123"+
		"\1\107\1\116\1\172\1\110\1\125\1\114\1\101\1\125\1\105\1\117\1\104\1\117"+
		"\1\124\1\122\1\131\1\105\1\172\1\114\1\113\1\107\1\125\1\120\1\124\1\123"+
		"\1\101\1\123\1\122\1\124\1\110\1\123\1\105\1\113\1\101\1\172\1\122\1\105"+
		"\1\125\1\105\1\124\1\103\1\125\1\127\1\172\1\122\2\uffff\1\uffff\1\uffff"+
		"\1\uffff\1\172\3\uffff\1\145\1\71\1\uffff\1\71\2\172\1\uffff\1\172\1\103"+
		"\1\123\1\107\1\105\1\110\1\111\1\123\1\111\1\117\1\122\1\172\1\105\2\172"+
		"\2\124\1\104\1\172\1\124\1\101\1\111\1\uffff\1\117\1\110\1\uffff\1\122"+
		"\1\uffff\1\131\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103\1\124"+
		"\1\172\1\101\2\114\1\172\1\122\1\172\1\122\1\125\1\uffff\1\172\1\105\1"+
		"\117\1\122\1\172\1\123\1\124\1\172\1\122\2\172\1\114\1\124\2\172\1\103"+
		"\1\172\1\122\1\130\2\124\1\122\1\172\1\uffff\2\122\1\101\1\123\1\122\1"+
		"\124\1\122\1\101\1\122\1\125\1\101\1\120\1\114\1\uffff\2\172\2\115\1\124"+
		"\1\116\1\122\1\116\1\122\1\102\1\103\1\uffff\2\172\1\uffff\1\172\1\114"+
		"\1\117\1\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122\1\105\1\116\1\172"+
		"\1\105\1\172\1\105\1\172\1\117\1\172\1\105\1\103\2\105\1\172\1\uffff\1"+
		"\172\1\116\1\172\1\105\1\172\1\114\1\116\1\103\1\101\1\105\1\111\1\124"+
		"\1\115\1\uffff\1\105\1\123\1\125\1\116\1\124\1\107\1\172\2\103\1\125\1"+
		"\107\1\172\1\uffff\1\124\1\uffff\1\124\1\uffff\1\105\1\124\2\105\1\103"+
		"\1\101\1\111\1\105\1\172\1\105\1\172\1\uffff\1\124\3\111\1\115\1\103\1"+
		"\130\1\113\1\172\2\122\1\111\1\101\1\172\1\122\1\172\1\uffff\1\125\1\172"+
		"\2\105\1\115\1\105\1\111\1\125\1\111\1\101\1\172\3\124\1\123\1\107\3\172"+
		"\1\101\1\105\1\117\1\105\2\172\1\104\1\117\1\uffff\1\117\1\122\1\124\1"+
		"\172\2\110\1\105\1\104\2\172\1\uffff\1\172\1\uffff\1\71\2\102\1\104\1"+
		"\uffff\1\101\1\106\1\105\2\172\1\116\1\124\1\116\1\122\1\117\1\uffff\1"+
		"\172\2\uffff\1\111\1\172\1\123\1\117\1\uffff\1\172\1\124\1\107\1\127\2"+
		"\172\1\132\2\172\1\126\1\172\1\122\1\117\1\172\1\uffff\1\116\1\111\1\131"+
		"\1\172\1\uffff\1\172\1\122\1\uffff\1\172\1\124\1\uffff\1\124\1\116\1\172"+
		"\1\uffff\2\172\1\uffff\1\101\2\uffff\2\172\1\111\1\172\2\uffff\1\101\1"+
		"\uffff\1\124\1\172\1\110\1\106\1\126\1\uffff\1\172\2\124\1\172\1\117\1"+
		"\123\1\124\1\111\1\116\1\104\1\123\1\116\2\105\1\uffff\1\111\1\uffff\1"+
		"\101\1\111\1\105\1\104\1\122\1\105\1\116\1\111\1\114\1\124\1\101\1\uffff"+
		"\1\111\2\uffff\1\105\1\120\2\172\1\101\1\uffff\1\124\1\131\1\124\2\105"+
		"\1\107\1\uffff\1\172\1\uffff\1\172\1\uffff\1\127\1\uffff\1\172\1\124\1"+
		"\172\1\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115"+
		"\1\104\1\123\1\172\1\101\1\104\1\110\1\105\2\172\1\116\1\uffff\1\113\1"+
		"\110\1\116\1\172\1\uffff\1\115\1\105\1\122\1\131\2\104\1\111\1\122\1\124"+
		"\1\116\1\uffff\1\172\1\uffff\1\172\1\114\1\122\2\103\2\105\1\120\1\105"+
		"\1\172\1\uffff\1\104\1\111\1\124\1\104\1\uffff\1\105\1\uffff\1\120\1\101"+
		"\1\172\1\uffff\2\172\1\116\1\103\1\116\2\124\1\103\1\116\1\124\1\uffff"+
		"\1\122\2\105\1\172\1\105\3\uffff\1\104\1\172\1\122\1\116\2\uffff\1\101"+
		"\1\111\1\172\1\111\1\172\1\105\1\uffff\1\172\1\101\1\123\1\101\3\uffff"+
		"\1\124\1\117\1\103\1\122\1\172\2\uffff\1\124\3\101\1\120\1\uffff\1\117"+
		"\1\uffff\1\172\1\122\1\uffff\1\172\1\116\1\111\2\uffff\1\105\2\uffff\1"+
		"\105\1\uffff\1\111\1\115\1\uffff\1\172\1\104\1\172\2\uffff\1\111\1\uffff"+
		"\1\106\2\172\3\uffff\1\114\2\uffff\1\117\1\uffff\1\114\1\172\1\123\1\uffff"+
		"\1\172\1\117\1\122\1\101\1\105\1\uffff\1\172\1\111\1\uffff\1\120\2\172"+
		"\1\116\1\101\1\105\1\111\1\107\1\104\1\172\1\102\1\114\1\124\1\172\2\105"+
		"\1\104\1\103\1\102\1\105\1\117\1\123\1\115\1\172\1\105\1\116\2\uffff\1"+
		"\116\4\172\1\116\1\172\2\uffff\1\172\1\uffff\1\172\1\122\1\uffff\2\172"+
		"\1\101\2\172\1\116\2\172\1\124\1\172\1\124\1\uffff\2\172\1\117\1\112\1"+
		"\131\2\uffff\1\105\1\172\1\111\1\104\1\uffff\1\105\1\172\1\126\1\172\1"+
		"\111\1\125\1\120\1\131\1\111\1\114\1\124\2\uffff\1\104\1\172\1\101\1\105"+
		"\4\172\1\uffff\1\127\1\103\1\105\1\172\1\116\1\172\1\103\3\uffff\1\172"+
		"\2\124\1\172\1\105\1\124\1\125\1\105\1\101\1\122\1\172\1\uffff\1\172\1"+
		"\105\1\uffff\1\172\2\124\1\116\1\uffff\1\101\1\uffff\1\172\1\uffff\1\122"+
		"\1\172\1\124\1\105\1\122\1\124\1\172\1\115\1\uffff\1\172\1\115\1\124\1"+
		"\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\172\1\116\2\172\1\132\1"+
		"\115\1\uffff\1\101\1\uffff\1\124\1\117\1\122\2\uffff\1\172\1\116\1\172"+
		"\1\uffff\1\172\1\uffff\1\122\1\111\1\114\1\103\1\uffff\1\117\1\105\2\uffff"+
		"\1\172\1\114\1\104\1\126\1\105\1\172\1\uffff\1\105\1\172\1\105\1\uffff"+
		"\1\116\1\104\1\172\1\124\1\125\1\172\1\122\2\105\1\uffff\1\122\1\107\1"+
		"\172\2\uffff\1\172\2\uffff\1\172\3\uffff\1\117\2\uffff\1\124\2\uffff\1"+
		"\124\2\uffff\1\101\1\uffff\1\111\1\172\2\uffff\1\124\1\117\1\120\1\104"+
		"\1\uffff\1\126\1\105\1\123\1\uffff\1\105\1\uffff\1\116\1\122\1\101\1\172"+
		"\1\117\1\123\2\172\1\uffff\1\124\1\172\4\uffff\1\105\1\122\1\124\1\172"+
		"\1\uffff\1\103\1\uffff\1\113\1\172\1\uffff\1\111\1\172\1\uffff\2\172\1"+
		"\105\1\116\1\111\1\172\2\uffff\1\172\1\uffff\1\172\1\101\1\172\1\114\1"+
		"\uffff\1\172\1\uffff\1\105\1\172\1\115\1\111\1\uffff\1\120\1\uffff\1\120"+
		"\1\105\1\131\1\122\1\172\1\101\1\104\1\uffff\1\107\2\uffff\1\101\1\111"+
		"\1\124\1\105\1\122\1\111\1\uffff\1\172\2\uffff\1\115\1\126\1\172\1\124"+
		"\1\116\1\122\1\uffff\2\172\1\105\1\172\1\uffff\1\172\1\uffff\1\104\1\103"+
		"\1\172\1\uffff\1\172\1\124\1\uffff\1\131\2\172\1\124\1\172\3\uffff\1\120"+
		"\1\101\1\172\1\102\1\103\1\uffff\1\172\1\111\1\105\1\172\1\105\1\104\1"+
		"\124\1\172\1\107\1\105\1\114\1\uffff\1\116\1\103\2\uffff\1\111\1\uffff"+
		"\1\101\1\111\1\172\1\uffff\1\105\1\172\1\uffff\1\117\2\uffff\1\117\1\uffff"+
		"\1\172\1\101\1\116\1\104\1\124\2\uffff\1\124\1\uffff\1\172\1\uffff\1\111"+
		"\1\uffff\1\172\1\uffff\1\172\1\117\1\114\1\172\1\104\1\172\1\124\1\172"+
		"\1\uffff\1\124\2\172\2\124\1\105\1\172\1\115\1\126\1\uffff\1\101\1\105"+
		"\1\uffff\2\172\1\124\2\uffff\1\172\2\uffff\1\172\1\131\2\uffff\1\105\1"+
		"\172\1\105\1\172\2\uffff\1\111\1\uffff\1\105\1\102\1\uffff\1\114\1\123"+
		"\1\uffff\1\116\1\172\1\uffff\2\172\1\101\1\uffff\2\172\1\123\1\172\1\101"+
		"\1\117\1\104\1\124\1\uffff\1\123\1\uffff\2\116\1\uffff\2\124\1\172\2\101"+
		"\1\111\1\uffff\1\132\2\uffff\1\116\1\105\1\uffff\1\172\1\uffff\1\111\1"+
		"\uffff\1\172\2\uffff\1\111\2\172\1\uffff\1\101\1\105\1\124\1\122\2\uffff"+
		"\1\111\2\uffff\2\172\1\uffff\1\123\1\uffff\1\105\1\122\1\101\1\105\2\172"+
		"\3\uffff\1\115\2\uffff\2\172\1\104\1\uffff\2\116\2\105\2\172\1\123\1\105"+
		"\1\172\1\uffff\2\124\1\115\1\105\2\172\1\uffff\1\105\1\uffff\1\117\2\uffff"+
		"\1\124\1\122\2\172\1\105\2\uffff\1\172\1\123\1\124\1\123\1\172\2\uffff"+
		"\1\120\2\uffff\3\172\2\122\2\uffff\2\172\1\uffff\1\125\2\105\1\104\1\172"+
		"\2\uffff\1\123\1\116\2\172\2\uffff\1\123\1\uffff\1\172\1\111\1\105\1\uffff"+
		"\1\172\3\uffff\2\172\2\uffff\1\123\1\172\1\123\1\172\1\uffff\2\172\2\uffff"+
		"\1\172\1\uffff\1\105\1\172\3\uffff\1\172\1\uffff\1\124\4\uffff\1\123\2"+
		"\uffff\1\101\1\172\1\115\1\uffff\1\120\1\172\1\uffff";
	static final String DFA25_acceptS =
		"\32\uffff\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125"+
		"\1\u0126\1\u0127\1\u0128\2\uffff\1\u012f\1\u0130\1\uffff\1\u0132\1\u0133"+
		"\1\u0135\1\u0136\1\u0137\1\u0138\1\u0139\4\uffff\1\u0143\1\u0144\1\u0145"+
		"\37\uffff\1\u012a\1\7\110\uffff\1\156\1\u0099\1\u009a\1\u013a\2\uffff"+
		"\1\u012c\1\u012d\1\u012e\1\u0146\1\u0131\15\uffff\1\u0142\7\uffff\1\111"+
		"\26\uffff\1\25\16\uffff\1\6\3\uffff\1\41\1\uffff\1\174\16\uffff\1\11\5"+
		"\uffff\1\u00ad\2\uffff\1\75\31\uffff\1\21\134\uffff\1\u0129\1\u012b\1"+
		"\uffff\1\u013b\2\uffff\1\u013d\1\u013e\1\u013f\2\uffff\1\u0140\3\uffff"+
		"\1\u0141\26\uffff\1\u00e0\2\uffff\1\3\1\uffff\1\5\1\uffff\1\13\3\uffff"+
		"\1\177\15\uffff\1\173\27\uffff\1\116\15\uffff\1\u00a0\13\uffff\1\u0134"+
		"\2\uffff\1\u0104\31\uffff\1\u0095\15\uffff\1\u00b5\14\uffff\1\u00d5\1"+
		"\uffff\1\u00a4\1\uffff\1\u00f5\13\uffff\1\u0087\20\uffff\1\144\33\uffff"+
		"\1\134\12\uffff\1\u011c\1\uffff\1\u013c\4\uffff\1\1\12\uffff\1\u009e\1"+
		"\uffff\1\24\1\40\4\uffff\1\u0086\16\uffff\1\4\4\uffff\1\76\2\uffff\1\u00ea"+
		"\2\uffff\1\u010d\3\uffff\1\10\2\uffff\1\16\1\uffff\1\36\1\u00e8\4\uffff"+
		"\1\u00b7\1\66\1\uffff\1\u00a6\5\uffff\1\142\16\uffff\1\u009f\1\uffff\1"+
		"\14\13\uffff\1\73\1\uffff\1\122\1\107\5\uffff\1\u00c6\6\uffff\1\u0105"+
		"\1\uffff\1\u009d\1\uffff\1\u008f\1\uffff\1\u010c\4\uffff\1\u00ec\1\u00ce"+
		"\2\uffff\1\53\2\uffff\1\64\16\uffff\1\u00b6\4\uffff\1\u00f0\12\uffff\1"+
		"\u00a8\1\uffff\1\35\12\uffff\1\u00bf\4\uffff\1\u011a\1\uffff\1\145\3\uffff"+
		"\1\u00f1\12\uffff\1\u00ff\5\uffff\1\130\1\176\1\u009c\4\uffff\1\u00de"+
		"\1\54\6\uffff\1\u00e9\4\uffff\1\u00ac\1\155\1\u0102\5\uffff\1\44\1\u00d0"+
		"\5\uffff\1\2\1\uffff\1\104\2\uffff\1\120\3\uffff\1\u00aa\1\101\1\uffff"+
		"\1\105\1\132\1\uffff\1\u00f7\2\uffff\1\u011d\3\uffff\1\15\1\17\1\uffff"+
		"\1\32\3\uffff\1\u00f8\1\157\1\u0093\1\uffff\1\u0110\1\57\1\uffff\1\u00b8"+
		"\3\uffff\1\47\5\uffff\1\u00f3\2\uffff\1\154\32\uffff\1\20\1\u00b3\7\uffff"+
		"\1\23\1\u00be\1\uffff\1\u010e\2\uffff\1\u008e\13\uffff\1\u0108\5\uffff"+
		"\1\65\1\u0096\4\uffff\1\61\13\uffff\1\u00c1\1\37\10\uffff\1\u00c0\7\uffff"+
		"\1\u00f2\1\u0081\1\u00c2\13\uffff\1\u00c8\2\uffff\1\u0113\4\uffff\1\u0085"+
		"\1\uffff\1\u00a9\1\uffff\1\u0103\10\uffff\1\45\6\uffff\1\150\2\uffff\1"+
		"\146\6\uffff\1\u00ee\1\uffff\1\u011b\3\uffff\1\u0094\1\u00d6\3\uffff\1"+
		"\30\1\uffff\1\74\4\uffff\1\70\2\uffff\1\12\1\67\6\uffff\1\166\3\uffff"+
		"\1\u00a7\11\uffff\1\121\3\uffff\1\117\1\u00c7\1\uffff\1\172\1\u00c4\1"+
		"\uffff\1\22\1\u00e1\1\26\1\uffff\1\u00f6\1\u0107\1\uffff\1\u00ba\1\141"+
		"\1\uffff\1\127\1\133\1\uffff\1\160\2\uffff\1\u00b1\1\u00dc\4\uffff\1\u00b9"+
		"\3\uffff\1\u00d9\1\uffff\1\u008b\10\uffff\1\55\2\uffff\1\110\1\136\1\u0082"+
		"\1\u00b4\4\uffff\1\u0101\1\uffff\1\u00dd\2\uffff\1\103\2\uffff\1\u010a"+
		"\6\uffff\1\77\1\102\1\uffff\1\u00ca\4\uffff\1\u0106\1\uffff\1\u0100\4"+
		"\uffff\1\u00cb\1\uffff\1\114\7\uffff\1\u0115\1\uffff\1\u00c3\1\u00d1\6"+
		"\uffff\1\u00cf\1\uffff\1\u008d\1\50\6\uffff\1\u0088\4\uffff\1\152\1\uffff"+
		"\1\126\3\uffff\1\u009b\2\uffff\1\167\5\uffff\1\113\1\143\1\u00c5\5\uffff"+
		"\1\u00b2\13\uffff\1\u0114\2\uffff\1\175\1\51\1\uffff\1\u0080\3\uffff\1"+
		"\u00fd\2\uffff\1\46\1\uffff\1\112\1\u00d3\1\uffff\1\u00fa\5\uffff\1\62"+
		"\1\u00db\1\uffff\1\u00e5\1\uffff\1\u00a1\1\uffff\1\131\1\uffff\1\u00ed"+
		"\10\uffff\1\u0084\11\uffff\1\170\2\uffff\1\125\3\uffff\1\100\1\u0089\1"+
		"\uffff\1\u00f4\1\106\2\uffff\1\u0090\1\27\4\uffff\1\u00ae\1\123\1\uffff"+
		"\1\u00eb\2\uffff\1\115\2\uffff\1\u0111\2\uffff\1\u00bd\3\uffff\1\34\10"+
		"\uffff\1\u00da\1\uffff\1\u010b\2\uffff\1\u00c9\6\uffff\1\72\1\uffff\1"+
		"\u0118\1\60\2\uffff\1\124\1\uffff\1\u0083\1\uffff\1\52\1\uffff\1\u008a"+
		"\1\u00e4\3\uffff\1\31\4\uffff\1\u00ab\1\u010f\1\uffff\1\u00bb\1\147\2"+
		"\uffff\1\56\1\uffff\1\u00af\6\uffff\1\135\1\u00d2\1\u00e2\1\uffff\1\u00e3"+
		"\1\u00bc\3\uffff\1\42\11\uffff\1\140\6\uffff\1\151\1\uffff\1\161\1\uffff"+
		"\1\u0112\1\u0119\5\uffff\1\u008c\1\63\5\uffff\1\u00d4\1\33\1\uffff\1\u00f9"+
		"\1\43\5\uffff\1\u0116\1\153\2\uffff\1\u0117\5\uffff\1\u0109\1\171\4\uffff"+
		"\1\162\1\164\1\uffff\1\u00df\3\uffff\1\u00a2\1\uffff\1\137\1\u00ef\1\71"+
		"\2\uffff\1\u00fb\1\u00d7\4\uffff\1\u00fc\2\uffff\1\163\1\165\1\uffff\1"+
		"\u0092\2\uffff\1\u00a5\1\u00cc\1\u00cd\1\uffff\1\u00e6\1\uffff\1\u00b0"+
		"\1\u0097\1\u00fe\1\u0098\1\uffff\1\u00d8\1\u00a3\3\uffff\1\u0091\2\uffff"+
		"\1\u00e7";
	static final String DFA25_specialS =
		"\61\uffff\1\6\1\7\171\uffff\1\0\1\4\1\uffff\1\2\1\5\u00cd\uffff\1\1\1"+
		"\uffff\1\3\u047a\uffff}>";
	static final String[] DFA25_transitionS = {
			"\2\67\2\uffff\1\67\22\uffff\1\67\1\6\1\62\1\uffff\1\30\1\53\1\54\1\61"+
			"\1\36\1\37\1\52\1\50\1\34\1\51\1\32\1\47\1\63\11\64\1\33\1\35\1\45\1"+
			"\44\1\46\1\60\1\uffff\1\3\1\14\1\24\1\12\1\11\1\2\1\13\1\15\1\10\1\22"+
			"\1\27\1\7\1\25\1\4\1\5\1\21\1\65\1\23\1\17\1\1\1\20\1\26\1\16\1\65\1"+
			"\31\1\65\1\40\1\uffff\1\41\1\57\1\66\33\65\1\42\1\56\1\43\1\55",
			"\1\71\1\75\2\uffff\1\74\2\uffff\1\76\1\73\5\uffff\1\72\2\uffff\1\70",
			"\1\77\3\uffff\1\105\3\uffff\1\102\2\uffff\1\103\2\uffff\1\104\2\uffff"+
			"\1\100\2\uffff\1\101",
			"\1\115\1\uffff\1\113\1\uffff\1\111\5\uffff\1\106\1\uffff\1\107\3\uffff"+
			"\1\112\1\110\1\uffff\1\114",
			"\1\116\5\uffff\1\117",
			"\1\124\7\uffff\1\123\1\uffff\1\125\1\uffff\1\120\2\uffff\1\122\1\121"+
			"\1\126",
			"\1\127",
			"\1\132\3\uffff\1\133\3\uffff\1\131\5\uffff\1\134",
			"\1\142\1\uffff\1\135\6\uffff\1\137\1\136\4\uffff\1\140\1\141",
			"\1\146\1\uffff\1\145\4\uffff\1\144\4\uffff\1\143",
			"\1\151\1\154\2\uffff\1\147\3\uffff\1\150\5\uffff\1\153\2\uffff\1\152",
			"\1\155",
			"\1\162\3\uffff\1\160\5\uffff\1\157\5\uffff\1\161\3\uffff\1\156",
			"\1\163\15\uffff\1\164",
			"\1\165\1\166\5\uffff\1\167\2\uffff\1\170",
			"\1\176\1\uffff\1\171\2\uffff\1\172\2\uffff\1\u0080\1\uffff\1\174\1\u0081"+
			"\1\173\3\uffff\1\177\1\175",
			"\1\u0082\1\uffff\1\u0085\1\uffff\1\u0086\1\u0083\1\u0084",
			"\1\u0088\3\uffff\1\u0089\6\uffff\1\u008a\5\uffff\1\u0087\2\uffff\1\u008b",
			"\1\u008d\15\uffff\1\u008c",
			"\1\u0092\3\uffff\1\u008f\3\uffff\1\u008e\2\uffff\1\u0091\2\uffff\1\u0090",
			"\1\u0097\6\uffff\1\u0096\3\uffff\1\u0094\2\uffff\1\u0093\2\uffff\1\u0095"+
			"\2\uffff\1\u0098",
			"\1\u009b\3\uffff\1\u009a\3\uffff\1\u009c\5\uffff\1\u009d\3\uffff\1\u0099",
			"\1\u009e\7\uffff\1\u009f",
			"\1\u00a0",
			"\1\u00a3\5\uffff\1\u00a1\12\uffff\1\u00a2",
			"\1\u00a5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a6\1\127",
			"\1\u00a8",
			"",
			"",
			"\1\u00aa",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u00ac\1\u00ae\64\u00ac\1\u00ad\uffa3\u00ac",
			"\42\u00af\1\u00b1\71\u00af\1\u00b0\uffa3\u00af",
			"\1\u00b7\1\uffff\12\u00b4\7\uffff\1\65\1\u00ba\2\65\1\u00b8\1\65\1\u00bb"+
			"\3\65\1\u00bb\1\u00b3\1\u00bb\5\65\1\u00b5\4\65\1\u00b2\1\u00b6\1\65"+
			"\4\uffff\1\65\1\uffff\1\65\1\u00bb\2\65\1\u00b8\1\65\1\u00bb\3\65\1\u00bb"+
			"\1\65\1\u00bb\15\65",
			"\1\u00b7\1\uffff\12\u00b4\7\uffff\1\65\1\u00ba\2\65\1\u00b8\1\65\1\u00bb"+
			"\3\65\1\u00bb\1\u00b3\1\u00bb\5\65\1\u00b5\5\65\1\u00b6\1\65\4\uffff"+
			"\1\65\1\uffff\1\65\1\u00bb\2\65\1\u00b8\1\65\1\u00bb\3\65\1\u00bb\1\65"+
			"\1\u00bb\15\65",
			"",
			"",
			"",
			"\1\u00bd\7\uffff\1\u00be\13\uffff\1\u00bc",
			"\1\u00bf",
			"\12\65\7\uffff\24\65\1\u00c0\5\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00c3\1\u00c2",
			"\1\u00c5\4\uffff\1\u00c4",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca\1\uffff\1\u00cb",
			"\1\u00cd\6\uffff\1\u00ce\5\uffff\1\u00cc",
			"\1\u00cf",
			"\1\u00d1\5\uffff\1\u00d0",
			"\1\u00d2",
			"\1\u00d3\7\uffff\1\u00d4",
			"\1\u00d6\2\uffff\1\u00d5",
			"\12\65\7\uffff\2\65\1\u00d7\27\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00d9",
			"\1\u00db\16\uffff\1\u00da",
			"\1\u00dc\10\uffff\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0\3\uffff\1\u00e4\1\u00e2\1\u00e1\1\uffff\1\u00e3",
			"\1\u00e5",
			"\12\65\7\uffff\3\65\1\u00e6\26\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00e8",
			"\1\u00e9",
			"\12\65\7\uffff\13\65\1\u00ea\16\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\5\65\1\u00ec\24\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ee",
			"\1\u00ef",
			"",
			"",
			"\1\u00f0\1\uffff\1\u00f2\1\u00f1",
			"\1\u00f3\1\u00f4",
			"\1\u00f5\14\uffff\1\u00f6\2\uffff\1\u00f7",
			"\1\u00f9\1\uffff\1\u00f8\3\uffff\1\u00fa\6\uffff\1\u00fb",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\3\65\1\u00fe\11\65\1\u0101\1\65\1\u00ff\2\65\1\u00fd"+
			"\1\u0100\6\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0103",
			"\12\65\7\uffff\16\65\1\u0104\13\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0106",
			"\1\u0107",
			"\1\u010b\5\uffff\1\u0108\6\uffff\1\u0109\3\uffff\1\u010a",
			"\1\u010c",
			"\1\u010d\2\uffff\1\u010e",
			"\1\u010f",
			"\1\u0111\2\uffff\1\u0114\5\uffff\1\u0112\3\uffff\1\u0113\2\uffff\1\u0110",
			"\1\u0116\1\u0115\2\uffff\1\u0117",
			"\1\u0118\4\uffff\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011e\15\uffff\1\u011d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0120\4\uffff\1\u0121",
			"\1\u0122\6\uffff\1\u0123",
			"\1\u0124",
			"\1\u0125\15\uffff\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129\3\uffff\1\u012a",
			"\1\u012c\5\uffff\1\u012b",
			"\1\u012d",
			"\1\u012e",
			"\1\u0133\10\uffff\1\u012f\1\u0132\4\uffff\1\u0130\1\uffff\1\u0131",
			"\1\u0135\15\uffff\1\u0134",
			"\1\u0136",
			"\1\u0137",
			"\1\u013a\15\uffff\1\u0139\2\uffff\1\u0138",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u0143\1\u0144\1\uffff\1\u0141\4\uffff\1\u013f\2\uffff\1\u0142\6\uffff"+
			"\1\u0140",
			"\1\u0146\3\uffff\1\u0145",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a\3\uffff\1\u014c\5\uffff\1\u014b",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u015a\1\u0154\1\u015b\1\u0157\1\uffff\1\u015f\1\u0158\4\uffff\1\u015e"+
			"\1\uffff\1\u0156\1\uffff\1\u0155\2\uffff\1\u015c\2\uffff\1\u0159\1\u015d",
			"\1\u0161\12\uffff\1\u0160",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164\1\u0165\1\u0166",
			"\1\u0167",
			"\1\u0168\11\uffff\1\u0169",
			"\1\u016a",
			"\1\u016c\17\uffff\1\u016b",
			"\1\u016e\17\uffff\1\u016d",
			"\1\u016f",
			"\1\u0170",
			"\1\u0172\14\uffff\1\u0171\3\uffff\1\u0173",
			"\1\u0174",
			"\1\u0176\3\uffff\1\u0175",
			"\1\u0178\5\uffff\1\u0177",
			"\1\u0179",
			"\1\u017a",
			"",
			"",
			"",
			"",
			"\1\u017b",
			"\1\u017c",
			"",
			"",
			"",
			"",
			"",
			"\47\u00ac\1\u00ae\64\u00ac\1\u00ad\uffa3\u00ac",
			"\0\u017e",
			"\1\62\4\uffff\1\61",
			"\42\u00af\1\u00b1\71\u00af\1\u00b0\uffa3\u00af",
			"\0\u0180",
			"\1\62\4\uffff\1\61",
			"\12\u0181\7\uffff\6\u0181\32\uffff\6\u0181",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00b7\1\uffff\12\u00b4\7\uffff\1\65\1\u00ba\2\65\1\u00b8\1\65\1\u00bb"+
			"\3\65\1\u00bb\1\u00b3\1\u00bb\5\65\1\u00b5\5\65\1\u00b6\1\65\4\uffff"+
			"\1\65\1\uffff\1\65\1\u00bb\2\65\1\u00b8\1\65\1\u00bb\3\65\1\u00bb\1\65"+
			"\1\u00bb\15\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\u0185\10\uffff\1\u0187\2\uffff\1\u0186\37\uffff\1\u0186",
			"\1\u0188\1\uffff\1\u0188\2\uffff\12\u0189",
			"",
			"\12\65\7\uffff\3\65\1\u018a\26\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u018c\10\uffff\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191",
			"",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\12\65\7\uffff\4\65\1\u01a1\7\65\1\u01a0\15\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"\1\u01a3",
			"\1\u01a4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a8",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ae",
			"\1\u01af\6\uffff\1\u01b0",
			"\1\u01b1",
			"\1\u01b2",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b3",
			"\1\u01b4",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"",
			"\1\u01b8",
			"\12\65\7\uffff\4\65\1\u01b9\12\65\1\u01ba\12\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"\1\u01bc",
			"",
			"\1\u01bd",
			"",
			"\1\u01be",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8\11\uffff\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf\23\uffff\1\u01d0",
			"\12\65\7\uffff\4\65\1\u01d1\11\65\1\u01d2\13\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"\1\u01d4",
			"",
			"\1\u01d5",
			"\1\u01d6",
			"",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01db\2\uffff\1\u01da",
			"\1\u01dc",
			"\1\u01de\3\uffff\1\u01dd",
			"\1\u01df",
			"\1\u01e0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01e2",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e6\3\uffff\1\u01e5",
			"\1\u01e7",
			"\1\u01e8\3\uffff\1\u01e9",
			"\1\u01eb\22\uffff\1\u01ea",
			"\1\u01ec",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ee\3\uffff\1\u01ef",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01f1",
			"\1\u01f2",
			"\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u0200\3\uffff\1\u01ff",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207\21\uffff\1\u0208",
			"\12\65\7\uffff\22\65\1\u0209\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0213\3\uffff\1\u0211\13\uffff\1\u0212",
			"\1\u0214",
			"\1\u0216\1\uffff\1\u0215",
			"\1\u0217",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0219",
			"\1\u021a",
			"\1\u021c\1\uffff\1\u021b",
			"\1\u021d\3\uffff\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\12\65\7\uffff\21\65\1\u0224\10\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\u0226\1\uffff\32\65",
			"\1\u0228",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u022c\17\uffff\1\u022a\1\u022b",
			"\1\u022d",
			"\1\u022f\1\u022e",
			"\1\u0230",
			"\1\u0231",
			"\1\u0232",
			"\1\u0233",
			"\1\u0234",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0236",
			"\1\u0237",
			"\1\u0238\12\uffff\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242\11\uffff\1\u0243",
			"\1\u0244",
			"\12\65\7\uffff\22\65\1\u0245\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0248\6\uffff\1\u0247",
			"\1\u0249",
			"\1\u024a",
			"\1\u024c\10\uffff\1\u024b",
			"\1\u024d\2\uffff\1\u024e",
			"\1\u0250\2\uffff\1\u0251\14\uffff\1\u0252\1\u024f",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256\3\uffff\1\u0257",
			"\1\u025a\1\uffff\1\u0259\16\uffff\1\u0258",
			"\1\u025b",
			"\1\u025d\1\u025c",
			"\1\u025e",
			"\1\u025f",
			"\1\u0260",
			"\12\65\7\uffff\11\65\1\u0261\20\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u026a\13\uffff\1\u0269",
			"\1\u026b",
			"\12\65\7\uffff\22\65\1\u026c\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u026e",
			"",
			"",
			"\47\u00ac\1\u00ae\64\u00ac\1\u00ad\uffa3\u00ac",
			"",
			"\42\u00af\1\u00b1\71\u00af\1\u00b0\uffa3\u00af",
			"\12\u0181\7\uffff\6\u0181\24\65\4\uffff\1\65\1\uffff\6\u0181\24\65",
			"",
			"",
			"",
			"\12\u0185\10\uffff\1\u0187\2\uffff\1\u0186\37\uffff\1\u0186",
			"\1\u0270\1\uffff\1\u0270\2\uffff\12\u0271",
			"",
			"\12\u0272",
			"\12\u0189\7\uffff\1\65\1\u0273\30\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0275",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0280",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0283",
			"\1\u0284",
			"\1\u0285",
			"\12\65\7\uffff\5\65\1\u0286\24\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"",
			"\1\u028b",
			"\1\u028c",
			"",
			"\1\u028d",
			"",
			"\1\u028e",
			"",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"",
			"\1\u0292",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0297",
			"\1\u0298",
			"\1\u0299",
			"\12\65\7\uffff\22\65\1\u029a\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u029c",
			"\12\65\7\uffff\26\65\1\u029d\3\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u029f",
			"\1\u02a0",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02a2",
			"\1\u02a3",
			"\1\u02a4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02a6",
			"\1\u02a7",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02a9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02ac",
			"\1\u02ad\7\uffff\1\u02ae",
			"\12\65\7\uffff\22\65\1\u02af\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02b2",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bc",
			"\1\u02bd",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c3\3\uffff\1\u02c2",
			"\1\u02c4",
			"\1\u02c5",
			"\1\u02c6",
			"\1\u02c7",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\21\65\1\u02c9\10\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1\10\uffff\1\u02d2",
			"\1\u02d3",
			"\1\u02d4",
			"",
			"\12\65\7\uffff\1\65\1\u02d5\30\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\23\65\1\u02d7\6\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02da",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02e7",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02e9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02eb",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02f3",
			"\12\65\7\uffff\32\65\4\uffff\1\u02f4\1\uffff\32\65",
			"\1\u02f6",
			"\12\65\7\uffff\4\65\1\u02f7\25\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u02f9",
			"\1\u02fa",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\1\u0305",
			"\1\u0306",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u030d",
			"",
			"\1\u030e",
			"",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0318",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031e\7\uffff\1\u031d",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\12\65\7\uffff\22\65\1\u0323\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u032a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u032d\22\uffff\1\u032c",
			"\12\65\7\uffff\22\65\1\u032e\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0334\3\uffff\1\u0335",
			"\1\u0337\23\uffff\1\u0336",
			"\1\u0338",
			"\1\u0339",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0349",
			"\1\u034a",
			"",
			"\1\u034b",
			"\1\u034c",
			"\1\u034d\1\u034e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0350",
			"\1\u0351",
			"\1\u0352",
			"\1\u0353",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\u0271",
			"\12\u0271\10\uffff\1\u0187",
			"\12\u0272\10\uffff\1\u0187",
			"\1\u018a",
			"",
			"\1\u0357",
			"\1\u0359\4\uffff\1\u0358",
			"\1\u035a",
			"\12\65\7\uffff\22\65\1\u035b\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u035e",
			"\1\u035f",
			"\1\u0360",
			"\1\u0361",
			"\1\u0362",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0364",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0366",
			"\1\u0367",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0369",
			"\1\u036a",
			"\1\u036b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u036e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0371",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0373",
			"\1\u0374",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u037b",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u037d",
			"",
			"\1\u037e",
			"\1\u037f",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0383",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0386",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0388",
			"",
			"\1\u0389",
			"\12\65\7\uffff\4\65\1\u038a\25\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u038c",
			"\1\u038e\1\uffff\1\u038d",
			"\1\u0390\2\uffff\1\u038f",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0392",
			"\1\u0393",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0395",
			"\1\u0396",
			"\1\u0397",
			"\1\u0398",
			"\1\u0399",
			"\1\u039a",
			"\1\u039b",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"",
			"\1\u039f",
			"",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\1\u03a6",
			"\1\u03a7",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"",
			"\1\u03ab",
			"",
			"",
			"\1\u03ac",
			"\1\u03ad",
			"\12\65\7\uffff\10\65\1\u03ae\21\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03b1",
			"",
			"\1\u03b2",
			"\1\u03b3",
			"\1\u03b4",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u03ba",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03bc",
			"\12\65\7\uffff\17\65\1\u03bd\12\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03bf",
			"",
			"",
			"\1\u03c0",
			"\1\u03c1",
			"",
			"\1\u03c2",
			"\1\u03c3",
			"",
			"\1\u03c4",
			"\1\u03c5",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce",
			"\12\65\7\uffff\23\65\1\u03cf\6\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03d2",
			"",
			"\1\u03d3",
			"\1\u03d4",
			"\1\u03d5",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9",
			"\1\u03da",
			"\1\u03db",
			"\1\u03dc",
			"\1\u03dd",
			"\1\u03de",
			"\1\u03e0\22\uffff\1\u03df",
			"\1\u03e1",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03e4",
			"\1\u03e5",
			"\1\u03e6",
			"\1\u03e7",
			"\1\u03e8",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u03ed",
			"\1\u03ee",
			"\1\u03ef",
			"\1\u03f0",
			"",
			"\1\u03f1",
			"",
			"\1\u03f2",
			"\1\u03f3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u03f7",
			"\1\u03f8",
			"\1\u03f9",
			"\1\u03fa",
			"\1\u03fb",
			"\1\u03fc",
			"\1\u03fd",
			"\1\u03fe",
			"",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0403",
			"",
			"",
			"",
			"\1\u0404",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0406",
			"\1\u0407",
			"",
			"",
			"\1\u0408",
			"\1\u0409",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u040b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u040d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u040f",
			"\1\u0410",
			"\1\u0411",
			"",
			"",
			"",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\1\u0415",
			"\12\65\7\uffff\1\u0416\31\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0418",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\1\u041c",
			"",
			"\1\u041d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u041f",
			"",
			"\12\65\7\uffff\23\65\1\u0420\6\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0422",
			"\1\u0423",
			"",
			"",
			"\1\u0424",
			"",
			"",
			"\1\u0425",
			"",
			"\1\u0426",
			"\1\u0427",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0429",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u042b",
			"",
			"\1\u042d\1\uffff\1\u042c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u0430",
			"",
			"",
			"\1\u0431",
			"",
			"\1\u0432",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0434",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u043b",
			"",
			"\1\u043c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"\1\u0442",
			"\1\u0443",
			"\1\u0444",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0446",
			"\1\u0447",
			"\1\u0448",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"\1\u0451",
			"\1\u0452",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0454",
			"\1\u0455",
			"",
			"",
			"\1\u0456",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\22\65\1\u0459\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u045c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0460",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0463",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0466",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0469",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u046b",
			"",
			"\12\65\7\uffff\22\65\1\u046c\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"",
			"",
			"\1\u0472",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0474",
			"\1\u0475",
			"",
			"\1\u0476",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0478",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u047a",
			"\1\u047b",
			"\1\u047c",
			"\1\u047d",
			"\1\u047e",
			"\1\u047f",
			"\1\u0480",
			"",
			"",
			"\1\u0481",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0483",
			"\1\u0484",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0489\4\uffff\1\u048a",
			"\1\u048b",
			"\1\u048c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u048e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0490",
			"",
			"",
			"",
			"\12\65\7\uffff\22\65\1\u0491\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0493",
			"\1\u0494",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u049e",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04a0",
			"\1\u04a1",
			"\1\u04a2",
			"",
			"\1\u04a3",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04a5",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04ac",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04ae",
			"\1\u04af",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"",
			"\1\u04b3",
			"\1\u04b4",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04b6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04b9",
			"\1\u04ba",
			"",
			"\1\u04bb",
			"",
			"\1\u04bc",
			"\1\u04bd",
			"\1\u04be",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04c0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04c3",
			"\1\u04c4",
			"\1\u04c5",
			"\1\u04c6",
			"",
			"\1\u04c7",
			"\1\u04c8",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04ca",
			"\1\u04cb",
			"\1\u04cc",
			"\1\u04cd",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04cf",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04d1",
			"",
			"\1\u04d2",
			"\1\u04d3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04d5",
			"\1\u04d6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04d8",
			"\1\u04d9",
			"\1\u04da",
			"",
			"\1\u04db",
			"\1\u04dc",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u04e0",
			"",
			"",
			"\1\u04e1",
			"",
			"",
			"\1\u04e2",
			"",
			"",
			"\1\u04e3",
			"",
			"\1\u04e4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u04e6",
			"\1\u04e7",
			"\1\u04e8",
			"\1\u04e9",
			"",
			"\1\u04ea",
			"\1\u04eb",
			"\1\u04ec",
			"",
			"\1\u04ed",
			"",
			"\1\u04ee",
			"\1\u04ef",
			"\1\u04f0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u04f2",
			"\1\u04f3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04f6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04fc",
			"",
			"\1\u04fd",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u04ff",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\10\65\1\u0502\21\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0504",
			"\1\u0505",
			"\1\u0506",
			"\12\65\7\uffff\4\65\1\u0507\15\65\1\u0508\7\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\u050b\1\uffff\32\65",
			"\1\u050d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u050f",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0511",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0513",
			"\1\u0514",
			"",
			"\1\u0515",
			"",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\1\u0519",
			"\12\65\7\uffff\22\65\1\u051a\7\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u051c",
			"\1\u051d",
			"",
			"\1\u051e",
			"",
			"",
			"\1\u051f",
			"\1\u0520",
			"\1\u0521",
			"\1\u0522",
			"\1\u0523",
			"\1\u0524",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0526",
			"\1\u0527",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0529",
			"\1\u052a",
			"\1\u052b",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u052e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0531",
			"\1\u0532",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0535",
			"",
			"\1\u0537\17\uffff\1\u0536",
			"\12\65\7\uffff\22\65\1\u0538\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u053b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u053d",
			"\1\u053e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0540",
			"\1\u0541",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0543",
			"\1\u0544",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0546",
			"\1\u0547",
			"\1\u0548",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u054a",
			"\1\u054b",
			"\1\u054c",
			"",
			"\1\u054d",
			"\1\u054e",
			"",
			"",
			"\1\u054f",
			"",
			"\1\u0550",
			"\1\u0551",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0553",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0555",
			"",
			"",
			"\1\u0556",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0558",
			"\1\u0559",
			"\1\u055a",
			"\1\u055b",
			"",
			"",
			"\1\u055c\17\uffff\1\u055d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u055f",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0562",
			"\1\u0563",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0565",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0567",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0569",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u056c",
			"\1\u056d",
			"\1\u056e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0570",
			"\1\u0571",
			"",
			"\1\u0572",
			"\1\u0573",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0576",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0579",
			"",
			"",
			"\1\u057a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u057c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u057e",
			"",
			"\1\u057f",
			"\1\u0580",
			"",
			"\1\u0581",
			"\1\u0582",
			"",
			"\1\u0583",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0587",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u058a",
			"\12\65\7\uffff\4\65\1\u058c\15\65\1\u058b\7\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"\1\u058e",
			"\1\u058f",
			"\1\u0590",
			"\1\u0591",
			"",
			"\1\u0592",
			"",
			"\1\u0593",
			"\1\u0594",
			"",
			"\1\u0595",
			"\1\u0596",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0598",
			"\1\u0599",
			"\1\u059a",
			"",
			"\1\u059b",
			"",
			"",
			"\1\u059c",
			"\1\u059d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u059f",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u05a1",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05a4",
			"\1\u05a5",
			"\1\u05a6",
			"\1\u05a7",
			"",
			"",
			"\1\u05a8",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05ab",
			"",
			"\1\u05ac",
			"\1\u05ad",
			"\1\u05ae",
			"\1\u05af",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u05b2",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05b5",
			"",
			"\1\u05b6",
			"\1\u05b7",
			"\1\u05b8",
			"\1\u05b9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05bc",
			"\1\u05bd",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05bf",
			"\1\u05c0",
			"\1\u05c1",
			"\1\u05c2",
			"\12\65\7\uffff\22\65\1\u05c3\7\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05c6",
			"",
			"\1\u05c7",
			"",
			"",
			"\1\u05c8",
			"\1\u05c9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05cc",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05ce",
			"\1\u05cf",
			"\1\u05d0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u05d2",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05d6",
			"\1\u05d7",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05da",
			"\1\u05db",
			"\1\u05dc",
			"\1\u05dd",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u05df",
			"\1\u05e0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u05e3",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05e5",
			"\1\u05e6",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u05ea",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05ec",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05f1",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u05f4",
			"",
			"",
			"",
			"",
			"\1\u05f5",
			"",
			"",
			"\1\u05f6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u05f8",
			"",
			"\1\u05f9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_FORMATTED | KW_PRETTY | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_PARTIALSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_REWRITE | KW_AUTHORIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_MONTH | KW_DAY | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_KEY | KW_ABORT | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | BigintLiteral | SmallintLiteral | TinyintLiteral | DecimalLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA25_172 = input.LA(1);
						s = -1;
						if ( (LA25_172=='\'') ) {s = 174;}
						else if ( ((LA25_172 >= '\u0000' && LA25_172 <= '&')||(LA25_172 >= '(' && LA25_172 <= '[')||(LA25_172 >= ']' && LA25_172 <= '\uFFFF')) ) {s = 172;}
						else if ( (LA25_172=='\\') ) {s = 173;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA25_382 = input.LA(1);
						s = -1;
						if ( (LA25_382=='\'') ) {s = 174;}
						else if ( ((LA25_382 >= '\u0000' && LA25_382 <= '&')||(LA25_382 >= '(' && LA25_382 <= '[')||(LA25_382 >= ']' && LA25_382 <= '\uFFFF')) ) {s = 172;}
						else if ( (LA25_382=='\\') ) {s = 173;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA25_175 = input.LA(1);
						s = -1;
						if ( (LA25_175=='\"') ) {s = 177;}
						else if ( ((LA25_175 >= '\u0000' && LA25_175 <= '!')||(LA25_175 >= '#' && LA25_175 <= '[')||(LA25_175 >= ']' && LA25_175 <= '\uFFFF')) ) {s = 175;}
						else if ( (LA25_175=='\\') ) {s = 176;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA25_384 = input.LA(1);
						s = -1;
						if ( (LA25_384=='\"') ) {s = 177;}
						else if ( ((LA25_384 >= '\u0000' && LA25_384 <= '!')||(LA25_384 >= '#' && LA25_384 <= '[')||(LA25_384 >= ']' && LA25_384 <= '\uFFFF')) ) {s = 175;}
						else if ( (LA25_384=='\\') ) {s = 176;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA25_173 = input.LA(1);
						s = -1;
						if ( ((LA25_173 >= '\u0000' && LA25_173 <= '\uFFFF')) ) {s = 382;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA25_176 = input.LA(1);
						s = -1;
						if ( ((LA25_176 >= '\u0000' && LA25_176 <= '\uFFFF')) ) {s = 384;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA25_49 = input.LA(1);
						s = -1;
						if ( ((LA25_49 >= '\u0000' && LA25_49 <= '&')||(LA25_49 >= '(' && LA25_49 <= '[')||(LA25_49 >= ']' && LA25_49 <= '\uFFFF')) ) {s = 172;}
						else if ( (LA25_49=='\\') ) {s = 173;}
						else if ( (LA25_49=='\'') ) {s = 174;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA25_50 = input.LA(1);
						s = -1;
						if ( ((LA25_50 >= '\u0000' && LA25_50 <= '!')||(LA25_50 >= '#' && LA25_50 <= '[')||(LA25_50 >= ']' && LA25_50 <= '\uFFFF')) ) {s = 175;}
						else if ( (LA25_50=='\\') ) {s = 176;}
						else if ( (LA25_50=='\"') ) {s = 177;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 25, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
