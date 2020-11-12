// $ANTLR 3.5.2 FromClauseParser.g 2020-11-05 18:51:56

package grammar;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


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
public class HiveParser_FromClauseParser extends Parser {
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
	public static final int KW_HOLD_DDLTIME=449;
	public static final int KW_IGNORE=453;
	public static final int KW_NO_DROP=502;
	public static final int KW_OFFLINE=506;
	public static final int KW_PROTECTION=530;
	public static final int KW_READONLY=534;
	public static final int TOK_ABORT_TRANSACTIONS=643;
	public static final int TOK_ADMIN_OPTION_FOR=644;
	public static final int TOK_ALIASLIST=645;
	public static final int TOK_ALLCOLREF=646;
	public static final int TOK_ALTERDATABASE_OWNER=647;
	public static final int TOK_ALTERDATABASE_PROPERTIES=648;
	public static final int TOK_ALTERINDEX_PROPERTIES=649;
	public static final int TOK_ALTERINDEX_REBUILD=650;
	public static final int TOK_ALTERTABLE=651;
	public static final int TOK_ALTERTABLE_ADDCOLS=652;
	public static final int TOK_ALTERTABLE_ADDCONSTRAINT=653;
	public static final int TOK_ALTERTABLE_ADDPARTS=654;
	public static final int TOK_ALTERTABLE_ARCHIVE=655;
	public static final int TOK_ALTERTABLE_BUCKETS=656;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=657;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=658;
	public static final int TOK_ALTERTABLE_COMPACT=659;
	public static final int TOK_ALTERTABLE_DROPCONSTRAINT=660;
	public static final int TOK_ALTERTABLE_DROPPARTS=661;
	public static final int TOK_ALTERTABLE_DROPPROPERTIES=662;
	public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=663;
	public static final int TOK_ALTERTABLE_FILEFORMAT=664;
	public static final int TOK_ALTERTABLE_LOCATION=665;
	public static final int TOK_ALTERTABLE_MERGEFILES=666;
	public static final int TOK_ALTERTABLE_PARTCOLTYPE=667;
	public static final int TOK_ALTERTABLE_PROPERTIES=668;
	public static final int TOK_ALTERTABLE_RENAME=669;
	public static final int TOK_ALTERTABLE_RENAMECOL=670;
	public static final int TOK_ALTERTABLE_RENAMEPART=671;
	public static final int TOK_ALTERTABLE_REPLACECOLS=672;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=673;
	public static final int TOK_ALTERTABLE_SERIALIZER=674;
	public static final int TOK_ALTERTABLE_SKEWED=675;
	public static final int TOK_ALTERTABLE_SKEWED_LOCATION=676;
	public static final int TOK_ALTERTABLE_TOUCH=677;
	public static final int TOK_ALTERTABLE_UNARCHIVE=678;
	public static final int TOK_ALTERTABLE_UPDATECOLSTATS=679;
	public static final int TOK_ALTERTABLE_UPDATESTATS=680;
	public static final int TOK_ALTERVIEW=681;
	public static final int TOK_ALTERVIEW_ADDPARTS=682;
	public static final int TOK_ALTERVIEW_DROPPARTS=683;
	public static final int TOK_ALTERVIEW_DROPPROPERTIES=684;
	public static final int TOK_ALTERVIEW_PROPERTIES=685;
	public static final int TOK_ALTERVIEW_RENAME=686;
	public static final int TOK_ANALYZE=687;
	public static final int TOK_ANONYMOUS=688;
	public static final int TOK_ARCHIVE=689;
	public static final int TOK_BIGINT=690;
	public static final int TOK_BINARY=691;
	public static final int TOK_BOOLEAN=692;
	public static final int TOK_CACHE_METADATA=693;
	public static final int TOK_CASCADE=694;
	public static final int TOK_CHAR=695;
	public static final int TOK_CHARSETLITERAL=696;
	public static final int TOK_CLUSTERBY=697;
	public static final int TOK_COLTYPELIST=698;
	public static final int TOK_COL_NAME=699;
	public static final int TOK_COMMIT=700;
	public static final int TOK_CREATEDATABASE=701;
	public static final int TOK_CREATEFUNCTION=702;
	public static final int TOK_CREATEINDEX=703;
	public static final int TOK_CREATEINDEX_INDEXTBLNAME=704;
	public static final int TOK_CREATEMACRO=705;
	public static final int TOK_CREATEROLE=706;
	public static final int TOK_CREATETABLE=707;
	public static final int TOK_CREATEVIEW=708;
	public static final int TOK_CROSSJOIN=709;
	public static final int TOK_CTE=710;
	public static final int TOK_CUBE_GROUPBY=711;
	public static final int TOK_DATABASECOMMENT=712;
	public static final int TOK_DATABASELOCATION=713;
	public static final int TOK_DATABASEPROPERTIES=714;
	public static final int TOK_DATE=715;
	public static final int TOK_DATELITERAL=716;
	public static final int TOK_DATETIME=717;
	public static final int TOK_DBPROPLIST=718;
	public static final int TOK_DB_TYPE=719;
	public static final int TOK_DECIMAL=720;
	public static final int TOK_DEFERRED_REBUILDINDEX=721;
	public static final int TOK_DELETE_FROM=722;
	public static final int TOK_DESCDATABASE=723;
	public static final int TOK_DESCFUNCTION=724;
	public static final int TOK_DESCTABLE=725;
	public static final int TOK_DESTINATION=726;
	public static final int TOK_DIR=727;
	public static final int TOK_DISABLE=728;
	public static final int TOK_DISTRIBUTEBY=729;
	public static final int TOK_DOUBLE=730;
	public static final int TOK_DROPDATABASE=731;
	public static final int TOK_DROPFUNCTION=732;
	public static final int TOK_DROPINDEX=733;
	public static final int TOK_DROPMACRO=734;
	public static final int TOK_DROPROLE=735;
	public static final int TOK_DROPTABLE=736;
	public static final int TOK_DROPVIEW=737;
	public static final int TOK_ENABLE=738;
	public static final int TOK_EXPLAIN=739;
	public static final int TOK_EXPLAIN_SQ_REWRITE=740;
	public static final int TOK_EXPLIST=741;
	public static final int TOK_EXPORT=742;
	public static final int TOK_FALSE=743;
	public static final int TOK_FILE=744;
	public static final int TOK_FILEFORMAT_GENERIC=745;
	public static final int TOK_FLOAT=746;
	public static final int TOK_FOREIGN_KEY=747;
	public static final int TOK_FROM=748;
	public static final int TOK_FULLOUTERJOIN=749;
	public static final int TOK_FUNCTION=750;
	public static final int TOK_FUNCTIONDI=751;
	public static final int TOK_FUNCTIONSTAR=752;
	public static final int TOK_GRANT=753;
	public static final int TOK_GRANT_OPTION_FOR=754;
	public static final int TOK_GRANT_ROLE=755;
	public static final int TOK_GRANT_WITH_ADMIN_OPTION=756;
	public static final int TOK_GRANT_WITH_OPTION=757;
	public static final int TOK_GROUP=758;
	public static final int TOK_GROUPBY=759;
	public static final int TOK_GROUPING_SETS=760;
	public static final int TOK_GROUPING_SETS_EXPRESSION=761;
	public static final int TOK_HAVING=762;
	public static final int TOK_HINT=763;
	public static final int TOK_HINTARGLIST=764;
	public static final int TOK_HINTLIST=765;
	public static final int TOK_IFEXISTS=766;
	public static final int TOK_IFNOTEXISTS=767;
	public static final int TOK_IMPORT=768;
	public static final int TOK_INDEXCOMMENT=769;
	public static final int TOK_INDEXPROPERTIES=770;
	public static final int TOK_INDEXPROPLIST=771;
	public static final int TOK_INSERT=772;
	public static final int TOK_INSERT_INTO=773;
	public static final int TOK_INT=774;
	public static final int TOK_INTERVAL_DAY_LITERAL=775;
	public static final int TOK_INTERVAL_DAY_TIME=776;
	public static final int TOK_INTERVAL_DAY_TIME_LITERAL=777;
	public static final int TOK_INTERVAL_HOUR_LITERAL=778;
	public static final int TOK_INTERVAL_MINUTE_LITERAL=779;
	public static final int TOK_INTERVAL_MONTH_LITERAL=780;
	public static final int TOK_INTERVAL_SECOND_LITERAL=781;
	public static final int TOK_INTERVAL_YEAR_LITERAL=782;
	public static final int TOK_INTERVAL_YEAR_MONTH=783;
	public static final int TOK_INTERVAL_YEAR_MONTH_LITERAL=784;
	public static final int TOK_ISNOTNULL=785;
	public static final int TOK_ISNULL=786;
	public static final int TOK_ISOLATION_LEVEL=787;
	public static final int TOK_ISOLATION_SNAPSHOT=788;
	public static final int TOK_JAR=789;
	public static final int TOK_JOIN=790;
	public static final int TOK_LATERAL_VIEW=791;
	public static final int TOK_LATERAL_VIEW_OUTER=792;
	public static final int TOK_LEFTOUTERJOIN=793;
	public static final int TOK_LEFTSEMIJOIN=794;
	public static final int TOK_LENGTH=795;
	public static final int TOK_LIKETABLE=796;
	public static final int TOK_LIMIT=797;
	public static final int TOK_LIST=798;
	public static final int TOK_LOAD=799;
	public static final int TOK_LOCKDB=800;
	public static final int TOK_LOCKTABLE=801;
	public static final int TOK_MAP=802;
	public static final int TOK_MAPJOIN=803;
	public static final int TOK_METADATA=804;
	public static final int TOK_MSCK=805;
	public static final int TOK_NORELY=806;
	public static final int TOK_NOT_CLUSTERED=807;
	public static final int TOK_NOT_SORTED=808;
	public static final int TOK_NOVALIDATE=809;
	public static final int TOK_NO_DROP=810;
	public static final int TOK_NULL=811;
	public static final int TOK_NULLS_FIRST=812;
	public static final int TOK_NULLS_LAST=813;
	public static final int TOK_OFFLINE=814;
	public static final int TOK_OFFSET=815;
	public static final int TOK_OP_ADD=816;
	public static final int TOK_OP_AND=817;
	public static final int TOK_OP_BITAND=818;
	public static final int TOK_OP_BITNOT=819;
	public static final int TOK_OP_BITOR=820;
	public static final int TOK_OP_BITXOR=821;
	public static final int TOK_OP_DIV=822;
	public static final int TOK_OP_EQ=823;
	public static final int TOK_OP_GE=824;
	public static final int TOK_OP_GT=825;
	public static final int TOK_OP_LE=826;
	public static final int TOK_OP_LIKE=827;
	public static final int TOK_OP_LT=828;
	public static final int TOK_OP_MOD=829;
	public static final int TOK_OP_MUL=830;
	public static final int TOK_OP_NE=831;
	public static final int TOK_OP_NOT=832;
	public static final int TOK_OP_OR=833;
	public static final int TOK_OP_SUB=834;
	public static final int TOK_ORDERBY=835;
	public static final int TOK_ORREPLACE=836;
	public static final int TOK_PARTITIONINGSPEC=837;
	public static final int TOK_PARTITIONLOCATION=838;
	public static final int TOK_PARTSPEC=839;
	public static final int TOK_PARTVAL=840;
	public static final int TOK_PERCENT=841;
	public static final int TOK_PRIMARY_KEY=842;
	public static final int TOK_PRINCIPAL_NAME=843;
	public static final int TOK_PRIVILEGE=844;
	public static final int TOK_PRIVILEGE_LIST=845;
	public static final int TOK_PRIV_ALL=846;
	public static final int TOK_PRIV_ALTER_DATA=847;
	public static final int TOK_PRIV_ALTER_METADATA=848;
	public static final int TOK_PRIV_CREATE=849;
	public static final int TOK_PRIV_DELETE=850;
	public static final int TOK_PRIV_DROP=851;
	public static final int TOK_PRIV_INDEX=852;
	public static final int TOK_PRIV_INSERT=853;
	public static final int TOK_PRIV_LOCK=854;
	public static final int TOK_PRIV_OBJECT=855;
	public static final int TOK_PRIV_OBJECT_COL=856;
	public static final int TOK_PRIV_SELECT=857;
	public static final int TOK_PRIV_SHOW_DATABASE=858;
	public static final int TOK_PTBLFUNCTION=859;
	public static final int TOK_QUERY=860;
	public static final int TOK_READONLY=861;
	public static final int TOK_RECORDREADER=862;
	public static final int TOK_RECORDWRITER=863;
	public static final int TOK_RELOADFUNCTION=864;
	public static final int TOK_RELY=865;
	public static final int TOK_REPLICATION=866;
	public static final int TOK_RESOURCE_ALL=867;
	public static final int TOK_RESOURCE_LIST=868;
	public static final int TOK_RESOURCE_URI=869;
	public static final int TOK_RESTRICT=870;
	public static final int TOK_REVOKE=871;
	public static final int TOK_REVOKE_ROLE=872;
	public static final int TOK_RIGHTOUTERJOIN=873;
	public static final int TOK_ROLE=874;
	public static final int TOK_ROLLBACK=875;
	public static final int TOK_ROLLUP_GROUPBY=876;
	public static final int TOK_ROWCOUNT=877;
	public static final int TOK_SELECT=878;
	public static final int TOK_SELECTDI=879;
	public static final int TOK_SELEXPR=880;
	public static final int TOK_SERDE=881;
	public static final int TOK_SERDENAME=882;
	public static final int TOK_SERDEPROPS=883;
	public static final int TOK_SERVER_TYPE=884;
	public static final int TOK_SET_AUTOCOMMIT=885;
	public static final int TOK_SET_COLUMNS_CLAUSE=886;
	public static final int TOK_SHOWCOLUMNS=887;
	public static final int TOK_SHOWCONF=888;
	public static final int TOK_SHOWDATABASES=889;
	public static final int TOK_SHOWDBLOCKS=890;
	public static final int TOK_SHOWFUNCTIONS=891;
	public static final int TOK_SHOWINDEXES=892;
	public static final int TOK_SHOWLOCKS=893;
	public static final int TOK_SHOWPARTITIONS=894;
	public static final int TOK_SHOWTABLES=895;
	public static final int TOK_SHOW_COMPACTIONS=896;
	public static final int TOK_SHOW_CREATEDATABASE=897;
	public static final int TOK_SHOW_CREATETABLE=898;
	public static final int TOK_SHOW_GRANT=899;
	public static final int TOK_SHOW_ROLES=900;
	public static final int TOK_SHOW_ROLE_GRANT=901;
	public static final int TOK_SHOW_ROLE_PRINCIPALS=902;
	public static final int TOK_SHOW_SET_ROLE=903;
	public static final int TOK_SHOW_TABLESTATUS=904;
	public static final int TOK_SHOW_TBLPROPERTIES=905;
	public static final int TOK_SHOW_TRANSACTIONS=906;
	public static final int TOK_SKEWED_LOCATIONS=907;
	public static final int TOK_SKEWED_LOCATION_LIST=908;
	public static final int TOK_SKEWED_LOCATION_MAP=909;
	public static final int TOK_SMALLINT=910;
	public static final int TOK_SORTBY=911;
	public static final int TOK_START_TRANSACTION=912;
	public static final int TOK_STORAGEHANDLER=913;
	public static final int TOK_STOREDASDIRS=914;
	public static final int TOK_STREAMTABLE=915;
	public static final int TOK_STRING=916;
	public static final int TOK_STRINGLITERALSEQUENCE=917;
	public static final int TOK_STRUCT=918;
	public static final int TOK_SUBQUERY=919;
	public static final int TOK_SUBQUERY_EXPR=920;
	public static final int TOK_SUBQUERY_OP=921;
	public static final int TOK_SUBQUERY_OP_NOTEXISTS=922;
	public static final int TOK_SUBQUERY_OP_NOTIN=923;
	public static final int TOK_SWITCHDATABASE=924;
	public static final int TOK_TAB=925;
	public static final int TOK_TABALIAS=926;
	public static final int TOK_TABCOL=927;
	public static final int TOK_TABCOLLIST=928;
	public static final int TOK_TABCOLNAME=929;
	public static final int TOK_TABCOLVALUE=930;
	public static final int TOK_TABCOLVALUES=931;
	public static final int TOK_TABCOLVALUE_PAIR=932;
	public static final int TOK_TABLEBUCKETSAMPLE=933;
	public static final int TOK_TABLECOMMENT=934;
	public static final int TOK_TABLEFILEFORMAT=935;
	public static final int TOK_TABLELOCATION=936;
	public static final int TOK_TABLEPARTCOLS=937;
	public static final int TOK_TABLEPROPERTIES=938;
	public static final int TOK_TABLEPROPERTY=939;
	public static final int TOK_TABLEPROPLIST=940;
	public static final int TOK_TABLEROWFORMAT=941;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=942;
	public static final int TOK_TABLEROWFORMATFIELD=943;
	public static final int TOK_TABLEROWFORMATLINES=944;
	public static final int TOK_TABLEROWFORMATMAPKEYS=945;
	public static final int TOK_TABLEROWFORMATNULL=946;
	public static final int TOK_TABLESERIALIZER=947;
	public static final int TOK_TABLESKEWED=948;
	public static final int TOK_TABLESPLITSAMPLE=949;
	public static final int TOK_TABLE_OR_COL=950;
	public static final int TOK_TABLE_PARTITION=951;
	public static final int TOK_TABLE_TYPE=952;
	public static final int TOK_TABNAME=953;
	public static final int TOK_TABREF=954;
	public static final int TOK_TABSORTCOLNAMEASC=955;
	public static final int TOK_TABSORTCOLNAMEDESC=956;
	public static final int TOK_TABSRC=957;
	public static final int TOK_TABTYPE=958;
	public static final int TOK_TEMPORARY=959;
	public static final int TOK_TIMESTAMP=960;
	public static final int TOK_TIMESTAMPLITERAL=961;
	public static final int TOK_TINYINT=962;
	public static final int TOK_TMP_FILE=963;
	public static final int TOK_TRANSFORM=964;
	public static final int TOK_TRUE=965;
	public static final int TOK_TRUNCATETABLE=966;
	public static final int TOK_TXN_ACCESS_MODE=967;
	public static final int TOK_TXN_READ_ONLY=968;
	public static final int TOK_TXN_READ_WRITE=969;
	public static final int TOK_UNIONALL=970;
	public static final int TOK_UNIONDISTINCT=971;
	public static final int TOK_UNIONTYPE=972;
	public static final int TOK_UNIQUEJOIN=973;
	public static final int TOK_UNLOCKDB=974;
	public static final int TOK_UNLOCKTABLE=975;
	public static final int TOK_UPDATE_TABLE=976;
	public static final int TOK_URI_TYPE=977;
	public static final int TOK_USER=978;
	public static final int TOK_USERSCRIPTCOLNAMES=979;
	public static final int TOK_USERSCRIPTCOLSCHEMA=980;
	public static final int TOK_VALIDATE=981;
	public static final int TOK_VALUES_TABLE=982;
	public static final int TOK_VALUE_ROW=983;
	public static final int TOK_VARCHAR=984;
	public static final int TOK_VIEWPARTCOLS=985;
	public static final int TOK_VIRTUAL_TABLE=986;
	public static final int TOK_VIRTUAL_TABREF=987;
	public static final int TOK_WHERE=988;
	public static final int TOK_WINDOWDEF=989;
	public static final int TOK_WINDOWRANGE=990;
	public static final int TOK_WINDOWSPEC=991;
	public static final int TOK_WINDOWVALUES=992;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
		super(input, state);
		this.gHiveParser = gHiveParser;
		gParent = gHiveParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HiveParser.tokenNames; }
	@Override public String getGrammarFileName() { return "FromClauseParser.g"; }


	  @Override
	  public Object recoverFromMismatchedSet(IntStream input,
	      RecognitionException re, BitSet follow) throws RecognitionException {
	    throw re;
	  }
	  @Override
	  public void displayRecognitionError(String[] tokenNames,
	      RecognitionException e) {
	    gParent.errors.add(new ParseError(gParent, e, tokenNames));
	  }
	  protected boolean useSQL11ReservedKeywordsForIdentifier() {
	    return gParent.useSQL11ReservedKeywordsForIdentifier();
	  }


	public static class tableAllColumns_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableAllColumns"
	// FromClauseParser.g:51:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
	public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
		HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR1=null;
		Token DOT3=null;
		Token STAR4=null;
		ParserRuleReturnScope tableName2 =null;

		CommonTree STAR1_tree=null;
		CommonTree DOT3_tree=null;
		CommonTree STAR4_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		try {
			// FromClauseParser.g:52:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==STAR) ) {
				alt1=1;
			}
			else if ( ((LA1_0 >= Identifier && LA1_0 <= KW_ANALYZE)||(LA1_0 >= KW_ARCHIVE && LA1_0 <= KW_BY)||LA1_0==KW_CASCADE||LA1_0==KW_CHANGE||(LA1_0 >= KW_CLUSTER && LA1_0 <= KW_COLLECTION)||(LA1_0 >= KW_COLUMNS && LA1_0 <= KW_COMMENT)||(LA1_0 >= KW_COMPACT && LA1_0 <= KW_CONCATENATE)||(LA1_0 >= KW_CONSTRAINT && LA1_0 <= KW_CREATE)||LA1_0==KW_CUBE||(LA1_0 >= KW_CURRENT_DATE && LA1_0 <= KW_DATA)||(LA1_0 >= KW_DATABASES && LA1_0 <= KW_DISABLE)||(LA1_0 >= KW_DISTRIBUTE && LA1_0 <= KW_ELEM_TYPE)||LA1_0==KW_ENABLE||LA1_0==KW_ESCAPED||(LA1_0 >= KW_EXCLUSIVE && LA1_0 <= KW_EXPORT)||(LA1_0 >= KW_EXTERNAL && LA1_0 <= KW_FLOAT)||(LA1_0 >= KW_FOR && LA1_0 <= KW_FORMATTED)||LA1_0==KW_FULL||(LA1_0 >= KW_FUNCTIONS && LA1_0 <= KW_GROUPING)||(LA1_0 >= KW_HOUR && LA1_0 <= KW_IDXPROPERTIES)||(LA1_0 >= KW_IMPORT && LA1_0 <= KW_INTERSECT)||(LA1_0 >= KW_INTO && LA1_0 <= KW_JAR)||(LA1_0 >= KW_KEY && LA1_0 <= KW_LEFT)||(LA1_0 >= KW_LEVEL && LA1_0 <= KW_LONG)||(LA1_0 >= KW_MAPJOIN && LA1_0 <= KW_MONTH)||(LA1_0 >= KW_MSCK && LA1_0 <= KW_NOSCAN)||(LA1_0 >= KW_NOVALIDATE && LA1_0 <= KW_OFFSET)||LA1_0==KW_OPTION||(LA1_0 >= KW_ORDER && LA1_0 <= KW_OUTPUTFORMAT)||(LA1_0 >= KW_OVERWRITE && LA1_0 <= KW_OWNER)||(LA1_0 >= KW_PARTITION && LA1_0 <= KW_PLUS)||(LA1_0 >= KW_PRETTY && LA1_0 <= KW_RECORDWRITER)||(LA1_0 >= KW_REFERENCES && LA1_0 <= KW_ROLES)||(LA1_0 >= KW_ROLLUP && LA1_0 <= KW_SECOND)||(LA1_0 >= KW_SEMI && LA1_0 <= KW_SSL)||(LA1_0 >= KW_STATISTICS && LA1_0 <= KW_TABLES)||(LA1_0 >= KW_TBLPROPERTIES && LA1_0 <= KW_TERMINATED)||(LA1_0 >= KW_TIMESTAMP && LA1_0 <= KW_TRANSACTIONS)||(LA1_0 >= KW_TRIGGER && LA1_0 <= KW_UNARCHIVE)||(LA1_0 >= KW_UNDO && LA1_0 <= KW_UNIONTYPE)||(LA1_0 >= KW_UNLOCK && LA1_0 <= KW_VALUE_TYPE)||LA1_0==KW_VIEW||LA1_0==KW_WHILE||(LA1_0 >= KW_WITH && LA1_0 <= KW_YEAR)||LA1_0==KW_HOLD_DDLTIME||LA1_0==KW_IGNORE||LA1_0==KW_NO_DROP||LA1_0==KW_OFFLINE||LA1_0==KW_PROTECTION||LA1_0==KW_READONLY) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// FromClauseParser.g:52:7: STAR
					{
					STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns57); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR1);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 53:9: -> ^( TOK_ALLCOLREF )
					{
						// FromClauseParser.g:53:12: ^( TOK_ALLCOLREF )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:54:7: tableName DOT STAR
					{
					pushFollow(FOLLOW_tableName_in_tableAllColumns79);
					tableName2=tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());
					DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns81); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT3);

					STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns83); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR4);

					// AST REWRITE
					// elements: tableName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 55:9: -> ^( TOK_ALLCOLREF tableName )
					{
						// FromClauseParser.g:55:12: ^( TOK_ALLCOLREF tableName )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_1, stream_tableName.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableAllColumns"


	public static class tableOrColumn_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableOrColumn"
	// FromClauseParser.g:59:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
	public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
		HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier5 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("table or column identifier", state); 
		try {
			// FromClauseParser.g:62:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
			// FromClauseParser.g:63:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableOrColumn131);
			identifier5=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 63:16: -> ^( TOK_TABLE_OR_COL identifier )
			{
				// FromClauseParser.g:63:19: ^( TOK_TABLE_OR_COL identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableOrColumn"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// FromClauseParser.g:66:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
	public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
		HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA7=null;
		ParserRuleReturnScope expression6 =null;
		ParserRuleReturnScope expression8 =null;

		CommonTree COMMA7_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.pushMsg("expression list", state); 
		try {
			// FromClauseParser.g:69:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
			// FromClauseParser.g:70:5: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList170);
			expression6=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());
			// FromClauseParser.g:70:16: ( COMMA expression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// FromClauseParser.g:70:17: COMMA expression
					{
					COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList173); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA7);

					pushFollow(FOLLOW_expression_in_expressionList175);
					expression8=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression8.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 70:36: -> ^( TOK_EXPLIST ( expression )+ )
			{
				// FromClauseParser.g:70:39: ^( TOK_EXPLIST ( expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class aliasList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "aliasList"
	// FromClauseParser.g:73:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
	public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
		HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA10=null;
		ParserRuleReturnScope identifier9 =null;
		ParserRuleReturnScope identifier11 =null;

		CommonTree COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("alias list", state); 
		try {
			// FromClauseParser.g:76:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
			// FromClauseParser.g:77:5: identifier ( COMMA identifier )*
			{
			pushFollow(FOLLOW_identifier_in_aliasList217);
			identifier9=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier9.getTree());
			// FromClauseParser.g:77:16: ( COMMA identifier )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// FromClauseParser.g:77:17: COMMA identifier
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList220); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA10);

					pushFollow(FOLLOW_identifier_in_aliasList222);
					identifier11=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:36: -> ^( TOK_ALIASLIST ( identifier )+ )
			{
				// FromClauseParser.g:77:39: ^( TOK_ALIASLIST ( identifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST"), root_1);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasList"


	public static class fromClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fromClause"
	// FromClauseParser.g:82:1: fromClause : KW_FROM joinSource -> ^( TOK_FROM joinSource ) ;
	public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
		HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_FROM12=null;
		ParserRuleReturnScope joinSource13 =null;

		CommonTree KW_FROM12_tree=null;
		RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
		RewriteRuleSubtreeStream stream_joinSource=new RewriteRuleSubtreeStream(adaptor,"rule joinSource");

		 gParent.pushMsg("from clause", state); 
		try {
			// FromClauseParser.g:85:5: ( KW_FROM joinSource -> ^( TOK_FROM joinSource ) )
			// FromClauseParser.g:86:5: KW_FROM joinSource
			{
			KW_FROM12=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause266); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM12);

			pushFollow(FOLLOW_joinSource_in_fromClause268);
			joinSource13=joinSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_joinSource.add(joinSource13.getTree());
			// AST REWRITE
			// elements: joinSource
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 86:24: -> ^( TOK_FROM joinSource )
			{
				// FromClauseParser.g:86:27: ^( TOK_FROM joinSource )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_FROM, "TOK_FROM"), root_1);
				adaptor.addChild(root_1, stream_joinSource.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromClause"


	public static class joinSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joinSource"
	// FromClauseParser.g:89:1: joinSource : ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression {...}?)? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ );
	public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
		HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ON17=null;
		Token COMMA21=null;
		ParserRuleReturnScope fromSource14 =null;
		ParserRuleReturnScope joinToken15 =null;
		ParserRuleReturnScope fromSource16 =null;
		ParserRuleReturnScope expression18 =null;
		ParserRuleReturnScope uniqueJoinToken19 =null;
		ParserRuleReturnScope uniqueJoinSource20 =null;
		ParserRuleReturnScope uniqueJoinSource22 =null;

		CommonTree KW_ON17_tree=null;
		CommonTree COMMA21_tree=null;

		 gParent.pushMsg("join source", state); 
		try {
			// FromClauseParser.g:92:5: ( fromSource ( joinToken ^ fromSource ( KW_ON ! expression {...}?)? )* | uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= Identifier && LA7_0 <= KW_ANALYZE)||(LA7_0 >= KW_ARCHIVE && LA7_0 <= KW_BY)||LA7_0==KW_CASCADE||LA7_0==KW_CHANGE||(LA7_0 >= KW_CLUSTER && LA7_0 <= KW_COLLECTION)||(LA7_0 >= KW_COLUMNS && LA7_0 <= KW_COMMENT)||(LA7_0 >= KW_COMPACT && LA7_0 <= KW_CONCATENATE)||(LA7_0 >= KW_CONSTRAINT && LA7_0 <= KW_CREATE)||LA7_0==KW_CUBE||(LA7_0 >= KW_CURRENT_DATE && LA7_0 <= KW_DATA)||(LA7_0 >= KW_DATABASES && LA7_0 <= KW_DISABLE)||(LA7_0 >= KW_DISTRIBUTE && LA7_0 <= KW_ELEM_TYPE)||LA7_0==KW_ENABLE||LA7_0==KW_ESCAPED||(LA7_0 >= KW_EXCLUSIVE && LA7_0 <= KW_EXPORT)||(LA7_0 >= KW_EXTERNAL && LA7_0 <= KW_FLOAT)||(LA7_0 >= KW_FOR && LA7_0 <= KW_FORMATTED)||LA7_0==KW_FULL||(LA7_0 >= KW_FUNCTIONS && LA7_0 <= KW_GROUPING)||(LA7_0 >= KW_HOUR && LA7_0 <= KW_IDXPROPERTIES)||(LA7_0 >= KW_IMPORT && LA7_0 <= KW_INTERSECT)||(LA7_0 >= KW_INTO && LA7_0 <= KW_JAR)||(LA7_0 >= KW_KEY && LA7_0 <= KW_LEFT)||(LA7_0 >= KW_LEVEL && LA7_0 <= KW_LONG)||(LA7_0 >= KW_MAPJOIN && LA7_0 <= KW_MONTH)||(LA7_0 >= KW_MSCK && LA7_0 <= KW_NOSCAN)||(LA7_0 >= KW_NOVALIDATE && LA7_0 <= KW_OFFSET)||LA7_0==KW_OPTION||(LA7_0 >= KW_ORDER && LA7_0 <= KW_OUTPUTFORMAT)||(LA7_0 >= KW_OVERWRITE && LA7_0 <= KW_OWNER)||(LA7_0 >= KW_PARTITION && LA7_0 <= KW_PLUS)||(LA7_0 >= KW_PRETTY && LA7_0 <= KW_RECORDWRITER)||(LA7_0 >= KW_REFERENCES && LA7_0 <= KW_ROLES)||(LA7_0 >= KW_ROLLUP && LA7_0 <= KW_SECOND)||(LA7_0 >= KW_SEMI && LA7_0 <= KW_SSL)||(LA7_0 >= KW_STATISTICS && LA7_0 <= KW_TABLES)||(LA7_0 >= KW_TBLPROPERTIES && LA7_0 <= KW_TERMINATED)||(LA7_0 >= KW_TIMESTAMP && LA7_0 <= KW_TRANSACTIONS)||(LA7_0 >= KW_TRIGGER && LA7_0 <= KW_UNARCHIVE)||(LA7_0 >= KW_UNDO && LA7_0 <= KW_UNIONTYPE)||(LA7_0 >= KW_UNLOCK && LA7_0 <= KW_VALUE_TYPE)||LA7_0==KW_VIEW||LA7_0==KW_WHILE||(LA7_0 >= KW_WITH && LA7_0 <= KW_YEAR)||LA7_0==LPAREN||LA7_0==KW_HOLD_DDLTIME||LA7_0==KW_IGNORE||LA7_0==KW_NO_DROP||LA7_0==KW_OFFLINE||LA7_0==KW_PROTECTION||LA7_0==KW_READONLY) ) {
				alt7=1;
			}
			else if ( (LA7_0==KW_UNIQUEJOIN) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// FromClauseParser.g:92:7: fromSource ( joinToken ^ fromSource ( KW_ON ! expression {...}?)? )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fromSource_in_joinSource303);
					fromSource14=fromSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource14.getTree());

					// FromClauseParser.g:92:18: ( joinToken ^ fromSource ( KW_ON ! expression {...}?)? )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA||LA5_0==KW_CROSS||LA5_0==KW_FULL||LA5_0==KW_INNER||LA5_0==KW_JOIN||LA5_0==KW_LEFT||LA5_0==KW_RIGHT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// FromClauseParser.g:92:20: joinToken ^ fromSource ( KW_ON ! expression {...}?)?
							{
							pushFollow(FOLLOW_joinToken_in_joinSource307);
							joinToken15=joinToken();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(joinToken15.getTree(), root_0);
							pushFollow(FOLLOW_fromSource_in_joinSource310);
							fromSource16=fromSource();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource16.getTree());

							// FromClauseParser.g:92:42: ( KW_ON ! expression {...}?)?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==KW_ON) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// FromClauseParser.g:92:44: KW_ON ! expression {...}?
									{
									KW_ON17=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource314); if (state.failed) return retval;
									pushFollow(FOLLOW_expression_in_joinSource317);
									expression18=gHiveParser.expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, expression18.getTree());

									if ( !(((joinToken15!=null?(joinToken15.start):null).getType() != COMMA)) ) {
										if (state.backtracking>0) {state.failed=true; return retval;}
										throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
									}
									}
									break;

							}

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:93:7: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_uniqueJoinToken_in_joinSource333);
					uniqueJoinToken19=uniqueJoinToken();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(uniqueJoinToken19.getTree(), root_0);
					pushFollow(FOLLOW_uniqueJoinSource_in_joinSource336);
					uniqueJoinSource20=uniqueJoinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource20.getTree());

					// FromClauseParser.g:93:41: ( COMMA ! uniqueJoinSource )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// FromClauseParser.g:93:42: COMMA ! uniqueJoinSource
							{
							COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinSource339); if (state.failed) return retval;
							pushFollow(FOLLOW_uniqueJoinSource_in_joinSource342);
							uniqueJoinSource22=uniqueJoinSource();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource22.getTree());

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinSource"


	public static class uniqueJoinSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinSource"
	// FromClauseParser.g:96:1: uniqueJoinSource : ( KW_PRESERVE )? fromSource uniqueJoinExpr ;
	public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_PRESERVE23=null;
		ParserRuleReturnScope fromSource24 =null;
		ParserRuleReturnScope uniqueJoinExpr25 =null;

		CommonTree KW_PRESERVE23_tree=null;

		 gParent.pushMsg("unique join source", state); 
		try {
			// FromClauseParser.g:99:5: ( ( KW_PRESERVE )? fromSource uniqueJoinExpr )
			// FromClauseParser.g:99:7: ( KW_PRESERVE )? fromSource uniqueJoinExpr
			{
			root_0 = (CommonTree)adaptor.nil();


			// FromClauseParser.g:99:7: ( KW_PRESERVE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==KW_PRESERVE) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// FromClauseParser.g:99:7: KW_PRESERVE
					{
					KW_PRESERVE23=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource371); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_PRESERVE23_tree = (CommonTree)adaptor.create(KW_PRESERVE23);
					adaptor.addChild(root_0, KW_PRESERVE23_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_fromSource_in_uniqueJoinSource374);
			fromSource24=fromSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource24.getTree());

			pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource376);
			uniqueJoinExpr25=uniqueJoinExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr25.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinSource"


	public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinExpr"
	// FromClauseParser.g:102:1: uniqueJoinExpr : LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) ;
	public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN26=null;
		Token COMMA27=null;
		Token RPAREN28=null;
		List<Object> list_e1=null;
		RuleReturnScope e1 = null;
		CommonTree LPAREN26_tree=null;
		CommonTree COMMA27_tree=null;
		CommonTree RPAREN28_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.pushMsg("unique join expression list", state); 
		try {
			// FromClauseParser.g:105:5: ( LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN -> ^( TOK_EXPLIST ( $e1)* ) )
			// FromClauseParser.g:105:7: LPAREN e1+= expression ( COMMA e1+= expression )* RPAREN
			{
			LPAREN26=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr403); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN26);

			pushFollow(FOLLOW_expression_in_uniqueJoinExpr407);
			e1=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
			if (list_e1==null) list_e1=new ArrayList<Object>();
			list_e1.add(e1.getTree());
			// FromClauseParser.g:105:29: ( COMMA e1+= expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// FromClauseParser.g:105:30: COMMA e1+= expression
					{
					COMMA27=(Token)match(input,COMMA,FOLLOW_COMMA_in_uniqueJoinExpr410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA27);

					pushFollow(FOLLOW_expression_in_uniqueJoinExpr414);
					e1=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
					if (list_e1==null) list_e1=new ArrayList<Object>();
					list_e1.add(e1.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN28=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr418); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN28);

			// AST REWRITE
			// elements: e1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: e1
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",list_e1);
			root_0 = (CommonTree)adaptor.nil();
			// 106:7: -> ^( TOK_EXPLIST ( $e1)* )
			{
				// FromClauseParser.g:106:10: ^( TOK_EXPLIST ( $e1)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				// FromClauseParser.g:106:25: ( $e1)*
				while ( stream_e1.hasNext() ) {
					adaptor.addChild(root_1, stream_e1.nextTree());
				}
				stream_e1.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinExpr"


	public static class uniqueJoinToken_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinToken"
	// FromClauseParser.g:109:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
	public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_UNIQUEJOIN29=null;

		CommonTree KW_UNIQUEJOIN29_tree=null;
		RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

		 gParent.pushMsg("unique join", state); 
		try {
			// FromClauseParser.g:112:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
			// FromClauseParser.g:112:7: KW_UNIQUEJOIN
			{
			KW_UNIQUEJOIN29=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken461); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN29);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 112:21: -> TOK_UNIQUEJOIN
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN"));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinToken"


	public static class joinToken_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "joinToken"
	// FromClauseParser.g:114:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN );
	public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
		HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_JOIN30=null;
		Token KW_INNER31=null;
		Token KW_JOIN32=null;
		Token COMMA33=null;
		Token KW_CROSS34=null;
		Token KW_JOIN35=null;
		Token KW_LEFT36=null;
		Token KW_OUTER37=null;
		Token KW_JOIN38=null;
		Token KW_RIGHT39=null;
		Token KW_OUTER40=null;
		Token KW_JOIN41=null;
		Token KW_FULL42=null;
		Token KW_OUTER43=null;
		Token KW_JOIN44=null;
		Token KW_LEFT45=null;
		Token KW_SEMI46=null;
		Token KW_JOIN47=null;

		CommonTree KW_JOIN30_tree=null;
		CommonTree KW_INNER31_tree=null;
		CommonTree KW_JOIN32_tree=null;
		CommonTree COMMA33_tree=null;
		CommonTree KW_CROSS34_tree=null;
		CommonTree KW_JOIN35_tree=null;
		CommonTree KW_LEFT36_tree=null;
		CommonTree KW_OUTER37_tree=null;
		CommonTree KW_JOIN38_tree=null;
		CommonTree KW_RIGHT39_tree=null;
		CommonTree KW_OUTER40_tree=null;
		CommonTree KW_JOIN41_tree=null;
		CommonTree KW_FULL42_tree=null;
		CommonTree KW_OUTER43_tree=null;
		CommonTree KW_JOIN44_tree=null;
		CommonTree KW_LEFT45_tree=null;
		CommonTree KW_SEMI46_tree=null;
		CommonTree KW_JOIN47_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
		RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
		RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");
		RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
		RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
		RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");

		 gParent.pushMsg("join type specifier", state); 
		try {
			// FromClauseParser.g:117:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN )
			int alt13=8;
			switch ( input.LA(1) ) {
			case KW_JOIN:
				{
				alt13=1;
				}
				break;
			case KW_INNER:
				{
				alt13=2;
				}
				break;
			case COMMA:
				{
				alt13=3;
				}
				break;
			case KW_CROSS:
				{
				alt13=4;
				}
				break;
			case KW_LEFT:
				{
				int LA13_5 = input.LA(2);
				if ( (LA13_5==KW_SEMI) ) {
					alt13=8;
				}
				else if ( (LA13_5==KW_JOIN||LA13_5==KW_OUTER) ) {
					alt13=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_RIGHT:
				{
				alt13=6;
				}
				break;
			case KW_FULL:
				{
				alt13=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// FromClauseParser.g:118:7: KW_JOIN
					{
					KW_JOIN30=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken493); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN30);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 118:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:119:7: KW_INNER KW_JOIN
					{
					KW_INNER31=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken526); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER31);

					KW_JOIN32=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken528); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN32);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 119:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:120:7: COMMA
					{
					COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinToken552); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA33);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:121:7: KW_CROSS KW_JOIN
					{
					KW_CROSS34=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS34);

					KW_JOIN35=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN35);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:36: -> TOK_CROSSJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:122:7: KW_LEFT ( KW_OUTER )? KW_JOIN
					{
					KW_LEFT36=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT36);

					// FromClauseParser.g:122:16: ( KW_OUTER )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==KW_OUTER) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// FromClauseParser.g:122:17: KW_OUTER
							{
							KW_OUTER37=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken617); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER37);

							}
							break;

					}

					KW_JOIN38=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN38);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 122:36: -> TOK_LEFTOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// FromClauseParser.g:123:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
					{
					KW_RIGHT39=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT39);

					// FromClauseParser.g:123:16: ( KW_OUTER )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==KW_OUTER) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// FromClauseParser.g:123:17: KW_OUTER
							{
							KW_OUTER40=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken636); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER40);

							}
							break;

					}

					KW_JOIN41=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken640); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN41);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 123:36: -> TOK_RIGHTOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// FromClauseParser.g:124:7: KW_FULL ( KW_OUTER )? KW_JOIN
					{
					KW_FULL42=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken652); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL42);

					// FromClauseParser.g:124:16: ( KW_OUTER )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==KW_OUTER) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// FromClauseParser.g:124:17: KW_OUTER
							{
							KW_OUTER43=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken656); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER43);

							}
							break;

					}

					KW_JOIN44=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken660); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN44);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 124:36: -> TOK_FULLOUTERJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// FromClauseParser.g:125:7: KW_LEFT KW_SEMI KW_JOIN
					{
					KW_LEFT45=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken672); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT45);

					KW_SEMI46=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken674); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI46);

					KW_JOIN47=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken676); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN47);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 125:36: -> TOK_LEFTSEMIJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinToken"


	public static class lateralView_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lateralView"
	// FromClauseParser.g:128:1: lateralView : ( ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) );
	public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
		HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_LATERAL48=null;
		Token KW_VIEW49=null;
		Token KW_OUTER50=null;
		Token KW_AS53=null;
		Token COMMA55=null;
		Token KW_LATERAL57=null;
		Token KW_VIEW58=null;
		Token KW_AS61=null;
		Token COMMA63=null;
		ParserRuleReturnScope function51 =null;
		ParserRuleReturnScope tableAlias52 =null;
		ParserRuleReturnScope identifier54 =null;
		ParserRuleReturnScope identifier56 =null;
		ParserRuleReturnScope function59 =null;
		ParserRuleReturnScope tableAlias60 =null;
		ParserRuleReturnScope identifier62 =null;
		ParserRuleReturnScope identifier64 =null;

		CommonTree KW_LATERAL48_tree=null;
		CommonTree KW_VIEW49_tree=null;
		CommonTree KW_OUTER50_tree=null;
		CommonTree KW_AS53_tree=null;
		CommonTree COMMA55_tree=null;
		CommonTree KW_LATERAL57_tree=null;
		CommonTree KW_VIEW58_tree=null;
		CommonTree KW_AS61_tree=null;
		CommonTree COMMA63_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");

		gParent.pushMsg("lateral view", state); 
		try {
			// FromClauseParser.g:131:2: ( ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_LATERAL) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==KW_VIEW) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==KW_OUTER) ) {
						int LA18_3 = input.LA(4);
						if ( (synpred1_FromClauseParser()) ) {
							alt18=1;
						}
						else if ( (true) ) {
							alt18=2;
						}

					}
					else if ( ((LA18_2 >= Identifier && LA18_2 <= KW_ANALYZE)||(LA18_2 >= KW_ARCHIVE && LA18_2 <= KW_BY)||LA18_2==KW_CASCADE||LA18_2==KW_CHANGE||(LA18_2 >= KW_CLUSTER && LA18_2 <= KW_COLLECTION)||(LA18_2 >= KW_COLUMNS && LA18_2 <= KW_COMMENT)||(LA18_2 >= KW_COMPACT && LA18_2 <= KW_CONCATENATE)||(LA18_2 >= KW_CONSTRAINT && LA18_2 <= KW_CREATE)||LA18_2==KW_CUBE||(LA18_2 >= KW_CURRENT_DATE && LA18_2 <= KW_DATA)||(LA18_2 >= KW_DATABASES && LA18_2 <= KW_DISABLE)||(LA18_2 >= KW_DISTRIBUTE && LA18_2 <= KW_ELEM_TYPE)||LA18_2==KW_ENABLE||LA18_2==KW_ESCAPED||(LA18_2 >= KW_EXCLUSIVE && LA18_2 <= KW_EXPORT)||(LA18_2 >= KW_EXTERNAL && LA18_2 <= KW_FLOAT)||(LA18_2 >= KW_FOR && LA18_2 <= KW_FORMATTED)||LA18_2==KW_FULL||(LA18_2 >= KW_FUNCTIONS && LA18_2 <= KW_GROUPING)||(LA18_2 >= KW_HOUR && LA18_2 <= KW_INTERSECT)||(LA18_2 >= KW_INTO && LA18_2 <= KW_JAR)||(LA18_2 >= KW_KEY && LA18_2 <= KW_LEFT)||(LA18_2 >= KW_LEVEL && LA18_2 <= KW_LONG)||(LA18_2 >= KW_MAP && LA18_2 <= KW_MONTH)||(LA18_2 >= KW_MSCK && LA18_2 <= KW_NOSCAN)||(LA18_2 >= KW_NOVALIDATE && LA18_2 <= KW_OFFSET)||LA18_2==KW_OPTION||(LA18_2 >= KW_ORDER && LA18_2 <= KW_OUT)||(LA18_2 >= KW_OUTPUTDRIVER && LA18_2 <= KW_OUTPUTFORMAT)||(LA18_2 >= KW_OVERWRITE && LA18_2 <= KW_OWNER)||(LA18_2 >= KW_PARTITION && LA18_2 <= KW_PLUS)||(LA18_2 >= KW_PRETTY && LA18_2 <= KW_RECORDWRITER)||(LA18_2 >= KW_REFERENCES && LA18_2 <= KW_ROLES)||(LA18_2 >= KW_ROLLUP && LA18_2 <= KW_SECOND)||(LA18_2 >= KW_SEMI && LA18_2 <= KW_SSL)||(LA18_2 >= KW_STATISTICS && LA18_2 <= KW_TABLES)||(LA18_2 >= KW_TBLPROPERTIES && LA18_2 <= KW_TERMINATED)||(LA18_2 >= KW_TIMESTAMP && LA18_2 <= KW_TRANSACTIONS)||(LA18_2 >= KW_TRIGGER && LA18_2 <= KW_UNARCHIVE)||(LA18_2 >= KW_UNDO && LA18_2 <= KW_UNIONTYPE)||(LA18_2 >= KW_UNLOCK && LA18_2 <= KW_VALUE_TYPE)||LA18_2==KW_VIEW||LA18_2==KW_WHILE||(LA18_2 >= KW_WITH && LA18_2 <= KW_YEAR)||LA18_2==KW_HOLD_DDLTIME||LA18_2==KW_IGNORE||LA18_2==KW_NO_DROP||LA18_2==KW_OFFLINE||LA18_2==KW_PROTECTION||LA18_2==KW_READONLY) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// FromClauseParser.g:132:2: ( KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					{
					KW_LATERAL48=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView720); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL48);

					KW_VIEW49=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView722); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW49);

					KW_OUTER50=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView724); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER50);

					pushFollow(FOLLOW_function_in_lateralView726);
					function51=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function51.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView728);
					tableAlias52=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias52.getTree());
					// FromClauseParser.g:132:83: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==KW_AS) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// FromClauseParser.g:132:84: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
							{
							KW_AS53=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView731); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS53);

							pushFollow(FOLLOW_identifier_in_lateralView733);
							identifier54=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier54.getTree());
							// FromClauseParser.g:132:101: ( ( COMMA )=> COMMA identifier )*
							loop14:
							while (true) {
								int alt14=2;
								alt14 = dfa14.predict(input);
								switch (alt14) {
								case 1 :
									// FromClauseParser.g:132:102: ( COMMA )=> COMMA identifier
									{
									COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView741); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

									pushFollow(FOLLOW_identifier_in_lateralView743);
									identifier56=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier56.getTree());
									}
									break;

								default :
									break loop14;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: identifier, function, tableAlias
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 133:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:133:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER"), root_1);
						// FromClauseParser.g:133:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:133:43: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:133:66: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:135:2: KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					{
					KW_LATERAL57=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView775); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL57);

					KW_VIEW58=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView777); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW58);

					pushFollow(FOLLOW_function_in_lateralView779);
					function59=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function59.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView781);
					tableAlias60=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias60.getTree());
					// FromClauseParser.g:135:41: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==KW_AS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// FromClauseParser.g:135:42: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
							{
							KW_AS61=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView784); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS61);

							pushFollow(FOLLOW_identifier_in_lateralView786);
							identifier62=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier62.getTree());
							// FromClauseParser.g:135:59: ( ( COMMA )=> COMMA identifier )*
							loop16:
							while (true) {
								int alt16=2;
								alt16 = dfa16.predict(input);
								switch (alt16) {
								case 1 :
									// FromClauseParser.g:135:60: ( COMMA )=> COMMA identifier
									{
									COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView794); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA63);

									pushFollow(FOLLOW_identifier_in_lateralView796);
									identifier64=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier64.getTree());
									}
									break;

								default :
									break loop16;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: tableAlias, function, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 136:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:136:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW"), root_1);
						// FromClauseParser.g:136:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:136:37: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:136:60: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lateralView"


	public static class tableAlias_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableAlias"
	// FromClauseParser.g:139:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
	public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
		HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier65 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		gParent.pushMsg("table alias", state); 
		try {
			// FromClauseParser.g:142:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
			// FromClauseParser.g:143:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableAlias850);
			identifier65=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier65.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:16: -> ^( TOK_TABALIAS identifier )
			{
				// FromClauseParser.g:143:19: ^( TOK_TABALIAS identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableAlias"


	public static class fromSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fromSource"
	// FromClauseParser.g:146:1: fromSource : ( ( LPAREN KW_VALUES )=> fromSource0 | ( LPAREN )=> LPAREN joinSource RPAREN -> joinSource | fromSource0 );
	public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
		HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN67=null;
		Token RPAREN69=null;
		ParserRuleReturnScope fromSource066 =null;
		ParserRuleReturnScope joinSource68 =null;
		ParserRuleReturnScope fromSource070 =null;

		CommonTree LPAREN67_tree=null;
		CommonTree RPAREN69_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_joinSource=new RewriteRuleSubtreeStream(adaptor,"rule joinSource");

		 gParent.pushMsg("from source", state); 
		try {
			// FromClauseParser.g:149:5: ( ( LPAREN KW_VALUES )=> fromSource0 | ( LPAREN )=> LPAREN joinSource RPAREN -> joinSource | fromSource0 )
			int alt19=3;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// FromClauseParser.g:150:5: ( LPAREN KW_VALUES )=> fromSource0
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fromSource0_in_fromSource897);
					fromSource066=fromSource0();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource066.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:151:7: ( LPAREN )=> LPAREN joinSource RPAREN
					{
					LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fromSource911); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN67);

					pushFollow(FOLLOW_joinSource_in_fromSource913);
					joinSource68=joinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_joinSource.add(joinSource68.getTree());
					RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fromSource915); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN69);

					// AST REWRITE
					// elements: joinSource
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 151:44: -> joinSource
					{
						adaptor.addChild(root_0, stream_joinSource.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:152:7: fromSource0
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fromSource0_in_fromSource927);
					fromSource070=fromSource0();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fromSource070.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromSource"


	public static class fromSource0_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fromSource0"
	// FromClauseParser.g:156:1: fromSource0 : ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource | virtualTableSource ) ( lateralView ^)* ;
	public final HiveParser_FromClauseParser.fromSource0_return fromSource0() throws RecognitionException {
		HiveParser_FromClauseParser.fromSource0_return retval = new HiveParser_FromClauseParser.fromSource0_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope partitionedTableFunction71 =null;
		ParserRuleReturnScope tableSource72 =null;
		ParserRuleReturnScope subQuerySource73 =null;
		ParserRuleReturnScope virtualTableSource74 =null;
		ParserRuleReturnScope lateralView75 =null;


		 gParent.pushMsg("from source 0", state); 
		try {
			// FromClauseParser.g:159:5: ( ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource | virtualTableSource ) ( lateralView ^)* )
			// FromClauseParser.g:160:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource | virtualTableSource ) ( lateralView ^)*
			{
			root_0 = (CommonTree)adaptor.nil();


			// FromClauseParser.g:160:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource | virtualTableSource )
			int alt20=4;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// FromClauseParser.g:160:6: ( Identifier LPAREN )=> partitionedTableFunction
					{
					pushFollow(FOLLOW_partitionedTableFunction_in_fromSource0967);
					partitionedTableFunction71=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction71.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:160:55: tableSource
					{
					pushFollow(FOLLOW_tableSource_in_fromSource0971);
					tableSource72=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource72.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:160:69: subQuerySource
					{
					pushFollow(FOLLOW_subQuerySource_in_fromSource0975);
					subQuerySource73=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource73.getTree());

					}
					break;
				case 4 :
					// FromClauseParser.g:160:86: virtualTableSource
					{
					pushFollow(FOLLOW_virtualTableSource_in_fromSource0979);
					virtualTableSource74=virtualTableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource74.getTree());

					}
					break;

			}

			// FromClauseParser.g:160:106: ( lateralView ^)*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==KW_LATERAL) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// FromClauseParser.g:160:107: lateralView ^
					{
					pushFollow(FOLLOW_lateralView_in_fromSource0983);
					lateralView75=lateralView();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(lateralView75.getTree(), root_0);
					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromSource0"


	public static class tableBucketSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableBucketSample"
	// FromClauseParser.g:163:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
	public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token numerator=null;
		Token denominator=null;
		Token KW_TABLESAMPLE76=null;
		Token LPAREN77=null;
		Token KW_BUCKET78=null;
		Token KW_OUT79=null;
		Token KW_OF80=null;
		Token KW_ON81=null;
		Token COMMA82=null;
		Token RPAREN83=null;
		List<Object> list_expr=null;
		RuleReturnScope expr = null;
		CommonTree numerator_tree=null;
		CommonTree denominator_tree=null;
		CommonTree KW_TABLESAMPLE76_tree=null;
		CommonTree LPAREN77_tree=null;
		CommonTree KW_BUCKET78_tree=null;
		CommonTree KW_OUT79_tree=null;
		CommonTree KW_OF80_tree=null;
		CommonTree KW_ON81_tree=null;
		CommonTree COMMA82_tree=null;
		CommonTree RPAREN83_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.pushMsg("table bucket sample specification", state); 
		try {
			// FromClauseParser.g:166:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
			// FromClauseParser.g:167:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
			{
			KW_TABLESAMPLE76=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE76);

			LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample1019); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN77);

			KW_BUCKET78=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample1021); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET78);

			// FromClauseParser.g:167:37: (numerator= Number )
			// FromClauseParser.g:167:38: numerator= Number
			{
			numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1026); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(numerator);

			}

			KW_OUT79=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample1029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT79);

			KW_OF80=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample1031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF80);

			// FromClauseParser.g:167:69: (denominator= Number )
			// FromClauseParser.g:167:70: denominator= Number
			{
			denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1036); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(denominator);

			}

			// FromClauseParser.g:167:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==KW_ON) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// FromClauseParser.g:167:91: KW_ON expr+= expression ( COMMA expr+= expression )*
					{
					KW_ON81=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample1040); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON81);

					pushFollow(FOLLOW_expression_in_tableBucketSample1044);
					expr=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
					if (list_expr==null) list_expr=new ArrayList<Object>();
					list_expr.add(expr.getTree());
					// FromClauseParser.g:167:114: ( COMMA expr+= expression )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==COMMA) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// FromClauseParser.g:167:115: COMMA expr+= expression
							{
							COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample1047); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);

							pushFollow(FOLLOW_expression_in_tableBucketSample1051);
							expr=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
							if (list_expr==null) list_expr=new ArrayList<Object>();
							list_expr.add(expr.getTree());
							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;

			}

			RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample1057); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN83);

			// AST REWRITE
			// elements: numerator, expr, denominator
			// token labels: numerator, denominator
			// rule labels: retval
			// token list labels: 
			// rule list labels: expr
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
			RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
			root_0 = (CommonTree)adaptor.nil();
			// 167:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
			{
				// FromClauseParser.g:167:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE"), root_1);
				adaptor.addChild(root_1, stream_numerator.nextNode());
				adaptor.addChild(root_1, stream_denominator.nextNode());
				// FromClauseParser.g:167:201: ( $expr)*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableBucketSample"


	public static class splitSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "splitSample"
	// FromClauseParser.g:170:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
	public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
		HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token numerator=null;
		Token percent=null;
		Token KW_TABLESAMPLE84=null;
		Token LPAREN85=null;
		Token KW_ROWS86=null;
		Token RPAREN87=null;
		Token KW_TABLESAMPLE88=null;
		Token LPAREN89=null;
		Token RPAREN90=null;

		CommonTree numerator_tree=null;
		CommonTree percent_tree=null;
		CommonTree KW_TABLESAMPLE84_tree=null;
		CommonTree LPAREN85_tree=null;
		CommonTree KW_ROWS86_tree=null;
		CommonTree RPAREN87_tree=null;
		CommonTree KW_TABLESAMPLE88_tree=null;
		CommonTree LPAREN89_tree=null;
		CommonTree RPAREN90_tree=null;
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");

		 gParent.pushMsg("table split sample specification", state); 
		try {
			// FromClauseParser.g:173:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==KW_TABLESAMPLE) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==LPAREN) ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2==Number) ) {
						alt25=1;
					}
					else if ( (LA25_2==ByteLengthLiteral) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// FromClauseParser.g:174:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
					{
					KW_TABLESAMPLE84=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1104); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE84);

					LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1106); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN85);

					// FromClauseParser.g:174:28: (numerator= Number )
					// FromClauseParser.g:174:29: numerator= Number
					{
					numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample1112); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(numerator);

					}

					// FromClauseParser.g:174:47: (percent= KW_PERCENT | KW_ROWS )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==KW_PERCENT) ) {
						alt24=1;
					}
					else if ( (LA24_0==KW_ROWS) ) {
						alt24=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// FromClauseParser.g:174:48: percent= KW_PERCENT
							{
							percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample1118); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);

							}
							break;
						case 2 :
							// FromClauseParser.g:174:67: KW_ROWS
							{
							KW_ROWS86=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample1120); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS86);

							}
							break;

					}

					RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN87);

					// AST REWRITE
					// elements: numerator, numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 175:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
					if (percent != null) {
						// FromClauseParser.g:175:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_PERCENT, "TOK_PERCENT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 176:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
					{
						// FromClauseParser.g:176:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:178:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
					{
					KW_TABLESAMPLE88=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE88);

					LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1169); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);

					// FromClauseParser.g:178:28: (numerator= ByteLengthLiteral )
					// FromClauseParser.g:178:29: numerator= ByteLengthLiteral
					{
					numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1175); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);

					}

					RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN90);

					// AST REWRITE
					// elements: numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 179:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
					{
						// FromClauseParser.g:179:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TOK_LENGTH, "TOK_LENGTH"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "splitSample"


	public static class tableSample_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableSample"
	// FromClauseParser.g:182:1: tableSample : ( tableBucketSample | splitSample );
	public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope tableBucketSample91 =null;
		ParserRuleReturnScope splitSample92 =null;


		 gParent.pushMsg("table sample specification", state); 
		try {
			// FromClauseParser.g:185:5: ( tableBucketSample | splitSample )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==KW_TABLESAMPLE) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==LPAREN) ) {
					int LA26_2 = input.LA(3);
					if ( (LA26_2==KW_BUCKET) ) {
						alt26=1;
					}
					else if ( (LA26_2==ByteLengthLiteral||LA26_2==Number) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// FromClauseParser.g:186:5: tableBucketSample
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableBucketSample_in_tableSample1224);
					tableBucketSample91=tableBucketSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample91.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:187:5: splitSample
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_splitSample_in_tableSample1232);
					splitSample92=splitSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample92.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableSample"


	public static class tableSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableSource"
	// FromClauseParser.g:190:1: tableSource : tabname= tableName ( ( tableProperties )=>props= tableProperties )? ( ( tableSample )=>ts= tableSample )? ( ( KW_AS )=> ( KW_AS alias= identifier ) | ( identifier )=> (alias= identifier ) )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) ;
	public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
		HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS93=null;
		ParserRuleReturnScope tabname =null;
		ParserRuleReturnScope props =null;
		ParserRuleReturnScope ts =null;
		ParserRuleReturnScope alias =null;

		CommonTree KW_AS93_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		 gParent.pushMsg("table source", state); 
		try {
			// FromClauseParser.g:193:5: (tabname= tableName ( ( tableProperties )=>props= tableProperties )? ( ( tableSample )=>ts= tableSample )? ( ( KW_AS )=> ( KW_AS alias= identifier ) | ( identifier )=> (alias= identifier ) )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) )
			// FromClauseParser.g:193:7: tabname= tableName ( ( tableProperties )=>props= tableProperties )? ( ( tableSample )=>ts= tableSample )? ( ( KW_AS )=> ( KW_AS alias= identifier ) | ( identifier )=> (alias= identifier ) )?
			{
			pushFollow(FOLLOW_tableName_in_tableSource1261);
			tabname=tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());
			// FromClauseParser.g:194:5: ( ( tableProperties )=>props= tableProperties )?
			int alt27=2;
			alt27 = dfa27.predict(input);
			switch (alt27) {
				case 1 :
					// FromClauseParser.g:194:6: ( tableProperties )=>props= tableProperties
					{
					pushFollow(FOLLOW_tableProperties_in_tableSource1277);
					props=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());
					}
					break;

			}

			// FromClauseParser.g:195:5: ( ( tableSample )=>ts= tableSample )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==KW_TABLESAMPLE) && (synpred8_FromClauseParser())) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// FromClauseParser.g:195:6: ( tableSample )=>ts= tableSample
					{
					pushFollow(FOLLOW_tableSample_in_tableSource1294);
					ts=tableSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());
					}
					break;

			}

			// FromClauseParser.g:196:5: ( ( KW_AS )=> ( KW_AS alias= identifier ) | ( identifier )=> (alias= identifier ) )?
			int alt29=3;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// FromClauseParser.g:196:6: ( KW_AS )=> ( KW_AS alias= identifier )
					{
					// FromClauseParser.g:196:17: ( KW_AS alias= identifier )
					// FromClauseParser.g:196:18: KW_AS alias= identifier
					{
					KW_AS93=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1311); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS93);

					pushFollow(FOLLOW_identifier_in_tableSource1315);
					alias=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:198:5: ( identifier )=> (alias= identifier )
					{
					// FromClauseParser.g:198:21: (alias= identifier )
					// FromClauseParser.g:198:22: alias= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableSource1338);
					alias=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());
					}

					}
					break;

			}

			// AST REWRITE
			// elements: props, alias, tabname, ts
			// token labels: 
			// rule labels: tabname, alias, retval, props, ts
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.getTree():null);
			RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.getTree():null);
			RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 199:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
			{
				// FromClauseParser.g:199:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABREF, "TOK_TABREF"), root_1);
				adaptor.addChild(root_1, stream_tabname.nextTree());
				// FromClauseParser.g:199:31: ( $props)?
				if ( stream_props.hasNext() ) {
					adaptor.addChild(root_1, stream_props.nextTree());
				}
				stream_props.reset();

				// FromClauseParser.g:199:39: ( $ts)?
				if ( stream_ts.hasNext() ) {
					adaptor.addChild(root_1, stream_ts.nextTree());
				}
				stream_ts.reset();

				// FromClauseParser.g:199:44: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextTree());
				}
				stream_alias.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableSource"


	public static class tableName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableName"
	// FromClauseParser.g:202:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );
	public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
		HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOT94=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope tab =null;

		CommonTree DOT94_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("table name", state); 
		try {
			// FromClauseParser.g:205:5: (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) )
			int alt30=2;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// FromClauseParser.g:206:5: db= identifier DOT tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1399);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1401); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT94);

					pushFollow(FOLLOW_identifier_in_tableName1405);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: db, tab
					// token labels: 
					// rule labels: tab, db, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);
					RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 207:5: -> ^( TOK_TABNAME $db $tab)
					{
						// FromClauseParser.g:207:8: ^( TOK_TABNAME $db $tab)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_db.nextTree());
						adaptor.addChild(root_1, stream_tab.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:209:5: tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1435);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: tab
					// token labels: 
					// rule labels: tab, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 210:5: -> ^( TOK_TABNAME $tab)
					{
						// FromClauseParser.g:210:8: ^( TOK_TABNAME $tab)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_tab.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableName"


	public static class viewName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "viewName"
	// FromClauseParser.g:213:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
	public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
		HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOT95=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope view =null;

		CommonTree DOT95_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("view name", state); 
		try {
			// FromClauseParser.g:216:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
			// FromClauseParser.g:217:5: (db= identifier DOT )? view= identifier
			{
			// FromClauseParser.g:217:5: (db= identifier DOT )?
			int alt31=2;
			switch ( input.LA(1) ) {
				case Identifier:
					{
					int LA31_1 = input.LA(2);
					if ( (LA31_1==DOT) ) {
						alt31=1;
					}
					}
					break;
				case KW_ABORT:
				case KW_ADD:
				case KW_ADMIN:
				case KW_AFTER:
				case KW_ANALYZE:
				case KW_ARCHIVE:
				case KW_ASC:
				case KW_AUTOCOMMIT:
				case KW_BEFORE:
				case KW_BUCKET:
				case KW_BUCKETS:
				case KW_CASCADE:
				case KW_CHANGE:
				case KW_CLUSTER:
				case KW_CLUSTERED:
				case KW_CLUSTERSTATUS:
				case KW_COLLECTION:
				case KW_COLUMNS:
				case KW_COMMENT:
				case KW_COMPACT:
				case KW_COMPACTIONS:
				case KW_COMPUTE:
				case KW_CONCATENATE:
				case KW_CONTINUE:
				case KW_DATA:
				case KW_DATABASES:
				case KW_DATETIME:
				case KW_DAY:
				case KW_DBPROPERTIES:
				case KW_DEFERRED:
				case KW_DEFINED:
				case KW_DELIMITED:
				case KW_DEPENDENCY:
				case KW_DESC:
				case KW_DIRECTORIES:
				case KW_DIRECTORY:
				case KW_DISABLE:
				case KW_DISTRIBUTE:
				case KW_ELEM_TYPE:
				case KW_ENABLE:
				case KW_ESCAPED:
				case KW_EXCLUSIVE:
				case KW_EXPLAIN:
				case KW_EXPORT:
				case KW_FIELDS:
				case KW_FILE:
				case KW_FILEFORMAT:
				case KW_FIRST:
				case KW_FORMAT:
				case KW_FORMATTED:
				case KW_FUNCTIONS:
				case KW_HOUR:
				case KW_IDXPROPERTIES:
				case KW_INDEX:
				case KW_INDEXES:
				case KW_INPATH:
				case KW_INPUTDRIVER:
				case KW_INPUTFORMAT:
				case KW_ISOLATION:
				case KW_ITEMS:
				case KW_JAR:
				case KW_KEY:
				case KW_KEYS:
				case KW_KEY_TYPE:
				case KW_LAST:
				case KW_LEVEL:
				case KW_LIMIT:
				case KW_LINES:
				case KW_LOAD:
				case KW_LOCATION:
				case KW_LOCK:
				case KW_LOCKS:
				case KW_LOGICAL:
				case KW_LONG:
				case KW_MAPJOIN:
				case KW_MATERIALIZED:
				case KW_METADATA:
				case KW_MINUS:
				case KW_MINUTE:
				case KW_MONTH:
				case KW_MSCK:
				case KW_NORELY:
				case KW_NOSCAN:
				case KW_NOVALIDATE:
				case KW_NULLS:
				case KW_OFFSET:
				case KW_OPTION:
				case KW_OUTPUTDRIVER:
				case KW_OUTPUTFORMAT:
				case KW_OVERWRITE:
				case KW_OWNER:
				case KW_PARTITIONED:
				case KW_PARTITIONS:
				case KW_PLUS:
				case KW_PRETTY:
				case KW_PRINCIPALS:
				case KW_PURGE:
				case KW_READ:
				case KW_REBUILD:
				case KW_RECORDREADER:
				case KW_RECORDWRITER:
				case KW_RELOAD:
				case KW_RELY:
				case KW_RENAME:
				case KW_REPAIR:
				case KW_REPLACE:
				case KW_REPLICATION:
				case KW_RESTRICT:
				case KW_REWRITE:
				case KW_ROLE:
				case KW_ROLES:
				case KW_SCHEMA:
				case KW_SCHEMAS:
				case KW_SECOND:
				case KW_SEMI:
				case KW_SERDE:
				case KW_SERDEPROPERTIES:
				case KW_SERVER:
				case KW_SETS:
				case KW_SHARED:
				case KW_SHOW:
				case KW_SHOW_DATABASE:
				case KW_SKEWED:
				case KW_SNAPSHOT:
				case KW_SORT:
				case KW_SORTED:
				case KW_SSL:
				case KW_STATISTICS:
				case KW_STORED:
				case KW_STREAMTABLE:
				case KW_STRING:
				case KW_STRUCT:
				case KW_TABLES:
				case KW_TBLPROPERTIES:
				case KW_TEMPORARY:
				case KW_TERMINATED:
				case KW_TINYINT:
				case KW_TOUCH:
				case KW_TRANSACTION:
				case KW_TRANSACTIONS:
				case KW_UNARCHIVE:
				case KW_UNDO:
				case KW_UNIONTYPE:
				case KW_UNLOCK:
				case KW_UNSET:
				case KW_UNSIGNED:
				case KW_URI:
				case KW_USE:
				case KW_UTC:
				case KW_UTCTIMESTAMP:
				case KW_VALIDATE:
				case KW_VALUE_TYPE:
				case KW_VIEW:
				case KW_WHILE:
				case KW_WORK:
				case KW_WRITE:
				case KW_YEAR:
				case KW_HOLD_DDLTIME:
				case KW_IGNORE:
				case KW_NO_DROP:
				case KW_OFFLINE:
				case KW_PROTECTION:
				case KW_READONLY:
					{
					int LA31_2 = input.LA(2);
					if ( (LA31_2==DOT) ) {
						alt31=1;
					}
					}
					break;
				case KW_ALL:
				case KW_ALTER:
				case KW_ARRAY:
				case KW_AS:
				case KW_AUTHORIZATION:
				case KW_BETWEEN:
				case KW_BIGINT:
				case KW_BINARY:
				case KW_BOOLEAN:
				case KW_BOTH:
				case KW_BY:
				case KW_CONSTRAINT:
				case KW_CREATE:
				case KW_CUBE:
				case KW_CURRENT_DATE:
				case KW_CURRENT_TIMESTAMP:
				case KW_CURSOR:
				case KW_DATE:
				case KW_DECIMAL:
				case KW_DELETE:
				case KW_DESCRIBE:
				case KW_DOUBLE:
				case KW_DROP:
				case KW_EXISTS:
				case KW_EXTERNAL:
				case KW_FALSE:
				case KW_FETCH:
				case KW_FLOAT:
				case KW_FOR:
				case KW_FOREIGN:
				case KW_FULL:
				case KW_GRANT:
				case KW_GROUP:
				case KW_GROUPING:
				case KW_IMPORT:
				case KW_IN:
				case KW_INNER:
				case KW_INSERT:
				case KW_INT:
				case KW_INTERSECT:
				case KW_INTO:
				case KW_IS:
				case KW_LATERAL:
				case KW_LEFT:
				case KW_LIKE:
				case KW_LOCAL:
				case KW_NONE:
				case KW_NULL:
				case KW_OF:
				case KW_ORDER:
				case KW_OUT:
				case KW_OUTER:
				case KW_PARTITION:
				case KW_PERCENT:
				case KW_PRIMARY:
				case KW_PROCEDURE:
				case KW_RANGE:
				case KW_READS:
				case KW_REFERENCES:
				case KW_REGEXP:
				case KW_REVOKE:
				case KW_RIGHT:
				case KW_RLIKE:
				case KW_ROLLUP:
				case KW_ROW:
				case KW_ROWS:
				case KW_SET:
				case KW_SMALLINT:
				case KW_TABLE:
				case KW_TIMESTAMP:
				case KW_TO:
				case KW_TRIGGER:
				case KW_TRUE:
				case KW_TRUNCATE:
				case KW_UNION:
				case KW_UPDATE:
				case KW_USER:
				case KW_USING:
				case KW_VALUES:
				case KW_WITH:
					{
					int LA31_3 = input.LA(2);
					if ( (LA31_3==DOT) ) {
						alt31=1;
					}
					}
					break;
			}
			switch (alt31) {
				case 1 :
					// FromClauseParser.g:217:6: db= identifier DOT
					{
					pushFollow(FOLLOW_identifier_in_viewName1482);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT95=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1484); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT95);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_viewName1490);
			view=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(view.getTree());
			// AST REWRITE
			// elements: db, view
			// token labels: 
			// rule labels: view, db, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.getTree():null);
			RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 218:5: -> ^( TOK_TABNAME ( $db)? $view)
			{
				// FromClauseParser.g:218:8: ^( TOK_TABNAME ( $db)? $view)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
				// FromClauseParser.g:218:23: ( $db)?
				if ( stream_db.hasNext() ) {
					adaptor.addChild(root_1, stream_db.nextTree());
				}
				stream_db.reset();

				adaptor.addChild(root_1, stream_view.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "viewName"


	public static class subQuerySource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subQuerySource"
	// FromClauseParser.g:221:1: subQuerySource : LPAREN queryStatementExpression[false] RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
	public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
		HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN96=null;
		Token RPAREN98=null;
		Token KW_AS99=null;
		ParserRuleReturnScope queryStatementExpression97 =null;
		ParserRuleReturnScope identifier100 =null;

		CommonTree LPAREN96_tree=null;
		CommonTree RPAREN98_tree=null;
		CommonTree KW_AS99_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");

		 gParent.pushMsg("subquery source", state); 
		try {
			// FromClauseParser.g:224:5: ( LPAREN queryStatementExpression[false] RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
			// FromClauseParser.g:225:5: LPAREN queryStatementExpression[false] RPAREN ( KW_AS )? identifier
			{
			LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1538); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN96);

			pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1540);
			queryStatementExpression97=gHiveParser.queryStatementExpression(false);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression97.getTree());
			RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1543); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN98);

			// FromClauseParser.g:225:51: ( KW_AS )?
			int alt32=2;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// FromClauseParser.g:225:51: KW_AS
					{
					KW_AS99=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_subQuerySource1545); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS99);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_subQuerySource1548);
			identifier100=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier100.getTree());
			// AST REWRITE
			// elements: identifier, queryStatementExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 225:69: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
			{
				// FromClauseParser.g:225:72: ^( TOK_SUBQUERY queryStatementExpression identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_1);
				adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subQuerySource"


	public static class partitioningSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitioningSpec"
	// FromClauseParser.g:229:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
	public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
		HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope partitionByClause101 =null;
		ParserRuleReturnScope orderByClause102 =null;
		ParserRuleReturnScope orderByClause103 =null;
		ParserRuleReturnScope distributeByClause104 =null;
		ParserRuleReturnScope sortByClause105 =null;
		ParserRuleReturnScope sortByClause106 =null;
		ParserRuleReturnScope clusterByClause107 =null;

		RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
		RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
		RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
		RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
		RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");

		 gParent.pushMsg("partitioningSpec clause", state); 
		try {
			// FromClauseParser.g:232:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
			int alt35=5;
			switch ( input.LA(1) ) {
			case KW_PARTITION:
				{
				alt35=1;
				}
				break;
			case KW_ORDER:
				{
				alt35=2;
				}
				break;
			case KW_DISTRIBUTE:
				{
				alt35=3;
				}
				break;
			case KW_SORT:
				{
				alt35=4;
				}
				break;
			case KW_CLUSTER:
				{
				alt35=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// FromClauseParser.g:233:4: partitionByClause ( orderByClause )?
					{
					pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1589);
					partitionByClause101=gHiveParser.partitionByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause101.getTree());
					// FromClauseParser.g:233:22: ( orderByClause )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==KW_ORDER) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// FromClauseParser.g:233:22: orderByClause
							{
							pushFollow(FOLLOW_orderByClause_in_partitioningSpec1591);
							orderByClause102=gHiveParser.orderByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause102.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: partitionByClause, orderByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 233:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
					{
						// FromClauseParser.g:233:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_partitionByClause.nextTree());
						// FromClauseParser.g:233:81: ( orderByClause )?
						if ( stream_orderByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_orderByClause.nextTree());
						}
						stream_orderByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:234:4: orderByClause
					{
					pushFollow(FOLLOW_orderByClause_in_partitioningSpec1610);
					orderByClause103=gHiveParser.orderByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause103.getTree());
					// AST REWRITE
					// elements: orderByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 234:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
					{
						// FromClauseParser.g:234:21: ^( TOK_PARTITIONINGSPEC orderByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_orderByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:235:4: distributeByClause ( sortByClause )?
					{
					pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1625);
					distributeByClause104=gHiveParser.distributeByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause104.getTree());
					// FromClauseParser.g:235:23: ( sortByClause )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==KW_SORT) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// FromClauseParser.g:235:23: sortByClause
							{
							pushFollow(FOLLOW_sortByClause_in_partitioningSpec1627);
							sortByClause105=gHiveParser.sortByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause105.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: distributeByClause, sortByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 235:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
					{
						// FromClauseParser.g:235:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_distributeByClause.nextTree());
						// FromClauseParser.g:235:82: ( sortByClause )?
						if ( stream_sortByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_sortByClause.nextTree());
						}
						stream_sortByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:236:4: sortByClause
					{
					pushFollow(FOLLOW_sortByClause_in_partitioningSpec1646);
					sortByClause106=gHiveParser.sortByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause106.getTree());
					// AST REWRITE
					// elements: sortByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 236:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
					{
						// FromClauseParser.g:236:20: ^( TOK_PARTITIONINGSPEC sortByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_sortByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:237:4: clusterByClause
					{
					pushFollow(FOLLOW_clusterByClause_in_partitioningSpec1661);
					clusterByClause107=gHiveParser.clusterByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause107.getTree());
					// AST REWRITE
					// elements: clusterByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 237:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
					{
						// FromClauseParser.g:237:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_clusterByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitioningSpec"


	public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionTableFunctionSource"
	// FromClauseParser.g:240:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
	public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
		HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope subQuerySource108 =null;
		ParserRuleReturnScope tableSource109 =null;
		ParserRuleReturnScope partitionedTableFunction110 =null;


		 gParent.pushMsg("partitionTableFunctionSource clause", state); 
		try {
			// FromClauseParser.g:243:4: ( subQuerySource | tableSource | partitionedTableFunction )
			int alt36=3;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt36=1;
				}
				break;
			case Identifier:
				{
				int LA36_2 = input.LA(2);
				if ( (LA36_2==LPAREN) ) {
					int LA36_5 = input.LA(3);
					if ( (LA36_5==KW_ON) ) {
						alt36=3;
					}
					else if ( (LA36_5==StringLiteral) ) {
						alt36=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 36, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA36_2==EOF||LA36_2==DOT||(LA36_2 >= Identifier && LA36_2 <= KW_ANALYZE)||(LA36_2 >= KW_ARCHIVE && LA36_2 <= KW_BY)||LA36_2==KW_CASCADE||LA36_2==KW_CHANGE||(LA36_2 >= KW_CLUSTER && LA36_2 <= KW_COLLECTION)||(LA36_2 >= KW_COLUMNS && LA36_2 <= KW_COMMENT)||(LA36_2 >= KW_COMPACT && LA36_2 <= KW_CONCATENATE)||(LA36_2 >= KW_CONSTRAINT && LA36_2 <= KW_CREATE)||LA36_2==KW_CUBE||(LA36_2 >= KW_CURRENT_DATE && LA36_2 <= KW_DATA)||(LA36_2 >= KW_DATABASES && LA36_2 <= KW_DISABLE)||(LA36_2 >= KW_DISTRIBUTE && LA36_2 <= KW_ELEM_TYPE)||LA36_2==KW_ENABLE||LA36_2==KW_ESCAPED||(LA36_2 >= KW_EXCLUSIVE && LA36_2 <= KW_EXPORT)||(LA36_2 >= KW_EXTERNAL && LA36_2 <= KW_FLOAT)||(LA36_2 >= KW_FOR && LA36_2 <= KW_FORMATTED)||LA36_2==KW_FULL||(LA36_2 >= KW_FUNCTIONS && LA36_2 <= KW_GROUPING)||(LA36_2 >= KW_HOUR && LA36_2 <= KW_IDXPROPERTIES)||(LA36_2 >= KW_IMPORT && LA36_2 <= KW_INTERSECT)||(LA36_2 >= KW_INTO && LA36_2 <= KW_JAR)||(LA36_2 >= KW_KEY && LA36_2 <= KW_LEFT)||(LA36_2 >= KW_LEVEL && LA36_2 <= KW_LONG)||(LA36_2 >= KW_MAPJOIN && LA36_2 <= KW_MONTH)||(LA36_2 >= KW_MSCK && LA36_2 <= KW_NOSCAN)||(LA36_2 >= KW_NOVALIDATE && LA36_2 <= KW_OFFSET)||LA36_2==KW_OPTION||(LA36_2 >= KW_ORDER && LA36_2 <= KW_OUTPUTFORMAT)||(LA36_2 >= KW_OVERWRITE && LA36_2 <= KW_OWNER)||(LA36_2 >= KW_PARTITION && LA36_2 <= KW_PLUS)||(LA36_2 >= KW_PRETTY && LA36_2 <= KW_RECORDWRITER)||(LA36_2 >= KW_REFERENCES && LA36_2 <= KW_ROLES)||(LA36_2 >= KW_ROLLUP && LA36_2 <= KW_SECOND)||(LA36_2 >= KW_SEMI && LA36_2 <= KW_SSL)||(LA36_2 >= KW_STATISTICS && LA36_2 <= KW_TERMINATED)||(LA36_2 >= KW_TIMESTAMP && LA36_2 <= KW_TRANSACTIONS)||(LA36_2 >= KW_TRIGGER && LA36_2 <= KW_UNARCHIVE)||(LA36_2 >= KW_UNDO && LA36_2 <= KW_UNIONTYPE)||(LA36_2 >= KW_UNLOCK && LA36_2 <= KW_VALUE_TYPE)||LA36_2==KW_VIEW||LA36_2==KW_WHILE||(LA36_2 >= KW_WITH && LA36_2 <= KW_YEAR)||LA36_2==RPAREN||LA36_2==KW_HOLD_DDLTIME||LA36_2==KW_IGNORE||LA36_2==KW_NO_DROP||LA36_2==KW_OFFLINE||LA36_2==KW_PROTECTION||LA36_2==KW_READONLY) ) {
					alt36=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_ABORT:
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ALL:
			case KW_ALTER:
			case KW_ANALYZE:
			case KW_ARCHIVE:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASC:
			case KW_AUTHORIZATION:
			case KW_AUTOCOMMIT:
			case KW_BEFORE:
			case KW_BETWEEN:
			case KW_BIGINT:
			case KW_BINARY:
			case KW_BOOLEAN:
			case KW_BOTH:
			case KW_BUCKET:
			case KW_BUCKETS:
			case KW_BY:
			case KW_CASCADE:
			case KW_CHANGE:
			case KW_CLUSTER:
			case KW_CLUSTERED:
			case KW_CLUSTERSTATUS:
			case KW_COLLECTION:
			case KW_COLUMNS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_COMPUTE:
			case KW_CONCATENATE:
			case KW_CONSTRAINT:
			case KW_CONTINUE:
			case KW_CREATE:
			case KW_CUBE:
			case KW_CURRENT_DATE:
			case KW_CURRENT_TIMESTAMP:
			case KW_CURSOR:
			case KW_DATA:
			case KW_DATABASES:
			case KW_DATE:
			case KW_DATETIME:
			case KW_DAY:
			case KW_DBPROPERTIES:
			case KW_DECIMAL:
			case KW_DEFERRED:
			case KW_DEFINED:
			case KW_DELETE:
			case KW_DELIMITED:
			case KW_DEPENDENCY:
			case KW_DESC:
			case KW_DESCRIBE:
			case KW_DIRECTORIES:
			case KW_DIRECTORY:
			case KW_DISABLE:
			case KW_DISTRIBUTE:
			case KW_DOUBLE:
			case KW_DROP:
			case KW_ELEM_TYPE:
			case KW_ENABLE:
			case KW_ESCAPED:
			case KW_EXCLUSIVE:
			case KW_EXISTS:
			case KW_EXPLAIN:
			case KW_EXPORT:
			case KW_EXTERNAL:
			case KW_FALSE:
			case KW_FETCH:
			case KW_FIELDS:
			case KW_FILE:
			case KW_FILEFORMAT:
			case KW_FIRST:
			case KW_FLOAT:
			case KW_FOR:
			case KW_FOREIGN:
			case KW_FORMAT:
			case KW_FORMATTED:
			case KW_FULL:
			case KW_FUNCTIONS:
			case KW_GRANT:
			case KW_GROUP:
			case KW_GROUPING:
			case KW_HOUR:
			case KW_IDXPROPERTIES:
			case KW_IMPORT:
			case KW_IN:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_INNER:
			case KW_INPATH:
			case KW_INPUTDRIVER:
			case KW_INPUTFORMAT:
			case KW_INSERT:
			case KW_INT:
			case KW_INTERSECT:
			case KW_INTO:
			case KW_IS:
			case KW_ISOLATION:
			case KW_ITEMS:
			case KW_JAR:
			case KW_KEY:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_LAST:
			case KW_LATERAL:
			case KW_LEFT:
			case KW_LEVEL:
			case KW_LIKE:
			case KW_LIMIT:
			case KW_LINES:
			case KW_LOAD:
			case KW_LOCAL:
			case KW_LOCATION:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_LOGICAL:
			case KW_LONG:
			case KW_MAPJOIN:
			case KW_MATERIALIZED:
			case KW_METADATA:
			case KW_MINUS:
			case KW_MINUTE:
			case KW_MONTH:
			case KW_MSCK:
			case KW_NONE:
			case KW_NORELY:
			case KW_NOSCAN:
			case KW_NOVALIDATE:
			case KW_NULL:
			case KW_NULLS:
			case KW_OF:
			case KW_OFFSET:
			case KW_OPTION:
			case KW_ORDER:
			case KW_OUT:
			case KW_OUTER:
			case KW_OUTPUTDRIVER:
			case KW_OUTPUTFORMAT:
			case KW_OVERWRITE:
			case KW_OWNER:
			case KW_PARTITION:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PERCENT:
			case KW_PLUS:
			case KW_PRETTY:
			case KW_PRIMARY:
			case KW_PRINCIPALS:
			case KW_PROCEDURE:
			case KW_PURGE:
			case KW_RANGE:
			case KW_READ:
			case KW_READS:
			case KW_REBUILD:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_REFERENCES:
			case KW_REGEXP:
			case KW_RELOAD:
			case KW_RELY:
			case KW_RENAME:
			case KW_REPAIR:
			case KW_REPLACE:
			case KW_REPLICATION:
			case KW_RESTRICT:
			case KW_REVOKE:
			case KW_REWRITE:
			case KW_RIGHT:
			case KW_RLIKE:
			case KW_ROLE:
			case KW_ROLES:
			case KW_ROLLUP:
			case KW_ROW:
			case KW_ROWS:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SECOND:
			case KW_SEMI:
			case KW_SERDE:
			case KW_SERDEPROPERTIES:
			case KW_SERVER:
			case KW_SET:
			case KW_SETS:
			case KW_SHARED:
			case KW_SHOW:
			case KW_SHOW_DATABASE:
			case KW_SKEWED:
			case KW_SMALLINT:
			case KW_SNAPSHOT:
			case KW_SORT:
			case KW_SORTED:
			case KW_SSL:
			case KW_STATISTICS:
			case KW_STORED:
			case KW_STREAMTABLE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_TABLE:
			case KW_TABLES:
			case KW_TBLPROPERTIES:
			case KW_TEMPORARY:
			case KW_TERMINATED:
			case KW_TIMESTAMP:
			case KW_TINYINT:
			case KW_TO:
			case KW_TOUCH:
			case KW_TRANSACTION:
			case KW_TRANSACTIONS:
			case KW_TRIGGER:
			case KW_TRUE:
			case KW_TRUNCATE:
			case KW_UNARCHIVE:
			case KW_UNDO:
			case KW_UNION:
			case KW_UNIONTYPE:
			case KW_UNLOCK:
			case KW_UNSET:
			case KW_UNSIGNED:
			case KW_UPDATE:
			case KW_URI:
			case KW_USE:
			case KW_USER:
			case KW_USING:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_VALIDATE:
			case KW_VALUES:
			case KW_VALUE_TYPE:
			case KW_VIEW:
			case KW_WHILE:
			case KW_WITH:
			case KW_WORK:
			case KW_WRITE:
			case KW_YEAR:
			case KW_HOLD_DDLTIME:
			case KW_IGNORE:
			case KW_NO_DROP:
			case KW_OFFLINE:
			case KW_PROTECTION:
			case KW_READONLY:
				{
				alt36=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// FromClauseParser.g:244:4: subQuerySource
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource1698);
					subQuerySource108=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource108.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:245:4: tableSource
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource1705);
					tableSource109=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource109.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:246:4: partitionedTableFunction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1712);
					partitionedTableFunction110=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction110.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionTableFunctionSource"


	public static class partitionedTableFunction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "partitionedTableFunction"
	// FromClauseParser.g:249:1: partitionedTableFunction : name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) ;
	public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
		HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token alias=null;
		Token LPAREN111=null;
		Token KW_ON112=null;
		Token Identifier113=null;
		Token LPAREN114=null;
		Token RPAREN116=null;
		Token COMMA117=null;
		Token Identifier118=null;
		Token LPAREN119=null;
		Token RPAREN121=null;
		Token RPAREN122=null;
		ParserRuleReturnScope ptfsrc =null;
		ParserRuleReturnScope spec =null;
		ParserRuleReturnScope expression115 =null;
		ParserRuleReturnScope expression120 =null;

		CommonTree name_tree=null;
		CommonTree alias_tree=null;
		CommonTree LPAREN111_tree=null;
		CommonTree KW_ON112_tree=null;
		CommonTree Identifier113_tree=null;
		CommonTree LPAREN114_tree=null;
		CommonTree RPAREN116_tree=null;
		CommonTree COMMA117_tree=null;
		CommonTree Identifier118_tree=null;
		CommonTree LPAREN119_tree=null;
		CommonTree RPAREN121_tree=null;
		CommonTree RPAREN122_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");

		 gParent.pushMsg("ptf clause", state); 
		try {
			// FromClauseParser.g:252:4: (name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) )
			// FromClauseParser.g:253:4: name= Identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= Identifier )?
			{
			name=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1743); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(name);

			LPAREN111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1745); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN111);

			KW_ON112=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction1747); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON112);

			// FromClauseParser.g:254:4: ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) )
			// FromClauseParser.g:254:5: ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
			{
			// FromClauseParser.g:254:39: (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
			// FromClauseParser.g:254:40: ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )?
			{
			pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1763);
			ptfsrc=partitionTableFunctionSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());
			// FromClauseParser.g:254:80: (spec= partitioningSpec )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==KW_CLUSTER||LA37_0==KW_DISTRIBUTE||LA37_0==KW_ORDER||LA37_0==KW_PARTITION||LA37_0==KW_SORT) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// FromClauseParser.g:254:80: spec= partitioningSpec
					{
					pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction1767);
					spec=partitioningSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitioningSpec.add(spec.getTree());
					}
					break;

			}

			}

			}

			// FromClauseParser.g:255:4: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Identifier) && (synpred12_FromClauseParser())) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// FromClauseParser.g:255:5: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
					{
					Identifier113=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1789); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier113);

					LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1791); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

					pushFollow(FOLLOW_expression_in_partitionedTableFunction1793);
					expression115=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression115.getTree());
					RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1795); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN116);

					// FromClauseParser.g:255:83: ( COMMA Identifier LPAREN expression RPAREN )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==COMMA) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// FromClauseParser.g:255:85: COMMA Identifier LPAREN expression RPAREN
							{
							COMMA117=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction1799); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA117);

							Identifier118=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1801); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier118);

							LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1803); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN119);

							pushFollow(FOLLOW_expression_in_partitionedTableFunction1805);
							expression120=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression120.getTree());
							RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1807); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN121);

							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			// FromClauseParser.g:256:4: ( ( RPAREN )=> ( RPAREN ) )
			// FromClauseParser.g:256:5: ( RPAREN )=> ( RPAREN )
			{
			// FromClauseParser.g:256:17: ( RPAREN )
			// FromClauseParser.g:256:18: RPAREN
			{
			RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1824); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN122);

			}

			}

			// FromClauseParser.g:256:27: ( ( Identifier )=>alias= Identifier )?
			int alt40=2;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// FromClauseParser.g:256:28: ( Identifier )=>alias= Identifier
					{
					alias=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(alias);

					}
					break;

			}

			// AST REWRITE
			// elements: alias, name, ptfsrc, expression, spec
			// token labels: name, alias
			// rule labels: ptfsrc, spec, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
			RewriteRuleSubtreeStream stream_ptfsrc=new RewriteRuleSubtreeStream(adaptor,"rule ptfsrc",ptfsrc!=null?ptfsrc.getTree():null);
			RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 257:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
			{
				// FromClauseParser.g:257:9: ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// FromClauseParser.g:257:35: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextNode());
				}
				stream_alias.reset();

				adaptor.addChild(root_1, stream_ptfsrc.nextTree());
				// FromClauseParser.g:257:51: ( $spec)?
				if ( stream_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_spec.nextTree());
				}
				stream_spec.reset();

				// FromClauseParser.g:257:57: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionedTableFunction"


	public static class whereClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whereClause"
	// FromClauseParser.g:262:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
	public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
		HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_WHERE123=null;
		ParserRuleReturnScope searchCondition124 =null;

		CommonTree KW_WHERE123_tree=null;
		RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
		RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");

		 gParent.pushMsg("where clause", state); 
		try {
			// FromClauseParser.g:265:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
			// FromClauseParser.g:266:5: KW_WHERE searchCondition
			{
			KW_WHERE123=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause1900); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE123);

			pushFollow(FOLLOW_searchCondition_in_whereClause1902);
			searchCondition124=searchCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition124.getTree());
			// AST REWRITE
			// elements: searchCondition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 266:30: -> ^( TOK_WHERE searchCondition )
			{
				// FromClauseParser.g:266:33: ^( TOK_WHERE searchCondition )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WHERE, "TOK_WHERE"), root_1);
				adaptor.addChild(root_1, stream_searchCondition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whereClause"


	public static class searchCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "searchCondition"
	// FromClauseParser.g:269:1: searchCondition : expression ;
	public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
		HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression125 =null;


		 gParent.pushMsg("search condition", state); 
		try {
			// FromClauseParser.g:272:5: ( expression )
			// FromClauseParser.g:273:5: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_searchCondition1941);
			expression125=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression125.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "searchCondition"


	public static class valueRowConstructor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valueRowConstructor"
	// FromClauseParser.g:282:1: valueRowConstructor : LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ ) ;
	public final HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor() throws RecognitionException {
		HiveParser_FromClauseParser.valueRowConstructor_return retval = new HiveParser_FromClauseParser.valueRowConstructor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN126=null;
		Token COMMA128=null;
		Token RPAREN130=null;
		ParserRuleReturnScope precedenceUnaryPrefixExpression127 =null;
		ParserRuleReturnScope precedenceUnaryPrefixExpression129 =null;

		CommonTree LPAREN126_tree=null;
		CommonTree COMMA128_tree=null;
		CommonTree RPAREN130_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_precedenceUnaryPrefixExpression=new RewriteRuleSubtreeStream(adaptor,"rule precedenceUnaryPrefixExpression");

		 gParent.pushMsg("value row constructor", state); 
		try {
			// FromClauseParser.g:285:5: ( LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ ) )
			// FromClauseParser.g:286:5: LPAREN precedenceUnaryPrefixExpression ( COMMA precedenceUnaryPrefixExpression )* RPAREN
			{
			LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueRowConstructor1978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN126);

			pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor1980);
			precedenceUnaryPrefixExpression127=gHiveParser.precedenceUnaryPrefixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression127.getTree());
			// FromClauseParser.g:286:44: ( COMMA precedenceUnaryPrefixExpression )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==COMMA) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// FromClauseParser.g:286:45: COMMA precedenceUnaryPrefixExpression
					{
					COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_valueRowConstructor1983); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA128);

					pushFollow(FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor1985);
					precedenceUnaryPrefixExpression129=gHiveParser.precedenceUnaryPrefixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_precedenceUnaryPrefixExpression.add(precedenceUnaryPrefixExpression129.getTree());
					}
					break;

				default :
					break loop41;
				}
			}

			RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueRowConstructor1989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN130);

			// AST REWRITE
			// elements: precedenceUnaryPrefixExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 286:92: -> ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ )
			{
				// FromClauseParser.g:286:95: ^( TOK_VALUE_ROW ( precedenceUnaryPrefixExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_VALUE_ROW, "TOK_VALUE_ROW"), root_1);
				if ( !(stream_precedenceUnaryPrefixExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_precedenceUnaryPrefixExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_precedenceUnaryPrefixExpression.nextTree());
				}
				stream_precedenceUnaryPrefixExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueRowConstructor"


	public static class valuesTableConstructor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valuesTableConstructor"
	// FromClauseParser.g:289:1: valuesTableConstructor : valueRowConstructor ( COMMA valueRowConstructor )* -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ ) ;
	public final HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor() throws RecognitionException {
		HiveParser_FromClauseParser.valuesTableConstructor_return retval = new HiveParser_FromClauseParser.valuesTableConstructor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA132=null;
		ParserRuleReturnScope valueRowConstructor131 =null;
		ParserRuleReturnScope valueRowConstructor133 =null;

		CommonTree COMMA132_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_valueRowConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valueRowConstructor");

		 gParent.pushMsg("values table constructor", state); 
		try {
			// FromClauseParser.g:292:5: ( valueRowConstructor ( COMMA valueRowConstructor )* -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ ) )
			// FromClauseParser.g:293:5: valueRowConstructor ( COMMA valueRowConstructor )*
			{
			pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2029);
			valueRowConstructor131=valueRowConstructor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueRowConstructor.add(valueRowConstructor131.getTree());
			// FromClauseParser.g:293:25: ( COMMA valueRowConstructor )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==COMMA) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// FromClauseParser.g:293:26: COMMA valueRowConstructor
					{
					COMMA132=(Token)match(input,COMMA,FOLLOW_COMMA_in_valuesTableConstructor2032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA132);

					pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2034);
					valueRowConstructor133=valueRowConstructor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueRowConstructor.add(valueRowConstructor133.getTree());
					}
					break;

				default :
					break loop42;
				}
			}

			// AST REWRITE
			// elements: valueRowConstructor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 293:54: -> ^( TOK_VALUES_TABLE ( valueRowConstructor )+ )
			{
				// FromClauseParser.g:293:57: ^( TOK_VALUES_TABLE ( valueRowConstructor )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_VALUES_TABLE, "TOK_VALUES_TABLE"), root_1);
				if ( !(stream_valueRowConstructor.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_valueRowConstructor.hasNext() ) {
					adaptor.addChild(root_1, stream_valueRowConstructor.nextTree());
				}
				stream_valueRowConstructor.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valuesTableConstructor"


	public static class valuesClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "valuesClause"
	// FromClauseParser.g:301:1: valuesClause : KW_VALUES valuesTableConstructor -> valuesTableConstructor ;
	public final HiveParser_FromClauseParser.valuesClause_return valuesClause() throws RecognitionException {
		HiveParser_FromClauseParser.valuesClause_return retval = new HiveParser_FromClauseParser.valuesClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_VALUES134=null;
		ParserRuleReturnScope valuesTableConstructor135 =null;

		CommonTree KW_VALUES134_tree=null;
		RewriteRuleTokenStream stream_KW_VALUES=new RewriteRuleTokenStream(adaptor,"token KW_VALUES");
		RewriteRuleSubtreeStream stream_valuesTableConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valuesTableConstructor");

		 gParent.pushMsg("values clause", state); 
		try {
			// FromClauseParser.g:304:5: ( KW_VALUES valuesTableConstructor -> valuesTableConstructor )
			// FromClauseParser.g:305:5: KW_VALUES valuesTableConstructor
			{
			KW_VALUES134=(Token)match(input,KW_VALUES,FOLLOW_KW_VALUES_in_valuesClause2078); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_VALUES.add(KW_VALUES134);

			pushFollow(FOLLOW_valuesTableConstructor_in_valuesClause2080);
			valuesTableConstructor135=valuesTableConstructor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valuesTableConstructor.add(valuesTableConstructor135.getTree());
			// AST REWRITE
			// elements: valuesTableConstructor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 305:38: -> valuesTableConstructor
			{
				adaptor.addChild(root_0, stream_valuesTableConstructor.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valuesClause"


	public static class virtualTableSource_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "virtualTableSource"
	// FromClauseParser.g:312:1: virtualTableSource : LPAREN valuesClause RPAREN tableNameColList -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause ) ;
	public final HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource() throws RecognitionException {
		HiveParser_FromClauseParser.virtualTableSource_return retval = new HiveParser_FromClauseParser.virtualTableSource_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN136=null;
		Token RPAREN138=null;
		ParserRuleReturnScope valuesClause137 =null;
		ParserRuleReturnScope tableNameColList139 =null;

		CommonTree LPAREN136_tree=null;
		CommonTree RPAREN138_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
		RewriteRuleSubtreeStream stream_tableNameColList=new RewriteRuleSubtreeStream(adaptor,"rule tableNameColList");

		 gParent.pushMsg("virtual table source", state); 
		try {
			// FromClauseParser.g:315:4: ( LPAREN valuesClause RPAREN tableNameColList -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause ) )
			// FromClauseParser.g:316:4: LPAREN valuesClause RPAREN tableNameColList
			{
			LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN136);

			pushFollow(FOLLOW_valuesClause_in_virtualTableSource2117);
			valuesClause137=valuesClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause137.getTree());
			RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2119); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN138);

			pushFollow(FOLLOW_tableNameColList_in_virtualTableSource2121);
			tableNameColList139=tableNameColList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableNameColList.add(tableNameColList139.getTree());
			// AST REWRITE
			// elements: valuesClause, tableNameColList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 316:48: -> ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause )
			{
				// FromClauseParser.g:316:51: ^( TOK_VIRTUAL_TABLE tableNameColList valuesClause )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_VIRTUAL_TABLE, "TOK_VIRTUAL_TABLE"), root_1);
				adaptor.addChild(root_1, stream_tableNameColList.nextTree());
				adaptor.addChild(root_1, stream_valuesClause.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "virtualTableSource"


	public static class tableNameColList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tableNameColList"
	// FromClauseParser.g:322:1: tableNameColList : ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) ) ;
	public final HiveParser_FromClauseParser.tableNameColList_return tableNameColList() throws RecognitionException {
		HiveParser_FromClauseParser.tableNameColList_return retval = new HiveParser_FromClauseParser.tableNameColList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS140=null;
		Token LPAREN142=null;
		Token COMMA144=null;
		Token RPAREN146=null;
		ParserRuleReturnScope identifier141 =null;
		ParserRuleReturnScope identifier143 =null;
		ParserRuleReturnScope identifier145 =null;

		CommonTree KW_AS140_tree=null;
		CommonTree LPAREN142_tree=null;
		CommonTree COMMA144_tree=null;
		CommonTree RPAREN146_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("from source", state); 
		try {
			// FromClauseParser.g:325:5: ( ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) ) )
			// FromClauseParser.g:326:5: ( KW_AS )? identifier LPAREN identifier ( COMMA identifier )* RPAREN
			{
			// FromClauseParser.g:326:5: ( KW_AS )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==KW_AS) ) {
				int LA43_1 = input.LA(2);
				if ( ((LA43_1 >= Identifier && LA43_1 <= KW_ANALYZE)||(LA43_1 >= KW_ARCHIVE && LA43_1 <= KW_BY)||LA43_1==KW_CASCADE||LA43_1==KW_CHANGE||(LA43_1 >= KW_CLUSTER && LA43_1 <= KW_COLLECTION)||(LA43_1 >= KW_COLUMNS && LA43_1 <= KW_COMMENT)||(LA43_1 >= KW_COMPACT && LA43_1 <= KW_CONCATENATE)||(LA43_1 >= KW_CONSTRAINT && LA43_1 <= KW_CREATE)||LA43_1==KW_CUBE||(LA43_1 >= KW_CURRENT_DATE && LA43_1 <= KW_DATA)||(LA43_1 >= KW_DATABASES && LA43_1 <= KW_DISABLE)||(LA43_1 >= KW_DISTRIBUTE && LA43_1 <= KW_ELEM_TYPE)||LA43_1==KW_ENABLE||LA43_1==KW_ESCAPED||(LA43_1 >= KW_EXCLUSIVE && LA43_1 <= KW_EXPORT)||(LA43_1 >= KW_EXTERNAL && LA43_1 <= KW_FLOAT)||(LA43_1 >= KW_FOR && LA43_1 <= KW_FORMATTED)||LA43_1==KW_FULL||(LA43_1 >= KW_FUNCTIONS && LA43_1 <= KW_GROUPING)||(LA43_1 >= KW_HOUR && LA43_1 <= KW_IDXPROPERTIES)||(LA43_1 >= KW_IMPORT && LA43_1 <= KW_INTERSECT)||(LA43_1 >= KW_INTO && LA43_1 <= KW_JAR)||(LA43_1 >= KW_KEY && LA43_1 <= KW_LEFT)||(LA43_1 >= KW_LEVEL && LA43_1 <= KW_LONG)||(LA43_1 >= KW_MAPJOIN && LA43_1 <= KW_MONTH)||(LA43_1 >= KW_MSCK && LA43_1 <= KW_NOSCAN)||(LA43_1 >= KW_NOVALIDATE && LA43_1 <= KW_OFFSET)||LA43_1==KW_OPTION||(LA43_1 >= KW_ORDER && LA43_1 <= KW_OUTPUTFORMAT)||(LA43_1 >= KW_OVERWRITE && LA43_1 <= KW_OWNER)||(LA43_1 >= KW_PARTITION && LA43_1 <= KW_PLUS)||(LA43_1 >= KW_PRETTY && LA43_1 <= KW_RECORDWRITER)||(LA43_1 >= KW_REFERENCES && LA43_1 <= KW_ROLES)||(LA43_1 >= KW_ROLLUP && LA43_1 <= KW_SECOND)||(LA43_1 >= KW_SEMI && LA43_1 <= KW_SSL)||(LA43_1 >= KW_STATISTICS && LA43_1 <= KW_TABLES)||(LA43_1 >= KW_TBLPROPERTIES && LA43_1 <= KW_TERMINATED)||(LA43_1 >= KW_TIMESTAMP && LA43_1 <= KW_TRANSACTIONS)||(LA43_1 >= KW_TRIGGER && LA43_1 <= KW_UNARCHIVE)||(LA43_1 >= KW_UNDO && LA43_1 <= KW_UNIONTYPE)||(LA43_1 >= KW_UNLOCK && LA43_1 <= KW_VALUE_TYPE)||LA43_1==KW_VIEW||LA43_1==KW_WHILE||(LA43_1 >= KW_WITH && LA43_1 <= KW_YEAR)||LA43_1==KW_HOLD_DDLTIME||LA43_1==KW_IGNORE||LA43_1==KW_NO_DROP||LA43_1==KW_OFFLINE||LA43_1==KW_PROTECTION||LA43_1==KW_READONLY) ) {
					alt43=1;
				}
			}
			switch (alt43) {
				case 1 :
					// FromClauseParser.g:326:5: KW_AS
					{
					KW_AS140=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableNameColList2162); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS140);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_tableNameColList2165);
			identifier141=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier141.getTree());
			LPAREN142=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableNameColList2167); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN142);

			pushFollow(FOLLOW_identifier_in_tableNameColList2169);
			identifier143=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier143.getTree());
			// FromClauseParser.g:326:41: ( COMMA identifier )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==COMMA) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// FromClauseParser.g:326:42: COMMA identifier
					{
					COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableNameColList2172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA144);

					pushFollow(FOLLOW_identifier_in_tableNameColList2174);
					identifier145=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier145.getTree());
					}
					break;

				default :
					break loop44;
				}
			}

			RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableNameColList2178); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN146);

			// AST REWRITE
			// elements: identifier, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 326:68: -> ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) )
			{
				// FromClauseParser.g:326:71: ^( TOK_VIRTUAL_TABREF ^( TOK_TABNAME identifier ) ^( TOK_COL_NAME ( identifier )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_VIRTUAL_TABREF, "TOK_VIRTUAL_TABREF"), root_1);
				// FromClauseParser.g:326:92: ^( TOK_TABNAME identifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_2);
				adaptor.addChild(root_2, stream_identifier.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// FromClauseParser.g:326:118: ^( TOK_COL_NAME ( identifier )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_COL_NAME, "TOK_COL_NAME"), root_2);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_2, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableNameColList"

	// $ANTLR start synpred1_FromClauseParser
	public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:132:2: ( KW_LATERAL KW_VIEW KW_OUTER )
		// FromClauseParser.g:132:3: KW_LATERAL KW_VIEW KW_OUTER
		{
		match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_synpred1_FromClauseParser711); if (state.failed) return;

		match(input,KW_VIEW,FOLLOW_KW_VIEW_in_synpred1_FromClauseParser713); if (state.failed) return;

		match(input,KW_OUTER,FOLLOW_KW_OUTER_in_synpred1_FromClauseParser715); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_FromClauseParser

	// $ANTLR start synpred2_FromClauseParser
	public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:132:102: ( COMMA )
		// FromClauseParser.g:132:103: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred2_FromClauseParser737); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_FromClauseParser

	// $ANTLR start synpred3_FromClauseParser
	public final void synpred3_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:135:60: ( COMMA )
		// FromClauseParser.g:135:61: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred3_FromClauseParser790); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_FromClauseParser

	// $ANTLR start synpred4_FromClauseParser
	public final void synpred4_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:150:5: ( LPAREN KW_VALUES )
		// FromClauseParser.g:150:6: LPAREN KW_VALUES
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred4_FromClauseParser890); if (state.failed) return;

		match(input,KW_VALUES,FOLLOW_KW_VALUES_in_synpred4_FromClauseParser892); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_FromClauseParser

	// $ANTLR start synpred5_FromClauseParser
	public final void synpred5_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:151:7: ( LPAREN )
		// FromClauseParser.g:151:8: LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred5_FromClauseParser906); if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_FromClauseParser

	// $ANTLR start synpred6_FromClauseParser
	public final void synpred6_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:160:6: ( Identifier LPAREN )
		// FromClauseParser.g:160:7: Identifier LPAREN
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred6_FromClauseParser961); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_FromClauseParser963); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_FromClauseParser

	// $ANTLR start synpred7_FromClauseParser
	public final void synpred7_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:194:6: ( tableProperties )
		// FromClauseParser.g:194:7: tableProperties
		{
		pushFollow(FOLLOW_tableProperties_in_synpred7_FromClauseParser1270);
		gHiveParser.tableProperties();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_FromClauseParser

	// $ANTLR start synpred8_FromClauseParser
	public final void synpred8_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:195:6: ( tableSample )
		// FromClauseParser.g:195:7: tableSample
		{
		pushFollow(FOLLOW_tableSample_in_synpred8_FromClauseParser1287);
		tableSample();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_FromClauseParser

	// $ANTLR start synpred9_FromClauseParser
	public final void synpred9_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:196:6: ( KW_AS )
		// FromClauseParser.g:196:7: KW_AS
		{
		match(input,KW_AS,FOLLOW_KW_AS_in_synpred9_FromClauseParser1305); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_FromClauseParser

	// $ANTLR start synpred10_FromClauseParser
	public final void synpred10_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:198:5: ( identifier )
		// FromClauseParser.g:198:6: identifier
		{
		pushFollow(FOLLOW_identifier_in_synpred10_FromClauseParser1330);
		gHiveParser.identifier();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_FromClauseParser

	// $ANTLR start synpred12_FromClauseParser
	public final void synpred12_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:255:5: ( Identifier LPAREN expression RPAREN )
		// FromClauseParser.g:255:6: Identifier LPAREN expression RPAREN
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred12_FromClauseParser1777); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred12_FromClauseParser1779); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred12_FromClauseParser1781);
		gHiveParser.expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred12_FromClauseParser1783); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_FromClauseParser

	// $ANTLR start synpred14_FromClauseParser
	public final void synpred14_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:256:28: ( Identifier )
		// FromClauseParser.g:256:29: Identifier
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred14_FromClauseParser1830); if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_FromClauseParser

	// Delegated rules

	public final boolean synpred9_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA27 dfa27 = new DFA27(this);
	protected DFA29 dfa29 = new DFA29(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA40 dfa40 = new DFA40(this);
	static final String DFA14_eotS =
		"\u0080\uffff";
	static final String DFA14_eofS =
		"\1\1\177\uffff";
	static final String DFA14_minS =
		"\1\12\2\uffff\1\32\27\uffff\3\0\142\uffff";
	static final String DFA14_maxS =
		"\1\u0146\2\uffff\1\u0216\27\uffff\3\0\142\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\2\75\uffff\1\1\100\uffff";
	static final String DFA14_specialS =
		"\33\uffff\1\0\1\1\1\2\142\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\3\55\uffff\1\1\17\uffff\1\1\30\uffff\1\1\33\uffff\1\1\3\uffff\1\1"+
			"\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\10\uffff\1\1\4\uffff\2\1\3\uffff"+
			"\1\1\11\uffff\1\1\21\uffff\1\1\3\uffff\1\1\32\uffff\1\1\13\uffff\1\1"+
			"\12\uffff\1\1\14\uffff\1\1\34\uffff\1\1\22\uffff\1\1\1\uffff\1\1\7\uffff"+
			"\1\1\12\uffff\1\1",
			"",
			"",
			"\1\33\4\34\2\35\1\34\1\uffff\1\34\2\35\1\34\1\35\2\34\5\35\2\34\1\35"+
			"\1\uffff\1\34\2\uffff\1\34\1\uffff\4\34\1\uffff\2\34\1\uffff\4\34\1\uffff"+
			"\1\35\1\34\1\35\1\uffff\1\35\1\uffff\3\35\1\34\1\uffff\1\34\1\35\3\34"+
			"\1\35\2\34\1\35\3\34\1\35\3\34\1\uffff\1\34\2\35\1\34\1\uffff\1\34\1"+
			"\uffff\1\34\1\uffff\1\34\1\35\2\34\1\uffff\3\35\4\34\1\35\1\uffff\2\35"+
			"\2\34\1\uffff\1\35\1\uffff\1\34\3\35\1\uffff\2\34\1\uffff\2\35\2\34\1"+
			"\35\3\34\3\35\1\uffff\2\35\3\34\1\uffff\4\34\2\35\1\uffff\1\34\1\35\3"+
			"\34\1\35\5\34\2\uffff\6\34\1\uffff\1\34\1\35\2\34\1\uffff\1\34\1\35\1"+
			"\34\1\35\1\34\2\uffff\1\34\1\uffff\3\35\2\34\1\uffff\2\34\1\uffff\1\35"+
			"\2\34\1\35\1\34\2\uffff\1\34\1\35\1\34\1\35\1\34\1\35\1\34\1\35\3\34"+
			"\1\uffff\2\35\7\34\1\35\1\34\2\35\2\34\1\uffff\3\35\3\34\1\uffff\4\34"+
			"\1\35\5\34\1\35\4\34\1\uffff\5\34\1\35\1\34\1\uffff\3\34\1\uffff\1\35"+
			"\1\34\1\35\3\34\1\uffff\3\35\1\34\1\uffff\1\34\1\35\1\34\1\uffff\3\34"+
			"\1\35\2\34\2\35\3\34\1\35\1\34\1\uffff\1\34\2\uffff\1\34\1\uffff\1\35"+
			"\3\34\3\uffff\1\1\u0085\uffff\1\34\3\uffff\1\34\60\uffff\1\34\3\uffff"+
			"\1\34\27\uffff\1\34\3\uffff\1\34",
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
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 132:101: ( ( COMMA )=> COMMA identifier )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_27 = input.LA(1);
						 
						int index14_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index14_27);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_28 = input.LA(1);
						 
						int index14_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index14_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_29 = input.LA(1);
						 
						int index14_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index14_29);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA16_eotS =
		"\u0080\uffff";
	static final String DFA16_eofS =
		"\1\1\177\uffff";
	static final String DFA16_minS =
		"\1\12\2\uffff\1\32\27\uffff\3\0\142\uffff";
	static final String DFA16_maxS =
		"\1\u0146\2\uffff\1\u0216\27\uffff\3\0\142\uffff";
	static final String DFA16_acceptS =
		"\1\uffff\1\2\75\uffff\1\1\100\uffff";
	static final String DFA16_specialS =
		"\33\uffff\1\0\1\1\1\2\142\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\3\55\uffff\1\1\17\uffff\1\1\30\uffff\1\1\33\uffff\1\1\3\uffff\1\1"+
			"\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\10\uffff\1\1\4\uffff\2\1\3\uffff"+
			"\1\1\11\uffff\1\1\21\uffff\1\1\3\uffff\1\1\32\uffff\1\1\13\uffff\1\1"+
			"\12\uffff\1\1\14\uffff\1\1\34\uffff\1\1\22\uffff\1\1\1\uffff\1\1\7\uffff"+
			"\1\1\12\uffff\1\1",
			"",
			"",
			"\1\33\4\34\2\35\1\34\1\uffff\1\34\2\35\1\34\1\35\2\34\5\35\2\34\1\35"+
			"\1\uffff\1\34\2\uffff\1\34\1\uffff\4\34\1\uffff\2\34\1\uffff\4\34\1\uffff"+
			"\1\35\1\34\1\35\1\uffff\1\35\1\uffff\3\35\1\34\1\uffff\1\34\1\35\3\34"+
			"\1\35\2\34\1\35\3\34\1\35\3\34\1\uffff\1\34\2\35\1\34\1\uffff\1\34\1"+
			"\uffff\1\34\1\uffff\1\34\1\35\2\34\1\uffff\3\35\4\34\1\35\1\uffff\2\35"+
			"\2\34\1\uffff\1\35\1\uffff\1\34\3\35\1\uffff\2\34\1\uffff\2\35\2\34\1"+
			"\35\3\34\3\35\1\uffff\2\35\3\34\1\uffff\4\34\2\35\1\uffff\1\34\1\35\3"+
			"\34\1\35\5\34\2\uffff\6\34\1\uffff\1\34\1\35\2\34\1\uffff\1\34\1\35\1"+
			"\34\1\35\1\34\2\uffff\1\34\1\uffff\3\35\2\34\1\uffff\2\34\1\uffff\1\35"+
			"\2\34\1\35\1\34\2\uffff\1\34\1\35\1\34\1\35\1\34\1\35\1\34\1\35\3\34"+
			"\1\uffff\2\35\7\34\1\35\1\34\2\35\2\34\1\uffff\3\35\3\34\1\uffff\4\34"+
			"\1\35\5\34\1\35\4\34\1\uffff\5\34\1\35\1\34\1\uffff\3\34\1\uffff\1\35"+
			"\1\34\1\35\3\34\1\uffff\3\35\1\34\1\uffff\1\34\1\35\1\34\1\uffff\3\34"+
			"\1\35\2\34\2\35\3\34\1\35\1\34\1\uffff\1\34\2\uffff\1\34\1\uffff\1\35"+
			"\3\34\3\uffff\1\1\u0085\uffff\1\34\3\uffff\1\34\60\uffff\1\34\3\uffff"+
			"\1\34\27\uffff\1\34\3\uffff\1\34",
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
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 135:59: ( ( COMMA )=> COMMA identifier )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_27 = input.LA(1);
						 
						int index16_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_27);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_28 = input.LA(1);
						 
						int index16_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA16_29 = input.LA(1);
						 
						int index16_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_FromClauseParser()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_29);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA19_eotS =
		"\u0105\uffff";
	static final String DFA19_eofS =
		"\u0105\uffff";
	static final String DFA19_minS =
		"\1\32\3\0\1\32\142\uffff\1\12\1\32\1\12\3\7\1\12\5\uffff\3\0\3\uffff\2"+
		"\0\1\uffff\1\0\2\uffff\3\0\1\uffff\7\0\20\uffff\134\0\17\uffff";
	static final String DFA19_maxS =
		"\1\u0216\3\0\1\u0216\142\uffff\7\u0216\5\uffff\3\0\3\uffff\2\0\1\uffff"+
		"\1\0\2\uffff\3\0\1\uffff\7\0\20\uffff\134\0\17\uffff";
	static final String DFA19_acceptS =
		"\45\uffff\1\1\1\3\107\uffff\5\2\3\uffff\3\2\2\uffff\1\2\1\uffff\2\2\3"+
		"\uffff\1\2\7\uffff\20\2\134\uffff\17\2";
	static final String DFA19_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\142\uffff\1\4\1\uffff\1\5\3\uffff\1\6\5\uffff"+
		"\1\7\1\10\1\11\3\uffff\1\12\1\13\1\uffff\1\14\2\uffff\1\15\1\16\1\17\1"+
		"\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\20\uffff\1\27\1\30\1\31\1\32"+
		"\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
		"\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
		"\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
		"\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
		"\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133"+
		"\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147"+
		"\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\17"+
		"\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\1\uffff\1\2"+
			"\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3\1\2\1\3"+
			"\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3\2\2\1\3\3\2\1\3"+
			"\3\2\1\uffff\1\2\2\3\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\3\2\2"+
			"\1\uffff\3\3\4\2\1\3\1\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff"+
			"\2\2\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3\1\uffff"+
			"\1\2\1\3\3\2\1\3\5\2\2\uffff\6\2\1\uffff\1\2\1\3\2\2\1\uffff\1\2\1\3"+
			"\1\2\1\3\1\2\2\uffff\1\2\1\uffff\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2"+
			"\1\3\1\2\2\uffff\1\2\1\3\1\2\1\3\1\2\1\3\1\2\1\3\3\2\1\uffff\2\3\7\2"+
			"\1\3\1\2\2\3\2\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff"+
			"\5\2\1\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1\uffff"+
			"\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\3\3\2\3\uffff\1\4\u0085\uffff\1\2\3\uffff\1\2\60\uffff"+
			"\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\156\4\157\2\160\1\157\1\uffff\1\157\2\160\1\157\1\160\2\157\5\160"+
			"\2\157\1\160\1\uffff\1\157\2\uffff\1\157\1\uffff\4\157\1\uffff\2\157"+
			"\1\uffff\4\157\1\uffff\1\160\1\157\1\160\1\uffff\1\160\1\uffff\3\160"+
			"\1\157\1\uffff\1\157\1\160\3\157\1\160\2\157\1\160\3\157\1\160\3\157"+
			"\1\uffff\1\157\2\160\1\157\1\uffff\1\157\1\uffff\1\157\1\uffff\1\157"+
			"\1\160\2\157\1\uffff\3\160\4\157\1\160\1\uffff\2\160\2\157\1\150\1\160"+
			"\1\uffff\1\157\3\160\1\uffff\2\157\1\uffff\2\160\2\157\1\160\3\157\1"+
			"\151\2\160\1\uffff\2\160\3\157\1\uffff\4\157\2\160\1\uffff\1\157\1\160"+
			"\3\157\1\160\5\157\1\uffff\1\153\6\157\1\uffff\1\157\1\160\2\157\1\uffff"+
			"\1\157\1\160\1\157\1\160\1\157\2\uffff\1\157\1\uffff\3\160\2\157\1\uffff"+
			"\2\157\1\uffff\1\160\2\157\1\160\1\157\2\uffff\1\157\1\160\1\157\1\160"+
			"\1\157\1\160\1\157\1\160\3\157\1\154\2\160\7\157\1\160\1\157\2\160\2"+
			"\157\1\uffff\3\160\3\157\1\152\4\157\1\160\5\157\1\160\4\157\1\uffff"+
			"\5\157\1\160\1\157\1\uffff\3\157\1\uffff\1\160\1\157\1\160\3\157\1\uffff"+
			"\3\160\1\157\1\uffff\1\157\1\160\1\157\1\162\3\157\1\160\2\157\2\160"+
			"\3\157\1\155\1\157\1\uffff\1\157\2\uffff\1\157\1\uffff\1\147\3\157\3"+
			"\uffff\1\161\u0085\uffff\1\157\3\uffff\1\157\60\uffff\1\157\3\uffff\1"+
			"\157\27\uffff\1\157\3\uffff\1\157",
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
			"\1\175\6\uffff\1\166\10\uffff\1\163\4\164\2\u0081\1\164\1\uffff\1\164"+
			"\1\u0081\1\165\1\164\1\u0081\2\164\5\u0081\2\164\1\u0081\1\uffff\1\164"+
			"\2\uffff\1\164\1\uffff\4\164\1\uffff\2\164\1\uffff\4\164\1\uffff\1\u0081"+
			"\1\164\1\u0081\1\176\1\u0081\1\uffff\3\u0081\1\164\1\uffff\1\164\1\u0081"+
			"\3\164\1\u0081\2\164\1\u0081\3\164\1\u0081\3\164\1\uffff\1\164\2\u0081"+
			"\1\164\1\uffff\1\164\1\uffff\1\164\1\uffff\1\164\1\u0081\2\164\1\uffff"+
			"\3\u0081\4\164\1\u0081\1\uffff\2\u0081\2\164\1\uffff\1\u0080\1\uffff"+
			"\1\164\3\u0081\1\uffff\2\164\1\uffff\2\u0081\2\164\1\172\3\164\3\u0081"+
			"\1\uffff\2\u0081\3\164\1\173\4\164\1\171\1\174\1\uffff\1\164\1\u0081"+
			"\3\164\1\u0081\5\164\2\uffff\6\164\1\uffff\1\164\1\u0081\2\164\1\uffff"+
			"\1\164\1\u0081\1\164\1\u0081\1\164\2\uffff\1\164\1\uffff\3\u0081\2\164"+
			"\1\uffff\2\164\1\uffff\1\u0081\2\164\1\u0081\1\164\2\uffff\1\164\1\u0081"+
			"\1\164\1\u0081\1\164\1\u0081\1\164\1\u0081\3\164\1\uffff\2\u0081\7\164"+
			"\1\u0081\1\164\1\177\1\u0081\2\164\1\uffff\3\u0081\3\164\1\uffff\4\164"+
			"\1\u0081\5\164\1\u0081\4\164\1\uffff\5\164\1\u0081\1\164\1\170\3\164"+
			"\1\uffff\1\u0081\1\164\1\u0081\3\164\1\uffff\3\u0081\1\164\1\uffff\1"+
			"\164\1\u0081\1\164\1\uffff\3\164\1\u0081\2\164\2\u0081\3\164\1\u0081"+
			"\1\164\1\uffff\1\164\2\uffff\1\164\1\uffff\1\u0081\3\164\3\uffff\1\167"+
			"\12\uffff\1\u0082\172\uffff\1\164\3\uffff\1\164\60\uffff\1\164\3\uffff"+
			"\1\164\27\uffff\1\164\3\uffff\1\164",
			"\1\u0083\4\u0084\2\u0085\1\u0084\1\uffff\1\u0084\2\u0085\1\u0084\1\u0085"+
			"\2\u0084\5\u0085\2\u0084\1\u0085\1\uffff\1\u0084\2\uffff\1\u0084\1\uffff"+
			"\4\u0084\1\uffff\2\u0084\1\uffff\4\u0084\1\uffff\1\u0085\1\u0084\1\u0085"+
			"\1\uffff\1\u0085\1\uffff\3\u0085\1\u0084\1\uffff\1\u0084\1\u0085\3\u0084"+
			"\1\u0085\2\u0084\1\u0085\3\u0084\1\u0085\3\u0084\1\uffff\1\u0084\2\u0085"+
			"\1\u0084\1\uffff\1\u0084\1\uffff\1\u0084\1\uffff\1\u0084\1\u0085\2\u0084"+
			"\1\uffff\3\u0085\4\u0084\1\u0085\1\uffff\2\u0085\2\u0084\1\uffff\1\u0085"+
			"\1\uffff\1\u0084\3\u0085\1\uffff\2\u0084\1\uffff\2\u0085\2\u0084\1\u0085"+
			"\3\u0084\3\u0085\1\uffff\2\u0085\3\u0084\1\uffff\4\u0084\2\u0085\1\uffff"+
			"\1\u0084\1\u0085\3\u0084\1\u0085\5\u0084\2\uffff\6\u0084\1\uffff\1\u0084"+
			"\1\u0085\2\u0084\1\uffff\1\u0084\1\u0085\1\u0084\1\u0085\1\u0084\2\uffff"+
			"\1\u0084\1\uffff\3\u0085\2\u0084\1\uffff\2\u0084\1\uffff\1\u0085\2\u0084"+
			"\1\u0085\1\u0084\2\uffff\1\u0084\1\u0085\1\u0084\1\u0085\1\u0084\1\u0085"+
			"\1\u0084\1\u0085\3\u0084\1\uffff\2\u0085\7\u0084\1\u0085\1\u0084\2\u0085"+
			"\2\u0084\1\uffff\3\u0085\3\u0084\1\uffff\4\u0084\1\u0085\5\u0084\1\u0085"+
			"\4\u0084\1\uffff\5\u0084\1\u0085\1\u0084\1\uffff\3\u0084\1\uffff\1\u0085"+
			"\1\u0084\1\u0085\3\u0084\1\uffff\3\u0085\1\u0084\1\uffff\1\u0084\1\u0085"+
			"\1\u0084\1\u0087\3\u0084\1\u0085\2\u0084\2\u0085\3\u0084\1\u0085\1\u0084"+
			"\1\uffff\1\u0084\2\uffff\1\u0084\1\uffff\1\u0085\3\u0084\3\uffff\1\u0086"+
			"\u0085\uffff\1\u0084\3\uffff\1\u0084\60\uffff\1\u0084\3\uffff\1\u0084"+
			"\27\uffff\1\u0084\3\uffff\1\u0084",
			"\1\u0094\6\uffff\1\u008a\10\uffff\1\u008e\4\u008f\2\u0098\1\u008f\1"+
			"\uffff\1\u008f\1\u0098\1\u008d\1\u008f\1\u0098\2\u008f\5\u0098\2\u008f"+
			"\1\u0098\1\uffff\1\u008f\2\uffff\1\u008f\1\uffff\4\u008f\1\uffff\2\u008f"+
			"\1\uffff\4\u008f\1\uffff\1\u0098\1\u008f\1\u0098\1\u0095\1\u0098\1\uffff"+
			"\3\u0098\1\u008f\1\uffff\1\u008f\1\u0098\3\u008f\1\u0098\2\u008f\1\u0098"+
			"\3\u008f\1\u0098\3\u008f\1\uffff\1\u008f\2\u0098\1\u008f\1\uffff\1\u008f"+
			"\1\uffff\1\u008f\1\uffff\1\u008f\1\u0098\2\u008f\1\uffff\3\u0098\4\u008f"+
			"\1\u0098\1\uffff\2\u0098\2\u008f\1\uffff\1\u0097\1\uffff\1\u008f\3\u0098"+
			"\1\uffff\2\u008f\1\uffff\2\u0098\2\u008f\1\u0091\3\u008f\3\u0098\1\uffff"+
			"\1\u0089\1\u0098\3\u008f\1\u0092\4\u008f\1\u0090\1\u0093\1\uffff\1\u008f"+
			"\1\u0098\3\u008f\1\u0098\5\u008f\2\uffff\6\u008f\1\uffff\1\u008f\1\u0098"+
			"\2\u008f\1\uffff\1\u008f\1\u0098\1\u008f\1\u0098\1\u008f\2\uffff\1\u008f"+
			"\1\uffff\3\u0098\2\u008f\1\uffff\1\u0088\1\u008f\1\uffff\1\u0098\2\u008f"+
			"\1\u0098\1\u008f\2\uffff\1\u008f\1\u0098\1\u008f\1\u0098\1\u008f\1\u0098"+
			"\1\u008f\1\u0098\3\u008f\1\uffff\2\u0098\7\u008f\1\u0098\1\u008f\1\u0096"+
			"\1\u0098\2\u008f\1\uffff\3\u0098\3\u008f\1\uffff\4\u008f\1\u0098\5\u008f"+
			"\1\u0098\4\u008f\1\uffff\5\u008f\1\u0098\1\u008f\1\u008c\3\u008f\1\uffff"+
			"\1\u0098\1\u008f\1\u0098\3\u008f\1\uffff\3\u0098\1\u008f\1\uffff\1\u008f"+
			"\1\u0098\1\u008f\1\uffff\3\u008f\1\u0098\2\u008f\2\u0098\3\u008f\1\u0098"+
			"\1\u008f\1\uffff\1\u008f\2\uffff\1\u008f\1\uffff\1\u0098\3\u008f\3\uffff"+
			"\1\u008b\12\uffff\1\u0099\172\uffff\1\u008f\3\uffff\1\u008f\60\uffff"+
			"\1\u008f\3\uffff\1\u008f\27\uffff\1\u008f\3\uffff\1\u008f",
			"\1\u00ac\5\uffff\1\u00b0\1\uffff\1\u009a\2\uffff\1\u00af\7\uffff\1\u009e"+
			"\4\u00b5\1\u009b\1\u00b9\1\u00b5\1\uffff\1\u00b5\1\u00b2\1\u00b9\1\u00b5"+
			"\1\u00b9\2\u00b5\1\u00b9\3\u00b6\1\u00b9\2\u00b5\1\u00b9\1\uffff\1\u00b5"+
			"\1\u00b4\1\u00b3\1\u00b5\1\uffff\4\u00b5\1\uffff\2\u00b5\1\uffff\4\u00b5"+
			"\1\uffff\1\u00b9\1\u00b5\1\u00b9\1\uffff\1\u00b9\1\uffff\1\u00a6\1\u00a8"+
			"\1\u00b9\1\u00b5\1\uffff\1\u00b5\1\u00a4\3\u00b5\1\u00b9\2\u00b5\1\u00b9"+
			"\3\u00b5\1\u00b9\3\u00b5\1\u009c\1\u00b5\1\u00b6\1\u00b9\1\u00b5\1\uffff"+
			"\1\u00b5\1\uffff\1\u00b5\1\uffff\1\u00b5\1\u00b8\2\u00b5\1\uffff\1\u00b9"+
			"\1\u00b1\1\u00b9\4\u00b5\1\u00b6\1\uffff\2\u00b9\2\u00b5\1\uffff\1\u00b9"+
			"\1\uffff\1\u00b5\3\u00b9\1\uffff\2\u00b5\1\u00b7\2\u00b9\2\u00b5\1\u00b9"+
			"\3\u00b5\1\u00b9\1\u00b6\1\u00b9\1\u00aa\2\u00b9\3\u00b5\1\uffff\4\u00b5"+
			"\2\u00b9\1\uffff\1\u00b5\1\u00b9\3\u00b5\1\u00b9\5\u00b5\1\uffff\1\u00b7"+
			"\6\u00b5\1\uffff\1\u00b5\1\u00b9\2\u00b5\1\u00a1\1\u00b5\1\u00a0\1\u00b5"+
			"\1\u00b9\1\u00b5\2\uffff\1\u00b5\1\uffff\3\u00b9\2\u00b5\1\uffff\2\u00b5"+
			"\1\uffff\1\u00b9\2\u00b5\1\u00b9\1\u00b5\2\uffff\1\u00b5\1\u00b9\1\u00b5"+
			"\1\u00b9\1\u00b5\1\u00b9\1\u00b5\1\u00b9\3\u00b5\1\uffff\2\u00b9\7\u00b5"+
			"\1\u00b9\1\u00b5\2\u00b9\2\u00b5\1\uffff\3\u00b9\3\u00b5\1\uffff\4\u00b5"+
			"\1\u00b9\5\u00b5\1\u00b6\4\u00b5\1\uffff\4\u00b5\1\u009f\1\u00b9\1\u00b5"+
			"\1\uffff\3\u00b5\1\uffff\1\u00a7\1\u00b5\1\u00b9\3\u00b5\1\u00ba\1\u00b9"+
			"\1\u00a9\1\u00b9\1\u00b5\1\uffff\1\u00b5\1\u00b9\1\u009f\1\uffff\3\u00b5"+
			"\1\u00b9\2\u00b5\2\u00b9\3\u00b5\1\u00b9\1\u00b5\1\uffff\1\u00b5\2\uffff"+
			"\1\u00b5\1\uffff\1\u00b9\3\u00b5\3\uffff\1\u00a2\2\uffff\1\u00a3\2\uffff"+
			"\1\u00a5\1\u00a3\7\uffff\1\u009d\1\u00ad\1\u00ab\1\u00a3\1\u00ae\162"+
			"\uffff\1\u00b5\3\uffff\1\u00b5\60\uffff\1\u00b5\3\uffff\1\u00b5\27\uffff"+
			"\1\u00b5\3\uffff\1\u00b5",
			"\1\u00ca\5\uffff\1\u00ce\4\uffff\1\u00cd\7\uffff\1\u00bc\4\u00d3\2\u00d7"+
			"\1\u00d3\1\uffff\1\u00d3\1\u00d0\1\u00d7\1\u00d3\1\u00d7\2\u00d3\1\u00d7"+
			"\3\u00d4\1\u00d7\2\u00d3\1\u00d7\1\uffff\1\u00d3\1\u00d2\1\u00d1\1\u00d3"+
			"\1\uffff\4\u00d3\1\uffff\2\u00d3\1\uffff\4\u00d3\1\uffff\1\u00d7\1\u00d3"+
			"\1\u00d7\1\uffff\1\u00d7\1\uffff\1\u00c4\1\u00c6\1\u00d7\1\u00d3\1\uffff"+
			"\1\u00d3\1\u00c2\3\u00d3\1\u00d7\2\u00d3\1\u00d7\3\u00d3\1\u00d7\3\u00d3"+
			"\1\uffff\1\u00d3\1\u00d4\1\u00d7\1\u00d3\1\uffff\1\u00d3\1\uffff\1\u00d3"+
			"\1\uffff\1\u00d3\1\u00d6\2\u00d3\1\uffff\1\u00d7\1\u00cf\1\u00d7\4\u00d3"+
			"\1\u00d4\1\uffff\2\u00d7\2\u00d3\1\uffff\1\u00d7\1\uffff\1\u00d3\3\u00d7"+
			"\1\uffff\2\u00d3\1\u00d5\2\u00d7\2\u00d3\1\u00d7\3\u00d3\1\u00d7\1\u00d4"+
			"\1\u00d7\1\u00c8\2\u00d7\3\u00d3\1\uffff\4\u00d3\2\u00d7\1\uffff\1\u00d3"+
			"\1\u00d7\3\u00d3\1\u00d7\5\u00d3\1\uffff\1\u00d5\6\u00d3\1\uffff\1\u00d3"+
			"\1\u00d7\2\u00d3\1\u00bf\1\u00d3\1\u00be\1\u00d3\1\u00d7\1\u00d3\2\uffff"+
			"\1\u00d3\1\uffff\3\u00d7\2\u00d3\1\uffff\2\u00d3\1\uffff\1\u00d7\2\u00d3"+
			"\1\u00d7\1\u00d3\2\uffff\1\u00d3\1\u00d7\1\u00d3\1\u00d7\1\u00d3\1\u00d7"+
			"\1\u00d3\1\u00d7\3\u00d3\1\uffff\2\u00d7\7\u00d3\1\u00d7\1\u00d3\2\u00d7"+
			"\2\u00d3\1\uffff\3\u00d7\3\u00d3\1\uffff\4\u00d3\1\u00d7\5\u00d3\1\u00d4"+
			"\4\u00d3\1\uffff\4\u00d3\1\u00bd\1\u00d7\1\u00d3\1\uffff\3\u00d3\1\uffff"+
			"\1\u00c5\1\u00d3\1\u00d7\3\u00d3\1\uffff\1\u00d7\1\u00c7\1\u00d7\1\u00d3"+
			"\1\uffff\1\u00d3\1\u00d7\1\u00bd\1\uffff\3\u00d3\1\u00d7\2\u00d3\2\u00d7"+
			"\3\u00d3\1\u00d7\1\u00d3\1\uffff\1\u00d3\2\uffff\1\u00d3\1\uffff\1\u00d7"+
			"\3\u00d3\3\uffff\1\u00c0\2\uffff\1\u00c1\2\uffff\1\u00c3\1\u00c1\7\uffff"+
			"\1\u00bb\1\u00cb\1\u00c9\1\u00c1\1\u00cc\162\uffff\1\u00d3\3\uffff\1"+
			"\u00d3\60\uffff\1\u00d3\3\uffff\1\u00d3\27\uffff\1\u00d3\3\uffff\1\u00d3",
			"\1\u00e7\5\uffff\1\u00eb\4\uffff\1\u00ea\7\uffff\1\u00d9\4\u00f0\2\u00f4"+
			"\1\u00f0\1\uffff\1\u00f0\1\u00ed\1\u00f4\1\u00f0\1\u00f4\2\u00f0\1\u00f4"+
			"\3\u00f1\1\u00f4\2\u00f0\1\u00f4\1\uffff\1\u00f0\1\u00ef\1\u00ee\1\u00f0"+
			"\1\uffff\4\u00f0\1\uffff\2\u00f0\1\uffff\4\u00f0\1\uffff\1\u00f4\1\u00f0"+
			"\1\u00f4\1\uffff\1\u00f4\1\uffff\1\u00e1\1\u00e3\1\u00f4\1\u00f0\1\uffff"+
			"\1\u00f0\1\u00df\3\u00f0\1\u00f4\2\u00f0\1\u00f4\3\u00f0\1\u00f4\3\u00f0"+
			"\1\uffff\1\u00f0\1\u00f1\1\u00f4\1\u00f0\1\uffff\1\u00f0\1\uffff\1\u00f0"+
			"\1\uffff\1\u00f0\1\u00f3\2\u00f0\1\uffff\1\u00f4\1\u00ec\1\u00f4\4\u00f0"+
			"\1\u00f1\1\uffff\2\u00f4\2\u00f0\1\uffff\1\u00f4\1\uffff\1\u00f0\3\u00f4"+
			"\1\uffff\2\u00f0\1\u00f2\2\u00f4\2\u00f0\1\u00f4\3\u00f0\1\u00f4\1\u00f1"+
			"\1\u00f4\1\u00e5\2\u00f4\3\u00f0\1\uffff\4\u00f0\2\u00f4\1\uffff\1\u00f0"+
			"\1\u00f4\3\u00f0\1\u00f4\5\u00f0\1\uffff\1\u00f2\6\u00f0\1\uffff\1\u00f0"+
			"\1\u00f4\2\u00f0\1\u00dc\1\u00f0\1\u00db\1\u00f0\1\u00f4\1\u00f0\2\uffff"+
			"\1\u00f0\1\uffff\3\u00f4\2\u00f0\1\uffff\2\u00f0\1\uffff\1\u00f4\2\u00f0"+
			"\1\u00f4\1\u00f0\2\uffff\1\u00f0\1\u00f4\1\u00f0\1\u00f4\1\u00f0\1\u00f4"+
			"\1\u00f0\1\u00f4\3\u00f0\1\uffff\2\u00f4\7\u00f0\1\u00f4\1\u00f0\2\u00f4"+
			"\2\u00f0\1\uffff\3\u00f4\3\u00f0\1\uffff\4\u00f0\1\u00f4\5\u00f0\1\u00f1"+
			"\4\u00f0\1\uffff\4\u00f0\1\u00da\1\u00f4\1\u00f0\1\uffff\3\u00f0\1\uffff"+
			"\1\u00e2\1\u00f0\1\u00f4\3\u00f0\1\uffff\1\u00f4\1\u00e4\1\u00f4\1\u00f0"+
			"\1\uffff\1\u00f0\1\u00f4\1\u00da\1\uffff\3\u00f0\1\u00f4\2\u00f0\2\u00f4"+
			"\3\u00f0\1\u00f4\1\u00f0\1\uffff\1\u00f0\2\uffff\1\u00f0\1\uffff\1\u00f4"+
			"\3\u00f0\3\uffff\1\u00dd\2\uffff\1\u00de\2\uffff\1\u00e0\1\u00de\7\uffff"+
			"\1\u00d8\1\u00e8\1\u00e6\1\u00de\1\u00e9\162\uffff\1\u00f0\3\uffff\1"+
			"\u00f0\60\uffff\1\u00f0\3\uffff\1\u00f0\27\uffff\1\u00f0\3\uffff\1\u00f0",
			"\1\u00ff\6\uffff\1\u00f6\10\uffff\1\u00f9\4\u00fa\2\u0103\1\u00fa\1"+
			"\uffff\1\u00fa\1\u0103\1\u00f8\1\u00fa\1\u0103\2\u00fa\5\u0103\2\u00fa"+
			"\1\u0103\1\uffff\1\u00fa\2\uffff\1\u00fa\1\uffff\4\u00fa\1\uffff\2\u00fa"+
			"\1\uffff\4\u00fa\1\uffff\1\u0103\1\u00fa\1\u0103\1\u0100\1\u0103\1\uffff"+
			"\3\u0103\1\u00fa\1\uffff\1\u00fa\1\u0103\3\u00fa\1\u0103\2\u00fa\1\u0103"+
			"\3\u00fa\1\u0103\3\u00fa\1\uffff\1\u00fa\2\u0103\1\u00fa\1\uffff\1\u00fa"+
			"\1\uffff\1\u00fa\1\uffff\1\u00fa\1\u0103\2\u00fa\1\uffff\3\u0103\4\u00fa"+
			"\1\u0103\1\uffff\2\u0103\2\u00fa\1\uffff\1\u0102\1\uffff\1\u00fa\3\u0103"+
			"\1\uffff\2\u00fa\1\uffff\2\u0103\2\u00fa\1\u00fc\3\u00fa\3\u0103\1\uffff"+
			"\2\u0103\3\u00fa\1\u00fd\4\u00fa\1\u00fb\1\u00fe\1\uffff\1\u00fa\1\u0103"+
			"\3\u00fa\1\u0103\5\u00fa\2\uffff\6\u00fa\1\uffff\1\u00fa\1\u0103\2\u00fa"+
			"\1\uffff\1\u00fa\1\u0103\1\u00fa\1\u0103\1\u00fa\2\uffff\1\u00fa\1\uffff"+
			"\3\u0103\2\u00fa\1\uffff\2\u00fa\1\uffff\1\u0103\2\u00fa\1\u0103\1\u00fa"+
			"\2\uffff\1\u00fa\1\u0103\1\u00fa\1\u0103\1\u00fa\1\u0103\1\u00fa\1\u0103"+
			"\3\u00fa\1\uffff\2\u0103\7\u00fa\1\u0103\1\u00fa\1\u0101\1\u0103\2\u00fa"+
			"\1\uffff\3\u0103\3\u00fa\1\uffff\4\u00fa\1\u0103\5\u00fa\1\u0103\4\u00fa"+
			"\1\uffff\5\u00fa\1\u0103\1\u00fa\1\u00f7\3\u00fa\1\uffff\1\u0103\1\u00fa"+
			"\1\u0103\3\u00fa\1\uffff\3\u0103\1\u00fa\1\uffff\1\u00fa\1\u0103\1\u00fa"+
			"\1\uffff\3\u00fa\1\u0103\2\u00fa\2\u0103\3\u00fa\1\u0103\1\u00fa\1\uffff"+
			"\1\u00fa\2\uffff\1\u00fa\1\uffff\1\u0103\3\u00fa\3\uffff\1\u00f5\12\uffff"+
			"\1\u0104\172\uffff\1\u00fa\3\uffff\1\u00fa\60\uffff\1\u00fa\3\uffff\1"+
			"\u00fa\27\uffff\1\u00fa\3\uffff\1\u00fa",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "146:1: fromSource : ( ( LPAREN KW_VALUES )=> fromSource0 | ( LPAREN )=> LPAREN joinSource RPAREN -> joinSource | fromSource0 );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_1 = input.LA(1);
						 
						int index19_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA19_2 = input.LA(1);
						 
						int index19_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA19_3 = input.LA(1);
						 
						int index19_3 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred4_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 37;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 38;}
						 
						input.seek(index19_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA19_4 = input.LA(1);
						 
						int index19_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_4==KW_WITH) ) {s = 103;}
						else if ( (LA19_4==KW_FROM) ) {s = 104;}
						else if ( (LA19_4==KW_INSERT) ) {s = 105;}
						else if ( (LA19_4==KW_SELECT) ) {s = 106;}
						else if ( (LA19_4==KW_MAP) ) {s = 107;}
						else if ( (LA19_4==KW_REDUCE) ) {s = 108;}
						else if ( (LA19_4==KW_VALUES) ) {s = 109;}
						else if ( (LA19_4==Identifier) && (synpred5_FromClauseParser())) {s = 110;}
						else if ( ((LA19_4 >= KW_ABORT && LA19_4 <= KW_AFTER)||LA19_4==KW_ANALYZE||LA19_4==KW_ARCHIVE||LA19_4==KW_ASC||(LA19_4 >= KW_AUTOCOMMIT && LA19_4 <= KW_BEFORE)||(LA19_4 >= KW_BUCKET && LA19_4 <= KW_BUCKETS)||LA19_4==KW_CASCADE||LA19_4==KW_CHANGE||(LA19_4 >= KW_CLUSTER && LA19_4 <= KW_COLLECTION)||(LA19_4 >= KW_COLUMNS && LA19_4 <= KW_COMMENT)||(LA19_4 >= KW_COMPACT && LA19_4 <= KW_CONCATENATE)||LA19_4==KW_CONTINUE||LA19_4==KW_DATA||LA19_4==KW_DATABASES||(LA19_4 >= KW_DATETIME && LA19_4 <= KW_DBPROPERTIES)||(LA19_4 >= KW_DEFERRED && LA19_4 <= KW_DEFINED)||(LA19_4 >= KW_DELIMITED && LA19_4 <= KW_DESC)||(LA19_4 >= KW_DIRECTORIES && LA19_4 <= KW_DISABLE)||LA19_4==KW_DISTRIBUTE||LA19_4==KW_ELEM_TYPE||LA19_4==KW_ENABLE||LA19_4==KW_ESCAPED||LA19_4==KW_EXCLUSIVE||(LA19_4 >= KW_EXPLAIN && LA19_4 <= KW_EXPORT)||(LA19_4 >= KW_FIELDS && LA19_4 <= KW_FIRST)||(LA19_4 >= KW_FORMAT && LA19_4 <= KW_FORMATTED)||LA19_4==KW_FUNCTIONS||(LA19_4 >= KW_HOUR && LA19_4 <= KW_IDXPROPERTIES)||(LA19_4 >= KW_INDEX && LA19_4 <= KW_INDEXES)||(LA19_4 >= KW_INPATH && LA19_4 <= KW_INPUTFORMAT)||(LA19_4 >= KW_ISOLATION && LA19_4 <= KW_JAR)||(LA19_4 >= KW_KEY && LA19_4 <= KW_LAST)||LA19_4==KW_LEVEL||(LA19_4 >= KW_LIMIT && LA19_4 <= KW_LOAD)||(LA19_4 >= KW_LOCATION && LA19_4 <= KW_LONG)||(LA19_4 >= KW_MAPJOIN && LA19_4 <= KW_MONTH)||LA19_4==KW_MSCK||(LA19_4 >= KW_NORELY && LA19_4 <= KW_NOSCAN)||LA19_4==KW_NOVALIDATE||LA19_4==KW_NULLS||LA19_4==KW_OFFSET||LA19_4==KW_OPTION||(LA19_4 >= KW_OUTPUTDRIVER && LA19_4 <= KW_OUTPUTFORMAT)||(LA19_4 >= KW_OVERWRITE && LA19_4 <= KW_OWNER)||(LA19_4 >= KW_PARTITIONED && LA19_4 <= KW_PARTITIONS)||LA19_4==KW_PLUS||LA19_4==KW_PRETTY||LA19_4==KW_PRINCIPALS||LA19_4==KW_PURGE||LA19_4==KW_READ||(LA19_4 >= KW_REBUILD && LA19_4 <= KW_RECORDWRITER)||(LA19_4 >= KW_RELOAD && LA19_4 <= KW_RESTRICT)||LA19_4==KW_REWRITE||(LA19_4 >= KW_ROLE && LA19_4 <= KW_ROLES)||(LA19_4 >= KW_SCHEMA && LA19_4 <= KW_SECOND)||(LA19_4 >= KW_SEMI && LA19_4 <= KW_SERVER)||(LA19_4 >= KW_SETS && LA19_4 <= KW_SKEWED)||(LA19_4 >= KW_SNAPSHOT && LA19_4 <= KW_SSL)||(LA19_4 >= KW_STATISTICS && LA19_4 <= KW_STRUCT)||LA19_4==KW_TABLES||(LA19_4 >= KW_TBLPROPERTIES && LA19_4 <= KW_TERMINATED)||LA19_4==KW_TINYINT||(LA19_4 >= KW_TOUCH && LA19_4 <= KW_TRANSACTIONS)||LA19_4==KW_UNARCHIVE||LA19_4==KW_UNDO||LA19_4==KW_UNIONTYPE||(LA19_4 >= KW_UNLOCK && LA19_4 <= KW_UNSIGNED)||(LA19_4 >= KW_URI && LA19_4 <= KW_USE)||(LA19_4 >= KW_UTC && LA19_4 <= KW_VALIDATE)||LA19_4==KW_VALUE_TYPE||LA19_4==KW_VIEW||LA19_4==KW_WHILE||(LA19_4 >= KW_WORK && LA19_4 <= KW_YEAR)||LA19_4==KW_HOLD_DDLTIME||LA19_4==KW_IGNORE||LA19_4==KW_NO_DROP||LA19_4==KW_OFFLINE||LA19_4==KW_PROTECTION||LA19_4==KW_READONLY) && (synpred5_FromClauseParser())) {s = 111;}
						else if ( ((LA19_4 >= KW_ALL && LA19_4 <= KW_ALTER)||(LA19_4 >= KW_ARRAY && LA19_4 <= KW_AS)||LA19_4==KW_AUTHORIZATION||(LA19_4 >= KW_BETWEEN && LA19_4 <= KW_BOTH)||LA19_4==KW_BY||LA19_4==KW_CONSTRAINT||LA19_4==KW_CREATE||LA19_4==KW_CUBE||(LA19_4 >= KW_CURRENT_DATE && LA19_4 <= KW_CURSOR)||LA19_4==KW_DATE||LA19_4==KW_DECIMAL||LA19_4==KW_DELETE||LA19_4==KW_DESCRIBE||(LA19_4 >= KW_DOUBLE && LA19_4 <= KW_DROP)||LA19_4==KW_EXISTS||(LA19_4 >= KW_EXTERNAL && LA19_4 <= KW_FETCH)||LA19_4==KW_FLOAT||(LA19_4 >= KW_FOR && LA19_4 <= KW_FOREIGN)||LA19_4==KW_FULL||(LA19_4 >= KW_GRANT && LA19_4 <= KW_GROUPING)||(LA19_4 >= KW_IMPORT && LA19_4 <= KW_IN)||LA19_4==KW_INNER||(LA19_4 >= KW_INT && LA19_4 <= KW_INTERSECT)||(LA19_4 >= KW_INTO && LA19_4 <= KW_IS)||(LA19_4 >= KW_LATERAL && LA19_4 <= KW_LEFT)||LA19_4==KW_LIKE||LA19_4==KW_LOCAL||LA19_4==KW_NONE||LA19_4==KW_NULL||LA19_4==KW_OF||(LA19_4 >= KW_ORDER && LA19_4 <= KW_OUTER)||LA19_4==KW_PARTITION||LA19_4==KW_PERCENT||LA19_4==KW_PRIMARY||LA19_4==KW_PROCEDURE||LA19_4==KW_RANGE||LA19_4==KW_READS||(LA19_4 >= KW_REFERENCES && LA19_4 <= KW_REGEXP)||LA19_4==KW_REVOKE||(LA19_4 >= KW_RIGHT && LA19_4 <= KW_RLIKE)||(LA19_4 >= KW_ROLLUP && LA19_4 <= KW_ROWS)||LA19_4==KW_SET||LA19_4==KW_SMALLINT||LA19_4==KW_TABLE||LA19_4==KW_TIMESTAMP||LA19_4==KW_TO||(LA19_4 >= KW_TRIGGER && LA19_4 <= KW_TRUNCATE)||LA19_4==KW_UNION||LA19_4==KW_UPDATE||(LA19_4 >= KW_USER && LA19_4 <= KW_USING)) && (synpred5_FromClauseParser())) {s = 112;}
						else if ( (LA19_4==LPAREN) && (synpred5_FromClauseParser())) {s = 113;}
						else if ( (LA19_4==KW_UNIQUEJOIN) && (synpred5_FromClauseParser())) {s = 114;}
						 
						input.seek(index19_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA19_103 = input.LA(1);
						 
						int index19_103 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_103==Identifier) ) {s = 115;}
						else if ( ((LA19_103 >= KW_ABORT && LA19_103 <= KW_AFTER)||LA19_103==KW_ANALYZE||LA19_103==KW_ARCHIVE||LA19_103==KW_ASC||(LA19_103 >= KW_AUTOCOMMIT && LA19_103 <= KW_BEFORE)||(LA19_103 >= KW_BUCKET && LA19_103 <= KW_BUCKETS)||LA19_103==KW_CASCADE||LA19_103==KW_CHANGE||(LA19_103 >= KW_CLUSTER && LA19_103 <= KW_COLLECTION)||(LA19_103 >= KW_COLUMNS && LA19_103 <= KW_COMMENT)||(LA19_103 >= KW_COMPACT && LA19_103 <= KW_CONCATENATE)||LA19_103==KW_CONTINUE||LA19_103==KW_DATA||LA19_103==KW_DATABASES||(LA19_103 >= KW_DATETIME && LA19_103 <= KW_DBPROPERTIES)||(LA19_103 >= KW_DEFERRED && LA19_103 <= KW_DEFINED)||(LA19_103 >= KW_DELIMITED && LA19_103 <= KW_DESC)||(LA19_103 >= KW_DIRECTORIES && LA19_103 <= KW_DISABLE)||LA19_103==KW_DISTRIBUTE||LA19_103==KW_ELEM_TYPE||LA19_103==KW_ENABLE||LA19_103==KW_ESCAPED||LA19_103==KW_EXCLUSIVE||(LA19_103 >= KW_EXPLAIN && LA19_103 <= KW_EXPORT)||(LA19_103 >= KW_FIELDS && LA19_103 <= KW_FIRST)||(LA19_103 >= KW_FORMAT && LA19_103 <= KW_FORMATTED)||LA19_103==KW_FUNCTIONS||(LA19_103 >= KW_HOUR && LA19_103 <= KW_IDXPROPERTIES)||(LA19_103 >= KW_INDEX && LA19_103 <= KW_INDEXES)||(LA19_103 >= KW_INPATH && LA19_103 <= KW_INPUTFORMAT)||(LA19_103 >= KW_ISOLATION && LA19_103 <= KW_JAR)||(LA19_103 >= KW_KEY && LA19_103 <= KW_LAST)||LA19_103==KW_LEVEL||(LA19_103 >= KW_LIMIT && LA19_103 <= KW_LOAD)||(LA19_103 >= KW_LOCATION && LA19_103 <= KW_LONG)||(LA19_103 >= KW_MAPJOIN && LA19_103 <= KW_MONTH)||LA19_103==KW_MSCK||(LA19_103 >= KW_NORELY && LA19_103 <= KW_NOSCAN)||LA19_103==KW_NOVALIDATE||LA19_103==KW_NULLS||LA19_103==KW_OFFSET||LA19_103==KW_OPTION||(LA19_103 >= KW_OUTPUTDRIVER && LA19_103 <= KW_OUTPUTFORMAT)||(LA19_103 >= KW_OVERWRITE && LA19_103 <= KW_OWNER)||(LA19_103 >= KW_PARTITIONED && LA19_103 <= KW_PARTITIONS)||LA19_103==KW_PLUS||LA19_103==KW_PRETTY||LA19_103==KW_PRINCIPALS||LA19_103==KW_PURGE||LA19_103==KW_READ||(LA19_103 >= KW_REBUILD && LA19_103 <= KW_RECORDWRITER)||(LA19_103 >= KW_RELOAD && LA19_103 <= KW_RESTRICT)||LA19_103==KW_REWRITE||(LA19_103 >= KW_ROLE && LA19_103 <= KW_ROLES)||(LA19_103 >= KW_SCHEMA && LA19_103 <= KW_SECOND)||(LA19_103 >= KW_SEMI && LA19_103 <= KW_SERVER)||(LA19_103 >= KW_SETS && LA19_103 <= KW_SKEWED)||(LA19_103 >= KW_SNAPSHOT && LA19_103 <= KW_SSL)||(LA19_103 >= KW_STATISTICS && LA19_103 <= KW_STRUCT)||LA19_103==KW_TABLES||(LA19_103 >= KW_TBLPROPERTIES && LA19_103 <= KW_TERMINATED)||LA19_103==KW_TINYINT||(LA19_103 >= KW_TOUCH && LA19_103 <= KW_TRANSACTIONS)||LA19_103==KW_UNARCHIVE||LA19_103==KW_UNDO||LA19_103==KW_UNIONTYPE||(LA19_103 >= KW_UNLOCK && LA19_103 <= KW_UNSIGNED)||(LA19_103 >= KW_URI && LA19_103 <= KW_USE)||(LA19_103 >= KW_UTC && LA19_103 <= KW_VALIDATE)||LA19_103==KW_VALUE_TYPE||LA19_103==KW_VIEW||LA19_103==KW_WHILE||(LA19_103 >= KW_WORK && LA19_103 <= KW_YEAR)||LA19_103==KW_HOLD_DDLTIME||LA19_103==KW_IGNORE||LA19_103==KW_NO_DROP||LA19_103==KW_OFFLINE||LA19_103==KW_PROTECTION||LA19_103==KW_READONLY) ) {s = 116;}
						else if ( (LA19_103==KW_AS) ) {s = 117;}
						else if ( (LA19_103==DOT) && (synpred5_FromClauseParser())) {s = 118;}
						else if ( (LA19_103==LPAREN) && (synpred5_FromClauseParser())) {s = 119;}
						else if ( (LA19_103==KW_TABLESAMPLE) && (synpred5_FromClauseParser())) {s = 120;}
						else if ( (LA19_103==KW_LATERAL) ) {s = 121;}
						else if ( (LA19_103==KW_INNER) ) {s = 122;}
						else if ( (LA19_103==KW_JOIN) && (synpred5_FromClauseParser())) {s = 123;}
						else if ( (LA19_103==KW_LEFT) ) {s = 124;}
						else if ( (LA19_103==COMMA) && (synpred5_FromClauseParser())) {s = 125;}
						else if ( (LA19_103==KW_CROSS) && (synpred5_FromClauseParser())) {s = 126;}
						else if ( (LA19_103==KW_RIGHT) ) {s = 127;}
						else if ( (LA19_103==KW_FULL) ) {s = 128;}
						else if ( ((LA19_103 >= KW_ALL && LA19_103 <= KW_ALTER)||LA19_103==KW_ARRAY||LA19_103==KW_AUTHORIZATION||(LA19_103 >= KW_BETWEEN && LA19_103 <= KW_BOTH)||LA19_103==KW_BY||LA19_103==KW_CONSTRAINT||LA19_103==KW_CREATE||LA19_103==KW_CUBE||(LA19_103 >= KW_CURRENT_DATE && LA19_103 <= KW_CURSOR)||LA19_103==KW_DATE||LA19_103==KW_DECIMAL||LA19_103==KW_DELETE||LA19_103==KW_DESCRIBE||(LA19_103 >= KW_DOUBLE && LA19_103 <= KW_DROP)||LA19_103==KW_EXISTS||(LA19_103 >= KW_EXTERNAL && LA19_103 <= KW_FETCH)||LA19_103==KW_FLOAT||(LA19_103 >= KW_FOR && LA19_103 <= KW_FOREIGN)||(LA19_103 >= KW_GRANT && LA19_103 <= KW_GROUPING)||(LA19_103 >= KW_IMPORT && LA19_103 <= KW_IN)||(LA19_103 >= KW_INSERT && LA19_103 <= KW_INTERSECT)||(LA19_103 >= KW_INTO && LA19_103 <= KW_IS)||LA19_103==KW_LIKE||LA19_103==KW_LOCAL||LA19_103==KW_NONE||LA19_103==KW_NULL||LA19_103==KW_OF||(LA19_103 >= KW_ORDER && LA19_103 <= KW_OUTER)||LA19_103==KW_PARTITION||LA19_103==KW_PERCENT||LA19_103==KW_PRIMARY||LA19_103==KW_PROCEDURE||LA19_103==KW_RANGE||LA19_103==KW_READS||(LA19_103 >= KW_REFERENCES && LA19_103 <= KW_REGEXP)||LA19_103==KW_REVOKE||LA19_103==KW_RLIKE||(LA19_103 >= KW_ROLLUP && LA19_103 <= KW_ROWS)||LA19_103==KW_SET||LA19_103==KW_SMALLINT||LA19_103==KW_TABLE||LA19_103==KW_TIMESTAMP||LA19_103==KW_TO||(LA19_103 >= KW_TRIGGER && LA19_103 <= KW_TRUNCATE)||LA19_103==KW_UNION||LA19_103==KW_UPDATE||(LA19_103 >= KW_USER && LA19_103 <= KW_USING)||LA19_103==KW_VALUES||LA19_103==KW_WITH) ) {s = 129;}
						else if ( (LA19_103==RPAREN) && (synpred5_FromClauseParser())) {s = 130;}
						 
						input.seek(index19_103);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA19_105 = input.LA(1);
						 
						int index19_105 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_105==KW_OVERWRITE) ) {s = 136;}
						else if ( (LA19_105==KW_INTO) ) {s = 137;}
						else if ( (LA19_105==DOT) && (synpred5_FromClauseParser())) {s = 138;}
						else if ( (LA19_105==LPAREN) && (synpred5_FromClauseParser())) {s = 139;}
						else if ( (LA19_105==KW_TABLESAMPLE) && (synpred5_FromClauseParser())) {s = 140;}
						else if ( (LA19_105==KW_AS) && (synpred5_FromClauseParser())) {s = 141;}
						else if ( (LA19_105==Identifier) && (synpred5_FromClauseParser())) {s = 142;}
						else if ( ((LA19_105 >= KW_ABORT && LA19_105 <= KW_AFTER)||LA19_105==KW_ANALYZE||LA19_105==KW_ARCHIVE||LA19_105==KW_ASC||(LA19_105 >= KW_AUTOCOMMIT && LA19_105 <= KW_BEFORE)||(LA19_105 >= KW_BUCKET && LA19_105 <= KW_BUCKETS)||LA19_105==KW_CASCADE||LA19_105==KW_CHANGE||(LA19_105 >= KW_CLUSTER && LA19_105 <= KW_COLLECTION)||(LA19_105 >= KW_COLUMNS && LA19_105 <= KW_COMMENT)||(LA19_105 >= KW_COMPACT && LA19_105 <= KW_CONCATENATE)||LA19_105==KW_CONTINUE||LA19_105==KW_DATA||LA19_105==KW_DATABASES||(LA19_105 >= KW_DATETIME && LA19_105 <= KW_DBPROPERTIES)||(LA19_105 >= KW_DEFERRED && LA19_105 <= KW_DEFINED)||(LA19_105 >= KW_DELIMITED && LA19_105 <= KW_DESC)||(LA19_105 >= KW_DIRECTORIES && LA19_105 <= KW_DISABLE)||LA19_105==KW_DISTRIBUTE||LA19_105==KW_ELEM_TYPE||LA19_105==KW_ENABLE||LA19_105==KW_ESCAPED||LA19_105==KW_EXCLUSIVE||(LA19_105 >= KW_EXPLAIN && LA19_105 <= KW_EXPORT)||(LA19_105 >= KW_FIELDS && LA19_105 <= KW_FIRST)||(LA19_105 >= KW_FORMAT && LA19_105 <= KW_FORMATTED)||LA19_105==KW_FUNCTIONS||(LA19_105 >= KW_HOUR && LA19_105 <= KW_IDXPROPERTIES)||(LA19_105 >= KW_INDEX && LA19_105 <= KW_INDEXES)||(LA19_105 >= KW_INPATH && LA19_105 <= KW_INPUTFORMAT)||(LA19_105 >= KW_ISOLATION && LA19_105 <= KW_JAR)||(LA19_105 >= KW_KEY && LA19_105 <= KW_LAST)||LA19_105==KW_LEVEL||(LA19_105 >= KW_LIMIT && LA19_105 <= KW_LOAD)||(LA19_105 >= KW_LOCATION && LA19_105 <= KW_LONG)||(LA19_105 >= KW_MAPJOIN && LA19_105 <= KW_MONTH)||LA19_105==KW_MSCK||(LA19_105 >= KW_NORELY && LA19_105 <= KW_NOSCAN)||LA19_105==KW_NOVALIDATE||LA19_105==KW_NULLS||LA19_105==KW_OFFSET||LA19_105==KW_OPTION||(LA19_105 >= KW_OUTPUTDRIVER && LA19_105 <= KW_OUTPUTFORMAT)||LA19_105==KW_OWNER||(LA19_105 >= KW_PARTITIONED && LA19_105 <= KW_PARTITIONS)||LA19_105==KW_PLUS||LA19_105==KW_PRETTY||LA19_105==KW_PRINCIPALS||LA19_105==KW_PURGE||LA19_105==KW_READ||(LA19_105 >= KW_REBUILD && LA19_105 <= KW_RECORDWRITER)||(LA19_105 >= KW_RELOAD && LA19_105 <= KW_RESTRICT)||LA19_105==KW_REWRITE||(LA19_105 >= KW_ROLE && LA19_105 <= KW_ROLES)||(LA19_105 >= KW_SCHEMA && LA19_105 <= KW_SECOND)||(LA19_105 >= KW_SEMI && LA19_105 <= KW_SERVER)||(LA19_105 >= KW_SETS && LA19_105 <= KW_SKEWED)||(LA19_105 >= KW_SNAPSHOT && LA19_105 <= KW_SSL)||(LA19_105 >= KW_STATISTICS && LA19_105 <= KW_STRUCT)||LA19_105==KW_TABLES||(LA19_105 >= KW_TBLPROPERTIES && LA19_105 <= KW_TERMINATED)||LA19_105==KW_TINYINT||(LA19_105 >= KW_TOUCH && LA19_105 <= KW_TRANSACTIONS)||LA19_105==KW_UNARCHIVE||LA19_105==KW_UNDO||LA19_105==KW_UNIONTYPE||(LA19_105 >= KW_UNLOCK && LA19_105 <= KW_UNSIGNED)||(LA19_105 >= KW_URI && LA19_105 <= KW_USE)||(LA19_105 >= KW_UTC && LA19_105 <= KW_VALIDATE)||LA19_105==KW_VALUE_TYPE||LA19_105==KW_VIEW||LA19_105==KW_WHILE||(LA19_105 >= KW_WORK && LA19_105 <= KW_YEAR)||LA19_105==KW_HOLD_DDLTIME||LA19_105==KW_IGNORE||LA19_105==KW_NO_DROP||LA19_105==KW_OFFLINE||LA19_105==KW_PROTECTION||LA19_105==KW_READONLY) && (synpred5_FromClauseParser())) {s = 143;}
						else if ( (LA19_105==KW_LATERAL) && (synpred5_FromClauseParser())) {s = 144;}
						else if ( (LA19_105==KW_INNER) && (synpred5_FromClauseParser())) {s = 145;}
						else if ( (LA19_105==KW_JOIN) && (synpred5_FromClauseParser())) {s = 146;}
						else if ( (LA19_105==KW_LEFT) && (synpred5_FromClauseParser())) {s = 147;}
						else if ( (LA19_105==COMMA) && (synpred5_FromClauseParser())) {s = 148;}
						else if ( (LA19_105==KW_CROSS) && (synpred5_FromClauseParser())) {s = 149;}
						else if ( (LA19_105==KW_RIGHT) && (synpred5_FromClauseParser())) {s = 150;}
						else if ( (LA19_105==KW_FULL) && (synpred5_FromClauseParser())) {s = 151;}
						else if ( ((LA19_105 >= KW_ALL && LA19_105 <= KW_ALTER)||LA19_105==KW_ARRAY||LA19_105==KW_AUTHORIZATION||(LA19_105 >= KW_BETWEEN && LA19_105 <= KW_BOTH)||LA19_105==KW_BY||LA19_105==KW_CONSTRAINT||LA19_105==KW_CREATE||LA19_105==KW_CUBE||(LA19_105 >= KW_CURRENT_DATE && LA19_105 <= KW_CURSOR)||LA19_105==KW_DATE||LA19_105==KW_DECIMAL||LA19_105==KW_DELETE||LA19_105==KW_DESCRIBE||(LA19_105 >= KW_DOUBLE && LA19_105 <= KW_DROP)||LA19_105==KW_EXISTS||(LA19_105 >= KW_EXTERNAL && LA19_105 <= KW_FETCH)||LA19_105==KW_FLOAT||(LA19_105 >= KW_FOR && LA19_105 <= KW_FOREIGN)||(LA19_105 >= KW_GRANT && LA19_105 <= KW_GROUPING)||(LA19_105 >= KW_IMPORT && LA19_105 <= KW_IN)||(LA19_105 >= KW_INSERT && LA19_105 <= KW_INTERSECT)||LA19_105==KW_IS||LA19_105==KW_LIKE||LA19_105==KW_LOCAL||LA19_105==KW_NONE||LA19_105==KW_NULL||LA19_105==KW_OF||(LA19_105 >= KW_ORDER && LA19_105 <= KW_OUTER)||LA19_105==KW_PARTITION||LA19_105==KW_PERCENT||LA19_105==KW_PRIMARY||LA19_105==KW_PROCEDURE||LA19_105==KW_RANGE||LA19_105==KW_READS||(LA19_105 >= KW_REFERENCES && LA19_105 <= KW_REGEXP)||LA19_105==KW_REVOKE||LA19_105==KW_RLIKE||(LA19_105 >= KW_ROLLUP && LA19_105 <= KW_ROWS)||LA19_105==KW_SET||LA19_105==KW_SMALLINT||LA19_105==KW_TABLE||LA19_105==KW_TIMESTAMP||LA19_105==KW_TO||(LA19_105 >= KW_TRIGGER && LA19_105 <= KW_TRUNCATE)||LA19_105==KW_UNION||LA19_105==KW_UPDATE||(LA19_105 >= KW_USER && LA19_105 <= KW_USING)||LA19_105==KW_VALUES||LA19_105==KW_WITH) && (synpred5_FromClauseParser())) {s = 152;}
						else if ( (LA19_105==RPAREN) && (synpred5_FromClauseParser())) {s = 153;}
						 
						input.seek(index19_105);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA19_109 = input.LA(1);
						 
						int index19_109 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_109==LPAREN) ) {s = 245;}
						else if ( (LA19_109==DOT) && (synpred5_FromClauseParser())) {s = 246;}
						else if ( (LA19_109==KW_TABLESAMPLE) && (synpred5_FromClauseParser())) {s = 247;}
						else if ( (LA19_109==KW_AS) && (synpred5_FromClauseParser())) {s = 248;}
						else if ( (LA19_109==Identifier) && (synpred5_FromClauseParser())) {s = 249;}
						else if ( ((LA19_109 >= KW_ABORT && LA19_109 <= KW_AFTER)||LA19_109==KW_ANALYZE||LA19_109==KW_ARCHIVE||LA19_109==KW_ASC||(LA19_109 >= KW_AUTOCOMMIT && LA19_109 <= KW_BEFORE)||(LA19_109 >= KW_BUCKET && LA19_109 <= KW_BUCKETS)||LA19_109==KW_CASCADE||LA19_109==KW_CHANGE||(LA19_109 >= KW_CLUSTER && LA19_109 <= KW_COLLECTION)||(LA19_109 >= KW_COLUMNS && LA19_109 <= KW_COMMENT)||(LA19_109 >= KW_COMPACT && LA19_109 <= KW_CONCATENATE)||LA19_109==KW_CONTINUE||LA19_109==KW_DATA||LA19_109==KW_DATABASES||(LA19_109 >= KW_DATETIME && LA19_109 <= KW_DBPROPERTIES)||(LA19_109 >= KW_DEFERRED && LA19_109 <= KW_DEFINED)||(LA19_109 >= KW_DELIMITED && LA19_109 <= KW_DESC)||(LA19_109 >= KW_DIRECTORIES && LA19_109 <= KW_DISABLE)||LA19_109==KW_DISTRIBUTE||LA19_109==KW_ELEM_TYPE||LA19_109==KW_ENABLE||LA19_109==KW_ESCAPED||LA19_109==KW_EXCLUSIVE||(LA19_109 >= KW_EXPLAIN && LA19_109 <= KW_EXPORT)||(LA19_109 >= KW_FIELDS && LA19_109 <= KW_FIRST)||(LA19_109 >= KW_FORMAT && LA19_109 <= KW_FORMATTED)||LA19_109==KW_FUNCTIONS||(LA19_109 >= KW_HOUR && LA19_109 <= KW_IDXPROPERTIES)||(LA19_109 >= KW_INDEX && LA19_109 <= KW_INDEXES)||(LA19_109 >= KW_INPATH && LA19_109 <= KW_INPUTFORMAT)||(LA19_109 >= KW_ISOLATION && LA19_109 <= KW_JAR)||(LA19_109 >= KW_KEY && LA19_109 <= KW_LAST)||LA19_109==KW_LEVEL||(LA19_109 >= KW_LIMIT && LA19_109 <= KW_LOAD)||(LA19_109 >= KW_LOCATION && LA19_109 <= KW_LONG)||(LA19_109 >= KW_MAPJOIN && LA19_109 <= KW_MONTH)||LA19_109==KW_MSCK||(LA19_109 >= KW_NORELY && LA19_109 <= KW_NOSCAN)||LA19_109==KW_NOVALIDATE||LA19_109==KW_NULLS||LA19_109==KW_OFFSET||LA19_109==KW_OPTION||(LA19_109 >= KW_OUTPUTDRIVER && LA19_109 <= KW_OUTPUTFORMAT)||(LA19_109 >= KW_OVERWRITE && LA19_109 <= KW_OWNER)||(LA19_109 >= KW_PARTITIONED && LA19_109 <= KW_PARTITIONS)||LA19_109==KW_PLUS||LA19_109==KW_PRETTY||LA19_109==KW_PRINCIPALS||LA19_109==KW_PURGE||LA19_109==KW_READ||(LA19_109 >= KW_REBUILD && LA19_109 <= KW_RECORDWRITER)||(LA19_109 >= KW_RELOAD && LA19_109 <= KW_RESTRICT)||LA19_109==KW_REWRITE||(LA19_109 >= KW_ROLE && LA19_109 <= KW_ROLES)||(LA19_109 >= KW_SCHEMA && LA19_109 <= KW_SECOND)||(LA19_109 >= KW_SEMI && LA19_109 <= KW_SERVER)||(LA19_109 >= KW_SETS && LA19_109 <= KW_SKEWED)||(LA19_109 >= KW_SNAPSHOT && LA19_109 <= KW_SSL)||(LA19_109 >= KW_STATISTICS && LA19_109 <= KW_STRUCT)||LA19_109==KW_TABLES||(LA19_109 >= KW_TBLPROPERTIES && LA19_109 <= KW_TERMINATED)||LA19_109==KW_TINYINT||(LA19_109 >= KW_TOUCH && LA19_109 <= KW_TRANSACTIONS)||LA19_109==KW_UNARCHIVE||LA19_109==KW_UNDO||LA19_109==KW_UNIONTYPE||(LA19_109 >= KW_UNLOCK && LA19_109 <= KW_UNSIGNED)||(LA19_109 >= KW_URI && LA19_109 <= KW_USE)||(LA19_109 >= KW_UTC && LA19_109 <= KW_VALIDATE)||LA19_109==KW_VALUE_TYPE||LA19_109==KW_VIEW||LA19_109==KW_WHILE||(LA19_109 >= KW_WORK && LA19_109 <= KW_YEAR)||LA19_109==KW_HOLD_DDLTIME||LA19_109==KW_IGNORE||LA19_109==KW_NO_DROP||LA19_109==KW_OFFLINE||LA19_109==KW_PROTECTION||LA19_109==KW_READONLY) && (synpred5_FromClauseParser())) {s = 250;}
						else if ( (LA19_109==KW_LATERAL) && (synpred5_FromClauseParser())) {s = 251;}
						else if ( (LA19_109==KW_INNER) && (synpred5_FromClauseParser())) {s = 252;}
						else if ( (LA19_109==KW_JOIN) && (synpred5_FromClauseParser())) {s = 253;}
						else if ( (LA19_109==KW_LEFT) && (synpred5_FromClauseParser())) {s = 254;}
						else if ( (LA19_109==COMMA) && (synpred5_FromClauseParser())) {s = 255;}
						else if ( (LA19_109==KW_CROSS) && (synpred5_FromClauseParser())) {s = 256;}
						else if ( (LA19_109==KW_RIGHT) && (synpred5_FromClauseParser())) {s = 257;}
						else if ( (LA19_109==KW_FULL) && (synpred5_FromClauseParser())) {s = 258;}
						else if ( ((LA19_109 >= KW_ALL && LA19_109 <= KW_ALTER)||LA19_109==KW_ARRAY||LA19_109==KW_AUTHORIZATION||(LA19_109 >= KW_BETWEEN && LA19_109 <= KW_BOTH)||LA19_109==KW_BY||LA19_109==KW_CONSTRAINT||LA19_109==KW_CREATE||LA19_109==KW_CUBE||(LA19_109 >= KW_CURRENT_DATE && LA19_109 <= KW_CURSOR)||LA19_109==KW_DATE||LA19_109==KW_DECIMAL||LA19_109==KW_DELETE||LA19_109==KW_DESCRIBE||(LA19_109 >= KW_DOUBLE && LA19_109 <= KW_DROP)||LA19_109==KW_EXISTS||(LA19_109 >= KW_EXTERNAL && LA19_109 <= KW_FETCH)||LA19_109==KW_FLOAT||(LA19_109 >= KW_FOR && LA19_109 <= KW_FOREIGN)||(LA19_109 >= KW_GRANT && LA19_109 <= KW_GROUPING)||(LA19_109 >= KW_IMPORT && LA19_109 <= KW_IN)||(LA19_109 >= KW_INSERT && LA19_109 <= KW_INTERSECT)||(LA19_109 >= KW_INTO && LA19_109 <= KW_IS)||LA19_109==KW_LIKE||LA19_109==KW_LOCAL||LA19_109==KW_NONE||LA19_109==KW_NULL||LA19_109==KW_OF||(LA19_109 >= KW_ORDER && LA19_109 <= KW_OUTER)||LA19_109==KW_PARTITION||LA19_109==KW_PERCENT||LA19_109==KW_PRIMARY||LA19_109==KW_PROCEDURE||LA19_109==KW_RANGE||LA19_109==KW_READS||(LA19_109 >= KW_REFERENCES && LA19_109 <= KW_REGEXP)||LA19_109==KW_REVOKE||LA19_109==KW_RLIKE||(LA19_109 >= KW_ROLLUP && LA19_109 <= KW_ROWS)||LA19_109==KW_SET||LA19_109==KW_SMALLINT||LA19_109==KW_TABLE||LA19_109==KW_TIMESTAMP||LA19_109==KW_TO||(LA19_109 >= KW_TRIGGER && LA19_109 <= KW_TRUNCATE)||LA19_109==KW_UNION||LA19_109==KW_UPDATE||(LA19_109 >= KW_USER && LA19_109 <= KW_USING)||LA19_109==KW_VALUES||LA19_109==KW_WITH) && (synpred5_FromClauseParser())) {s = 259;}
						else if ( (LA19_109==RPAREN) && (synpred5_FromClauseParser())) {s = 260;}
						 
						input.seek(index19_109);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA19_115 = input.LA(1);
						 
						int index19_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_115);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA19_116 = input.LA(1);
						 
						int index19_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_116);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA19_117 = input.LA(1);
						 
						int index19_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_117);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA19_121 = input.LA(1);
						 
						int index19_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_121);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA19_122 = input.LA(1);
						 
						int index19_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_122);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA19_124 = input.LA(1);
						 
						int index19_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_124);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA19_127 = input.LA(1);
						 
						int index19_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_127);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA19_128 = input.LA(1);
						 
						int index19_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_128);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA19_129 = input.LA(1);
						 
						int index19_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_129);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA19_131 = input.LA(1);
						 
						int index19_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_131);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA19_132 = input.LA(1);
						 
						int index19_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_132);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA19_133 = input.LA(1);
						 
						int index19_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_133);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA19_134 = input.LA(1);
						 
						int index19_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_134);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA19_135 = input.LA(1);
						 
						int index19_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_135);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA19_136 = input.LA(1);
						 
						int index19_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_136);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA19_137 = input.LA(1);
						 
						int index19_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_137);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA19_154 = input.LA(1);
						 
						int index19_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_154);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA19_155 = input.LA(1);
						 
						int index19_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_155);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA19_156 = input.LA(1);
						 
						int index19_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_156);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA19_157 = input.LA(1);
						 
						int index19_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_157);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA19_158 = input.LA(1);
						 
						int index19_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_158);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA19_159 = input.LA(1);
						 
						int index19_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_159);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA19_160 = input.LA(1);
						 
						int index19_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_160);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA19_161 = input.LA(1);
						 
						int index19_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_161);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA19_162 = input.LA(1);
						 
						int index19_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_162);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA19_163 = input.LA(1);
						 
						int index19_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_163);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA19_164 = input.LA(1);
						 
						int index19_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_164);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA19_165 = input.LA(1);
						 
						int index19_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_165);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA19_166 = input.LA(1);
						 
						int index19_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_166);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA19_167 = input.LA(1);
						 
						int index19_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_167);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA19_168 = input.LA(1);
						 
						int index19_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_168);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA19_169 = input.LA(1);
						 
						int index19_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_169);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA19_170 = input.LA(1);
						 
						int index19_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_170);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA19_171 = input.LA(1);
						 
						int index19_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_171);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA19_172 = input.LA(1);
						 
						int index19_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_172);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA19_173 = input.LA(1);
						 
						int index19_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_173);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA19_174 = input.LA(1);
						 
						int index19_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_174);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA19_175 = input.LA(1);
						 
						int index19_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_175);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA19_176 = input.LA(1);
						 
						int index19_176 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_176);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA19_177 = input.LA(1);
						 
						int index19_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_177);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA19_178 = input.LA(1);
						 
						int index19_178 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_178);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA19_179 = input.LA(1);
						 
						int index19_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_179);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA19_180 = input.LA(1);
						 
						int index19_180 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_180);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA19_181 = input.LA(1);
						 
						int index19_181 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_181);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA19_182 = input.LA(1);
						 
						int index19_182 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_182);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA19_183 = input.LA(1);
						 
						int index19_183 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_183);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA19_184 = input.LA(1);
						 
						int index19_184 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_184);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA19_185 = input.LA(1);
						 
						int index19_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_185);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA19_186 = input.LA(1);
						 
						int index19_186 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_186);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA19_187 = input.LA(1);
						 
						int index19_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_187);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA19_188 = input.LA(1);
						 
						int index19_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_188);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA19_189 = input.LA(1);
						 
						int index19_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_189);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA19_190 = input.LA(1);
						 
						int index19_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_190);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA19_191 = input.LA(1);
						 
						int index19_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_191);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA19_192 = input.LA(1);
						 
						int index19_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_192);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA19_193 = input.LA(1);
						 
						int index19_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_193);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA19_194 = input.LA(1);
						 
						int index19_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_194);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA19_195 = input.LA(1);
						 
						int index19_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_195);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA19_196 = input.LA(1);
						 
						int index19_196 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_196);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA19_197 = input.LA(1);
						 
						int index19_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_197);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA19_198 = input.LA(1);
						 
						int index19_198 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_198);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA19_199 = input.LA(1);
						 
						int index19_199 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_199);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA19_200 = input.LA(1);
						 
						int index19_200 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_200);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA19_201 = input.LA(1);
						 
						int index19_201 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_201);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA19_202 = input.LA(1);
						 
						int index19_202 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_202);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA19_203 = input.LA(1);
						 
						int index19_203 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_203);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA19_204 = input.LA(1);
						 
						int index19_204 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_204);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA19_205 = input.LA(1);
						 
						int index19_205 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_205);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA19_206 = input.LA(1);
						 
						int index19_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_206);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA19_207 = input.LA(1);
						 
						int index19_207 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_207);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA19_208 = input.LA(1);
						 
						int index19_208 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_208);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA19_209 = input.LA(1);
						 
						int index19_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_209);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA19_210 = input.LA(1);
						 
						int index19_210 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_210);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA19_211 = input.LA(1);
						 
						int index19_211 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_211);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA19_212 = input.LA(1);
						 
						int index19_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_212);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA19_213 = input.LA(1);
						 
						int index19_213 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_213);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA19_214 = input.LA(1);
						 
						int index19_214 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_214);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA19_215 = input.LA(1);
						 
						int index19_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_215);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA19_216 = input.LA(1);
						 
						int index19_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_216);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA19_217 = input.LA(1);
						 
						int index19_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_217);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA19_218 = input.LA(1);
						 
						int index19_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_218);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA19_219 = input.LA(1);
						 
						int index19_219 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_219);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA19_220 = input.LA(1);
						 
						int index19_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_220);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA19_221 = input.LA(1);
						 
						int index19_221 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_221);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA19_222 = input.LA(1);
						 
						int index19_222 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_222);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA19_223 = input.LA(1);
						 
						int index19_223 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_223);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA19_224 = input.LA(1);
						 
						int index19_224 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_224);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA19_225 = input.LA(1);
						 
						int index19_225 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_225);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA19_226 = input.LA(1);
						 
						int index19_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_226);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA19_227 = input.LA(1);
						 
						int index19_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_227);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA19_228 = input.LA(1);
						 
						int index19_228 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_228);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA19_229 = input.LA(1);
						 
						int index19_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_229);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA19_230 = input.LA(1);
						 
						int index19_230 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_230);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA19_231 = input.LA(1);
						 
						int index19_231 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_231);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA19_232 = input.LA(1);
						 
						int index19_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_232);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA19_233 = input.LA(1);
						 
						int index19_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_233);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA19_234 = input.LA(1);
						 
						int index19_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_234);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA19_235 = input.LA(1);
						 
						int index19_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_235);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA19_236 = input.LA(1);
						 
						int index19_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_236);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA19_237 = input.LA(1);
						 
						int index19_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_237);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA19_238 = input.LA(1);
						 
						int index19_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_238);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA19_239 = input.LA(1);
						 
						int index19_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_239);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA19_240 = input.LA(1);
						 
						int index19_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_240);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA19_241 = input.LA(1);
						 
						int index19_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_241);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA19_242 = input.LA(1);
						 
						int index19_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_242);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA19_243 = input.LA(1);
						 
						int index19_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_243);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA19_244 = input.LA(1);
						 
						int index19_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_244);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA19_245 = input.LA(1);
						 
						int index19_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 37;}
						else if ( (synpred5_FromClauseParser()) ) {s = 260;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index19_245);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA20_eotS =
		"\111\uffff";
	static final String DFA20_eofS =
		"\1\uffff\1\2\107\uffff";
	static final String DFA20_minS =
		"\1\32\1\12\2\uffff\1\174\1\7\103\uffff";
	static final String DFA20_maxS =
		"\2\u0216\2\uffff\1\u0134\1\u0216\103\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\42\uffff\1\3\5\uffff\1\4\1\1\34\uffff";
	static final String DFA20_specialS =
		"\5\uffff\1\0\103\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\1\7\2\1\uffff\17\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2"+
			"\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\20\2\1\uffff"+
			"\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\13\2\2\uffff\6\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\13\2\1\uffff\17\2\1\uffff\6\2\1\uffff\17\2\1"+
			"\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15"+
			"\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\3\uffff\1\4\u0085\uffff\1\2\3"+
			"\uffff\1\2\60\uffff\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\2\6\uffff\1\2\10\uffff\10\2\1\uffff\17\2\1\uffff\1\2\2\uffff\1\2"+
			"\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff"+
			"\20\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1"+
			"\uffff\4\2\1\uffff\1\2\1\uffff\7\2\1\uffff\13\2\1\uffff\14\2\1\uffff"+
			"\13\2\1\uffff\7\2\1\uffff\4\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\33\2\1\uffff\26\2\1\uffff\13\2\1\uffff\6\2\1"+
			"\uffff\4\2\1\uffff\3\2\1\uffff\15\2\1\uffff\1\2\1\uffff\7\2\3\uffff\1"+
			"\5\12\uffff\1\2\172\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff\1\2\27"+
			"\uffff\1\2\3\uffff\1\2",
			"",
			"",
			"\1\45\22\uffff\1\45\34\uffff\1\45\60\uffff\1\45\26\uffff\1\45\67\uffff"+
			"\1\53\7\uffff\1\45",
			"\1\2\5\uffff\1\2\4\uffff\1\2\7\uffff\10\2\1\uffff\17\2\1\uffff\4\2\1"+
			"\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4"+
			"\2\1\uffff\20\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\10\2\1\uffff\4\2\1\uffff\1\2\1\uffff\4\2\1\uffff\24\2\1\uffff\6\2\1"+
			"\uffff\13\2\1\uffff\7\2\1\uffff\12\2\1\54\1\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\13\2\1\uffff\17\2\1\uffff\6\2\1\uffff\17\2\1"+
			"\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15"+
			"\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\3\uffff\1\2\2\uffff\1\2\2\uffff"+
			"\2\2\10\uffff\4\2\162\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff\1\2"+
			"\27\uffff\1\2\3\uffff\1\2",
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
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "160:5: ( ( Identifier LPAREN )=> partitionedTableFunction | tableSource | subQuerySource | virtualTableSource )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_5 = input.LA(1);
						 
						int index20_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA20_5==KW_ON) && (synpred6_FromClauseParser())) {s = 44;}
						else if ( (LA20_5==BigintLiteral||LA20_5==CharSetName||LA20_5==DecimalLiteral||(LA20_5 >= Identifier && LA20_5 <= KW_ANALYZE)||(LA20_5 >= KW_ARCHIVE && LA20_5 <= KW_BY)||(LA20_5 >= KW_CASCADE && LA20_5 <= KW_CHANGE)||(LA20_5 >= KW_CLUSTER && LA20_5 <= KW_COLLECTION)||(LA20_5 >= KW_COLUMNS && LA20_5 <= KW_COMMENT)||(LA20_5 >= KW_COMPACT && LA20_5 <= KW_CONCATENATE)||(LA20_5 >= KW_CONSTRAINT && LA20_5 <= KW_CREATE)||LA20_5==KW_CUBE||(LA20_5 >= KW_CURRENT_DATE && LA20_5 <= KW_DATA)||(LA20_5 >= KW_DATABASES && LA20_5 <= KW_DISABLE)||(LA20_5 >= KW_DISTRIBUTE && LA20_5 <= KW_ELEM_TYPE)||LA20_5==KW_ENABLE||LA20_5==KW_ESCAPED||(LA20_5 >= KW_EXCLUSIVE && LA20_5 <= KW_EXPORT)||(LA20_5 >= KW_EXTERNAL && LA20_5 <= KW_FLOAT)||(LA20_5 >= KW_FOR && LA20_5 <= KW_FORMATTED)||LA20_5==KW_FULL||(LA20_5 >= KW_FUNCTIONS && LA20_5 <= KW_GROUPING)||(LA20_5 >= KW_HOUR && LA20_5 <= KW_JAR)||(LA20_5 >= KW_KEY && LA20_5 <= KW_LEFT)||(LA20_5 >= KW_LEVEL && LA20_5 <= KW_LONG)||(LA20_5 >= KW_MAP && LA20_5 <= KW_MONTH)||(LA20_5 >= KW_MSCK && LA20_5 <= KW_OFFSET)||LA20_5==KW_OPTION||(LA20_5 >= KW_ORDER && LA20_5 <= KW_OUTPUTFORMAT)||(LA20_5 >= KW_OVERWRITE && LA20_5 <= KW_OWNER)||(LA20_5 >= KW_PARTITION && LA20_5 <= KW_PLUS)||(LA20_5 >= KW_PRETTY && LA20_5 <= KW_RECORDWRITER)||(LA20_5 >= KW_REFERENCES && LA20_5 <= KW_ROLES)||(LA20_5 >= KW_ROLLUP && LA20_5 <= KW_SECOND)||(LA20_5 >= KW_SEMI && LA20_5 <= KW_SSL)||(LA20_5 >= KW_STATISTICS && LA20_5 <= KW_TABLES)||(LA20_5 >= KW_TBLPROPERTIES && LA20_5 <= KW_TERMINATED)||(LA20_5 >= KW_TIMESTAMP && LA20_5 <= KW_TRANSACTIONS)||(LA20_5 >= KW_TRIGGER && LA20_5 <= KW_UNARCHIVE)||(LA20_5 >= KW_UNDO && LA20_5 <= KW_UNIONTYPE)||(LA20_5 >= KW_UNLOCK && LA20_5 <= KW_VALUE_TYPE)||LA20_5==KW_VIEW||LA20_5==KW_WHILE||(LA20_5 >= KW_WITH && LA20_5 <= KW_YEAR)||LA20_5==LPAREN||LA20_5==MINUS||(LA20_5 >= Number && LA20_5 <= PLUS)||(LA20_5 >= SmallintLiteral && LA20_5 <= TinyintLiteral)||LA20_5==KW_HOLD_DDLTIME||LA20_5==KW_IGNORE||LA20_5==KW_NO_DROP||LA20_5==KW_OFFLINE||LA20_5==KW_PROTECTION||LA20_5==KW_READONLY) ) {s = 2;}
						 
						input.seek(index20_5);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA27_eotS =
		"\126\uffff";
	static final String DFA27_eofS =
		"\1\2\125\uffff";
	static final String DFA27_minS =
		"\1\12\1\7\37\uffff\1\4\33\uffff\3\0\26\uffff";
	static final String DFA27_maxS =
		"\2\u0216\37\uffff\1\u014c\33\uffff\3\0\26\uffff";
	static final String DFA27_acceptS =
		"\2\uffff\1\2\122\uffff\1\1";
	static final String DFA27_specialS =
		"\75\uffff\1\0\1\1\1\2\26\uffff}>";
	static final String[] DFA27_transitionS = {
			"\1\2\17\uffff\10\2\1\uffff\17\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\1"+
			"\uffff\2\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff\20\2\1\uffff\4"+
			"\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\7\2\1\uffff\13\2\1\uffff\14\2\1\uffff\13\2\1\uffff\7\2\1"+
			"\uffff\4\2\1\uffff\6\2\1\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff\5"+
			"\2\2\uffff\33\2\1\uffff\26\2\1\uffff\13\2\1\uffff\6\2\1\uffff\4\2\1\uffff"+
			"\3\2\1\uffff\15\2\1\uffff\1\2\1\uffff\7\2\3\uffff\1\1\12\uffff\1\2\172"+
			"\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff"+
			"\1\2",
			"\1\2\5\uffff\1\2\4\uffff\1\2\7\uffff\10\2\1\uffff\17\2\1\uffff\4\2\1"+
			"\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4"+
			"\2\1\uffff\20\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\10\2\1\uffff\4\2\1\uffff\1\2\1\uffff\4\2\1\uffff\24\2\1\uffff\6\2\1"+
			"\uffff\13\2\1\uffff\7\2\1\uffff\12\2\2\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\13\2\1\uffff\17\2\1\uffff\6\2\1\uffff\17\2\1"+
			"\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15"+
			"\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\3\uffff\1\2\2\uffff\1\2\2\uffff"+
			"\2\2\10\uffff\1\2\1\41\2\2\162\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff"+
			"\1\2\27\uffff\1\2\3\uffff\1\2",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\2\3\uffff\1\76\3\uffff\2\2\1\uffff\1\2\2\uffff\1\75\1\2\1\uffff\2"+
			"\2\11\uffff\1\2\7\uffff\1\2\135\uffff\1\2\13\uffff\1\2\14\uffff\1\2\26"+
			"\uffff\1\2\10\uffff\1\2\35\uffff\1\2\12\uffff\1\2\116\uffff\2\2\1\uffff"+
			"\1\2\1\uffff\3\2\1\uffff\1\2\3\uffff\1\77\3\uffff\1\2\1\uffff\1\2",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			""
	};

	static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
	static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
	static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
	static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
	static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
	static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
	static final short[][] DFA27_transition;

	static {
		int numStates = DFA27_transitionS.length;
		DFA27_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
		}
	}

	protected class DFA27 extends DFA {

		public DFA27(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 27;
			this.eot = DFA27_eot;
			this.eof = DFA27_eof;
			this.min = DFA27_min;
			this.max = DFA27_max;
			this.accept = DFA27_accept;
			this.special = DFA27_special;
			this.transition = DFA27_transition;
		}
		@Override
		public String getDescription() {
			return "194:5: ( ( tableProperties )=>props= tableProperties )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA27_61 = input.LA(1);
						 
						int index27_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_FromClauseParser()) ) {s = 85;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index27_61);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA27_62 = input.LA(1);
						 
						int index27_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_FromClauseParser()) ) {s = 85;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index27_62);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA27_63 = input.LA(1);
						 
						int index27_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_FromClauseParser()) ) {s = 85;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index27_63);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 27, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA29_eotS =
		"\u042d\uffff";
	static final String DFA29_eofS =
		"\1\6\1\53\1\107\1\143\1\u0080\1\u009c\1\uffff\1\u00b9\2\uffff\1\u00d6"+
		"\1\u00f3\1\u0112\1\uffff\1\u012f\4\uffff\1\u014c\1\uffff\1\u0169\1\u0187"+
		"\1\u01a4\1\u01c1\2\uffff\1\u01de\4\uffff\1\u01fb\1\u0217\1\u0234\1\u0250"+
		"\1\uffff\1\u026d\2\uffff\1\u028a\1\u02a7\1\u02c6\1\uffff\1\u02e3\4\uffff"+
		"\1\u0300\1\uffff\1\u031d\1\u033b\1\u0358\1\u0375\2\uffff\1\u0392\u03f3"+
		"\uffff";
	static final String DFA29_minS =
		"\6\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4\uffff\1\12\1\uffff\4\12"+
		"\2\uffff\1\12\4\uffff\4\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4\uffff"+
		"\1\12\1\uffff\4\12\2\uffff\1\12\4\uffff\1\7\125\uffff\1\0\35\uffff\1\0"+
		"\34\uffff\1\0\34\uffff\1\0\176\uffff\3\7\u0084\uffff\1\0\125\uffff\1\0"+
		"\35\uffff\1\0\34\uffff\1\0\34\uffff\1\0\176\uffff\3\0\u0084\uffff\34\0"+
		"\20\uffff\133\0";
	static final String DFA29_maxS =
		"\2\u0216\4\u0146\1\uffff\1\u0146\2\uffff\3\u0146\1\uffff\1\u0146\4\uffff"+
		"\1\u0146\1\uffff\4\u0146\2\uffff\1\u0146\4\uffff\4\u0146\1\uffff\1\u0146"+
		"\2\uffff\3\u0146\1\uffff\1\u0146\4\uffff\1\u0146\1\uffff\4\u0146\2\uffff"+
		"\1\u0146\4\uffff\1\u0216\125\uffff\1\0\35\uffff\1\0\34\uffff\1\0\34\uffff"+
		"\1\0\176\uffff\3\u0216\u0084\uffff\1\0\125\uffff\1\0\35\uffff\1\0\34\uffff"+
		"\1\0\34\uffff\1\0\176\uffff\3\0\u0084\uffff\34\0\20\uffff\133\0";
	static final String DFA29_acceptS =
		"\6\uffff\1\3\23\uffff\1\2\4\uffff\1\2\4\uffff\1\2\1\uffff\2\2\3\uffff"+
		"\1\2\1\uffff\4\2\1\uffff\1\2\4\uffff\1\2\1\1\1\uffff\3\2\1\1\1\uffff\33"+
		"\2\1\uffff\34\2\1\uffff\34\2\1\uffff\33\2\1\uffff\1\2\1\uffff\32\2\1\uffff"+
		"\1\2\1\uffff\32\2\1\uffff\1\2\1\uffff\32\2\3\uffff\34\2\1\uffff\34\2\1"+
		"\uffff\34\2\1\uffff\12\2\3\uffff\17\2\2\uffff\34\2\1\uffff\34\2\1\uffff"+
		"\34\2\1\uffff\34\2\1\uffff\33\1\1\2\34\1\1\2\34\1\1\uffff\33\1\1\2\1\1"+
		"\1\uffff\32\1\1\2\1\1\1\uffff\32\1\1\2\1\1\1\uffff\32\1\3\2\34\1\1\2\34"+
		"\1\1\2\34\1\1\2\12\1\3\uffff\17\1\2\2\34\1\1\2\34\1\1\2\34\1\1\2\34\1"+
		"\u0087\uffff";
	static final String DFA29_specialS =
		"\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\2\uffff\1\7\1\10\1\11\1\uffff\1\12"+
		"\4\uffff\1\13\1\uffff\1\14\1\15\1\16\1\17\2\uffff\1\20\4\uffff\1\21\1"+
		"\22\1\23\1\24\1\uffff\1\25\2\uffff\1\26\1\27\1\30\1\uffff\1\31\4\uffff"+
		"\1\32\1\uffff\1\33\1\34\1\35\1\36\2\uffff\1\37\132\uffff\1\40\35\uffff"+
		"\1\41\34\uffff\1\42\34\uffff\1\43\u0105\uffff\1\44\125\uffff\1\45\35\uffff"+
		"\1\46\34\uffff\1\47\34\uffff\1\50\176\uffff\1\51\1\52\1\53\u0084\uffff"+
		"\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
		"\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
		"\1\107\20\uffff\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120"+
		"\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134"+
		"\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150"+
		"\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
		"\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
		"\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
		"\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092"+
		"\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b"+
		"\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2}>";
	static final String[] DFA29_transitionS = {
			"\1\6\17\uffff\1\2\4\32\2\37\1\32\1\uffff\1\32\1\37\1\1\1\32\1\37\2\32"+
			"\5\37\2\32\1\37\1\uffff\1\32\2\uffff\1\32\1\uffff\1\3\3\32\1\uffff\2"+
			"\32\1\uffff\4\32\1\uffff\1\37\1\32\1\37\1\6\1\37\1\uffff\3\37\1\32\1"+
			"\uffff\1\32\1\37\3\32\1\37\2\32\1\37\3\32\1\37\3\32\1\uffff\1\26\2\37"+
			"\1\32\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32\1\37\2\32\1\uffff\3\37\4"+
			"\32\1\37\1\uffff\2\37\2\32\1\uffff\1\13\1\uffff\1\32\1\37\1\16\1\37\1"+
			"\6\2\32\1\uffff\2\37\2\32\1\5\3\32\1\14\2\37\1\uffff\2\37\3\32\1\6\4"+
			"\32\1\4\1\7\1\uffff\1\32\1\37\1\30\2\32\1\37\5\32\1\uffff\1\6\6\32\1"+
			"\uffff\1\32\1\37\2\32\1\uffff\1\32\1\37\1\32\1\37\1\32\1\6\1\uffff\1"+
			"\32\1\uffff\1\23\2\37\2\32\1\uffff\2\32\1\uffff\1\33\2\32\1\37\1\32\2"+
			"\uffff\1\32\1\37\1\32\1\37\1\32\1\37\1\32\1\37\3\32\1\6\2\37\7\32\1\37"+
			"\1\32\1\12\1\37\2\32\1\uffff\3\37\3\32\1\6\4\32\1\37\5\32\1\37\1\32\1"+
			"\27\2\32\1\uffff\5\32\1\37\1\32\1\uffff\3\32\1\uffff\1\37\1\32\1\37\3"+
			"\32\1\uffff\3\37\1\32\1\uffff\1\32\1\25\1\32\1\uffff\3\32\1\37\2\32\2"+
			"\37\3\32\1\37\1\32\1\uffff\1\32\1\uffff\1\6\1\32\1\6\1\37\3\32\3\uffff"+
			"\1\6\12\uffff\1\6\172\uffff\1\32\3\uffff\1\32\60\uffff\1\32\3\uffff\1"+
			"\32\27\uffff\1\32\3\uffff\1\32",
			"\1\46\17\uffff\1\40\4\70\2\75\1\70\1\uffff\1\70\2\75\1\70\1\75\2\70"+
			"\5\75\2\70\1\75\1\uffff\1\70\2\uffff\1\70\1\uffff\1\41\3\70\1\uffff\2"+
			"\70\1\uffff\4\70\1\uffff\1\75\1\70\1\75\1\47\1\75\1\uffff\3\75\1\70\1"+
			"\uffff\1\70\1\75\3\70\1\75\2\70\1\75\3\70\1\75\3\70\1\uffff\1\64\2\75"+
			"\1\70\1\uffff\1\70\1\uffff\1\70\1\uffff\1\70\1\75\2\70\1\uffff\3\75\4"+
			"\70\1\75\1\uffff\2\75\2\70\1\uffff\1\51\1\uffff\1\70\1\75\1\54\1\75\1"+
			"\62\2\70\1\uffff\2\75\2\70\1\43\3\70\1\52\2\75\1\uffff\2\75\3\70\1\44"+
			"\4\70\1\42\1\45\1\uffff\1\70\1\75\1\66\2\70\1\75\5\70\1\uffff\1\56\6"+
			"\70\1\uffff\1\70\1\75\2\70\1\uffff\1\70\1\75\1\70\1\75\1\70\1\73\1\uffff"+
			"\1\70\1\uffff\1\61\2\75\2\70\1\uffff\2\70\1\uffff\1\71\2\70\1\75\1\70"+
			"\2\uffff\1\70\1\75\1\70\1\75\1\70\1\75\1\70\1\75\3\70\1\57\2\75\7\70"+
			"\1\75\1\70\1\50\1\75\2\70\1\uffff\3\75\3\70\1\55\4\70\1\75\5\70\1\75"+
			"\1\70\1\65\2\70\1\uffff\5\70\1\75\1\70\1\uffff\3\70\1\uffff\1\75\1\70"+
			"\1\75\3\70\1\uffff\3\75\1\70\1\uffff\1\70\1\63\1\70\1\uffff\3\70\1\75"+
			"\2\70\2\75\3\70\1\75\1\70\1\uffff\1\70\1\uffff\1\60\1\70\1\67\1\75\3"+
			"\70\3\uffff\1\74\12\uffff\1\72\172\uffff\1\70\3\uffff\1\70\60\uffff\1"+
			"\70\3\uffff\1\70\27\uffff\1\70\3\uffff\1\70",
			"\1\102\17\uffff\1\131\35\uffff\1\120\17\uffff\1\103\30\uffff\1\121\33"+
			"\uffff\1\106\3\uffff\1\115\1\uffff\1\116\7\uffff\1\101\3\uffff\1\110"+
			"\10\uffff\1\100\4\uffff\1\77\1\104\3\uffff\1\124\11\uffff\1\112\21\uffff"+
			"\1\127\3\uffff\1\117\10\uffff\1\130\21\uffff\1\113\13\uffff\1\105\12"+
			"\uffff\1\111\14\uffff\1\122\34\uffff\1\125\22\uffff\1\114\1\uffff\1\123"+
			"\7\uffff\1\76\12\uffff\1\126",
			"\1\136\17\uffff\1\166\26\uffff\1\6\6\uffff\1\154\17\uffff\1\137\30\uffff"+
			"\1\155\33\uffff\1\142\3\uffff\1\151\1\uffff\1\152\7\uffff\1\135\3\uffff"+
			"\1\144\10\uffff\1\134\4\uffff\1\133\1\140\3\uffff\1\160\11\uffff\1\146"+
			"\21\uffff\1\163\3\uffff\1\153\10\uffff\1\165\21\uffff\1\147\13\uffff"+
			"\1\141\12\uffff\1\145\14\uffff\1\156\34\uffff\1\161\22\uffff\1\150\1"+
			"\uffff\1\157\7\uffff\1\164\12\uffff\1\162",
			"\1\173\17\uffff\1\u0093\35\uffff\1\u0089\17\uffff\1\174\30\uffff\1\u008a"+
			"\33\uffff\1\177\3\uffff\1\u0086\1\uffff\1\u0087\7\uffff\1\172\3\uffff"+
			"\1\u0081\10\uffff\1\171\4\uffff\1\170\1\175\3\uffff\1\u008d\11\uffff"+
			"\1\u0083\21\uffff\1\u0090\3\uffff\1\u0088\10\uffff\1\u0092\21\uffff\1"+
			"\u0084\13\uffff\1\176\12\uffff\1\u0082\14\uffff\1\u008b\34\uffff\1\u008e"+
			"\20\uffff\1\6\1\uffff\1\u0085\1\uffff\1\u008c\7\uffff\1\u0091\12\uffff"+
			"\1\u008f",
			"\1\u0097\17\uffff\1\u00af\35\uffff\1\u00a5\17\uffff\1\u0098\30\uffff"+
			"\1\u00a6\33\uffff\1\u009b\3\uffff\1\u00a2\1\uffff\1\u00a3\7\uffff\1\u0096"+
			"\3\uffff\1\u009d\10\uffff\1\u0094\4\uffff\1\u0095\1\u0099\3\uffff\1\u00a9"+
			"\11\uffff\1\u009f\21\uffff\1\u00ac\3\uffff\1\u00a4\10\uffff\1\u00ae\21"+
			"\uffff\1\u00a0\13\uffff\1\u009a\12\uffff\1\u009e\14\uffff\1\u00a7\34"+
			"\uffff\1\u00aa\22\uffff\1\u00a1\1\uffff\1\u00a8\7\uffff\1\u00ad\12\uffff"+
			"\1\u00ab",
			"",
			"\1\u00b4\17\uffff\1\u00cc\35\uffff\1\u00c2\17\uffff\1\u00b5\30\uffff"+
			"\1\u00c3\33\uffff\1\u00b8\3\uffff\1\u00bf\1\uffff\1\u00c0\7\uffff\1\u00b3"+
			"\3\uffff\1\u00ba\10\uffff\1\u00b2\4\uffff\1\u00b1\1\u00b6\3\uffff\1\u00c6"+
			"\11\uffff\1\u00bc\21\uffff\1\u00c9\3\uffff\1\u00c1\1\uffff\1\6\6\uffff"+
			"\1\u00cb\21\uffff\1\u00bd\13\uffff\1\u00b7\12\uffff\1\u00bb\1\6\13\uffff"+
			"\1\u00c4\34\uffff\1\u00c7\22\uffff\1\u00be\1\uffff\1\u00c5\7\uffff\1"+
			"\u00ca\12\uffff\1\u00c8",
			"",
			"",
			"\1\u00d1\17\uffff\1\u00e9\35\uffff\1\u00df\17\uffff\1\u00d2\30\uffff"+
			"\1\u00e0\33\uffff\1\u00d5\3\uffff\1\u00dc\1\uffff\1\u00dd\7\uffff\1\u00d0"+
			"\3\uffff\1\u00d7\10\uffff\1\u00cf\4\uffff\1\u00ce\1\u00d3\3\uffff\1\u00e3"+
			"\11\uffff\1\u00d9\21\uffff\1\u00e6\3\uffff\1\u00de\1\uffff\1\6\6\uffff"+
			"\1\u00e8\21\uffff\1\u00da\13\uffff\1\u00d4\12\uffff\1\u00d8\14\uffff"+
			"\1\u00e1\34\uffff\1\u00e4\22\uffff\1\u00db\1\uffff\1\u00e2\7\uffff\1"+
			"\u00e7\12\uffff\1\u00e5",
			"\1\u00ee\17\uffff\1\u0106\35\uffff\1\u00fc\17\uffff\1\u00ef\30\uffff"+
			"\1\u00fd\33\uffff\1\u00f2\3\uffff\1\u00f9\1\uffff\1\u00fa\7\uffff\1\u00ed"+
			"\3\uffff\1\u00f4\10\uffff\1\u00ec\4\uffff\1\u00eb\1\u00f0\3\uffff\1\u0100"+
			"\11\uffff\1\u00f6\21\uffff\1\u0103\3\uffff\1\u00fb\1\uffff\1\6\6\uffff"+
			"\1\u0105\21\uffff\1\u00f7\13\uffff\1\u00f1\12\uffff\1\u00f5\14\uffff"+
			"\1\u00fe\34\uffff\1\u0101\22\uffff\1\u00f8\1\uffff\1\u00ff\7\uffff\1"+
			"\u0104\12\uffff\1\u0102",
			"\1\u010d\17\uffff\1\u0125\35\uffff\1\u011b\17\uffff\1\u010e\30\uffff"+
			"\1\u011c\33\uffff\1\u0111\3\uffff\1\u0118\1\uffff\1\u0119\7\uffff\1\u010c"+
			"\3\uffff\1\u0113\3\uffff\1\6\4\uffff\1\u010b\4\uffff\1\u010a\1\u010f"+
			"\3\uffff\1\u011f\11\uffff\1\u0115\21\uffff\1\u0122\3\uffff\1\u011a\5"+
			"\uffff\1\6\2\uffff\1\u0124\21\uffff\1\u0116\13\uffff\1\u0110\12\uffff"+
			"\1\u0114\14\uffff\1\u011d\34\uffff\1\u0120\22\uffff\1\u0117\1\uffff\1"+
			"\u011e\7\uffff\1\u0123\12\uffff\1\u0121",
			"",
			"\1\u012a\17\uffff\1\u0142\26\uffff\1\6\6\uffff\1\u0138\17\uffff\1\u012b"+
			"\30\uffff\1\u0139\33\uffff\1\u012e\3\uffff\1\u0135\1\uffff\1\u0136\7"+
			"\uffff\1\u0129\3\uffff\1\u0130\10\uffff\1\u0128\4\uffff\1\u0127\1\u012c"+
			"\3\uffff\1\u013c\11\uffff\1\u0132\21\uffff\1\u013f\3\uffff\1\u0137\10"+
			"\uffff\1\u0141\21\uffff\1\u0133\13\uffff\1\u012d\12\uffff\1\u0131\14"+
			"\uffff\1\u013a\34\uffff\1\u013d\22\uffff\1\u0134\1\uffff\1\u013b\7\uffff"+
			"\1\u0140\12\uffff\1\u013e",
			"",
			"",
			"",
			"",
			"\1\u0147\17\uffff\1\u015f\26\uffff\1\6\6\uffff\1\u0155\17\uffff\1\u0148"+
			"\30\uffff\1\u0156\33\uffff\1\u014b\3\uffff\1\u0152\1\uffff\1\u0153\7"+
			"\uffff\1\u0146\3\uffff\1\u014d\10\uffff\1\u0145\4\uffff\1\u0144\1\u0149"+
			"\3\uffff\1\u0159\11\uffff\1\u014f\21\uffff\1\u015c\3\uffff\1\u0154\10"+
			"\uffff\1\u015e\21\uffff\1\u0150\13\uffff\1\u014a\12\uffff\1\u014e\14"+
			"\uffff\1\u0157\34\uffff\1\u015a\22\uffff\1\u0151\1\uffff\1\u0158\7\uffff"+
			"\1\u015d\12\uffff\1\u015b",
			"",
			"\1\u0164\17\uffff\1\u017c\4\uffff\1\6\30\uffff\1\u0172\17\uffff\1\u0165"+
			"\27\uffff\1\6\1\u0173\33\uffff\1\u0168\3\uffff\1\u016f\1\uffff\1\u0170"+
			"\7\uffff\1\u0163\3\uffff\1\u016a\10\uffff\1\u0162\4\uffff\1\u0161\1\u0166"+
			"\3\uffff\1\u0176\11\uffff\1\u016c\21\uffff\1\u0179\3\uffff\1\u0171\10"+
			"\uffff\1\u017b\21\uffff\1\u016d\13\uffff\1\u0167\12\uffff\1\u016b\14"+
			"\uffff\1\u0174\34\uffff\1\u0177\22\uffff\1\u016e\1\uffff\1\u0175\7\uffff"+
			"\1\u017a\12\uffff\1\u0178",
			"\1\u0182\17\uffff\1\u019a\26\uffff\1\6\6\uffff\1\u0190\17\uffff\1\u0183"+
			"\30\uffff\1\u0191\33\uffff\1\u0186\3\uffff\1\u018d\1\uffff\1\u018e\7"+
			"\uffff\1\u0181\3\uffff\1\u0188\10\uffff\1\u0180\4\uffff\1\u017f\1\u0184"+
			"\3\uffff\1\u0194\11\uffff\1\u018a\21\uffff\1\u0197\3\uffff\1\u018f\10"+
			"\uffff\1\u0199\21\uffff\1\u018b\13\uffff\1\u0185\12\uffff\1\u0189\14"+
			"\uffff\1\u0192\34\uffff\1\u0195\22\uffff\1\u018c\1\uffff\1\u0193\7\uffff"+
			"\1\u0198\12\uffff\1\u0196",
			"\1\u019f\17\uffff\1\u01b7\26\uffff\1\6\6\uffff\1\u01ad\17\uffff\1\u01a0"+
			"\30\uffff\1\u01ae\33\uffff\1\u01a3\3\uffff\1\u01aa\1\uffff\1\u01ab\7"+
			"\uffff\1\u019e\3\uffff\1\u01a5\10\uffff\1\u019d\4\uffff\1\u019c\1\u01a1"+
			"\3\uffff\1\u01b1\11\uffff\1\u01a7\21\uffff\1\u01b4\3\uffff\1\u01ac\10"+
			"\uffff\1\u01b6\21\uffff\1\u01a8\13\uffff\1\u01a2\12\uffff\1\u01a6\14"+
			"\uffff\1\u01af\34\uffff\1\u01b2\22\uffff\1\u01a9\1\uffff\1\u01b0\7\uffff"+
			"\1\u01b5\12\uffff\1\u01b3",
			"\1\u01bc\17\uffff\1\u01d4\35\uffff\1\u01ca\17\uffff\1\u01bd\30\uffff"+
			"\1\u01cb\33\uffff\1\u01c0\3\uffff\1\u01c7\1\uffff\1\u01c8\7\uffff\1\u01bb"+
			"\3\uffff\1\u01c2\10\uffff\1\u01ba\4\uffff\1\u01b9\1\u01be\3\uffff\1\u01ce"+
			"\11\uffff\1\u01c4\21\uffff\1\u01d1\3\uffff\1\u01c9\10\uffff\1\u01d3\21"+
			"\uffff\1\u01c5\13\uffff\1\u01bf\12\uffff\1\u01c3\14\uffff\1\u01cc\34"+
			"\uffff\1\u01cf\22\uffff\1\u01c6\1\uffff\1\u01cd\7\uffff\1\u01d2\5\uffff"+
			"\1\6\4\uffff\1\u01d0",
			"",
			"",
			"\1\u01d9\17\uffff\1\u01f1\26\uffff\1\6\6\uffff\1\u01e7\17\uffff\1\u01da"+
			"\30\uffff\1\u01e8\33\uffff\1\u01dd\3\uffff\1\u01e4\1\uffff\1\u01e5\7"+
			"\uffff\1\u01d8\3\uffff\1\u01df\10\uffff\1\u01d7\4\uffff\1\u01d6\1\u01db"+
			"\3\uffff\1\u01eb\11\uffff\1\u01e1\21\uffff\1\u01ee\3\uffff\1\u01e6\10"+
			"\uffff\1\u01f0\21\uffff\1\u01e2\13\uffff\1\u01dc\12\uffff\1\u01e0\14"+
			"\uffff\1\u01e9\34\uffff\1\u01ec\22\uffff\1\u01e3\1\uffff\1\u01ea\7\uffff"+
			"\1\u01ef\12\uffff\1\u01ed",
			"",
			"",
			"",
			"",
			"\1\u01f6\17\uffff\1\u020d\35\uffff\1\u0204\17\uffff\1\u01f7\30\uffff"+
			"\1\u0205\33\uffff\1\u01fa\3\uffff\1\u0201\1\uffff\1\u0202\7\uffff\1\u01f5"+
			"\3\uffff\1\u01fc\10\uffff\1\u01f4\4\uffff\1\u01f3\1\u01f8\3\uffff\1\u0208"+
			"\11\uffff\1\u01fe\21\uffff\1\u020b\3\uffff\1\u0203\10\uffff\1\u020c\21"+
			"\uffff\1\u01ff\13\uffff\1\u01f9\12\uffff\1\u01fd\14\uffff\1\u0206\34"+
			"\uffff\1\u0209\22\uffff\1\u0200\1\uffff\1\u0207\7\uffff\1\u01f2\12\uffff"+
			"\1\u020a",
			"\1\u0212\17\uffff\1\u022a\26\uffff\1\u020e\6\uffff\1\u0220\17\uffff"+
			"\1\u0213\30\uffff\1\u0221\33\uffff\1\u0216\3\uffff\1\u021d\1\uffff\1"+
			"\u021e\7\uffff\1\u0211\3\uffff\1\u0218\10\uffff\1\u0210\4\uffff\1\u020f"+
			"\1\u0214\3\uffff\1\u0224\11\uffff\1\u021a\21\uffff\1\u0227\3\uffff\1"+
			"\u021f\10\uffff\1\u0229\21\uffff\1\u021b\13\uffff\1\u0215\12\uffff\1"+
			"\u0219\14\uffff\1\u0222\34\uffff\1\u0225\22\uffff\1\u021c\1\uffff\1\u0223"+
			"\7\uffff\1\u0228\12\uffff\1\u0226",
			"\1\u022f\17\uffff\1\u0247\35\uffff\1\u023d\17\uffff\1\u0230\30\uffff"+
			"\1\u023e\33\uffff\1\u0233\3\uffff\1\u023a\1\uffff\1\u023b\7\uffff\1\u022e"+
			"\3\uffff\1\u0235\10\uffff\1\u022d\4\uffff\1\u022c\1\u0231\3\uffff\1\u0241"+
			"\11\uffff\1\u0237\21\uffff\1\u0244\3\uffff\1\u023c\10\uffff\1\u0246\21"+
			"\uffff\1\u0238\13\uffff\1\u0232\12\uffff\1\u0236\14\uffff\1\u023f\34"+
			"\uffff\1\u0242\20\uffff\1\u022b\1\uffff\1\u0239\1\uffff\1\u0240\7\uffff"+
			"\1\u0245\12\uffff\1\u0243",
			"\1\u024b\17\uffff\1\u0263\35\uffff\1\u0259\17\uffff\1\u024c\30\uffff"+
			"\1\u025a\33\uffff\1\u024f\3\uffff\1\u0256\1\uffff\1\u0257\7\uffff\1\u024a"+
			"\3\uffff\1\u0251\10\uffff\1\u0248\4\uffff\1\u0249\1\u024d\3\uffff\1\u025d"+
			"\11\uffff\1\u0253\21\uffff\1\u0260\3\uffff\1\u0258\10\uffff\1\u0262\21"+
			"\uffff\1\u0254\13\uffff\1\u024e\12\uffff\1\u0252\14\uffff\1\u025b\34"+
			"\uffff\1\u025e\22\uffff\1\u0255\1\uffff\1\u025c\7\uffff\1\u0261\12\uffff"+
			"\1\u025f",
			"",
			"\1\u0268\17\uffff\1\u0280\35\uffff\1\u0276\17\uffff\1\u0269\30\uffff"+
			"\1\u0277\33\uffff\1\u026c\3\uffff\1\u0273\1\uffff\1\u0274\7\uffff\1\u0267"+
			"\3\uffff\1\u026e\10\uffff\1\u0266\4\uffff\1\u0265\1\u026a\3\uffff\1\u027a"+
			"\11\uffff\1\u0270\21\uffff\1\u027d\3\uffff\1\u0275\1\uffff\1\u0281\6"+
			"\uffff\1\u027f\21\uffff\1\u0271\13\uffff\1\u026b\12\uffff\1\u026f\1\u0264"+
			"\13\uffff\1\u0278\34\uffff\1\u027b\22\uffff\1\u0272\1\uffff\1\u0279\7"+
			"\uffff\1\u027e\12\uffff\1\u027c",
			"",
			"",
			"\1\u0285\17\uffff\1\u029d\35\uffff\1\u0293\17\uffff\1\u0286\30\uffff"+
			"\1\u0294\33\uffff\1\u0289\3\uffff\1\u0290\1\uffff\1\u0291\7\uffff\1\u0284"+
			"\3\uffff\1\u028b\10\uffff\1\u0283\4\uffff\1\u0282\1\u0287\3\uffff\1\u0297"+
			"\11\uffff\1\u028d\21\uffff\1\u029a\3\uffff\1\u0292\1\uffff\1\u029e\6"+
			"\uffff\1\u029c\21\uffff\1\u028e\13\uffff\1\u0288\12\uffff\1\u028c\14"+
			"\uffff\1\u0295\34\uffff\1\u0298\22\uffff\1\u028f\1\uffff\1\u0296\7\uffff"+
			"\1\u029b\12\uffff\1\u0299",
			"\1\u02a2\17\uffff\1\u02ba\35\uffff\1\u02b0\17\uffff\1\u02a3\30\uffff"+
			"\1\u02b1\33\uffff\1\u02a6\3\uffff\1\u02ad\1\uffff\1\u02ae\7\uffff\1\u02a1"+
			"\3\uffff\1\u02a8\10\uffff\1\u02a0\4\uffff\1\u029f\1\u02a4\3\uffff\1\u02b4"+
			"\11\uffff\1\u02aa\21\uffff\1\u02b7\3\uffff\1\u02af\1\uffff\1\u02bb\6"+
			"\uffff\1\u02b9\21\uffff\1\u02ab\13\uffff\1\u02a5\12\uffff\1\u02a9\14"+
			"\uffff\1\u02b2\34\uffff\1\u02b5\22\uffff\1\u02ac\1\uffff\1\u02b3\7\uffff"+
			"\1\u02b8\12\uffff\1\u02b6",
			"\1\u02c1\17\uffff\1\u02d9\35\uffff\1\u02cf\17\uffff\1\u02c2\30\uffff"+
			"\1\u02d0\33\uffff\1\u02c5\3\uffff\1\u02cc\1\uffff\1\u02cd\7\uffff\1\u02c0"+
			"\3\uffff\1\u02c7\3\uffff\1\u02bd\4\uffff\1\u02bf\4\uffff\1\u02be\1\u02c3"+
			"\3\uffff\1\u02d3\11\uffff\1\u02c9\21\uffff\1\u02d6\3\uffff\1\u02ce\5"+
			"\uffff\1\u02bc\2\uffff\1\u02d8\21\uffff\1\u02ca\13\uffff\1\u02c4\12\uffff"+
			"\1\u02c8\14\uffff\1\u02d1\34\uffff\1\u02d4\22\uffff\1\u02cb\1\uffff\1"+
			"\u02d2\7\uffff\1\u02d7\12\uffff\1\u02d5",
			"",
			"\1\u02de\17\uffff\1\u02f6\26\uffff\1\u02da\6\uffff\1\u02ec\17\uffff"+
			"\1\u02df\30\uffff\1\u02ed\33\uffff\1\u02e2\3\uffff\1\u02e9\1\uffff\1"+
			"\u02ea\7\uffff\1\u02dd\3\uffff\1\u02e4\10\uffff\1\u02dc\4\uffff\1\u02db"+
			"\1\u02e0\3\uffff\1\u02f0\11\uffff\1\u02e6\21\uffff\1\u02f3\3\uffff\1"+
			"\u02eb\10\uffff\1\u02f5\21\uffff\1\u02e7\13\uffff\1\u02e1\12\uffff\1"+
			"\u02e5\14\uffff\1\u02ee\34\uffff\1\u02f1\22\uffff\1\u02e8\1\uffff\1\u02ef"+
			"\7\uffff\1\u02f4\12\uffff\1\u02f2",
			"",
			"",
			"",
			"",
			"\1\u02fb\17\uffff\1\u0313\26\uffff\1\u02f7\6\uffff\1\u0309\17\uffff"+
			"\1\u02fc\30\uffff\1\u030a\33\uffff\1\u02ff\3\uffff\1\u0306\1\uffff\1"+
			"\u0307\7\uffff\1\u02fa\3\uffff\1\u0301\10\uffff\1\u02f9\4\uffff\1\u02f8"+
			"\1\u02fd\3\uffff\1\u030d\11\uffff\1\u0303\21\uffff\1\u0310\3\uffff\1"+
			"\u0308\10\uffff\1\u0312\21\uffff\1\u0304\13\uffff\1\u02fe\12\uffff\1"+
			"\u0302\14\uffff\1\u030b\34\uffff\1\u030e\22\uffff\1\u0305\1\uffff\1\u030c"+
			"\7\uffff\1\u0311\12\uffff\1\u030f",
			"",
			"\1\u0318\17\uffff\1\u0330\4\uffff\1\u0314\30\uffff\1\u0326\17\uffff"+
			"\1\u0319\27\uffff\1\u0331\1\u0327\33\uffff\1\u031c\3\uffff\1\u0323\1"+
			"\uffff\1\u0324\7\uffff\1\u0317\3\uffff\1\u031e\10\uffff\1\u0316\4\uffff"+
			"\1\u0315\1\u031a\3\uffff\1\u032a\11\uffff\1\u0320\21\uffff\1\u032d\3"+
			"\uffff\1\u0325\10\uffff\1\u032f\21\uffff\1\u0321\13\uffff\1\u031b\12"+
			"\uffff\1\u031f\14\uffff\1\u0328\34\uffff\1\u032b\22\uffff\1\u0322\1\uffff"+
			"\1\u0329\7\uffff\1\u032e\12\uffff\1\u032c",
			"\1\u0336\17\uffff\1\u034e\26\uffff\1\u0332\6\uffff\1\u0344\17\uffff"+
			"\1\u0337\30\uffff\1\u0345\33\uffff\1\u033a\3\uffff\1\u0341\1\uffff\1"+
			"\u0342\7\uffff\1\u0335\3\uffff\1\u033c\10\uffff\1\u0334\4\uffff\1\u0333"+
			"\1\u0338\3\uffff\1\u0348\11\uffff\1\u033e\21\uffff\1\u034b\3\uffff\1"+
			"\u0343\10\uffff\1\u034d\21\uffff\1\u033f\13\uffff\1\u0339\12\uffff\1"+
			"\u033d\14\uffff\1\u0346\34\uffff\1\u0349\22\uffff\1\u0340\1\uffff\1\u0347"+
			"\7\uffff\1\u034c\12\uffff\1\u034a",
			"\1\u0353\17\uffff\1\u036b\26\uffff\1\u034f\6\uffff\1\u0361\17\uffff"+
			"\1\u0354\30\uffff\1\u0362\33\uffff\1\u0357\3\uffff\1\u035e\1\uffff\1"+
			"\u035f\7\uffff\1\u0352\3\uffff\1\u0359\10\uffff\1\u0351\4\uffff\1\u0350"+
			"\1\u0355\3\uffff\1\u0365\11\uffff\1\u035b\21\uffff\1\u0368\3\uffff\1"+
			"\u0360\10\uffff\1\u036a\21\uffff\1\u035c\13\uffff\1\u0356\12\uffff\1"+
			"\u035a\14\uffff\1\u0363\34\uffff\1\u0366\22\uffff\1\u035d\1\uffff\1\u0364"+
			"\7\uffff\1\u0369\12\uffff\1\u0367",
			"\1\u0370\17\uffff\1\u0388\35\uffff\1\u037e\17\uffff\1\u0371\30\uffff"+
			"\1\u037f\33\uffff\1\u0374\3\uffff\1\u037b\1\uffff\1\u037c\7\uffff\1\u036f"+
			"\3\uffff\1\u0376\10\uffff\1\u036e\4\uffff\1\u036d\1\u0372\3\uffff\1\u0382"+
			"\11\uffff\1\u0378\21\uffff\1\u0385\3\uffff\1\u037d\10\uffff\1\u0387\21"+
			"\uffff\1\u0379\13\uffff\1\u0373\12\uffff\1\u0377\14\uffff\1\u0380\34"+
			"\uffff\1\u0383\22\uffff\1\u037a\1\uffff\1\u0381\7\uffff\1\u0386\5\uffff"+
			"\1\u036c\4\uffff\1\u0384",
			"",
			"",
			"\1\u038d\17\uffff\1\u03a5\26\uffff\1\u0389\6\uffff\1\u039b\17\uffff"+
			"\1\u038e\30\uffff\1\u039c\33\uffff\1\u0391\3\uffff\1\u0398\1\uffff\1"+
			"\u0399\7\uffff\1\u038c\3\uffff\1\u0393\10\uffff\1\u038b\4\uffff\1\u038a"+
			"\1\u038f\3\uffff\1\u039f\11\uffff\1\u0395\21\uffff\1\u03a2\3\uffff\1"+
			"\u039a\10\uffff\1\u03a4\21\uffff\1\u0396\13\uffff\1\u0390\12\uffff\1"+
			"\u0394\14\uffff\1\u039d\34\uffff\1\u03a0\22\uffff\1\u0397\1\uffff\1\u039e"+
			"\7\uffff\1\u03a3\12\uffff\1\u03a1",
			"",
			"",
			"",
			"",
			"\1\u03b1\5\uffff\1\u03b5\4\uffff\1\u03b4\7\uffff\1\u03bb\4\u03bd\2\u03c1"+
			"\1\u03bd\1\uffff\1\u03bd\1\u03bc\1\u03c1\1\u03bd\1\u03c1\2\u03bd\1\u03c1"+
			"\3\u03bf\1\u03c1\2\u03bd\1\u03c1\1\uffff\1\u03bd\1\u03b9\1\u03b8\1\u03bd"+
			"\1\uffff\4\u03bd\1\uffff\2\u03bd\1\uffff\4\u03bd\1\uffff\1\u03c1\1\u03bd"+
			"\1\u03c1\1\uffff\1\u03c1\1\uffff\1\u03ac\1\u03ae\1\u03c1\1\u03bd\1\uffff"+
			"\1\u03bd\1\u03ab\3\u03bd\1\u03c1\2\u03bd\1\u03c1\3\u03bd\1\u03c1\3\u03bd"+
			"\1\uffff\1\u03bd\1\u03bf\1\u03c1\1\u03bd\1\uffff\1\u03bd\1\uffff\1\u03bd"+
			"\1\uffff\1\u03bd\1\u03c0\2\u03bd\1\uffff\1\u03c1\1\u03b7\1\u03c1\4\u03bd"+
			"\1\u03bf\1\uffff\2\u03c1\2\u03bd\1\uffff\1\u03c1\1\uffff\1\u03bd\3\u03c1"+
			"\1\uffff\2\u03bd\1\u03be\2\u03c1\2\u03bd\1\u03c1\3\u03bd\1\u03c1\1\u03bf"+
			"\1\u03c1\1\u03af\2\u03c1\3\u03bd\1\uffff\4\u03bd\2\u03c1\1\uffff\1\u03bd"+
			"\1\u03c1\3\u03bd\1\u03c1\5\u03bd\1\uffff\1\u03be\6\u03bd\1\uffff\1\u03bd"+
			"\1\u03c1\2\u03bd\1\u03a6\1\u03bd\1\u03a9\1\u03bd\1\u03c1\1\u03bd\2\uffff"+
			"\1\u03bd\1\uffff\3\u03c1\2\u03bd\1\uffff\2\u03bd\1\uffff\1\u03c1\2\u03bd"+
			"\1\u03c1\1\u03bd\2\uffff\1\u03bd\1\u03c1\1\u03bd\1\u03c1\1\u03bd\1\u03c1"+
			"\1\u03bd\1\u03c1\3\u03bd\1\uffff\2\u03c1\7\u03bd\1\u03c1\1\u03bd\2\u03c1"+
			"\2\u03bd\1\uffff\3\u03c1\3\u03bd\1\uffff\4\u03bd\1\u03c1\5\u03bd\1\u03bf"+
			"\4\u03bd\1\uffff\4\u03bd\1\u03ba\1\u03c1\1\u03bd\1\uffff\3\u03bd\1\uffff"+
			"\1\u03ad\1\u03bd\1\u03c1\3\u03bd\1\uffff\1\u03c1\1\u03b6\1\u03c1\1\u03bd"+
			"\1\uffff\1\u03bd\1\u03c1\1\u03ba\1\uffff\3\u03bd\1\u03c1\2\u03bd\2\u03c1"+
			"\3\u03bd\1\u03c1\1\u03bd\1\uffff\1\u03bd\2\uffff\1\u03bd\1\uffff\1\u03c1"+
			"\3\u03bd\3\uffff\1\u03a7\2\uffff\1\u03a8\2\uffff\1\u03aa\1\u03a8\10\uffff"+
			"\1\u03b2\1\u03b0\1\u03a8\1\u03b3\162\uffff\1\u03bd\3\uffff\1\u03bd\60"+
			"\uffff\1\u03bd\3\uffff\1\u03bd\27\uffff\1\u03bd\3\uffff\1\u03bd",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"\1\u03e4\5\uffff\1\u03e8\1\uffff\1\u03d2\2\uffff\1\u03e7\7\uffff\1\u03d6"+
			"\4\u03ed\1\u03d3\1\u03f1\1\u03ed\1\uffff\1\u03ed\1\u03ea\1\u03f1\1\u03ed"+
			"\1\u03f1\2\u03ed\1\u03f1\3\u03ee\1\u03f1\2\u03ed\1\u03f1\1\uffff\1\u03ed"+
			"\1\u03ec\1\u03eb\1\u03ed\1\uffff\4\u03ed\1\uffff\2\u03ed\1\uffff\4\u03ed"+
			"\1\uffff\1\u03f1\1\u03ed\1\u03f1\1\uffff\1\u03f1\1\uffff\1\u03de\1\u03e0"+
			"\1\u03f1\1\u03ed\1\uffff\1\u03ed\1\u03dc\3\u03ed\1\u03f1\2\u03ed\1\u03f1"+
			"\3\u03ed\1\u03f1\3\u03ed\1\u03d4\1\u03ed\1\u03ee\1\u03f1\1\u03ed\1\uffff"+
			"\1\u03ed\1\uffff\1\u03ed\1\uffff\1\u03ed\1\u03f0\2\u03ed\1\uffff\1\u03f1"+
			"\1\u03e9\1\u03f1\4\u03ed\1\u03ee\1\uffff\2\u03f1\2\u03ed\1\uffff\1\u03f1"+
			"\1\uffff\1\u03ed\3\u03f1\1\uffff\2\u03ed\1\u03ef\2\u03f1\2\u03ed\1\u03f1"+
			"\3\u03ed\1\u03f1\1\u03ee\1\u03f1\1\u03e2\2\u03f1\3\u03ed\1\uffff\4\u03ed"+
			"\2\u03f1\1\uffff\1\u03ed\1\u03f1\3\u03ed\1\u03f1\5\u03ed\1\uffff\1\u03ef"+
			"\6\u03ed\1\uffff\1\u03ed\1\u03f1\2\u03ed\1\u03d9\1\u03ed\1\u03d8\1\u03ed"+
			"\1\u03f1\1\u03ed\2\uffff\1\u03ed\1\uffff\3\u03f1\2\u03ed\1\uffff\2\u03ed"+
			"\1\uffff\1\u03f1\2\u03ed\1\u03f1\1\u03ed\2\uffff\1\u03ed\1\u03f1\1\u03ed"+
			"\1\u03f1\1\u03ed\1\u03f1\1\u03ed\1\u03f1\3\u03ed\1\uffff\2\u03f1\7\u03ed"+
			"\1\u03f1\1\u03ed\2\u03f1\2\u03ed\1\uffff\3\u03f1\3\u03ed\1\uffff\4\u03ed"+
			"\1\u03f1\5\u03ed\1\u03ee\4\u03ed\1\uffff\4\u03ed\1\u03d7\1\u03f1\1\u03ed"+
			"\1\uffff\3\u03ed\1\uffff\1\u03df\1\u03ed\1\u03f1\3\u03ed\1\u03f2\1\u03f1"+
			"\1\u03e1\1\u03f1\1\u03ed\1\uffff\1\u03ed\1\u03f1\1\u03d7\1\uffff\3\u03ed"+
			"\1\u03f1\2\u03ed\2\u03f1\3\u03ed\1\u03f1\1\u03ed\1\uffff\1\u03ed\2\uffff"+
			"\1\u03ed\1\uffff\1\u03f1\3\u03ed\3\uffff\1\u03da\2\uffff\1\u03db\2\uffff"+
			"\1\u03dd\1\u03db\7\uffff\1\u03d5\1\u03e5\1\u03e3\1\u03db\1\u03e6\162"+
			"\uffff\1\u03ed\3\uffff\1\u03ed\60\uffff\1\u03ed\3\uffff\1\u03ed\27\uffff"+
			"\1\u03ed\3\uffff\1\u03ed",
			"\1\u0402\5\uffff\1\u0406\4\uffff\1\u0405\7\uffff\1\u03f4\4\u040b\2\u040f"+
			"\1\u040b\1\uffff\1\u040b\1\u0408\1\u040f\1\u040b\1\u040f\2\u040b\1\u040f"+
			"\3\u040c\1\u040f\2\u040b\1\u040f\1\uffff\1\u040b\1\u040a\1\u0409\1\u040b"+
			"\1\uffff\4\u040b\1\uffff\2\u040b\1\uffff\4\u040b\1\uffff\1\u040f\1\u040b"+
			"\1\u040f\1\uffff\1\u040f\1\uffff\1\u03fc\1\u03fe\1\u040f\1\u040b\1\uffff"+
			"\1\u040b\1\u03fa\3\u040b\1\u040f\2\u040b\1\u040f\3\u040b\1\u040f\3\u040b"+
			"\1\uffff\1\u040b\1\u040c\1\u040f\1\u040b\1\uffff\1\u040b\1\uffff\1\u040b"+
			"\1\uffff\1\u040b\1\u040e\2\u040b\1\uffff\1\u040f\1\u0407\1\u040f\4\u040b"+
			"\1\u040c\1\uffff\2\u040f\2\u040b\1\uffff\1\u040f\1\uffff\1\u040b\3\u040f"+
			"\1\uffff\2\u040b\1\u040d\2\u040f\2\u040b\1\u040f\3\u040b\1\u040f\1\u040c"+
			"\1\u040f\1\u0400\2\u040f\3\u040b\1\uffff\4\u040b\2\u040f\1\uffff\1\u040b"+
			"\1\u040f\3\u040b\1\u040f\5\u040b\1\uffff\1\u040d\6\u040b\1\uffff\1\u040b"+
			"\1\u040f\2\u040b\1\u03f7\1\u040b\1\u03f6\1\u040b\1\u040f\1\u040b\2\uffff"+
			"\1\u040b\1\uffff\3\u040f\2\u040b\1\uffff\2\u040b\1\uffff\1\u040f\2\u040b"+
			"\1\u040f\1\u040b\2\uffff\1\u040b\1\u040f\1\u040b\1\u040f\1\u040b\1\u040f"+
			"\1\u040b\1\u040f\3\u040b\1\uffff\2\u040f\7\u040b\1\u040f\1\u040b\2\u040f"+
			"\2\u040b\1\uffff\3\u040f\3\u040b\1\uffff\4\u040b\1\u040f\5\u040b\1\u040c"+
			"\4\u040b\1\uffff\4\u040b\1\u03f5\1\u040f\1\u040b\1\uffff\3\u040b\1\uffff"+
			"\1\u03fd\1\u040b\1\u040f\3\u040b\1\uffff\1\u040f\1\u03ff\1\u040f\1\u040b"+
			"\1\uffff\1\u040b\1\u040f\1\u03f5\1\uffff\3\u040b\1\u040f\2\u040b\2\u040f"+
			"\3\u040b\1\u040f\1\u040b\1\uffff\1\u040b\2\uffff\1\u040b\1\uffff\1\u040f"+
			"\3\u040b\3\uffff\1\u03f8\2\uffff\1\u03f9\2\uffff\1\u03fb\1\u03f9\7\uffff"+
			"\1\u03f3\1\u0403\1\u0401\1\u03f9\1\u0404\162\uffff\1\u040b\3\uffff\1"+
			"\u040b\60\uffff\1\u040b\3\uffff\1\u040b\27\uffff\1\u040b\3\uffff\1\u040b",
			"\1\u041f\5\uffff\1\u0423\4\uffff\1\u0422\7\uffff\1\u0411\4\u0428\2\u042c"+
			"\1\u0428\1\uffff\1\u0428\1\u0425\1\u042c\1\u0428\1\u042c\2\u0428\1\u042c"+
			"\3\u0429\1\u042c\2\u0428\1\u042c\1\uffff\1\u0428\1\u0427\1\u0426\1\u0428"+
			"\1\uffff\4\u0428\1\uffff\2\u0428\1\uffff\4\u0428\1\uffff\1\u042c\1\u0428"+
			"\1\u042c\1\uffff\1\u042c\1\uffff\1\u0419\1\u041b\1\u042c\1\u0428\1\uffff"+
			"\1\u0428\1\u0417\3\u0428\1\u042c\2\u0428\1\u042c\3\u0428\1\u042c\3\u0428"+
			"\1\uffff\1\u0428\1\u0429\1\u042c\1\u0428\1\uffff\1\u0428\1\uffff\1\u0428"+
			"\1\uffff\1\u0428\1\u042b\2\u0428\1\uffff\1\u042c\1\u0424\1\u042c\4\u0428"+
			"\1\u0429\1\uffff\2\u042c\2\u0428\1\uffff\1\u042c\1\uffff\1\u0428\3\u042c"+
			"\1\uffff\2\u0428\1\u042a\2\u042c\2\u0428\1\u042c\3\u0428\1\u042c\1\u0429"+
			"\1\u042c\1\u041d\2\u042c\3\u0428\1\uffff\4\u0428\2\u042c\1\uffff\1\u0428"+
			"\1\u042c\3\u0428\1\u042c\5\u0428\1\uffff\1\u042a\6\u0428\1\uffff\1\u0428"+
			"\1\u042c\2\u0428\1\u0414\1\u0428\1\u0413\1\u0428\1\u042c\1\u0428\2\uffff"+
			"\1\u0428\1\uffff\3\u042c\2\u0428\1\uffff\2\u0428\1\uffff\1\u042c\2\u0428"+
			"\1\u042c\1\u0428\2\uffff\1\u0428\1\u042c\1\u0428\1\u042c\1\u0428\1\u042c"+
			"\1\u0428\1\u042c\3\u0428\1\uffff\2\u042c\7\u0428\1\u042c\1\u0428\2\u042c"+
			"\2\u0428\1\uffff\3\u042c\3\u0428\1\uffff\4\u0428\1\u042c\5\u0428\1\u0429"+
			"\4\u0428\1\uffff\4\u0428\1\u0412\1\u042c\1\u0428\1\uffff\3\u0428\1\uffff"+
			"\1\u041a\1\u0428\1\u042c\3\u0428\1\uffff\1\u042c\1\u041c\1\u042c\1\u0428"+
			"\1\uffff\1\u0428\1\u042c\1\u0412\1\uffff\3\u0428\1\u042c\2\u0428\2\u042c"+
			"\3\u0428\1\u042c\1\u0428\1\uffff\1\u0428\2\uffff\1\u0428\1\uffff\1\u042c"+
			"\3\u0428\3\uffff\1\u0415\2\uffff\1\u0416\2\uffff\1\u0418\1\u0416\7\uffff"+
			"\1\u0410\1\u0420\1\u041e\1\u0416\1\u0421\162\uffff\1\u0428\3\uffff\1"+
			"\u0428\60\uffff\1\u0428\3\uffff\1\u0428\27\uffff\1\u0428\3\uffff\1\u0428",
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
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "196:5: ( ( KW_AS )=> ( KW_AS alias= identifier ) | ( identifier )=> (alias= identifier ) )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA29_0 = input.LA(1);
						 
						int index29_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_0==KW_AS) ) {s = 1;}
						else if ( (LA29_0==Identifier) ) {s = 2;}
						else if ( (LA29_0==KW_CLUSTER) ) {s = 3;}
						else if ( (LA29_0==KW_LATERAL) ) {s = 4;}
						else if ( (LA29_0==KW_INNER) ) {s = 5;}
						else if ( (LA29_0==EOF||LA29_0==COMMA||LA29_0==KW_CROSS||LA29_0==KW_HAVING||LA29_0==KW_JOIN||LA29_0==KW_MAP||LA29_0==KW_ON||LA29_0==KW_REDUCE||LA29_0==KW_SELECT||LA29_0==KW_WHERE||LA29_0==KW_WINDOW||LA29_0==LPAREN||LA29_0==RPAREN) ) {s = 6;}
						else if ( (LA29_0==KW_LEFT) ) {s = 7;}
						else if ( (LA29_0==KW_RIGHT) ) {s = 10;}
						else if ( (LA29_0==KW_FULL) ) {s = 11;}
						else if ( (LA29_0==KW_INSERT) ) {s = 12;}
						else if ( (LA29_0==KW_GROUP) ) {s = 14;}
						else if ( (LA29_0==KW_ORDER) ) {s = 19;}
						else if ( (LA29_0==KW_UNION) ) {s = 21;}
						else if ( (LA29_0==KW_DISTRIBUTE) ) {s = 22;}
						else if ( (LA29_0==KW_SORT) ) {s = 23;}
						else if ( (LA29_0==KW_LIMIT) ) {s = 24;}
						else if ( ((LA29_0 >= KW_ABORT && LA29_0 <= KW_AFTER)||LA29_0==KW_ANALYZE||LA29_0==KW_ARCHIVE||LA29_0==KW_ASC||(LA29_0 >= KW_AUTOCOMMIT && LA29_0 <= KW_BEFORE)||(LA29_0 >= KW_BUCKET && LA29_0 <= KW_BUCKETS)||LA29_0==KW_CASCADE||LA29_0==KW_CHANGE||(LA29_0 >= KW_CLUSTERED && LA29_0 <= KW_COLLECTION)||(LA29_0 >= KW_COLUMNS && LA29_0 <= KW_COMMENT)||(LA29_0 >= KW_COMPACT && LA29_0 <= KW_CONCATENATE)||LA29_0==KW_CONTINUE||LA29_0==KW_DATA||LA29_0==KW_DATABASES||(LA29_0 >= KW_DATETIME && LA29_0 <= KW_DBPROPERTIES)||(LA29_0 >= KW_DEFERRED && LA29_0 <= KW_DEFINED)||(LA29_0 >= KW_DELIMITED && LA29_0 <= KW_DESC)||(LA29_0 >= KW_DIRECTORIES && LA29_0 <= KW_DISABLE)||LA29_0==KW_ELEM_TYPE||LA29_0==KW_ENABLE||LA29_0==KW_ESCAPED||LA29_0==KW_EXCLUSIVE||(LA29_0 >= KW_EXPLAIN && LA29_0 <= KW_EXPORT)||(LA29_0 >= KW_FIELDS && LA29_0 <= KW_FIRST)||(LA29_0 >= KW_FORMAT && LA29_0 <= KW_FORMATTED)||LA29_0==KW_FUNCTIONS||(LA29_0 >= KW_HOUR && LA29_0 <= KW_IDXPROPERTIES)||(LA29_0 >= KW_INDEX && LA29_0 <= KW_INDEXES)||(LA29_0 >= KW_INPATH && LA29_0 <= KW_INPUTFORMAT)||(LA29_0 >= KW_ISOLATION && LA29_0 <= KW_JAR)||(LA29_0 >= KW_KEY && LA29_0 <= KW_LAST)||LA29_0==KW_LEVEL||(LA29_0 >= KW_LINES && LA29_0 <= KW_LOAD)||(LA29_0 >= KW_LOCATION && LA29_0 <= KW_LONG)||(LA29_0 >= KW_MAPJOIN && LA29_0 <= KW_MONTH)||LA29_0==KW_MSCK||(LA29_0 >= KW_NORELY && LA29_0 <= KW_NOSCAN)||LA29_0==KW_NOVALIDATE||LA29_0==KW_NULLS||LA29_0==KW_OFFSET||LA29_0==KW_OPTION||(LA29_0 >= KW_OUTPUTDRIVER && LA29_0 <= KW_OUTPUTFORMAT)||(LA29_0 >= KW_OVERWRITE && LA29_0 <= KW_OWNER)||(LA29_0 >= KW_PARTITIONED && LA29_0 <= KW_PARTITIONS)||LA29_0==KW_PLUS||LA29_0==KW_PRETTY||LA29_0==KW_PRINCIPALS||LA29_0==KW_PURGE||LA29_0==KW_READ||(LA29_0 >= KW_REBUILD && LA29_0 <= KW_RECORDWRITER)||(LA29_0 >= KW_RELOAD && LA29_0 <= KW_RESTRICT)||LA29_0==KW_REWRITE||(LA29_0 >= KW_ROLE && LA29_0 <= KW_ROLES)||(LA29_0 >= KW_SCHEMA && LA29_0 <= KW_SECOND)||(LA29_0 >= KW_SEMI && LA29_0 <= KW_SERVER)||(LA29_0 >= KW_SETS && LA29_0 <= KW_SKEWED)||LA29_0==KW_SNAPSHOT||(LA29_0 >= KW_SORTED && LA29_0 <= KW_SSL)||(LA29_0 >= KW_STATISTICS && LA29_0 <= KW_STRUCT)||LA29_0==KW_TABLES||(LA29_0 >= KW_TBLPROPERTIES && LA29_0 <= KW_TERMINATED)||LA29_0==KW_TINYINT||(LA29_0 >= KW_TOUCH && LA29_0 <= KW_TRANSACTIONS)||LA29_0==KW_UNARCHIVE||LA29_0==KW_UNDO||LA29_0==KW_UNIONTYPE||(LA29_0 >= KW_UNLOCK && LA29_0 <= KW_UNSIGNED)||(LA29_0 >= KW_URI && LA29_0 <= KW_USE)||(LA29_0 >= KW_UTC && LA29_0 <= KW_VALIDATE)||LA29_0==KW_VALUE_TYPE||LA29_0==KW_VIEW||LA29_0==KW_WHILE||(LA29_0 >= KW_WORK && LA29_0 <= KW_YEAR)||LA29_0==KW_HOLD_DDLTIME||LA29_0==KW_IGNORE||LA29_0==KW_NO_DROP||LA29_0==KW_OFFLINE||LA29_0==KW_PROTECTION||LA29_0==KW_READONLY) && (synpred10_FromClauseParser())) {s = 26;}
						else if ( (LA29_0==KW_PARTITION) ) {s = 27;}
						else if ( ((LA29_0 >= KW_ALL && LA29_0 <= KW_ALTER)||LA29_0==KW_ARRAY||LA29_0==KW_AUTHORIZATION||(LA29_0 >= KW_BETWEEN && LA29_0 <= KW_BOTH)||LA29_0==KW_BY||LA29_0==KW_CONSTRAINT||LA29_0==KW_CREATE||LA29_0==KW_CUBE||(LA29_0 >= KW_CURRENT_DATE && LA29_0 <= KW_CURSOR)||LA29_0==KW_DATE||LA29_0==KW_DECIMAL||LA29_0==KW_DELETE||LA29_0==KW_DESCRIBE||(LA29_0 >= KW_DOUBLE && LA29_0 <= KW_DROP)||LA29_0==KW_EXISTS||(LA29_0 >= KW_EXTERNAL && LA29_0 <= KW_FETCH)||LA29_0==KW_FLOAT||(LA29_0 >= KW_FOR && LA29_0 <= KW_FOREIGN)||LA29_0==KW_GRANT||LA29_0==KW_GROUPING||(LA29_0 >= KW_IMPORT && LA29_0 <= KW_IN)||(LA29_0 >= KW_INT && LA29_0 <= KW_INTERSECT)||(LA29_0 >= KW_INTO && LA29_0 <= KW_IS)||LA29_0==KW_LIKE||LA29_0==KW_LOCAL||LA29_0==KW_NONE||LA29_0==KW_NULL||LA29_0==KW_OF||(LA29_0 >= KW_OUT && LA29_0 <= KW_OUTER)||LA29_0==KW_PERCENT||LA29_0==KW_PRIMARY||LA29_0==KW_PROCEDURE||LA29_0==KW_RANGE||LA29_0==KW_READS||(LA29_0 >= KW_REFERENCES && LA29_0 <= KW_REGEXP)||LA29_0==KW_REVOKE||LA29_0==KW_RLIKE||(LA29_0 >= KW_ROLLUP && LA29_0 <= KW_ROWS)||LA29_0==KW_SET||LA29_0==KW_SMALLINT||LA29_0==KW_TABLE||LA29_0==KW_TIMESTAMP||LA29_0==KW_TO||(LA29_0 >= KW_TRIGGER && LA29_0 <= KW_TRUNCATE)||LA29_0==KW_UPDATE||(LA29_0 >= KW_USER && LA29_0 <= KW_USING)||LA29_0==KW_VALUES||LA29_0==KW_WITH) && (synpred10_FromClauseParser())) {s = 31;}
						 
						input.seek(index29_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA29_1 = input.LA(1);
						 
						int index29_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_1==Identifier) ) {s = 32;}
						else if ( (LA29_1==KW_CLUSTER) ) {s = 33;}
						else if ( (LA29_1==KW_LATERAL) ) {s = 34;}
						else if ( (LA29_1==KW_INNER) ) {s = 35;}
						else if ( (LA29_1==KW_JOIN) && (synpred10_FromClauseParser())) {s = 36;}
						else if ( (LA29_1==KW_LEFT) ) {s = 37;}
						else if ( (LA29_1==COMMA) && (synpred10_FromClauseParser())) {s = 38;}
						else if ( (LA29_1==KW_CROSS) && (synpred10_FromClauseParser())) {s = 39;}
						else if ( (LA29_1==KW_RIGHT) ) {s = 40;}
						else if ( (LA29_1==KW_FULL) ) {s = 41;}
						else if ( (LA29_1==KW_INSERT) ) {s = 42;}
						else if ( (LA29_1==EOF) && (synpred10_FromClauseParser())) {s = 43;}
						else if ( (LA29_1==KW_GROUP) ) {s = 44;}
						else if ( (LA29_1==KW_SELECT) && (synpred10_FromClauseParser())) {s = 45;}
						else if ( (LA29_1==KW_MAP) && (synpred10_FromClauseParser())) {s = 46;}
						else if ( (LA29_1==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 47;}
						else if ( (LA29_1==KW_WHERE) && (synpred10_FromClauseParser())) {s = 48;}
						else if ( (LA29_1==KW_ORDER) ) {s = 49;}
						else if ( (LA29_1==KW_HAVING) && (synpred10_FromClauseParser())) {s = 50;}
						else if ( (LA29_1==KW_UNION) ) {s = 51;}
						else if ( (LA29_1==KW_DISTRIBUTE) ) {s = 52;}
						else if ( (LA29_1==KW_SORT) ) {s = 53;}
						else if ( (LA29_1==KW_LIMIT) ) {s = 54;}
						else if ( (LA29_1==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 55;}
						else if ( ((LA29_1 >= KW_ABORT && LA29_1 <= KW_AFTER)||LA29_1==KW_ANALYZE||LA29_1==KW_ARCHIVE||LA29_1==KW_ASC||(LA29_1 >= KW_AUTOCOMMIT && LA29_1 <= KW_BEFORE)||(LA29_1 >= KW_BUCKET && LA29_1 <= KW_BUCKETS)||LA29_1==KW_CASCADE||LA29_1==KW_CHANGE||(LA29_1 >= KW_CLUSTERED && LA29_1 <= KW_COLLECTION)||(LA29_1 >= KW_COLUMNS && LA29_1 <= KW_COMMENT)||(LA29_1 >= KW_COMPACT && LA29_1 <= KW_CONCATENATE)||LA29_1==KW_CONTINUE||LA29_1==KW_DATA||LA29_1==KW_DATABASES||(LA29_1 >= KW_DATETIME && LA29_1 <= KW_DBPROPERTIES)||(LA29_1 >= KW_DEFERRED && LA29_1 <= KW_DEFINED)||(LA29_1 >= KW_DELIMITED && LA29_1 <= KW_DESC)||(LA29_1 >= KW_DIRECTORIES && LA29_1 <= KW_DISABLE)||LA29_1==KW_ELEM_TYPE||LA29_1==KW_ENABLE||LA29_1==KW_ESCAPED||LA29_1==KW_EXCLUSIVE||(LA29_1 >= KW_EXPLAIN && LA29_1 <= KW_EXPORT)||(LA29_1 >= KW_FIELDS && LA29_1 <= KW_FIRST)||(LA29_1 >= KW_FORMAT && LA29_1 <= KW_FORMATTED)||LA29_1==KW_FUNCTIONS||(LA29_1 >= KW_HOUR && LA29_1 <= KW_IDXPROPERTIES)||(LA29_1 >= KW_INDEX && LA29_1 <= KW_INDEXES)||(LA29_1 >= KW_INPATH && LA29_1 <= KW_INPUTFORMAT)||(LA29_1 >= KW_ISOLATION && LA29_1 <= KW_JAR)||(LA29_1 >= KW_KEY && LA29_1 <= KW_LAST)||LA29_1==KW_LEVEL||(LA29_1 >= KW_LINES && LA29_1 <= KW_LOAD)||(LA29_1 >= KW_LOCATION && LA29_1 <= KW_LONG)||(LA29_1 >= KW_MAPJOIN && LA29_1 <= KW_MONTH)||LA29_1==KW_MSCK||(LA29_1 >= KW_NORELY && LA29_1 <= KW_NOSCAN)||LA29_1==KW_NOVALIDATE||LA29_1==KW_NULLS||LA29_1==KW_OFFSET||LA29_1==KW_OPTION||(LA29_1 >= KW_OUTPUTDRIVER && LA29_1 <= KW_OUTPUTFORMAT)||(LA29_1 >= KW_OVERWRITE && LA29_1 <= KW_OWNER)||(LA29_1 >= KW_PARTITIONED && LA29_1 <= KW_PARTITIONS)||LA29_1==KW_PLUS||LA29_1==KW_PRETTY||LA29_1==KW_PRINCIPALS||LA29_1==KW_PURGE||LA29_1==KW_READ||(LA29_1 >= KW_REBUILD && LA29_1 <= KW_RECORDWRITER)||(LA29_1 >= KW_RELOAD && LA29_1 <= KW_RESTRICT)||LA29_1==KW_REWRITE||(LA29_1 >= KW_ROLE && LA29_1 <= KW_ROLES)||(LA29_1 >= KW_SCHEMA && LA29_1 <= KW_SECOND)||(LA29_1 >= KW_SEMI && LA29_1 <= KW_SERVER)||(LA29_1 >= KW_SETS && LA29_1 <= KW_SKEWED)||LA29_1==KW_SNAPSHOT||(LA29_1 >= KW_SORTED && LA29_1 <= KW_SSL)||(LA29_1 >= KW_STATISTICS && LA29_1 <= KW_STRUCT)||LA29_1==KW_TABLES||(LA29_1 >= KW_TBLPROPERTIES && LA29_1 <= KW_TERMINATED)||LA29_1==KW_TINYINT||(LA29_1 >= KW_TOUCH && LA29_1 <= KW_TRANSACTIONS)||LA29_1==KW_UNARCHIVE||LA29_1==KW_UNDO||LA29_1==KW_UNIONTYPE||(LA29_1 >= KW_UNLOCK && LA29_1 <= KW_UNSIGNED)||(LA29_1 >= KW_URI && LA29_1 <= KW_USE)||(LA29_1 >= KW_UTC && LA29_1 <= KW_VALIDATE)||LA29_1==KW_VALUE_TYPE||LA29_1==KW_VIEW||LA29_1==KW_WHILE||(LA29_1 >= KW_WORK && LA29_1 <= KW_YEAR)||LA29_1==KW_HOLD_DDLTIME||LA29_1==KW_IGNORE||LA29_1==KW_NO_DROP||LA29_1==KW_OFFLINE||LA29_1==KW_PROTECTION||LA29_1==KW_READONLY) && (synpred9_FromClauseParser())) {s = 56;}
						else if ( (LA29_1==KW_PARTITION) ) {s = 57;}
						else if ( (LA29_1==RPAREN) && (synpred10_FromClauseParser())) {s = 58;}
						else if ( (LA29_1==KW_ON) && (synpred10_FromClauseParser())) {s = 59;}
						else if ( (LA29_1==LPAREN) && (synpred10_FromClauseParser())) {s = 60;}
						else if ( ((LA29_1 >= KW_ALL && LA29_1 <= KW_ALTER)||(LA29_1 >= KW_ARRAY && LA29_1 <= KW_AS)||LA29_1==KW_AUTHORIZATION||(LA29_1 >= KW_BETWEEN && LA29_1 <= KW_BOTH)||LA29_1==KW_BY||LA29_1==KW_CONSTRAINT||LA29_1==KW_CREATE||LA29_1==KW_CUBE||(LA29_1 >= KW_CURRENT_DATE && LA29_1 <= KW_CURSOR)||LA29_1==KW_DATE||LA29_1==KW_DECIMAL||LA29_1==KW_DELETE||LA29_1==KW_DESCRIBE||(LA29_1 >= KW_DOUBLE && LA29_1 <= KW_DROP)||LA29_1==KW_EXISTS||(LA29_1 >= KW_EXTERNAL && LA29_1 <= KW_FETCH)||LA29_1==KW_FLOAT||(LA29_1 >= KW_FOR && LA29_1 <= KW_FOREIGN)||LA29_1==KW_GRANT||LA29_1==KW_GROUPING||(LA29_1 >= KW_IMPORT && LA29_1 <= KW_IN)||(LA29_1 >= KW_INT && LA29_1 <= KW_INTERSECT)||(LA29_1 >= KW_INTO && LA29_1 <= KW_IS)||LA29_1==KW_LIKE||LA29_1==KW_LOCAL||LA29_1==KW_NONE||LA29_1==KW_NULL||LA29_1==KW_OF||(LA29_1 >= KW_OUT && LA29_1 <= KW_OUTER)||LA29_1==KW_PERCENT||LA29_1==KW_PRIMARY||LA29_1==KW_PROCEDURE||LA29_1==KW_RANGE||LA29_1==KW_READS||(LA29_1 >= KW_REFERENCES && LA29_1 <= KW_REGEXP)||LA29_1==KW_REVOKE||LA29_1==KW_RLIKE||(LA29_1 >= KW_ROLLUP && LA29_1 <= KW_ROWS)||LA29_1==KW_SET||LA29_1==KW_SMALLINT||LA29_1==KW_TABLE||LA29_1==KW_TIMESTAMP||LA29_1==KW_TO||(LA29_1 >= KW_TRIGGER && LA29_1 <= KW_TRUNCATE)||LA29_1==KW_UPDATE||(LA29_1 >= KW_USER && LA29_1 <= KW_USING)||LA29_1==KW_VALUES||LA29_1==KW_WITH) && (synpred9_FromClauseParser())) {s = 61;}
						 
						input.seek(index29_1);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA29_2 = input.LA(1);
						 
						int index29_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_2==LPAREN) ) {s = 62;}
						else if ( (LA29_2==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 63;}
						else if ( (LA29_2==KW_JOIN) && (synpred10_FromClauseParser())) {s = 64;}
						else if ( (LA29_2==KW_INNER) && (synpred10_FromClauseParser())) {s = 65;}
						else if ( (LA29_2==COMMA) && (synpred10_FromClauseParser())) {s = 66;}
						else if ( (LA29_2==KW_CROSS) && (synpred10_FromClauseParser())) {s = 67;}
						else if ( (LA29_2==KW_LEFT) && (synpred10_FromClauseParser())) {s = 68;}
						else if ( (LA29_2==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 69;}
						else if ( (LA29_2==KW_FULL) && (synpred10_FromClauseParser())) {s = 70;}
						else if ( (LA29_2==EOF) && (synpred10_FromClauseParser())) {s = 71;}
						else if ( (LA29_2==KW_INSERT) && (synpred10_FromClauseParser())) {s = 72;}
						else if ( (LA29_2==KW_SELECT) && (synpred10_FromClauseParser())) {s = 73;}
						else if ( (LA29_2==KW_MAP) && (synpred10_FromClauseParser())) {s = 74;}
						else if ( (LA29_2==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 75;}
						else if ( (LA29_2==KW_WHERE) && (synpred10_FromClauseParser())) {s = 76;}
						else if ( (LA29_2==KW_GROUP) && (synpred10_FromClauseParser())) {s = 77;}
						else if ( (LA29_2==KW_HAVING) && (synpred10_FromClauseParser())) {s = 78;}
						else if ( (LA29_2==KW_ORDER) && (synpred10_FromClauseParser())) {s = 79;}
						else if ( (LA29_2==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 80;}
						else if ( (LA29_2==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 81;}
						else if ( (LA29_2==KW_SORT) && (synpred10_FromClauseParser())) {s = 82;}
						else if ( (LA29_2==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 83;}
						else if ( (LA29_2==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 84;}
						else if ( (LA29_2==KW_UNION) && (synpred10_FromClauseParser())) {s = 85;}
						else if ( (LA29_2==RPAREN) && (synpred10_FromClauseParser())) {s = 86;}
						else if ( (LA29_2==KW_ON) && (synpred10_FromClauseParser())) {s = 87;}
						else if ( (LA29_2==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 88;}
						else if ( (LA29_2==Identifier) && (synpred10_FromClauseParser())) {s = 89;}
						 
						input.seek(index29_2);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA29_3 = input.LA(1);
						 
						int index29_3 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_3==KW_BY) ) {s = 6;}
						else if ( (LA29_3==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 91;}
						else if ( (LA29_3==KW_JOIN) && (synpred10_FromClauseParser())) {s = 92;}
						else if ( (LA29_3==KW_INNER) && (synpred10_FromClauseParser())) {s = 93;}
						else if ( (LA29_3==COMMA) && (synpred10_FromClauseParser())) {s = 94;}
						else if ( (LA29_3==KW_CROSS) && (synpred10_FromClauseParser())) {s = 95;}
						else if ( (LA29_3==KW_LEFT) && (synpred10_FromClauseParser())) {s = 96;}
						else if ( (LA29_3==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 97;}
						else if ( (LA29_3==KW_FULL) && (synpred10_FromClauseParser())) {s = 98;}
						else if ( (LA29_3==EOF) && (synpred10_FromClauseParser())) {s = 99;}
						else if ( (LA29_3==KW_INSERT) && (synpred10_FromClauseParser())) {s = 100;}
						else if ( (LA29_3==KW_SELECT) && (synpred10_FromClauseParser())) {s = 101;}
						else if ( (LA29_3==KW_MAP) && (synpred10_FromClauseParser())) {s = 102;}
						else if ( (LA29_3==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 103;}
						else if ( (LA29_3==KW_WHERE) && (synpred10_FromClauseParser())) {s = 104;}
						else if ( (LA29_3==KW_GROUP) && (synpred10_FromClauseParser())) {s = 105;}
						else if ( (LA29_3==KW_HAVING) && (synpred10_FromClauseParser())) {s = 106;}
						else if ( (LA29_3==KW_ORDER) && (synpred10_FromClauseParser())) {s = 107;}
						else if ( (LA29_3==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 108;}
						else if ( (LA29_3==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 109;}
						else if ( (LA29_3==KW_SORT) && (synpred10_FromClauseParser())) {s = 110;}
						else if ( (LA29_3==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 111;}
						else if ( (LA29_3==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 112;}
						else if ( (LA29_3==KW_UNION) && (synpred10_FromClauseParser())) {s = 113;}
						else if ( (LA29_3==RPAREN) && (synpred10_FromClauseParser())) {s = 114;}
						else if ( (LA29_3==KW_ON) && (synpred10_FromClauseParser())) {s = 115;}
						else if ( (LA29_3==LPAREN) && (synpred10_FromClauseParser())) {s = 116;}
						else if ( (LA29_3==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 117;}
						else if ( (LA29_3==Identifier) && (synpred10_FromClauseParser())) {s = 118;}
						 
						input.seek(index29_3);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA29_4 = input.LA(1);
						 
						int index29_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_4==KW_VIEW) ) {s = 6;}
						else if ( (LA29_4==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 120;}
						else if ( (LA29_4==KW_JOIN) && (synpred10_FromClauseParser())) {s = 121;}
						else if ( (LA29_4==KW_INNER) && (synpred10_FromClauseParser())) {s = 122;}
						else if ( (LA29_4==COMMA) && (synpred10_FromClauseParser())) {s = 123;}
						else if ( (LA29_4==KW_CROSS) && (synpred10_FromClauseParser())) {s = 124;}
						else if ( (LA29_4==KW_LEFT) && (synpred10_FromClauseParser())) {s = 125;}
						else if ( (LA29_4==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 126;}
						else if ( (LA29_4==KW_FULL) && (synpred10_FromClauseParser())) {s = 127;}
						else if ( (LA29_4==EOF) && (synpred10_FromClauseParser())) {s = 128;}
						else if ( (LA29_4==KW_INSERT) && (synpred10_FromClauseParser())) {s = 129;}
						else if ( (LA29_4==KW_SELECT) && (synpred10_FromClauseParser())) {s = 130;}
						else if ( (LA29_4==KW_MAP) && (synpred10_FromClauseParser())) {s = 131;}
						else if ( (LA29_4==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 132;}
						else if ( (LA29_4==KW_WHERE) && (synpred10_FromClauseParser())) {s = 133;}
						else if ( (LA29_4==KW_GROUP) && (synpred10_FromClauseParser())) {s = 134;}
						else if ( (LA29_4==KW_HAVING) && (synpred10_FromClauseParser())) {s = 135;}
						else if ( (LA29_4==KW_ORDER) && (synpred10_FromClauseParser())) {s = 136;}
						else if ( (LA29_4==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 137;}
						else if ( (LA29_4==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 138;}
						else if ( (LA29_4==KW_SORT) && (synpred10_FromClauseParser())) {s = 139;}
						else if ( (LA29_4==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 140;}
						else if ( (LA29_4==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 141;}
						else if ( (LA29_4==KW_UNION) && (synpred10_FromClauseParser())) {s = 142;}
						else if ( (LA29_4==RPAREN) && (synpred10_FromClauseParser())) {s = 143;}
						else if ( (LA29_4==KW_ON) && (synpred10_FromClauseParser())) {s = 144;}
						else if ( (LA29_4==LPAREN) && (synpred10_FromClauseParser())) {s = 145;}
						else if ( (LA29_4==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 146;}
						else if ( (LA29_4==Identifier) && (synpred10_FromClauseParser())) {s = 147;}
						 
						input.seek(index29_4);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA29_5 = input.LA(1);
						 
						int index29_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_5==KW_JOIN) ) {s = 148;}
						else if ( (LA29_5==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 149;}
						else if ( (LA29_5==KW_INNER) && (synpred10_FromClauseParser())) {s = 150;}
						else if ( (LA29_5==COMMA) && (synpred10_FromClauseParser())) {s = 151;}
						else if ( (LA29_5==KW_CROSS) && (synpred10_FromClauseParser())) {s = 152;}
						else if ( (LA29_5==KW_LEFT) && (synpred10_FromClauseParser())) {s = 153;}
						else if ( (LA29_5==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 154;}
						else if ( (LA29_5==KW_FULL) && (synpred10_FromClauseParser())) {s = 155;}
						else if ( (LA29_5==EOF) && (synpred10_FromClauseParser())) {s = 156;}
						else if ( (LA29_5==KW_INSERT) && (synpred10_FromClauseParser())) {s = 157;}
						else if ( (LA29_5==KW_SELECT) && (synpred10_FromClauseParser())) {s = 158;}
						else if ( (LA29_5==KW_MAP) && (synpred10_FromClauseParser())) {s = 159;}
						else if ( (LA29_5==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 160;}
						else if ( (LA29_5==KW_WHERE) && (synpred10_FromClauseParser())) {s = 161;}
						else if ( (LA29_5==KW_GROUP) && (synpred10_FromClauseParser())) {s = 162;}
						else if ( (LA29_5==KW_HAVING) && (synpred10_FromClauseParser())) {s = 163;}
						else if ( (LA29_5==KW_ORDER) && (synpred10_FromClauseParser())) {s = 164;}
						else if ( (LA29_5==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 165;}
						else if ( (LA29_5==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 166;}
						else if ( (LA29_5==KW_SORT) && (synpred10_FromClauseParser())) {s = 167;}
						else if ( (LA29_5==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 168;}
						else if ( (LA29_5==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 169;}
						else if ( (LA29_5==KW_UNION) && (synpred10_FromClauseParser())) {s = 170;}
						else if ( (LA29_5==RPAREN) && (synpred10_FromClauseParser())) {s = 171;}
						else if ( (LA29_5==KW_ON) && (synpred10_FromClauseParser())) {s = 172;}
						else if ( (LA29_5==LPAREN) && (synpred10_FromClauseParser())) {s = 173;}
						else if ( (LA29_5==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 174;}
						else if ( (LA29_5==Identifier) && (synpred10_FromClauseParser())) {s = 175;}
						 
						input.seek(index29_5);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA29_7 = input.LA(1);
						 
						int index29_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_7==KW_OUTER||LA29_7==KW_SEMI) ) {s = 6;}
						else if ( (LA29_7==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 177;}
						else if ( (LA29_7==KW_JOIN) ) {s = 178;}
						else if ( (LA29_7==KW_INNER) && (synpred10_FromClauseParser())) {s = 179;}
						else if ( (LA29_7==COMMA) && (synpred10_FromClauseParser())) {s = 180;}
						else if ( (LA29_7==KW_CROSS) && (synpred10_FromClauseParser())) {s = 181;}
						else if ( (LA29_7==KW_LEFT) && (synpred10_FromClauseParser())) {s = 182;}
						else if ( (LA29_7==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 183;}
						else if ( (LA29_7==KW_FULL) && (synpred10_FromClauseParser())) {s = 184;}
						else if ( (LA29_7==EOF) && (synpred10_FromClauseParser())) {s = 185;}
						else if ( (LA29_7==KW_INSERT) && (synpred10_FromClauseParser())) {s = 186;}
						else if ( (LA29_7==KW_SELECT) && (synpred10_FromClauseParser())) {s = 187;}
						else if ( (LA29_7==KW_MAP) && (synpred10_FromClauseParser())) {s = 188;}
						else if ( (LA29_7==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 189;}
						else if ( (LA29_7==KW_WHERE) && (synpred10_FromClauseParser())) {s = 190;}
						else if ( (LA29_7==KW_GROUP) && (synpred10_FromClauseParser())) {s = 191;}
						else if ( (LA29_7==KW_HAVING) && (synpred10_FromClauseParser())) {s = 192;}
						else if ( (LA29_7==KW_ORDER) && (synpred10_FromClauseParser())) {s = 193;}
						else if ( (LA29_7==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 194;}
						else if ( (LA29_7==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 195;}
						else if ( (LA29_7==KW_SORT) && (synpred10_FromClauseParser())) {s = 196;}
						else if ( (LA29_7==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 197;}
						else if ( (LA29_7==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 198;}
						else if ( (LA29_7==KW_UNION) && (synpred10_FromClauseParser())) {s = 199;}
						else if ( (LA29_7==RPAREN) && (synpred10_FromClauseParser())) {s = 200;}
						else if ( (LA29_7==KW_ON) && (synpred10_FromClauseParser())) {s = 201;}
						else if ( (LA29_7==LPAREN) && (synpred10_FromClauseParser())) {s = 202;}
						else if ( (LA29_7==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 203;}
						else if ( (LA29_7==Identifier) && (synpred10_FromClauseParser())) {s = 204;}
						 
						input.seek(index29_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA29_10 = input.LA(1);
						 
						int index29_10 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_10==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 206;}
						else if ( (LA29_10==KW_JOIN) ) {s = 207;}
						else if ( (LA29_10==KW_INNER) && (synpred10_FromClauseParser())) {s = 208;}
						else if ( (LA29_10==COMMA) && (synpred10_FromClauseParser())) {s = 209;}
						else if ( (LA29_10==KW_CROSS) && (synpred10_FromClauseParser())) {s = 210;}
						else if ( (LA29_10==KW_LEFT) && (synpred10_FromClauseParser())) {s = 211;}
						else if ( (LA29_10==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 212;}
						else if ( (LA29_10==KW_FULL) && (synpred10_FromClauseParser())) {s = 213;}
						else if ( (LA29_10==EOF) && (synpred10_FromClauseParser())) {s = 214;}
						else if ( (LA29_10==KW_INSERT) && (synpred10_FromClauseParser())) {s = 215;}
						else if ( (LA29_10==KW_SELECT) && (synpred10_FromClauseParser())) {s = 216;}
						else if ( (LA29_10==KW_MAP) && (synpred10_FromClauseParser())) {s = 217;}
						else if ( (LA29_10==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 218;}
						else if ( (LA29_10==KW_WHERE) && (synpred10_FromClauseParser())) {s = 219;}
						else if ( (LA29_10==KW_GROUP) && (synpred10_FromClauseParser())) {s = 220;}
						else if ( (LA29_10==KW_HAVING) && (synpred10_FromClauseParser())) {s = 221;}
						else if ( (LA29_10==KW_ORDER) && (synpred10_FromClauseParser())) {s = 222;}
						else if ( (LA29_10==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 223;}
						else if ( (LA29_10==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 224;}
						else if ( (LA29_10==KW_SORT) && (synpred10_FromClauseParser())) {s = 225;}
						else if ( (LA29_10==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 226;}
						else if ( (LA29_10==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 227;}
						else if ( (LA29_10==KW_UNION) && (synpred10_FromClauseParser())) {s = 228;}
						else if ( (LA29_10==RPAREN) && (synpred10_FromClauseParser())) {s = 229;}
						else if ( (LA29_10==KW_ON) && (synpred10_FromClauseParser())) {s = 230;}
						else if ( (LA29_10==LPAREN) && (synpred10_FromClauseParser())) {s = 231;}
						else if ( (LA29_10==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 232;}
						else if ( (LA29_10==Identifier) && (synpred10_FromClauseParser())) {s = 233;}
						else if ( (LA29_10==KW_OUTER) ) {s = 6;}
						 
						input.seek(index29_10);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA29_11 = input.LA(1);
						 
						int index29_11 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_11==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 235;}
						else if ( (LA29_11==KW_JOIN) ) {s = 236;}
						else if ( (LA29_11==KW_INNER) && (synpred10_FromClauseParser())) {s = 237;}
						else if ( (LA29_11==COMMA) && (synpred10_FromClauseParser())) {s = 238;}
						else if ( (LA29_11==KW_CROSS) && (synpred10_FromClauseParser())) {s = 239;}
						else if ( (LA29_11==KW_LEFT) && (synpred10_FromClauseParser())) {s = 240;}
						else if ( (LA29_11==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 241;}
						else if ( (LA29_11==KW_FULL) && (synpred10_FromClauseParser())) {s = 242;}
						else if ( (LA29_11==EOF) && (synpred10_FromClauseParser())) {s = 243;}
						else if ( (LA29_11==KW_INSERT) && (synpred10_FromClauseParser())) {s = 244;}
						else if ( (LA29_11==KW_SELECT) && (synpred10_FromClauseParser())) {s = 245;}
						else if ( (LA29_11==KW_MAP) && (synpred10_FromClauseParser())) {s = 246;}
						else if ( (LA29_11==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 247;}
						else if ( (LA29_11==KW_WHERE) && (synpred10_FromClauseParser())) {s = 248;}
						else if ( (LA29_11==KW_GROUP) && (synpred10_FromClauseParser())) {s = 249;}
						else if ( (LA29_11==KW_HAVING) && (synpred10_FromClauseParser())) {s = 250;}
						else if ( (LA29_11==KW_ORDER) && (synpred10_FromClauseParser())) {s = 251;}
						else if ( (LA29_11==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 252;}
						else if ( (LA29_11==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 253;}
						else if ( (LA29_11==KW_SORT) && (synpred10_FromClauseParser())) {s = 254;}
						else if ( (LA29_11==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 255;}
						else if ( (LA29_11==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 256;}
						else if ( (LA29_11==KW_UNION) && (synpred10_FromClauseParser())) {s = 257;}
						else if ( (LA29_11==RPAREN) && (synpred10_FromClauseParser())) {s = 258;}
						else if ( (LA29_11==KW_ON) && (synpred10_FromClauseParser())) {s = 259;}
						else if ( (LA29_11==LPAREN) && (synpred10_FromClauseParser())) {s = 260;}
						else if ( (LA29_11==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 261;}
						else if ( (LA29_11==Identifier) && (synpred10_FromClauseParser())) {s = 262;}
						else if ( (LA29_11==KW_OUTER) ) {s = 6;}
						 
						input.seek(index29_11);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA29_12 = input.LA(1);
						 
						int index29_12 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_12==KW_INTO||LA29_12==KW_OVERWRITE) ) {s = 6;}
						else if ( (LA29_12==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 266;}
						else if ( (LA29_12==KW_JOIN) && (synpred10_FromClauseParser())) {s = 267;}
						else if ( (LA29_12==KW_INNER) && (synpred10_FromClauseParser())) {s = 268;}
						else if ( (LA29_12==COMMA) && (synpred10_FromClauseParser())) {s = 269;}
						else if ( (LA29_12==KW_CROSS) && (synpred10_FromClauseParser())) {s = 270;}
						else if ( (LA29_12==KW_LEFT) && (synpred10_FromClauseParser())) {s = 271;}
						else if ( (LA29_12==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 272;}
						else if ( (LA29_12==KW_FULL) && (synpred10_FromClauseParser())) {s = 273;}
						else if ( (LA29_12==EOF) && (synpred10_FromClauseParser())) {s = 274;}
						else if ( (LA29_12==KW_INSERT) && (synpred10_FromClauseParser())) {s = 275;}
						else if ( (LA29_12==KW_SELECT) && (synpred10_FromClauseParser())) {s = 276;}
						else if ( (LA29_12==KW_MAP) && (synpred10_FromClauseParser())) {s = 277;}
						else if ( (LA29_12==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 278;}
						else if ( (LA29_12==KW_WHERE) && (synpred10_FromClauseParser())) {s = 279;}
						else if ( (LA29_12==KW_GROUP) && (synpred10_FromClauseParser())) {s = 280;}
						else if ( (LA29_12==KW_HAVING) && (synpred10_FromClauseParser())) {s = 281;}
						else if ( (LA29_12==KW_ORDER) && (synpred10_FromClauseParser())) {s = 282;}
						else if ( (LA29_12==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 283;}
						else if ( (LA29_12==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 284;}
						else if ( (LA29_12==KW_SORT) && (synpred10_FromClauseParser())) {s = 285;}
						else if ( (LA29_12==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 286;}
						else if ( (LA29_12==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 287;}
						else if ( (LA29_12==KW_UNION) && (synpred10_FromClauseParser())) {s = 288;}
						else if ( (LA29_12==RPAREN) && (synpred10_FromClauseParser())) {s = 289;}
						else if ( (LA29_12==KW_ON) && (synpred10_FromClauseParser())) {s = 290;}
						else if ( (LA29_12==LPAREN) && (synpred10_FromClauseParser())) {s = 291;}
						else if ( (LA29_12==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 292;}
						else if ( (LA29_12==Identifier) && (synpred10_FromClauseParser())) {s = 293;}
						 
						input.seek(index29_12);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA29_14 = input.LA(1);
						 
						int index29_14 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_14==KW_BY) ) {s = 6;}
						else if ( (LA29_14==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 295;}
						else if ( (LA29_14==KW_JOIN) && (synpred10_FromClauseParser())) {s = 296;}
						else if ( (LA29_14==KW_INNER) && (synpred10_FromClauseParser())) {s = 297;}
						else if ( (LA29_14==COMMA) && (synpred10_FromClauseParser())) {s = 298;}
						else if ( (LA29_14==KW_CROSS) && (synpred10_FromClauseParser())) {s = 299;}
						else if ( (LA29_14==KW_LEFT) && (synpred10_FromClauseParser())) {s = 300;}
						else if ( (LA29_14==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 301;}
						else if ( (LA29_14==KW_FULL) && (synpred10_FromClauseParser())) {s = 302;}
						else if ( (LA29_14==EOF) && (synpred10_FromClauseParser())) {s = 303;}
						else if ( (LA29_14==KW_INSERT) && (synpred10_FromClauseParser())) {s = 304;}
						else if ( (LA29_14==KW_SELECT) && (synpred10_FromClauseParser())) {s = 305;}
						else if ( (LA29_14==KW_MAP) && (synpred10_FromClauseParser())) {s = 306;}
						else if ( (LA29_14==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 307;}
						else if ( (LA29_14==KW_WHERE) && (synpred10_FromClauseParser())) {s = 308;}
						else if ( (LA29_14==KW_GROUP) && (synpred10_FromClauseParser())) {s = 309;}
						else if ( (LA29_14==KW_HAVING) && (synpred10_FromClauseParser())) {s = 310;}
						else if ( (LA29_14==KW_ORDER) && (synpred10_FromClauseParser())) {s = 311;}
						else if ( (LA29_14==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 312;}
						else if ( (LA29_14==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 313;}
						else if ( (LA29_14==KW_SORT) && (synpred10_FromClauseParser())) {s = 314;}
						else if ( (LA29_14==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 315;}
						else if ( (LA29_14==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 316;}
						else if ( (LA29_14==KW_UNION) && (synpred10_FromClauseParser())) {s = 317;}
						else if ( (LA29_14==RPAREN) && (synpred10_FromClauseParser())) {s = 318;}
						else if ( (LA29_14==KW_ON) && (synpred10_FromClauseParser())) {s = 319;}
						else if ( (LA29_14==LPAREN) && (synpred10_FromClauseParser())) {s = 320;}
						else if ( (LA29_14==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 321;}
						else if ( (LA29_14==Identifier) && (synpred10_FromClauseParser())) {s = 322;}
						 
						input.seek(index29_14);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA29_19 = input.LA(1);
						 
						int index29_19 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_19==KW_BY) ) {s = 6;}
						else if ( (LA29_19==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 324;}
						else if ( (LA29_19==KW_JOIN) && (synpred10_FromClauseParser())) {s = 325;}
						else if ( (LA29_19==KW_INNER) && (synpred10_FromClauseParser())) {s = 326;}
						else if ( (LA29_19==COMMA) && (synpred10_FromClauseParser())) {s = 327;}
						else if ( (LA29_19==KW_CROSS) && (synpred10_FromClauseParser())) {s = 328;}
						else if ( (LA29_19==KW_LEFT) && (synpred10_FromClauseParser())) {s = 329;}
						else if ( (LA29_19==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 330;}
						else if ( (LA29_19==KW_FULL) && (synpred10_FromClauseParser())) {s = 331;}
						else if ( (LA29_19==EOF) && (synpred10_FromClauseParser())) {s = 332;}
						else if ( (LA29_19==KW_INSERT) && (synpred10_FromClauseParser())) {s = 333;}
						else if ( (LA29_19==KW_SELECT) && (synpred10_FromClauseParser())) {s = 334;}
						else if ( (LA29_19==KW_MAP) && (synpred10_FromClauseParser())) {s = 335;}
						else if ( (LA29_19==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 336;}
						else if ( (LA29_19==KW_WHERE) && (synpred10_FromClauseParser())) {s = 337;}
						else if ( (LA29_19==KW_GROUP) && (synpred10_FromClauseParser())) {s = 338;}
						else if ( (LA29_19==KW_HAVING) && (synpred10_FromClauseParser())) {s = 339;}
						else if ( (LA29_19==KW_ORDER) && (synpred10_FromClauseParser())) {s = 340;}
						else if ( (LA29_19==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 341;}
						else if ( (LA29_19==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 342;}
						else if ( (LA29_19==KW_SORT) && (synpred10_FromClauseParser())) {s = 343;}
						else if ( (LA29_19==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 344;}
						else if ( (LA29_19==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 345;}
						else if ( (LA29_19==KW_UNION) && (synpred10_FromClauseParser())) {s = 346;}
						else if ( (LA29_19==RPAREN) && (synpred10_FromClauseParser())) {s = 347;}
						else if ( (LA29_19==KW_ON) && (synpred10_FromClauseParser())) {s = 348;}
						else if ( (LA29_19==LPAREN) && (synpred10_FromClauseParser())) {s = 349;}
						else if ( (LA29_19==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 350;}
						else if ( (LA29_19==Identifier) && (synpred10_FromClauseParser())) {s = 351;}
						 
						input.seek(index29_19);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA29_21 = input.LA(1);
						 
						int index29_21 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_21==KW_ALL||LA29_21==KW_DISTINCT) ) {s = 6;}
						else if ( (LA29_21==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 353;}
						else if ( (LA29_21==KW_JOIN) && (synpred10_FromClauseParser())) {s = 354;}
						else if ( (LA29_21==KW_INNER) && (synpred10_FromClauseParser())) {s = 355;}
						else if ( (LA29_21==COMMA) && (synpred10_FromClauseParser())) {s = 356;}
						else if ( (LA29_21==KW_CROSS) && (synpred10_FromClauseParser())) {s = 357;}
						else if ( (LA29_21==KW_LEFT) && (synpred10_FromClauseParser())) {s = 358;}
						else if ( (LA29_21==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 359;}
						else if ( (LA29_21==KW_FULL) && (synpred10_FromClauseParser())) {s = 360;}
						else if ( (LA29_21==EOF) && (synpred10_FromClauseParser())) {s = 361;}
						else if ( (LA29_21==KW_INSERT) && (synpred10_FromClauseParser())) {s = 362;}
						else if ( (LA29_21==KW_SELECT) ) {s = 363;}
						else if ( (LA29_21==KW_MAP) ) {s = 364;}
						else if ( (LA29_21==KW_REDUCE) ) {s = 365;}
						else if ( (LA29_21==KW_WHERE) && (synpred10_FromClauseParser())) {s = 366;}
						else if ( (LA29_21==KW_GROUP) && (synpred10_FromClauseParser())) {s = 367;}
						else if ( (LA29_21==KW_HAVING) && (synpred10_FromClauseParser())) {s = 368;}
						else if ( (LA29_21==KW_ORDER) && (synpred10_FromClauseParser())) {s = 369;}
						else if ( (LA29_21==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 370;}
						else if ( (LA29_21==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 371;}
						else if ( (LA29_21==KW_SORT) && (synpred10_FromClauseParser())) {s = 372;}
						else if ( (LA29_21==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 373;}
						else if ( (LA29_21==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 374;}
						else if ( (LA29_21==KW_UNION) && (synpred10_FromClauseParser())) {s = 375;}
						else if ( (LA29_21==RPAREN) && (synpred10_FromClauseParser())) {s = 376;}
						else if ( (LA29_21==KW_ON) && (synpred10_FromClauseParser())) {s = 377;}
						else if ( (LA29_21==LPAREN) && (synpred10_FromClauseParser())) {s = 378;}
						else if ( (LA29_21==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 379;}
						else if ( (LA29_21==Identifier) && (synpred10_FromClauseParser())) {s = 380;}
						 
						input.seek(index29_21);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA29_22 = input.LA(1);
						 
						int index29_22 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_22==KW_BY) ) {s = 6;}
						else if ( (LA29_22==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 383;}
						else if ( (LA29_22==KW_JOIN) && (synpred10_FromClauseParser())) {s = 384;}
						else if ( (LA29_22==KW_INNER) && (synpred10_FromClauseParser())) {s = 385;}
						else if ( (LA29_22==COMMA) && (synpred10_FromClauseParser())) {s = 386;}
						else if ( (LA29_22==KW_CROSS) && (synpred10_FromClauseParser())) {s = 387;}
						else if ( (LA29_22==KW_LEFT) && (synpred10_FromClauseParser())) {s = 388;}
						else if ( (LA29_22==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 389;}
						else if ( (LA29_22==KW_FULL) && (synpred10_FromClauseParser())) {s = 390;}
						else if ( (LA29_22==EOF) && (synpred10_FromClauseParser())) {s = 391;}
						else if ( (LA29_22==KW_INSERT) && (synpred10_FromClauseParser())) {s = 392;}
						else if ( (LA29_22==KW_SELECT) && (synpred10_FromClauseParser())) {s = 393;}
						else if ( (LA29_22==KW_MAP) && (synpred10_FromClauseParser())) {s = 394;}
						else if ( (LA29_22==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 395;}
						else if ( (LA29_22==KW_WHERE) && (synpred10_FromClauseParser())) {s = 396;}
						else if ( (LA29_22==KW_GROUP) && (synpred10_FromClauseParser())) {s = 397;}
						else if ( (LA29_22==KW_HAVING) && (synpred10_FromClauseParser())) {s = 398;}
						else if ( (LA29_22==KW_ORDER) && (synpred10_FromClauseParser())) {s = 399;}
						else if ( (LA29_22==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 400;}
						else if ( (LA29_22==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 401;}
						else if ( (LA29_22==KW_SORT) && (synpred10_FromClauseParser())) {s = 402;}
						else if ( (LA29_22==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 403;}
						else if ( (LA29_22==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 404;}
						else if ( (LA29_22==KW_UNION) && (synpred10_FromClauseParser())) {s = 405;}
						else if ( (LA29_22==RPAREN) && (synpred10_FromClauseParser())) {s = 406;}
						else if ( (LA29_22==KW_ON) && (synpred10_FromClauseParser())) {s = 407;}
						else if ( (LA29_22==LPAREN) && (synpred10_FromClauseParser())) {s = 408;}
						else if ( (LA29_22==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 409;}
						else if ( (LA29_22==Identifier) && (synpred10_FromClauseParser())) {s = 410;}
						 
						input.seek(index29_22);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA29_23 = input.LA(1);
						 
						int index29_23 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_23==KW_BY) ) {s = 6;}
						else if ( (LA29_23==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 412;}
						else if ( (LA29_23==KW_JOIN) && (synpred10_FromClauseParser())) {s = 413;}
						else if ( (LA29_23==KW_INNER) && (synpred10_FromClauseParser())) {s = 414;}
						else if ( (LA29_23==COMMA) && (synpred10_FromClauseParser())) {s = 415;}
						else if ( (LA29_23==KW_CROSS) && (synpred10_FromClauseParser())) {s = 416;}
						else if ( (LA29_23==KW_LEFT) && (synpred10_FromClauseParser())) {s = 417;}
						else if ( (LA29_23==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 418;}
						else if ( (LA29_23==KW_FULL) && (synpred10_FromClauseParser())) {s = 419;}
						else if ( (LA29_23==EOF) && (synpred10_FromClauseParser())) {s = 420;}
						else if ( (LA29_23==KW_INSERT) && (synpred10_FromClauseParser())) {s = 421;}
						else if ( (LA29_23==KW_SELECT) && (synpred10_FromClauseParser())) {s = 422;}
						else if ( (LA29_23==KW_MAP) && (synpred10_FromClauseParser())) {s = 423;}
						else if ( (LA29_23==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 424;}
						else if ( (LA29_23==KW_WHERE) && (synpred10_FromClauseParser())) {s = 425;}
						else if ( (LA29_23==KW_GROUP) && (synpred10_FromClauseParser())) {s = 426;}
						else if ( (LA29_23==KW_HAVING) && (synpred10_FromClauseParser())) {s = 427;}
						else if ( (LA29_23==KW_ORDER) && (synpred10_FromClauseParser())) {s = 428;}
						else if ( (LA29_23==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 429;}
						else if ( (LA29_23==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 430;}
						else if ( (LA29_23==KW_SORT) && (synpred10_FromClauseParser())) {s = 431;}
						else if ( (LA29_23==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 432;}
						else if ( (LA29_23==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 433;}
						else if ( (LA29_23==KW_UNION) && (synpred10_FromClauseParser())) {s = 434;}
						else if ( (LA29_23==RPAREN) && (synpred10_FromClauseParser())) {s = 435;}
						else if ( (LA29_23==KW_ON) && (synpred10_FromClauseParser())) {s = 436;}
						else if ( (LA29_23==LPAREN) && (synpred10_FromClauseParser())) {s = 437;}
						else if ( (LA29_23==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 438;}
						else if ( (LA29_23==Identifier) && (synpred10_FromClauseParser())) {s = 439;}
						 
						input.seek(index29_23);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA29_24 = input.LA(1);
						 
						int index29_24 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_24==Number) ) {s = 6;}
						else if ( (LA29_24==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 441;}
						else if ( (LA29_24==KW_JOIN) && (synpred10_FromClauseParser())) {s = 442;}
						else if ( (LA29_24==KW_INNER) && (synpred10_FromClauseParser())) {s = 443;}
						else if ( (LA29_24==COMMA) && (synpred10_FromClauseParser())) {s = 444;}
						else if ( (LA29_24==KW_CROSS) && (synpred10_FromClauseParser())) {s = 445;}
						else if ( (LA29_24==KW_LEFT) && (synpred10_FromClauseParser())) {s = 446;}
						else if ( (LA29_24==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 447;}
						else if ( (LA29_24==KW_FULL) && (synpred10_FromClauseParser())) {s = 448;}
						else if ( (LA29_24==EOF) && (synpred10_FromClauseParser())) {s = 449;}
						else if ( (LA29_24==KW_INSERT) && (synpred10_FromClauseParser())) {s = 450;}
						else if ( (LA29_24==KW_SELECT) && (synpred10_FromClauseParser())) {s = 451;}
						else if ( (LA29_24==KW_MAP) && (synpred10_FromClauseParser())) {s = 452;}
						else if ( (LA29_24==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 453;}
						else if ( (LA29_24==KW_WHERE) && (synpred10_FromClauseParser())) {s = 454;}
						else if ( (LA29_24==KW_GROUP) && (synpred10_FromClauseParser())) {s = 455;}
						else if ( (LA29_24==KW_HAVING) && (synpred10_FromClauseParser())) {s = 456;}
						else if ( (LA29_24==KW_ORDER) && (synpred10_FromClauseParser())) {s = 457;}
						else if ( (LA29_24==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 458;}
						else if ( (LA29_24==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 459;}
						else if ( (LA29_24==KW_SORT) && (synpred10_FromClauseParser())) {s = 460;}
						else if ( (LA29_24==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 461;}
						else if ( (LA29_24==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 462;}
						else if ( (LA29_24==KW_UNION) && (synpred10_FromClauseParser())) {s = 463;}
						else if ( (LA29_24==RPAREN) && (synpred10_FromClauseParser())) {s = 464;}
						else if ( (LA29_24==KW_ON) && (synpred10_FromClauseParser())) {s = 465;}
						else if ( (LA29_24==LPAREN) && (synpred10_FromClauseParser())) {s = 466;}
						else if ( (LA29_24==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 467;}
						else if ( (LA29_24==Identifier) && (synpred10_FromClauseParser())) {s = 468;}
						 
						input.seek(index29_24);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA29_27 = input.LA(1);
						 
						int index29_27 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_27==KW_BY) ) {s = 6;}
						else if ( (LA29_27==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 470;}
						else if ( (LA29_27==KW_JOIN) && (synpred10_FromClauseParser())) {s = 471;}
						else if ( (LA29_27==KW_INNER) && (synpred10_FromClauseParser())) {s = 472;}
						else if ( (LA29_27==COMMA) && (synpred10_FromClauseParser())) {s = 473;}
						else if ( (LA29_27==KW_CROSS) && (synpred10_FromClauseParser())) {s = 474;}
						else if ( (LA29_27==KW_LEFT) && (synpred10_FromClauseParser())) {s = 475;}
						else if ( (LA29_27==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 476;}
						else if ( (LA29_27==KW_FULL) && (synpred10_FromClauseParser())) {s = 477;}
						else if ( (LA29_27==EOF) && (synpred10_FromClauseParser())) {s = 478;}
						else if ( (LA29_27==KW_INSERT) && (synpred10_FromClauseParser())) {s = 479;}
						else if ( (LA29_27==KW_SELECT) && (synpred10_FromClauseParser())) {s = 480;}
						else if ( (LA29_27==KW_MAP) && (synpred10_FromClauseParser())) {s = 481;}
						else if ( (LA29_27==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 482;}
						else if ( (LA29_27==KW_WHERE) && (synpred10_FromClauseParser())) {s = 483;}
						else if ( (LA29_27==KW_GROUP) && (synpred10_FromClauseParser())) {s = 484;}
						else if ( (LA29_27==KW_HAVING) && (synpred10_FromClauseParser())) {s = 485;}
						else if ( (LA29_27==KW_ORDER) && (synpred10_FromClauseParser())) {s = 486;}
						else if ( (LA29_27==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 487;}
						else if ( (LA29_27==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 488;}
						else if ( (LA29_27==KW_SORT) && (synpred10_FromClauseParser())) {s = 489;}
						else if ( (LA29_27==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 490;}
						else if ( (LA29_27==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 491;}
						else if ( (LA29_27==KW_UNION) && (synpred10_FromClauseParser())) {s = 492;}
						else if ( (LA29_27==RPAREN) && (synpred10_FromClauseParser())) {s = 493;}
						else if ( (LA29_27==KW_ON) && (synpred10_FromClauseParser())) {s = 494;}
						else if ( (LA29_27==LPAREN) && (synpred10_FromClauseParser())) {s = 495;}
						else if ( (LA29_27==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 496;}
						else if ( (LA29_27==Identifier) && (synpred10_FromClauseParser())) {s = 497;}
						 
						input.seek(index29_27);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA29_32 = input.LA(1);
						 
						int index29_32 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_32==LPAREN) ) {s = 498;}
						else if ( (LA29_32==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 499;}
						else if ( (LA29_32==KW_JOIN) && (synpred9_FromClauseParser())) {s = 500;}
						else if ( (LA29_32==KW_INNER) && (synpred9_FromClauseParser())) {s = 501;}
						else if ( (LA29_32==COMMA) && (synpred9_FromClauseParser())) {s = 502;}
						else if ( (LA29_32==KW_CROSS) && (synpred9_FromClauseParser())) {s = 503;}
						else if ( (LA29_32==KW_LEFT) && (synpred9_FromClauseParser())) {s = 504;}
						else if ( (LA29_32==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 505;}
						else if ( (LA29_32==KW_FULL) && (synpred9_FromClauseParser())) {s = 506;}
						else if ( (LA29_32==EOF) && (synpred9_FromClauseParser())) {s = 507;}
						else if ( (LA29_32==KW_INSERT) && (synpred9_FromClauseParser())) {s = 508;}
						else if ( (LA29_32==KW_SELECT) && (synpred9_FromClauseParser())) {s = 509;}
						else if ( (LA29_32==KW_MAP) && (synpred9_FromClauseParser())) {s = 510;}
						else if ( (LA29_32==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 511;}
						else if ( (LA29_32==KW_WHERE) && (synpred9_FromClauseParser())) {s = 512;}
						else if ( (LA29_32==KW_GROUP) && (synpred9_FromClauseParser())) {s = 513;}
						else if ( (LA29_32==KW_HAVING) && (synpred9_FromClauseParser())) {s = 514;}
						else if ( (LA29_32==KW_ORDER) && (synpred9_FromClauseParser())) {s = 515;}
						else if ( (LA29_32==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 516;}
						else if ( (LA29_32==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 517;}
						else if ( (LA29_32==KW_SORT) && (synpred9_FromClauseParser())) {s = 518;}
						else if ( (LA29_32==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 519;}
						else if ( (LA29_32==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 520;}
						else if ( (LA29_32==KW_UNION) && (synpred9_FromClauseParser())) {s = 521;}
						else if ( (LA29_32==RPAREN) && (synpred9_FromClauseParser())) {s = 522;}
						else if ( (LA29_32==KW_ON) && (synpred9_FromClauseParser())) {s = 523;}
						else if ( (LA29_32==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 524;}
						else if ( (LA29_32==Identifier) && (synpred9_FromClauseParser())) {s = 525;}
						 
						input.seek(index29_32);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA29_33 = input.LA(1);
						 
						int index29_33 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_33==KW_BY) && (synpred10_FromClauseParser())) {s = 526;}
						else if ( (LA29_33==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 527;}
						else if ( (LA29_33==KW_JOIN) && (synpred9_FromClauseParser())) {s = 528;}
						else if ( (LA29_33==KW_INNER) && (synpred9_FromClauseParser())) {s = 529;}
						else if ( (LA29_33==COMMA) && (synpred9_FromClauseParser())) {s = 530;}
						else if ( (LA29_33==KW_CROSS) && (synpred9_FromClauseParser())) {s = 531;}
						else if ( (LA29_33==KW_LEFT) && (synpred9_FromClauseParser())) {s = 532;}
						else if ( (LA29_33==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 533;}
						else if ( (LA29_33==KW_FULL) && (synpred9_FromClauseParser())) {s = 534;}
						else if ( (LA29_33==EOF) && (synpred9_FromClauseParser())) {s = 535;}
						else if ( (LA29_33==KW_INSERT) && (synpred9_FromClauseParser())) {s = 536;}
						else if ( (LA29_33==KW_SELECT) && (synpred9_FromClauseParser())) {s = 537;}
						else if ( (LA29_33==KW_MAP) && (synpred9_FromClauseParser())) {s = 538;}
						else if ( (LA29_33==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 539;}
						else if ( (LA29_33==KW_WHERE) && (synpred9_FromClauseParser())) {s = 540;}
						else if ( (LA29_33==KW_GROUP) && (synpred9_FromClauseParser())) {s = 541;}
						else if ( (LA29_33==KW_HAVING) && (synpred9_FromClauseParser())) {s = 542;}
						else if ( (LA29_33==KW_ORDER) && (synpred9_FromClauseParser())) {s = 543;}
						else if ( (LA29_33==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 544;}
						else if ( (LA29_33==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 545;}
						else if ( (LA29_33==KW_SORT) && (synpred9_FromClauseParser())) {s = 546;}
						else if ( (LA29_33==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 547;}
						else if ( (LA29_33==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 548;}
						else if ( (LA29_33==KW_UNION) && (synpred9_FromClauseParser())) {s = 549;}
						else if ( (LA29_33==RPAREN) && (synpred9_FromClauseParser())) {s = 550;}
						else if ( (LA29_33==KW_ON) && (synpred9_FromClauseParser())) {s = 551;}
						else if ( (LA29_33==LPAREN) && (synpred9_FromClauseParser())) {s = 552;}
						else if ( (LA29_33==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 553;}
						else if ( (LA29_33==Identifier) && (synpred9_FromClauseParser())) {s = 554;}
						 
						input.seek(index29_33);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA29_34 = input.LA(1);
						 
						int index29_34 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_34==KW_VIEW) && (synpred10_FromClauseParser())) {s = 555;}
						else if ( (LA29_34==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 556;}
						else if ( (LA29_34==KW_JOIN) && (synpred9_FromClauseParser())) {s = 557;}
						else if ( (LA29_34==KW_INNER) && (synpred9_FromClauseParser())) {s = 558;}
						else if ( (LA29_34==COMMA) && (synpred9_FromClauseParser())) {s = 559;}
						else if ( (LA29_34==KW_CROSS) && (synpred9_FromClauseParser())) {s = 560;}
						else if ( (LA29_34==KW_LEFT) && (synpred9_FromClauseParser())) {s = 561;}
						else if ( (LA29_34==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 562;}
						else if ( (LA29_34==KW_FULL) && (synpred9_FromClauseParser())) {s = 563;}
						else if ( (LA29_34==EOF) && (synpred9_FromClauseParser())) {s = 564;}
						else if ( (LA29_34==KW_INSERT) && (synpred9_FromClauseParser())) {s = 565;}
						else if ( (LA29_34==KW_SELECT) && (synpred9_FromClauseParser())) {s = 566;}
						else if ( (LA29_34==KW_MAP) && (synpred9_FromClauseParser())) {s = 567;}
						else if ( (LA29_34==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 568;}
						else if ( (LA29_34==KW_WHERE) && (synpred9_FromClauseParser())) {s = 569;}
						else if ( (LA29_34==KW_GROUP) && (synpred9_FromClauseParser())) {s = 570;}
						else if ( (LA29_34==KW_HAVING) && (synpred9_FromClauseParser())) {s = 571;}
						else if ( (LA29_34==KW_ORDER) && (synpred9_FromClauseParser())) {s = 572;}
						else if ( (LA29_34==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 573;}
						else if ( (LA29_34==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 574;}
						else if ( (LA29_34==KW_SORT) && (synpred9_FromClauseParser())) {s = 575;}
						else if ( (LA29_34==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 576;}
						else if ( (LA29_34==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 577;}
						else if ( (LA29_34==KW_UNION) && (synpred9_FromClauseParser())) {s = 578;}
						else if ( (LA29_34==RPAREN) && (synpred9_FromClauseParser())) {s = 579;}
						else if ( (LA29_34==KW_ON) && (synpred9_FromClauseParser())) {s = 580;}
						else if ( (LA29_34==LPAREN) && (synpred9_FromClauseParser())) {s = 581;}
						else if ( (LA29_34==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 582;}
						else if ( (LA29_34==Identifier) && (synpred9_FromClauseParser())) {s = 583;}
						 
						input.seek(index29_34);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA29_35 = input.LA(1);
						 
						int index29_35 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_35==KW_JOIN) ) {s = 584;}
						else if ( (LA29_35==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 585;}
						else if ( (LA29_35==KW_INNER) && (synpred9_FromClauseParser())) {s = 586;}
						else if ( (LA29_35==COMMA) && (synpred9_FromClauseParser())) {s = 587;}
						else if ( (LA29_35==KW_CROSS) && (synpred9_FromClauseParser())) {s = 588;}
						else if ( (LA29_35==KW_LEFT) && (synpred9_FromClauseParser())) {s = 589;}
						else if ( (LA29_35==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 590;}
						else if ( (LA29_35==KW_FULL) && (synpred9_FromClauseParser())) {s = 591;}
						else if ( (LA29_35==EOF) && (synpred9_FromClauseParser())) {s = 592;}
						else if ( (LA29_35==KW_INSERT) && (synpred9_FromClauseParser())) {s = 593;}
						else if ( (LA29_35==KW_SELECT) && (synpred9_FromClauseParser())) {s = 594;}
						else if ( (LA29_35==KW_MAP) && (synpred9_FromClauseParser())) {s = 595;}
						else if ( (LA29_35==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 596;}
						else if ( (LA29_35==KW_WHERE) && (synpred9_FromClauseParser())) {s = 597;}
						else if ( (LA29_35==KW_GROUP) && (synpred9_FromClauseParser())) {s = 598;}
						else if ( (LA29_35==KW_HAVING) && (synpred9_FromClauseParser())) {s = 599;}
						else if ( (LA29_35==KW_ORDER) && (synpred9_FromClauseParser())) {s = 600;}
						else if ( (LA29_35==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 601;}
						else if ( (LA29_35==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 602;}
						else if ( (LA29_35==KW_SORT) && (synpred9_FromClauseParser())) {s = 603;}
						else if ( (LA29_35==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 604;}
						else if ( (LA29_35==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 605;}
						else if ( (LA29_35==KW_UNION) && (synpred9_FromClauseParser())) {s = 606;}
						else if ( (LA29_35==RPAREN) && (synpred9_FromClauseParser())) {s = 607;}
						else if ( (LA29_35==KW_ON) && (synpred9_FromClauseParser())) {s = 608;}
						else if ( (LA29_35==LPAREN) && (synpred9_FromClauseParser())) {s = 609;}
						else if ( (LA29_35==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 610;}
						else if ( (LA29_35==Identifier) && (synpred9_FromClauseParser())) {s = 611;}
						 
						input.seek(index29_35);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA29_37 = input.LA(1);
						 
						int index29_37 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_37==KW_SEMI) && (synpred10_FromClauseParser())) {s = 612;}
						else if ( (LA29_37==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 613;}
						else if ( (LA29_37==KW_JOIN) ) {s = 614;}
						else if ( (LA29_37==KW_INNER) && (synpred9_FromClauseParser())) {s = 615;}
						else if ( (LA29_37==COMMA) && (synpred9_FromClauseParser())) {s = 616;}
						else if ( (LA29_37==KW_CROSS) && (synpred9_FromClauseParser())) {s = 617;}
						else if ( (LA29_37==KW_LEFT) && (synpred9_FromClauseParser())) {s = 618;}
						else if ( (LA29_37==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 619;}
						else if ( (LA29_37==KW_FULL) && (synpred9_FromClauseParser())) {s = 620;}
						else if ( (LA29_37==EOF) && (synpred9_FromClauseParser())) {s = 621;}
						else if ( (LA29_37==KW_INSERT) && (synpred9_FromClauseParser())) {s = 622;}
						else if ( (LA29_37==KW_SELECT) && (synpred9_FromClauseParser())) {s = 623;}
						else if ( (LA29_37==KW_MAP) && (synpred9_FromClauseParser())) {s = 624;}
						else if ( (LA29_37==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 625;}
						else if ( (LA29_37==KW_WHERE) && (synpred9_FromClauseParser())) {s = 626;}
						else if ( (LA29_37==KW_GROUP) && (synpred9_FromClauseParser())) {s = 627;}
						else if ( (LA29_37==KW_HAVING) && (synpred9_FromClauseParser())) {s = 628;}
						else if ( (LA29_37==KW_ORDER) && (synpred9_FromClauseParser())) {s = 629;}
						else if ( (LA29_37==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 630;}
						else if ( (LA29_37==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 631;}
						else if ( (LA29_37==KW_SORT) && (synpred9_FromClauseParser())) {s = 632;}
						else if ( (LA29_37==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 633;}
						else if ( (LA29_37==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 634;}
						else if ( (LA29_37==KW_UNION) && (synpred9_FromClauseParser())) {s = 635;}
						else if ( (LA29_37==RPAREN) && (synpred9_FromClauseParser())) {s = 636;}
						else if ( (LA29_37==KW_ON) && (synpred9_FromClauseParser())) {s = 637;}
						else if ( (LA29_37==LPAREN) && (synpred9_FromClauseParser())) {s = 638;}
						else if ( (LA29_37==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 639;}
						else if ( (LA29_37==Identifier) && (synpred9_FromClauseParser())) {s = 640;}
						else if ( (LA29_37==KW_OUTER) && (synpred10_FromClauseParser())) {s = 641;}
						 
						input.seek(index29_37);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA29_40 = input.LA(1);
						 
						int index29_40 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_40==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 642;}
						else if ( (LA29_40==KW_JOIN) ) {s = 643;}
						else if ( (LA29_40==KW_INNER) && (synpred9_FromClauseParser())) {s = 644;}
						else if ( (LA29_40==COMMA) && (synpred9_FromClauseParser())) {s = 645;}
						else if ( (LA29_40==KW_CROSS) && (synpred9_FromClauseParser())) {s = 646;}
						else if ( (LA29_40==KW_LEFT) && (synpred9_FromClauseParser())) {s = 647;}
						else if ( (LA29_40==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 648;}
						else if ( (LA29_40==KW_FULL) && (synpred9_FromClauseParser())) {s = 649;}
						else if ( (LA29_40==EOF) && (synpred9_FromClauseParser())) {s = 650;}
						else if ( (LA29_40==KW_INSERT) && (synpred9_FromClauseParser())) {s = 651;}
						else if ( (LA29_40==KW_SELECT) && (synpred9_FromClauseParser())) {s = 652;}
						else if ( (LA29_40==KW_MAP) && (synpred9_FromClauseParser())) {s = 653;}
						else if ( (LA29_40==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 654;}
						else if ( (LA29_40==KW_WHERE) && (synpred9_FromClauseParser())) {s = 655;}
						else if ( (LA29_40==KW_GROUP) && (synpred9_FromClauseParser())) {s = 656;}
						else if ( (LA29_40==KW_HAVING) && (synpred9_FromClauseParser())) {s = 657;}
						else if ( (LA29_40==KW_ORDER) && (synpred9_FromClauseParser())) {s = 658;}
						else if ( (LA29_40==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 659;}
						else if ( (LA29_40==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 660;}
						else if ( (LA29_40==KW_SORT) && (synpred9_FromClauseParser())) {s = 661;}
						else if ( (LA29_40==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 662;}
						else if ( (LA29_40==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 663;}
						else if ( (LA29_40==KW_UNION) && (synpred9_FromClauseParser())) {s = 664;}
						else if ( (LA29_40==RPAREN) && (synpred9_FromClauseParser())) {s = 665;}
						else if ( (LA29_40==KW_ON) && (synpred9_FromClauseParser())) {s = 666;}
						else if ( (LA29_40==LPAREN) && (synpred9_FromClauseParser())) {s = 667;}
						else if ( (LA29_40==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 668;}
						else if ( (LA29_40==Identifier) && (synpred9_FromClauseParser())) {s = 669;}
						else if ( (LA29_40==KW_OUTER) && (synpred10_FromClauseParser())) {s = 670;}
						 
						input.seek(index29_40);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA29_41 = input.LA(1);
						 
						int index29_41 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_41==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 671;}
						else if ( (LA29_41==KW_JOIN) ) {s = 672;}
						else if ( (LA29_41==KW_INNER) && (synpred9_FromClauseParser())) {s = 673;}
						else if ( (LA29_41==COMMA) && (synpred9_FromClauseParser())) {s = 674;}
						else if ( (LA29_41==KW_CROSS) && (synpred9_FromClauseParser())) {s = 675;}
						else if ( (LA29_41==KW_LEFT) && (synpred9_FromClauseParser())) {s = 676;}
						else if ( (LA29_41==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 677;}
						else if ( (LA29_41==KW_FULL) && (synpred9_FromClauseParser())) {s = 678;}
						else if ( (LA29_41==EOF) && (synpred9_FromClauseParser())) {s = 679;}
						else if ( (LA29_41==KW_INSERT) && (synpred9_FromClauseParser())) {s = 680;}
						else if ( (LA29_41==KW_SELECT) && (synpred9_FromClauseParser())) {s = 681;}
						else if ( (LA29_41==KW_MAP) && (synpred9_FromClauseParser())) {s = 682;}
						else if ( (LA29_41==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 683;}
						else if ( (LA29_41==KW_WHERE) && (synpred9_FromClauseParser())) {s = 684;}
						else if ( (LA29_41==KW_GROUP) && (synpred9_FromClauseParser())) {s = 685;}
						else if ( (LA29_41==KW_HAVING) && (synpred9_FromClauseParser())) {s = 686;}
						else if ( (LA29_41==KW_ORDER) && (synpred9_FromClauseParser())) {s = 687;}
						else if ( (LA29_41==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 688;}
						else if ( (LA29_41==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 689;}
						else if ( (LA29_41==KW_SORT) && (synpred9_FromClauseParser())) {s = 690;}
						else if ( (LA29_41==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 691;}
						else if ( (LA29_41==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 692;}
						else if ( (LA29_41==KW_UNION) && (synpred9_FromClauseParser())) {s = 693;}
						else if ( (LA29_41==RPAREN) && (synpred9_FromClauseParser())) {s = 694;}
						else if ( (LA29_41==KW_ON) && (synpred9_FromClauseParser())) {s = 695;}
						else if ( (LA29_41==LPAREN) && (synpred9_FromClauseParser())) {s = 696;}
						else if ( (LA29_41==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 697;}
						else if ( (LA29_41==Identifier) && (synpred9_FromClauseParser())) {s = 698;}
						else if ( (LA29_41==KW_OUTER) && (synpred10_FromClauseParser())) {s = 699;}
						 
						input.seek(index29_41);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA29_42 = input.LA(1);
						 
						int index29_42 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_42==KW_OVERWRITE) && (synpred10_FromClauseParser())) {s = 700;}
						else if ( (LA29_42==KW_INTO) && (synpred10_FromClauseParser())) {s = 701;}
						else if ( (LA29_42==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 702;}
						else if ( (LA29_42==KW_JOIN) && (synpred9_FromClauseParser())) {s = 703;}
						else if ( (LA29_42==KW_INNER) && (synpred9_FromClauseParser())) {s = 704;}
						else if ( (LA29_42==COMMA) && (synpred9_FromClauseParser())) {s = 705;}
						else if ( (LA29_42==KW_CROSS) && (synpred9_FromClauseParser())) {s = 706;}
						else if ( (LA29_42==KW_LEFT) && (synpred9_FromClauseParser())) {s = 707;}
						else if ( (LA29_42==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 708;}
						else if ( (LA29_42==KW_FULL) && (synpred9_FromClauseParser())) {s = 709;}
						else if ( (LA29_42==EOF) && (synpred9_FromClauseParser())) {s = 710;}
						else if ( (LA29_42==KW_INSERT) && (synpred9_FromClauseParser())) {s = 711;}
						else if ( (LA29_42==KW_SELECT) && (synpred9_FromClauseParser())) {s = 712;}
						else if ( (LA29_42==KW_MAP) && (synpred9_FromClauseParser())) {s = 713;}
						else if ( (LA29_42==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 714;}
						else if ( (LA29_42==KW_WHERE) && (synpred9_FromClauseParser())) {s = 715;}
						else if ( (LA29_42==KW_GROUP) && (synpred9_FromClauseParser())) {s = 716;}
						else if ( (LA29_42==KW_HAVING) && (synpred9_FromClauseParser())) {s = 717;}
						else if ( (LA29_42==KW_ORDER) && (synpred9_FromClauseParser())) {s = 718;}
						else if ( (LA29_42==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 719;}
						else if ( (LA29_42==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 720;}
						else if ( (LA29_42==KW_SORT) && (synpred9_FromClauseParser())) {s = 721;}
						else if ( (LA29_42==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 722;}
						else if ( (LA29_42==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 723;}
						else if ( (LA29_42==KW_UNION) && (synpred9_FromClauseParser())) {s = 724;}
						else if ( (LA29_42==RPAREN) && (synpred9_FromClauseParser())) {s = 725;}
						else if ( (LA29_42==KW_ON) && (synpred9_FromClauseParser())) {s = 726;}
						else if ( (LA29_42==LPAREN) && (synpred9_FromClauseParser())) {s = 727;}
						else if ( (LA29_42==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 728;}
						else if ( (LA29_42==Identifier) && (synpred9_FromClauseParser())) {s = 729;}
						 
						input.seek(index29_42);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA29_44 = input.LA(1);
						 
						int index29_44 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_44==KW_BY) && (synpred10_FromClauseParser())) {s = 730;}
						else if ( (LA29_44==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 731;}
						else if ( (LA29_44==KW_JOIN) && (synpred9_FromClauseParser())) {s = 732;}
						else if ( (LA29_44==KW_INNER) && (synpred9_FromClauseParser())) {s = 733;}
						else if ( (LA29_44==COMMA) && (synpred9_FromClauseParser())) {s = 734;}
						else if ( (LA29_44==KW_CROSS) && (synpred9_FromClauseParser())) {s = 735;}
						else if ( (LA29_44==KW_LEFT) && (synpred9_FromClauseParser())) {s = 736;}
						else if ( (LA29_44==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 737;}
						else if ( (LA29_44==KW_FULL) && (synpred9_FromClauseParser())) {s = 738;}
						else if ( (LA29_44==EOF) && (synpred9_FromClauseParser())) {s = 739;}
						else if ( (LA29_44==KW_INSERT) && (synpred9_FromClauseParser())) {s = 740;}
						else if ( (LA29_44==KW_SELECT) && (synpred9_FromClauseParser())) {s = 741;}
						else if ( (LA29_44==KW_MAP) && (synpred9_FromClauseParser())) {s = 742;}
						else if ( (LA29_44==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 743;}
						else if ( (LA29_44==KW_WHERE) && (synpred9_FromClauseParser())) {s = 744;}
						else if ( (LA29_44==KW_GROUP) && (synpred9_FromClauseParser())) {s = 745;}
						else if ( (LA29_44==KW_HAVING) && (synpred9_FromClauseParser())) {s = 746;}
						else if ( (LA29_44==KW_ORDER) && (synpred9_FromClauseParser())) {s = 747;}
						else if ( (LA29_44==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 748;}
						else if ( (LA29_44==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 749;}
						else if ( (LA29_44==KW_SORT) && (synpred9_FromClauseParser())) {s = 750;}
						else if ( (LA29_44==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 751;}
						else if ( (LA29_44==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 752;}
						else if ( (LA29_44==KW_UNION) && (synpred9_FromClauseParser())) {s = 753;}
						else if ( (LA29_44==RPAREN) && (synpred9_FromClauseParser())) {s = 754;}
						else if ( (LA29_44==KW_ON) && (synpred9_FromClauseParser())) {s = 755;}
						else if ( (LA29_44==LPAREN) && (synpred9_FromClauseParser())) {s = 756;}
						else if ( (LA29_44==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 757;}
						else if ( (LA29_44==Identifier) && (synpred9_FromClauseParser())) {s = 758;}
						 
						input.seek(index29_44);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA29_49 = input.LA(1);
						 
						int index29_49 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_49==KW_BY) && (synpred10_FromClauseParser())) {s = 759;}
						else if ( (LA29_49==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 760;}
						else if ( (LA29_49==KW_JOIN) && (synpred9_FromClauseParser())) {s = 761;}
						else if ( (LA29_49==KW_INNER) && (synpred9_FromClauseParser())) {s = 762;}
						else if ( (LA29_49==COMMA) && (synpred9_FromClauseParser())) {s = 763;}
						else if ( (LA29_49==KW_CROSS) && (synpred9_FromClauseParser())) {s = 764;}
						else if ( (LA29_49==KW_LEFT) && (synpred9_FromClauseParser())) {s = 765;}
						else if ( (LA29_49==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 766;}
						else if ( (LA29_49==KW_FULL) && (synpred9_FromClauseParser())) {s = 767;}
						else if ( (LA29_49==EOF) && (synpred9_FromClauseParser())) {s = 768;}
						else if ( (LA29_49==KW_INSERT) && (synpred9_FromClauseParser())) {s = 769;}
						else if ( (LA29_49==KW_SELECT) && (synpred9_FromClauseParser())) {s = 770;}
						else if ( (LA29_49==KW_MAP) && (synpred9_FromClauseParser())) {s = 771;}
						else if ( (LA29_49==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 772;}
						else if ( (LA29_49==KW_WHERE) && (synpred9_FromClauseParser())) {s = 773;}
						else if ( (LA29_49==KW_GROUP) && (synpred9_FromClauseParser())) {s = 774;}
						else if ( (LA29_49==KW_HAVING) && (synpred9_FromClauseParser())) {s = 775;}
						else if ( (LA29_49==KW_ORDER) && (synpred9_FromClauseParser())) {s = 776;}
						else if ( (LA29_49==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 777;}
						else if ( (LA29_49==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 778;}
						else if ( (LA29_49==KW_SORT) && (synpred9_FromClauseParser())) {s = 779;}
						else if ( (LA29_49==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 780;}
						else if ( (LA29_49==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 781;}
						else if ( (LA29_49==KW_UNION) && (synpred9_FromClauseParser())) {s = 782;}
						else if ( (LA29_49==RPAREN) && (synpred9_FromClauseParser())) {s = 783;}
						else if ( (LA29_49==KW_ON) && (synpred9_FromClauseParser())) {s = 784;}
						else if ( (LA29_49==LPAREN) && (synpred9_FromClauseParser())) {s = 785;}
						else if ( (LA29_49==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 786;}
						else if ( (LA29_49==Identifier) && (synpred9_FromClauseParser())) {s = 787;}
						 
						input.seek(index29_49);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA29_51 = input.LA(1);
						 
						int index29_51 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_51==KW_ALL) && (synpred10_FromClauseParser())) {s = 788;}
						else if ( (LA29_51==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 789;}
						else if ( (LA29_51==KW_JOIN) && (synpred9_FromClauseParser())) {s = 790;}
						else if ( (LA29_51==KW_INNER) && (synpred9_FromClauseParser())) {s = 791;}
						else if ( (LA29_51==COMMA) && (synpred9_FromClauseParser())) {s = 792;}
						else if ( (LA29_51==KW_CROSS) && (synpred9_FromClauseParser())) {s = 793;}
						else if ( (LA29_51==KW_LEFT) && (synpred9_FromClauseParser())) {s = 794;}
						else if ( (LA29_51==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 795;}
						else if ( (LA29_51==KW_FULL) && (synpred9_FromClauseParser())) {s = 796;}
						else if ( (LA29_51==EOF) && (synpred9_FromClauseParser())) {s = 797;}
						else if ( (LA29_51==KW_INSERT) && (synpred9_FromClauseParser())) {s = 798;}
						else if ( (LA29_51==KW_SELECT) ) {s = 799;}
						else if ( (LA29_51==KW_MAP) ) {s = 800;}
						else if ( (LA29_51==KW_REDUCE) ) {s = 801;}
						else if ( (LA29_51==KW_WHERE) && (synpred9_FromClauseParser())) {s = 802;}
						else if ( (LA29_51==KW_GROUP) && (synpred9_FromClauseParser())) {s = 803;}
						else if ( (LA29_51==KW_HAVING) && (synpred9_FromClauseParser())) {s = 804;}
						else if ( (LA29_51==KW_ORDER) && (synpred9_FromClauseParser())) {s = 805;}
						else if ( (LA29_51==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 806;}
						else if ( (LA29_51==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 807;}
						else if ( (LA29_51==KW_SORT) && (synpred9_FromClauseParser())) {s = 808;}
						else if ( (LA29_51==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 809;}
						else if ( (LA29_51==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 810;}
						else if ( (LA29_51==KW_UNION) && (synpred9_FromClauseParser())) {s = 811;}
						else if ( (LA29_51==RPAREN) && (synpred9_FromClauseParser())) {s = 812;}
						else if ( (LA29_51==KW_ON) && (synpred9_FromClauseParser())) {s = 813;}
						else if ( (LA29_51==LPAREN) && (synpred9_FromClauseParser())) {s = 814;}
						else if ( (LA29_51==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 815;}
						else if ( (LA29_51==Identifier) && (synpred9_FromClauseParser())) {s = 816;}
						else if ( (LA29_51==KW_DISTINCT) && (synpred10_FromClauseParser())) {s = 817;}
						 
						input.seek(index29_51);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA29_52 = input.LA(1);
						 
						int index29_52 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_52==KW_BY) && (synpred10_FromClauseParser())) {s = 818;}
						else if ( (LA29_52==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 819;}
						else if ( (LA29_52==KW_JOIN) && (synpred9_FromClauseParser())) {s = 820;}
						else if ( (LA29_52==KW_INNER) && (synpred9_FromClauseParser())) {s = 821;}
						else if ( (LA29_52==COMMA) && (synpred9_FromClauseParser())) {s = 822;}
						else if ( (LA29_52==KW_CROSS) && (synpred9_FromClauseParser())) {s = 823;}
						else if ( (LA29_52==KW_LEFT) && (synpred9_FromClauseParser())) {s = 824;}
						else if ( (LA29_52==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 825;}
						else if ( (LA29_52==KW_FULL) && (synpred9_FromClauseParser())) {s = 826;}
						else if ( (LA29_52==EOF) && (synpred9_FromClauseParser())) {s = 827;}
						else if ( (LA29_52==KW_INSERT) && (synpred9_FromClauseParser())) {s = 828;}
						else if ( (LA29_52==KW_SELECT) && (synpred9_FromClauseParser())) {s = 829;}
						else if ( (LA29_52==KW_MAP) && (synpred9_FromClauseParser())) {s = 830;}
						else if ( (LA29_52==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 831;}
						else if ( (LA29_52==KW_WHERE) && (synpred9_FromClauseParser())) {s = 832;}
						else if ( (LA29_52==KW_GROUP) && (synpred9_FromClauseParser())) {s = 833;}
						else if ( (LA29_52==KW_HAVING) && (synpred9_FromClauseParser())) {s = 834;}
						else if ( (LA29_52==KW_ORDER) && (synpred9_FromClauseParser())) {s = 835;}
						else if ( (LA29_52==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 836;}
						else if ( (LA29_52==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 837;}
						else if ( (LA29_52==KW_SORT) && (synpred9_FromClauseParser())) {s = 838;}
						else if ( (LA29_52==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 839;}
						else if ( (LA29_52==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 840;}
						else if ( (LA29_52==KW_UNION) && (synpred9_FromClauseParser())) {s = 841;}
						else if ( (LA29_52==RPAREN) && (synpred9_FromClauseParser())) {s = 842;}
						else if ( (LA29_52==KW_ON) && (synpred9_FromClauseParser())) {s = 843;}
						else if ( (LA29_52==LPAREN) && (synpred9_FromClauseParser())) {s = 844;}
						else if ( (LA29_52==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 845;}
						else if ( (LA29_52==Identifier) && (synpred9_FromClauseParser())) {s = 846;}
						 
						input.seek(index29_52);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA29_53 = input.LA(1);
						 
						int index29_53 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_53==KW_BY) && (synpred10_FromClauseParser())) {s = 847;}
						else if ( (LA29_53==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 848;}
						else if ( (LA29_53==KW_JOIN) && (synpred9_FromClauseParser())) {s = 849;}
						else if ( (LA29_53==KW_INNER) && (synpred9_FromClauseParser())) {s = 850;}
						else if ( (LA29_53==COMMA) && (synpred9_FromClauseParser())) {s = 851;}
						else if ( (LA29_53==KW_CROSS) && (synpred9_FromClauseParser())) {s = 852;}
						else if ( (LA29_53==KW_LEFT) && (synpred9_FromClauseParser())) {s = 853;}
						else if ( (LA29_53==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 854;}
						else if ( (LA29_53==KW_FULL) && (synpred9_FromClauseParser())) {s = 855;}
						else if ( (LA29_53==EOF) && (synpred9_FromClauseParser())) {s = 856;}
						else if ( (LA29_53==KW_INSERT) && (synpred9_FromClauseParser())) {s = 857;}
						else if ( (LA29_53==KW_SELECT) && (synpred9_FromClauseParser())) {s = 858;}
						else if ( (LA29_53==KW_MAP) && (synpred9_FromClauseParser())) {s = 859;}
						else if ( (LA29_53==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 860;}
						else if ( (LA29_53==KW_WHERE) && (synpred9_FromClauseParser())) {s = 861;}
						else if ( (LA29_53==KW_GROUP) && (synpred9_FromClauseParser())) {s = 862;}
						else if ( (LA29_53==KW_HAVING) && (synpred9_FromClauseParser())) {s = 863;}
						else if ( (LA29_53==KW_ORDER) && (synpred9_FromClauseParser())) {s = 864;}
						else if ( (LA29_53==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 865;}
						else if ( (LA29_53==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 866;}
						else if ( (LA29_53==KW_SORT) && (synpred9_FromClauseParser())) {s = 867;}
						else if ( (LA29_53==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 868;}
						else if ( (LA29_53==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 869;}
						else if ( (LA29_53==KW_UNION) && (synpred9_FromClauseParser())) {s = 870;}
						else if ( (LA29_53==RPAREN) && (synpred9_FromClauseParser())) {s = 871;}
						else if ( (LA29_53==KW_ON) && (synpred9_FromClauseParser())) {s = 872;}
						else if ( (LA29_53==LPAREN) && (synpred9_FromClauseParser())) {s = 873;}
						else if ( (LA29_53==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 874;}
						else if ( (LA29_53==Identifier) && (synpred9_FromClauseParser())) {s = 875;}
						 
						input.seek(index29_53);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA29_54 = input.LA(1);
						 
						int index29_54 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_54==Number) && (synpred10_FromClauseParser())) {s = 876;}
						else if ( (LA29_54==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 877;}
						else if ( (LA29_54==KW_JOIN) && (synpred9_FromClauseParser())) {s = 878;}
						else if ( (LA29_54==KW_INNER) && (synpred9_FromClauseParser())) {s = 879;}
						else if ( (LA29_54==COMMA) && (synpred9_FromClauseParser())) {s = 880;}
						else if ( (LA29_54==KW_CROSS) && (synpred9_FromClauseParser())) {s = 881;}
						else if ( (LA29_54==KW_LEFT) && (synpred9_FromClauseParser())) {s = 882;}
						else if ( (LA29_54==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 883;}
						else if ( (LA29_54==KW_FULL) && (synpred9_FromClauseParser())) {s = 884;}
						else if ( (LA29_54==EOF) && (synpred9_FromClauseParser())) {s = 885;}
						else if ( (LA29_54==KW_INSERT) && (synpred9_FromClauseParser())) {s = 886;}
						else if ( (LA29_54==KW_SELECT) && (synpred9_FromClauseParser())) {s = 887;}
						else if ( (LA29_54==KW_MAP) && (synpred9_FromClauseParser())) {s = 888;}
						else if ( (LA29_54==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 889;}
						else if ( (LA29_54==KW_WHERE) && (synpred9_FromClauseParser())) {s = 890;}
						else if ( (LA29_54==KW_GROUP) && (synpred9_FromClauseParser())) {s = 891;}
						else if ( (LA29_54==KW_HAVING) && (synpred9_FromClauseParser())) {s = 892;}
						else if ( (LA29_54==KW_ORDER) && (synpred9_FromClauseParser())) {s = 893;}
						else if ( (LA29_54==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 894;}
						else if ( (LA29_54==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 895;}
						else if ( (LA29_54==KW_SORT) && (synpred9_FromClauseParser())) {s = 896;}
						else if ( (LA29_54==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 897;}
						else if ( (LA29_54==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 898;}
						else if ( (LA29_54==KW_UNION) && (synpred9_FromClauseParser())) {s = 899;}
						else if ( (LA29_54==RPAREN) && (synpred9_FromClauseParser())) {s = 900;}
						else if ( (LA29_54==KW_ON) && (synpred9_FromClauseParser())) {s = 901;}
						else if ( (LA29_54==LPAREN) && (synpred9_FromClauseParser())) {s = 902;}
						else if ( (LA29_54==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 903;}
						else if ( (LA29_54==Identifier) && (synpred9_FromClauseParser())) {s = 904;}
						 
						input.seek(index29_54);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA29_57 = input.LA(1);
						 
						int index29_57 = input.index();
						input.rewind();
						s = -1;
						if ( (LA29_57==KW_BY) && (synpred10_FromClauseParser())) {s = 905;}
						else if ( (LA29_57==KW_LATERAL) && (synpred9_FromClauseParser())) {s = 906;}
						else if ( (LA29_57==KW_JOIN) && (synpred9_FromClauseParser())) {s = 907;}
						else if ( (LA29_57==KW_INNER) && (synpred9_FromClauseParser())) {s = 908;}
						else if ( (LA29_57==COMMA) && (synpred9_FromClauseParser())) {s = 909;}
						else if ( (LA29_57==KW_CROSS) && (synpred9_FromClauseParser())) {s = 910;}
						else if ( (LA29_57==KW_LEFT) && (synpred9_FromClauseParser())) {s = 911;}
						else if ( (LA29_57==KW_RIGHT) && (synpred9_FromClauseParser())) {s = 912;}
						else if ( (LA29_57==KW_FULL) && (synpred9_FromClauseParser())) {s = 913;}
						else if ( (LA29_57==EOF) && (synpred9_FromClauseParser())) {s = 914;}
						else if ( (LA29_57==KW_INSERT) && (synpred9_FromClauseParser())) {s = 915;}
						else if ( (LA29_57==KW_SELECT) && (synpred9_FromClauseParser())) {s = 916;}
						else if ( (LA29_57==KW_MAP) && (synpred9_FromClauseParser())) {s = 917;}
						else if ( (LA29_57==KW_REDUCE) && (synpred9_FromClauseParser())) {s = 918;}
						else if ( (LA29_57==KW_WHERE) && (synpred9_FromClauseParser())) {s = 919;}
						else if ( (LA29_57==KW_GROUP) && (synpred9_FromClauseParser())) {s = 920;}
						else if ( (LA29_57==KW_HAVING) && (synpred9_FromClauseParser())) {s = 921;}
						else if ( (LA29_57==KW_ORDER) && (synpred9_FromClauseParser())) {s = 922;}
						else if ( (LA29_57==KW_CLUSTER) && (synpred9_FromClauseParser())) {s = 923;}
						else if ( (LA29_57==KW_DISTRIBUTE) && (synpred9_FromClauseParser())) {s = 924;}
						else if ( (LA29_57==KW_SORT) && (synpred9_FromClauseParser())) {s = 925;}
						else if ( (LA29_57==KW_WINDOW) && (synpred9_FromClauseParser())) {s = 926;}
						else if ( (LA29_57==KW_LIMIT) && (synpred9_FromClauseParser())) {s = 927;}
						else if ( (LA29_57==KW_UNION) && (synpred9_FromClauseParser())) {s = 928;}
						else if ( (LA29_57==RPAREN) && (synpred9_FromClauseParser())) {s = 929;}
						else if ( (LA29_57==KW_ON) && (synpred9_FromClauseParser())) {s = 930;}
						else if ( (LA29_57==LPAREN) && (synpred9_FromClauseParser())) {s = 931;}
						else if ( (LA29_57==KW_PARTITION) && (synpred9_FromClauseParser())) {s = 932;}
						else if ( (LA29_57==Identifier) && (synpred9_FromClauseParser())) {s = 933;}
						 
						input.seek(index29_57);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA29_148 = input.LA(1);
						 
						int index29_148 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_148);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA29_178 = input.LA(1);
						 
						int index29_178 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_178);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA29_207 = input.LA(1);
						 
						int index29_207 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_207);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA29_236 = input.LA(1);
						 
						int index29_236 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_236);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA29_498 = input.LA(1);
						 
						int index29_498 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_498);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA29_584 = input.LA(1);
						 
						int index29_584 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_584);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA29_614 = input.LA(1);
						 
						int index29_614 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_614);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA29_643 = input.LA(1);
						 
						int index29_643 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_643);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA29_672 = input.LA(1);
						 
						int index29_672 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_672);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA29_799 = input.LA(1);
						 
						int index29_799 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_799);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA29_800 = input.LA(1);
						 
						int index29_800 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_800);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA29_801 = input.LA(1);
						 
						int index29_801 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_FromClauseParser()) ) {s = 933;}
						else if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						 
						input.seek(index29_801);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA29_934 = input.LA(1);
						 
						int index29_934 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_934);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA29_935 = input.LA(1);
						 
						int index29_935 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_935);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA29_936 = input.LA(1);
						 
						int index29_936 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_936);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA29_937 = input.LA(1);
						 
						int index29_937 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_937);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA29_938 = input.LA(1);
						 
						int index29_938 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_938);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA29_939 = input.LA(1);
						 
						int index29_939 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_939);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA29_940 = input.LA(1);
						 
						int index29_940 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_940);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA29_941 = input.LA(1);
						 
						int index29_941 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_941);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA29_942 = input.LA(1);
						 
						int index29_942 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_942);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA29_943 = input.LA(1);
						 
						int index29_943 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_943);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA29_944 = input.LA(1);
						 
						int index29_944 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_944);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA29_945 = input.LA(1);
						 
						int index29_945 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_945);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA29_946 = input.LA(1);
						 
						int index29_946 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_946);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA29_947 = input.LA(1);
						 
						int index29_947 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_947);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA29_948 = input.LA(1);
						 
						int index29_948 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_948);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA29_949 = input.LA(1);
						 
						int index29_949 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_949);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA29_950 = input.LA(1);
						 
						int index29_950 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_950);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA29_951 = input.LA(1);
						 
						int index29_951 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_951);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA29_952 = input.LA(1);
						 
						int index29_952 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_952);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA29_953 = input.LA(1);
						 
						int index29_953 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_953);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA29_954 = input.LA(1);
						 
						int index29_954 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_954);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA29_955 = input.LA(1);
						 
						int index29_955 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_955);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA29_956 = input.LA(1);
						 
						int index29_956 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_956);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA29_957 = input.LA(1);
						 
						int index29_957 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_957);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA29_958 = input.LA(1);
						 
						int index29_958 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_958);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA29_959 = input.LA(1);
						 
						int index29_959 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_959);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA29_960 = input.LA(1);
						 
						int index29_960 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_960);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA29_961 = input.LA(1);
						 
						int index29_961 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_FromClauseParser()) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_961);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA29_978 = input.LA(1);
						 
						int index29_978 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_978);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA29_979 = input.LA(1);
						 
						int index29_979 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_979);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA29_980 = input.LA(1);
						 
						int index29_980 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_980);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA29_981 = input.LA(1);
						 
						int index29_981 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_981);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA29_982 = input.LA(1);
						 
						int index29_982 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_982);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA29_983 = input.LA(1);
						 
						int index29_983 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_983);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA29_984 = input.LA(1);
						 
						int index29_984 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_984);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA29_985 = input.LA(1);
						 
						int index29_985 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_985);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA29_986 = input.LA(1);
						 
						int index29_986 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_986);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA29_987 = input.LA(1);
						 
						int index29_987 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_987);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA29_988 = input.LA(1);
						 
						int index29_988 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_988);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA29_989 = input.LA(1);
						 
						int index29_989 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_989);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA29_990 = input.LA(1);
						 
						int index29_990 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_990);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA29_991 = input.LA(1);
						 
						int index29_991 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_991);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA29_992 = input.LA(1);
						 
						int index29_992 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_992);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA29_993 = input.LA(1);
						 
						int index29_993 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_993);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA29_994 = input.LA(1);
						 
						int index29_994 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_994);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA29_995 = input.LA(1);
						 
						int index29_995 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_995);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA29_996 = input.LA(1);
						 
						int index29_996 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_996);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA29_997 = input.LA(1);
						 
						int index29_997 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_997);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA29_998 = input.LA(1);
						 
						int index29_998 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_998);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA29_999 = input.LA(1);
						 
						int index29_999 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_999);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA29_1000 = input.LA(1);
						 
						int index29_1000 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1000);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA29_1001 = input.LA(1);
						 
						int index29_1001 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1001);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA29_1002 = input.LA(1);
						 
						int index29_1002 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1002);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA29_1003 = input.LA(1);
						 
						int index29_1003 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1003);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA29_1004 = input.LA(1);
						 
						int index29_1004 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1004);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA29_1005 = input.LA(1);
						 
						int index29_1005 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1005);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA29_1006 = input.LA(1);
						 
						int index29_1006 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1006);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA29_1007 = input.LA(1);
						 
						int index29_1007 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1007);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA29_1008 = input.LA(1);
						 
						int index29_1008 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1008);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA29_1009 = input.LA(1);
						 
						int index29_1009 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1009);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA29_1010 = input.LA(1);
						 
						int index29_1010 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1010);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA29_1011 = input.LA(1);
						 
						int index29_1011 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1011);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA29_1012 = input.LA(1);
						 
						int index29_1012 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1012);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA29_1013 = input.LA(1);
						 
						int index29_1013 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1013);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA29_1014 = input.LA(1);
						 
						int index29_1014 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1014);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA29_1015 = input.LA(1);
						 
						int index29_1015 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1015);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA29_1016 = input.LA(1);
						 
						int index29_1016 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1016);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA29_1017 = input.LA(1);
						 
						int index29_1017 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1017);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA29_1018 = input.LA(1);
						 
						int index29_1018 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1018);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA29_1019 = input.LA(1);
						 
						int index29_1019 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1019);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA29_1020 = input.LA(1);
						 
						int index29_1020 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1020);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA29_1021 = input.LA(1);
						 
						int index29_1021 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1021);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA29_1022 = input.LA(1);
						 
						int index29_1022 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1022);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA29_1023 = input.LA(1);
						 
						int index29_1023 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1023);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA29_1024 = input.LA(1);
						 
						int index29_1024 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1024);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA29_1025 = input.LA(1);
						 
						int index29_1025 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1025);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA29_1026 = input.LA(1);
						 
						int index29_1026 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1026);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA29_1027 = input.LA(1);
						 
						int index29_1027 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1027);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA29_1028 = input.LA(1);
						 
						int index29_1028 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1028);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA29_1029 = input.LA(1);
						 
						int index29_1029 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1029);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA29_1030 = input.LA(1);
						 
						int index29_1030 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1030);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA29_1031 = input.LA(1);
						 
						int index29_1031 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1031);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA29_1032 = input.LA(1);
						 
						int index29_1032 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1032);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA29_1033 = input.LA(1);
						 
						int index29_1033 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1033);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA29_1034 = input.LA(1);
						 
						int index29_1034 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1034);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA29_1035 = input.LA(1);
						 
						int index29_1035 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1035);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA29_1036 = input.LA(1);
						 
						int index29_1036 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1036);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA29_1037 = input.LA(1);
						 
						int index29_1037 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1037);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA29_1038 = input.LA(1);
						 
						int index29_1038 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1038);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA29_1039 = input.LA(1);
						 
						int index29_1039 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1039);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA29_1040 = input.LA(1);
						 
						int index29_1040 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1040);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA29_1041 = input.LA(1);
						 
						int index29_1041 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1041);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA29_1042 = input.LA(1);
						 
						int index29_1042 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1042);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA29_1043 = input.LA(1);
						 
						int index29_1043 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1043);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA29_1044 = input.LA(1);
						 
						int index29_1044 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1044);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA29_1045 = input.LA(1);
						 
						int index29_1045 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1045);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA29_1046 = input.LA(1);
						 
						int index29_1046 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1046);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA29_1047 = input.LA(1);
						 
						int index29_1047 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1047);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA29_1048 = input.LA(1);
						 
						int index29_1048 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1048);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA29_1049 = input.LA(1);
						 
						int index29_1049 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1049);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA29_1050 = input.LA(1);
						 
						int index29_1050 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1050);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA29_1051 = input.LA(1);
						 
						int index29_1051 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1051);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA29_1052 = input.LA(1);
						 
						int index29_1052 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1052);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA29_1053 = input.LA(1);
						 
						int index29_1053 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1053);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA29_1054 = input.LA(1);
						 
						int index29_1054 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1054);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA29_1055 = input.LA(1);
						 
						int index29_1055 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1055);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA29_1056 = input.LA(1);
						 
						int index29_1056 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1056);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA29_1057 = input.LA(1);
						 
						int index29_1057 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1057);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA29_1058 = input.LA(1);
						 
						int index29_1058 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1058);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA29_1059 = input.LA(1);
						 
						int index29_1059 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1059);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA29_1060 = input.LA(1);
						 
						int index29_1060 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1060);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA29_1061 = input.LA(1);
						 
						int index29_1061 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1061);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA29_1062 = input.LA(1);
						 
						int index29_1062 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1062);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA29_1063 = input.LA(1);
						 
						int index29_1063 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1063);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA29_1064 = input.LA(1);
						 
						int index29_1064 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1064);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA29_1065 = input.LA(1);
						 
						int index29_1065 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1065);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA29_1066 = input.LA(1);
						 
						int index29_1066 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1066);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA29_1067 = input.LA(1);
						 
						int index29_1067 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1067);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA29_1068 = input.LA(1);
						 
						int index29_1068 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred10_FromClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 905;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index29_1068);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA30_eotS =
		"\u00e5\uffff";
	static final String DFA30_eofS =
		"\1\uffff\3\5\u00e1\uffff";
	static final String DFA30_minS =
		"\1\32\3\12\1\32\106\uffff\1\32\106\uffff\1\32\122\uffff";
	static final String DFA30_maxS =
		"\5\u0216\106\uffff\1\u0216\106\uffff\1\u0216\122\uffff";
	static final String DFA30_acceptS =
		"\5\uffff\1\2\u00d4\uffff\1\1\12\uffff";
	static final String DFA30_specialS =
		"\u00e5\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\1\4\2\2\3\1\2\1\uffff\1\2\2\3\1\2\1\3\2\2\5\3\2\2\1\3\1\uffff\1\2"+
			"\2\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\3\1\2\1\3"+
			"\1\uffff\1\3\1\uffff\3\3\1\2\1\uffff\1\2\1\3\3\2\1\3\2\2\1\3\3\2\1\3"+
			"\3\2\1\uffff\1\2\2\3\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\3\2\2"+
			"\1\uffff\3\3\4\2\1\3\1\uffff\2\3\2\2\1\uffff\1\3\1\uffff\1\2\3\3\1\uffff"+
			"\2\2\1\uffff\2\3\2\2\1\3\3\2\3\3\1\uffff\2\3\3\2\1\uffff\4\2\2\3\1\uffff"+
			"\1\2\1\3\3\2\1\3\5\2\2\uffff\6\2\1\uffff\1\2\1\3\2\2\1\uffff\1\2\1\3"+
			"\1\2\1\3\1\2\2\uffff\1\2\1\uffff\3\3\2\2\1\uffff\2\2\1\uffff\1\3\2\2"+
			"\1\3\1\2\2\uffff\1\2\1\3\1\2\1\3\1\2\1\3\1\2\1\3\3\2\1\uffff\2\3\7\2"+
			"\1\3\1\2\2\3\2\2\1\uffff\3\3\3\2\1\uffff\4\2\1\3\5\2\1\3\4\2\1\uffff"+
			"\5\2\1\3\1\2\1\uffff\3\2\1\uffff\1\3\1\2\1\3\3\2\1\uffff\3\3\1\2\1\uffff"+
			"\1\2\1\3\1\2\1\uffff\3\2\1\3\2\2\2\3\3\2\1\3\1\2\1\uffff\1\2\2\uffff"+
			"\1\2\1\uffff\1\3\3\2\u0089\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff"+
			"\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\5\6\uffff\1\4\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1\uffff\4\5"+
			"\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\1\uffff\20\5\1\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\6\5\1\uffff\10\5\1\uffff\6\5\1\uffff\23\5\1"+
			"\uffff\14\5\1\uffff\13\5\1\uffff\7\5\1\uffff\13\5\1\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff\13\5\1"+
			"\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\1\5\1\uffff\7"+
			"\5\3\uffff\1\5\12\uffff\1\5\172\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3"+
			"\uffff\1\5\27\uffff\1\5\3\uffff\1\5",
			"\1\5\6\uffff\1\113\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1\uffff\4"+
			"\5\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\1\uffff\20\5\1\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\6\5\1\uffff\10\5\1\uffff\6\5\1\uffff\23\5\1"+
			"\uffff\14\5\1\uffff\13\5\1\uffff\7\5\1\uffff\13\5\1\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff\13\5\1"+
			"\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\1\5\1\uffff\7"+
			"\5\3\uffff\1\5\12\uffff\1\5\172\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3"+
			"\uffff\1\5\27\uffff\1\5\3\uffff\1\5",
			"\1\5\6\uffff\1\u0092\10\uffff\10\5\1\uffff\21\5\2\uffff\1\5\1\uffff"+
			"\4\5\1\uffff\2\5\1\uffff\4\5\1\uffff\5\5\1\uffff\4\5\1\uffff\20\5\1\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\6\5\1\uffff\10\5\1\uffff\6\5\1\uffff\23\5\1"+
			"\uffff\14\5\1\uffff\13\5\1\uffff\7\5\1\uffff\13\5\1\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff\13\5\1"+
			"\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff\1\5\1\uffff\7"+
			"\5\3\uffff\1\5\12\uffff\1\5\172\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3"+
			"\uffff\1\5\27\uffff\1\5\3\uffff\1\5",
			"\10\u00da\1\uffff\17\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4"+
			"\u00da\1\uffff\2\u00da\1\uffff\4\u00da\1\uffff\3\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\20\u00da\1\uffff\4\u00da\1\uffff\1\u00da\1\uffff"+
			"\1\u00da\1\uffff\4\u00da\1\uffff\10\u00da\1\uffff\4\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\2\u00da\1\uffff\13\u00da\1\uffff\5\u00da\1\uffff"+
			"\6\u00da\1\uffff\13\u00da\2\uffff\6\u00da\1\uffff\4\u00da\1\uffff\5\u00da"+
			"\2\uffff\1\u00da\1\uffff\5\u00da\1\uffff\2\u00da\1\uffff\5\u00da\2\uffff"+
			"\13\u00da\1\uffff\17\u00da\1\uffff\6\u00da\1\uffff\17\u00da\1\uffff\7"+
			"\u00da\1\uffff\3\u00da\1\uffff\6\u00da\1\uffff\4\u00da\1\uffff\3\u00da"+
			"\1\uffff\15\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4\u00da\22"+
			"\uffff\1\5\166\uffff\1\u00da\3\uffff\1\u00da\60\uffff\1\u00da\3\uffff"+
			"\1\u00da\27\uffff\1\u00da\3\uffff\1\u00da",
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
			"",
			"",
			"",
			"",
			"\10\u00da\1\uffff\17\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4"+
			"\u00da\1\uffff\2\u00da\1\uffff\4\u00da\1\uffff\3\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\20\u00da\1\uffff\4\u00da\1\uffff\1\u00da\1\uffff"+
			"\1\u00da\1\uffff\4\u00da\1\uffff\10\u00da\1\uffff\4\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\2\u00da\1\uffff\13\u00da\1\uffff\5\u00da\1\uffff"+
			"\6\u00da\1\uffff\13\u00da\2\uffff\6\u00da\1\uffff\4\u00da\1\uffff\5\u00da"+
			"\2\uffff\1\u00da\1\uffff\5\u00da\1\uffff\2\u00da\1\uffff\5\u00da\2\uffff"+
			"\13\u00da\1\uffff\17\u00da\1\uffff\6\u00da\1\uffff\17\u00da\1\uffff\7"+
			"\u00da\1\uffff\3\u00da\1\uffff\6\u00da\1\uffff\4\u00da\1\uffff\3\u00da"+
			"\1\uffff\15\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4\u00da\22"+
			"\uffff\1\5\166\uffff\1\u00da\3\uffff\1\u00da\60\uffff\1\u00da\3\uffff"+
			"\1\u00da\27\uffff\1\u00da\3\uffff\1\u00da",
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
			"",
			"",
			"",
			"",
			"\10\u00da\1\uffff\17\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4"+
			"\u00da\1\uffff\2\u00da\1\uffff\4\u00da\1\uffff\3\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\20\u00da\1\uffff\4\u00da\1\uffff\1\u00da\1\uffff"+
			"\1\u00da\1\uffff\4\u00da\1\uffff\10\u00da\1\uffff\4\u00da\1\uffff\1\u00da"+
			"\1\uffff\4\u00da\1\uffff\2\u00da\1\uffff\13\u00da\1\uffff\5\u00da\1\uffff"+
			"\6\u00da\1\uffff\13\u00da\2\uffff\6\u00da\1\uffff\4\u00da\1\uffff\5\u00da"+
			"\2\uffff\1\u00da\1\uffff\5\u00da\1\uffff\2\u00da\1\uffff\5\u00da\2\uffff"+
			"\13\u00da\1\uffff\17\u00da\1\uffff\6\u00da\1\uffff\17\u00da\1\uffff\7"+
			"\u00da\1\uffff\3\u00da\1\uffff\6\u00da\1\uffff\4\u00da\1\uffff\3\u00da"+
			"\1\uffff\15\u00da\1\uffff\1\u00da\2\uffff\1\u00da\1\uffff\4\u00da\22"+
			"\uffff\1\5\166\uffff\1\u00da\3\uffff\1\u00da\60\uffff\1\u00da\3\uffff"+
			"\1\u00da\27\uffff\1\u00da\3\uffff\1\u00da",
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
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "202:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );";
		}
	}

	static final String DFA32_eotS =
		"\u01d7\uffff";
	static final String DFA32_eofS =
		"\1\uffff\1\2\3\uffff\4\35\1\uffff\1\35\2\uffff\3\35\1\uffff\1\35\4\uffff"+
		"\1\35\1\uffff\4\35\2\uffff\1\35\u01b8\uffff";
	static final String DFA32_minS =
		"\1\32\1\12\3\uffff\4\12\1\uffff\1\12\2\uffff\3\12\1\uffff\1\12\4\uffff"+
		"\1\12\1\uffff\4\12\2\uffff\1\12\4\uffff\1\0\125\uffff\1\0\35\uffff\1\0"+
		"\34\uffff\1\0\34\uffff\1\0\176\uffff\3\0\u0084\uffff";
	static final String DFA32_maxS =
		"\2\u0216\3\uffff\4\u0146\1\uffff\1\u0146\2\uffff\3\u0146\1\uffff\1\u0146"+
		"\4\uffff\1\u0146\1\uffff\4\u0146\2\uffff\1\u0146\4\uffff\1\0\125\uffff"+
		"\1\0\35\uffff\1\0\34\uffff\1\0\34\uffff\1\0\176\uffff\3\0\u0084\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\32\uffff\1\1\u01b9\uffff";
	static final String DFA32_specialS =
		"\43\uffff\1\0\125\uffff\1\1\35\uffff\1\2\34\uffff\1\3\34\uffff\1\4\176"+
		"\uffff\1\5\1\6\1\7\u0084\uffff}>";
	static final String[] DFA32_transitionS = {
			"\10\2\1\uffff\2\2\1\1\14\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\20\2\1\uffff"+
			"\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\13\2\2\uffff\6\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\13\2\1\uffff\17\2\1\uffff\6\2\1\uffff\17\2\1"+
			"\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15"+
			"\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\u0089\uffff\1\2\3\uffff\1\2\60"+
			"\uffff\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\2\17\uffff\1\5\7\35\1\uffff\17\35\1\uffff\1\35\2\uffff\1\35\1\uffff"+
			"\1\6\3\35\1\uffff\2\35\1\uffff\4\35\1\uffff\3\35\1\2\1\35\1\uffff\4\35"+
			"\1\uffff\20\35\1\uffff\1\31\3\35\1\uffff\1\35\1\uffff\1\35\1\uffff\4"+
			"\35\1\uffff\10\35\1\uffff\4\35\1\uffff\1\16\1\uffff\2\35\1\21\1\35\1"+
			"\2\2\35\1\uffff\4\35\1\10\3\35\1\17\2\35\1\uffff\5\35\1\2\4\35\1\7\1"+
			"\12\1\uffff\2\35\1\33\10\35\1\uffff\1\2\6\35\1\uffff\4\35\1\uffff\5\35"+
			"\1\2\1\uffff\1\35\1\uffff\1\26\4\35\1\uffff\2\35\1\uffff\1\36\4\35\2"+
			"\uffff\13\35\1\2\13\35\1\15\3\35\1\uffff\6\35\1\2\14\35\1\32\2\35\1\uffff"+
			"\7\35\1\uffff\3\35\1\uffff\6\35\1\uffff\4\35\1\uffff\1\35\1\30\1\35\1"+
			"\uffff\15\35\1\uffff\1\35\1\uffff\1\2\1\35\1\2\4\35\3\uffff\1\2\12\uffff"+
			"\1\2\172\uffff\1\35\3\uffff\1\35\60\uffff\1\35\3\uffff\1\35\27\uffff"+
			"\1\35\3\uffff\1\35",
			"",
			"",
			"",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff\1\35"+
			"\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1\35\14\uffff\1\35"+
			"\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1\43\12\uffff\1\35",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff\1\35"+
			"\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1\35\14\uffff\1\35"+
			"\34\uffff\1\35\20\uffff\1\2\1\uffff\1\35\1\uffff\1\35\7\uffff\1\35\12"+
			"\uffff\1\35",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\171\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1\35\14\uffff"+
			"\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1\35\12\uffff"+
			"\1\35",
			"",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\u0097\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff"+
			"\1\35\1\uffff\1\2\6\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\1\2\13\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff"+
			"\1\35\12\uffff\1\35",
			"",
			"",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\u00b4\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff"+
			"\1\35\1\uffff\1\2\6\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\u00d1\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff"+
			"\1\35\1\uffff\1\2\6\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\3\uffff\1\2"+
			"\4\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3"+
			"\uffff\1\35\5\uffff\1\2\2\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff"+
			"\1\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff"+
			"\1\35\12\uffff\1\35",
			"",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"",
			"",
			"",
			"",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"",
			"\1\35\17\uffff\1\35\4\uffff\1\2\30\uffff\1\35\17\uffff\1\35\27\uffff"+
			"\1\2\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff"+
			"\1\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\u0151\21\uffff"+
			"\1\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\u0152\13\uffff\1\35\12\uffff"+
			"\1\u0150\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff"+
			"\1\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"\1\35\17\uffff\1\35\35\uffff\1\35\17\uffff\1\35\30\uffff\1\35\33\uffff"+
			"\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1\35\10\uffff\1"+
			"\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1\35\3\uffff\1\35"+
			"\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1\35\14\uffff\1\35"+
			"\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1\35\5\uffff\1\2\4"+
			"\uffff\1\35",
			"",
			"",
			"\1\35\17\uffff\1\35\26\uffff\1\2\6\uffff\1\35\17\uffff\1\35\30\uffff"+
			"\1\35\33\uffff\1\35\3\uffff\1\35\1\uffff\1\35\7\uffff\1\35\3\uffff\1"+
			"\35\10\uffff\1\35\4\uffff\2\35\3\uffff\1\35\11\uffff\1\35\21\uffff\1"+
			"\35\3\uffff\1\35\10\uffff\1\35\21\uffff\1\35\13\uffff\1\35\12\uffff\1"+
			"\35\14\uffff\1\35\34\uffff\1\35\22\uffff\1\35\1\uffff\1\35\7\uffff\1"+
			"\35\12\uffff\1\35",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "225:51: ( KW_AS )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA32_35 = input.LA(1);
						 
						int index32_35 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_35);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA32_121 = input.LA(1);
						 
						int index32_121 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_121);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA32_151 = input.LA(1);
						 
						int index32_151 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_151);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA32_180 = input.LA(1);
						 
						int index32_180 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_180);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA32_209 = input.LA(1);
						 
						int index32_209 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_209);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA32_336 = input.LA(1);
						 
						int index32_336 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_336);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA32_337 = input.LA(1);
						 
						int index32_337 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_337);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA32_338 = input.LA(1);
						 
						int index32_338 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 29;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index32_338);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA40_eotS =
		"\125\uffff";
	static final String DFA40_eofS =
		"\1\2\1\46\123\uffff";
	static final String DFA40_minS =
		"\2\12\33\uffff\1\7\33\uffff\34\0";
	static final String DFA40_maxS =
		"\2\u0146\33\uffff\1\u0216\33\uffff\34\0";
	static final String DFA40_acceptS =
		"\2\uffff\1\2\33\uffff\33\1\34\uffff";
	static final String DFA40_specialS =
		"\1\uffff\1\0\67\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
		"\1\32\1\33\1\34}>";
	static final String[] DFA40_transitionS = {
			"\1\2\17\uffff\1\1\35\uffff\1\2\17\uffff\1\2\30\uffff\1\2\33\uffff\1\2"+
			"\3\uffff\1\2\1\uffff\1\2\7\uffff\1\2\3\uffff\1\2\10\uffff\1\2\4\uffff"+
			"\2\2\3\uffff\1\2\11\uffff\1\2\21\uffff\1\2\3\uffff\1\2\10\uffff\1\2\21"+
			"\uffff\1\2\13\uffff\1\2\12\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff"+
			"\1\2\1\uffff\1\2\7\uffff\1\2\12\uffff\1\2",
			"\1\41\17\uffff\1\70\35\uffff\1\57\17\uffff\1\42\30\uffff\1\60\33\uffff"+
			"\1\45\3\uffff\1\54\1\uffff\1\55\7\uffff\1\40\3\uffff\1\47\10\uffff\1"+
			"\37\4\uffff\1\36\1\43\3\uffff\1\63\11\uffff\1\51\21\uffff\1\66\3\uffff"+
			"\1\56\10\uffff\1\67\21\uffff\1\52\13\uffff\1\44\12\uffff\1\50\14\uffff"+
			"\1\61\34\uffff\1\64\22\uffff\1\53\1\uffff\1\62\7\uffff\1\35\12\uffff"+
			"\1\65",
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
			"",
			"",
			"",
			"",
			"",
			"\1\104\5\uffff\1\110\4\uffff\1\107\7\uffff\1\116\4\120\2\124\1\120\1"+
			"\uffff\1\120\1\117\1\124\1\120\1\124\2\120\1\124\3\122\1\124\2\120\1"+
			"\124\1\uffff\1\120\1\114\1\113\1\120\1\uffff\4\120\1\uffff\2\120\1\uffff"+
			"\4\120\1\uffff\1\124\1\120\1\124\1\uffff\1\124\1\uffff\1\77\1\101\1\124"+
			"\1\120\1\uffff\1\120\1\76\3\120\1\124\2\120\1\124\3\120\1\124\3\120\1"+
			"\uffff\1\120\1\122\1\124\1\120\1\uffff\1\120\1\uffff\1\120\1\uffff\1"+
			"\120\1\123\2\120\1\uffff\1\124\1\112\1\124\4\120\1\122\1\uffff\2\124"+
			"\2\120\1\uffff\1\124\1\uffff\1\120\3\124\1\uffff\2\120\1\121\2\124\2"+
			"\120\1\124\3\120\1\124\1\122\1\124\1\102\2\124\3\120\1\uffff\4\120\2"+
			"\124\1\uffff\1\120\1\124\3\120\1\124\5\120\1\uffff\1\121\6\120\1\uffff"+
			"\1\120\1\124\2\120\1\71\1\120\1\74\1\120\1\124\1\120\2\uffff\1\120\1"+
			"\uffff\3\124\2\120\1\uffff\2\120\1\uffff\1\124\2\120\1\124\1\120\2\uffff"+
			"\1\120\1\124\1\120\1\124\1\120\1\124\1\120\1\124\3\120\1\uffff\2\124"+
			"\7\120\1\124\1\120\2\124\2\120\1\uffff\3\124\3\120\1\uffff\4\120\1\124"+
			"\5\120\1\122\4\120\1\uffff\4\120\1\115\1\124\1\120\1\uffff\3\120\1\uffff"+
			"\1\100\1\120\1\124\3\120\1\uffff\1\124\1\111\1\124\1\120\1\uffff\1\120"+
			"\1\124\1\115\1\uffff\3\120\1\124\2\120\2\124\3\120\1\124\1\120\1\uffff"+
			"\1\120\2\uffff\1\120\1\uffff\1\124\3\120\3\uffff\1\72\2\uffff\1\73\2"+
			"\uffff\1\75\1\73\10\uffff\1\105\1\103\1\73\1\106\162\uffff\1\120\3\uffff"+
			"\1\120\60\uffff\1\120\3\uffff\1\120\27\uffff\1\120\3\uffff\1\120",
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
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "256:27: ( ( Identifier )=>alias= Identifier )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA40_1 = input.LA(1);
						 
						int index40_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA40_1==LPAREN) ) {s = 29;}
						else if ( (LA40_1==KW_LATERAL) && (synpred14_FromClauseParser())) {s = 30;}
						else if ( (LA40_1==KW_JOIN) && (synpred14_FromClauseParser())) {s = 31;}
						else if ( (LA40_1==KW_INNER) && (synpred14_FromClauseParser())) {s = 32;}
						else if ( (LA40_1==COMMA) && (synpred14_FromClauseParser())) {s = 33;}
						else if ( (LA40_1==KW_CROSS) && (synpred14_FromClauseParser())) {s = 34;}
						else if ( (LA40_1==KW_LEFT) && (synpred14_FromClauseParser())) {s = 35;}
						else if ( (LA40_1==KW_RIGHT) && (synpred14_FromClauseParser())) {s = 36;}
						else if ( (LA40_1==KW_FULL) && (synpred14_FromClauseParser())) {s = 37;}
						else if ( (LA40_1==EOF) && (synpred14_FromClauseParser())) {s = 38;}
						else if ( (LA40_1==KW_INSERT) && (synpred14_FromClauseParser())) {s = 39;}
						else if ( (LA40_1==KW_SELECT) && (synpred14_FromClauseParser())) {s = 40;}
						else if ( (LA40_1==KW_MAP) && (synpred14_FromClauseParser())) {s = 41;}
						else if ( (LA40_1==KW_REDUCE) && (synpred14_FromClauseParser())) {s = 42;}
						else if ( (LA40_1==KW_WHERE) && (synpred14_FromClauseParser())) {s = 43;}
						else if ( (LA40_1==KW_GROUP) && (synpred14_FromClauseParser())) {s = 44;}
						else if ( (LA40_1==KW_HAVING) && (synpred14_FromClauseParser())) {s = 45;}
						else if ( (LA40_1==KW_ORDER) && (synpred14_FromClauseParser())) {s = 46;}
						else if ( (LA40_1==KW_CLUSTER) && (synpred14_FromClauseParser())) {s = 47;}
						else if ( (LA40_1==KW_DISTRIBUTE) && (synpred14_FromClauseParser())) {s = 48;}
						else if ( (LA40_1==KW_SORT) && (synpred14_FromClauseParser())) {s = 49;}
						else if ( (LA40_1==KW_WINDOW) && (synpred14_FromClauseParser())) {s = 50;}
						else if ( (LA40_1==KW_LIMIT) && (synpred14_FromClauseParser())) {s = 51;}
						else if ( (LA40_1==KW_UNION) && (synpred14_FromClauseParser())) {s = 52;}
						else if ( (LA40_1==RPAREN) && (synpred14_FromClauseParser())) {s = 53;}
						else if ( (LA40_1==KW_ON) && (synpred14_FromClauseParser())) {s = 54;}
						else if ( (LA40_1==KW_PARTITION) && (synpred14_FromClauseParser())) {s = 55;}
						else if ( (LA40_1==Identifier) && (synpred14_FromClauseParser())) {s = 56;}
						 
						input.seek(index40_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA40_57 = input.LA(1);
						 
						int index40_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_57);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA40_58 = input.LA(1);
						 
						int index40_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_58);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA40_59 = input.LA(1);
						 
						int index40_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_59);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA40_60 = input.LA(1);
						 
						int index40_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_60);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA40_61 = input.LA(1);
						 
						int index40_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_61);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA40_62 = input.LA(1);
						 
						int index40_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_62);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA40_63 = input.LA(1);
						 
						int index40_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_63);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA40_64 = input.LA(1);
						 
						int index40_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_64);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA40_65 = input.LA(1);
						 
						int index40_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_65);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA40_66 = input.LA(1);
						 
						int index40_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_66);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA40_67 = input.LA(1);
						 
						int index40_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_67);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA40_68 = input.LA(1);
						 
						int index40_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_68);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA40_69 = input.LA(1);
						 
						int index40_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_69);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA40_70 = input.LA(1);
						 
						int index40_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_70);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA40_71 = input.LA(1);
						 
						int index40_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_71);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA40_72 = input.LA(1);
						 
						int index40_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_72);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA40_73 = input.LA(1);
						 
						int index40_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_73);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA40_74 = input.LA(1);
						 
						int index40_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_74);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA40_75 = input.LA(1);
						 
						int index40_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_75);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA40_76 = input.LA(1);
						 
						int index40_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_76);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA40_77 = input.LA(1);
						 
						int index40_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_77);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA40_78 = input.LA(1);
						 
						int index40_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_78);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA40_79 = input.LA(1);
						 
						int index40_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_79);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA40_80 = input.LA(1);
						 
						int index40_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_80);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA40_81 = input.LA(1);
						 
						int index40_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_81);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA40_82 = input.LA(1);
						 
						int index40_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_82);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA40_83 = input.LA(1);
						 
						int index40_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_83);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA40_84 = input.LA(1);
						 
						int index40_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_FromClauseParser()) ) {s = 56;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index40_84);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 40, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_STAR_in_tableAllColumns57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableAllColumns79 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_tableAllColumns81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STAR_in_tableAllColumns83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableOrColumn131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList170 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_expressionList173 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_expressionList175 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_identifier_in_aliasList217 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_aliasList220 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_aliasList222 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_FROM_in_fromClause266 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFFEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_joinSource_in_fromClause268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fromSource_in_joinSource303 = new BitSet(new long[]{0x0000000000000402L,0x2000000000000100L,0x0000000041000800L,0x0000020000000000L});
	public static final BitSet FOLLOW_joinToken_in_joinSource307 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_fromSource_in_joinSource310 = new BitSet(new long[]{0x0000000000000402L,0x2000000000000100L,0x4000000041000800L,0x0000020000000000L});
	public static final BitSet FOLLOW_KW_ON_in_joinSource314 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_joinSource317 = new BitSet(new long[]{0x0000000000000402L,0x2000000000000100L,0x0000000041000800L,0x0000020000000000L});
	public static final BitSet FOLLOW_uniqueJoinToken_in_joinSource333 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFEFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource336 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_joinSource339 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFEFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_joinSource342 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource371 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_fromSource_in_uniqueJoinSource374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr403 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_uniqueJoinExpr407 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_uniqueJoinExpr410 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_uniqueJoinExpr414 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INNER_in_joinToken526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_joinToken552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CROSS_in_joinToken587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RIGHT_in_joinToken633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FULL_in_joinToken652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_KW_SEMI_in_joinToken674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_OUTER_in_lateralView724 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7F7FF7EFBFFF7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_function_in_lateralView726 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView728 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView731 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_lateralView733 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_lateralView741 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_lateralView743 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView777 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7F7FF7EFBFFF7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_function_in_lateralView779 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView781 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView784 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_lateralView786 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_lateralView794 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_lateralView796 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_identifier_in_tableAlias850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fromSource0_in_fromSource897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_fromSource911 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFFEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_joinSource_in_fromSource913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_fromSource915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fromSource0_in_fromSource927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_fromSource0967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableSource_in_fromSource0971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_subQuerySource_in_fromSource0975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_virtualTableSource_in_fromSource0979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_lateralView_in_fromSource0983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_tableBucketSample1019 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_OF_in_tableBucketSample1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample1036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_ON_in_tableBucketSample1040 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample1044 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_tableBucketSample1047 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample1051 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_tableBucketSample1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_splitSample1112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000004000L});
	public static final BitSet FOLLOW_KW_PERCENT_in_splitSample1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_ROWS_in_splitSample1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample1169 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableBucketSample_in_tableSample1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splitSample_in_tableSample1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableSource1261 = new BitSet(new long[]{0x6F4BFFFBFC000002L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EFFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_tableProperties_in_tableSource1277 = new BitSet(new long[]{0x6F4BFFFBFC000002L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EFFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_tableSample_in_tableSource1294 = new BitSet(new long[]{0x6F4BFFFBFC000002L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_KW_AS_in_tableSource1311 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_tableSource1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableSource1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1399 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_tableName1401 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_tableName1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_viewName1482 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_viewName1484 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_viewName1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subQuerySource1538 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000100000008000L,0x0010000020000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_subQuerySource1543 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_KW_AS_in_subQuerySource1545 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_subQuerySource1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction1747 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1763 = new BitSet(new long[]{0x0100000004000000L,0x0000000200000000L,0x0000000000000000L,0x0000000000000804L,0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction1767 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1791 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1795 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction1799 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1803 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1807 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1824 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_WHERE_in_whereClause1900 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_searchCondition_in_whereClause1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_searchCondition1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_valueRowConstructor1978 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3EF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor1980 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_valueRowConstructor1983 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3EF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_precedenceUnaryPrefixExpression_in_valueRowConstructor1985 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_valueRowConstructor1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2029 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_valuesTableConstructor2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2034 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_VALUES_in_valuesClause2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_valuesTableConstructor_in_valuesClause2080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_valuesClause_in_virtualTableSource2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2119 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_tableNameColList_in_virtualTableSource2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_tableNameColList2162 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_tableNameColList2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_tableNameColList2167 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_tableNameColList2169 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_tableNameColList2172 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_tableNameColList2174 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_tableNameColList2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LATERAL_in_synpred1_FromClauseParser711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_synpred1_FromClauseParser713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_OUTER_in_synpred1_FromClauseParser715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred2_FromClauseParser737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred3_FromClauseParser790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred4_FromClauseParser890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_VALUES_in_synpred4_FromClauseParser892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred5_FromClauseParser906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred6_FromClauseParser961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_FromClauseParser963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableProperties_in_synpred7_FromClauseParser1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSample_in_synpred8_FromClauseParser1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_synpred9_FromClauseParser1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_synpred10_FromClauseParser1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred12_FromClauseParser1777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred12_FromClauseParser1779 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007806L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_expression_in_synpred12_FromClauseParser1781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_synpred12_FromClauseParser1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred14_FromClauseParser1830 = new BitSet(new long[]{0x0000000000000002L});
}
