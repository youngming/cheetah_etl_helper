// $ANTLR 3.5.2 SelectClauseParser.g 2020-11-05 18:51:54

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
public class HiveParser_SelectClauseParser extends Parser {
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


	public HiveParser_SelectClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_SelectClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "SelectClauseParser.g"; }


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


	public static class selectClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectClause"
	// SelectClauseParser.g:51:1: selectClause : ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
	public final HiveParser_SelectClauseParser.selectClause_return selectClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectClause_return retval = new HiveParser_SelectClauseParser.selectClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token dist=null;
		Token transform=null;
		Token KW_SELECT1=null;
		Token KW_ALL3=null;
		ParserRuleReturnScope hintClause2 =null;
		ParserRuleReturnScope selectList4 =null;
		ParserRuleReturnScope selectTrfmClause5 =null;
		ParserRuleReturnScope trfmClause6 =null;

		CommonTree dist_tree=null;
		CommonTree transform_tree=null;
		CommonTree KW_SELECT1_tree=null;
		CommonTree KW_ALL3_tree=null;
		RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
		RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
		RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
		RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
		RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
		RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
		RewriteRuleSubtreeStream stream_selectTrfmClause=new RewriteRuleSubtreeStream(adaptor,"rule selectTrfmClause");
		RewriteRuleSubtreeStream stream_hintClause=new RewriteRuleSubtreeStream(adaptor,"rule hintClause");

		 gParent.pushMsg("select clause", state); 
		try {
			// SelectClauseParser.g:54:5: ( KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList ) -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==KW_SELECT) ) {
				alt4=1;
			}
			else if ( (LA4_0==KW_MAP||LA4_0==KW_REDUCE) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// SelectClauseParser.g:55:5: KW_SELECT ( hintClause )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					{
					KW_SELECT1=(Token)match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause71); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SELECT.add(KW_SELECT1);

					// SelectClauseParser.g:55:15: ( hintClause )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DIVIDE) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// SelectClauseParser.g:55:15: hintClause
							{
							pushFollow(FOLLOW_hintClause_in_selectClause73);
							hintClause2=hintClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_hintClause.add(hintClause2.getTree());
							}
							break;

					}

					// SelectClauseParser.g:55:27: ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==BigintLiteral||LA3_0==CharSetName||LA3_0==DecimalLiteral||(LA3_0 >= Identifier && LA3_0 <= KW_ANALYZE)||(LA3_0 >= KW_ARCHIVE && LA3_0 <= KW_BY)||(LA3_0 >= KW_CASCADE && LA3_0 <= KW_CHANGE)||(LA3_0 >= KW_CLUSTER && LA3_0 <= KW_COLLECTION)||(LA3_0 >= KW_COLUMNS && LA3_0 <= KW_COMMENT)||(LA3_0 >= KW_COMPACT && LA3_0 <= KW_CONCATENATE)||(LA3_0 >= KW_CONSTRAINT && LA3_0 <= KW_CREATE)||LA3_0==KW_CUBE||(LA3_0 >= KW_CURRENT_DATE && LA3_0 <= KW_DATA)||(LA3_0 >= KW_DATABASES && LA3_0 <= KW_ELEM_TYPE)||LA3_0==KW_ENABLE||LA3_0==KW_ESCAPED||(LA3_0 >= KW_EXCLUSIVE && LA3_0 <= KW_EXPORT)||(LA3_0 >= KW_EXTERNAL && LA3_0 <= KW_FLOAT)||(LA3_0 >= KW_FOR && LA3_0 <= KW_FORMATTED)||LA3_0==KW_FULL||(LA3_0 >= KW_FUNCTIONS && LA3_0 <= KW_GROUPING)||(LA3_0 >= KW_HOUR && LA3_0 <= KW_JAR)||(LA3_0 >= KW_KEY && LA3_0 <= KW_LEFT)||(LA3_0 >= KW_LEVEL && LA3_0 <= KW_LONG)||(LA3_0 >= KW_MAP && LA3_0 <= KW_MONTH)||(LA3_0 >= KW_MSCK && LA3_0 <= KW_OFFSET)||LA3_0==KW_OPTION||(LA3_0 >= KW_ORDER && LA3_0 <= KW_OUTPUTFORMAT)||(LA3_0 >= KW_OVERWRITE && LA3_0 <= KW_OWNER)||(LA3_0 >= KW_PARTITION && LA3_0 <= KW_PLUS)||(LA3_0 >= KW_PRETTY && LA3_0 <= KW_RECORDWRITER)||(LA3_0 >= KW_REFERENCES && LA3_0 <= KW_ROLES)||(LA3_0 >= KW_ROLLUP && LA3_0 <= KW_SECOND)||(LA3_0 >= KW_SEMI && LA3_0 <= KW_SSL)||(LA3_0 >= KW_STATISTICS && LA3_0 <= KW_TABLES)||(LA3_0 >= KW_TBLPROPERTIES && LA3_0 <= KW_TERMINATED)||(LA3_0 >= KW_TIMESTAMP && LA3_0 <= KW_TRANSACTIONS)||(LA3_0 >= KW_TRIGGER && LA3_0 <= KW_UNARCHIVE)||(LA3_0 >= KW_UNDO && LA3_0 <= KW_UNIONTYPE)||(LA3_0 >= KW_UNLOCK && LA3_0 <= KW_VALUE_TYPE)||LA3_0==KW_VIEW||LA3_0==KW_WHILE||(LA3_0 >= KW_WITH && LA3_0 <= KW_YEAR)||LA3_0==LPAREN||LA3_0==MINUS||(LA3_0 >= Number && LA3_0 <= PLUS)||(LA3_0 >= STAR && LA3_0 <= TinyintLiteral)||LA3_0==KW_HOLD_DDLTIME||LA3_0==KW_IGNORE||LA3_0==KW_NO_DROP||LA3_0==KW_OFFLINE||LA3_0==KW_PROTECTION||LA3_0==KW_READONLY) ) {
						alt3=1;
					}
					else if ( (LA3_0==KW_TRANSFORM) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// SelectClauseParser.g:55:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							{
							// SelectClauseParser.g:55:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							// SelectClauseParser.g:55:29: ( KW_ALL |dist= KW_DISTINCT )? selectList
							{
							// SelectClauseParser.g:55:29: ( KW_ALL |dist= KW_DISTINCT )?
							int alt2=3;
							alt2 = dfa2.predict(input);
							switch (alt2) {
								case 1 :
									// SelectClauseParser.g:55:30: KW_ALL
									{
									KW_ALL3=(Token)match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause79); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_ALL.add(KW_ALL3);

									}
									break;
								case 2 :
									// SelectClauseParser.g:55:39: dist= KW_DISTINCT
									{
									dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause85); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);

									}
									break;

							}

							pushFollow(FOLLOW_selectList_in_selectClause89);
							selectList4=selectList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_selectList.add(selectList4.getTree());
							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:56:29: (transform= KW_TRANSFORM selectTrfmClause )
							{
							// SelectClauseParser.g:56:29: (transform= KW_TRANSFORM selectTrfmClause )
							// SelectClauseParser.g:56:30: transform= KW_TRANSFORM selectTrfmClause
							{
							transform=(Token)match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_selectClause123); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_TRANSFORM.add(transform);

							pushFollow(FOLLOW_selectTrfmClause_in_selectClause125);
							selectTrfmClause5=selectTrfmClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_selectTrfmClause.add(selectTrfmClause5.getTree());
							}

							}
							break;

					}

					// AST REWRITE
					// elements: selectList, selectTrfmClause, selectList, hintClause, hintClause, hintClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 57:6: -> {$transform == null && $dist == null}? ^( TOK_SELECT ( hintClause )? selectList )
					if (transform == null && dist == null) {
						// SelectClauseParser.g:57:48: ^( TOK_SELECT ( hintClause )? selectList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:57:61: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 58:6: -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( hintClause )? selectList )
					if (transform == null && dist != null) {
						// SelectClauseParser.g:58:48: ^( TOK_SELECTDI ( hintClause )? selectList )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECTDI, "TOK_SELECTDI"), root_1);
						// SelectClauseParser.g:58:63: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 59:6: -> ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
					{
						// SelectClauseParser.g:59:9: ^( TOK_SELECT ( hintClause )? ^( TOK_SELEXPR selectTrfmClause ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:59:22: ( hintClause )?
						if ( stream_hintClause.hasNext() ) {
							adaptor.addChild(root_1, stream_hintClause.nextTree());
						}
						stream_hintClause.reset();

						// SelectClauseParser.g:59:34: ^( TOK_SELEXPR selectTrfmClause )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_selectTrfmClause.nextTree());
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
					// SelectClauseParser.g:61:5: trfmClause
					{
					pushFollow(FOLLOW_trfmClause_in_selectClause196);
					trfmClause6=trfmClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_trfmClause.add(trfmClause6.getTree());
					// AST REWRITE
					// elements: trfmClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 61:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
					{
						// SelectClauseParser.g:61:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:61:32: ^( TOK_SELEXPR trfmClause )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_trfmClause.nextTree());
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
	// $ANTLR end "selectClause"


	public static class selectList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectList"
	// SelectClauseParser.g:64:1: selectList : selectItem ( COMMA selectItem )* -> ( selectItem )+ ;
	public final HiveParser_SelectClauseParser.selectList_return selectList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectList_return retval = new HiveParser_SelectClauseParser.selectList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA8=null;
		ParserRuleReturnScope selectItem7 =null;
		ParserRuleReturnScope selectItem9 =null;

		CommonTree COMMA8_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");

		 gParent.pushMsg("select list", state); 
		try {
			// SelectClauseParser.g:67:5: ( selectItem ( COMMA selectItem )* -> ( selectItem )+ )
			// SelectClauseParser.g:68:5: selectItem ( COMMA selectItem )*
			{
			pushFollow(FOLLOW_selectItem_in_selectList239);
			selectItem7=selectItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectItem.add(selectItem7.getTree());
			// SelectClauseParser.g:68:16: ( COMMA selectItem )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// SelectClauseParser.g:68:18: COMMA selectItem
					{
					COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectList243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);

					pushFollow(FOLLOW_selectItem_in_selectList246);
					selectItem9=selectItem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectItem.add(selectItem9.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: selectItem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 68:39: -> ( selectItem )+
			{
				if ( !(stream_selectItem.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectItem.hasNext() ) {
					adaptor.addChild(root_0, stream_selectItem.nextTree());
				}
				stream_selectItem.reset();

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
	// $ANTLR end "selectList"


	public static class selectTrfmClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectTrfmClause"
	// SelectClauseParser.g:71:1: selectTrfmClause : LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectTrfmClause_return retval = new HiveParser_SelectClauseParser.selectTrfmClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN10=null;
		Token RPAREN12=null;
		Token KW_USING13=null;
		Token StringLiteral14=null;
		Token KW_AS15=null;
		Token LPAREN16=null;
		Token RPAREN19=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList11 =null;
		ParserRuleReturnScope aliasList17 =null;
		ParserRuleReturnScope columnNameTypeList18 =null;
		ParserRuleReturnScope aliasList20 =null;
		ParserRuleReturnScope columnNameTypeList21 =null;

		CommonTree LPAREN10_tree=null;
		CommonTree RPAREN12_tree=null;
		CommonTree KW_USING13_tree=null;
		CommonTree StringLiteral14_tree=null;
		CommonTree KW_AS15_tree=null;
		CommonTree LPAREN16_tree=null;
		CommonTree RPAREN19_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.pushMsg("transform clause", state); 
		try {
			// SelectClauseParser.g:74:5: ( LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:75:5: LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause285); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN10);

			pushFollow(FOLLOW_selectExpressionList_in_selectTrfmClause287);
			selectExpressionList11=selectExpressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList11.getTree());
			RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause289); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN12);

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause297);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_selectTrfmClause301);
			inRec=gHiveParser.recordWriter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());
			KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_selectTrfmClause307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);

			StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_selectTrfmClause309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral14);

			// SelectClauseParser.g:78:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KW_AS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// SelectClauseParser.g:78:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS15=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectTrfmClause317); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS15);

					// SelectClauseParser.g:78:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LPAREN) ) {
						alt8=1;
					}
					else if ( ((LA8_0 >= Identifier && LA8_0 <= KW_ANALYZE)||(LA8_0 >= KW_ARCHIVE && LA8_0 <= KW_BY)||LA8_0==KW_CASCADE||LA8_0==KW_CHANGE||(LA8_0 >= KW_CLUSTER && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_COMMENT)||(LA8_0 >= KW_COMPACT && LA8_0 <= KW_CONCATENATE)||(LA8_0 >= KW_CONSTRAINT && LA8_0 <= KW_CREATE)||LA8_0==KW_CUBE||(LA8_0 >= KW_CURRENT_DATE && LA8_0 <= KW_DATA)||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||LA8_0==KW_ESCAPED||(LA8_0 >= KW_EXCLUSIVE && LA8_0 <= KW_EXPORT)||(LA8_0 >= KW_EXTERNAL && LA8_0 <= KW_FLOAT)||(LA8_0 >= KW_FOR && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FULL||(LA8_0 >= KW_FUNCTIONS && LA8_0 <= KW_GROUPING)||(LA8_0 >= KW_HOUR && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_IMPORT && LA8_0 <= KW_INTERSECT)||(LA8_0 >= KW_INTO && LA8_0 <= KW_JAR)||(LA8_0 >= KW_KEY && LA8_0 <= KW_LEFT)||(LA8_0 >= KW_LEVEL && LA8_0 <= KW_LONG)||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MONTH)||(LA8_0 >= KW_MSCK && LA8_0 <= KW_NOSCAN)||(LA8_0 >= KW_NOVALIDATE && LA8_0 <= KW_OFFSET)||LA8_0==KW_OPTION||(LA8_0 >= KW_ORDER && LA8_0 <= KW_OUTPUTFORMAT)||(LA8_0 >= KW_OVERWRITE && LA8_0 <= KW_OWNER)||(LA8_0 >= KW_PARTITION && LA8_0 <= KW_PLUS)||(LA8_0 >= KW_PRETTY && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_REFERENCES && LA8_0 <= KW_ROLES)||(LA8_0 >= KW_ROLLUP && LA8_0 <= KW_SECOND)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_SSL)||(LA8_0 >= KW_STATISTICS && LA8_0 <= KW_TABLES)||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TERMINATED)||(LA8_0 >= KW_TIMESTAMP && LA8_0 <= KW_TRANSACTIONS)||(LA8_0 >= KW_TRIGGER && LA8_0 <= KW_UNARCHIVE)||(LA8_0 >= KW_UNDO && LA8_0 <= KW_UNIONTYPE)||(LA8_0 >= KW_UNLOCK && LA8_0 <= KW_VALUE_TYPE)||LA8_0==KW_VIEW||LA8_0==KW_WHILE||(LA8_0 >= KW_WITH && LA8_0 <= KW_YEAR)||LA8_0==KW_HOLD_DDLTIME||LA8_0==KW_IGNORE||LA8_0==KW_NO_DROP||LA8_0==KW_OFFLINE||LA8_0==KW_PROTECTION||LA8_0==KW_READONLY) ) {
						alt8=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// SelectClauseParser.g:78:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:78:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:78:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause321); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN16);

							// SelectClauseParser.g:78:22: ( aliasList | columnNameTypeList )
							int alt6=2;
							alt6 = dfa6.predict(input);
							switch (alt6) {
								case 1 :
									// SelectClauseParser.g:78:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause324);
									aliasList17=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList17.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:78:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause328);
									columnNameTypeList18=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList18.getTree());
									}
									break;

							}

							RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause331); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:78:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:78:65: ( aliasList | columnNameTypeList )
							int alt7=2;
							alt7 = dfa7.predict(input);
							switch (alt7) {
								case 1 :
									// SelectClauseParser.g:78:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause337);
									aliasList20=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList20.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:78:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause341);
									columnNameTypeList21=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList21.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause353);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_selectTrfmClause357);
			outRec=gHiveParser.recordReader();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: inRec, StringLiteral, outSerde, columnNameTypeList, selectExpressionList, aliasList, inSerde, outRec
			// token labels: 
			// rule labels: inRec, outRec, inSerde, outSerde, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 80:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:80:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:80:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:80:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

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
	// $ANTLR end "selectTrfmClause"


	public static class hintClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintClause"
	// SelectClauseParser.g:83:1: hintClause : DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) ;
	public final HiveParser_SelectClauseParser.hintClause_return hintClause() throws RecognitionException {
		HiveParser_SelectClauseParser.hintClause_return retval = new HiveParser_SelectClauseParser.hintClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DIVIDE22=null;
		Token STAR23=null;
		Token PLUS24=null;
		Token STAR26=null;
		Token DIVIDE27=null;
		ParserRuleReturnScope hintList25 =null;

		CommonTree DIVIDE22_tree=null;
		CommonTree STAR23_tree=null;
		CommonTree PLUS24_tree=null;
		CommonTree STAR26_tree=null;
		CommonTree DIVIDE27_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");

		 gParent.pushMsg("hint clause", state); 
		try {
			// SelectClauseParser.g:86:5: ( DIVIDE STAR PLUS hintList STAR DIVIDE -> ^( TOK_HINTLIST hintList ) )
			// SelectClauseParser.g:87:5: DIVIDE STAR PLUS hintList STAR DIVIDE
			{
			DIVIDE22=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause420); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE22);

			STAR23=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause422); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STAR.add(STAR23);

			PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_hintClause424); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS.add(PLUS24);

			pushFollow(FOLLOW_hintList_in_hintClause426);
			hintList25=hintList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_hintList.add(hintList25.getTree());
			STAR26=(Token)match(input,STAR,FOLLOW_STAR_in_hintClause428); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STAR.add(STAR26);

			DIVIDE27=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_hintClause430); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DIVIDE.add(DIVIDE27);

			// AST REWRITE
			// elements: hintList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:43: -> ^( TOK_HINTLIST hintList )
			{
				// SelectClauseParser.g:87:46: ^( TOK_HINTLIST hintList )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINTLIST, "TOK_HINTLIST"), root_1);
				adaptor.addChild(root_1, stream_hintList.nextTree());
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
	// $ANTLR end "hintClause"


	public static class hintList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintList"
	// SelectClauseParser.g:90:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
	public final HiveParser_SelectClauseParser.hintList_return hintList() throws RecognitionException {
		HiveParser_SelectClauseParser.hintList_return retval = new HiveParser_SelectClauseParser.hintList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA29=null;
		ParserRuleReturnScope hintItem28 =null;
		ParserRuleReturnScope hintItem30 =null;

		CommonTree COMMA29_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");

		 gParent.pushMsg("hint list", state); 
		try {
			// SelectClauseParser.g:93:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
			// SelectClauseParser.g:94:5: hintItem ( COMMA hintItem )*
			{
			pushFollow(FOLLOW_hintItem_in_hintList469);
			hintItem28=hintItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_hintItem.add(hintItem28.getTree());
			// SelectClauseParser.g:94:14: ( COMMA hintItem )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// SelectClauseParser.g:94:15: COMMA hintItem
					{
					COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintList472); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);

					pushFollow(FOLLOW_hintItem_in_hintList474);
					hintItem30=hintItem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hintItem.add(hintItem30.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// AST REWRITE
			// elements: hintItem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 94:32: -> ( hintItem )+
			{
				if ( !(stream_hintItem.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_hintItem.hasNext() ) {
					adaptor.addChild(root_0, stream_hintItem.nextTree());
				}
				stream_hintItem.reset();

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
	// $ANTLR end "hintList"


	public static class hintItem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintItem"
	// SelectClauseParser.g:97:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) ;
	public final HiveParser_SelectClauseParser.hintItem_return hintItem() throws RecognitionException {
		HiveParser_SelectClauseParser.hintItem_return retval = new HiveParser_SelectClauseParser.hintItem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN32=null;
		Token RPAREN34=null;
		ParserRuleReturnScope hintName31 =null;
		ParserRuleReturnScope hintArgs33 =null;

		CommonTree LPAREN32_tree=null;
		CommonTree RPAREN34_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
		RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");

		 gParent.pushMsg("hint item", state); 
		try {
			// SelectClauseParser.g:100:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) )
			// SelectClauseParser.g:101:5: hintName ( LPAREN hintArgs RPAREN )?
			{
			pushFollow(FOLLOW_hintName_in_hintItem512);
			hintName31=hintName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_hintName.add(hintName31.getTree());
			// SelectClauseParser.g:101:14: ( LPAREN hintArgs RPAREN )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==LPAREN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// SelectClauseParser.g:101:15: LPAREN hintArgs RPAREN
					{
					LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hintItem515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN32);

					pushFollow(FOLLOW_hintArgs_in_hintItem517);
					hintArgs33=hintArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hintArgs.add(hintArgs33.getTree());
					RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hintItem519); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN34);

					}
					break;

			}

			// AST REWRITE
			// elements: hintArgs, hintName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 101:40: -> ^( TOK_HINT hintName ( hintArgs )? )
			{
				// SelectClauseParser.g:101:43: ^( TOK_HINT hintName ( hintArgs )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINT, "TOK_HINT"), root_1);
				adaptor.addChild(root_1, stream_hintName.nextTree());
				// SelectClauseParser.g:101:63: ( hintArgs )?
				if ( stream_hintArgs.hasNext() ) {
					adaptor.addChild(root_1, stream_hintArgs.nextTree());
				}
				stream_hintArgs.reset();

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
	// $ANTLR end "hintItem"


	public static class hintName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintName"
	// SelectClauseParser.g:104:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE );
	public final HiveParser_SelectClauseParser.hintName_return hintName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintName_return retval = new HiveParser_SelectClauseParser.hintName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAPJOIN35=null;
		Token KW_STREAMTABLE36=null;

		CommonTree KW_MAPJOIN35_tree=null;
		CommonTree KW_STREAMTABLE36_tree=null;
		RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
		RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");

		 gParent.pushMsg("hint name", state); 
		try {
			// SelectClauseParser.g:107:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==KW_MAPJOIN) ) {
				alt12=1;
			}
			else if ( (LA12_0==KW_STREAMTABLE) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// SelectClauseParser.g:108:5: KW_MAPJOIN
					{
					KW_MAPJOIN35=(Token)match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MAPJOIN.add(KW_MAPJOIN35);

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
					// 108:16: -> TOK_MAPJOIN
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:109:7: KW_STREAMTABLE
					{
					KW_STREAMTABLE36=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_STREAMTABLE.add(KW_STREAMTABLE36);

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
					// 109:22: -> TOK_STREAMTABLE
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE"));
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
	// $ANTLR end "hintName"


	public static class hintArgs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintArgs"
	// SelectClauseParser.g:112:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
	public final HiveParser_SelectClauseParser.hintArgs_return hintArgs() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgs_return retval = new HiveParser_SelectClauseParser.hintArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA38=null;
		ParserRuleReturnScope hintArgName37 =null;
		ParserRuleReturnScope hintArgName39 =null;

		CommonTree COMMA38_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");

		 gParent.pushMsg("hint arguments", state); 
		try {
			// SelectClauseParser.g:115:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
			// SelectClauseParser.g:116:5: hintArgName ( COMMA hintArgName )*
			{
			pushFollow(FOLLOW_hintArgName_in_hintArgs610);
			hintArgName37=hintArgName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_hintArgName.add(hintArgName37.getTree());
			// SelectClauseParser.g:116:17: ( COMMA hintArgName )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// SelectClauseParser.g:116:18: COMMA hintArgName
					{
					COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA38);

					pushFollow(FOLLOW_hintArgName_in_hintArgs615);
					hintArgName39=hintArgName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hintArgName.add(hintArgName39.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: hintArgName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 116:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
			{
				// SelectClauseParser.g:116:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST"), root_1);
				if ( !(stream_hintArgName.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_hintArgName.hasNext() ) {
					adaptor.addChild(root_1, stream_hintArgName.nextTree());
				}
				stream_hintArgName.reset();

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
	// $ANTLR end "hintArgs"


	public static class hintArgName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "hintArgName"
	// SelectClauseParser.g:119:1: hintArgName : identifier ;
	public final HiveParser_SelectClauseParser.hintArgName_return hintArgName() throws RecognitionException {
		HiveParser_SelectClauseParser.hintArgName_return retval = new HiveParser_SelectClauseParser.hintArgName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope identifier40 =null;


		 gParent.pushMsg("hint argument name", state); 
		try {
			// SelectClauseParser.g:122:5: ( identifier )
			// SelectClauseParser.g:123:5: identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_hintArgName657);
			identifier40=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier40.getTree());

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
	// $ANTLR end "hintArgName"


	public static class selectItem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectItem"
	// SelectClauseParser.g:126:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );
	public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
		HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS43=null;
		Token KW_AS45=null;
		Token LPAREN46=null;
		Token COMMA48=null;
		Token RPAREN50=null;
		ParserRuleReturnScope tableAllColumns41 =null;
		ParserRuleReturnScope expression42 =null;
		ParserRuleReturnScope identifier44 =null;
		ParserRuleReturnScope identifier47 =null;
		ParserRuleReturnScope identifier49 =null;

		CommonTree KW_AS43_tree=null;
		CommonTree KW_AS45_tree=null;
		CommonTree LPAREN46_tree=null;
		CommonTree COMMA48_tree=null;
		CommonTree RPAREN50_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_tableAllColumns=new RewriteRuleSubtreeStream(adaptor,"rule tableAllColumns");

		 gParent.pushMsg("selection target", state); 
		try {
			// SelectClauseParser.g:129:5: ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) )
			int alt17=2;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// SelectClauseParser.g:130:5: ( tableAllColumns )=> tableAllColumns
					{
					pushFollow(FOLLOW_tableAllColumns_in_selectItem694);
					tableAllColumns41=gHiveParser.tableAllColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAllColumns.add(tableAllColumns41.getTree());
					// AST REWRITE
					// elements: tableAllColumns
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 130:42: -> ^( TOK_SELEXPR tableAllColumns )
					{
						// SelectClauseParser.g:130:45: ^( TOK_SELEXPR tableAllColumns )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
						adaptor.addChild(root_1, stream_tableAllColumns.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:132:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
					{
					// SelectClauseParser.g:132:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
					// SelectClauseParser.g:132:7: expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
					{
					pushFollow(FOLLOW_expression_in_selectItem716);
					expression42=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());
					// SelectClauseParser.g:133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
					int alt16=3;
					alt16 = dfa16.predict(input);
					switch (alt16) {
						case 1 :
							// SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
							{
							// SelectClauseParser.g:133:8: ( ( KW_AS )? identifier )
							// SelectClauseParser.g:133:9: ( KW_AS )? identifier
							{
							// SelectClauseParser.g:133:9: ( KW_AS )?
							int alt14=2;
							alt14 = dfa14.predict(input);
							switch (alt14) {
								case 1 :
									// SelectClauseParser.g:133:9: KW_AS
									{
									KW_AS43=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem726); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS43);

									}
									break;

							}

							pushFollow(FOLLOW_identifier_in_selectItem729);
							identifier44=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier44.getTree());
							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
							{
							// SelectClauseParser.g:133:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
							// SelectClauseParser.g:133:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
							{
							KW_AS45=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem735); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS45);

							LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem737); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN46);

							pushFollow(FOLLOW_identifier_in_selectItem739);
							identifier47=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier47.getTree());
							// SelectClauseParser.g:133:55: ( COMMA identifier )*
							loop15:
							while (true) {
								int alt15=2;
								int LA15_0 = input.LA(1);
								if ( (LA15_0==COMMA) ) {
									alt15=1;
								}

								switch (alt15) {
								case 1 :
									// SelectClauseParser.g:133:56: COMMA identifier
									{
									COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem742); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);

									pushFollow(FOLLOW_identifier_in_selectItem744);
									identifier49=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier49.getTree());
									}
									break;

								default :
									break loop15;
								}
							}

							RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem748); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN50);

							}

							}
							break;

					}

					}

					// AST REWRITE
					// elements: expression, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 134:7: -> ^( TOK_SELEXPR expression ( identifier )* )
					{
						// SelectClauseParser.g:134:10: ^( TOK_SELEXPR expression ( identifier )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// SelectClauseParser.g:134:35: ( identifier )*
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
	// $ANTLR end "selectItem"


	public static class trfmClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "trfmClause"
	// SelectClauseParser.g:137:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_MAP51=null;
		Token KW_REDUCE53=null;
		Token KW_USING55=null;
		Token StringLiteral56=null;
		Token KW_AS57=null;
		Token LPAREN58=null;
		Token RPAREN61=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList52 =null;
		ParserRuleReturnScope selectExpressionList54 =null;
		ParserRuleReturnScope aliasList59 =null;
		ParserRuleReturnScope columnNameTypeList60 =null;
		ParserRuleReturnScope aliasList62 =null;
		ParserRuleReturnScope columnNameTypeList63 =null;

		CommonTree KW_MAP51_tree=null;
		CommonTree KW_REDUCE53_tree=null;
		CommonTree KW_USING55_tree=null;
		CommonTree StringLiteral56_tree=null;
		CommonTree KW_AS57_tree=null;
		CommonTree LPAREN58_tree=null;
		CommonTree RPAREN61_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.pushMsg("transform clause", state); 
		try {
			// SelectClauseParser.g:140:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			// SelectClauseParser.g:141:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_MAP) ) {
				alt18=1;
			}
			else if ( (LA18_0==KW_REDUCE) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// SelectClauseParser.g:141:9: KW_MAP selectExpressionList
					{
					KW_MAP51=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause803); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MAP.add(KW_MAP51);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause808);
					selectExpressionList52=selectExpressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList52.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:142:9: KW_REDUCE selectExpressionList
					{
					KW_REDUCE53=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause818); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_REDUCE.add(KW_REDUCE53);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause820);
					selectExpressionList54=selectExpressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList54.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause830);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_trfmClause834);
			inRec=gHiveParser.recordWriter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());
			KW_USING55=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause840); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING55);

			StringLiteral56=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause842); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral56);

			// SelectClauseParser.g:145:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==KW_AS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// SelectClauseParser.g:145:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS57=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause850); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS57);

					// SelectClauseParser.g:145:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LPAREN) ) {
						alt21=1;
					}
					else if ( ((LA21_0 >= Identifier && LA21_0 <= KW_ANALYZE)||(LA21_0 >= KW_ARCHIVE && LA21_0 <= KW_BY)||LA21_0==KW_CASCADE||LA21_0==KW_CHANGE||(LA21_0 >= KW_CLUSTER && LA21_0 <= KW_COLLECTION)||(LA21_0 >= KW_COLUMNS && LA21_0 <= KW_COMMENT)||(LA21_0 >= KW_COMPACT && LA21_0 <= KW_CONCATENATE)||(LA21_0 >= KW_CONSTRAINT && LA21_0 <= KW_CREATE)||LA21_0==KW_CUBE||(LA21_0 >= KW_CURRENT_DATE && LA21_0 <= KW_DATA)||(LA21_0 >= KW_DATABASES && LA21_0 <= KW_DISABLE)||(LA21_0 >= KW_DISTRIBUTE && LA21_0 <= KW_ELEM_TYPE)||LA21_0==KW_ENABLE||LA21_0==KW_ESCAPED||(LA21_0 >= KW_EXCLUSIVE && LA21_0 <= KW_EXPORT)||(LA21_0 >= KW_EXTERNAL && LA21_0 <= KW_FLOAT)||(LA21_0 >= KW_FOR && LA21_0 <= KW_FORMATTED)||LA21_0==KW_FULL||(LA21_0 >= KW_FUNCTIONS && LA21_0 <= KW_GROUPING)||(LA21_0 >= KW_HOUR && LA21_0 <= KW_IDXPROPERTIES)||(LA21_0 >= KW_IMPORT && LA21_0 <= KW_INTERSECT)||(LA21_0 >= KW_INTO && LA21_0 <= KW_JAR)||(LA21_0 >= KW_KEY && LA21_0 <= KW_LEFT)||(LA21_0 >= KW_LEVEL && LA21_0 <= KW_LONG)||(LA21_0 >= KW_MAPJOIN && LA21_0 <= KW_MONTH)||(LA21_0 >= KW_MSCK && LA21_0 <= KW_NOSCAN)||(LA21_0 >= KW_NOVALIDATE && LA21_0 <= KW_OFFSET)||LA21_0==KW_OPTION||(LA21_0 >= KW_ORDER && LA21_0 <= KW_OUTPUTFORMAT)||(LA21_0 >= KW_OVERWRITE && LA21_0 <= KW_OWNER)||(LA21_0 >= KW_PARTITION && LA21_0 <= KW_PLUS)||(LA21_0 >= KW_PRETTY && LA21_0 <= KW_RECORDWRITER)||(LA21_0 >= KW_REFERENCES && LA21_0 <= KW_ROLES)||(LA21_0 >= KW_ROLLUP && LA21_0 <= KW_SECOND)||(LA21_0 >= KW_SEMI && LA21_0 <= KW_SSL)||(LA21_0 >= KW_STATISTICS && LA21_0 <= KW_TABLES)||(LA21_0 >= KW_TBLPROPERTIES && LA21_0 <= KW_TERMINATED)||(LA21_0 >= KW_TIMESTAMP && LA21_0 <= KW_TRANSACTIONS)||(LA21_0 >= KW_TRIGGER && LA21_0 <= KW_UNARCHIVE)||(LA21_0 >= KW_UNDO && LA21_0 <= KW_UNIONTYPE)||(LA21_0 >= KW_UNLOCK && LA21_0 <= KW_VALUE_TYPE)||LA21_0==KW_VIEW||LA21_0==KW_WHILE||(LA21_0 >= KW_WITH && LA21_0 <= KW_YEAR)||LA21_0==KW_HOLD_DDLTIME||LA21_0==KW_IGNORE||LA21_0==KW_NO_DROP||LA21_0==KW_OFFLINE||LA21_0==KW_PROTECTION||LA21_0==KW_READONLY) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:145:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:145:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause854); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN58);

							// SelectClauseParser.g:145:22: ( aliasList | columnNameTypeList )
							int alt19=2;
							alt19 = dfa19.predict(input);
							switch (alt19) {
								case 1 :
									// SelectClauseParser.g:145:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause857);
									aliasList59=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList59.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:145:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause861);
									columnNameTypeList60=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList60.getTree());
									}
									break;

							}

							RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause864); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN61);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:145:65: ( aliasList | columnNameTypeList )
							int alt20=2;
							alt20 = dfa20.predict(input);
							switch (alt20) {
								case 1 :
									// SelectClauseParser.g:145:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause870);
									aliasList62=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList62.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:145:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause874);
									columnNameTypeList63=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList63.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause886);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_trfmClause890);
			outRec=gHiveParser.recordReader();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: outRec, StringLiteral, outSerde, columnNameTypeList, inSerde, inRec, aliasList, selectExpressionList
			// token labels: 
			// rule labels: inRec, outRec, inSerde, outSerde, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 147:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:147:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:147:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:147:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

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
	// $ANTLR end "trfmClause"


	public static class selectExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectExpression"
	// SelectClauseParser.g:150:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );
	public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope tableAllColumns64 =null;
		ParserRuleReturnScope expression65 =null;


		 gParent.pushMsg("select expression", state); 
		try {
			// SelectClauseParser.g:153:5: ( ( tableAllColumns )=> tableAllColumns | expression )
			int alt23=2;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// SelectClauseParser.g:154:5: ( tableAllColumns )=> tableAllColumns
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tableAllColumns_in_selectExpression959);
					tableAllColumns64=gHiveParser.tableAllColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableAllColumns64.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:156:5: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_selectExpression971);
					expression65=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression65.getTree());

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
	// $ANTLR end "selectExpression"


	public static class selectExpressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selectExpressionList"
	// SelectClauseParser.g:159:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
	public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA67=null;
		ParserRuleReturnScope selectExpression66 =null;
		ParserRuleReturnScope selectExpression68 =null;

		CommonTree COMMA67_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");

		 gParent.pushMsg("select expression list", state); 
		try {
			// SelectClauseParser.g:162:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
			// SelectClauseParser.g:163:5: selectExpression ( COMMA selectExpression )*
			{
			pushFollow(FOLLOW_selectExpression_in_selectExpressionList1002);
			selectExpression66=selectExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression66.getTree());
			// SelectClauseParser.g:163:22: ( COMMA selectExpression )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// SelectClauseParser.g:163:23: COMMA selectExpression
					{
					COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList1005); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA67);

					pushFollow(FOLLOW_selectExpression_in_selectExpressionList1007);
					selectExpression68=selectExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression68.getTree());
					}
					break;

				default :
					break loop24;
				}
			}

			// AST REWRITE
			// elements: selectExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 163:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
			{
				// SelectClauseParser.g:163:51: ^( TOK_EXPLIST ( selectExpression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				if ( !(stream_selectExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_selectExpression.nextTree());
				}
				stream_selectExpression.reset();

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
	// $ANTLR end "selectExpressionList"


	public static class window_clause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_clause"
	// SelectClauseParser.g:167:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
	public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
		HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_WINDOW69=null;
		Token COMMA71=null;
		ParserRuleReturnScope window_defn70 =null;
		ParserRuleReturnScope window_defn72 =null;

		CommonTree KW_WINDOW69_tree=null;
		CommonTree COMMA71_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
		RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");

		 gParent.pushMsg("window_clause", state); 
		try {
			// SelectClauseParser.g:170:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
			// SelectClauseParser.g:171:3: KW_WINDOW window_defn ( COMMA window_defn )*
			{
			KW_WINDOW69=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause1046); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WINDOW.add(KW_WINDOW69);

			pushFollow(FOLLOW_window_defn_in_window_clause1048);
			window_defn70=window_defn();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_window_defn.add(window_defn70.getTree());
			// SelectClauseParser.g:171:25: ( COMMA window_defn )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// SelectClauseParser.g:171:26: COMMA window_defn
					{
					COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause1051); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);

					pushFollow(FOLLOW_window_defn_in_window_clause1053);
					window_defn72=window_defn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_defn.add(window_defn72.getTree());
					}
					break;

				default :
					break loop25;
				}
			}

			// AST REWRITE
			// elements: KW_WINDOW, window_defn
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 171:46: -> ^( KW_WINDOW ( window_defn )+ )
			{
				// SelectClauseParser.g:171:49: ^( KW_WINDOW ( window_defn )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_WINDOW.nextNode(), root_1);
				if ( !(stream_window_defn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_window_defn.hasNext() ) {
					adaptor.addChild(root_1, stream_window_defn.nextTree());
				}
				stream_window_defn.reset();

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
	// $ANTLR end "window_clause"


	public static class window_defn_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_defn"
	// SelectClauseParser.g:174:1: window_defn : identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) ;
	public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
		HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_AS74=null;
		ParserRuleReturnScope identifier73 =null;
		ParserRuleReturnScope window_specification75 =null;

		CommonTree KW_AS74_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");

		 gParent.pushMsg("window_defn", state); 
		try {
			// SelectClauseParser.g:177:3: ( identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) )
			// SelectClauseParser.g:178:3: identifier KW_AS window_specification
			{
			pushFollow(FOLLOW_identifier_in_window_defn1089);
			identifier73=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier73.getTree());
			KW_AS74=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn1091); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS74);

			pushFollow(FOLLOW_window_specification_in_window_defn1093);
			window_specification75=window_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_window_specification.add(window_specification75.getTree());
			// AST REWRITE
			// elements: window_specification, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 178:41: -> ^( TOK_WINDOWDEF identifier window_specification )
			{
				// SelectClauseParser.g:178:44: ^( TOK_WINDOWDEF identifier window_specification )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWDEF, "TOK_WINDOWDEF"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_window_specification.nextTree());
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
	// $ANTLR end "window_defn"


	public static class window_specification_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_specification"
	// SelectClauseParser.g:181:1: window_specification : ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) ;
	public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
		HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN77=null;
		Token RPAREN81=null;
		ParserRuleReturnScope identifier76 =null;
		ParserRuleReturnScope identifier78 =null;
		ParserRuleReturnScope partitioningSpec79 =null;
		ParserRuleReturnScope window_frame80 =null;

		CommonTree LPAREN77_tree=null;
		CommonTree RPAREN81_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
		RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");

		 gParent.pushMsg("window_specification", state); 
		try {
			// SelectClauseParser.g:184:3: ( ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) )
			// SelectClauseParser.g:185:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			{
			// SelectClauseParser.g:185:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= Identifier && LA29_0 <= KW_ANALYZE)||(LA29_0 >= KW_ARCHIVE && LA29_0 <= KW_BY)||LA29_0==KW_CASCADE||LA29_0==KW_CHANGE||(LA29_0 >= KW_CLUSTER && LA29_0 <= KW_COLLECTION)||(LA29_0 >= KW_COLUMNS && LA29_0 <= KW_COMMENT)||(LA29_0 >= KW_COMPACT && LA29_0 <= KW_CONCATENATE)||(LA29_0 >= KW_CONSTRAINT && LA29_0 <= KW_CREATE)||LA29_0==KW_CUBE||(LA29_0 >= KW_CURRENT_DATE && LA29_0 <= KW_DATA)||(LA29_0 >= KW_DATABASES && LA29_0 <= KW_DISABLE)||(LA29_0 >= KW_DISTRIBUTE && LA29_0 <= KW_ELEM_TYPE)||LA29_0==KW_ENABLE||LA29_0==KW_ESCAPED||(LA29_0 >= KW_EXCLUSIVE && LA29_0 <= KW_EXPORT)||(LA29_0 >= KW_EXTERNAL && LA29_0 <= KW_FLOAT)||(LA29_0 >= KW_FOR && LA29_0 <= KW_FORMATTED)||LA29_0==KW_FULL||(LA29_0 >= KW_FUNCTIONS && LA29_0 <= KW_GROUPING)||(LA29_0 >= KW_HOUR && LA29_0 <= KW_IDXPROPERTIES)||(LA29_0 >= KW_IMPORT && LA29_0 <= KW_INTERSECT)||(LA29_0 >= KW_INTO && LA29_0 <= KW_JAR)||(LA29_0 >= KW_KEY && LA29_0 <= KW_LEFT)||(LA29_0 >= KW_LEVEL && LA29_0 <= KW_LONG)||(LA29_0 >= KW_MAPJOIN && LA29_0 <= KW_MONTH)||(LA29_0 >= KW_MSCK && LA29_0 <= KW_NOSCAN)||(LA29_0 >= KW_NOVALIDATE && LA29_0 <= KW_OFFSET)||LA29_0==KW_OPTION||(LA29_0 >= KW_ORDER && LA29_0 <= KW_OUTPUTFORMAT)||(LA29_0 >= KW_OVERWRITE && LA29_0 <= KW_OWNER)||(LA29_0 >= KW_PARTITION && LA29_0 <= KW_PLUS)||(LA29_0 >= KW_PRETTY && LA29_0 <= KW_RECORDWRITER)||(LA29_0 >= KW_REFERENCES && LA29_0 <= KW_ROLES)||(LA29_0 >= KW_ROLLUP && LA29_0 <= KW_SECOND)||(LA29_0 >= KW_SEMI && LA29_0 <= KW_SSL)||(LA29_0 >= KW_STATISTICS && LA29_0 <= KW_TABLES)||(LA29_0 >= KW_TBLPROPERTIES && LA29_0 <= KW_TERMINATED)||(LA29_0 >= KW_TIMESTAMP && LA29_0 <= KW_TRANSACTIONS)||(LA29_0 >= KW_TRIGGER && LA29_0 <= KW_UNARCHIVE)||(LA29_0 >= KW_UNDO && LA29_0 <= KW_UNIONTYPE)||(LA29_0 >= KW_UNLOCK && LA29_0 <= KW_VALUE_TYPE)||LA29_0==KW_VIEW||LA29_0==KW_WHILE||(LA29_0 >= KW_WITH && LA29_0 <= KW_YEAR)||LA29_0==KW_HOLD_DDLTIME||LA29_0==KW_IGNORE||LA29_0==KW_NO_DROP||LA29_0==KW_OFFLINE||LA29_0==KW_PROTECTION||LA29_0==KW_READONLY) ) {
				alt29=1;
			}
			else if ( (LA29_0==LPAREN) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// SelectClauseParser.g:185:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_window_specification1129);
					identifier76=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier76.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:185:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					{
					// SelectClauseParser.g:185:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					// SelectClauseParser.g:185:19: LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
					{
					LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification1135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN77);

					// SelectClauseParser.g:185:26: ( identifier )?
					int alt26=2;
					alt26 = dfa26.predict(input);
					switch (alt26) {
						case 1 :
							// SelectClauseParser.g:185:26: identifier
							{
							pushFollow(FOLLOW_identifier_in_window_specification1137);
							identifier78=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier78.getTree());
							}
							break;

					}

					// SelectClauseParser.g:185:38: ( partitioningSpec )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==KW_CLUSTER||LA27_0==KW_DISTRIBUTE||LA27_0==KW_ORDER||LA27_0==KW_PARTITION||LA27_0==KW_SORT) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// SelectClauseParser.g:185:38: partitioningSpec
							{
							pushFollow(FOLLOW_partitioningSpec_in_window_specification1140);
							partitioningSpec79=gHiveParser.partitioningSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_partitioningSpec.add(partitioningSpec79.getTree());
							}
							break;

					}

					// SelectClauseParser.g:185:56: ( window_frame )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==KW_RANGE||LA28_0==KW_ROWS) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// SelectClauseParser.g:185:56: window_frame
							{
							pushFollow(FOLLOW_window_frame_in_window_specification1143);
							window_frame80=window_frame();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_window_frame.add(window_frame80.getTree());
							}
							break;

					}

					RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification1146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: identifier, window_frame, partitioningSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 185:79: -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
			{
				// SelectClauseParser.g:185:82: ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC"), root_1);
				// SelectClauseParser.g:185:99: ( identifier )?
				if ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				// SelectClauseParser.g:185:111: ( partitioningSpec )?
				if ( stream_partitioningSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitioningSpec.nextTree());
				}
				stream_partitioningSpec.reset();

				// SelectClauseParser.g:185:129: ( window_frame )?
				if ( stream_window_frame.hasNext() ) {
					adaptor.addChild(root_1, stream_window_frame.nextTree());
				}
				stream_window_frame.reset();

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
	// $ANTLR end "window_specification"


	public static class window_frame_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame"
	// SelectClauseParser.g:188:1: window_frame : ( window_range_expression | window_value_expression );
	public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope window_range_expression82 =null;
		ParserRuleReturnScope window_value_expression83 =null;


		try {
			// SelectClauseParser.g:188:14: ( window_range_expression | window_value_expression )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==KW_ROWS) ) {
				alt30=1;
			}
			else if ( (LA30_0==KW_RANGE) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// SelectClauseParser.g:189:2: window_range_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_range_expression_in_window_frame1173);
					window_range_expression82=window_range_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, window_range_expression82.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:190:2: window_value_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_window_value_expression_in_window_frame1178);
					window_value_expression83=window_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, window_value_expression83.getTree());

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
	// $ANTLR end "window_frame"


	public static class window_range_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_range_expression"
	// SelectClauseParser.g:193:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
	public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_ROWS84=null;
		Token KW_ROWS85=null;
		Token KW_BETWEEN86=null;
		Token KW_AND87=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_ROWS84_tree=null;
		CommonTree KW_ROWS85_tree=null;
		CommonTree KW_BETWEEN86_tree=null;
		CommonTree KW_AND87_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");

		 gParent.pushMsg("window_range_expression", state); 
		try {
			// SelectClauseParser.g:196:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==KW_ROWS) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==KW_BETWEEN) ) {
					alt31=2;
				}
				else if ( (LA31_1==KW_CURRENT||LA31_1==KW_UNBOUNDED||LA31_1==Number) ) {
					alt31=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// SelectClauseParser.g:197:2: KW_ROWS sb= window_frame_start_boundary
					{
					KW_ROWS84=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1200); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS84);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression1204);
					sb=window_frame_start_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 197:41: -> ^( TOK_WINDOWRANGE $sb)
					{
						// SelectClauseParser.g:197:44: ^( TOK_WINDOWRANGE $sb)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:198:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_ROWS85=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression1218); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS85);

					KW_BETWEEN86=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression1220); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN86);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1224);
					s=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());
					KW_AND87=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression1226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND87);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression1230);
					end=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: s, end
					// token labels: 
					// rule labels: s, end, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 198:78: -> ^( TOK_WINDOWRANGE $s $end)
					{
						// SelectClauseParser.g:198:81: ^( TOK_WINDOWRANGE $s $end)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
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
	// $ANTLR end "window_range_expression"


	public static class window_value_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_value_expression"
	// SelectClauseParser.g:201:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
	public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_RANGE88=null;
		Token KW_RANGE89=null;
		Token KW_BETWEEN90=null;
		Token KW_AND91=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		CommonTree KW_RANGE88_tree=null;
		CommonTree KW_RANGE89_tree=null;
		CommonTree KW_BETWEEN90_tree=null;
		CommonTree KW_AND91_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");

		 gParent.pushMsg("window_value_expression", state); 
		try {
			// SelectClauseParser.g:204:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==KW_RANGE) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==KW_BETWEEN) ) {
					alt32=2;
				}
				else if ( (LA32_1==KW_CURRENT||LA32_1==KW_UNBOUNDED||LA32_1==Number) ) {
					alt32=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// SelectClauseParser.g:205:2: KW_RANGE sb= window_frame_start_boundary
					{
					KW_RANGE88=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1264); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE88);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression1268);
					sb=window_frame_start_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 205:42: -> ^( TOK_WINDOWVALUES $sb)
					{
						// SelectClauseParser.g:205:45: ^( TOK_WINDOWVALUES $sb)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:206:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_RANGE89=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1282); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE89);

					KW_BETWEEN90=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN90);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1288);
					s=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());
					KW_AND91=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1290); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND91);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1294);
					end=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: end, s
					// token labels: 
					// rule labels: s, end, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 206:79: -> ^( TOK_WINDOWVALUES $s $end)
					{
						// SelectClauseParser.g:206:82: ^( TOK_WINDOWVALUES $s $end)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
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
	// $ANTLR end "window_value_expression"


	public static class window_frame_start_boundary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame_start_boundary"
	// SelectClauseParser.g:209:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
	public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KW_UNBOUNDED92=null;
		Token KW_PRECEDING93=null;
		Token KW_CURRENT94=null;
		Token KW_ROW95=null;
		Token Number96=null;
		Token KW_PRECEDING97=null;

		CommonTree KW_UNBOUNDED92_tree=null;
		CommonTree KW_PRECEDING93_tree=null;
		CommonTree KW_CURRENT94_tree=null;
		CommonTree KW_ROW95_tree=null;
		CommonTree Number96_tree=null;
		CommonTree KW_PRECEDING97_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

		 gParent.pushMsg("windowframestartboundary", state); 
		try {
			// SelectClauseParser.g:212:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
			int alt33=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt33=1;
				}
				break;
			case KW_CURRENT:
				{
				alt33=2;
				}
				break;
			case Number:
				{
				alt33=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// SelectClauseParser.g:213:3: KW_UNBOUNDED KW_PRECEDING
					{
					KW_UNBOUNDED92=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1329); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED92);

					KW_PRECEDING93=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1331); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING93);

					// AST REWRITE
					// elements: KW_PRECEDING, KW_UNBOUNDED
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 213:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
					{
						// SelectClauseParser.g:213:33: ^( KW_PRECEDING KW_UNBOUNDED )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:214:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT94=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT94);

					KW_ROW95=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW95);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 214:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:214:25: ^( KW_CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// SelectClauseParser.g:215:3: Number KW_PRECEDING
					{
					Number96=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(Number96);

					KW_PRECEDING97=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING97);

					// AST REWRITE
					// elements: KW_PRECEDING, Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 215:23: -> ^( KW_PRECEDING Number )
					{
						// SelectClauseParser.g:215:26: ^( KW_PRECEDING Number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
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
	// $ANTLR end "window_frame_start_boundary"


	public static class window_frame_boundary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "window_frame_boundary"
	// SelectClauseParser.g:218:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
	public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token r=null;
		Token d=null;
		Token KW_UNBOUNDED98=null;
		Token KW_CURRENT99=null;
		Token KW_ROW100=null;
		Token Number101=null;

		CommonTree r_tree=null;
		CommonTree d_tree=null;
		CommonTree KW_UNBOUNDED98_tree=null;
		CommonTree KW_CURRENT99_tree=null;
		CommonTree KW_ROW100_tree=null;
		CommonTree Number101_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

		 gParent.pushMsg("windowframeboundary", state); 
		try {
			// SelectClauseParser.g:221:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
			int alt36=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt36=1;
				}
				break;
			case KW_CURRENT:
				{
				alt36=2;
				}
				break;
			case Number:
				{
				alt36=3;
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
					// SelectClauseParser.g:222:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
					{
					KW_UNBOUNDED98=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED98);

					// SelectClauseParser.g:222:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==KW_PRECEDING) ) {
						alt34=1;
					}
					else if ( (LA34_0==KW_FOLLOWING) ) {
						alt34=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// SelectClauseParser.g:222:17: r= KW_PRECEDING
							{
							r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1400); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PRECEDING.add(r);

							}
							break;
						case 2 :
							// SelectClauseParser.g:222:32: r= KW_FOLLOWING
							{
							r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1404); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: r, KW_UNBOUNDED
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 222:49: -> ^( $r KW_UNBOUNDED )
					{
						// SelectClauseParser.g:222:52: ^( $r KW_UNBOUNDED )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:223:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT99=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT99);

					KW_ROW100=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1424); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW100);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 223:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:223:25: ^( KW_CURRENT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// SelectClauseParser.g:224:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
					{
					Number101=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(Number101);

					// SelectClauseParser.g:224:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==KW_PRECEDING) ) {
						alt35=1;
					}
					else if ( (LA35_0==KW_FOLLOWING) ) {
						alt35=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// SelectClauseParser.g:224:11: d= KW_PRECEDING
							{
							d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1442); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PRECEDING.add(d);

							}
							break;
						case 2 :
							// SelectClauseParser.g:224:28: d= KW_FOLLOWING
							{
							d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1448); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(d);

							}
							break;

					}

					// AST REWRITE
					// elements: Number, d
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 224:45: -> ^( $d Number )
					{
						// SelectClauseParser.g:224:48: ^( $d Number )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_d.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
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
	// $ANTLR end "window_frame_boundary"

	// $ANTLR start synpred1_SelectClauseParser
	public final void synpred1_SelectClauseParser_fragment() throws RecognitionException {
		// SelectClauseParser.g:130:5: ( tableAllColumns )
		// SelectClauseParser.g:130:6: tableAllColumns
		{
		pushFollow(FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser689);
		gHiveParser.tableAllColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_SelectClauseParser

	// $ANTLR start synpred2_SelectClauseParser
	public final void synpred2_SelectClauseParser_fragment() throws RecognitionException {
		// SelectClauseParser.g:154:5: ( tableAllColumns )
		// SelectClauseParser.g:154:6: tableAllColumns
		{
		pushFollow(FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser954);
		gHiveParser.tableAllColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_SelectClauseParser

	// Delegated rules

	public final boolean synpred2_SelectClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_SelectClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_SelectClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_SelectClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA26 dfa26 = new DFA26(this);
	static final String DFA2_eotS =
		"\u062d\uffff";
	static final String DFA2_eofS =
		"\1\uffff\1\3\36\uffff\1\50\u060c\uffff";
	static final String DFA2_minS =
		"\1\7\1\4\36\uffff\1\7\3\0\3\7\1\0\1\uffff\4\0\7\uffff\2\0\2\uffff\2\0"+
		"\1\7\2\0\3\uffff\1\0\5\uffff\1\0\7\uffff\2\0\2\uffff\1\0\3\uffff\1\0\1"+
		"\uffff\4\0\1\uffff\2\0\1\uffff\2\0\7\uffff\1\0\1\uffff\4\0\1\uffff\2\0"+
		"\1\uffff\2\0\1\uffff\1\0\u00a2\uffff\2\0\32\uffff\1\0\2\uffff\34\0\3\uffff"+
		"\32\0\u0198\uffff\1\0\u0323\uffff";
	static final String DFA2_maxS =
		"\2\u0216\36\uffff\1\u0216\3\0\3\u0216\1\0\1\uffff\4\0\7\uffff\2\0\2\uffff"+
		"\2\0\1\u0216\2\0\3\uffff\1\0\5\uffff\1\0\7\uffff\2\0\2\uffff\1\0\3\uffff"+
		"\1\0\1\uffff\4\0\1\uffff\2\0\1\uffff\2\0\7\uffff\1\0\1\uffff\4\0\1\uffff"+
		"\2\0\1\uffff\2\0\1\uffff\1\0\u00a2\uffff\2\0\32\uffff\1\0\2\uffff\34\0"+
		"\3\uffff\32\0\u0198\uffff\1\0\u0323\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\1\3\44\uffff\1\1\u0604\uffff";
	static final String DFA2_specialS =
		"\41\uffff\1\0\1\1\1\2\3\uffff\1\3\1\uffff\1\4\1\5\1\6\1\7\7\uffff\1\10"+
		"\1\11\2\uffff\1\12\1\13\1\uffff\1\14\1\15\3\uffff\1\16\5\uffff\1\17\7"+
		"\uffff\1\20\1\21\2\uffff\1\22\3\uffff\1\23\1\uffff\1\24\1\25\1\26\1\27"+
		"\1\uffff\1\30\1\31\1\uffff\1\32\1\33\7\uffff\1\34\1\uffff\1\35\1\36\1"+
		"\37\1\40\1\uffff\1\41\1\42\1\uffff\1\43\1\44\1\uffff\1\45\u00a2\uffff"+
		"\1\46\1\47\32\uffff\1\50\2\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
		"\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1"+
		"\76\1\77\1\100\1\101\1\102\1\103\1\104\3\uffff\1\105\1\106\1\107\1\110"+
		"\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124"+
		"\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\u0198\uffff"+
		"\1\137\u0323\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\5\3\1\1\2\3\1\uffff\17\3\1\uffff"+
			"\4\3\1\uffff\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3\1\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\20\3\1\2\4\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
			"\10\3\1\uffff\4\3\1\uffff\1\3\1\uffff\4\3\1\uffff\24\3\1\uffff\6\3\1"+
			"\uffff\13\3\1\uffff\7\3\1\uffff\12\3\2\uffff\1\3\1\uffff\5\3\1\uffff"+
			"\2\3\1\uffff\5\3\2\uffff\13\3\1\uffff\17\3\1\uffff\6\3\1\uffff\17\3\1"+
			"\uffff\7\3\1\uffff\3\3\1\uffff\6\3\1\uffff\4\3\1\uffff\3\3\1\uffff\15"+
			"\3\1\uffff\1\3\2\uffff\1\3\1\uffff\4\3\3\uffff\1\3\2\uffff\1\3\2\uffff"+
			"\2\3\7\uffff\5\3\162\uffff\1\3\3\uffff\1\3\60\uffff\1\3\3\uffff\1\3\27"+
			"\uffff\1\3\3\uffff\1\3",
			"\3\3\1\50\2\uffff\1\3\2\uffff\1\50\2\3\1\uffff\1\3\1\50\1\uffff\2\3"+
			"\1\uffff\2\3\1\uffff\1\41\4\135\2\141\1\135\1\3\1\135\1\65\1\117\1\135"+
			"\1\141\2\135\1\116\3\71\1\141\2\135\1\141\1\uffff\1\135\2\50\1\135\1"+
			"\uffff\1\70\3\135\1\uffff\2\135\1\uffff\4\135\1\uffff\1\141\1\135\1\141"+
			"\1\uffff\1\141\1\uffff\1\51\1\53\1\141\1\135\1\uffff\1\135\1\47\3\135"+
			"\1\141\2\135\1\141\3\135\1\141\3\135\1\uffff\1\131\1\71\1\141\1\135\1"+
			"\uffff\1\135\1\uffff\1\135\1\uffff\1\135\1\73\2\135\1\uffff\1\141\1\64"+
			"\1\141\4\135\1\71\1\uffff\2\141\2\135\1\3\1\141\1\uffff\1\135\1\141\1"+
			"\122\1\141\1\3\2\135\1\50\1\141\1\106\2\135\1\141\3\135\1\140\1\71\1"+
			"\141\1\50\1\141\1\74\3\135\1\uffff\4\135\1\136\1\141\1\uffff\1\135\1"+
			"\100\1\133\2\135\1\141\5\135\1\uffff\1\72\6\135\1\uffff\1\135\1\141\2"+
			"\135\1\44\1\135\1\43\1\135\1\141\1\135\2\uffff\1\135\1\3\1\126\2\141"+
			"\2\135\1\uffff\2\135\1\uffff\1\141\2\135\1\141\1\135\2\uffff\1\135\1"+
			"\141\1\135\1\141\1\135\1\141\1\135\1\141\3\135\1\3\1\141\1\100\7\135"+
			"\1\141\1\135\1\141\1\100\2\135\1\uffff\3\141\3\135\1\3\4\135\1\141\5"+
			"\135\1\71\1\135\1\132\2\135\1\uffff\4\135\1\42\1\141\1\135\1\uffff\3"+
			"\135\1\uffff\1\52\1\135\1\141\3\135\1\uffff\1\141\1\54\1\141\1\135\1"+
			"\uffff\1\135\1\130\1\42\1\uffff\3\135\1\141\2\135\2\141\3\135\1\141\1"+
			"\135\1\uffff\1\135\1\uffff\1\3\1\135\1\3\1\141\3\135\1\uffff\2\3\1\45"+
			"\1\3\1\uffff\1\46\2\3\1\50\1\46\3\uffff\1\3\3\uffff\1\40\4\50\162\uffff"+
			"\1\135\3\uffff\1\135\60\uffff\1\135\3\uffff\1\135\27\uffff\1\135\3\uffff"+
			"\1\135",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\2\uffff\1\50\2\uffff\1\3\4\uffff\1\3\7\uffff\10\3\1\uffff\17\3"+
			"\1\uffff\4\3\1\uffff\1\154\3\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3\1"+
			"\uffff\1\3\1\uffff\4\3\1\uffff\20\3\1\uffff\1\155\3\3\1\uffff\1\3\1\uffff"+
			"\1\3\1\uffff\4\3\1\uffff\10\3\1\uffff\4\3\1\50\1\3\1\uffff\2\3\1\151"+
			"\1\3\1\50\13\3\1\164\10\3\1\uffff\4\3\1\163\1\3\1\uffff\2\3\1\160\10"+
			"\3\1\uffff\1\166\6\3\1\uffff\4\3\1\uffff\5\3\2\uffff\1\3\1\uffff\1\153"+
			"\4\3\1\uffff\2\3\1\uffff\5\3\2\uffff\13\3\1\50\17\3\1\uffff\6\3\1\50"+
			"\14\3\1\156\2\3\1\uffff\7\3\1\uffff\3\3\1\uffff\6\3\1\uffff\4\3\1\uffff"+
			"\1\3\1\161\1\3\1\uffff\15\3\1\uffff\1\3\1\uffff\1\50\1\3\1\50\4\3\3\uffff"+
			"\1\3\2\uffff\1\3\2\uffff\2\3\3\uffff\1\50\4\uffff\4\3\162\uffff\1\3\3"+
			"\uffff\1\3\60\uffff\1\3\3\uffff\1\3\27\uffff\1\3\3\uffff\1\3",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\50\5\uffff\1\50\4\uffff\1\50\7\uffff\10\50\1\uffff\7\50\1\u011a\7"+
			"\50\1\uffff\4\50\1\uffff\4\50\1\uffff\2\50\1\uffff\4\50\1\uffff\3\50"+
			"\1\uffff\1\50\1\uffff\4\50\1\uffff\20\50\1\uffff\4\50\1\uffff\1\50\1"+
			"\uffff\1\50\1\uffff\4\50\1\uffff\10\50\1\uffff\4\50\1\uffff\1\50\1\uffff"+
			"\4\50\1\uffff\4\50\1\u0119\17\50\1\uffff\6\50\1\uffff\1\50\1\u0135\11"+
			"\50\1\uffff\7\50\1\uffff\12\50\2\uffff\1\50\1\uffff\5\50\1\uffff\2\50"+
			"\1\uffff\5\50\2\uffff\13\50\1\uffff\1\50\1\u0135\12\50\1\u0135\2\50\1"+
			"\uffff\6\50\1\uffff\17\50\1\uffff\7\50\1\uffff\3\50\1\uffff\6\50\1\uffff"+
			"\4\50\1\uffff\3\50\1\uffff\15\50\1\uffff\1\50\2\uffff\1\50\1\uffff\4"+
			"\50\3\uffff\1\50\2\uffff\1\50\2\uffff\2\50\10\uffff\4\50\162\uffff\1"+
			"\50\3\uffff\1\50\60\uffff\1\50\3\uffff\1\50\27\uffff\1\50\3\uffff\1\50",
			"\1\u0141\5\uffff\1\u0145\4\uffff\1\u0144\7\uffff\1\u014b\4\u014d\2\u0153"+
			"\1\u014d\1\uffff\1\u014d\1\u014c\1\u0153\1\u014d\1\u0153\2\u014d\1\u0153"+
			"\3\u014f\1\u0153\2\u014d\1\u0153\1\uffff\1\u014d\1\u0149\1\u0148\1\u014d"+
			"\1\uffff\4\u014d\1\uffff\2\u014d\1\uffff\4\u014d\1\uffff\1\u0153\1\u014d"+
			"\1\u0153\1\uffff\1\u0153\1\uffff\1\u013c\1\u013e\1\u0153\1\u014d\1\uffff"+
			"\1\u014d\1\u013b\3\u014d\1\u0153\2\u014d\1\u0153\3\u014d\1\u0153\3\u014d"+
			"\1\3\1\u014d\1\u014f\1\u0153\1\u014d\1\uffff\1\u014d\1\uffff\1\u014d"+
			"\1\uffff\1\u014d\1\u0150\2\u014d\1\uffff\1\u0153\1\u0147\1\u0153\4\u014d"+
			"\1\u014f\1\uffff\2\u0153\2\u014d\1\uffff\1\u0153\1\uffff\1\u014d\3\u0153"+
			"\1\uffff\2\u014d\1\u014e\2\u0153\2\u014d\1\u0153\3\u014d\1\u0153\1\u014f"+
			"\1\u0153\1\u013f\2\u0153\3\u014d\1\uffff\4\u014d\2\u0153\1\uffff\1\u014d"+
			"\1\u0153\3\u014d\1\u0153\5\u014d\1\uffff\1\u014e\6\u014d\1\uffff\1\u014d"+
			"\1\u0153\2\u014d\1\u0152\1\u014d\1\u0139\1\u014d\1\u0153\1\u014d\2\uffff"+
			"\1\u014d\1\uffff\3\u0153\2\u014d\1\uffff\2\u014d\1\uffff\1\u0153\2\u014d"+
			"\1\u0153\1\u014d\2\uffff\1\u014d\1\u0153\1\u014d\1\u0153\1\u014d\1\u0153"+
			"\1\u014d\1\u0153\3\u014d\1\uffff\2\u0153\7\u014d\1\u0153\1\u014d\2\u0153"+
			"\2\u014d\1\uffff\3\u0153\3\u014d\1\uffff\4\u014d\1\u0153\5\u014d\1\u014f"+
			"\4\u014d\1\uffff\4\u014d\1\u014a\1\u0153\1\u014d\1\uffff\3\u014d\1\uffff"+
			"\1\u013d\1\u014d\1\u0153\3\u014d\1\uffff\1\u0153\1\u0146\1\u0153\1\u014d"+
			"\1\uffff\1\u014d\1\u0153\1\u014a\1\uffff\3\u014d\1\u0153\2\u014d\2\u0153"+
			"\3\u014d\1\u0153\1\u014d\1\uffff\1\u014d\2\uffff\1\u014d\1\uffff\1\u0153"+
			"\3\u014d\3\uffff\1\u0151\2\uffff\1\u0138\2\uffff\1\u013a\1\u0138\3\uffff"+
			"\1\3\3\uffff\1\3\1\u0142\1\u0140\1\u0138\1\u0143\162\uffff\1\u014d\3"+
			"\uffff\1\u014d\60\uffff\1\u014d\3\uffff\1\u014d\27\uffff\1\u014d\3\uffff"+
			"\1\u014d",
			"\1\u015f\5\uffff\1\u0163\4\uffff\1\u0162\7\uffff\1\u0169\4\u016b\2\u016e"+
			"\1\u016b\1\uffff\1\u016b\1\u016a\1\u016e\1\u016b\1\u016e\2\u016b\1\u016e"+
			"\3\u016d\1\u016e\2\u016b\1\u016e\1\uffff\1\u016b\1\u0167\1\u0166\1\u016b"+
			"\1\uffff\4\u016b\1\uffff\2\u016b\1\uffff\4\u016b\1\uffff\1\u016e\1\u016b"+
			"\1\u016e\1\uffff\1\u016e\1\uffff\1\u015a\1\u015c\1\u016e\1\u016b\1\uffff"+
			"\1\u016b\1\u0159\3\u016b\1\u016e\2\u016b\1\u016e\3\u016b\1\u016e\3\u016b"+
			"\1\uffff\1\u016b\1\u016d\1\u016e\1\u016b\1\uffff\1\u016b\1\uffff\1\u016b"+
			"\1\uffff\1\u016b\1\u016e\2\u016b\1\uffff\1\u016e\1\u0165\1\u016e\4\u016b"+
			"\1\u016d\1\uffff\2\u016e\2\u016b\1\uffff\1\u016e\1\uffff\1\u016b\3\u016e"+
			"\1\uffff\2\u016b\1\u016c\2\u016e\2\u016b\1\u016e\3\u016b\1\u016e\1\u016d"+
			"\1\u016e\1\u015d\2\u016e\3\u016b\1\uffff\4\u016b\2\u016e\1\uffff\1\u016b"+
			"\1\u016e\3\u016b\1\u016e\5\u016b\1\uffff\1\u016c\6\u016b\1\uffff\1\u016b"+
			"\1\u016e\2\u016b\1\uffff\1\u016b\1\u0157\1\u016b\1\u016e\1\u016b\2\uffff"+
			"\1\u016b\1\uffff\3\u016e\2\u016b\1\uffff\2\u016b\1\uffff\1\u016e\2\u016b"+
			"\1\u016e\1\u016b\2\uffff\1\u016b\1\u016e\1\u016b\1\u016e\1\u016b\1\u016e"+
			"\1\u016b\1\u016e\3\u016b\1\uffff\2\u016e\7\u016b\1\u016e\1\u016b\2\u016e"+
			"\2\u016b\1\uffff\3\u016e\3\u016b\1\uffff\4\u016b\1\u016e\5\u016b\1\u016d"+
			"\4\u016b\1\uffff\4\u016b\1\u0168\1\u016e\1\u016b\1\uffff\3\u016b\1\uffff"+
			"\1\u015b\1\u016b\1\u016e\3\u016b\1\uffff\1\u016e\1\u0164\1\u016e\1\u016b"+
			"\1\uffff\1\u016b\1\u016e\1\u0168\1\uffff\3\u016b\1\u016e\2\u016b\2\u016e"+
			"\3\u016b\1\u016e\1\u016b\1\uffff\1\u016b\2\uffff\1\u016b\1\uffff\1\u016e"+
			"\3\u016b\3\uffff\1\u016f\2\uffff\1\u0170\2\uffff\1\u0158\1\u0170\10\uffff"+
			"\1\u0160\1\u015e\1\u0170\1\u0161\162\uffff\1\u016b\3\uffff\1\u016b\60"+
			"\uffff\1\u016b\3\uffff\1\u016b\27\uffff\1\u016b\3\uffff\1\u016b",
			"\1\uffff",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\3\5\uffff\1\3\4\uffff\1\3\7\uffff\10\3\1\uffff\17\3\1\uffff\4\3\1"+
			"\uffff\4\3\1\uffff\2\3\1\uffff\4\3\1\uffff\3\3\1\uffff\1\3\1\uffff\4"+
			"\3\1\uffff\20\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\1\uffff\4\3\1\uffff"+
			"\10\3\1\uffff\4\3\1\uffff\1\3\1\uffff\4\3\1\uffff\24\3\1\uffff\6\3\1"+
			"\uffff\13\3\1\uffff\7\3\1\uffff\12\3\2\uffff\1\3\1\uffff\5\3\1\uffff"+
			"\2\3\1\uffff\5\3\2\uffff\13\3\1\uffff\17\3\1\uffff\6\3\1\uffff\17\3\1"+
			"\uffff\7\3\1\uffff\3\3\1\uffff\6\3\1\uffff\4\3\1\uffff\3\3\1\uffff\15"+
			"\3\1\uffff\1\3\2\uffff\1\3\1\uffff\4\3\3\uffff\1\u0309\2\uffff\1\3\2"+
			"\uffff\2\3\7\uffff\5\3\162\uffff\1\3\3\uffff\1\3\60\uffff\1\3\3\uffff"+
			"\1\3\27\uffff\1\3\3\uffff\1\3",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
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
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "55:29: ( KW_ALL |dist= KW_DISTINCT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA2_33 = input.LA(1);
						 
						int index2_33 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_33);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA2_34 = input.LA(1);
						 
						int index2_34 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_34);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA2_35 = input.LA(1);
						 
						int index2_35 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_35);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA2_39 = input.LA(1);
						 
						int index2_39 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_39);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA2_41 = input.LA(1);
						 
						int index2_41 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_41);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA2_42 = input.LA(1);
						 
						int index2_42 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_42);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA2_43 = input.LA(1);
						 
						int index2_43 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_43);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA2_44 = input.LA(1);
						 
						int index2_44 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_44);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA2_52 = input.LA(1);
						 
						int index2_52 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_52);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA2_53 = input.LA(1);
						 
						int index2_53 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_53);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA2_56 = input.LA(1);
						 
						int index2_56 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_56);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA2_57 = input.LA(1);
						 
						int index2_57 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_57);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA2_59 = input.LA(1);
						 
						int index2_59 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_59);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA2_60 = input.LA(1);
						 
						int index2_60 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_60);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA2_64 = input.LA(1);
						 
						int index2_64 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_64);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA2_70 = input.LA(1);
						 
						int index2_70 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_70);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA2_78 = input.LA(1);
						 
						int index2_78 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_78);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA2_79 = input.LA(1);
						 
						int index2_79 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_79);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA2_82 = input.LA(1);
						 
						int index2_82 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_82);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA2_86 = input.LA(1);
						 
						int index2_86 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_86);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA2_88 = input.LA(1);
						 
						int index2_88 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_88);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA2_89 = input.LA(1);
						 
						int index2_89 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_89);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA2_90 = input.LA(1);
						 
						int index2_90 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_90);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA2_91 = input.LA(1);
						 
						int index2_91 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_91);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA2_93 = input.LA(1);
						 
						int index2_93 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_93);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA2_94 = input.LA(1);
						 
						int index2_94 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_94);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA2_96 = input.LA(1);
						 
						int index2_96 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_96);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA2_97 = input.LA(1);
						 
						int index2_97 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_97);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA2_105 = input.LA(1);
						 
						int index2_105 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_105);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA2_107 = input.LA(1);
						 
						int index2_107 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_107);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA2_108 = input.LA(1);
						 
						int index2_108 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_108);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA2_109 = input.LA(1);
						 
						int index2_109 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_109);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA2_110 = input.LA(1);
						 
						int index2_110 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_110);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA2_112 = input.LA(1);
						 
						int index2_112 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_112);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA2_113 = input.LA(1);
						 
						int index2_113 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_113);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA2_115 = input.LA(1);
						 
						int index2_115 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_115);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA2_116 = input.LA(1);
						 
						int index2_116 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_116);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA2_118 = input.LA(1);
						 
						int index2_118 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_118);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA2_281 = input.LA(1);
						 
						int index2_281 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_281);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA2_282 = input.LA(1);
						 
						int index2_282 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_282);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA2_309 = input.LA(1);
						 
						int index2_309 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_309);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA2_312 = input.LA(1);
						 
						int index2_312 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_312);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA2_313 = input.LA(1);
						 
						int index2_313 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_313);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA2_314 = input.LA(1);
						 
						int index2_314 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_314);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA2_315 = input.LA(1);
						 
						int index2_315 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_315);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA2_316 = input.LA(1);
						 
						int index2_316 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_316);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA2_317 = input.LA(1);
						 
						int index2_317 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_317);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA2_318 = input.LA(1);
						 
						int index2_318 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_318);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA2_319 = input.LA(1);
						 
						int index2_319 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_319);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA2_320 = input.LA(1);
						 
						int index2_320 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_320);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA2_321 = input.LA(1);
						 
						int index2_321 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_321);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA2_322 = input.LA(1);
						 
						int index2_322 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_322);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA2_323 = input.LA(1);
						 
						int index2_323 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_323);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA2_324 = input.LA(1);
						 
						int index2_324 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_324);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA2_325 = input.LA(1);
						 
						int index2_325 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_325);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA2_326 = input.LA(1);
						 
						int index2_326 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_326);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA2_327 = input.LA(1);
						 
						int index2_327 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_327);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA2_328 = input.LA(1);
						 
						int index2_328 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_328);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA2_329 = input.LA(1);
						 
						int index2_329 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_329);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA2_330 = input.LA(1);
						 
						int index2_330 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_330);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA2_331 = input.LA(1);
						 
						int index2_331 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_331);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA2_332 = input.LA(1);
						 
						int index2_332 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_332);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA2_333 = input.LA(1);
						 
						int index2_333 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_333);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA2_334 = input.LA(1);
						 
						int index2_334 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_334);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA2_335 = input.LA(1);
						 
						int index2_335 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_335);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA2_336 = input.LA(1);
						 
						int index2_336 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_336);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA2_337 = input.LA(1);
						 
						int index2_337 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_337);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA2_338 = input.LA(1);
						 
						int index2_338 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_338);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA2_339 = input.LA(1);
						 
						int index2_339 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_339);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA2_343 = input.LA(1);
						 
						int index2_343 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_343);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA2_344 = input.LA(1);
						 
						int index2_344 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_344);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA2_345 = input.LA(1);
						 
						int index2_345 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_345);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA2_346 = input.LA(1);
						 
						int index2_346 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_346);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA2_347 = input.LA(1);
						 
						int index2_347 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_347);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA2_348 = input.LA(1);
						 
						int index2_348 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_348);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA2_349 = input.LA(1);
						 
						int index2_349 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_349);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA2_350 = input.LA(1);
						 
						int index2_350 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_350);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA2_351 = input.LA(1);
						 
						int index2_351 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_351);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA2_352 = input.LA(1);
						 
						int index2_352 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_352);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA2_353 = input.LA(1);
						 
						int index2_353 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_353);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA2_354 = input.LA(1);
						 
						int index2_354 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_354);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA2_355 = input.LA(1);
						 
						int index2_355 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_355);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA2_356 = input.LA(1);
						 
						int index2_356 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_356);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA2_357 = input.LA(1);
						 
						int index2_357 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_357);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA2_358 = input.LA(1);
						 
						int index2_358 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_358);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA2_359 = input.LA(1);
						 
						int index2_359 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_359);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA2_360 = input.LA(1);
						 
						int index2_360 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_360);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA2_361 = input.LA(1);
						 
						int index2_361 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_361);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA2_362 = input.LA(1);
						 
						int index2_362 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_362);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA2_363 = input.LA(1);
						 
						int index2_363 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_363);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA2_364 = input.LA(1);
						 
						int index2_364 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_364);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA2_365 = input.LA(1);
						 
						int index2_365 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_365);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA2_366 = input.LA(1);
						 
						int index2_366 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_366);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA2_367 = input.LA(1);
						 
						int index2_367 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_367);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA2_368 = input.LA(1);
						 
						int index2_368 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_368);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA2_777 = input.LA(1);
						 
						int index2_777 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 40;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 3;}
						 
						input.seek(index2_777);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 2, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA6_eotS =
		"\103\uffff";
	static final String DFA6_eofS =
		"\103\uffff";
	static final String DFA6_minS =
		"\1\32\3\12\77\uffff";
	static final String DFA6_maxS =
		"\1\u0216\3\u0146\77\uffff";
	static final String DFA6_acceptS =
		"\4\uffff\1\1\1\uffff\1\2\74\uffff";
	static final String DFA6_specialS =
		"\103\uffff}>";
	static final String[] DFA6_transitionS = {
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
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "78:22: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA7_eotS =
		"\u00d3\uffff";
	static final String DFA7_eofS =
		"\1\uffff\3\4\u00cf\uffff";
	static final String DFA7_minS =
		"\1\32\3\12\23\uffff\1\7\46\uffff\1\7\46\uffff\1\7\155\uffff";
	static final String DFA7_maxS =
		"\1\u0216\3\u0146\23\uffff\1\u0216\46\uffff\1\u0216\46\uffff\1\u0216\155"+
		"\uffff";
	static final String DFA7_acceptS =
		"\4\uffff\1\1\24\uffff\1\2\u00b9\uffff";
	static final String DFA7_specialS =
		"\u00d3\uffff}>";
	static final String[] DFA7_transitionS = {
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
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\27\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\76\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\145\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "78:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA17_eotS =
		"\u02ce\uffff";
	static final String DFA17_eofS =
		"\2\uffff\3\5\3\uffff\1\5\1\uffff\4\5\7\uffff\2\5\2\uffff\2\5\1\uffff\2"+
		"\5\u02b0\uffff";
	static final String DFA17_minS =
		"\1\7\1\uffff\3\4\3\uffff\1\4\1\uffff\4\4\7\uffff\2\4\2\uffff\2\4\1\uffff"+
		"\2\4\1\32\54\uffff\1\32\54\uffff\1\32\55\uffff\1\32\54\uffff\1\32\55\uffff"+
		"\1\32\54\uffff\1\32\54\uffff\1\32\54\uffff\1\32\54\uffff\1\32\54\uffff"+
		"\1\32\54\uffff\1\32\54\uffff\1\32\54\uffff\1\32\55\uffff\3\0\1\uffff\3"+
		"\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0";
	static final String DFA17_maxS =
		"\1\u0216\1\uffff\3\u0216\3\uffff\1\u0216\1\uffff\4\u0216\7\uffff\2\u0216"+
		"\2\uffff\2\u0216\1\uffff\3\u0216\54\uffff\1\u0216\54\uffff\1\u0216\55"+
		"\uffff\1\u0216\54\uffff\1\u0216\55\uffff\1\u0216\54\uffff\1\u0216\54\uffff"+
		"\1\u0216\54\uffff\1\u0216\54\uffff\1\u0216\54\uffff\1\u0216\54\uffff\1"+
		"\u0216\54\uffff\1\u0216\54\uffff\1\u0216\55\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\u0290\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff";
	static final String DFA17_specialS =
		"\1\0\35\uffff\1\1\54\uffff\1\2\54\uffff\1\3\55\uffff\1\4\54\uffff\1\5"+
		"\55\uffff\1\6\54\uffff\1\7\54\uffff\1\10\54\uffff\1\11\54\uffff\1\12\54"+
		"\uffff\1\13\54\uffff\1\14\54\uffff\1\15\54\uffff\1\16\55\uffff\1\17\1"+
		"\20\1\21\1\uffff\1\22\1\23\1\24\1\uffff\1\25\1\26\1\27\1\uffff\1\30\1"+
		"\31\1\32\1\uffff\1\33\1\34\1\35\1\uffff\1\36\1\37\1\40\1\uffff\1\41\1"+
		"\42\1\43\1\uffff\1\44\1\45\1\46\1\uffff\1\47\1\50\1\51\1\uffff\1\52\1"+
		"\53\1\54\1\uffff\1\55\1\56\1\57\1\uffff\1\60\1\61\1\62\1\uffff\1\63\1"+
		"\64\1\65\1\uffff\1\66\1\67\1\70}>";
	static final String[] DFA17_transitionS = {
			"\1\5\5\uffff\1\5\4\uffff\1\5\7\uffff\1\2\4\31\2\35\1\31\1\uffff\1\31"+
			"\1\26\1\35\1\31\1\35\2\31\1\35\3\32\1\35\2\31\1\35\1\uffff\1\31\2\5\1"+
			"\31\1\uffff\4\31\1\uffff\2\31\1\uffff\4\31\1\uffff\1\35\1\31\1\35\1\uffff"+
			"\1\35\1\uffff\1\12\1\14\1\35\1\31\1\uffff\1\31\1\10\3\31\1\35\2\31\1"+
			"\35\3\31\1\35\3\31\1\uffff\1\31\1\32\1\35\1\31\1\uffff\1\31\1\uffff\1"+
			"\31\1\uffff\1\31\1\34\2\31\1\uffff\1\35\1\25\1\35\4\31\1\32\1\uffff\2"+
			"\35\2\31\1\uffff\1\35\1\uffff\1\31\3\35\1\uffff\2\31\1\5\2\35\2\31\1"+
			"\35\3\31\1\35\1\32\1\35\1\5\2\35\3\31\1\uffff\4\31\2\35\1\uffff\1\31"+
			"\1\35\3\31\1\35\5\31\1\uffff\1\5\6\31\1\uffff\1\31\1\35\2\31\1\5\1\31"+
			"\1\4\1\31\1\35\1\31\2\uffff\1\31\1\uffff\3\35\2\31\1\uffff\2\31\1\uffff"+
			"\1\35\2\31\1\35\1\31\2\uffff\1\31\1\35\1\31\1\35\1\31\1\35\1\31\1\35"+
			"\3\31\1\uffff\2\35\7\31\1\35\1\31\2\35\2\31\1\uffff\3\35\3\31\1\uffff"+
			"\4\31\1\35\5\31\1\32\4\31\1\uffff\4\31\1\3\1\35\1\31\1\uffff\3\31\1\uffff"+
			"\1\13\1\31\1\35\3\31\1\uffff\1\35\1\15\1\35\1\31\1\uffff\1\31\1\35\1"+
			"\3\1\uffff\3\31\1\35\2\31\2\35\3\31\1\35\1\31\1\uffff\1\31\2\uffff\1"+
			"\31\1\uffff\1\35\3\31\3\uffff\1\5\2\uffff\1\5\2\uffff\2\5\7\uffff\1\1"+
			"\4\5\162\uffff\1\31\3\uffff\1\31\60\uffff\1\31\3\uffff\1\31\27\uffff"+
			"\1\31\3\uffff\1\31",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\36\2\uffff\2\5\1\uffff\2\5\1"+
			"\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff\4"+
			"\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\113\2\uffff\2\5\1\uffff\2\5\1"+
			"\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff\4"+
			"\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\170\2\uffff\2\5\1\uffff\2\5\1"+
			"\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff\4"+
			"\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u00a6\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\1\5\164\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27"+
			"\uffff\1\5\3\uffff\1\5",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u00d3\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0101\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\1\5\164\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27"+
			"\uffff\1\5\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u012e\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u015b\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0188\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u01b5\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u01e2\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u020f\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u023c\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0269\2\uffff\2\5\1\uffff\2\5"+
			"\1\uffff\30\5\1\uffff\1\5\2\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff\20\5\1\uffff\4\5\1\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10\5\1\uffff\6\5\1\uffff\7\5\1\uffff"+
			"\13\5\1\uffff\5\5\1\uffff\6\5\1\uffff\13\5\1\uffff\7\5\1\uffff\12\5\2"+
			"\uffff\7\5\1\uffff\2\5\1\uffff\5\5\2\uffff\33\5\1\uffff\26\5\1\uffff"+
			"\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\3\5\1\uffff\15\5\1\uffff"+
			"\1\5\1\uffff\7\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff"+
			"\1\5\166\uffff\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5"+
			"\3\uffff\1\5",
			"\1\u0297\4\u0298\2\u0299\1\u0298\1\uffff\1\u0298\2\u0299\1\u0298\1\u0299"+
			"\2\u0298\5\u0299\2\u0298\1\u0299\1\uffff\1\u0298\2\uffff\1\u0298\1\uffff"+
			"\4\u0298\1\uffff\2\u0298\1\uffff\4\u0298\1\uffff\1\u0299\1\u0298\1\u0299"+
			"\1\uffff\1\u0299\1\uffff\3\u0299\1\u0298\1\uffff\1\u0298\1\u0299\3\u0298"+
			"\1\u0299\2\u0298\1\u0299\3\u0298\1\u0299\3\u0298\1\uffff\1\u0298\2\u0299"+
			"\1\u0298\1\uffff\1\u0298\1\uffff\1\u0298\1\uffff\1\u0298\1\u0299\2\u0298"+
			"\1\uffff\3\u0299\4\u0298\1\u0299\1\uffff\2\u0299\2\u0298\1\uffff\1\u0299"+
			"\1\uffff\1\u0298\3\u0299\1\uffff\2\u0298\1\uffff\2\u0299\2\u0298\1\u0299"+
			"\3\u0298\3\u0299\1\uffff\2\u0299\3\u0298\1\uffff\4\u0298\2\u0299\1\uffff"+
			"\1\u0298\1\u0299\3\u0298\1\u0299\5\u0298\2\uffff\6\u0298\1\uffff\1\u0298"+
			"\1\u0299\2\u0298\1\uffff\1\u0298\1\u0299\1\u0298\1\u0299\1\u0298\2\uffff"+
			"\1\u0298\1\uffff\3\u0299\2\u0298\1\uffff\2\u0298\1\uffff\1\u0299\2\u0298"+
			"\1\u0299\1\u0298\2\uffff\1\u0298\1\u0299\1\u0298\1\u0299\1\u0298\1\u0299"+
			"\1\u0298\1\u0299\3\u0298\1\uffff\2\u0299\7\u0298\1\u0299\1\u0298\2\u0299"+
			"\2\u0298\1\uffff\3\u0299\3\u0298\1\uffff\4\u0298\1\u0299\5\u0298\1\u0299"+
			"\4\u0298\1\uffff\5\u0298\1\u0299\1\u0298\1\uffff\3\u0298\1\uffff\1\u0299"+
			"\1\u0298\1\u0299\3\u0298\1\uffff\3\u0299\1\u0298\1\uffff\1\u0298\1\u0299"+
			"\1\u0298\1\uffff\3\u0298\1\u0299\2\u0298\2\u0299\3\u0298\1\u0299\1\u0298"+
			"\1\uffff\1\u0298\2\uffff\1\u0298\1\uffff\1\u0299\3\u0298\22\uffff\1\u0296"+
			"\166\uffff\1\u0298\3\uffff\1\u0298\60\uffff\1\u0298\3\uffff\1\u0298\27"+
			"\uffff\1\u0298\3\uffff\1\u0298",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u029b\4\u029c\2\u029d\1\u029c\1\uffff\1\u029c\2\u029d\1\u029c\1\u029d"+
			"\2\u029c\5\u029d\2\u029c\1\u029d\1\uffff\1\u029c\2\uffff\1\u029c\1\uffff"+
			"\4\u029c\1\uffff\2\u029c\1\uffff\4\u029c\1\uffff\1\u029d\1\u029c\1\u029d"+
			"\1\uffff\1\u029d\1\uffff\3\u029d\1\u029c\1\uffff\1\u029c\1\u029d\3\u029c"+
			"\1\u029d\2\u029c\1\u029d\3\u029c\1\u029d\3\u029c\1\uffff\1\u029c\2\u029d"+
			"\1\u029c\1\uffff\1\u029c\1\uffff\1\u029c\1\uffff\1\u029c\1\u029d\2\u029c"+
			"\1\uffff\3\u029d\4\u029c\1\u029d\1\uffff\2\u029d\2\u029c\1\uffff\1\u029d"+
			"\1\uffff\1\u029c\3\u029d\1\uffff\2\u029c\1\uffff\2\u029d\2\u029c\1\u029d"+
			"\3\u029c\3\u029d\1\uffff\2\u029d\3\u029c\1\uffff\4\u029c\2\u029d\1\uffff"+
			"\1\u029c\1\u029d\3\u029c\1\u029d\5\u029c\2\uffff\6\u029c\1\uffff\1\u029c"+
			"\1\u029d\2\u029c\1\uffff\1\u029c\1\u029d\1\u029c\1\u029d\1\u029c\2\uffff"+
			"\1\u029c\1\uffff\3\u029d\2\u029c\1\uffff\2\u029c\1\uffff\1\u029d\2\u029c"+
			"\1\u029d\1\u029c\2\uffff\1\u029c\1\u029d\1\u029c\1\u029d\1\u029c\1\u029d"+
			"\1\u029c\1\u029d\3\u029c\1\uffff\2\u029d\7\u029c\1\u029d\1\u029c\2\u029d"+
			"\2\u029c\1\uffff\3\u029d\3\u029c\1\uffff\4\u029c\1\u029d\5\u029c\1\u029d"+
			"\4\u029c\1\uffff\5\u029c\1\u029d\1\u029c\1\uffff\3\u029c\1\uffff\1\u029d"+
			"\1\u029c\1\u029d\3\u029c\1\uffff\3\u029d\1\u029c\1\uffff\1\u029c\1\u029d"+
			"\1\u029c\1\uffff\3\u029c\1\u029d\2\u029c\2\u029d\3\u029c\1\u029d\1\u029c"+
			"\1\uffff\1\u029c\2\uffff\1\u029c\1\uffff\1\u029d\3\u029c\22\uffff\1\u029a"+
			"\166\uffff\1\u029c\3\uffff\1\u029c\60\uffff\1\u029c\3\uffff\1\u029c\27"+
			"\uffff\1\u029c\3\uffff\1\u029c",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u029f\4\u02a0\2\u02a1\1\u02a0\1\uffff\1\u02a0\2\u02a1\1\u02a0\1\u02a1"+
			"\2\u02a0\5\u02a1\2\u02a0\1\u02a1\1\uffff\1\u02a0\2\uffff\1\u02a0\1\uffff"+
			"\4\u02a0\1\uffff\2\u02a0\1\uffff\4\u02a0\1\uffff\1\u02a1\1\u02a0\1\u02a1"+
			"\1\uffff\1\u02a1\1\uffff\3\u02a1\1\u02a0\1\uffff\1\u02a0\1\u02a1\3\u02a0"+
			"\1\u02a1\2\u02a0\1\u02a1\3\u02a0\1\u02a1\3\u02a0\1\uffff\1\u02a0\2\u02a1"+
			"\1\u02a0\1\uffff\1\u02a0\1\uffff\1\u02a0\1\uffff\1\u02a0\1\u02a1\2\u02a0"+
			"\1\uffff\3\u02a1\4\u02a0\1\u02a1\1\uffff\2\u02a1\2\u02a0\1\uffff\1\u02a1"+
			"\1\uffff\1\u02a0\3\u02a1\1\uffff\2\u02a0\1\uffff\2\u02a1\2\u02a0\1\u02a1"+
			"\3\u02a0\3\u02a1\1\uffff\2\u02a1\3\u02a0\1\uffff\4\u02a0\2\u02a1\1\uffff"+
			"\1\u02a0\1\u02a1\3\u02a0\1\u02a1\5\u02a0\2\uffff\6\u02a0\1\uffff\1\u02a0"+
			"\1\u02a1\2\u02a0\1\uffff\1\u02a0\1\u02a1\1\u02a0\1\u02a1\1\u02a0\2\uffff"+
			"\1\u02a0\1\uffff\3\u02a1\2\u02a0\1\uffff\2\u02a0\1\uffff\1\u02a1\2\u02a0"+
			"\1\u02a1\1\u02a0\2\uffff\1\u02a0\1\u02a1\1\u02a0\1\u02a1\1\u02a0\1\u02a1"+
			"\1\u02a0\1\u02a1\3\u02a0\1\uffff\2\u02a1\7\u02a0\1\u02a1\1\u02a0\2\u02a1"+
			"\2\u02a0\1\uffff\3\u02a1\3\u02a0\1\uffff\4\u02a0\1\u02a1\5\u02a0\1\u02a1"+
			"\4\u02a0\1\uffff\5\u02a0\1\u02a1\1\u02a0\1\uffff\3\u02a0\1\uffff\1\u02a1"+
			"\1\u02a0\1\u02a1\3\u02a0\1\uffff\3\u02a1\1\u02a0\1\uffff\1\u02a0\1\u02a1"+
			"\1\u02a0\1\uffff\3\u02a0\1\u02a1\2\u02a0\2\u02a1\3\u02a0\1\u02a1\1\u02a0"+
			"\1\uffff\1\u02a0\2\uffff\1\u02a0\1\uffff\1\u02a1\3\u02a0\22\uffff\1\u029e"+
			"\166\uffff\1\u02a0\3\uffff\1\u02a0\60\uffff\1\u02a0\3\uffff\1\u02a0\27"+
			"\uffff\1\u02a0\3\uffff\1\u02a0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02a3\4\u02a4\2\u02a5\1\u02a4\1\uffff\1\u02a4\2\u02a5\1\u02a4\1\u02a5"+
			"\2\u02a4\5\u02a5\2\u02a4\1\u02a5\1\uffff\1\u02a4\2\uffff\1\u02a4\1\uffff"+
			"\4\u02a4\1\uffff\2\u02a4\1\uffff\4\u02a4\1\uffff\1\u02a5\1\u02a4\1\u02a5"+
			"\1\uffff\1\u02a5\1\uffff\3\u02a5\1\u02a4\1\uffff\1\u02a4\1\u02a5\3\u02a4"+
			"\1\u02a5\2\u02a4\1\u02a5\3\u02a4\1\u02a5\3\u02a4\1\uffff\1\u02a4\2\u02a5"+
			"\1\u02a4\1\uffff\1\u02a4\1\uffff\1\u02a4\1\uffff\1\u02a4\1\u02a5\2\u02a4"+
			"\1\uffff\3\u02a5\4\u02a4\1\u02a5\1\uffff\2\u02a5\2\u02a4\1\uffff\1\u02a5"+
			"\1\uffff\1\u02a4\3\u02a5\1\uffff\2\u02a4\1\uffff\2\u02a5\2\u02a4\1\u02a5"+
			"\3\u02a4\3\u02a5\1\uffff\2\u02a5\3\u02a4\1\uffff\4\u02a4\2\u02a5\1\uffff"+
			"\1\u02a4\1\u02a5\3\u02a4\1\u02a5\5\u02a4\2\uffff\6\u02a4\1\uffff\1\u02a4"+
			"\1\u02a5\2\u02a4\1\uffff\1\u02a4\1\u02a5\1\u02a4\1\u02a5\1\u02a4\2\uffff"+
			"\1\u02a4\1\uffff\3\u02a5\2\u02a4\1\uffff\2\u02a4\1\uffff\1\u02a5\2\u02a4"+
			"\1\u02a5\1\u02a4\2\uffff\1\u02a4\1\u02a5\1\u02a4\1\u02a5\1\u02a4\1\u02a5"+
			"\1\u02a4\1\u02a5\3\u02a4\1\uffff\2\u02a5\7\u02a4\1\u02a5\1\u02a4\2\u02a5"+
			"\2\u02a4\1\uffff\3\u02a5\3\u02a4\1\uffff\4\u02a4\1\u02a5\5\u02a4\1\u02a5"+
			"\4\u02a4\1\uffff\5\u02a4\1\u02a5\1\u02a4\1\uffff\3\u02a4\1\uffff\1\u02a5"+
			"\1\u02a4\1\u02a5\3\u02a4\1\uffff\3\u02a5\1\u02a4\1\uffff\1\u02a4\1\u02a5"+
			"\1\u02a4\1\uffff\3\u02a4\1\u02a5\2\u02a4\2\u02a5\3\u02a4\1\u02a5\1\u02a4"+
			"\1\uffff\1\u02a4\2\uffff\1\u02a4\1\uffff\1\u02a5\3\u02a4\22\uffff\1\u02a2"+
			"\166\uffff\1\u02a4\3\uffff\1\u02a4\60\uffff\1\u02a4\3\uffff\1\u02a4\27"+
			"\uffff\1\u02a4\3\uffff\1\u02a4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02a7\4\u02a8\2\u02a9\1\u02a8\1\uffff\1\u02a8\2\u02a9\1\u02a8\1\u02a9"+
			"\2\u02a8\5\u02a9\2\u02a8\1\u02a9\1\uffff\1\u02a8\2\uffff\1\u02a8\1\uffff"+
			"\4\u02a8\1\uffff\2\u02a8\1\uffff\4\u02a8\1\uffff\1\u02a9\1\u02a8\1\u02a9"+
			"\1\uffff\1\u02a9\1\uffff\3\u02a9\1\u02a8\1\uffff\1\u02a8\1\u02a9\3\u02a8"+
			"\1\u02a9\2\u02a8\1\u02a9\3\u02a8\1\u02a9\3\u02a8\1\uffff\1\u02a8\2\u02a9"+
			"\1\u02a8\1\uffff\1\u02a8\1\uffff\1\u02a8\1\uffff\1\u02a8\1\u02a9\2\u02a8"+
			"\1\uffff\3\u02a9\4\u02a8\1\u02a9\1\uffff\2\u02a9\2\u02a8\1\uffff\1\u02a9"+
			"\1\uffff\1\u02a8\3\u02a9\1\uffff\2\u02a8\1\uffff\2\u02a9\2\u02a8\1\u02a9"+
			"\3\u02a8\3\u02a9\1\uffff\2\u02a9\3\u02a8\1\uffff\4\u02a8\2\u02a9\1\uffff"+
			"\1\u02a8\1\u02a9\3\u02a8\1\u02a9\5\u02a8\2\uffff\6\u02a8\1\uffff\1\u02a8"+
			"\1\u02a9\2\u02a8\1\uffff\1\u02a8\1\u02a9\1\u02a8\1\u02a9\1\u02a8\2\uffff"+
			"\1\u02a8\1\uffff\3\u02a9\2\u02a8\1\uffff\2\u02a8\1\uffff\1\u02a9\2\u02a8"+
			"\1\u02a9\1\u02a8\2\uffff\1\u02a8\1\u02a9\1\u02a8\1\u02a9\1\u02a8\1\u02a9"+
			"\1\u02a8\1\u02a9\3\u02a8\1\uffff\2\u02a9\7\u02a8\1\u02a9\1\u02a8\2\u02a9"+
			"\2\u02a8\1\uffff\3\u02a9\3\u02a8\1\uffff\4\u02a8\1\u02a9\5\u02a8\1\u02a9"+
			"\4\u02a8\1\uffff\5\u02a8\1\u02a9\1\u02a8\1\uffff\3\u02a8\1\uffff\1\u02a9"+
			"\1\u02a8\1\u02a9\3\u02a8\1\uffff\3\u02a9\1\u02a8\1\uffff\1\u02a8\1\u02a9"+
			"\1\u02a8\1\uffff\3\u02a8\1\u02a9\2\u02a8\2\u02a9\3\u02a8\1\u02a9\1\u02a8"+
			"\1\uffff\1\u02a8\2\uffff\1\u02a8\1\uffff\1\u02a9\3\u02a8\22\uffff\1\u02a6"+
			"\166\uffff\1\u02a8\3\uffff\1\u02a8\60\uffff\1\u02a8\3\uffff\1\u02a8\27"+
			"\uffff\1\u02a8\3\uffff\1\u02a8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02ab\4\u02ac\2\u02ad\1\u02ac\1\uffff\1\u02ac\2\u02ad\1\u02ac\1\u02ad"+
			"\2\u02ac\5\u02ad\2\u02ac\1\u02ad\1\uffff\1\u02ac\2\uffff\1\u02ac\1\uffff"+
			"\4\u02ac\1\uffff\2\u02ac\1\uffff\4\u02ac\1\uffff\1\u02ad\1\u02ac\1\u02ad"+
			"\1\uffff\1\u02ad\1\uffff\3\u02ad\1\u02ac\1\uffff\1\u02ac\1\u02ad\3\u02ac"+
			"\1\u02ad\2\u02ac\1\u02ad\3\u02ac\1\u02ad\3\u02ac\1\uffff\1\u02ac\2\u02ad"+
			"\1\u02ac\1\uffff\1\u02ac\1\uffff\1\u02ac\1\uffff\1\u02ac\1\u02ad\2\u02ac"+
			"\1\uffff\3\u02ad\4\u02ac\1\u02ad\1\uffff\2\u02ad\2\u02ac\1\uffff\1\u02ad"+
			"\1\uffff\1\u02ac\3\u02ad\1\uffff\2\u02ac\1\uffff\2\u02ad\2\u02ac\1\u02ad"+
			"\3\u02ac\3\u02ad\1\uffff\2\u02ad\3\u02ac\1\uffff\4\u02ac\2\u02ad\1\uffff"+
			"\1\u02ac\1\u02ad\3\u02ac\1\u02ad\5\u02ac\2\uffff\6\u02ac\1\uffff\1\u02ac"+
			"\1\u02ad\2\u02ac\1\uffff\1\u02ac\1\u02ad\1\u02ac\1\u02ad\1\u02ac\2\uffff"+
			"\1\u02ac\1\uffff\3\u02ad\2\u02ac\1\uffff\2\u02ac\1\uffff\1\u02ad\2\u02ac"+
			"\1\u02ad\1\u02ac\2\uffff\1\u02ac\1\u02ad\1\u02ac\1\u02ad\1\u02ac\1\u02ad"+
			"\1\u02ac\1\u02ad\3\u02ac\1\uffff\2\u02ad\7\u02ac\1\u02ad\1\u02ac\2\u02ad"+
			"\2\u02ac\1\uffff\3\u02ad\3\u02ac\1\uffff\4\u02ac\1\u02ad\5\u02ac\1\u02ad"+
			"\4\u02ac\1\uffff\5\u02ac\1\u02ad\1\u02ac\1\uffff\3\u02ac\1\uffff\1\u02ad"+
			"\1\u02ac\1\u02ad\3\u02ac\1\uffff\3\u02ad\1\u02ac\1\uffff\1\u02ac\1\u02ad"+
			"\1\u02ac\1\uffff\3\u02ac\1\u02ad\2\u02ac\2\u02ad\3\u02ac\1\u02ad\1\u02ac"+
			"\1\uffff\1\u02ac\2\uffff\1\u02ac\1\uffff\1\u02ad\3\u02ac\22\uffff\1\u02aa"+
			"\166\uffff\1\u02ac\3\uffff\1\u02ac\60\uffff\1\u02ac\3\uffff\1\u02ac\27"+
			"\uffff\1\u02ac\3\uffff\1\u02ac",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02af\4\u02b0\2\u02b1\1\u02b0\1\uffff\1\u02b0\2\u02b1\1\u02b0\1\u02b1"+
			"\2\u02b0\5\u02b1\2\u02b0\1\u02b1\1\uffff\1\u02b0\2\uffff\1\u02b0\1\uffff"+
			"\4\u02b0\1\uffff\2\u02b0\1\uffff\4\u02b0\1\uffff\1\u02b1\1\u02b0\1\u02b1"+
			"\1\uffff\1\u02b1\1\uffff\3\u02b1\1\u02b0\1\uffff\1\u02b0\1\u02b1\3\u02b0"+
			"\1\u02b1\2\u02b0\1\u02b1\3\u02b0\1\u02b1\3\u02b0\1\uffff\1\u02b0\2\u02b1"+
			"\1\u02b0\1\uffff\1\u02b0\1\uffff\1\u02b0\1\uffff\1\u02b0\1\u02b1\2\u02b0"+
			"\1\uffff\3\u02b1\4\u02b0\1\u02b1\1\uffff\2\u02b1\2\u02b0\1\uffff\1\u02b1"+
			"\1\uffff\1\u02b0\3\u02b1\1\uffff\2\u02b0\1\uffff\2\u02b1\2\u02b0\1\u02b1"+
			"\3\u02b0\3\u02b1\1\uffff\2\u02b1\3\u02b0\1\uffff\4\u02b0\2\u02b1\1\uffff"+
			"\1\u02b0\1\u02b1\3\u02b0\1\u02b1\5\u02b0\2\uffff\6\u02b0\1\uffff\1\u02b0"+
			"\1\u02b1\2\u02b0\1\uffff\1\u02b0\1\u02b1\1\u02b0\1\u02b1\1\u02b0\2\uffff"+
			"\1\u02b0\1\uffff\3\u02b1\2\u02b0\1\uffff\2\u02b0\1\uffff\1\u02b1\2\u02b0"+
			"\1\u02b1\1\u02b0\2\uffff\1\u02b0\1\u02b1\1\u02b0\1\u02b1\1\u02b0\1\u02b1"+
			"\1\u02b0\1\u02b1\3\u02b0\1\uffff\2\u02b1\7\u02b0\1\u02b1\1\u02b0\2\u02b1"+
			"\2\u02b0\1\uffff\3\u02b1\3\u02b0\1\uffff\4\u02b0\1\u02b1\5\u02b0\1\u02b1"+
			"\4\u02b0\1\uffff\5\u02b0\1\u02b1\1\u02b0\1\uffff\3\u02b0\1\uffff\1\u02b1"+
			"\1\u02b0\1\u02b1\3\u02b0\1\uffff\3\u02b1\1\u02b0\1\uffff\1\u02b0\1\u02b1"+
			"\1\u02b0\1\uffff\3\u02b0\1\u02b1\2\u02b0\2\u02b1\3\u02b0\1\u02b1\1\u02b0"+
			"\1\uffff\1\u02b0\2\uffff\1\u02b0\1\uffff\1\u02b1\3\u02b0\22\uffff\1\u02ae"+
			"\166\uffff\1\u02b0\3\uffff\1\u02b0\60\uffff\1\u02b0\3\uffff\1\u02b0\27"+
			"\uffff\1\u02b0\3\uffff\1\u02b0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02b3\4\u02b4\2\u02b5\1\u02b4\1\uffff\1\u02b4\2\u02b5\1\u02b4\1\u02b5"+
			"\2\u02b4\5\u02b5\2\u02b4\1\u02b5\1\uffff\1\u02b4\2\uffff\1\u02b4\1\uffff"+
			"\4\u02b4\1\uffff\2\u02b4\1\uffff\4\u02b4\1\uffff\1\u02b5\1\u02b4\1\u02b5"+
			"\1\uffff\1\u02b5\1\uffff\3\u02b5\1\u02b4\1\uffff\1\u02b4\1\u02b5\3\u02b4"+
			"\1\u02b5\2\u02b4\1\u02b5\3\u02b4\1\u02b5\3\u02b4\1\uffff\1\u02b4\2\u02b5"+
			"\1\u02b4\1\uffff\1\u02b4\1\uffff\1\u02b4\1\uffff\1\u02b4\1\u02b5\2\u02b4"+
			"\1\uffff\3\u02b5\4\u02b4\1\u02b5\1\uffff\2\u02b5\2\u02b4\1\uffff\1\u02b5"+
			"\1\uffff\1\u02b4\3\u02b5\1\uffff\2\u02b4\1\uffff\2\u02b5\2\u02b4\1\u02b5"+
			"\3\u02b4\3\u02b5\1\uffff\2\u02b5\3\u02b4\1\uffff\4\u02b4\2\u02b5\1\uffff"+
			"\1\u02b4\1\u02b5\3\u02b4\1\u02b5\5\u02b4\2\uffff\6\u02b4\1\uffff\1\u02b4"+
			"\1\u02b5\2\u02b4\1\uffff\1\u02b4\1\u02b5\1\u02b4\1\u02b5\1\u02b4\2\uffff"+
			"\1\u02b4\1\uffff\3\u02b5\2\u02b4\1\uffff\2\u02b4\1\uffff\1\u02b5\2\u02b4"+
			"\1\u02b5\1\u02b4\2\uffff\1\u02b4\1\u02b5\1\u02b4\1\u02b5\1\u02b4\1\u02b5"+
			"\1\u02b4\1\u02b5\3\u02b4\1\uffff\2\u02b5\7\u02b4\1\u02b5\1\u02b4\2\u02b5"+
			"\2\u02b4\1\uffff\3\u02b5\3\u02b4\1\uffff\4\u02b4\1\u02b5\5\u02b4\1\u02b5"+
			"\4\u02b4\1\uffff\5\u02b4\1\u02b5\1\u02b4\1\uffff\3\u02b4\1\uffff\1\u02b5"+
			"\1\u02b4\1\u02b5\3\u02b4\1\uffff\3\u02b5\1\u02b4\1\uffff\1\u02b4\1\u02b5"+
			"\1\u02b4\1\uffff\3\u02b4\1\u02b5\2\u02b4\2\u02b5\3\u02b4\1\u02b5\1\u02b4"+
			"\1\uffff\1\u02b4\2\uffff\1\u02b4\1\uffff\1\u02b5\3\u02b4\22\uffff\1\u02b2"+
			"\166\uffff\1\u02b4\3\uffff\1\u02b4\60\uffff\1\u02b4\3\uffff\1\u02b4\27"+
			"\uffff\1\u02b4\3\uffff\1\u02b4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02b7\4\u02b8\2\u02b9\1\u02b8\1\uffff\1\u02b8\2\u02b9\1\u02b8\1\u02b9"+
			"\2\u02b8\5\u02b9\2\u02b8\1\u02b9\1\uffff\1\u02b8\2\uffff\1\u02b8\1\uffff"+
			"\4\u02b8\1\uffff\2\u02b8\1\uffff\4\u02b8\1\uffff\1\u02b9\1\u02b8\1\u02b9"+
			"\1\uffff\1\u02b9\1\uffff\3\u02b9\1\u02b8\1\uffff\1\u02b8\1\u02b9\3\u02b8"+
			"\1\u02b9\2\u02b8\1\u02b9\3\u02b8\1\u02b9\3\u02b8\1\uffff\1\u02b8\2\u02b9"+
			"\1\u02b8\1\uffff\1\u02b8\1\uffff\1\u02b8\1\uffff\1\u02b8\1\u02b9\2\u02b8"+
			"\1\uffff\3\u02b9\4\u02b8\1\u02b9\1\uffff\2\u02b9\2\u02b8\1\uffff\1\u02b9"+
			"\1\uffff\1\u02b8\3\u02b9\1\uffff\2\u02b8\1\uffff\2\u02b9\2\u02b8\1\u02b9"+
			"\3\u02b8\3\u02b9\1\uffff\2\u02b9\3\u02b8\1\uffff\4\u02b8\2\u02b9\1\uffff"+
			"\1\u02b8\1\u02b9\3\u02b8\1\u02b9\5\u02b8\2\uffff\6\u02b8\1\uffff\1\u02b8"+
			"\1\u02b9\2\u02b8\1\uffff\1\u02b8\1\u02b9\1\u02b8\1\u02b9\1\u02b8\2\uffff"+
			"\1\u02b8\1\uffff\3\u02b9\2\u02b8\1\uffff\2\u02b8\1\uffff\1\u02b9\2\u02b8"+
			"\1\u02b9\1\u02b8\2\uffff\1\u02b8\1\u02b9\1\u02b8\1\u02b9\1\u02b8\1\u02b9"+
			"\1\u02b8\1\u02b9\3\u02b8\1\uffff\2\u02b9\7\u02b8\1\u02b9\1\u02b8\2\u02b9"+
			"\2\u02b8\1\uffff\3\u02b9\3\u02b8\1\uffff\4\u02b8\1\u02b9\5\u02b8\1\u02b9"+
			"\4\u02b8\1\uffff\5\u02b8\1\u02b9\1\u02b8\1\uffff\3\u02b8\1\uffff\1\u02b9"+
			"\1\u02b8\1\u02b9\3\u02b8\1\uffff\3\u02b9\1\u02b8\1\uffff\1\u02b8\1\u02b9"+
			"\1\u02b8\1\uffff\3\u02b8\1\u02b9\2\u02b8\2\u02b9\3\u02b8\1\u02b9\1\u02b8"+
			"\1\uffff\1\u02b8\2\uffff\1\u02b8\1\uffff\1\u02b9\3\u02b8\22\uffff\1\u02b6"+
			"\166\uffff\1\u02b8\3\uffff\1\u02b8\60\uffff\1\u02b8\3\uffff\1\u02b8\27"+
			"\uffff\1\u02b8\3\uffff\1\u02b8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02bb\4\u02bc\2\u02bd\1\u02bc\1\uffff\1\u02bc\2\u02bd\1\u02bc\1\u02bd"+
			"\2\u02bc\5\u02bd\2\u02bc\1\u02bd\1\uffff\1\u02bc\2\uffff\1\u02bc\1\uffff"+
			"\4\u02bc\1\uffff\2\u02bc\1\uffff\4\u02bc\1\uffff\1\u02bd\1\u02bc\1\u02bd"+
			"\1\uffff\1\u02bd\1\uffff\3\u02bd\1\u02bc\1\uffff\1\u02bc\1\u02bd\3\u02bc"+
			"\1\u02bd\2\u02bc\1\u02bd\3\u02bc\1\u02bd\3\u02bc\1\uffff\1\u02bc\2\u02bd"+
			"\1\u02bc\1\uffff\1\u02bc\1\uffff\1\u02bc\1\uffff\1\u02bc\1\u02bd\2\u02bc"+
			"\1\uffff\3\u02bd\4\u02bc\1\u02bd\1\uffff\2\u02bd\2\u02bc\1\uffff\1\u02bd"+
			"\1\uffff\1\u02bc\3\u02bd\1\uffff\2\u02bc\1\uffff\2\u02bd\2\u02bc\1\u02bd"+
			"\3\u02bc\3\u02bd\1\uffff\2\u02bd\3\u02bc\1\uffff\4\u02bc\2\u02bd\1\uffff"+
			"\1\u02bc\1\u02bd\3\u02bc\1\u02bd\5\u02bc\2\uffff\6\u02bc\1\uffff\1\u02bc"+
			"\1\u02bd\2\u02bc\1\uffff\1\u02bc\1\u02bd\1\u02bc\1\u02bd\1\u02bc\2\uffff"+
			"\1\u02bc\1\uffff\3\u02bd\2\u02bc\1\uffff\2\u02bc\1\uffff\1\u02bd\2\u02bc"+
			"\1\u02bd\1\u02bc\2\uffff\1\u02bc\1\u02bd\1\u02bc\1\u02bd\1\u02bc\1\u02bd"+
			"\1\u02bc\1\u02bd\3\u02bc\1\uffff\2\u02bd\7\u02bc\1\u02bd\1\u02bc\2\u02bd"+
			"\2\u02bc\1\uffff\3\u02bd\3\u02bc\1\uffff\4\u02bc\1\u02bd\5\u02bc\1\u02bd"+
			"\4\u02bc\1\uffff\5\u02bc\1\u02bd\1\u02bc\1\uffff\3\u02bc\1\uffff\1\u02bd"+
			"\1\u02bc\1\u02bd\3\u02bc\1\uffff\3\u02bd\1\u02bc\1\uffff\1\u02bc\1\u02bd"+
			"\1\u02bc\1\uffff\3\u02bc\1\u02bd\2\u02bc\2\u02bd\3\u02bc\1\u02bd\1\u02bc"+
			"\1\uffff\1\u02bc\2\uffff\1\u02bc\1\uffff\1\u02bd\3\u02bc\22\uffff\1\u02ba"+
			"\166\uffff\1\u02bc\3\uffff\1\u02bc\60\uffff\1\u02bc\3\uffff\1\u02bc\27"+
			"\uffff\1\u02bc\3\uffff\1\u02bc",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02bf\4\u02c0\2\u02c1\1\u02c0\1\uffff\1\u02c0\2\u02c1\1\u02c0\1\u02c1"+
			"\2\u02c0\5\u02c1\2\u02c0\1\u02c1\1\uffff\1\u02c0\2\uffff\1\u02c0\1\uffff"+
			"\4\u02c0\1\uffff\2\u02c0\1\uffff\4\u02c0\1\uffff\1\u02c1\1\u02c0\1\u02c1"+
			"\1\uffff\1\u02c1\1\uffff\3\u02c1\1\u02c0\1\uffff\1\u02c0\1\u02c1\3\u02c0"+
			"\1\u02c1\2\u02c0\1\u02c1\3\u02c0\1\u02c1\3\u02c0\1\uffff\1\u02c0\2\u02c1"+
			"\1\u02c0\1\uffff\1\u02c0\1\uffff\1\u02c0\1\uffff\1\u02c0\1\u02c1\2\u02c0"+
			"\1\uffff\3\u02c1\4\u02c0\1\u02c1\1\uffff\2\u02c1\2\u02c0\1\uffff\1\u02c1"+
			"\1\uffff\1\u02c0\3\u02c1\1\uffff\2\u02c0\1\uffff\2\u02c1\2\u02c0\1\u02c1"+
			"\3\u02c0\3\u02c1\1\uffff\2\u02c1\3\u02c0\1\uffff\4\u02c0\2\u02c1\1\uffff"+
			"\1\u02c0\1\u02c1\3\u02c0\1\u02c1\5\u02c0\2\uffff\6\u02c0\1\uffff\1\u02c0"+
			"\1\u02c1\2\u02c0\1\uffff\1\u02c0\1\u02c1\1\u02c0\1\u02c1\1\u02c0\2\uffff"+
			"\1\u02c0\1\uffff\3\u02c1\2\u02c0\1\uffff\2\u02c0\1\uffff\1\u02c1\2\u02c0"+
			"\1\u02c1\1\u02c0\2\uffff\1\u02c0\1\u02c1\1\u02c0\1\u02c1\1\u02c0\1\u02c1"+
			"\1\u02c0\1\u02c1\3\u02c0\1\uffff\2\u02c1\7\u02c0\1\u02c1\1\u02c0\2\u02c1"+
			"\2\u02c0\1\uffff\3\u02c1\3\u02c0\1\uffff\4\u02c0\1\u02c1\5\u02c0\1\u02c1"+
			"\4\u02c0\1\uffff\5\u02c0\1\u02c1\1\u02c0\1\uffff\3\u02c0\1\uffff\1\u02c1"+
			"\1\u02c0\1\u02c1\3\u02c0\1\uffff\3\u02c1\1\u02c0\1\uffff\1\u02c0\1\u02c1"+
			"\1\u02c0\1\uffff\3\u02c0\1\u02c1\2\u02c0\2\u02c1\3\u02c0\1\u02c1\1\u02c0"+
			"\1\uffff\1\u02c0\2\uffff\1\u02c0\1\uffff\1\u02c1\3\u02c0\22\uffff\1\u02be"+
			"\166\uffff\1\u02c0\3\uffff\1\u02c0\60\uffff\1\u02c0\3\uffff\1\u02c0\27"+
			"\uffff\1\u02c0\3\uffff\1\u02c0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02c3\4\u02c4\2\u02c5\1\u02c4\1\uffff\1\u02c4\2\u02c5\1\u02c4\1\u02c5"+
			"\2\u02c4\5\u02c5\2\u02c4\1\u02c5\1\uffff\1\u02c4\2\uffff\1\u02c4\1\uffff"+
			"\4\u02c4\1\uffff\2\u02c4\1\uffff\4\u02c4\1\uffff\1\u02c5\1\u02c4\1\u02c5"+
			"\1\uffff\1\u02c5\1\uffff\3\u02c5\1\u02c4\1\uffff\1\u02c4\1\u02c5\3\u02c4"+
			"\1\u02c5\2\u02c4\1\u02c5\3\u02c4\1\u02c5\3\u02c4\1\uffff\1\u02c4\2\u02c5"+
			"\1\u02c4\1\uffff\1\u02c4\1\uffff\1\u02c4\1\uffff\1\u02c4\1\u02c5\2\u02c4"+
			"\1\uffff\3\u02c5\4\u02c4\1\u02c5\1\uffff\2\u02c5\2\u02c4\1\uffff\1\u02c5"+
			"\1\uffff\1\u02c4\3\u02c5\1\uffff\2\u02c4\1\uffff\2\u02c5\2\u02c4\1\u02c5"+
			"\3\u02c4\3\u02c5\1\uffff\2\u02c5\3\u02c4\1\uffff\4\u02c4\2\u02c5\1\uffff"+
			"\1\u02c4\1\u02c5\3\u02c4\1\u02c5\5\u02c4\2\uffff\6\u02c4\1\uffff\1\u02c4"+
			"\1\u02c5\2\u02c4\1\uffff\1\u02c4\1\u02c5\1\u02c4\1\u02c5\1\u02c4\2\uffff"+
			"\1\u02c4\1\uffff\3\u02c5\2\u02c4\1\uffff\2\u02c4\1\uffff\1\u02c5\2\u02c4"+
			"\1\u02c5\1\u02c4\2\uffff\1\u02c4\1\u02c5\1\u02c4\1\u02c5\1\u02c4\1\u02c5"+
			"\1\u02c4\1\u02c5\3\u02c4\1\uffff\2\u02c5\7\u02c4\1\u02c5\1\u02c4\2\u02c5"+
			"\2\u02c4\1\uffff\3\u02c5\3\u02c4\1\uffff\4\u02c4\1\u02c5\5\u02c4\1\u02c5"+
			"\4\u02c4\1\uffff\5\u02c4\1\u02c5\1\u02c4\1\uffff\3\u02c4\1\uffff\1\u02c5"+
			"\1\u02c4\1\u02c5\3\u02c4\1\uffff\3\u02c5\1\u02c4\1\uffff\1\u02c4\1\u02c5"+
			"\1\u02c4\1\uffff\3\u02c4\1\u02c5\2\u02c4\2\u02c5\3\u02c4\1\u02c5\1\u02c4"+
			"\1\uffff\1\u02c4\2\uffff\1\u02c4\1\uffff\1\u02c5\3\u02c4\22\uffff\1\u02c2"+
			"\166\uffff\1\u02c4\3\uffff\1\u02c4\60\uffff\1\u02c4\3\uffff\1\u02c4\27"+
			"\uffff\1\u02c4\3\uffff\1\u02c4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02c7\4\u02c8\2\u02c9\1\u02c8\1\uffff\1\u02c8\2\u02c9\1\u02c8\1\u02c9"+
			"\2\u02c8\5\u02c9\2\u02c8\1\u02c9\1\uffff\1\u02c8\2\uffff\1\u02c8\1\uffff"+
			"\4\u02c8\1\uffff\2\u02c8\1\uffff\4\u02c8\1\uffff\1\u02c9\1\u02c8\1\u02c9"+
			"\1\uffff\1\u02c9\1\uffff\3\u02c9\1\u02c8\1\uffff\1\u02c8\1\u02c9\3\u02c8"+
			"\1\u02c9\2\u02c8\1\u02c9\3\u02c8\1\u02c9\3\u02c8\1\uffff\1\u02c8\2\u02c9"+
			"\1\u02c8\1\uffff\1\u02c8\1\uffff\1\u02c8\1\uffff\1\u02c8\1\u02c9\2\u02c8"+
			"\1\uffff\3\u02c9\4\u02c8\1\u02c9\1\uffff\2\u02c9\2\u02c8\1\uffff\1\u02c9"+
			"\1\uffff\1\u02c8\3\u02c9\1\uffff\2\u02c8\1\uffff\2\u02c9\2\u02c8\1\u02c9"+
			"\3\u02c8\3\u02c9\1\uffff\2\u02c9\3\u02c8\1\uffff\4\u02c8\2\u02c9\1\uffff"+
			"\1\u02c8\1\u02c9\3\u02c8\1\u02c9\5\u02c8\2\uffff\6\u02c8\1\uffff\1\u02c8"+
			"\1\u02c9\2\u02c8\1\uffff\1\u02c8\1\u02c9\1\u02c8\1\u02c9\1\u02c8\2\uffff"+
			"\1\u02c8\1\uffff\3\u02c9\2\u02c8\1\uffff\2\u02c8\1\uffff\1\u02c9\2\u02c8"+
			"\1\u02c9\1\u02c8\2\uffff\1\u02c8\1\u02c9\1\u02c8\1\u02c9\1\u02c8\1\u02c9"+
			"\1\u02c8\1\u02c9\3\u02c8\1\uffff\2\u02c9\7\u02c8\1\u02c9\1\u02c8\2\u02c9"+
			"\2\u02c8\1\uffff\3\u02c9\3\u02c8\1\uffff\4\u02c8\1\u02c9\5\u02c8\1\u02c9"+
			"\4\u02c8\1\uffff\5\u02c8\1\u02c9\1\u02c8\1\uffff\3\u02c8\1\uffff\1\u02c9"+
			"\1\u02c8\1\u02c9\3\u02c8\1\uffff\3\u02c9\1\u02c8\1\uffff\1\u02c8\1\u02c9"+
			"\1\u02c8\1\uffff\3\u02c8\1\u02c9\2\u02c8\2\u02c9\3\u02c8\1\u02c9\1\u02c8"+
			"\1\uffff\1\u02c8\2\uffff\1\u02c8\1\uffff\1\u02c9\3\u02c8\22\uffff\1\u02c6"+
			"\166\uffff\1\u02c8\3\uffff\1\u02c8\60\uffff\1\u02c8\3\uffff\1\u02c8\27"+
			"\uffff\1\u02c8\3\uffff\1\u02c8",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u02cb\4\u02cc\2\u02cd\1\u02cc\1\uffff\1\u02cc\2\u02cd\1\u02cc\1\u02cd"+
			"\2\u02cc\5\u02cd\2\u02cc\1\u02cd\1\uffff\1\u02cc\2\uffff\1\u02cc\1\uffff"+
			"\4\u02cc\1\uffff\2\u02cc\1\uffff\4\u02cc\1\uffff\1\u02cd\1\u02cc\1\u02cd"+
			"\1\uffff\1\u02cd\1\uffff\3\u02cd\1\u02cc\1\uffff\1\u02cc\1\u02cd\3\u02cc"+
			"\1\u02cd\2\u02cc\1\u02cd\3\u02cc\1\u02cd\3\u02cc\1\uffff\1\u02cc\2\u02cd"+
			"\1\u02cc\1\uffff\1\u02cc\1\uffff\1\u02cc\1\uffff\1\u02cc\1\u02cd\2\u02cc"+
			"\1\uffff\3\u02cd\4\u02cc\1\u02cd\1\uffff\2\u02cd\2\u02cc\1\uffff\1\u02cd"+
			"\1\uffff\1\u02cc\3\u02cd\1\uffff\2\u02cc\1\uffff\2\u02cd\2\u02cc\1\u02cd"+
			"\3\u02cc\3\u02cd\1\uffff\2\u02cd\3\u02cc\1\uffff\4\u02cc\2\u02cd\1\uffff"+
			"\1\u02cc\1\u02cd\3\u02cc\1\u02cd\5\u02cc\2\uffff\6\u02cc\1\uffff\1\u02cc"+
			"\1\u02cd\2\u02cc\1\uffff\1\u02cc\1\u02cd\1\u02cc\1\u02cd\1\u02cc\2\uffff"+
			"\1\u02cc\1\uffff\3\u02cd\2\u02cc\1\uffff\2\u02cc\1\uffff\1\u02cd\2\u02cc"+
			"\1\u02cd\1\u02cc\2\uffff\1\u02cc\1\u02cd\1\u02cc\1\u02cd\1\u02cc\1\u02cd"+
			"\1\u02cc\1\u02cd\3\u02cc\1\uffff\2\u02cd\7\u02cc\1\u02cd\1\u02cc\2\u02cd"+
			"\2\u02cc\1\uffff\3\u02cd\3\u02cc\1\uffff\4\u02cc\1\u02cd\5\u02cc\1\u02cd"+
			"\4\u02cc\1\uffff\5\u02cc\1\u02cd\1\u02cc\1\uffff\3\u02cc\1\uffff\1\u02cd"+
			"\1\u02cc\1\u02cd\3\u02cc\1\uffff\3\u02cd\1\u02cc\1\uffff\1\u02cc\1\u02cd"+
			"\1\u02cc\1\uffff\3\u02cc\1\u02cd\2\u02cc\2\u02cd\3\u02cc\1\u02cd\1\u02cc"+
			"\1\uffff\1\u02cc\2\uffff\1\u02cc\1\uffff\1\u02cd\3\u02cc\22\uffff\1\u02ca"+
			"\166\uffff\1\u02cc\3\uffff\1\u02cc\60\uffff\1\u02cc\3\uffff\1\u02cc\27"+
			"\uffff\1\u02cc\3\uffff\1\u02cc",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "126:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_0 = input.LA(1);
						 
						int index17_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_0==STAR) && (synpred1_SelectClauseParser())) {s = 1;}
						else if ( (LA17_0==Identifier) ) {s = 2;}
						else if ( (LA17_0==KW_STRUCT||LA17_0==KW_UNIONTYPE) ) {s = 3;}
						else if ( (LA17_0==KW_NULL) ) {s = 4;}
						else if ( (LA17_0==BigintLiteral||LA17_0==CharSetName||LA17_0==DecimalLiteral||(LA17_0 >= KW_CASE && LA17_0 <= KW_CAST)||LA17_0==KW_IF||LA17_0==KW_INTERVAL||LA17_0==KW_MAP||LA17_0==KW_NOT||LA17_0==LPAREN||LA17_0==MINUS||(LA17_0 >= Number && LA17_0 <= PLUS)||(LA17_0 >= SmallintLiteral && LA17_0 <= TinyintLiteral)) ) {s = 5;}
						else if ( (LA17_0==KW_DATE) ) {s = 8;}
						else if ( (LA17_0==KW_CURRENT_DATE) ) {s = 10;}
						else if ( (LA17_0==KW_TIMESTAMP) ) {s = 11;}
						else if ( (LA17_0==KW_CURRENT_TIMESTAMP) ) {s = 12;}
						else if ( (LA17_0==KW_TRUE) ) {s = 13;}
						else if ( (LA17_0==KW_FALSE) ) {s = 21;}
						else if ( (LA17_0==KW_ARRAY) ) {s = 22;}
						else if ( ((LA17_0 >= KW_ABORT && LA17_0 <= KW_AFTER)||LA17_0==KW_ANALYZE||LA17_0==KW_ARCHIVE||LA17_0==KW_ASC||(LA17_0 >= KW_AUTOCOMMIT && LA17_0 <= KW_BEFORE)||(LA17_0 >= KW_BUCKET && LA17_0 <= KW_BUCKETS)||LA17_0==KW_CASCADE||LA17_0==KW_CHANGE||(LA17_0 >= KW_CLUSTER && LA17_0 <= KW_COLLECTION)||(LA17_0 >= KW_COLUMNS && LA17_0 <= KW_COMMENT)||(LA17_0 >= KW_COMPACT && LA17_0 <= KW_CONCATENATE)||LA17_0==KW_CONTINUE||LA17_0==KW_DATA||LA17_0==KW_DATABASES||(LA17_0 >= KW_DATETIME && LA17_0 <= KW_DBPROPERTIES)||(LA17_0 >= KW_DEFERRED && LA17_0 <= KW_DEFINED)||(LA17_0 >= KW_DELIMITED && LA17_0 <= KW_DESC)||(LA17_0 >= KW_DIRECTORIES && LA17_0 <= KW_DISABLE)||LA17_0==KW_DISTRIBUTE||LA17_0==KW_ELEM_TYPE||LA17_0==KW_ENABLE||LA17_0==KW_ESCAPED||LA17_0==KW_EXCLUSIVE||(LA17_0 >= KW_EXPLAIN && LA17_0 <= KW_EXPORT)||(LA17_0 >= KW_FIELDS && LA17_0 <= KW_FIRST)||(LA17_0 >= KW_FORMAT && LA17_0 <= KW_FORMATTED)||LA17_0==KW_FUNCTIONS||(LA17_0 >= KW_HOUR && LA17_0 <= KW_IDXPROPERTIES)||(LA17_0 >= KW_INDEX && LA17_0 <= KW_INDEXES)||(LA17_0 >= KW_INPATH && LA17_0 <= KW_INPUTFORMAT)||(LA17_0 >= KW_ISOLATION && LA17_0 <= KW_JAR)||(LA17_0 >= KW_KEY && LA17_0 <= KW_LAST)||LA17_0==KW_LEVEL||(LA17_0 >= KW_LIMIT && LA17_0 <= KW_LOAD)||(LA17_0 >= KW_LOCATION && LA17_0 <= KW_LONG)||(LA17_0 >= KW_MAPJOIN && LA17_0 <= KW_MONTH)||LA17_0==KW_MSCK||(LA17_0 >= KW_NORELY && LA17_0 <= KW_NOSCAN)||LA17_0==KW_NOVALIDATE||LA17_0==KW_NULLS||LA17_0==KW_OFFSET||LA17_0==KW_OPTION||(LA17_0 >= KW_OUTPUTDRIVER && LA17_0 <= KW_OUTPUTFORMAT)||(LA17_0 >= KW_OVERWRITE && LA17_0 <= KW_OWNER)||(LA17_0 >= KW_PARTITIONED && LA17_0 <= KW_PARTITIONS)||LA17_0==KW_PLUS||LA17_0==KW_PRETTY||LA17_0==KW_PRINCIPALS||LA17_0==KW_PURGE||LA17_0==KW_READ||(LA17_0 >= KW_REBUILD && LA17_0 <= KW_RECORDWRITER)||(LA17_0 >= KW_RELOAD && LA17_0 <= KW_RESTRICT)||LA17_0==KW_REWRITE||(LA17_0 >= KW_ROLE && LA17_0 <= KW_ROLES)||(LA17_0 >= KW_SCHEMA && LA17_0 <= KW_SECOND)||(LA17_0 >= KW_SEMI && LA17_0 <= KW_SERVER)||(LA17_0 >= KW_SETS && LA17_0 <= KW_SKEWED)||(LA17_0 >= KW_SNAPSHOT && LA17_0 <= KW_SSL)||(LA17_0 >= KW_STATISTICS && LA17_0 <= KW_STRING)||LA17_0==KW_TABLES||(LA17_0 >= KW_TBLPROPERTIES && LA17_0 <= KW_TERMINATED)||LA17_0==KW_TINYINT||(LA17_0 >= KW_TOUCH && LA17_0 <= KW_TRANSACTIONS)||LA17_0==KW_UNARCHIVE||LA17_0==KW_UNDO||(LA17_0 >= KW_UNLOCK && LA17_0 <= KW_UNSIGNED)||(LA17_0 >= KW_URI && LA17_0 <= KW_USE)||(LA17_0 >= KW_UTC && LA17_0 <= KW_VALIDATE)||LA17_0==KW_VALUE_TYPE||LA17_0==KW_VIEW||LA17_0==KW_WHILE||(LA17_0 >= KW_WORK && LA17_0 <= KW_YEAR)||LA17_0==KW_HOLD_DDLTIME||LA17_0==KW_IGNORE||LA17_0==KW_NO_DROP||LA17_0==KW_OFFLINE||LA17_0==KW_PROTECTION||LA17_0==KW_READONLY) ) {s = 25;}
						else if ( ((LA17_0 >= KW_BIGINT && LA17_0 <= KW_BOOLEAN)||LA17_0==KW_DOUBLE||LA17_0==KW_FLOAT||LA17_0==KW_INT||LA17_0==KW_SMALLINT) ) {s = 26;}
						else if ( (LA17_0==KW_EXISTS) ) {s = 28;}
						else if ( ((LA17_0 >= KW_ALL && LA17_0 <= KW_ALTER)||LA17_0==KW_AS||LA17_0==KW_AUTHORIZATION||LA17_0==KW_BETWEEN||LA17_0==KW_BOTH||LA17_0==KW_BY||LA17_0==KW_CONSTRAINT||LA17_0==KW_CREATE||LA17_0==KW_CUBE||LA17_0==KW_CURSOR||LA17_0==KW_DECIMAL||LA17_0==KW_DELETE||LA17_0==KW_DESCRIBE||LA17_0==KW_DROP||LA17_0==KW_EXTERNAL||LA17_0==KW_FETCH||(LA17_0 >= KW_FOR && LA17_0 <= KW_FOREIGN)||LA17_0==KW_FULL||(LA17_0 >= KW_GRANT && LA17_0 <= KW_GROUPING)||(LA17_0 >= KW_IMPORT && LA17_0 <= KW_IN)||LA17_0==KW_INNER||LA17_0==KW_INSERT||LA17_0==KW_INTERSECT||(LA17_0 >= KW_INTO && LA17_0 <= KW_IS)||(LA17_0 >= KW_LATERAL && LA17_0 <= KW_LEFT)||LA17_0==KW_LIKE||LA17_0==KW_LOCAL||LA17_0==KW_NONE||LA17_0==KW_OF||(LA17_0 >= KW_ORDER && LA17_0 <= KW_OUTER)||LA17_0==KW_PARTITION||LA17_0==KW_PERCENT||LA17_0==KW_PRIMARY||LA17_0==KW_PROCEDURE||LA17_0==KW_RANGE||LA17_0==KW_READS||(LA17_0 >= KW_REFERENCES && LA17_0 <= KW_REGEXP)||LA17_0==KW_REVOKE||(LA17_0 >= KW_RIGHT && LA17_0 <= KW_RLIKE)||(LA17_0 >= KW_ROLLUP && LA17_0 <= KW_ROWS)||LA17_0==KW_SET||LA17_0==KW_TABLE||LA17_0==KW_TO||LA17_0==KW_TRIGGER||LA17_0==KW_TRUNCATE||LA17_0==KW_UNION||LA17_0==KW_UPDATE||(LA17_0 >= KW_USER && LA17_0 <= KW_USING)||LA17_0==KW_VALUES||LA17_0==KW_WITH) ) {s = 29;}
						 
						input.seek(index17_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_30 = input.LA(1);
						 
						int index17_30 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_30==STAR) && (synpred1_SelectClauseParser())) {s = 662;}
						else if ( (LA17_30==Identifier) ) {s = 663;}
						else if ( ((LA17_30 >= KW_ABORT && LA17_30 <= KW_AFTER)||LA17_30==KW_ANALYZE||LA17_30==KW_ARCHIVE||LA17_30==KW_ASC||(LA17_30 >= KW_AUTOCOMMIT && LA17_30 <= KW_BEFORE)||(LA17_30 >= KW_BUCKET && LA17_30 <= KW_BUCKETS)||LA17_30==KW_CASCADE||LA17_30==KW_CHANGE||(LA17_30 >= KW_CLUSTER && LA17_30 <= KW_COLLECTION)||(LA17_30 >= KW_COLUMNS && LA17_30 <= KW_COMMENT)||(LA17_30 >= KW_COMPACT && LA17_30 <= KW_CONCATENATE)||LA17_30==KW_CONTINUE||LA17_30==KW_DATA||LA17_30==KW_DATABASES||(LA17_30 >= KW_DATETIME && LA17_30 <= KW_DBPROPERTIES)||(LA17_30 >= KW_DEFERRED && LA17_30 <= KW_DEFINED)||(LA17_30 >= KW_DELIMITED && LA17_30 <= KW_DESC)||(LA17_30 >= KW_DIRECTORIES && LA17_30 <= KW_DISABLE)||LA17_30==KW_DISTRIBUTE||LA17_30==KW_ELEM_TYPE||LA17_30==KW_ENABLE||LA17_30==KW_ESCAPED||LA17_30==KW_EXCLUSIVE||(LA17_30 >= KW_EXPLAIN && LA17_30 <= KW_EXPORT)||(LA17_30 >= KW_FIELDS && LA17_30 <= KW_FIRST)||(LA17_30 >= KW_FORMAT && LA17_30 <= KW_FORMATTED)||LA17_30==KW_FUNCTIONS||(LA17_30 >= KW_HOUR && LA17_30 <= KW_IDXPROPERTIES)||(LA17_30 >= KW_INDEX && LA17_30 <= KW_INDEXES)||(LA17_30 >= KW_INPATH && LA17_30 <= KW_INPUTFORMAT)||(LA17_30 >= KW_ISOLATION && LA17_30 <= KW_JAR)||(LA17_30 >= KW_KEY && LA17_30 <= KW_LAST)||LA17_30==KW_LEVEL||(LA17_30 >= KW_LIMIT && LA17_30 <= KW_LOAD)||(LA17_30 >= KW_LOCATION && LA17_30 <= KW_LONG)||(LA17_30 >= KW_MAPJOIN && LA17_30 <= KW_MONTH)||LA17_30==KW_MSCK||(LA17_30 >= KW_NORELY && LA17_30 <= KW_NOSCAN)||LA17_30==KW_NOVALIDATE||LA17_30==KW_NULLS||LA17_30==KW_OFFSET||LA17_30==KW_OPTION||(LA17_30 >= KW_OUTPUTDRIVER && LA17_30 <= KW_OUTPUTFORMAT)||(LA17_30 >= KW_OVERWRITE && LA17_30 <= KW_OWNER)||(LA17_30 >= KW_PARTITIONED && LA17_30 <= KW_PARTITIONS)||LA17_30==KW_PLUS||LA17_30==KW_PRETTY||LA17_30==KW_PRINCIPALS||LA17_30==KW_PURGE||LA17_30==KW_READ||(LA17_30 >= KW_REBUILD && LA17_30 <= KW_RECORDWRITER)||(LA17_30 >= KW_RELOAD && LA17_30 <= KW_RESTRICT)||LA17_30==KW_REWRITE||(LA17_30 >= KW_ROLE && LA17_30 <= KW_ROLES)||(LA17_30 >= KW_SCHEMA && LA17_30 <= KW_SECOND)||(LA17_30 >= KW_SEMI && LA17_30 <= KW_SERVER)||(LA17_30 >= KW_SETS && LA17_30 <= KW_SKEWED)||(LA17_30 >= KW_SNAPSHOT && LA17_30 <= KW_SSL)||(LA17_30 >= KW_STATISTICS && LA17_30 <= KW_STRUCT)||LA17_30==KW_TABLES||(LA17_30 >= KW_TBLPROPERTIES && LA17_30 <= KW_TERMINATED)||LA17_30==KW_TINYINT||(LA17_30 >= KW_TOUCH && LA17_30 <= KW_TRANSACTIONS)||LA17_30==KW_UNARCHIVE||LA17_30==KW_UNDO||LA17_30==KW_UNIONTYPE||(LA17_30 >= KW_UNLOCK && LA17_30 <= KW_UNSIGNED)||(LA17_30 >= KW_URI && LA17_30 <= KW_USE)||(LA17_30 >= KW_UTC && LA17_30 <= KW_VALIDATE)||LA17_30==KW_VALUE_TYPE||LA17_30==KW_VIEW||LA17_30==KW_WHILE||(LA17_30 >= KW_WORK && LA17_30 <= KW_YEAR)||LA17_30==KW_HOLD_DDLTIME||LA17_30==KW_IGNORE||LA17_30==KW_NO_DROP||LA17_30==KW_OFFLINE||LA17_30==KW_PROTECTION||LA17_30==KW_READONLY) ) {s = 664;}
						else if ( ((LA17_30 >= KW_ALL && LA17_30 <= KW_ALTER)||(LA17_30 >= KW_ARRAY && LA17_30 <= KW_AS)||LA17_30==KW_AUTHORIZATION||(LA17_30 >= KW_BETWEEN && LA17_30 <= KW_BOTH)||LA17_30==KW_BY||LA17_30==KW_CONSTRAINT||LA17_30==KW_CREATE||LA17_30==KW_CUBE||(LA17_30 >= KW_CURRENT_DATE && LA17_30 <= KW_CURSOR)||LA17_30==KW_DATE||LA17_30==KW_DECIMAL||LA17_30==KW_DELETE||LA17_30==KW_DESCRIBE||(LA17_30 >= KW_DOUBLE && LA17_30 <= KW_DROP)||LA17_30==KW_EXISTS||(LA17_30 >= KW_EXTERNAL && LA17_30 <= KW_FETCH)||LA17_30==KW_FLOAT||(LA17_30 >= KW_FOR && LA17_30 <= KW_FOREIGN)||LA17_30==KW_FULL||(LA17_30 >= KW_GRANT && LA17_30 <= KW_GROUPING)||(LA17_30 >= KW_IMPORT && LA17_30 <= KW_IN)||LA17_30==KW_INNER||(LA17_30 >= KW_INSERT && LA17_30 <= KW_INTERSECT)||(LA17_30 >= KW_INTO && LA17_30 <= KW_IS)||(LA17_30 >= KW_LATERAL && LA17_30 <= KW_LEFT)||LA17_30==KW_LIKE||LA17_30==KW_LOCAL||LA17_30==KW_NONE||LA17_30==KW_NULL||LA17_30==KW_OF||(LA17_30 >= KW_ORDER && LA17_30 <= KW_OUTER)||LA17_30==KW_PARTITION||LA17_30==KW_PERCENT||LA17_30==KW_PRIMARY||LA17_30==KW_PROCEDURE||LA17_30==KW_RANGE||LA17_30==KW_READS||(LA17_30 >= KW_REFERENCES && LA17_30 <= KW_REGEXP)||LA17_30==KW_REVOKE||(LA17_30 >= KW_RIGHT && LA17_30 <= KW_RLIKE)||(LA17_30 >= KW_ROLLUP && LA17_30 <= KW_ROWS)||LA17_30==KW_SET||LA17_30==KW_SMALLINT||LA17_30==KW_TABLE||LA17_30==KW_TIMESTAMP||LA17_30==KW_TO||(LA17_30 >= KW_TRIGGER && LA17_30 <= KW_TRUNCATE)||LA17_30==KW_UNION||LA17_30==KW_UPDATE||(LA17_30 >= KW_USER && LA17_30 <= KW_USING)||LA17_30==KW_VALUES||LA17_30==KW_WITH) ) {s = 665;}
						 
						input.seek(index17_30);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_75 = input.LA(1);
						 
						int index17_75 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_75==STAR) && (synpred1_SelectClauseParser())) {s = 666;}
						else if ( (LA17_75==Identifier) ) {s = 667;}
						else if ( ((LA17_75 >= KW_ABORT && LA17_75 <= KW_AFTER)||LA17_75==KW_ANALYZE||LA17_75==KW_ARCHIVE||LA17_75==KW_ASC||(LA17_75 >= KW_AUTOCOMMIT && LA17_75 <= KW_BEFORE)||(LA17_75 >= KW_BUCKET && LA17_75 <= KW_BUCKETS)||LA17_75==KW_CASCADE||LA17_75==KW_CHANGE||(LA17_75 >= KW_CLUSTER && LA17_75 <= KW_COLLECTION)||(LA17_75 >= KW_COLUMNS && LA17_75 <= KW_COMMENT)||(LA17_75 >= KW_COMPACT && LA17_75 <= KW_CONCATENATE)||LA17_75==KW_CONTINUE||LA17_75==KW_DATA||LA17_75==KW_DATABASES||(LA17_75 >= KW_DATETIME && LA17_75 <= KW_DBPROPERTIES)||(LA17_75 >= KW_DEFERRED && LA17_75 <= KW_DEFINED)||(LA17_75 >= KW_DELIMITED && LA17_75 <= KW_DESC)||(LA17_75 >= KW_DIRECTORIES && LA17_75 <= KW_DISABLE)||LA17_75==KW_DISTRIBUTE||LA17_75==KW_ELEM_TYPE||LA17_75==KW_ENABLE||LA17_75==KW_ESCAPED||LA17_75==KW_EXCLUSIVE||(LA17_75 >= KW_EXPLAIN && LA17_75 <= KW_EXPORT)||(LA17_75 >= KW_FIELDS && LA17_75 <= KW_FIRST)||(LA17_75 >= KW_FORMAT && LA17_75 <= KW_FORMATTED)||LA17_75==KW_FUNCTIONS||(LA17_75 >= KW_HOUR && LA17_75 <= KW_IDXPROPERTIES)||(LA17_75 >= KW_INDEX && LA17_75 <= KW_INDEXES)||(LA17_75 >= KW_INPATH && LA17_75 <= KW_INPUTFORMAT)||(LA17_75 >= KW_ISOLATION && LA17_75 <= KW_JAR)||(LA17_75 >= KW_KEY && LA17_75 <= KW_LAST)||LA17_75==KW_LEVEL||(LA17_75 >= KW_LIMIT && LA17_75 <= KW_LOAD)||(LA17_75 >= KW_LOCATION && LA17_75 <= KW_LONG)||(LA17_75 >= KW_MAPJOIN && LA17_75 <= KW_MONTH)||LA17_75==KW_MSCK||(LA17_75 >= KW_NORELY && LA17_75 <= KW_NOSCAN)||LA17_75==KW_NOVALIDATE||LA17_75==KW_NULLS||LA17_75==KW_OFFSET||LA17_75==KW_OPTION||(LA17_75 >= KW_OUTPUTDRIVER && LA17_75 <= KW_OUTPUTFORMAT)||(LA17_75 >= KW_OVERWRITE && LA17_75 <= KW_OWNER)||(LA17_75 >= KW_PARTITIONED && LA17_75 <= KW_PARTITIONS)||LA17_75==KW_PLUS||LA17_75==KW_PRETTY||LA17_75==KW_PRINCIPALS||LA17_75==KW_PURGE||LA17_75==KW_READ||(LA17_75 >= KW_REBUILD && LA17_75 <= KW_RECORDWRITER)||(LA17_75 >= KW_RELOAD && LA17_75 <= KW_RESTRICT)||LA17_75==KW_REWRITE||(LA17_75 >= KW_ROLE && LA17_75 <= KW_ROLES)||(LA17_75 >= KW_SCHEMA && LA17_75 <= KW_SECOND)||(LA17_75 >= KW_SEMI && LA17_75 <= KW_SERVER)||(LA17_75 >= KW_SETS && LA17_75 <= KW_SKEWED)||(LA17_75 >= KW_SNAPSHOT && LA17_75 <= KW_SSL)||(LA17_75 >= KW_STATISTICS && LA17_75 <= KW_STRUCT)||LA17_75==KW_TABLES||(LA17_75 >= KW_TBLPROPERTIES && LA17_75 <= KW_TERMINATED)||LA17_75==KW_TINYINT||(LA17_75 >= KW_TOUCH && LA17_75 <= KW_TRANSACTIONS)||LA17_75==KW_UNARCHIVE||LA17_75==KW_UNDO||LA17_75==KW_UNIONTYPE||(LA17_75 >= KW_UNLOCK && LA17_75 <= KW_UNSIGNED)||(LA17_75 >= KW_URI && LA17_75 <= KW_USE)||(LA17_75 >= KW_UTC && LA17_75 <= KW_VALIDATE)||LA17_75==KW_VALUE_TYPE||LA17_75==KW_VIEW||LA17_75==KW_WHILE||(LA17_75 >= KW_WORK && LA17_75 <= KW_YEAR)||LA17_75==KW_HOLD_DDLTIME||LA17_75==KW_IGNORE||LA17_75==KW_NO_DROP||LA17_75==KW_OFFLINE||LA17_75==KW_PROTECTION||LA17_75==KW_READONLY) ) {s = 668;}
						else if ( ((LA17_75 >= KW_ALL && LA17_75 <= KW_ALTER)||(LA17_75 >= KW_ARRAY && LA17_75 <= KW_AS)||LA17_75==KW_AUTHORIZATION||(LA17_75 >= KW_BETWEEN && LA17_75 <= KW_BOTH)||LA17_75==KW_BY||LA17_75==KW_CONSTRAINT||LA17_75==KW_CREATE||LA17_75==KW_CUBE||(LA17_75 >= KW_CURRENT_DATE && LA17_75 <= KW_CURSOR)||LA17_75==KW_DATE||LA17_75==KW_DECIMAL||LA17_75==KW_DELETE||LA17_75==KW_DESCRIBE||(LA17_75 >= KW_DOUBLE && LA17_75 <= KW_DROP)||LA17_75==KW_EXISTS||(LA17_75 >= KW_EXTERNAL && LA17_75 <= KW_FETCH)||LA17_75==KW_FLOAT||(LA17_75 >= KW_FOR && LA17_75 <= KW_FOREIGN)||LA17_75==KW_FULL||(LA17_75 >= KW_GRANT && LA17_75 <= KW_GROUPING)||(LA17_75 >= KW_IMPORT && LA17_75 <= KW_IN)||LA17_75==KW_INNER||(LA17_75 >= KW_INSERT && LA17_75 <= KW_INTERSECT)||(LA17_75 >= KW_INTO && LA17_75 <= KW_IS)||(LA17_75 >= KW_LATERAL && LA17_75 <= KW_LEFT)||LA17_75==KW_LIKE||LA17_75==KW_LOCAL||LA17_75==KW_NONE||LA17_75==KW_NULL||LA17_75==KW_OF||(LA17_75 >= KW_ORDER && LA17_75 <= KW_OUTER)||LA17_75==KW_PARTITION||LA17_75==KW_PERCENT||LA17_75==KW_PRIMARY||LA17_75==KW_PROCEDURE||LA17_75==KW_RANGE||LA17_75==KW_READS||(LA17_75 >= KW_REFERENCES && LA17_75 <= KW_REGEXP)||LA17_75==KW_REVOKE||(LA17_75 >= KW_RIGHT && LA17_75 <= KW_RLIKE)||(LA17_75 >= KW_ROLLUP && LA17_75 <= KW_ROWS)||LA17_75==KW_SET||LA17_75==KW_SMALLINT||LA17_75==KW_TABLE||LA17_75==KW_TIMESTAMP||LA17_75==KW_TO||(LA17_75 >= KW_TRIGGER && LA17_75 <= KW_TRUNCATE)||LA17_75==KW_UNION||LA17_75==KW_UPDATE||(LA17_75 >= KW_USER && LA17_75 <= KW_USING)||LA17_75==KW_VALUES||LA17_75==KW_WITH) ) {s = 669;}
						 
						input.seek(index17_75);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_120 = input.LA(1);
						 
						int index17_120 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_120==STAR) && (synpred1_SelectClauseParser())) {s = 670;}
						else if ( (LA17_120==Identifier) ) {s = 671;}
						else if ( ((LA17_120 >= KW_ABORT && LA17_120 <= KW_AFTER)||LA17_120==KW_ANALYZE||LA17_120==KW_ARCHIVE||LA17_120==KW_ASC||(LA17_120 >= KW_AUTOCOMMIT && LA17_120 <= KW_BEFORE)||(LA17_120 >= KW_BUCKET && LA17_120 <= KW_BUCKETS)||LA17_120==KW_CASCADE||LA17_120==KW_CHANGE||(LA17_120 >= KW_CLUSTER && LA17_120 <= KW_COLLECTION)||(LA17_120 >= KW_COLUMNS && LA17_120 <= KW_COMMENT)||(LA17_120 >= KW_COMPACT && LA17_120 <= KW_CONCATENATE)||LA17_120==KW_CONTINUE||LA17_120==KW_DATA||LA17_120==KW_DATABASES||(LA17_120 >= KW_DATETIME && LA17_120 <= KW_DBPROPERTIES)||(LA17_120 >= KW_DEFERRED && LA17_120 <= KW_DEFINED)||(LA17_120 >= KW_DELIMITED && LA17_120 <= KW_DESC)||(LA17_120 >= KW_DIRECTORIES && LA17_120 <= KW_DISABLE)||LA17_120==KW_DISTRIBUTE||LA17_120==KW_ELEM_TYPE||LA17_120==KW_ENABLE||LA17_120==KW_ESCAPED||LA17_120==KW_EXCLUSIVE||(LA17_120 >= KW_EXPLAIN && LA17_120 <= KW_EXPORT)||(LA17_120 >= KW_FIELDS && LA17_120 <= KW_FIRST)||(LA17_120 >= KW_FORMAT && LA17_120 <= KW_FORMATTED)||LA17_120==KW_FUNCTIONS||(LA17_120 >= KW_HOUR && LA17_120 <= KW_IDXPROPERTIES)||(LA17_120 >= KW_INDEX && LA17_120 <= KW_INDEXES)||(LA17_120 >= KW_INPATH && LA17_120 <= KW_INPUTFORMAT)||(LA17_120 >= KW_ISOLATION && LA17_120 <= KW_JAR)||(LA17_120 >= KW_KEY && LA17_120 <= KW_LAST)||LA17_120==KW_LEVEL||(LA17_120 >= KW_LIMIT && LA17_120 <= KW_LOAD)||(LA17_120 >= KW_LOCATION && LA17_120 <= KW_LONG)||(LA17_120 >= KW_MAPJOIN && LA17_120 <= KW_MONTH)||LA17_120==KW_MSCK||(LA17_120 >= KW_NORELY && LA17_120 <= KW_NOSCAN)||LA17_120==KW_NOVALIDATE||LA17_120==KW_NULLS||LA17_120==KW_OFFSET||LA17_120==KW_OPTION||(LA17_120 >= KW_OUTPUTDRIVER && LA17_120 <= KW_OUTPUTFORMAT)||(LA17_120 >= KW_OVERWRITE && LA17_120 <= KW_OWNER)||(LA17_120 >= KW_PARTITIONED && LA17_120 <= KW_PARTITIONS)||LA17_120==KW_PLUS||LA17_120==KW_PRETTY||LA17_120==KW_PRINCIPALS||LA17_120==KW_PURGE||LA17_120==KW_READ||(LA17_120 >= KW_REBUILD && LA17_120 <= KW_RECORDWRITER)||(LA17_120 >= KW_RELOAD && LA17_120 <= KW_RESTRICT)||LA17_120==KW_REWRITE||(LA17_120 >= KW_ROLE && LA17_120 <= KW_ROLES)||(LA17_120 >= KW_SCHEMA && LA17_120 <= KW_SECOND)||(LA17_120 >= KW_SEMI && LA17_120 <= KW_SERVER)||(LA17_120 >= KW_SETS && LA17_120 <= KW_SKEWED)||(LA17_120 >= KW_SNAPSHOT && LA17_120 <= KW_SSL)||(LA17_120 >= KW_STATISTICS && LA17_120 <= KW_STRUCT)||LA17_120==KW_TABLES||(LA17_120 >= KW_TBLPROPERTIES && LA17_120 <= KW_TERMINATED)||LA17_120==KW_TINYINT||(LA17_120 >= KW_TOUCH && LA17_120 <= KW_TRANSACTIONS)||LA17_120==KW_UNARCHIVE||LA17_120==KW_UNDO||LA17_120==KW_UNIONTYPE||(LA17_120 >= KW_UNLOCK && LA17_120 <= KW_UNSIGNED)||(LA17_120 >= KW_URI && LA17_120 <= KW_USE)||(LA17_120 >= KW_UTC && LA17_120 <= KW_VALIDATE)||LA17_120==KW_VALUE_TYPE||LA17_120==KW_VIEW||LA17_120==KW_WHILE||(LA17_120 >= KW_WORK && LA17_120 <= KW_YEAR)||LA17_120==KW_HOLD_DDLTIME||LA17_120==KW_IGNORE||LA17_120==KW_NO_DROP||LA17_120==KW_OFFLINE||LA17_120==KW_PROTECTION||LA17_120==KW_READONLY) ) {s = 672;}
						else if ( ((LA17_120 >= KW_ALL && LA17_120 <= KW_ALTER)||(LA17_120 >= KW_ARRAY && LA17_120 <= KW_AS)||LA17_120==KW_AUTHORIZATION||(LA17_120 >= KW_BETWEEN && LA17_120 <= KW_BOTH)||LA17_120==KW_BY||LA17_120==KW_CONSTRAINT||LA17_120==KW_CREATE||LA17_120==KW_CUBE||(LA17_120 >= KW_CURRENT_DATE && LA17_120 <= KW_CURSOR)||LA17_120==KW_DATE||LA17_120==KW_DECIMAL||LA17_120==KW_DELETE||LA17_120==KW_DESCRIBE||(LA17_120 >= KW_DOUBLE && LA17_120 <= KW_DROP)||LA17_120==KW_EXISTS||(LA17_120 >= KW_EXTERNAL && LA17_120 <= KW_FETCH)||LA17_120==KW_FLOAT||(LA17_120 >= KW_FOR && LA17_120 <= KW_FOREIGN)||LA17_120==KW_FULL||(LA17_120 >= KW_GRANT && LA17_120 <= KW_GROUPING)||(LA17_120 >= KW_IMPORT && LA17_120 <= KW_IN)||LA17_120==KW_INNER||(LA17_120 >= KW_INSERT && LA17_120 <= KW_INTERSECT)||(LA17_120 >= KW_INTO && LA17_120 <= KW_IS)||(LA17_120 >= KW_LATERAL && LA17_120 <= KW_LEFT)||LA17_120==KW_LIKE||LA17_120==KW_LOCAL||LA17_120==KW_NONE||LA17_120==KW_NULL||LA17_120==KW_OF||(LA17_120 >= KW_ORDER && LA17_120 <= KW_OUTER)||LA17_120==KW_PARTITION||LA17_120==KW_PERCENT||LA17_120==KW_PRIMARY||LA17_120==KW_PROCEDURE||LA17_120==KW_RANGE||LA17_120==KW_READS||(LA17_120 >= KW_REFERENCES && LA17_120 <= KW_REGEXP)||LA17_120==KW_REVOKE||(LA17_120 >= KW_RIGHT && LA17_120 <= KW_RLIKE)||(LA17_120 >= KW_ROLLUP && LA17_120 <= KW_ROWS)||LA17_120==KW_SET||LA17_120==KW_SMALLINT||LA17_120==KW_TABLE||LA17_120==KW_TIMESTAMP||LA17_120==KW_TO||(LA17_120 >= KW_TRIGGER && LA17_120 <= KW_TRUNCATE)||LA17_120==KW_UNION||LA17_120==KW_UPDATE||(LA17_120 >= KW_USER && LA17_120 <= KW_USING)||LA17_120==KW_VALUES||LA17_120==KW_WITH) ) {s = 673;}
						 
						input.seek(index17_120);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_166 = input.LA(1);
						 
						int index17_166 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_166==STAR) && (synpred1_SelectClauseParser())) {s = 674;}
						else if ( (LA17_166==Identifier) ) {s = 675;}
						else if ( ((LA17_166 >= KW_ABORT && LA17_166 <= KW_AFTER)||LA17_166==KW_ANALYZE||LA17_166==KW_ARCHIVE||LA17_166==KW_ASC||(LA17_166 >= KW_AUTOCOMMIT && LA17_166 <= KW_BEFORE)||(LA17_166 >= KW_BUCKET && LA17_166 <= KW_BUCKETS)||LA17_166==KW_CASCADE||LA17_166==KW_CHANGE||(LA17_166 >= KW_CLUSTER && LA17_166 <= KW_COLLECTION)||(LA17_166 >= KW_COLUMNS && LA17_166 <= KW_COMMENT)||(LA17_166 >= KW_COMPACT && LA17_166 <= KW_CONCATENATE)||LA17_166==KW_CONTINUE||LA17_166==KW_DATA||LA17_166==KW_DATABASES||(LA17_166 >= KW_DATETIME && LA17_166 <= KW_DBPROPERTIES)||(LA17_166 >= KW_DEFERRED && LA17_166 <= KW_DEFINED)||(LA17_166 >= KW_DELIMITED && LA17_166 <= KW_DESC)||(LA17_166 >= KW_DIRECTORIES && LA17_166 <= KW_DISABLE)||LA17_166==KW_DISTRIBUTE||LA17_166==KW_ELEM_TYPE||LA17_166==KW_ENABLE||LA17_166==KW_ESCAPED||LA17_166==KW_EXCLUSIVE||(LA17_166 >= KW_EXPLAIN && LA17_166 <= KW_EXPORT)||(LA17_166 >= KW_FIELDS && LA17_166 <= KW_FIRST)||(LA17_166 >= KW_FORMAT && LA17_166 <= KW_FORMATTED)||LA17_166==KW_FUNCTIONS||(LA17_166 >= KW_HOUR && LA17_166 <= KW_IDXPROPERTIES)||(LA17_166 >= KW_INDEX && LA17_166 <= KW_INDEXES)||(LA17_166 >= KW_INPATH && LA17_166 <= KW_INPUTFORMAT)||(LA17_166 >= KW_ISOLATION && LA17_166 <= KW_JAR)||(LA17_166 >= KW_KEY && LA17_166 <= KW_LAST)||LA17_166==KW_LEVEL||(LA17_166 >= KW_LIMIT && LA17_166 <= KW_LOAD)||(LA17_166 >= KW_LOCATION && LA17_166 <= KW_LONG)||(LA17_166 >= KW_MAPJOIN && LA17_166 <= KW_MONTH)||LA17_166==KW_MSCK||(LA17_166 >= KW_NORELY && LA17_166 <= KW_NOSCAN)||LA17_166==KW_NOVALIDATE||LA17_166==KW_NULLS||LA17_166==KW_OFFSET||LA17_166==KW_OPTION||(LA17_166 >= KW_OUTPUTDRIVER && LA17_166 <= KW_OUTPUTFORMAT)||(LA17_166 >= KW_OVERWRITE && LA17_166 <= KW_OWNER)||(LA17_166 >= KW_PARTITIONED && LA17_166 <= KW_PARTITIONS)||LA17_166==KW_PLUS||LA17_166==KW_PRETTY||LA17_166==KW_PRINCIPALS||LA17_166==KW_PURGE||LA17_166==KW_READ||(LA17_166 >= KW_REBUILD && LA17_166 <= KW_RECORDWRITER)||(LA17_166 >= KW_RELOAD && LA17_166 <= KW_RESTRICT)||LA17_166==KW_REWRITE||(LA17_166 >= KW_ROLE && LA17_166 <= KW_ROLES)||(LA17_166 >= KW_SCHEMA && LA17_166 <= KW_SECOND)||(LA17_166 >= KW_SEMI && LA17_166 <= KW_SERVER)||(LA17_166 >= KW_SETS && LA17_166 <= KW_SKEWED)||(LA17_166 >= KW_SNAPSHOT && LA17_166 <= KW_SSL)||(LA17_166 >= KW_STATISTICS && LA17_166 <= KW_STRUCT)||LA17_166==KW_TABLES||(LA17_166 >= KW_TBLPROPERTIES && LA17_166 <= KW_TERMINATED)||LA17_166==KW_TINYINT||(LA17_166 >= KW_TOUCH && LA17_166 <= KW_TRANSACTIONS)||LA17_166==KW_UNARCHIVE||LA17_166==KW_UNDO||LA17_166==KW_UNIONTYPE||(LA17_166 >= KW_UNLOCK && LA17_166 <= KW_UNSIGNED)||(LA17_166 >= KW_URI && LA17_166 <= KW_USE)||(LA17_166 >= KW_UTC && LA17_166 <= KW_VALIDATE)||LA17_166==KW_VALUE_TYPE||LA17_166==KW_VIEW||LA17_166==KW_WHILE||(LA17_166 >= KW_WORK && LA17_166 <= KW_YEAR)||LA17_166==KW_HOLD_DDLTIME||LA17_166==KW_IGNORE||LA17_166==KW_NO_DROP||LA17_166==KW_OFFLINE||LA17_166==KW_PROTECTION||LA17_166==KW_READONLY) ) {s = 676;}
						else if ( ((LA17_166 >= KW_ALL && LA17_166 <= KW_ALTER)||(LA17_166 >= KW_ARRAY && LA17_166 <= KW_AS)||LA17_166==KW_AUTHORIZATION||(LA17_166 >= KW_BETWEEN && LA17_166 <= KW_BOTH)||LA17_166==KW_BY||LA17_166==KW_CONSTRAINT||LA17_166==KW_CREATE||LA17_166==KW_CUBE||(LA17_166 >= KW_CURRENT_DATE && LA17_166 <= KW_CURSOR)||LA17_166==KW_DATE||LA17_166==KW_DECIMAL||LA17_166==KW_DELETE||LA17_166==KW_DESCRIBE||(LA17_166 >= KW_DOUBLE && LA17_166 <= KW_DROP)||LA17_166==KW_EXISTS||(LA17_166 >= KW_EXTERNAL && LA17_166 <= KW_FETCH)||LA17_166==KW_FLOAT||(LA17_166 >= KW_FOR && LA17_166 <= KW_FOREIGN)||LA17_166==KW_FULL||(LA17_166 >= KW_GRANT && LA17_166 <= KW_GROUPING)||(LA17_166 >= KW_IMPORT && LA17_166 <= KW_IN)||LA17_166==KW_INNER||(LA17_166 >= KW_INSERT && LA17_166 <= KW_INTERSECT)||(LA17_166 >= KW_INTO && LA17_166 <= KW_IS)||(LA17_166 >= KW_LATERAL && LA17_166 <= KW_LEFT)||LA17_166==KW_LIKE||LA17_166==KW_LOCAL||LA17_166==KW_NONE||LA17_166==KW_NULL||LA17_166==KW_OF||(LA17_166 >= KW_ORDER && LA17_166 <= KW_OUTER)||LA17_166==KW_PARTITION||LA17_166==KW_PERCENT||LA17_166==KW_PRIMARY||LA17_166==KW_PROCEDURE||LA17_166==KW_RANGE||LA17_166==KW_READS||(LA17_166 >= KW_REFERENCES && LA17_166 <= KW_REGEXP)||LA17_166==KW_REVOKE||(LA17_166 >= KW_RIGHT && LA17_166 <= KW_RLIKE)||(LA17_166 >= KW_ROLLUP && LA17_166 <= KW_ROWS)||LA17_166==KW_SET||LA17_166==KW_SMALLINT||LA17_166==KW_TABLE||LA17_166==KW_TIMESTAMP||LA17_166==KW_TO||(LA17_166 >= KW_TRIGGER && LA17_166 <= KW_TRUNCATE)||LA17_166==KW_UNION||LA17_166==KW_UPDATE||(LA17_166 >= KW_USER && LA17_166 <= KW_USING)||LA17_166==KW_VALUES||LA17_166==KW_WITH) ) {s = 677;}
						 
						input.seek(index17_166);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_211 = input.LA(1);
						 
						int index17_211 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_211==STAR) && (synpred1_SelectClauseParser())) {s = 678;}
						else if ( (LA17_211==Identifier) ) {s = 679;}
						else if ( ((LA17_211 >= KW_ABORT && LA17_211 <= KW_AFTER)||LA17_211==KW_ANALYZE||LA17_211==KW_ARCHIVE||LA17_211==KW_ASC||(LA17_211 >= KW_AUTOCOMMIT && LA17_211 <= KW_BEFORE)||(LA17_211 >= KW_BUCKET && LA17_211 <= KW_BUCKETS)||LA17_211==KW_CASCADE||LA17_211==KW_CHANGE||(LA17_211 >= KW_CLUSTER && LA17_211 <= KW_COLLECTION)||(LA17_211 >= KW_COLUMNS && LA17_211 <= KW_COMMENT)||(LA17_211 >= KW_COMPACT && LA17_211 <= KW_CONCATENATE)||LA17_211==KW_CONTINUE||LA17_211==KW_DATA||LA17_211==KW_DATABASES||(LA17_211 >= KW_DATETIME && LA17_211 <= KW_DBPROPERTIES)||(LA17_211 >= KW_DEFERRED && LA17_211 <= KW_DEFINED)||(LA17_211 >= KW_DELIMITED && LA17_211 <= KW_DESC)||(LA17_211 >= KW_DIRECTORIES && LA17_211 <= KW_DISABLE)||LA17_211==KW_DISTRIBUTE||LA17_211==KW_ELEM_TYPE||LA17_211==KW_ENABLE||LA17_211==KW_ESCAPED||LA17_211==KW_EXCLUSIVE||(LA17_211 >= KW_EXPLAIN && LA17_211 <= KW_EXPORT)||(LA17_211 >= KW_FIELDS && LA17_211 <= KW_FIRST)||(LA17_211 >= KW_FORMAT && LA17_211 <= KW_FORMATTED)||LA17_211==KW_FUNCTIONS||(LA17_211 >= KW_HOUR && LA17_211 <= KW_IDXPROPERTIES)||(LA17_211 >= KW_INDEX && LA17_211 <= KW_INDEXES)||(LA17_211 >= KW_INPATH && LA17_211 <= KW_INPUTFORMAT)||(LA17_211 >= KW_ISOLATION && LA17_211 <= KW_JAR)||(LA17_211 >= KW_KEY && LA17_211 <= KW_LAST)||LA17_211==KW_LEVEL||(LA17_211 >= KW_LIMIT && LA17_211 <= KW_LOAD)||(LA17_211 >= KW_LOCATION && LA17_211 <= KW_LONG)||(LA17_211 >= KW_MAPJOIN && LA17_211 <= KW_MONTH)||LA17_211==KW_MSCK||(LA17_211 >= KW_NORELY && LA17_211 <= KW_NOSCAN)||LA17_211==KW_NOVALIDATE||LA17_211==KW_NULLS||LA17_211==KW_OFFSET||LA17_211==KW_OPTION||(LA17_211 >= KW_OUTPUTDRIVER && LA17_211 <= KW_OUTPUTFORMAT)||(LA17_211 >= KW_OVERWRITE && LA17_211 <= KW_OWNER)||(LA17_211 >= KW_PARTITIONED && LA17_211 <= KW_PARTITIONS)||LA17_211==KW_PLUS||LA17_211==KW_PRETTY||LA17_211==KW_PRINCIPALS||LA17_211==KW_PURGE||LA17_211==KW_READ||(LA17_211 >= KW_REBUILD && LA17_211 <= KW_RECORDWRITER)||(LA17_211 >= KW_RELOAD && LA17_211 <= KW_RESTRICT)||LA17_211==KW_REWRITE||(LA17_211 >= KW_ROLE && LA17_211 <= KW_ROLES)||(LA17_211 >= KW_SCHEMA && LA17_211 <= KW_SECOND)||(LA17_211 >= KW_SEMI && LA17_211 <= KW_SERVER)||(LA17_211 >= KW_SETS && LA17_211 <= KW_SKEWED)||(LA17_211 >= KW_SNAPSHOT && LA17_211 <= KW_SSL)||(LA17_211 >= KW_STATISTICS && LA17_211 <= KW_STRUCT)||LA17_211==KW_TABLES||(LA17_211 >= KW_TBLPROPERTIES && LA17_211 <= KW_TERMINATED)||LA17_211==KW_TINYINT||(LA17_211 >= KW_TOUCH && LA17_211 <= KW_TRANSACTIONS)||LA17_211==KW_UNARCHIVE||LA17_211==KW_UNDO||LA17_211==KW_UNIONTYPE||(LA17_211 >= KW_UNLOCK && LA17_211 <= KW_UNSIGNED)||(LA17_211 >= KW_URI && LA17_211 <= KW_USE)||(LA17_211 >= KW_UTC && LA17_211 <= KW_VALIDATE)||LA17_211==KW_VALUE_TYPE||LA17_211==KW_VIEW||LA17_211==KW_WHILE||(LA17_211 >= KW_WORK && LA17_211 <= KW_YEAR)||LA17_211==KW_HOLD_DDLTIME||LA17_211==KW_IGNORE||LA17_211==KW_NO_DROP||LA17_211==KW_OFFLINE||LA17_211==KW_PROTECTION||LA17_211==KW_READONLY) ) {s = 680;}
						else if ( ((LA17_211 >= KW_ALL && LA17_211 <= KW_ALTER)||(LA17_211 >= KW_ARRAY && LA17_211 <= KW_AS)||LA17_211==KW_AUTHORIZATION||(LA17_211 >= KW_BETWEEN && LA17_211 <= KW_BOTH)||LA17_211==KW_BY||LA17_211==KW_CONSTRAINT||LA17_211==KW_CREATE||LA17_211==KW_CUBE||(LA17_211 >= KW_CURRENT_DATE && LA17_211 <= KW_CURSOR)||LA17_211==KW_DATE||LA17_211==KW_DECIMAL||LA17_211==KW_DELETE||LA17_211==KW_DESCRIBE||(LA17_211 >= KW_DOUBLE && LA17_211 <= KW_DROP)||LA17_211==KW_EXISTS||(LA17_211 >= KW_EXTERNAL && LA17_211 <= KW_FETCH)||LA17_211==KW_FLOAT||(LA17_211 >= KW_FOR && LA17_211 <= KW_FOREIGN)||LA17_211==KW_FULL||(LA17_211 >= KW_GRANT && LA17_211 <= KW_GROUPING)||(LA17_211 >= KW_IMPORT && LA17_211 <= KW_IN)||LA17_211==KW_INNER||(LA17_211 >= KW_INSERT && LA17_211 <= KW_INTERSECT)||(LA17_211 >= KW_INTO && LA17_211 <= KW_IS)||(LA17_211 >= KW_LATERAL && LA17_211 <= KW_LEFT)||LA17_211==KW_LIKE||LA17_211==KW_LOCAL||LA17_211==KW_NONE||LA17_211==KW_NULL||LA17_211==KW_OF||(LA17_211 >= KW_ORDER && LA17_211 <= KW_OUTER)||LA17_211==KW_PARTITION||LA17_211==KW_PERCENT||LA17_211==KW_PRIMARY||LA17_211==KW_PROCEDURE||LA17_211==KW_RANGE||LA17_211==KW_READS||(LA17_211 >= KW_REFERENCES && LA17_211 <= KW_REGEXP)||LA17_211==KW_REVOKE||(LA17_211 >= KW_RIGHT && LA17_211 <= KW_RLIKE)||(LA17_211 >= KW_ROLLUP && LA17_211 <= KW_ROWS)||LA17_211==KW_SET||LA17_211==KW_SMALLINT||LA17_211==KW_TABLE||LA17_211==KW_TIMESTAMP||LA17_211==KW_TO||(LA17_211 >= KW_TRIGGER && LA17_211 <= KW_TRUNCATE)||LA17_211==KW_UNION||LA17_211==KW_UPDATE||(LA17_211 >= KW_USER && LA17_211 <= KW_USING)||LA17_211==KW_VALUES||LA17_211==KW_WITH) ) {s = 681;}
						 
						input.seek(index17_211);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_257 = input.LA(1);
						 
						int index17_257 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_257==STAR) && (synpred1_SelectClauseParser())) {s = 682;}
						else if ( (LA17_257==Identifier) ) {s = 683;}
						else if ( ((LA17_257 >= KW_ABORT && LA17_257 <= KW_AFTER)||LA17_257==KW_ANALYZE||LA17_257==KW_ARCHIVE||LA17_257==KW_ASC||(LA17_257 >= KW_AUTOCOMMIT && LA17_257 <= KW_BEFORE)||(LA17_257 >= KW_BUCKET && LA17_257 <= KW_BUCKETS)||LA17_257==KW_CASCADE||LA17_257==KW_CHANGE||(LA17_257 >= KW_CLUSTER && LA17_257 <= KW_COLLECTION)||(LA17_257 >= KW_COLUMNS && LA17_257 <= KW_COMMENT)||(LA17_257 >= KW_COMPACT && LA17_257 <= KW_CONCATENATE)||LA17_257==KW_CONTINUE||LA17_257==KW_DATA||LA17_257==KW_DATABASES||(LA17_257 >= KW_DATETIME && LA17_257 <= KW_DBPROPERTIES)||(LA17_257 >= KW_DEFERRED && LA17_257 <= KW_DEFINED)||(LA17_257 >= KW_DELIMITED && LA17_257 <= KW_DESC)||(LA17_257 >= KW_DIRECTORIES && LA17_257 <= KW_DISABLE)||LA17_257==KW_DISTRIBUTE||LA17_257==KW_ELEM_TYPE||LA17_257==KW_ENABLE||LA17_257==KW_ESCAPED||LA17_257==KW_EXCLUSIVE||(LA17_257 >= KW_EXPLAIN && LA17_257 <= KW_EXPORT)||(LA17_257 >= KW_FIELDS && LA17_257 <= KW_FIRST)||(LA17_257 >= KW_FORMAT && LA17_257 <= KW_FORMATTED)||LA17_257==KW_FUNCTIONS||(LA17_257 >= KW_HOUR && LA17_257 <= KW_IDXPROPERTIES)||(LA17_257 >= KW_INDEX && LA17_257 <= KW_INDEXES)||(LA17_257 >= KW_INPATH && LA17_257 <= KW_INPUTFORMAT)||(LA17_257 >= KW_ISOLATION && LA17_257 <= KW_JAR)||(LA17_257 >= KW_KEY && LA17_257 <= KW_LAST)||LA17_257==KW_LEVEL||(LA17_257 >= KW_LIMIT && LA17_257 <= KW_LOAD)||(LA17_257 >= KW_LOCATION && LA17_257 <= KW_LONG)||(LA17_257 >= KW_MAPJOIN && LA17_257 <= KW_MONTH)||LA17_257==KW_MSCK||(LA17_257 >= KW_NORELY && LA17_257 <= KW_NOSCAN)||LA17_257==KW_NOVALIDATE||LA17_257==KW_NULLS||LA17_257==KW_OFFSET||LA17_257==KW_OPTION||(LA17_257 >= KW_OUTPUTDRIVER && LA17_257 <= KW_OUTPUTFORMAT)||(LA17_257 >= KW_OVERWRITE && LA17_257 <= KW_OWNER)||(LA17_257 >= KW_PARTITIONED && LA17_257 <= KW_PARTITIONS)||LA17_257==KW_PLUS||LA17_257==KW_PRETTY||LA17_257==KW_PRINCIPALS||LA17_257==KW_PURGE||LA17_257==KW_READ||(LA17_257 >= KW_REBUILD && LA17_257 <= KW_RECORDWRITER)||(LA17_257 >= KW_RELOAD && LA17_257 <= KW_RESTRICT)||LA17_257==KW_REWRITE||(LA17_257 >= KW_ROLE && LA17_257 <= KW_ROLES)||(LA17_257 >= KW_SCHEMA && LA17_257 <= KW_SECOND)||(LA17_257 >= KW_SEMI && LA17_257 <= KW_SERVER)||(LA17_257 >= KW_SETS && LA17_257 <= KW_SKEWED)||(LA17_257 >= KW_SNAPSHOT && LA17_257 <= KW_SSL)||(LA17_257 >= KW_STATISTICS && LA17_257 <= KW_STRUCT)||LA17_257==KW_TABLES||(LA17_257 >= KW_TBLPROPERTIES && LA17_257 <= KW_TERMINATED)||LA17_257==KW_TINYINT||(LA17_257 >= KW_TOUCH && LA17_257 <= KW_TRANSACTIONS)||LA17_257==KW_UNARCHIVE||LA17_257==KW_UNDO||LA17_257==KW_UNIONTYPE||(LA17_257 >= KW_UNLOCK && LA17_257 <= KW_UNSIGNED)||(LA17_257 >= KW_URI && LA17_257 <= KW_USE)||(LA17_257 >= KW_UTC && LA17_257 <= KW_VALIDATE)||LA17_257==KW_VALUE_TYPE||LA17_257==KW_VIEW||LA17_257==KW_WHILE||(LA17_257 >= KW_WORK && LA17_257 <= KW_YEAR)||LA17_257==KW_HOLD_DDLTIME||LA17_257==KW_IGNORE||LA17_257==KW_NO_DROP||LA17_257==KW_OFFLINE||LA17_257==KW_PROTECTION||LA17_257==KW_READONLY) ) {s = 684;}
						else if ( ((LA17_257 >= KW_ALL && LA17_257 <= KW_ALTER)||(LA17_257 >= KW_ARRAY && LA17_257 <= KW_AS)||LA17_257==KW_AUTHORIZATION||(LA17_257 >= KW_BETWEEN && LA17_257 <= KW_BOTH)||LA17_257==KW_BY||LA17_257==KW_CONSTRAINT||LA17_257==KW_CREATE||LA17_257==KW_CUBE||(LA17_257 >= KW_CURRENT_DATE && LA17_257 <= KW_CURSOR)||LA17_257==KW_DATE||LA17_257==KW_DECIMAL||LA17_257==KW_DELETE||LA17_257==KW_DESCRIBE||(LA17_257 >= KW_DOUBLE && LA17_257 <= KW_DROP)||LA17_257==KW_EXISTS||(LA17_257 >= KW_EXTERNAL && LA17_257 <= KW_FETCH)||LA17_257==KW_FLOAT||(LA17_257 >= KW_FOR && LA17_257 <= KW_FOREIGN)||LA17_257==KW_FULL||(LA17_257 >= KW_GRANT && LA17_257 <= KW_GROUPING)||(LA17_257 >= KW_IMPORT && LA17_257 <= KW_IN)||LA17_257==KW_INNER||(LA17_257 >= KW_INSERT && LA17_257 <= KW_INTERSECT)||(LA17_257 >= KW_INTO && LA17_257 <= KW_IS)||(LA17_257 >= KW_LATERAL && LA17_257 <= KW_LEFT)||LA17_257==KW_LIKE||LA17_257==KW_LOCAL||LA17_257==KW_NONE||LA17_257==KW_NULL||LA17_257==KW_OF||(LA17_257 >= KW_ORDER && LA17_257 <= KW_OUTER)||LA17_257==KW_PARTITION||LA17_257==KW_PERCENT||LA17_257==KW_PRIMARY||LA17_257==KW_PROCEDURE||LA17_257==KW_RANGE||LA17_257==KW_READS||(LA17_257 >= KW_REFERENCES && LA17_257 <= KW_REGEXP)||LA17_257==KW_REVOKE||(LA17_257 >= KW_RIGHT && LA17_257 <= KW_RLIKE)||(LA17_257 >= KW_ROLLUP && LA17_257 <= KW_ROWS)||LA17_257==KW_SET||LA17_257==KW_SMALLINT||LA17_257==KW_TABLE||LA17_257==KW_TIMESTAMP||LA17_257==KW_TO||(LA17_257 >= KW_TRIGGER && LA17_257 <= KW_TRUNCATE)||LA17_257==KW_UNION||LA17_257==KW_UPDATE||(LA17_257 >= KW_USER && LA17_257 <= KW_USING)||LA17_257==KW_VALUES||LA17_257==KW_WITH) ) {s = 685;}
						 
						input.seek(index17_257);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_302 = input.LA(1);
						 
						int index17_302 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_302==STAR) && (synpred1_SelectClauseParser())) {s = 686;}
						else if ( (LA17_302==Identifier) ) {s = 687;}
						else if ( ((LA17_302 >= KW_ABORT && LA17_302 <= KW_AFTER)||LA17_302==KW_ANALYZE||LA17_302==KW_ARCHIVE||LA17_302==KW_ASC||(LA17_302 >= KW_AUTOCOMMIT && LA17_302 <= KW_BEFORE)||(LA17_302 >= KW_BUCKET && LA17_302 <= KW_BUCKETS)||LA17_302==KW_CASCADE||LA17_302==KW_CHANGE||(LA17_302 >= KW_CLUSTER && LA17_302 <= KW_COLLECTION)||(LA17_302 >= KW_COLUMNS && LA17_302 <= KW_COMMENT)||(LA17_302 >= KW_COMPACT && LA17_302 <= KW_CONCATENATE)||LA17_302==KW_CONTINUE||LA17_302==KW_DATA||LA17_302==KW_DATABASES||(LA17_302 >= KW_DATETIME && LA17_302 <= KW_DBPROPERTIES)||(LA17_302 >= KW_DEFERRED && LA17_302 <= KW_DEFINED)||(LA17_302 >= KW_DELIMITED && LA17_302 <= KW_DESC)||(LA17_302 >= KW_DIRECTORIES && LA17_302 <= KW_DISABLE)||LA17_302==KW_DISTRIBUTE||LA17_302==KW_ELEM_TYPE||LA17_302==KW_ENABLE||LA17_302==KW_ESCAPED||LA17_302==KW_EXCLUSIVE||(LA17_302 >= KW_EXPLAIN && LA17_302 <= KW_EXPORT)||(LA17_302 >= KW_FIELDS && LA17_302 <= KW_FIRST)||(LA17_302 >= KW_FORMAT && LA17_302 <= KW_FORMATTED)||LA17_302==KW_FUNCTIONS||(LA17_302 >= KW_HOUR && LA17_302 <= KW_IDXPROPERTIES)||(LA17_302 >= KW_INDEX && LA17_302 <= KW_INDEXES)||(LA17_302 >= KW_INPATH && LA17_302 <= KW_INPUTFORMAT)||(LA17_302 >= KW_ISOLATION && LA17_302 <= KW_JAR)||(LA17_302 >= KW_KEY && LA17_302 <= KW_LAST)||LA17_302==KW_LEVEL||(LA17_302 >= KW_LIMIT && LA17_302 <= KW_LOAD)||(LA17_302 >= KW_LOCATION && LA17_302 <= KW_LONG)||(LA17_302 >= KW_MAPJOIN && LA17_302 <= KW_MONTH)||LA17_302==KW_MSCK||(LA17_302 >= KW_NORELY && LA17_302 <= KW_NOSCAN)||LA17_302==KW_NOVALIDATE||LA17_302==KW_NULLS||LA17_302==KW_OFFSET||LA17_302==KW_OPTION||(LA17_302 >= KW_OUTPUTDRIVER && LA17_302 <= KW_OUTPUTFORMAT)||(LA17_302 >= KW_OVERWRITE && LA17_302 <= KW_OWNER)||(LA17_302 >= KW_PARTITIONED && LA17_302 <= KW_PARTITIONS)||LA17_302==KW_PLUS||LA17_302==KW_PRETTY||LA17_302==KW_PRINCIPALS||LA17_302==KW_PURGE||LA17_302==KW_READ||(LA17_302 >= KW_REBUILD && LA17_302 <= KW_RECORDWRITER)||(LA17_302 >= KW_RELOAD && LA17_302 <= KW_RESTRICT)||LA17_302==KW_REWRITE||(LA17_302 >= KW_ROLE && LA17_302 <= KW_ROLES)||(LA17_302 >= KW_SCHEMA && LA17_302 <= KW_SECOND)||(LA17_302 >= KW_SEMI && LA17_302 <= KW_SERVER)||(LA17_302 >= KW_SETS && LA17_302 <= KW_SKEWED)||(LA17_302 >= KW_SNAPSHOT && LA17_302 <= KW_SSL)||(LA17_302 >= KW_STATISTICS && LA17_302 <= KW_STRUCT)||LA17_302==KW_TABLES||(LA17_302 >= KW_TBLPROPERTIES && LA17_302 <= KW_TERMINATED)||LA17_302==KW_TINYINT||(LA17_302 >= KW_TOUCH && LA17_302 <= KW_TRANSACTIONS)||LA17_302==KW_UNARCHIVE||LA17_302==KW_UNDO||LA17_302==KW_UNIONTYPE||(LA17_302 >= KW_UNLOCK && LA17_302 <= KW_UNSIGNED)||(LA17_302 >= KW_URI && LA17_302 <= KW_USE)||(LA17_302 >= KW_UTC && LA17_302 <= KW_VALIDATE)||LA17_302==KW_VALUE_TYPE||LA17_302==KW_VIEW||LA17_302==KW_WHILE||(LA17_302 >= KW_WORK && LA17_302 <= KW_YEAR)||LA17_302==KW_HOLD_DDLTIME||LA17_302==KW_IGNORE||LA17_302==KW_NO_DROP||LA17_302==KW_OFFLINE||LA17_302==KW_PROTECTION||LA17_302==KW_READONLY) ) {s = 688;}
						else if ( ((LA17_302 >= KW_ALL && LA17_302 <= KW_ALTER)||(LA17_302 >= KW_ARRAY && LA17_302 <= KW_AS)||LA17_302==KW_AUTHORIZATION||(LA17_302 >= KW_BETWEEN && LA17_302 <= KW_BOTH)||LA17_302==KW_BY||LA17_302==KW_CONSTRAINT||LA17_302==KW_CREATE||LA17_302==KW_CUBE||(LA17_302 >= KW_CURRENT_DATE && LA17_302 <= KW_CURSOR)||LA17_302==KW_DATE||LA17_302==KW_DECIMAL||LA17_302==KW_DELETE||LA17_302==KW_DESCRIBE||(LA17_302 >= KW_DOUBLE && LA17_302 <= KW_DROP)||LA17_302==KW_EXISTS||(LA17_302 >= KW_EXTERNAL && LA17_302 <= KW_FETCH)||LA17_302==KW_FLOAT||(LA17_302 >= KW_FOR && LA17_302 <= KW_FOREIGN)||LA17_302==KW_FULL||(LA17_302 >= KW_GRANT && LA17_302 <= KW_GROUPING)||(LA17_302 >= KW_IMPORT && LA17_302 <= KW_IN)||LA17_302==KW_INNER||(LA17_302 >= KW_INSERT && LA17_302 <= KW_INTERSECT)||(LA17_302 >= KW_INTO && LA17_302 <= KW_IS)||(LA17_302 >= KW_LATERAL && LA17_302 <= KW_LEFT)||LA17_302==KW_LIKE||LA17_302==KW_LOCAL||LA17_302==KW_NONE||LA17_302==KW_NULL||LA17_302==KW_OF||(LA17_302 >= KW_ORDER && LA17_302 <= KW_OUTER)||LA17_302==KW_PARTITION||LA17_302==KW_PERCENT||LA17_302==KW_PRIMARY||LA17_302==KW_PROCEDURE||LA17_302==KW_RANGE||LA17_302==KW_READS||(LA17_302 >= KW_REFERENCES && LA17_302 <= KW_REGEXP)||LA17_302==KW_REVOKE||(LA17_302 >= KW_RIGHT && LA17_302 <= KW_RLIKE)||(LA17_302 >= KW_ROLLUP && LA17_302 <= KW_ROWS)||LA17_302==KW_SET||LA17_302==KW_SMALLINT||LA17_302==KW_TABLE||LA17_302==KW_TIMESTAMP||LA17_302==KW_TO||(LA17_302 >= KW_TRIGGER && LA17_302 <= KW_TRUNCATE)||LA17_302==KW_UNION||LA17_302==KW_UPDATE||(LA17_302 >= KW_USER && LA17_302 <= KW_USING)||LA17_302==KW_VALUES||LA17_302==KW_WITH) ) {s = 689;}
						 
						input.seek(index17_302);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_347 = input.LA(1);
						 
						int index17_347 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_347==STAR) && (synpred1_SelectClauseParser())) {s = 690;}
						else if ( (LA17_347==Identifier) ) {s = 691;}
						else if ( ((LA17_347 >= KW_ABORT && LA17_347 <= KW_AFTER)||LA17_347==KW_ANALYZE||LA17_347==KW_ARCHIVE||LA17_347==KW_ASC||(LA17_347 >= KW_AUTOCOMMIT && LA17_347 <= KW_BEFORE)||(LA17_347 >= KW_BUCKET && LA17_347 <= KW_BUCKETS)||LA17_347==KW_CASCADE||LA17_347==KW_CHANGE||(LA17_347 >= KW_CLUSTER && LA17_347 <= KW_COLLECTION)||(LA17_347 >= KW_COLUMNS && LA17_347 <= KW_COMMENT)||(LA17_347 >= KW_COMPACT && LA17_347 <= KW_CONCATENATE)||LA17_347==KW_CONTINUE||LA17_347==KW_DATA||LA17_347==KW_DATABASES||(LA17_347 >= KW_DATETIME && LA17_347 <= KW_DBPROPERTIES)||(LA17_347 >= KW_DEFERRED && LA17_347 <= KW_DEFINED)||(LA17_347 >= KW_DELIMITED && LA17_347 <= KW_DESC)||(LA17_347 >= KW_DIRECTORIES && LA17_347 <= KW_DISABLE)||LA17_347==KW_DISTRIBUTE||LA17_347==KW_ELEM_TYPE||LA17_347==KW_ENABLE||LA17_347==KW_ESCAPED||LA17_347==KW_EXCLUSIVE||(LA17_347 >= KW_EXPLAIN && LA17_347 <= KW_EXPORT)||(LA17_347 >= KW_FIELDS && LA17_347 <= KW_FIRST)||(LA17_347 >= KW_FORMAT && LA17_347 <= KW_FORMATTED)||LA17_347==KW_FUNCTIONS||(LA17_347 >= KW_HOUR && LA17_347 <= KW_IDXPROPERTIES)||(LA17_347 >= KW_INDEX && LA17_347 <= KW_INDEXES)||(LA17_347 >= KW_INPATH && LA17_347 <= KW_INPUTFORMAT)||(LA17_347 >= KW_ISOLATION && LA17_347 <= KW_JAR)||(LA17_347 >= KW_KEY && LA17_347 <= KW_LAST)||LA17_347==KW_LEVEL||(LA17_347 >= KW_LIMIT && LA17_347 <= KW_LOAD)||(LA17_347 >= KW_LOCATION && LA17_347 <= KW_LONG)||(LA17_347 >= KW_MAPJOIN && LA17_347 <= KW_MONTH)||LA17_347==KW_MSCK||(LA17_347 >= KW_NORELY && LA17_347 <= KW_NOSCAN)||LA17_347==KW_NOVALIDATE||LA17_347==KW_NULLS||LA17_347==KW_OFFSET||LA17_347==KW_OPTION||(LA17_347 >= KW_OUTPUTDRIVER && LA17_347 <= KW_OUTPUTFORMAT)||(LA17_347 >= KW_OVERWRITE && LA17_347 <= KW_OWNER)||(LA17_347 >= KW_PARTITIONED && LA17_347 <= KW_PARTITIONS)||LA17_347==KW_PLUS||LA17_347==KW_PRETTY||LA17_347==KW_PRINCIPALS||LA17_347==KW_PURGE||LA17_347==KW_READ||(LA17_347 >= KW_REBUILD && LA17_347 <= KW_RECORDWRITER)||(LA17_347 >= KW_RELOAD && LA17_347 <= KW_RESTRICT)||LA17_347==KW_REWRITE||(LA17_347 >= KW_ROLE && LA17_347 <= KW_ROLES)||(LA17_347 >= KW_SCHEMA && LA17_347 <= KW_SECOND)||(LA17_347 >= KW_SEMI && LA17_347 <= KW_SERVER)||(LA17_347 >= KW_SETS && LA17_347 <= KW_SKEWED)||(LA17_347 >= KW_SNAPSHOT && LA17_347 <= KW_SSL)||(LA17_347 >= KW_STATISTICS && LA17_347 <= KW_STRUCT)||LA17_347==KW_TABLES||(LA17_347 >= KW_TBLPROPERTIES && LA17_347 <= KW_TERMINATED)||LA17_347==KW_TINYINT||(LA17_347 >= KW_TOUCH && LA17_347 <= KW_TRANSACTIONS)||LA17_347==KW_UNARCHIVE||LA17_347==KW_UNDO||LA17_347==KW_UNIONTYPE||(LA17_347 >= KW_UNLOCK && LA17_347 <= KW_UNSIGNED)||(LA17_347 >= KW_URI && LA17_347 <= KW_USE)||(LA17_347 >= KW_UTC && LA17_347 <= KW_VALIDATE)||LA17_347==KW_VALUE_TYPE||LA17_347==KW_VIEW||LA17_347==KW_WHILE||(LA17_347 >= KW_WORK && LA17_347 <= KW_YEAR)||LA17_347==KW_HOLD_DDLTIME||LA17_347==KW_IGNORE||LA17_347==KW_NO_DROP||LA17_347==KW_OFFLINE||LA17_347==KW_PROTECTION||LA17_347==KW_READONLY) ) {s = 692;}
						else if ( ((LA17_347 >= KW_ALL && LA17_347 <= KW_ALTER)||(LA17_347 >= KW_ARRAY && LA17_347 <= KW_AS)||LA17_347==KW_AUTHORIZATION||(LA17_347 >= KW_BETWEEN && LA17_347 <= KW_BOTH)||LA17_347==KW_BY||LA17_347==KW_CONSTRAINT||LA17_347==KW_CREATE||LA17_347==KW_CUBE||(LA17_347 >= KW_CURRENT_DATE && LA17_347 <= KW_CURSOR)||LA17_347==KW_DATE||LA17_347==KW_DECIMAL||LA17_347==KW_DELETE||LA17_347==KW_DESCRIBE||(LA17_347 >= KW_DOUBLE && LA17_347 <= KW_DROP)||LA17_347==KW_EXISTS||(LA17_347 >= KW_EXTERNAL && LA17_347 <= KW_FETCH)||LA17_347==KW_FLOAT||(LA17_347 >= KW_FOR && LA17_347 <= KW_FOREIGN)||LA17_347==KW_FULL||(LA17_347 >= KW_GRANT && LA17_347 <= KW_GROUPING)||(LA17_347 >= KW_IMPORT && LA17_347 <= KW_IN)||LA17_347==KW_INNER||(LA17_347 >= KW_INSERT && LA17_347 <= KW_INTERSECT)||(LA17_347 >= KW_INTO && LA17_347 <= KW_IS)||(LA17_347 >= KW_LATERAL && LA17_347 <= KW_LEFT)||LA17_347==KW_LIKE||LA17_347==KW_LOCAL||LA17_347==KW_NONE||LA17_347==KW_NULL||LA17_347==KW_OF||(LA17_347 >= KW_ORDER && LA17_347 <= KW_OUTER)||LA17_347==KW_PARTITION||LA17_347==KW_PERCENT||LA17_347==KW_PRIMARY||LA17_347==KW_PROCEDURE||LA17_347==KW_RANGE||LA17_347==KW_READS||(LA17_347 >= KW_REFERENCES && LA17_347 <= KW_REGEXP)||LA17_347==KW_REVOKE||(LA17_347 >= KW_RIGHT && LA17_347 <= KW_RLIKE)||(LA17_347 >= KW_ROLLUP && LA17_347 <= KW_ROWS)||LA17_347==KW_SET||LA17_347==KW_SMALLINT||LA17_347==KW_TABLE||LA17_347==KW_TIMESTAMP||LA17_347==KW_TO||(LA17_347 >= KW_TRIGGER && LA17_347 <= KW_TRUNCATE)||LA17_347==KW_UNION||LA17_347==KW_UPDATE||(LA17_347 >= KW_USER && LA17_347 <= KW_USING)||LA17_347==KW_VALUES||LA17_347==KW_WITH) ) {s = 693;}
						 
						input.seek(index17_347);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_392 = input.LA(1);
						 
						int index17_392 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_392==STAR) && (synpred1_SelectClauseParser())) {s = 694;}
						else if ( (LA17_392==Identifier) ) {s = 695;}
						else if ( ((LA17_392 >= KW_ABORT && LA17_392 <= KW_AFTER)||LA17_392==KW_ANALYZE||LA17_392==KW_ARCHIVE||LA17_392==KW_ASC||(LA17_392 >= KW_AUTOCOMMIT && LA17_392 <= KW_BEFORE)||(LA17_392 >= KW_BUCKET && LA17_392 <= KW_BUCKETS)||LA17_392==KW_CASCADE||LA17_392==KW_CHANGE||(LA17_392 >= KW_CLUSTER && LA17_392 <= KW_COLLECTION)||(LA17_392 >= KW_COLUMNS && LA17_392 <= KW_COMMENT)||(LA17_392 >= KW_COMPACT && LA17_392 <= KW_CONCATENATE)||LA17_392==KW_CONTINUE||LA17_392==KW_DATA||LA17_392==KW_DATABASES||(LA17_392 >= KW_DATETIME && LA17_392 <= KW_DBPROPERTIES)||(LA17_392 >= KW_DEFERRED && LA17_392 <= KW_DEFINED)||(LA17_392 >= KW_DELIMITED && LA17_392 <= KW_DESC)||(LA17_392 >= KW_DIRECTORIES && LA17_392 <= KW_DISABLE)||LA17_392==KW_DISTRIBUTE||LA17_392==KW_ELEM_TYPE||LA17_392==KW_ENABLE||LA17_392==KW_ESCAPED||LA17_392==KW_EXCLUSIVE||(LA17_392 >= KW_EXPLAIN && LA17_392 <= KW_EXPORT)||(LA17_392 >= KW_FIELDS && LA17_392 <= KW_FIRST)||(LA17_392 >= KW_FORMAT && LA17_392 <= KW_FORMATTED)||LA17_392==KW_FUNCTIONS||(LA17_392 >= KW_HOUR && LA17_392 <= KW_IDXPROPERTIES)||(LA17_392 >= KW_INDEX && LA17_392 <= KW_INDEXES)||(LA17_392 >= KW_INPATH && LA17_392 <= KW_INPUTFORMAT)||(LA17_392 >= KW_ISOLATION && LA17_392 <= KW_JAR)||(LA17_392 >= KW_KEY && LA17_392 <= KW_LAST)||LA17_392==KW_LEVEL||(LA17_392 >= KW_LIMIT && LA17_392 <= KW_LOAD)||(LA17_392 >= KW_LOCATION && LA17_392 <= KW_LONG)||(LA17_392 >= KW_MAPJOIN && LA17_392 <= KW_MONTH)||LA17_392==KW_MSCK||(LA17_392 >= KW_NORELY && LA17_392 <= KW_NOSCAN)||LA17_392==KW_NOVALIDATE||LA17_392==KW_NULLS||LA17_392==KW_OFFSET||LA17_392==KW_OPTION||(LA17_392 >= KW_OUTPUTDRIVER && LA17_392 <= KW_OUTPUTFORMAT)||(LA17_392 >= KW_OVERWRITE && LA17_392 <= KW_OWNER)||(LA17_392 >= KW_PARTITIONED && LA17_392 <= KW_PARTITIONS)||LA17_392==KW_PLUS||LA17_392==KW_PRETTY||LA17_392==KW_PRINCIPALS||LA17_392==KW_PURGE||LA17_392==KW_READ||(LA17_392 >= KW_REBUILD && LA17_392 <= KW_RECORDWRITER)||(LA17_392 >= KW_RELOAD && LA17_392 <= KW_RESTRICT)||LA17_392==KW_REWRITE||(LA17_392 >= KW_ROLE && LA17_392 <= KW_ROLES)||(LA17_392 >= KW_SCHEMA && LA17_392 <= KW_SECOND)||(LA17_392 >= KW_SEMI && LA17_392 <= KW_SERVER)||(LA17_392 >= KW_SETS && LA17_392 <= KW_SKEWED)||(LA17_392 >= KW_SNAPSHOT && LA17_392 <= KW_SSL)||(LA17_392 >= KW_STATISTICS && LA17_392 <= KW_STRUCT)||LA17_392==KW_TABLES||(LA17_392 >= KW_TBLPROPERTIES && LA17_392 <= KW_TERMINATED)||LA17_392==KW_TINYINT||(LA17_392 >= KW_TOUCH && LA17_392 <= KW_TRANSACTIONS)||LA17_392==KW_UNARCHIVE||LA17_392==KW_UNDO||LA17_392==KW_UNIONTYPE||(LA17_392 >= KW_UNLOCK && LA17_392 <= KW_UNSIGNED)||(LA17_392 >= KW_URI && LA17_392 <= KW_USE)||(LA17_392 >= KW_UTC && LA17_392 <= KW_VALIDATE)||LA17_392==KW_VALUE_TYPE||LA17_392==KW_VIEW||LA17_392==KW_WHILE||(LA17_392 >= KW_WORK && LA17_392 <= KW_YEAR)||LA17_392==KW_HOLD_DDLTIME||LA17_392==KW_IGNORE||LA17_392==KW_NO_DROP||LA17_392==KW_OFFLINE||LA17_392==KW_PROTECTION||LA17_392==KW_READONLY) ) {s = 696;}
						else if ( ((LA17_392 >= KW_ALL && LA17_392 <= KW_ALTER)||(LA17_392 >= KW_ARRAY && LA17_392 <= KW_AS)||LA17_392==KW_AUTHORIZATION||(LA17_392 >= KW_BETWEEN && LA17_392 <= KW_BOTH)||LA17_392==KW_BY||LA17_392==KW_CONSTRAINT||LA17_392==KW_CREATE||LA17_392==KW_CUBE||(LA17_392 >= KW_CURRENT_DATE && LA17_392 <= KW_CURSOR)||LA17_392==KW_DATE||LA17_392==KW_DECIMAL||LA17_392==KW_DELETE||LA17_392==KW_DESCRIBE||(LA17_392 >= KW_DOUBLE && LA17_392 <= KW_DROP)||LA17_392==KW_EXISTS||(LA17_392 >= KW_EXTERNAL && LA17_392 <= KW_FETCH)||LA17_392==KW_FLOAT||(LA17_392 >= KW_FOR && LA17_392 <= KW_FOREIGN)||LA17_392==KW_FULL||(LA17_392 >= KW_GRANT && LA17_392 <= KW_GROUPING)||(LA17_392 >= KW_IMPORT && LA17_392 <= KW_IN)||LA17_392==KW_INNER||(LA17_392 >= KW_INSERT && LA17_392 <= KW_INTERSECT)||(LA17_392 >= KW_INTO && LA17_392 <= KW_IS)||(LA17_392 >= KW_LATERAL && LA17_392 <= KW_LEFT)||LA17_392==KW_LIKE||LA17_392==KW_LOCAL||LA17_392==KW_NONE||LA17_392==KW_NULL||LA17_392==KW_OF||(LA17_392 >= KW_ORDER && LA17_392 <= KW_OUTER)||LA17_392==KW_PARTITION||LA17_392==KW_PERCENT||LA17_392==KW_PRIMARY||LA17_392==KW_PROCEDURE||LA17_392==KW_RANGE||LA17_392==KW_READS||(LA17_392 >= KW_REFERENCES && LA17_392 <= KW_REGEXP)||LA17_392==KW_REVOKE||(LA17_392 >= KW_RIGHT && LA17_392 <= KW_RLIKE)||(LA17_392 >= KW_ROLLUP && LA17_392 <= KW_ROWS)||LA17_392==KW_SET||LA17_392==KW_SMALLINT||LA17_392==KW_TABLE||LA17_392==KW_TIMESTAMP||LA17_392==KW_TO||(LA17_392 >= KW_TRIGGER && LA17_392 <= KW_TRUNCATE)||LA17_392==KW_UNION||LA17_392==KW_UPDATE||(LA17_392 >= KW_USER && LA17_392 <= KW_USING)||LA17_392==KW_VALUES||LA17_392==KW_WITH) ) {s = 697;}
						 
						input.seek(index17_392);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_437 = input.LA(1);
						 
						int index17_437 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_437==STAR) && (synpred1_SelectClauseParser())) {s = 698;}
						else if ( (LA17_437==Identifier) ) {s = 699;}
						else if ( ((LA17_437 >= KW_ABORT && LA17_437 <= KW_AFTER)||LA17_437==KW_ANALYZE||LA17_437==KW_ARCHIVE||LA17_437==KW_ASC||(LA17_437 >= KW_AUTOCOMMIT && LA17_437 <= KW_BEFORE)||(LA17_437 >= KW_BUCKET && LA17_437 <= KW_BUCKETS)||LA17_437==KW_CASCADE||LA17_437==KW_CHANGE||(LA17_437 >= KW_CLUSTER && LA17_437 <= KW_COLLECTION)||(LA17_437 >= KW_COLUMNS && LA17_437 <= KW_COMMENT)||(LA17_437 >= KW_COMPACT && LA17_437 <= KW_CONCATENATE)||LA17_437==KW_CONTINUE||LA17_437==KW_DATA||LA17_437==KW_DATABASES||(LA17_437 >= KW_DATETIME && LA17_437 <= KW_DBPROPERTIES)||(LA17_437 >= KW_DEFERRED && LA17_437 <= KW_DEFINED)||(LA17_437 >= KW_DELIMITED && LA17_437 <= KW_DESC)||(LA17_437 >= KW_DIRECTORIES && LA17_437 <= KW_DISABLE)||LA17_437==KW_DISTRIBUTE||LA17_437==KW_ELEM_TYPE||LA17_437==KW_ENABLE||LA17_437==KW_ESCAPED||LA17_437==KW_EXCLUSIVE||(LA17_437 >= KW_EXPLAIN && LA17_437 <= KW_EXPORT)||(LA17_437 >= KW_FIELDS && LA17_437 <= KW_FIRST)||(LA17_437 >= KW_FORMAT && LA17_437 <= KW_FORMATTED)||LA17_437==KW_FUNCTIONS||(LA17_437 >= KW_HOUR && LA17_437 <= KW_IDXPROPERTIES)||(LA17_437 >= KW_INDEX && LA17_437 <= KW_INDEXES)||(LA17_437 >= KW_INPATH && LA17_437 <= KW_INPUTFORMAT)||(LA17_437 >= KW_ISOLATION && LA17_437 <= KW_JAR)||(LA17_437 >= KW_KEY && LA17_437 <= KW_LAST)||LA17_437==KW_LEVEL||(LA17_437 >= KW_LIMIT && LA17_437 <= KW_LOAD)||(LA17_437 >= KW_LOCATION && LA17_437 <= KW_LONG)||(LA17_437 >= KW_MAPJOIN && LA17_437 <= KW_MONTH)||LA17_437==KW_MSCK||(LA17_437 >= KW_NORELY && LA17_437 <= KW_NOSCAN)||LA17_437==KW_NOVALIDATE||LA17_437==KW_NULLS||LA17_437==KW_OFFSET||LA17_437==KW_OPTION||(LA17_437 >= KW_OUTPUTDRIVER && LA17_437 <= KW_OUTPUTFORMAT)||(LA17_437 >= KW_OVERWRITE && LA17_437 <= KW_OWNER)||(LA17_437 >= KW_PARTITIONED && LA17_437 <= KW_PARTITIONS)||LA17_437==KW_PLUS||LA17_437==KW_PRETTY||LA17_437==KW_PRINCIPALS||LA17_437==KW_PURGE||LA17_437==KW_READ||(LA17_437 >= KW_REBUILD && LA17_437 <= KW_RECORDWRITER)||(LA17_437 >= KW_RELOAD && LA17_437 <= KW_RESTRICT)||LA17_437==KW_REWRITE||(LA17_437 >= KW_ROLE && LA17_437 <= KW_ROLES)||(LA17_437 >= KW_SCHEMA && LA17_437 <= KW_SECOND)||(LA17_437 >= KW_SEMI && LA17_437 <= KW_SERVER)||(LA17_437 >= KW_SETS && LA17_437 <= KW_SKEWED)||(LA17_437 >= KW_SNAPSHOT && LA17_437 <= KW_SSL)||(LA17_437 >= KW_STATISTICS && LA17_437 <= KW_STRUCT)||LA17_437==KW_TABLES||(LA17_437 >= KW_TBLPROPERTIES && LA17_437 <= KW_TERMINATED)||LA17_437==KW_TINYINT||(LA17_437 >= KW_TOUCH && LA17_437 <= KW_TRANSACTIONS)||LA17_437==KW_UNARCHIVE||LA17_437==KW_UNDO||LA17_437==KW_UNIONTYPE||(LA17_437 >= KW_UNLOCK && LA17_437 <= KW_UNSIGNED)||(LA17_437 >= KW_URI && LA17_437 <= KW_USE)||(LA17_437 >= KW_UTC && LA17_437 <= KW_VALIDATE)||LA17_437==KW_VALUE_TYPE||LA17_437==KW_VIEW||LA17_437==KW_WHILE||(LA17_437 >= KW_WORK && LA17_437 <= KW_YEAR)||LA17_437==KW_HOLD_DDLTIME||LA17_437==KW_IGNORE||LA17_437==KW_NO_DROP||LA17_437==KW_OFFLINE||LA17_437==KW_PROTECTION||LA17_437==KW_READONLY) ) {s = 700;}
						else if ( ((LA17_437 >= KW_ALL && LA17_437 <= KW_ALTER)||(LA17_437 >= KW_ARRAY && LA17_437 <= KW_AS)||LA17_437==KW_AUTHORIZATION||(LA17_437 >= KW_BETWEEN && LA17_437 <= KW_BOTH)||LA17_437==KW_BY||LA17_437==KW_CONSTRAINT||LA17_437==KW_CREATE||LA17_437==KW_CUBE||(LA17_437 >= KW_CURRENT_DATE && LA17_437 <= KW_CURSOR)||LA17_437==KW_DATE||LA17_437==KW_DECIMAL||LA17_437==KW_DELETE||LA17_437==KW_DESCRIBE||(LA17_437 >= KW_DOUBLE && LA17_437 <= KW_DROP)||LA17_437==KW_EXISTS||(LA17_437 >= KW_EXTERNAL && LA17_437 <= KW_FETCH)||LA17_437==KW_FLOAT||(LA17_437 >= KW_FOR && LA17_437 <= KW_FOREIGN)||LA17_437==KW_FULL||(LA17_437 >= KW_GRANT && LA17_437 <= KW_GROUPING)||(LA17_437 >= KW_IMPORT && LA17_437 <= KW_IN)||LA17_437==KW_INNER||(LA17_437 >= KW_INSERT && LA17_437 <= KW_INTERSECT)||(LA17_437 >= KW_INTO && LA17_437 <= KW_IS)||(LA17_437 >= KW_LATERAL && LA17_437 <= KW_LEFT)||LA17_437==KW_LIKE||LA17_437==KW_LOCAL||LA17_437==KW_NONE||LA17_437==KW_NULL||LA17_437==KW_OF||(LA17_437 >= KW_ORDER && LA17_437 <= KW_OUTER)||LA17_437==KW_PARTITION||LA17_437==KW_PERCENT||LA17_437==KW_PRIMARY||LA17_437==KW_PROCEDURE||LA17_437==KW_RANGE||LA17_437==KW_READS||(LA17_437 >= KW_REFERENCES && LA17_437 <= KW_REGEXP)||LA17_437==KW_REVOKE||(LA17_437 >= KW_RIGHT && LA17_437 <= KW_RLIKE)||(LA17_437 >= KW_ROLLUP && LA17_437 <= KW_ROWS)||LA17_437==KW_SET||LA17_437==KW_SMALLINT||LA17_437==KW_TABLE||LA17_437==KW_TIMESTAMP||LA17_437==KW_TO||(LA17_437 >= KW_TRIGGER && LA17_437 <= KW_TRUNCATE)||LA17_437==KW_UNION||LA17_437==KW_UPDATE||(LA17_437 >= KW_USER && LA17_437 <= KW_USING)||LA17_437==KW_VALUES||LA17_437==KW_WITH) ) {s = 701;}
						 
						input.seek(index17_437);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_482 = input.LA(1);
						 
						int index17_482 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_482==STAR) && (synpred1_SelectClauseParser())) {s = 702;}
						else if ( (LA17_482==Identifier) ) {s = 703;}
						else if ( ((LA17_482 >= KW_ABORT && LA17_482 <= KW_AFTER)||LA17_482==KW_ANALYZE||LA17_482==KW_ARCHIVE||LA17_482==KW_ASC||(LA17_482 >= KW_AUTOCOMMIT && LA17_482 <= KW_BEFORE)||(LA17_482 >= KW_BUCKET && LA17_482 <= KW_BUCKETS)||LA17_482==KW_CASCADE||LA17_482==KW_CHANGE||(LA17_482 >= KW_CLUSTER && LA17_482 <= KW_COLLECTION)||(LA17_482 >= KW_COLUMNS && LA17_482 <= KW_COMMENT)||(LA17_482 >= KW_COMPACT && LA17_482 <= KW_CONCATENATE)||LA17_482==KW_CONTINUE||LA17_482==KW_DATA||LA17_482==KW_DATABASES||(LA17_482 >= KW_DATETIME && LA17_482 <= KW_DBPROPERTIES)||(LA17_482 >= KW_DEFERRED && LA17_482 <= KW_DEFINED)||(LA17_482 >= KW_DELIMITED && LA17_482 <= KW_DESC)||(LA17_482 >= KW_DIRECTORIES && LA17_482 <= KW_DISABLE)||LA17_482==KW_DISTRIBUTE||LA17_482==KW_ELEM_TYPE||LA17_482==KW_ENABLE||LA17_482==KW_ESCAPED||LA17_482==KW_EXCLUSIVE||(LA17_482 >= KW_EXPLAIN && LA17_482 <= KW_EXPORT)||(LA17_482 >= KW_FIELDS && LA17_482 <= KW_FIRST)||(LA17_482 >= KW_FORMAT && LA17_482 <= KW_FORMATTED)||LA17_482==KW_FUNCTIONS||(LA17_482 >= KW_HOUR && LA17_482 <= KW_IDXPROPERTIES)||(LA17_482 >= KW_INDEX && LA17_482 <= KW_INDEXES)||(LA17_482 >= KW_INPATH && LA17_482 <= KW_INPUTFORMAT)||(LA17_482 >= KW_ISOLATION && LA17_482 <= KW_JAR)||(LA17_482 >= KW_KEY && LA17_482 <= KW_LAST)||LA17_482==KW_LEVEL||(LA17_482 >= KW_LIMIT && LA17_482 <= KW_LOAD)||(LA17_482 >= KW_LOCATION && LA17_482 <= KW_LONG)||(LA17_482 >= KW_MAPJOIN && LA17_482 <= KW_MONTH)||LA17_482==KW_MSCK||(LA17_482 >= KW_NORELY && LA17_482 <= KW_NOSCAN)||LA17_482==KW_NOVALIDATE||LA17_482==KW_NULLS||LA17_482==KW_OFFSET||LA17_482==KW_OPTION||(LA17_482 >= KW_OUTPUTDRIVER && LA17_482 <= KW_OUTPUTFORMAT)||(LA17_482 >= KW_OVERWRITE && LA17_482 <= KW_OWNER)||(LA17_482 >= KW_PARTITIONED && LA17_482 <= KW_PARTITIONS)||LA17_482==KW_PLUS||LA17_482==KW_PRETTY||LA17_482==KW_PRINCIPALS||LA17_482==KW_PURGE||LA17_482==KW_READ||(LA17_482 >= KW_REBUILD && LA17_482 <= KW_RECORDWRITER)||(LA17_482 >= KW_RELOAD && LA17_482 <= KW_RESTRICT)||LA17_482==KW_REWRITE||(LA17_482 >= KW_ROLE && LA17_482 <= KW_ROLES)||(LA17_482 >= KW_SCHEMA && LA17_482 <= KW_SECOND)||(LA17_482 >= KW_SEMI && LA17_482 <= KW_SERVER)||(LA17_482 >= KW_SETS && LA17_482 <= KW_SKEWED)||(LA17_482 >= KW_SNAPSHOT && LA17_482 <= KW_SSL)||(LA17_482 >= KW_STATISTICS && LA17_482 <= KW_STRUCT)||LA17_482==KW_TABLES||(LA17_482 >= KW_TBLPROPERTIES && LA17_482 <= KW_TERMINATED)||LA17_482==KW_TINYINT||(LA17_482 >= KW_TOUCH && LA17_482 <= KW_TRANSACTIONS)||LA17_482==KW_UNARCHIVE||LA17_482==KW_UNDO||LA17_482==KW_UNIONTYPE||(LA17_482 >= KW_UNLOCK && LA17_482 <= KW_UNSIGNED)||(LA17_482 >= KW_URI && LA17_482 <= KW_USE)||(LA17_482 >= KW_UTC && LA17_482 <= KW_VALIDATE)||LA17_482==KW_VALUE_TYPE||LA17_482==KW_VIEW||LA17_482==KW_WHILE||(LA17_482 >= KW_WORK && LA17_482 <= KW_YEAR)||LA17_482==KW_HOLD_DDLTIME||LA17_482==KW_IGNORE||LA17_482==KW_NO_DROP||LA17_482==KW_OFFLINE||LA17_482==KW_PROTECTION||LA17_482==KW_READONLY) ) {s = 704;}
						else if ( ((LA17_482 >= KW_ALL && LA17_482 <= KW_ALTER)||(LA17_482 >= KW_ARRAY && LA17_482 <= KW_AS)||LA17_482==KW_AUTHORIZATION||(LA17_482 >= KW_BETWEEN && LA17_482 <= KW_BOTH)||LA17_482==KW_BY||LA17_482==KW_CONSTRAINT||LA17_482==KW_CREATE||LA17_482==KW_CUBE||(LA17_482 >= KW_CURRENT_DATE && LA17_482 <= KW_CURSOR)||LA17_482==KW_DATE||LA17_482==KW_DECIMAL||LA17_482==KW_DELETE||LA17_482==KW_DESCRIBE||(LA17_482 >= KW_DOUBLE && LA17_482 <= KW_DROP)||LA17_482==KW_EXISTS||(LA17_482 >= KW_EXTERNAL && LA17_482 <= KW_FETCH)||LA17_482==KW_FLOAT||(LA17_482 >= KW_FOR && LA17_482 <= KW_FOREIGN)||LA17_482==KW_FULL||(LA17_482 >= KW_GRANT && LA17_482 <= KW_GROUPING)||(LA17_482 >= KW_IMPORT && LA17_482 <= KW_IN)||LA17_482==KW_INNER||(LA17_482 >= KW_INSERT && LA17_482 <= KW_INTERSECT)||(LA17_482 >= KW_INTO && LA17_482 <= KW_IS)||(LA17_482 >= KW_LATERAL && LA17_482 <= KW_LEFT)||LA17_482==KW_LIKE||LA17_482==KW_LOCAL||LA17_482==KW_NONE||LA17_482==KW_NULL||LA17_482==KW_OF||(LA17_482 >= KW_ORDER && LA17_482 <= KW_OUTER)||LA17_482==KW_PARTITION||LA17_482==KW_PERCENT||LA17_482==KW_PRIMARY||LA17_482==KW_PROCEDURE||LA17_482==KW_RANGE||LA17_482==KW_READS||(LA17_482 >= KW_REFERENCES && LA17_482 <= KW_REGEXP)||LA17_482==KW_REVOKE||(LA17_482 >= KW_RIGHT && LA17_482 <= KW_RLIKE)||(LA17_482 >= KW_ROLLUP && LA17_482 <= KW_ROWS)||LA17_482==KW_SET||LA17_482==KW_SMALLINT||LA17_482==KW_TABLE||LA17_482==KW_TIMESTAMP||LA17_482==KW_TO||(LA17_482 >= KW_TRIGGER && LA17_482 <= KW_TRUNCATE)||LA17_482==KW_UNION||LA17_482==KW_UPDATE||(LA17_482 >= KW_USER && LA17_482 <= KW_USING)||LA17_482==KW_VALUES||LA17_482==KW_WITH) ) {s = 705;}
						 
						input.seek(index17_482);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_527 = input.LA(1);
						 
						int index17_527 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_527==STAR) && (synpred1_SelectClauseParser())) {s = 706;}
						else if ( (LA17_527==Identifier) ) {s = 707;}
						else if ( ((LA17_527 >= KW_ABORT && LA17_527 <= KW_AFTER)||LA17_527==KW_ANALYZE||LA17_527==KW_ARCHIVE||LA17_527==KW_ASC||(LA17_527 >= KW_AUTOCOMMIT && LA17_527 <= KW_BEFORE)||(LA17_527 >= KW_BUCKET && LA17_527 <= KW_BUCKETS)||LA17_527==KW_CASCADE||LA17_527==KW_CHANGE||(LA17_527 >= KW_CLUSTER && LA17_527 <= KW_COLLECTION)||(LA17_527 >= KW_COLUMNS && LA17_527 <= KW_COMMENT)||(LA17_527 >= KW_COMPACT && LA17_527 <= KW_CONCATENATE)||LA17_527==KW_CONTINUE||LA17_527==KW_DATA||LA17_527==KW_DATABASES||(LA17_527 >= KW_DATETIME && LA17_527 <= KW_DBPROPERTIES)||(LA17_527 >= KW_DEFERRED && LA17_527 <= KW_DEFINED)||(LA17_527 >= KW_DELIMITED && LA17_527 <= KW_DESC)||(LA17_527 >= KW_DIRECTORIES && LA17_527 <= KW_DISABLE)||LA17_527==KW_DISTRIBUTE||LA17_527==KW_ELEM_TYPE||LA17_527==KW_ENABLE||LA17_527==KW_ESCAPED||LA17_527==KW_EXCLUSIVE||(LA17_527 >= KW_EXPLAIN && LA17_527 <= KW_EXPORT)||(LA17_527 >= KW_FIELDS && LA17_527 <= KW_FIRST)||(LA17_527 >= KW_FORMAT && LA17_527 <= KW_FORMATTED)||LA17_527==KW_FUNCTIONS||(LA17_527 >= KW_HOUR && LA17_527 <= KW_IDXPROPERTIES)||(LA17_527 >= KW_INDEX && LA17_527 <= KW_INDEXES)||(LA17_527 >= KW_INPATH && LA17_527 <= KW_INPUTFORMAT)||(LA17_527 >= KW_ISOLATION && LA17_527 <= KW_JAR)||(LA17_527 >= KW_KEY && LA17_527 <= KW_LAST)||LA17_527==KW_LEVEL||(LA17_527 >= KW_LIMIT && LA17_527 <= KW_LOAD)||(LA17_527 >= KW_LOCATION && LA17_527 <= KW_LONG)||(LA17_527 >= KW_MAPJOIN && LA17_527 <= KW_MONTH)||LA17_527==KW_MSCK||(LA17_527 >= KW_NORELY && LA17_527 <= KW_NOSCAN)||LA17_527==KW_NOVALIDATE||LA17_527==KW_NULLS||LA17_527==KW_OFFSET||LA17_527==KW_OPTION||(LA17_527 >= KW_OUTPUTDRIVER && LA17_527 <= KW_OUTPUTFORMAT)||(LA17_527 >= KW_OVERWRITE && LA17_527 <= KW_OWNER)||(LA17_527 >= KW_PARTITIONED && LA17_527 <= KW_PARTITIONS)||LA17_527==KW_PLUS||LA17_527==KW_PRETTY||LA17_527==KW_PRINCIPALS||LA17_527==KW_PURGE||LA17_527==KW_READ||(LA17_527 >= KW_REBUILD && LA17_527 <= KW_RECORDWRITER)||(LA17_527 >= KW_RELOAD && LA17_527 <= KW_RESTRICT)||LA17_527==KW_REWRITE||(LA17_527 >= KW_ROLE && LA17_527 <= KW_ROLES)||(LA17_527 >= KW_SCHEMA && LA17_527 <= KW_SECOND)||(LA17_527 >= KW_SEMI && LA17_527 <= KW_SERVER)||(LA17_527 >= KW_SETS && LA17_527 <= KW_SKEWED)||(LA17_527 >= KW_SNAPSHOT && LA17_527 <= KW_SSL)||(LA17_527 >= KW_STATISTICS && LA17_527 <= KW_STRUCT)||LA17_527==KW_TABLES||(LA17_527 >= KW_TBLPROPERTIES && LA17_527 <= KW_TERMINATED)||LA17_527==KW_TINYINT||(LA17_527 >= KW_TOUCH && LA17_527 <= KW_TRANSACTIONS)||LA17_527==KW_UNARCHIVE||LA17_527==KW_UNDO||LA17_527==KW_UNIONTYPE||(LA17_527 >= KW_UNLOCK && LA17_527 <= KW_UNSIGNED)||(LA17_527 >= KW_URI && LA17_527 <= KW_USE)||(LA17_527 >= KW_UTC && LA17_527 <= KW_VALIDATE)||LA17_527==KW_VALUE_TYPE||LA17_527==KW_VIEW||LA17_527==KW_WHILE||(LA17_527 >= KW_WORK && LA17_527 <= KW_YEAR)||LA17_527==KW_HOLD_DDLTIME||LA17_527==KW_IGNORE||LA17_527==KW_NO_DROP||LA17_527==KW_OFFLINE||LA17_527==KW_PROTECTION||LA17_527==KW_READONLY) ) {s = 708;}
						else if ( ((LA17_527 >= KW_ALL && LA17_527 <= KW_ALTER)||(LA17_527 >= KW_ARRAY && LA17_527 <= KW_AS)||LA17_527==KW_AUTHORIZATION||(LA17_527 >= KW_BETWEEN && LA17_527 <= KW_BOTH)||LA17_527==KW_BY||LA17_527==KW_CONSTRAINT||LA17_527==KW_CREATE||LA17_527==KW_CUBE||(LA17_527 >= KW_CURRENT_DATE && LA17_527 <= KW_CURSOR)||LA17_527==KW_DATE||LA17_527==KW_DECIMAL||LA17_527==KW_DELETE||LA17_527==KW_DESCRIBE||(LA17_527 >= KW_DOUBLE && LA17_527 <= KW_DROP)||LA17_527==KW_EXISTS||(LA17_527 >= KW_EXTERNAL && LA17_527 <= KW_FETCH)||LA17_527==KW_FLOAT||(LA17_527 >= KW_FOR && LA17_527 <= KW_FOREIGN)||LA17_527==KW_FULL||(LA17_527 >= KW_GRANT && LA17_527 <= KW_GROUPING)||(LA17_527 >= KW_IMPORT && LA17_527 <= KW_IN)||LA17_527==KW_INNER||(LA17_527 >= KW_INSERT && LA17_527 <= KW_INTERSECT)||(LA17_527 >= KW_INTO && LA17_527 <= KW_IS)||(LA17_527 >= KW_LATERAL && LA17_527 <= KW_LEFT)||LA17_527==KW_LIKE||LA17_527==KW_LOCAL||LA17_527==KW_NONE||LA17_527==KW_NULL||LA17_527==KW_OF||(LA17_527 >= KW_ORDER && LA17_527 <= KW_OUTER)||LA17_527==KW_PARTITION||LA17_527==KW_PERCENT||LA17_527==KW_PRIMARY||LA17_527==KW_PROCEDURE||LA17_527==KW_RANGE||LA17_527==KW_READS||(LA17_527 >= KW_REFERENCES && LA17_527 <= KW_REGEXP)||LA17_527==KW_REVOKE||(LA17_527 >= KW_RIGHT && LA17_527 <= KW_RLIKE)||(LA17_527 >= KW_ROLLUP && LA17_527 <= KW_ROWS)||LA17_527==KW_SET||LA17_527==KW_SMALLINT||LA17_527==KW_TABLE||LA17_527==KW_TIMESTAMP||LA17_527==KW_TO||(LA17_527 >= KW_TRIGGER && LA17_527 <= KW_TRUNCATE)||LA17_527==KW_UNION||LA17_527==KW_UPDATE||(LA17_527 >= KW_USER && LA17_527 <= KW_USING)||LA17_527==KW_VALUES||LA17_527==KW_WITH) ) {s = 709;}
						 
						input.seek(index17_527);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_572 = input.LA(1);
						 
						int index17_572 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_572==STAR) && (synpred1_SelectClauseParser())) {s = 710;}
						else if ( (LA17_572==Identifier) ) {s = 711;}
						else if ( ((LA17_572 >= KW_ABORT && LA17_572 <= KW_AFTER)||LA17_572==KW_ANALYZE||LA17_572==KW_ARCHIVE||LA17_572==KW_ASC||(LA17_572 >= KW_AUTOCOMMIT && LA17_572 <= KW_BEFORE)||(LA17_572 >= KW_BUCKET && LA17_572 <= KW_BUCKETS)||LA17_572==KW_CASCADE||LA17_572==KW_CHANGE||(LA17_572 >= KW_CLUSTER && LA17_572 <= KW_COLLECTION)||(LA17_572 >= KW_COLUMNS && LA17_572 <= KW_COMMENT)||(LA17_572 >= KW_COMPACT && LA17_572 <= KW_CONCATENATE)||LA17_572==KW_CONTINUE||LA17_572==KW_DATA||LA17_572==KW_DATABASES||(LA17_572 >= KW_DATETIME && LA17_572 <= KW_DBPROPERTIES)||(LA17_572 >= KW_DEFERRED && LA17_572 <= KW_DEFINED)||(LA17_572 >= KW_DELIMITED && LA17_572 <= KW_DESC)||(LA17_572 >= KW_DIRECTORIES && LA17_572 <= KW_DISABLE)||LA17_572==KW_DISTRIBUTE||LA17_572==KW_ELEM_TYPE||LA17_572==KW_ENABLE||LA17_572==KW_ESCAPED||LA17_572==KW_EXCLUSIVE||(LA17_572 >= KW_EXPLAIN && LA17_572 <= KW_EXPORT)||(LA17_572 >= KW_FIELDS && LA17_572 <= KW_FIRST)||(LA17_572 >= KW_FORMAT && LA17_572 <= KW_FORMATTED)||LA17_572==KW_FUNCTIONS||(LA17_572 >= KW_HOUR && LA17_572 <= KW_IDXPROPERTIES)||(LA17_572 >= KW_INDEX && LA17_572 <= KW_INDEXES)||(LA17_572 >= KW_INPATH && LA17_572 <= KW_INPUTFORMAT)||(LA17_572 >= KW_ISOLATION && LA17_572 <= KW_JAR)||(LA17_572 >= KW_KEY && LA17_572 <= KW_LAST)||LA17_572==KW_LEVEL||(LA17_572 >= KW_LIMIT && LA17_572 <= KW_LOAD)||(LA17_572 >= KW_LOCATION && LA17_572 <= KW_LONG)||(LA17_572 >= KW_MAPJOIN && LA17_572 <= KW_MONTH)||LA17_572==KW_MSCK||(LA17_572 >= KW_NORELY && LA17_572 <= KW_NOSCAN)||LA17_572==KW_NOVALIDATE||LA17_572==KW_NULLS||LA17_572==KW_OFFSET||LA17_572==KW_OPTION||(LA17_572 >= KW_OUTPUTDRIVER && LA17_572 <= KW_OUTPUTFORMAT)||(LA17_572 >= KW_OVERWRITE && LA17_572 <= KW_OWNER)||(LA17_572 >= KW_PARTITIONED && LA17_572 <= KW_PARTITIONS)||LA17_572==KW_PLUS||LA17_572==KW_PRETTY||LA17_572==KW_PRINCIPALS||LA17_572==KW_PURGE||LA17_572==KW_READ||(LA17_572 >= KW_REBUILD && LA17_572 <= KW_RECORDWRITER)||(LA17_572 >= KW_RELOAD && LA17_572 <= KW_RESTRICT)||LA17_572==KW_REWRITE||(LA17_572 >= KW_ROLE && LA17_572 <= KW_ROLES)||(LA17_572 >= KW_SCHEMA && LA17_572 <= KW_SECOND)||(LA17_572 >= KW_SEMI && LA17_572 <= KW_SERVER)||(LA17_572 >= KW_SETS && LA17_572 <= KW_SKEWED)||(LA17_572 >= KW_SNAPSHOT && LA17_572 <= KW_SSL)||(LA17_572 >= KW_STATISTICS && LA17_572 <= KW_STRUCT)||LA17_572==KW_TABLES||(LA17_572 >= KW_TBLPROPERTIES && LA17_572 <= KW_TERMINATED)||LA17_572==KW_TINYINT||(LA17_572 >= KW_TOUCH && LA17_572 <= KW_TRANSACTIONS)||LA17_572==KW_UNARCHIVE||LA17_572==KW_UNDO||LA17_572==KW_UNIONTYPE||(LA17_572 >= KW_UNLOCK && LA17_572 <= KW_UNSIGNED)||(LA17_572 >= KW_URI && LA17_572 <= KW_USE)||(LA17_572 >= KW_UTC && LA17_572 <= KW_VALIDATE)||LA17_572==KW_VALUE_TYPE||LA17_572==KW_VIEW||LA17_572==KW_WHILE||(LA17_572 >= KW_WORK && LA17_572 <= KW_YEAR)||LA17_572==KW_HOLD_DDLTIME||LA17_572==KW_IGNORE||LA17_572==KW_NO_DROP||LA17_572==KW_OFFLINE||LA17_572==KW_PROTECTION||LA17_572==KW_READONLY) ) {s = 712;}
						else if ( ((LA17_572 >= KW_ALL && LA17_572 <= KW_ALTER)||(LA17_572 >= KW_ARRAY && LA17_572 <= KW_AS)||LA17_572==KW_AUTHORIZATION||(LA17_572 >= KW_BETWEEN && LA17_572 <= KW_BOTH)||LA17_572==KW_BY||LA17_572==KW_CONSTRAINT||LA17_572==KW_CREATE||LA17_572==KW_CUBE||(LA17_572 >= KW_CURRENT_DATE && LA17_572 <= KW_CURSOR)||LA17_572==KW_DATE||LA17_572==KW_DECIMAL||LA17_572==KW_DELETE||LA17_572==KW_DESCRIBE||(LA17_572 >= KW_DOUBLE && LA17_572 <= KW_DROP)||LA17_572==KW_EXISTS||(LA17_572 >= KW_EXTERNAL && LA17_572 <= KW_FETCH)||LA17_572==KW_FLOAT||(LA17_572 >= KW_FOR && LA17_572 <= KW_FOREIGN)||LA17_572==KW_FULL||(LA17_572 >= KW_GRANT && LA17_572 <= KW_GROUPING)||(LA17_572 >= KW_IMPORT && LA17_572 <= KW_IN)||LA17_572==KW_INNER||(LA17_572 >= KW_INSERT && LA17_572 <= KW_INTERSECT)||(LA17_572 >= KW_INTO && LA17_572 <= KW_IS)||(LA17_572 >= KW_LATERAL && LA17_572 <= KW_LEFT)||LA17_572==KW_LIKE||LA17_572==KW_LOCAL||LA17_572==KW_NONE||LA17_572==KW_NULL||LA17_572==KW_OF||(LA17_572 >= KW_ORDER && LA17_572 <= KW_OUTER)||LA17_572==KW_PARTITION||LA17_572==KW_PERCENT||LA17_572==KW_PRIMARY||LA17_572==KW_PROCEDURE||LA17_572==KW_RANGE||LA17_572==KW_READS||(LA17_572 >= KW_REFERENCES && LA17_572 <= KW_REGEXP)||LA17_572==KW_REVOKE||(LA17_572 >= KW_RIGHT && LA17_572 <= KW_RLIKE)||(LA17_572 >= KW_ROLLUP && LA17_572 <= KW_ROWS)||LA17_572==KW_SET||LA17_572==KW_SMALLINT||LA17_572==KW_TABLE||LA17_572==KW_TIMESTAMP||LA17_572==KW_TO||(LA17_572 >= KW_TRIGGER && LA17_572 <= KW_TRUNCATE)||LA17_572==KW_UNION||LA17_572==KW_UPDATE||(LA17_572 >= KW_USER && LA17_572 <= KW_USING)||LA17_572==KW_VALUES||LA17_572==KW_WITH) ) {s = 713;}
						 
						input.seek(index17_572);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_617 = input.LA(1);
						 
						int index17_617 = input.index();
						input.rewind();
						s = -1;
						if ( (LA17_617==STAR) && (synpred1_SelectClauseParser())) {s = 714;}
						else if ( (LA17_617==Identifier) ) {s = 715;}
						else if ( ((LA17_617 >= KW_ABORT && LA17_617 <= KW_AFTER)||LA17_617==KW_ANALYZE||LA17_617==KW_ARCHIVE||LA17_617==KW_ASC||(LA17_617 >= KW_AUTOCOMMIT && LA17_617 <= KW_BEFORE)||(LA17_617 >= KW_BUCKET && LA17_617 <= KW_BUCKETS)||LA17_617==KW_CASCADE||LA17_617==KW_CHANGE||(LA17_617 >= KW_CLUSTER && LA17_617 <= KW_COLLECTION)||(LA17_617 >= KW_COLUMNS && LA17_617 <= KW_COMMENT)||(LA17_617 >= KW_COMPACT && LA17_617 <= KW_CONCATENATE)||LA17_617==KW_CONTINUE||LA17_617==KW_DATA||LA17_617==KW_DATABASES||(LA17_617 >= KW_DATETIME && LA17_617 <= KW_DBPROPERTIES)||(LA17_617 >= KW_DEFERRED && LA17_617 <= KW_DEFINED)||(LA17_617 >= KW_DELIMITED && LA17_617 <= KW_DESC)||(LA17_617 >= KW_DIRECTORIES && LA17_617 <= KW_DISABLE)||LA17_617==KW_DISTRIBUTE||LA17_617==KW_ELEM_TYPE||LA17_617==KW_ENABLE||LA17_617==KW_ESCAPED||LA17_617==KW_EXCLUSIVE||(LA17_617 >= KW_EXPLAIN && LA17_617 <= KW_EXPORT)||(LA17_617 >= KW_FIELDS && LA17_617 <= KW_FIRST)||(LA17_617 >= KW_FORMAT && LA17_617 <= KW_FORMATTED)||LA17_617==KW_FUNCTIONS||(LA17_617 >= KW_HOUR && LA17_617 <= KW_IDXPROPERTIES)||(LA17_617 >= KW_INDEX && LA17_617 <= KW_INDEXES)||(LA17_617 >= KW_INPATH && LA17_617 <= KW_INPUTFORMAT)||(LA17_617 >= KW_ISOLATION && LA17_617 <= KW_JAR)||(LA17_617 >= KW_KEY && LA17_617 <= KW_LAST)||LA17_617==KW_LEVEL||(LA17_617 >= KW_LIMIT && LA17_617 <= KW_LOAD)||(LA17_617 >= KW_LOCATION && LA17_617 <= KW_LONG)||(LA17_617 >= KW_MAPJOIN && LA17_617 <= KW_MONTH)||LA17_617==KW_MSCK||(LA17_617 >= KW_NORELY && LA17_617 <= KW_NOSCAN)||LA17_617==KW_NOVALIDATE||LA17_617==KW_NULLS||LA17_617==KW_OFFSET||LA17_617==KW_OPTION||(LA17_617 >= KW_OUTPUTDRIVER && LA17_617 <= KW_OUTPUTFORMAT)||(LA17_617 >= KW_OVERWRITE && LA17_617 <= KW_OWNER)||(LA17_617 >= KW_PARTITIONED && LA17_617 <= KW_PARTITIONS)||LA17_617==KW_PLUS||LA17_617==KW_PRETTY||LA17_617==KW_PRINCIPALS||LA17_617==KW_PURGE||LA17_617==KW_READ||(LA17_617 >= KW_REBUILD && LA17_617 <= KW_RECORDWRITER)||(LA17_617 >= KW_RELOAD && LA17_617 <= KW_RESTRICT)||LA17_617==KW_REWRITE||(LA17_617 >= KW_ROLE && LA17_617 <= KW_ROLES)||(LA17_617 >= KW_SCHEMA && LA17_617 <= KW_SECOND)||(LA17_617 >= KW_SEMI && LA17_617 <= KW_SERVER)||(LA17_617 >= KW_SETS && LA17_617 <= KW_SKEWED)||(LA17_617 >= KW_SNAPSHOT && LA17_617 <= KW_SSL)||(LA17_617 >= KW_STATISTICS && LA17_617 <= KW_STRUCT)||LA17_617==KW_TABLES||(LA17_617 >= KW_TBLPROPERTIES && LA17_617 <= KW_TERMINATED)||LA17_617==KW_TINYINT||(LA17_617 >= KW_TOUCH && LA17_617 <= KW_TRANSACTIONS)||LA17_617==KW_UNARCHIVE||LA17_617==KW_UNDO||LA17_617==KW_UNIONTYPE||(LA17_617 >= KW_UNLOCK && LA17_617 <= KW_UNSIGNED)||(LA17_617 >= KW_URI && LA17_617 <= KW_USE)||(LA17_617 >= KW_UTC && LA17_617 <= KW_VALIDATE)||LA17_617==KW_VALUE_TYPE||LA17_617==KW_VIEW||LA17_617==KW_WHILE||(LA17_617 >= KW_WORK && LA17_617 <= KW_YEAR)||LA17_617==KW_HOLD_DDLTIME||LA17_617==KW_IGNORE||LA17_617==KW_NO_DROP||LA17_617==KW_OFFLINE||LA17_617==KW_PROTECTION||LA17_617==KW_READONLY) ) {s = 716;}
						else if ( ((LA17_617 >= KW_ALL && LA17_617 <= KW_ALTER)||(LA17_617 >= KW_ARRAY && LA17_617 <= KW_AS)||LA17_617==KW_AUTHORIZATION||(LA17_617 >= KW_BETWEEN && LA17_617 <= KW_BOTH)||LA17_617==KW_BY||LA17_617==KW_CONSTRAINT||LA17_617==KW_CREATE||LA17_617==KW_CUBE||(LA17_617 >= KW_CURRENT_DATE && LA17_617 <= KW_CURSOR)||LA17_617==KW_DATE||LA17_617==KW_DECIMAL||LA17_617==KW_DELETE||LA17_617==KW_DESCRIBE||(LA17_617 >= KW_DOUBLE && LA17_617 <= KW_DROP)||LA17_617==KW_EXISTS||(LA17_617 >= KW_EXTERNAL && LA17_617 <= KW_FETCH)||LA17_617==KW_FLOAT||(LA17_617 >= KW_FOR && LA17_617 <= KW_FOREIGN)||LA17_617==KW_FULL||(LA17_617 >= KW_GRANT && LA17_617 <= KW_GROUPING)||(LA17_617 >= KW_IMPORT && LA17_617 <= KW_IN)||LA17_617==KW_INNER||(LA17_617 >= KW_INSERT && LA17_617 <= KW_INTERSECT)||(LA17_617 >= KW_INTO && LA17_617 <= KW_IS)||(LA17_617 >= KW_LATERAL && LA17_617 <= KW_LEFT)||LA17_617==KW_LIKE||LA17_617==KW_LOCAL||LA17_617==KW_NONE||LA17_617==KW_NULL||LA17_617==KW_OF||(LA17_617 >= KW_ORDER && LA17_617 <= KW_OUTER)||LA17_617==KW_PARTITION||LA17_617==KW_PERCENT||LA17_617==KW_PRIMARY||LA17_617==KW_PROCEDURE||LA17_617==KW_RANGE||LA17_617==KW_READS||(LA17_617 >= KW_REFERENCES && LA17_617 <= KW_REGEXP)||LA17_617==KW_REVOKE||(LA17_617 >= KW_RIGHT && LA17_617 <= KW_RLIKE)||(LA17_617 >= KW_ROLLUP && LA17_617 <= KW_ROWS)||LA17_617==KW_SET||LA17_617==KW_SMALLINT||LA17_617==KW_TABLE||LA17_617==KW_TIMESTAMP||LA17_617==KW_TO||(LA17_617 >= KW_TRIGGER && LA17_617 <= KW_TRUNCATE)||LA17_617==KW_UNION||LA17_617==KW_UPDATE||(LA17_617 >= KW_USER && LA17_617 <= KW_USING)||LA17_617==KW_VALUES||LA17_617==KW_WITH) ) {s = 717;}
						 
						input.seek(index17_617);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_663 = input.LA(1);
						 
						int index17_663 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_663);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_664 = input.LA(1);
						 
						int index17_664 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_664);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_665 = input.LA(1);
						 
						int index17_665 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_665);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_667 = input.LA(1);
						 
						int index17_667 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_667);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_668 = input.LA(1);
						 
						int index17_668 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_668);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_669 = input.LA(1);
						 
						int index17_669 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_669);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_671 = input.LA(1);
						 
						int index17_671 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_671);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_672 = input.LA(1);
						 
						int index17_672 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_672);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_673 = input.LA(1);
						 
						int index17_673 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_673);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_675 = input.LA(1);
						 
						int index17_675 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_675);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_676 = input.LA(1);
						 
						int index17_676 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_676);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA17_677 = input.LA(1);
						 
						int index17_677 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_677);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA17_679 = input.LA(1);
						 
						int index17_679 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_679);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA17_680 = input.LA(1);
						 
						int index17_680 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_680);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA17_681 = input.LA(1);
						 
						int index17_681 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_681);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA17_683 = input.LA(1);
						 
						int index17_683 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_683);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA17_684 = input.LA(1);
						 
						int index17_684 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_684);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA17_685 = input.LA(1);
						 
						int index17_685 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_685);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA17_687 = input.LA(1);
						 
						int index17_687 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_687);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA17_688 = input.LA(1);
						 
						int index17_688 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_688);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA17_689 = input.LA(1);
						 
						int index17_689 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_689);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA17_691 = input.LA(1);
						 
						int index17_691 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_691);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA17_692 = input.LA(1);
						 
						int index17_692 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_692);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA17_693 = input.LA(1);
						 
						int index17_693 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_693);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA17_695 = input.LA(1);
						 
						int index17_695 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_695);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA17_696 = input.LA(1);
						 
						int index17_696 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_696);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA17_697 = input.LA(1);
						 
						int index17_697 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_697);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA17_699 = input.LA(1);
						 
						int index17_699 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_699);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA17_700 = input.LA(1);
						 
						int index17_700 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_700);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA17_701 = input.LA(1);
						 
						int index17_701 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_701);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA17_703 = input.LA(1);
						 
						int index17_703 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_703);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA17_704 = input.LA(1);
						 
						int index17_704 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_704);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA17_705 = input.LA(1);
						 
						int index17_705 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 714;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index17_705);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA17_707 = input.LA(1);
						 
						int index17_707 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_707);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA17_708 = input.LA(1);
						 
						int index17_708 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_708);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA17_709 = input.LA(1);
						 
						int index17_709 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_709);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA17_711 = input.LA(1);
						 
						int index17_711 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_711);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA17_712 = input.LA(1);
						 
						int index17_712 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_712);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA17_713 = input.LA(1);
						 
						int index17_713 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_713);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA17_715 = input.LA(1);
						 
						int index17_715 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_715);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA17_716 = input.LA(1);
						 
						int index17_716 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_716);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA17_717 = input.LA(1);
						 
						int index17_717 = input.index();
						input.rewind();
						s = -1;
						if ( (((useSQL11ReservedKeywordsForIdentifier())&&synpred1_SelectClauseParser())) ) {s = 714;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index17_717);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA16_eotS =
		"\u0145\uffff";
	static final String DFA16_eofS =
		"\1\5\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff\4\2\2\uffff\1\2\1\uffff\1\2\u0131"+
		"\uffff";
	static final String DFA16_minS =
		"\2\12\1\uffff\2\12\4\uffff\1\12\1\uffff\4\12\2\uffff\1\12\1\uffff\1\12"+
		"\132\uffff\1\32\15\uffff\3\7\146\uffff\140\0";
	static final String DFA16_maxS =
		"\2\u0216\1\uffff\2\u0146\4\uffff\1\u0146\1\uffff\4\u0146\2\uffff\1\u0146"+
		"\1\uffff\1\u0146\132\uffff\1\u0216\15\uffff\3\u0216\146\uffff\140\0";
	static final String DFA16_acceptS =
		"\2\uffff\1\1\2\uffff\1\3\22\uffff\1\2\u012c\uffff";
	static final String DFA16_specialS =
		"\u00e5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
		"\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
		"\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
		"\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
		"\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
		"\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
		"\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133"+
		"\1\134\1\135\1\136\1\137}>";
	static final String[] DFA16_transitionS = {
			"\1\5\17\uffff\10\2\1\uffff\2\2\1\1\14\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
			"\1\3\3\2\1\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2"+
			"\1\uffff\20\2\1\uffff\1\14\3\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1"+
			"\uffff\10\2\1\uffff\4\2\1\5\1\2\1\uffff\2\2\1\4\1\2\1\5\2\2\1\uffff\10"+
			"\2\1\23\2\2\1\uffff\5\2\1\uffff\4\2\1\21\1\2\1\uffff\2\2\1\16\10\2\1"+
			"\uffff\1\5\6\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\1\11\4\2\1"+
			"\uffff\2\2\1\uffff\5\2\2\uffff\13\2\1\5\17\2\1\uffff\6\2\1\5\14\2\1\15"+
			"\2\2\1\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\1\2\1\13"+
			"\1\2\1\uffff\15\2\1\uffff\1\2\1\uffff\1\5\1\2\1\5\4\2\16\uffff\1\5\172"+
			"\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff"+
			"\1\2",
			"\1\2\17\uffff\10\2\1\uffff\17\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2"+
			"\1\uffff\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\20\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1"+
			"\uffff\6\2\1\uffff\7\2\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff\13"+
			"\2\1\uffff\7\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\33\2\1\uffff\26\2\1\uffff\7\2\1\uffff\3\2\1"+
			"\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15\2\1\uffff\1\2\1\uffff\7"+
			"\2\3\uffff\1\30\12\uffff\1\2\172\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3"+
			"\uffff\1\2\27\uffff\1\2\3\uffff\1\2",
			"",
			"\1\2\46\uffff\1\5\6\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\32\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"\1\2\46\uffff\1\5\6\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\32\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"",
			"",
			"",
			"",
			"\1\2\46\uffff\1\5\6\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\32\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"",
			"\1\2\24\uffff\1\5\30\uffff\1\2\47\uffff\1\5\1\2\32\uffff\1\156\4\uffff"+
			"\1\2\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\175"+
			"\25\uffff\1\2\32\uffff\1\176\26\uffff\1\174\14\uffff\1\2\34\uffff\1\2"+
			"\22\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
			"\1\2\46\uffff\1\5\6\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\32\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"\1\2\46\uffff\1\5\6\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\32\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"\1\2\55\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff\1\2\32\uffff"+
			"\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\22\uffff\1\2\1\uffff\1\2"+
			"\15\uffff\1\5\4\uffff\1\2",
			"",
			"",
			"\1\2\55\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\13\uffff\1\2\15\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff\1\2\32\uffff"+
			"\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2\20\uffff\1\5\1\uffff\1\2"+
			"\1\uffff\1\2\22\uffff\1\2",
			"",
			"\1\2\55\uffff\1\2\50\uffff\1\2\32\uffff\1\2\4\uffff\1\2\1\uffff\1\2"+
			"\13\uffff\1\2\3\uffff\1\5\11\uffff\1\2\4\uffff\1\2\11\uffff\1\2\25\uffff"+
			"\1\2\5\uffff\1\5\24\uffff\1\2\26\uffff\1\2\14\uffff\1\2\34\uffff\1\2"+
			"\22\uffff\1\2\1\uffff\1\2\22\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e5\4\u00e6\2\u00e7\1\u00e6\1\uffff\1\u00e6\2\u00e7\1\u00e6\1\u00e7"+
			"\2\u00e6\5\u00e7\2\u00e6\1\u00e7\1\uffff\1\u00e6\2\uffff\1\u00e6\1\uffff"+
			"\4\u00e6\1\uffff\2\u00e6\1\uffff\4\u00e6\1\uffff\1\u00e7\1\u00e6\1\u00e7"+
			"\1\uffff\1\u00e7\1\uffff\3\u00e7\1\u00e6\1\uffff\1\u00e6\1\u00e7\3\u00e6"+
			"\1\u00e7\2\u00e6\1\u00e7\3\u00e6\1\u00e7\3\u00e6\1\uffff\1\u00e6\2\u00e7"+
			"\1\u00e6\1\uffff\1\u00e6\1\uffff\1\u00e6\1\uffff\1\u00e6\1\u00e7\2\u00e6"+
			"\1\uffff\3\u00e7\4\u00e6\1\u00e7\1\uffff\2\u00e7\2\u00e6\1\uffff\1\u00e7"+
			"\1\uffff\1\u00e6\3\u00e7\1\uffff\2\u00e6\1\uffff\2\u00e7\2\u00e6\1\u00e7"+
			"\3\u00e6\3\u00e7\1\uffff\2\u00e7\3\u00e6\1\uffff\4\u00e6\2\u00e7\1\uffff"+
			"\1\u00e6\1\u00e7\3\u00e6\1\u00e7\5\u00e6\2\uffff\6\u00e6\1\uffff\1\u00e6"+
			"\1\u00e7\2\u00e6\1\uffff\1\u00e6\1\u00e7\1\u00e6\1\u00e7\1\u00e6\2\uffff"+
			"\1\u00e6\1\uffff\3\u00e7\2\u00e6\1\uffff\2\u00e6\1\uffff\1\u00e7\2\u00e6"+
			"\1\u00e7\1\u00e6\2\uffff\1\u00e6\1\u00e7\1\u00e6\1\u00e7\1\u00e6\1\u00e7"+
			"\1\u00e6\1\u00e7\3\u00e6\1\uffff\2\u00e7\7\u00e6\1\u00e7\1\u00e6\2\u00e7"+
			"\2\u00e6\1\uffff\3\u00e7\3\u00e6\1\uffff\4\u00e6\1\u00e7\5\u00e6\1\u00e7"+
			"\4\u00e6\1\uffff\5\u00e6\1\u00e7\1\u00e6\1\uffff\3\u00e6\1\uffff\1\u00e7"+
			"\1\u00e6\1\u00e7\3\u00e6\1\uffff\3\u00e7\1\u00e6\1\uffff\1\u00e6\1\u00e7"+
			"\1\u00e6\1\u00e9\3\u00e6\1\u00e7\2\u00e6\2\u00e7\3\u00e6\1\u00e7\1\u00e6"+
			"\1\uffff\1\u00e6\2\uffff\1\u00e6\1\uffff\1\u00e7\3\u00e6\3\uffff\1\u00e8"+
			"\u0085\uffff\1\u00e6\3\uffff\1\u00e6\60\uffff\1\u00e6\3\uffff\1\u00e6"+
			"\27\uffff\1\u00e6\3\uffff\1\u00e6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00fc\5\uffff\1\u0100\1\uffff\1\u00ea\2\uffff\1\u00ff\7\uffff\1\u00ee"+
			"\4\u0105\1\u00eb\1\u0109\1\u0105\1\uffff\1\u0105\1\u0102\1\u0109\1\u0105"+
			"\1\u0109\2\u0105\1\u0109\3\u0106\1\u0109\2\u0105\1\u0109\1\uffff\1\u0105"+
			"\1\u0104\1\u0103\1\u0105\1\uffff\4\u0105\1\uffff\2\u0105\1\uffff\4\u0105"+
			"\1\uffff\1\u0109\1\u0105\1\u0109\1\uffff\1\u0109\1\uffff\1\u00f6\1\u00f8"+
			"\1\u0109\1\u0105\1\uffff\1\u0105\1\u00f4\3\u0105\1\u0109\2\u0105\1\u0109"+
			"\3\u0105\1\u0109\3\u0105\1\u00ec\1\u0105\1\u0106\1\u0109\1\u0105\1\uffff"+
			"\1\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0108\2\u0105\1\uffff\1\u0109"+
			"\1\u0101\1\u0109\4\u0105\1\u0106\1\uffff\2\u0109\2\u0105\1\uffff\1\u0109"+
			"\1\uffff\1\u0105\3\u0109\1\uffff\2\u0105\1\u0107\2\u0109\2\u0105\1\u0109"+
			"\3\u0105\1\u0109\1\u0106\1\u0109\1\u00fa\2\u0109\3\u0105\1\uffff\4\u0105"+
			"\2\u0109\1\uffff\1\u0105\1\u0109\3\u0105\1\u0109\5\u0105\1\uffff\1\u0107"+
			"\6\u0105\1\uffff\1\u0105\1\u0109\2\u0105\1\u00f1\1\u0105\1\u00f0\1\u0105"+
			"\1\u0109\1\u0105\2\uffff\1\u0105\1\uffff\3\u0109\2\u0105\1\uffff\2\u0105"+
			"\1\uffff\1\u0109\2\u0105\1\u0109\1\u0105\2\uffff\1\u0105\1\u0109\1\u0105"+
			"\1\u0109\1\u0105\1\u0109\1\u0105\1\u0109\3\u0105\1\uffff\2\u0109\7\u0105"+
			"\1\u0109\1\u0105\2\u0109\2\u0105\1\uffff\3\u0109\3\u0105\1\uffff\4\u0105"+
			"\1\u0109\5\u0105\1\u0106\4\u0105\1\uffff\4\u0105\1\u00ef\1\u0109\1\u0105"+
			"\1\uffff\3\u0105\1\uffff\1\u00f7\1\u0105\1\u0109\3\u0105\1\u010a\1\u0109"+
			"\1\u00f9\1\u0109\1\u0105\1\uffff\1\u0105\1\u0109\1\u00ef\1\uffff\3\u0105"+
			"\1\u0109\2\u0105\2\u0109\3\u0105\1\u0109\1\u0105\1\uffff\1\u0105\2\uffff"+
			"\1\u0105\1\uffff\1\u0109\3\u0105\3\uffff\1\u00f2\2\uffff\1\u00f3\2\uffff"+
			"\1\u00f5\1\u00f3\7\uffff\1\u00ed\1\u00fd\1\u00fb\1\u00f3\1\u00fe\162"+
			"\uffff\1\u0105\3\uffff\1\u0105\60\uffff\1\u0105\3\uffff\1\u0105\27\uffff"+
			"\1\u0105\3\uffff\1\u0105",
			"\1\u011a\5\uffff\1\u011e\4\uffff\1\u011d\7\uffff\1\u010c\4\u0123\2\u0127"+
			"\1\u0123\1\uffff\1\u0123\1\u0120\1\u0127\1\u0123\1\u0127\2\u0123\1\u0127"+
			"\3\u0124\1\u0127\2\u0123\1\u0127\1\uffff\1\u0123\1\u0122\1\u0121\1\u0123"+
			"\1\uffff\4\u0123\1\uffff\2\u0123\1\uffff\4\u0123\1\uffff\1\u0127\1\u0123"+
			"\1\u0127\1\uffff\1\u0127\1\uffff\1\u0114\1\u0116\1\u0127\1\u0123\1\uffff"+
			"\1\u0123\1\u0112\3\u0123\1\u0127\2\u0123\1\u0127\3\u0123\1\u0127\3\u0123"+
			"\1\uffff\1\u0123\1\u0124\1\u0127\1\u0123\1\uffff\1\u0123\1\uffff\1\u0123"+
			"\1\uffff\1\u0123\1\u0126\2\u0123\1\uffff\1\u0127\1\u011f\1\u0127\4\u0123"+
			"\1\u0124\1\uffff\2\u0127\2\u0123\1\uffff\1\u0127\1\uffff\1\u0123\3\u0127"+
			"\1\uffff\2\u0123\1\u0125\2\u0127\2\u0123\1\u0127\3\u0123\1\u0127\1\u0124"+
			"\1\u0127\1\u0118\2\u0127\3\u0123\1\uffff\4\u0123\2\u0127\1\uffff\1\u0123"+
			"\1\u0127\3\u0123\1\u0127\5\u0123\1\uffff\1\u0125\6\u0123\1\uffff\1\u0123"+
			"\1\u0127\2\u0123\1\u010f\1\u0123\1\u010e\1\u0123\1\u0127\1\u0123\2\uffff"+
			"\1\u0123\1\uffff\3\u0127\2\u0123\1\uffff\2\u0123\1\uffff\1\u0127\2\u0123"+
			"\1\u0127\1\u0123\2\uffff\1\u0123\1\u0127\1\u0123\1\u0127\1\u0123\1\u0127"+
			"\1\u0123\1\u0127\3\u0123\1\uffff\2\u0127\7\u0123\1\u0127\1\u0123\2\u0127"+
			"\2\u0123\1\uffff\3\u0127\3\u0123\1\uffff\4\u0123\1\u0127\5\u0123\1\u0124"+
			"\4\u0123\1\uffff\4\u0123\1\u010d\1\u0127\1\u0123\1\uffff\3\u0123\1\uffff"+
			"\1\u0115\1\u0123\1\u0127\3\u0123\1\uffff\1\u0127\1\u0117\1\u0127\1\u0123"+
			"\1\uffff\1\u0123\1\u0127\1\u010d\1\uffff\3\u0123\1\u0127\2\u0123\2\u0127"+
			"\3\u0123\1\u0127\1\u0123\1\uffff\1\u0123\2\uffff\1\u0123\1\uffff\1\u0127"+
			"\3\u0123\3\uffff\1\u0110\2\uffff\1\u0111\2\uffff\1\u0113\1\u0111\7\uffff"+
			"\1\u010b\1\u011b\1\u0119\1\u0111\1\u011c\162\uffff\1\u0123\3\uffff\1"+
			"\u0123\60\uffff\1\u0123\3\uffff\1\u0123\27\uffff\1\u0123\3\uffff\1\u0123",
			"\1\u0137\5\uffff\1\u013b\4\uffff\1\u013a\7\uffff\1\u0129\4\u0140\2\u0144"+
			"\1\u0140\1\uffff\1\u0140\1\u013d\1\u0144\1\u0140\1\u0144\2\u0140\1\u0144"+
			"\3\u0141\1\u0144\2\u0140\1\u0144\1\uffff\1\u0140\1\u013f\1\u013e\1\u0140"+
			"\1\uffff\4\u0140\1\uffff\2\u0140\1\uffff\4\u0140\1\uffff\1\u0144\1\u0140"+
			"\1\u0144\1\uffff\1\u0144\1\uffff\1\u0131\1\u0133\1\u0144\1\u0140\1\uffff"+
			"\1\u0140\1\u012f\3\u0140\1\u0144\2\u0140\1\u0144\3\u0140\1\u0144\3\u0140"+
			"\1\uffff\1\u0140\1\u0141\1\u0144\1\u0140\1\uffff\1\u0140\1\uffff\1\u0140"+
			"\1\uffff\1\u0140\1\u0143\2\u0140\1\uffff\1\u0144\1\u013c\1\u0144\4\u0140"+
			"\1\u0141\1\uffff\2\u0144\2\u0140\1\uffff\1\u0144\1\uffff\1\u0140\3\u0144"+
			"\1\uffff\2\u0140\1\u0142\2\u0144\2\u0140\1\u0144\3\u0140\1\u0144\1\u0141"+
			"\1\u0144\1\u0135\2\u0144\3\u0140\1\uffff\4\u0140\2\u0144\1\uffff\1\u0140"+
			"\1\u0144\3\u0140\1\u0144\5\u0140\1\uffff\1\u0142\6\u0140\1\uffff\1\u0140"+
			"\1\u0144\2\u0140\1\u012c\1\u0140\1\u012b\1\u0140\1\u0144\1\u0140\2\uffff"+
			"\1\u0140\1\uffff\3\u0144\2\u0140\1\uffff\2\u0140\1\uffff\1\u0144\2\u0140"+
			"\1\u0144\1\u0140\2\uffff\1\u0140\1\u0144\1\u0140\1\u0144\1\u0140\1\u0144"+
			"\1\u0140\1\u0144\3\u0140\1\uffff\2\u0144\7\u0140\1\u0144\1\u0140\2\u0144"+
			"\2\u0140\1\uffff\3\u0144\3\u0140\1\uffff\4\u0140\1\u0144\5\u0140\1\u0141"+
			"\4\u0140\1\uffff\4\u0140\1\u012a\1\u0144\1\u0140\1\uffff\3\u0140\1\uffff"+
			"\1\u0132\1\u0140\1\u0144\3\u0140\1\uffff\1\u0144\1\u0134\1\u0144\1\u0140"+
			"\1\uffff\1\u0140\1\u0144\1\u012a\1\uffff\3\u0140\1\u0144\2\u0140\2\u0144"+
			"\3\u0140\1\u0144\1\u0140\1\uffff\1\u0140\2\uffff\1\u0140\1\uffff\1\u0144"+
			"\3\u0140\3\uffff\1\u012d\2\uffff\1\u012e\2\uffff\1\u0130\1\u012e\7\uffff"+
			"\1\u0128\1\u0138\1\u0136\1\u012e\1\u0139\162\uffff\1\u0140\3\uffff\1"+
			"\u0140\60\uffff\1\u0140\3\uffff\1\u0140\27\uffff\1\u0140\3\uffff\1\u0140",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
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
			return "133:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_229 = input.LA(1);
						 
						int index16_229 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_229);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_230 = input.LA(1);
						 
						int index16_230 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_230);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA16_231 = input.LA(1);
						 
						int index16_231 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_231);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA16_232 = input.LA(1);
						 
						int index16_232 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_232);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA16_233 = input.LA(1);
						 
						int index16_233 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_233);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA16_234 = input.LA(1);
						 
						int index16_234 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_234);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA16_235 = input.LA(1);
						 
						int index16_235 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_235);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA16_236 = input.LA(1);
						 
						int index16_236 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_236);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA16_237 = input.LA(1);
						 
						int index16_237 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_237);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA16_238 = input.LA(1);
						 
						int index16_238 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_238);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA16_239 = input.LA(1);
						 
						int index16_239 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_239);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA16_240 = input.LA(1);
						 
						int index16_240 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_240);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA16_241 = input.LA(1);
						 
						int index16_241 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_241);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA16_242 = input.LA(1);
						 
						int index16_242 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_242);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA16_243 = input.LA(1);
						 
						int index16_243 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_243);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA16_244 = input.LA(1);
						 
						int index16_244 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_244);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA16_245 = input.LA(1);
						 
						int index16_245 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_245);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA16_246 = input.LA(1);
						 
						int index16_246 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_246);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA16_247 = input.LA(1);
						 
						int index16_247 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_247);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA16_248 = input.LA(1);
						 
						int index16_248 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_248);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA16_249 = input.LA(1);
						 
						int index16_249 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_249);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA16_250 = input.LA(1);
						 
						int index16_250 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_250);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA16_251 = input.LA(1);
						 
						int index16_251 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_251);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA16_252 = input.LA(1);
						 
						int index16_252 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_252);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA16_253 = input.LA(1);
						 
						int index16_253 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_253);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA16_254 = input.LA(1);
						 
						int index16_254 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_254);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA16_255 = input.LA(1);
						 
						int index16_255 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_255);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA16_256 = input.LA(1);
						 
						int index16_256 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_256);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA16_257 = input.LA(1);
						 
						int index16_257 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_257);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA16_258 = input.LA(1);
						 
						int index16_258 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_258);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA16_259 = input.LA(1);
						 
						int index16_259 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_259);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA16_260 = input.LA(1);
						 
						int index16_260 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_260);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA16_261 = input.LA(1);
						 
						int index16_261 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_261);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA16_262 = input.LA(1);
						 
						int index16_262 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_262);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA16_263 = input.LA(1);
						 
						int index16_263 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_263);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA16_264 = input.LA(1);
						 
						int index16_264 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_264);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA16_265 = input.LA(1);
						 
						int index16_265 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_265);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA16_266 = input.LA(1);
						 
						int index16_266 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_266);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA16_267 = input.LA(1);
						 
						int index16_267 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_267);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA16_268 = input.LA(1);
						 
						int index16_268 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_268);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA16_269 = input.LA(1);
						 
						int index16_269 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_269);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA16_270 = input.LA(1);
						 
						int index16_270 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_270);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA16_271 = input.LA(1);
						 
						int index16_271 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_271);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA16_272 = input.LA(1);
						 
						int index16_272 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_272);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA16_273 = input.LA(1);
						 
						int index16_273 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_273);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA16_274 = input.LA(1);
						 
						int index16_274 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_274);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA16_275 = input.LA(1);
						 
						int index16_275 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_275);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA16_276 = input.LA(1);
						 
						int index16_276 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_276);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA16_277 = input.LA(1);
						 
						int index16_277 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_277);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA16_278 = input.LA(1);
						 
						int index16_278 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_278);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA16_279 = input.LA(1);
						 
						int index16_279 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_279);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA16_280 = input.LA(1);
						 
						int index16_280 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_280);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA16_281 = input.LA(1);
						 
						int index16_281 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_281);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA16_282 = input.LA(1);
						 
						int index16_282 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_282);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA16_283 = input.LA(1);
						 
						int index16_283 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_283);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA16_284 = input.LA(1);
						 
						int index16_284 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_284);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA16_285 = input.LA(1);
						 
						int index16_285 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_285);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA16_286 = input.LA(1);
						 
						int index16_286 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_286);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA16_287 = input.LA(1);
						 
						int index16_287 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_287);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA16_288 = input.LA(1);
						 
						int index16_288 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_288);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA16_289 = input.LA(1);
						 
						int index16_289 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_289);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA16_290 = input.LA(1);
						 
						int index16_290 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_290);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA16_291 = input.LA(1);
						 
						int index16_291 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_291);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA16_292 = input.LA(1);
						 
						int index16_292 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_292);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA16_293 = input.LA(1);
						 
						int index16_293 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_293);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA16_294 = input.LA(1);
						 
						int index16_294 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_294);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA16_295 = input.LA(1);
						 
						int index16_295 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_295);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA16_296 = input.LA(1);
						 
						int index16_296 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_296);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA16_297 = input.LA(1);
						 
						int index16_297 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_297);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA16_298 = input.LA(1);
						 
						int index16_298 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_298);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA16_299 = input.LA(1);
						 
						int index16_299 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_299);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA16_300 = input.LA(1);
						 
						int index16_300 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_300);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA16_301 = input.LA(1);
						 
						int index16_301 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_301);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA16_302 = input.LA(1);
						 
						int index16_302 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_302);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA16_303 = input.LA(1);
						 
						int index16_303 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_303);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA16_304 = input.LA(1);
						 
						int index16_304 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_304);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA16_305 = input.LA(1);
						 
						int index16_305 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_305);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA16_306 = input.LA(1);
						 
						int index16_306 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_306);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA16_307 = input.LA(1);
						 
						int index16_307 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_307);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA16_308 = input.LA(1);
						 
						int index16_308 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_308);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA16_309 = input.LA(1);
						 
						int index16_309 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_309);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA16_310 = input.LA(1);
						 
						int index16_310 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_310);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA16_311 = input.LA(1);
						 
						int index16_311 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_311);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA16_312 = input.LA(1);
						 
						int index16_312 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_312);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA16_313 = input.LA(1);
						 
						int index16_313 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_313);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA16_314 = input.LA(1);
						 
						int index16_314 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_314);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA16_315 = input.LA(1);
						 
						int index16_315 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_315);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA16_316 = input.LA(1);
						 
						int index16_316 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_316);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA16_317 = input.LA(1);
						 
						int index16_317 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_317);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA16_318 = input.LA(1);
						 
						int index16_318 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_318);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA16_319 = input.LA(1);
						 
						int index16_319 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_319);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA16_320 = input.LA(1);
						 
						int index16_320 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_320);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA16_321 = input.LA(1);
						 
						int index16_321 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_321);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA16_322 = input.LA(1);
						 
						int index16_322 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_322);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA16_323 = input.LA(1);
						 
						int index16_323 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_323);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA16_324 = input.LA(1);
						 
						int index16_324 = input.index();
						input.rewind();
						s = -1;
						if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index16_324);
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

	static final String DFA14_eotS =
		"\u00d1\uffff";
	static final String DFA14_eofS =
		"\1\uffff\1\2\4\uffff\2\5\4\uffff\1\5\1\uffff\4\5\2\uffff\1\5\1\uffff\1"+
		"\5\u00ba\uffff";
	static final String DFA14_minS =
		"\1\32\1\12\4\uffff\2\12\4\uffff\1\12\1\uffff\4\12\2\uffff\1\12\1\uffff"+
		"\1\12\103\uffff\1\0\15\uffff\3\0\146\uffff";
	static final String DFA14_maxS =
		"\2\u0216\4\uffff\2\u0146\4\uffff\1\u0146\1\uffff\4\u0146\2\uffff\1\u0146"+
		"\1\uffff\1\u0146\103\uffff\1\0\15\uffff\3\0\146\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\u00cb\uffff";
	static final String DFA14_specialS =
		"\132\uffff\1\0\15\uffff\1\1\1\2\1\3\146\uffff}>";
	static final String[] DFA14_transitionS = {
			"\10\2\1\uffff\2\2\1\1\14\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\1\uffff"+
			"\2\2\1\uffff\4\2\1\uffff\3\2\1\uffff\1\2\1\uffff\4\2\1\uffff\20\2\1\uffff"+
			"\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff\4\2\1\uffff\10\2\1\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\13\2\1\uffff\5\2\1\uffff\6\2\1\uffff"+
			"\13\2\2\uffff\6\2\1\uffff\4\2\1\uffff\5\2\2\uffff\1\2\1\uffff\5\2\1\uffff"+
			"\2\2\1\uffff\5\2\2\uffff\13\2\1\uffff\17\2\1\uffff\6\2\1\uffff\17\2\1"+
			"\uffff\7\2\1\uffff\3\2\1\uffff\6\2\1\uffff\4\2\1\uffff\3\2\1\uffff\15"+
			"\2\1\uffff\1\2\2\uffff\1\2\1\uffff\4\2\u0089\uffff\1\2\3\uffff\1\2\60"+
			"\uffff\1\2\3\uffff\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\2\17\uffff\10\5\1\uffff\17\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\6"+
			"\3\5\1\uffff\2\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\4\5\1\uffff"+
			"\20\5\1\uffff\1\17\3\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\1\uffff\10"+
			"\5\1\uffff\4\5\1\2\1\5\1\uffff\2\5\1\7\1\5\1\2\2\5\1\uffff\10\5\1\26"+
			"\2\5\1\uffff\5\5\1\uffff\4\5\1\24\1\5\1\uffff\2\5\1\21\10\5\1\uffff\1"+
			"\2\6\5\1\uffff\4\5\1\uffff\5\5\2\uffff\1\5\1\uffff\1\14\4\5\1\uffff\2"+
			"\5\1\uffff\5\5\2\uffff\13\5\1\2\17\5\1\uffff\6\5\1\2\14\5\1\20\2\5\1"+
			"\uffff\7\5\1\uffff\3\5\1\uffff\6\5\1\uffff\4\5\1\uffff\1\5\1\16\1\5\1"+
			"\uffff\15\5\1\uffff\1\5\1\uffff\1\2\1\5\1\2\4\5\16\uffff\1\2\172\uffff"+
			"\1\5\3\uffff\1\5\60\uffff\1\5\3\uffff\1\5\27\uffff\1\5\3\uffff\1\5",
			"",
			"",
			"",
			"",
			"\1\5\46\uffff\1\2\6\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5"+
			"\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\32\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"\1\5\46\uffff\1\2\6\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5"+
			"\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\32\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"",
			"",
			"",
			"",
			"\1\5\46\uffff\1\2\6\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5"+
			"\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\32\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"",
			"\1\5\24\uffff\1\2\30\uffff\1\5\47\uffff\1\2\1\5\32\uffff\1\132\4\uffff"+
			"\1\5\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\151"+
			"\25\uffff\1\5\32\uffff\1\152\26\uffff\1\150\14\uffff\1\5\34\uffff\1\5"+
			"\22\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
			"\1\5\46\uffff\1\2\6\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5"+
			"\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\32\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"\1\5\46\uffff\1\2\6\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5"+
			"\1\uffff\1\5\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\32\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"\1\5\55\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5\1\uffff\1\5"+
			"\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff\1\5\32\uffff"+
			"\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\22\uffff\1\5\1\uffff\1\5"+
			"\15\uffff\1\2\4\uffff\1\5",
			"",
			"",
			"\1\5\55\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5\1\uffff\1\5"+
			"\13\uffff\1\5\15\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff\1\5\32\uffff"+
			"\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5\20\uffff\1\2\1\uffff\1\5"+
			"\1\uffff\1\5\22\uffff\1\5",
			"",
			"\1\5\55\uffff\1\5\50\uffff\1\5\32\uffff\1\5\4\uffff\1\5\1\uffff\1\5"+
			"\13\uffff\1\5\3\uffff\1\2\11\uffff\1\5\4\uffff\1\5\11\uffff\1\5\25\uffff"+
			"\1\5\5\uffff\1\2\24\uffff\1\5\26\uffff\1\5\14\uffff\1\5\34\uffff\1\5"+
			"\22\uffff\1\5\1\uffff\1\5\22\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "133:9: ( KW_AS )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_90 = input.LA(1);
						 
						int index14_90 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index14_90);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_104 = input.LA(1);
						 
						int index14_104 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index14_104);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_105 = input.LA(1);
						 
						int index14_105 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index14_105);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA14_106 = input.LA(1);
						 
						int index14_106 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((useSQL11ReservedKeywordsForIdentifier())))) ) {s = 5;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 2;}
						 
						input.seek(index14_106);
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

	static final String DFA19_eotS =
		"\103\uffff";
	static final String DFA19_eofS =
		"\103\uffff";
	static final String DFA19_minS =
		"\1\32\3\12\77\uffff";
	static final String DFA19_maxS =
		"\1\u0216\3\u0146\77\uffff";
	static final String DFA19_acceptS =
		"\4\uffff\1\1\1\uffff\1\2\74\uffff";
	static final String DFA19_specialS =
		"\103\uffff}>";
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
			"\1\2\1\uffff\1\3\3\2\u0089\uffff\1\2\3\uffff\1\2\60\uffff\1\2\3\uffff"+
			"\1\2\27\uffff\1\2\3\uffff\1\2",
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"\1\4\31\uffff\1\6\6\uffff\3\6\11\uffff\1\6\31\uffff\2\6\2\uffff\1\6"+
			"\14\uffff\1\6\23\uffff\1\6\31\uffff\1\6\33\uffff\1\6\122\uffff\1\6\10"+
			"\uffff\2\6\7\uffff\2\6\14\uffff\1\6\16\uffff\1\6\27\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "145:22: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA20_eotS =
		"\u00d3\uffff";
	static final String DFA20_eofS =
		"\1\uffff\3\4\u00cf\uffff";
	static final String DFA20_minS =
		"\1\32\3\12\23\uffff\1\7\46\uffff\1\7\46\uffff\1\7\155\uffff";
	static final String DFA20_maxS =
		"\1\u0216\3\u0146\23\uffff\1\u0216\46\uffff\1\u0216\46\uffff\1\u0216\155"+
		"\uffff";
	static final String DFA20_acceptS =
		"\4\uffff\1\1\24\uffff\1\2\u00b9\uffff";
	static final String DFA20_specialS =
		"\u00d3\uffff}>";
	static final String[] DFA20_transitionS = {
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
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\27\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\76\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"\1\4\31\uffff\1\31\6\uffff\3\31\11\uffff\1\31\1\4\30\uffff\2\31\2\uffff"+
			"\1\31\13\uffff\1\4\1\31\23\uffff\1\31\5\uffff\1\4\4\uffff\1\4\1\uffff"+
			"\1\4\13\uffff\1\4\1\31\14\uffff\1\4\4\uffff\1\4\11\uffff\1\145\25\uffff"+
			"\1\4\30\uffff\1\4\1\uffff\1\4\21\uffff\1\4\4\uffff\1\4\12\uffff\1\31"+
			"\1\uffff\1\4\6\uffff\2\31\7\uffff\2\31\13\uffff\1\4\1\31\16\uffff\1\31"+
			"\2\uffff\1\4\1\uffff\1\4\22\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\4\5\uffff\1\4\4\uffff\1\4\7\uffff\10\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\3\4\1\uffff\1\4\1\uffff\4"+
			"\4\1\uffff\20\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff"+
			"\10\4\1\uffff\4\4\1\uffff\1\4\1\uffff\4\4\1\uffff\24\4\1\uffff\6\4\1"+
			"\uffff\13\4\1\uffff\7\4\1\uffff\12\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\5\4\2\uffff\13\4\1\uffff\17\4\1\uffff\6\4\1\uffff\17\4\1"+
			"\uffff\7\4\1\uffff\3\4\1\uffff\6\4\1\uffff\4\4\1\uffff\3\4\1\uffff\15"+
			"\4\1\uffff\1\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\31\1\uffff\1\4\2\uffff"+
			"\1\4\2\uffff\2\4\7\uffff\5\4\162\uffff\1\4\3\uffff\1\4\60\uffff\1\4\3"+
			"\uffff\1\4\27\uffff\1\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "145:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA23_eotS =
		"\u01e0\uffff";
	static final String DFA23_eofS =
		"\u01e0\uffff";
	static final String DFA23_minS =
		"\1\7\1\uffff\3\4\3\uffff\1\4\1\uffff\4\4\7\uffff\2\4\2\uffff\2\4\1\uffff"+
		"\2\4\1\32\33\uffff\1\32\33\uffff\1\32\34\uffff\1\32\33\uffff\1\32\34\uffff"+
		"\1\32\33\uffff\1\32\33\uffff\1\32\33\uffff\1\32\33\uffff\1\32\33\uffff"+
		"\1\32\33\uffff\1\32\33\uffff\1\32\33\uffff\1\32\34\uffff\3\0\1\uffff\3"+
		"\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0";
	static final String DFA23_maxS =
		"\1\u0216\1\uffff\3\u014a\3\uffff\1\u014c\1\uffff\1\u014a\1\u014c\2\u014a"+
		"\7\uffff\2\u014a\2\uffff\2\u014a\1\uffff\2\u014a\1\u0216\33\uffff\1\u0216"+
		"\33\uffff\1\u0216\34\uffff\1\u0216\33\uffff\1\u0216\34\uffff\1\u0216\33"+
		"\uffff\1\u0216\33\uffff\1\u0216\33\uffff\1\u0216\33\uffff\1\u0216\33\uffff"+
		"\1\u0216\33\uffff\1\u0216\33\uffff\1\u0216\33\uffff\1\u0216\34\uffff\3"+
		"\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff\3\0\1\uffff"+
		"\3\0\1\uffff\3\0";
	static final String DFA23_acceptS =
		"\1\uffff\1\1\3\uffff\1\2\u01a2\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff";
	static final String DFA23_specialS =
		"\1\0\35\uffff\1\1\33\uffff\1\2\33\uffff\1\3\34\uffff\1\4\33\uffff\1\5"+
		"\34\uffff\1\6\33\uffff\1\7\33\uffff\1\10\33\uffff\1\11\33\uffff\1\12\33"+
		"\uffff\1\13\33\uffff\1\14\33\uffff\1\15\33\uffff\1\16\34\uffff\1\17\1"+
		"\20\1\21\1\uffff\1\22\1\23\1\24\1\uffff\1\25\1\26\1\27\1\uffff\1\30\1"+
		"\31\1\32\1\uffff\1\33\1\34\1\35\1\uffff\1\36\1\37\1\40\1\uffff\1\41\1"+
		"\42\1\43\1\uffff\1\44\1\45\1\46\1\uffff\1\47\1\50\1\51\1\uffff\1\52\1"+
		"\53\1\54\1\uffff\1\55\1\56\1\57\1\uffff\1\60\1\61\1\62\1\uffff\1\63\1"+
		"\64\1\65\1\uffff\1\66\1\67\1\70}>";
	static final String[] DFA23_transitionS = {
			"\1\5\5\uffff\1\5\4\uffff\1\5\7\uffff\1\2\4\31\2\35\1\31\1\uffff\1\31"+
			"\1\26\1\35\1\31\1\35\2\31\1\35\3\32\1\35\2\31\1\35\1\uffff\1\31\2\5\1"+
			"\31\1\uffff\4\31\1\uffff\2\31\1\uffff\4\31\1\uffff\1\35\1\31\1\35\1\uffff"+
			"\1\35\1\uffff\1\12\1\14\1\35\1\31\1\uffff\1\31\1\10\3\31\1\35\2\31\1"+
			"\35\3\31\1\35\3\31\1\uffff\1\31\1\32\1\35\1\31\1\uffff\1\31\1\uffff\1"+
			"\31\1\uffff\1\31\1\34\2\31\1\uffff\1\35\1\25\1\35\4\31\1\32\1\uffff\2"+
			"\35\2\31\1\uffff\1\35\1\uffff\1\31\3\35\1\uffff\2\31\1\5\2\35\2\31\1"+
			"\35\3\31\1\35\1\32\1\35\1\5\2\35\3\31\1\uffff\4\31\2\35\1\uffff\1\31"+
			"\1\35\3\31\1\35\5\31\1\uffff\1\5\6\31\1\uffff\1\31\1\35\2\31\1\5\1\31"+
			"\1\4\1\31\1\35\1\31\2\uffff\1\31\1\uffff\3\35\2\31\1\uffff\2\31\1\uffff"+
			"\1\35\2\31\1\35\1\31\2\uffff\1\31\1\35\1\31\1\35\1\31\1\35\1\31\1\35"+
			"\3\31\1\uffff\2\35\7\31\1\35\1\31\2\35\2\31\1\uffff\3\35\3\31\1\uffff"+
			"\4\31\1\35\5\31\1\32\4\31\1\uffff\4\31\1\3\1\35\1\31\1\uffff\3\31\1\uffff"+
			"\1\13\1\31\1\35\3\31\1\uffff\1\35\1\15\1\35\1\31\1\uffff\1\31\1\35\1"+
			"\3\1\uffff\3\31\1\35\2\31\2\35\3\31\1\35\1\31\1\uffff\1\31\2\uffff\1"+
			"\31\1\uffff\1\35\3\31\3\uffff\1\5\2\uffff\1\5\2\uffff\2\5\7\uffff\1\1"+
			"\4\5\162\uffff\1\31\3\uffff\1\31\60\uffff\1\31\3\uffff\1\31\27\uffff"+
			"\1\31\3\uffff\1\31",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\36\2\uffff\2\5\1\uffff\2\5\11"+
			"\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26\uffff"+
			"\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff\1\5\70"+
			"\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1"+
			"\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\72\2\uffff\2\5\1\uffff\2\5\11"+
			"\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26\uffff"+
			"\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff\1\5\70"+
			"\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1"+
			"\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\126\2\uffff\2\5\1\uffff\2\5\11"+
			"\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26\uffff"+
			"\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff\1\5\70"+
			"\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1"+
			"\5",
			"",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\163\2\uffff\2\5\1\uffff\2\5\11"+
			"\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26\uffff"+
			"\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff\1\5\70"+
			"\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3\uffff\1"+
			"\5\1\uffff\1\5",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u008f\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u00ac\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5\1\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u00c8\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u00e4\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0100\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u011c\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0138\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0154\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u0170\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\3\5\3\uffff\1\5\3\uffff\2\5\1\uffff\1\u018c\2\uffff\2\5\1\uffff\2\5"+
			"\11\uffff\1\5\7\uffff\1\5\135\uffff\1\5\13\uffff\1\5\14\uffff\1\5\26"+
			"\uffff\1\5\10\uffff\1\5\32\uffff\1\5\2\uffff\1\5\12\uffff\1\5\4\uffff"+
			"\1\5\70\uffff\1\5\20\uffff\4\5\1\uffff\3\5\1\uffff\1\5\3\uffff\1\5\3"+
			"\uffff\1\5",
			"\1\u01a9\4\u01aa\2\u01ab\1\u01aa\1\uffff\1\u01aa\2\u01ab\1\u01aa\1\u01ab"+
			"\2\u01aa\5\u01ab\2\u01aa\1\u01ab\1\uffff\1\u01aa\2\uffff\1\u01aa\1\uffff"+
			"\4\u01aa\1\uffff\2\u01aa\1\uffff\4\u01aa\1\uffff\1\u01ab\1\u01aa\1\u01ab"+
			"\1\uffff\1\u01ab\1\uffff\3\u01ab\1\u01aa\1\uffff\1\u01aa\1\u01ab\3\u01aa"+
			"\1\u01ab\2\u01aa\1\u01ab\3\u01aa\1\u01ab\3\u01aa\1\uffff\1\u01aa\2\u01ab"+
			"\1\u01aa\1\uffff\1\u01aa\1\uffff\1\u01aa\1\uffff\1\u01aa\1\u01ab\2\u01aa"+
			"\1\uffff\3\u01ab\4\u01aa\1\u01ab\1\uffff\2\u01ab\2\u01aa\1\uffff\1\u01ab"+
			"\1\uffff\1\u01aa\3\u01ab\1\uffff\2\u01aa\1\uffff\2\u01ab\2\u01aa\1\u01ab"+
			"\3\u01aa\3\u01ab\1\uffff\2\u01ab\3\u01aa\1\uffff\4\u01aa\2\u01ab\1\uffff"+
			"\1\u01aa\1\u01ab\3\u01aa\1\u01ab\5\u01aa\2\uffff\6\u01aa\1\uffff\1\u01aa"+
			"\1\u01ab\2\u01aa\1\uffff\1\u01aa\1\u01ab\1\u01aa\1\u01ab\1\u01aa\2\uffff"+
			"\1\u01aa\1\uffff\3\u01ab\2\u01aa\1\uffff\2\u01aa\1\uffff\1\u01ab\2\u01aa"+
			"\1\u01ab\1\u01aa\2\uffff\1\u01aa\1\u01ab\1\u01aa\1\u01ab\1\u01aa\1\u01ab"+
			"\1\u01aa\1\u01ab\3\u01aa\1\uffff\2\u01ab\7\u01aa\1\u01ab\1\u01aa\2\u01ab"+
			"\2\u01aa\1\uffff\3\u01ab\3\u01aa\1\uffff\4\u01aa\1\u01ab\5\u01aa\1\u01ab"+
			"\4\u01aa\1\uffff\5\u01aa\1\u01ab\1\u01aa\1\uffff\3\u01aa\1\uffff\1\u01ab"+
			"\1\u01aa\1\u01ab\3\u01aa\1\uffff\3\u01ab\1\u01aa\1\uffff\1\u01aa\1\u01ab"+
			"\1\u01aa\1\uffff\3\u01aa\1\u01ab\2\u01aa\2\u01ab\3\u01aa\1\u01ab\1\u01aa"+
			"\1\uffff\1\u01aa\2\uffff\1\u01aa\1\uffff\1\u01ab\3\u01aa\22\uffff\1\u01a8"+
			"\166\uffff\1\u01aa\3\uffff\1\u01aa\60\uffff\1\u01aa\3\uffff\1\u01aa\27"+
			"\uffff\1\u01aa\3\uffff\1\u01aa",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01ad\4\u01ae\2\u01af\1\u01ae\1\uffff\1\u01ae\2\u01af\1\u01ae\1\u01af"+
			"\2\u01ae\5\u01af\2\u01ae\1\u01af\1\uffff\1\u01ae\2\uffff\1\u01ae\1\uffff"+
			"\4\u01ae\1\uffff\2\u01ae\1\uffff\4\u01ae\1\uffff\1\u01af\1\u01ae\1\u01af"+
			"\1\uffff\1\u01af\1\uffff\3\u01af\1\u01ae\1\uffff\1\u01ae\1\u01af\3\u01ae"+
			"\1\u01af\2\u01ae\1\u01af\3\u01ae\1\u01af\3\u01ae\1\uffff\1\u01ae\2\u01af"+
			"\1\u01ae\1\uffff\1\u01ae\1\uffff\1\u01ae\1\uffff\1\u01ae\1\u01af\2\u01ae"+
			"\1\uffff\3\u01af\4\u01ae\1\u01af\1\uffff\2\u01af\2\u01ae\1\uffff\1\u01af"+
			"\1\uffff\1\u01ae\3\u01af\1\uffff\2\u01ae\1\uffff\2\u01af\2\u01ae\1\u01af"+
			"\3\u01ae\3\u01af\1\uffff\2\u01af\3\u01ae\1\uffff\4\u01ae\2\u01af\1\uffff"+
			"\1\u01ae\1\u01af\3\u01ae\1\u01af\5\u01ae\2\uffff\6\u01ae\1\uffff\1\u01ae"+
			"\1\u01af\2\u01ae\1\uffff\1\u01ae\1\u01af\1\u01ae\1\u01af\1\u01ae\2\uffff"+
			"\1\u01ae\1\uffff\3\u01af\2\u01ae\1\uffff\2\u01ae\1\uffff\1\u01af\2\u01ae"+
			"\1\u01af\1\u01ae\2\uffff\1\u01ae\1\u01af\1\u01ae\1\u01af\1\u01ae\1\u01af"+
			"\1\u01ae\1\u01af\3\u01ae\1\uffff\2\u01af\7\u01ae\1\u01af\1\u01ae\2\u01af"+
			"\2\u01ae\1\uffff\3\u01af\3\u01ae\1\uffff\4\u01ae\1\u01af\5\u01ae\1\u01af"+
			"\4\u01ae\1\uffff\5\u01ae\1\u01af\1\u01ae\1\uffff\3\u01ae\1\uffff\1\u01af"+
			"\1\u01ae\1\u01af\3\u01ae\1\uffff\3\u01af\1\u01ae\1\uffff\1\u01ae\1\u01af"+
			"\1\u01ae\1\uffff\3\u01ae\1\u01af\2\u01ae\2\u01af\3\u01ae\1\u01af\1\u01ae"+
			"\1\uffff\1\u01ae\2\uffff\1\u01ae\1\uffff\1\u01af\3\u01ae\22\uffff\1\u01ac"+
			"\166\uffff\1\u01ae\3\uffff\1\u01ae\60\uffff\1\u01ae\3\uffff\1\u01ae\27"+
			"\uffff\1\u01ae\3\uffff\1\u01ae",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01b1\4\u01b2\2\u01b3\1\u01b2\1\uffff\1\u01b2\2\u01b3\1\u01b2\1\u01b3"+
			"\2\u01b2\5\u01b3\2\u01b2\1\u01b3\1\uffff\1\u01b2\2\uffff\1\u01b2\1\uffff"+
			"\4\u01b2\1\uffff\2\u01b2\1\uffff\4\u01b2\1\uffff\1\u01b3\1\u01b2\1\u01b3"+
			"\1\uffff\1\u01b3\1\uffff\3\u01b3\1\u01b2\1\uffff\1\u01b2\1\u01b3\3\u01b2"+
			"\1\u01b3\2\u01b2\1\u01b3\3\u01b2\1\u01b3\3\u01b2\1\uffff\1\u01b2\2\u01b3"+
			"\1\u01b2\1\uffff\1\u01b2\1\uffff\1\u01b2\1\uffff\1\u01b2\1\u01b3\2\u01b2"+
			"\1\uffff\3\u01b3\4\u01b2\1\u01b3\1\uffff\2\u01b3\2\u01b2\1\uffff\1\u01b3"+
			"\1\uffff\1\u01b2\3\u01b3\1\uffff\2\u01b2\1\uffff\2\u01b3\2\u01b2\1\u01b3"+
			"\3\u01b2\3\u01b3\1\uffff\2\u01b3\3\u01b2\1\uffff\4\u01b2\2\u01b3\1\uffff"+
			"\1\u01b2\1\u01b3\3\u01b2\1\u01b3\5\u01b2\2\uffff\6\u01b2\1\uffff\1\u01b2"+
			"\1\u01b3\2\u01b2\1\uffff\1\u01b2\1\u01b3\1\u01b2\1\u01b3\1\u01b2\2\uffff"+
			"\1\u01b2\1\uffff\3\u01b3\2\u01b2\1\uffff\2\u01b2\1\uffff\1\u01b3\2\u01b2"+
			"\1\u01b3\1\u01b2\2\uffff\1\u01b2\1\u01b3\1\u01b2\1\u01b3\1\u01b2\1\u01b3"+
			"\1\u01b2\1\u01b3\3\u01b2\1\uffff\2\u01b3\7\u01b2\1\u01b3\1\u01b2\2\u01b3"+
			"\2\u01b2\1\uffff\3\u01b3\3\u01b2\1\uffff\4\u01b2\1\u01b3\5\u01b2\1\u01b3"+
			"\4\u01b2\1\uffff\5\u01b2\1\u01b3\1\u01b2\1\uffff\3\u01b2\1\uffff\1\u01b3"+
			"\1\u01b2\1\u01b3\3\u01b2\1\uffff\3\u01b3\1\u01b2\1\uffff\1\u01b2\1\u01b3"+
			"\1\u01b2\1\uffff\3\u01b2\1\u01b3\2\u01b2\2\u01b3\3\u01b2\1\u01b3\1\u01b2"+
			"\1\uffff\1\u01b2\2\uffff\1\u01b2\1\uffff\1\u01b3\3\u01b2\22\uffff\1\u01b0"+
			"\166\uffff\1\u01b2\3\uffff\1\u01b2\60\uffff\1\u01b2\3\uffff\1\u01b2\27"+
			"\uffff\1\u01b2\3\uffff\1\u01b2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01b5\4\u01b6\2\u01b7\1\u01b6\1\uffff\1\u01b6\2\u01b7\1\u01b6\1\u01b7"+
			"\2\u01b6\5\u01b7\2\u01b6\1\u01b7\1\uffff\1\u01b6\2\uffff\1\u01b6\1\uffff"+
			"\4\u01b6\1\uffff\2\u01b6\1\uffff\4\u01b6\1\uffff\1\u01b7\1\u01b6\1\u01b7"+
			"\1\uffff\1\u01b7\1\uffff\3\u01b7\1\u01b6\1\uffff\1\u01b6\1\u01b7\3\u01b6"+
			"\1\u01b7\2\u01b6\1\u01b7\3\u01b6\1\u01b7\3\u01b6\1\uffff\1\u01b6\2\u01b7"+
			"\1\u01b6\1\uffff\1\u01b6\1\uffff\1\u01b6\1\uffff\1\u01b6\1\u01b7\2\u01b6"+
			"\1\uffff\3\u01b7\4\u01b6\1\u01b7\1\uffff\2\u01b7\2\u01b6\1\uffff\1\u01b7"+
			"\1\uffff\1\u01b6\3\u01b7\1\uffff\2\u01b6\1\uffff\2\u01b7\2\u01b6\1\u01b7"+
			"\3\u01b6\3\u01b7\1\uffff\2\u01b7\3\u01b6\1\uffff\4\u01b6\2\u01b7\1\uffff"+
			"\1\u01b6\1\u01b7\3\u01b6\1\u01b7\5\u01b6\2\uffff\6\u01b6\1\uffff\1\u01b6"+
			"\1\u01b7\2\u01b6\1\uffff\1\u01b6\1\u01b7\1\u01b6\1\u01b7\1\u01b6\2\uffff"+
			"\1\u01b6\1\uffff\3\u01b7\2\u01b6\1\uffff\2\u01b6\1\uffff\1\u01b7\2\u01b6"+
			"\1\u01b7\1\u01b6\2\uffff\1\u01b6\1\u01b7\1\u01b6\1\u01b7\1\u01b6\1\u01b7"+
			"\1\u01b6\1\u01b7\3\u01b6\1\uffff\2\u01b7\7\u01b6\1\u01b7\1\u01b6\2\u01b7"+
			"\2\u01b6\1\uffff\3\u01b7\3\u01b6\1\uffff\4\u01b6\1\u01b7\5\u01b6\1\u01b7"+
			"\4\u01b6\1\uffff\5\u01b6\1\u01b7\1\u01b6\1\uffff\3\u01b6\1\uffff\1\u01b7"+
			"\1\u01b6\1\u01b7\3\u01b6\1\uffff\3\u01b7\1\u01b6\1\uffff\1\u01b6\1\u01b7"+
			"\1\u01b6\1\uffff\3\u01b6\1\u01b7\2\u01b6\2\u01b7\3\u01b6\1\u01b7\1\u01b6"+
			"\1\uffff\1\u01b6\2\uffff\1\u01b6\1\uffff\1\u01b7\3\u01b6\22\uffff\1\u01b4"+
			"\166\uffff\1\u01b6\3\uffff\1\u01b6\60\uffff\1\u01b6\3\uffff\1\u01b6\27"+
			"\uffff\1\u01b6\3\uffff\1\u01b6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01b9\4\u01ba\2\u01bb\1\u01ba\1\uffff\1\u01ba\2\u01bb\1\u01ba\1\u01bb"+
			"\2\u01ba\5\u01bb\2\u01ba\1\u01bb\1\uffff\1\u01ba\2\uffff\1\u01ba\1\uffff"+
			"\4\u01ba\1\uffff\2\u01ba\1\uffff\4\u01ba\1\uffff\1\u01bb\1\u01ba\1\u01bb"+
			"\1\uffff\1\u01bb\1\uffff\3\u01bb\1\u01ba\1\uffff\1\u01ba\1\u01bb\3\u01ba"+
			"\1\u01bb\2\u01ba\1\u01bb\3\u01ba\1\u01bb\3\u01ba\1\uffff\1\u01ba\2\u01bb"+
			"\1\u01ba\1\uffff\1\u01ba\1\uffff\1\u01ba\1\uffff\1\u01ba\1\u01bb\2\u01ba"+
			"\1\uffff\3\u01bb\4\u01ba\1\u01bb\1\uffff\2\u01bb\2\u01ba\1\uffff\1\u01bb"+
			"\1\uffff\1\u01ba\3\u01bb\1\uffff\2\u01ba\1\uffff\2\u01bb\2\u01ba\1\u01bb"+
			"\3\u01ba\3\u01bb\1\uffff\2\u01bb\3\u01ba\1\uffff\4\u01ba\2\u01bb\1\uffff"+
			"\1\u01ba\1\u01bb\3\u01ba\1\u01bb\5\u01ba\2\uffff\6\u01ba\1\uffff\1\u01ba"+
			"\1\u01bb\2\u01ba\1\uffff\1\u01ba\1\u01bb\1\u01ba\1\u01bb\1\u01ba\2\uffff"+
			"\1\u01ba\1\uffff\3\u01bb\2\u01ba\1\uffff\2\u01ba\1\uffff\1\u01bb\2\u01ba"+
			"\1\u01bb\1\u01ba\2\uffff\1\u01ba\1\u01bb\1\u01ba\1\u01bb\1\u01ba\1\u01bb"+
			"\1\u01ba\1\u01bb\3\u01ba\1\uffff\2\u01bb\7\u01ba\1\u01bb\1\u01ba\2\u01bb"+
			"\2\u01ba\1\uffff\3\u01bb\3\u01ba\1\uffff\4\u01ba\1\u01bb\5\u01ba\1\u01bb"+
			"\4\u01ba\1\uffff\5\u01ba\1\u01bb\1\u01ba\1\uffff\3\u01ba\1\uffff\1\u01bb"+
			"\1\u01ba\1\u01bb\3\u01ba\1\uffff\3\u01bb\1\u01ba\1\uffff\1\u01ba\1\u01bb"+
			"\1\u01ba\1\uffff\3\u01ba\1\u01bb\2\u01ba\2\u01bb\3\u01ba\1\u01bb\1\u01ba"+
			"\1\uffff\1\u01ba\2\uffff\1\u01ba\1\uffff\1\u01bb\3\u01ba\22\uffff\1\u01b8"+
			"\166\uffff\1\u01ba\3\uffff\1\u01ba\60\uffff\1\u01ba\3\uffff\1\u01ba\27"+
			"\uffff\1\u01ba\3\uffff\1\u01ba",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01bd\4\u01be\2\u01bf\1\u01be\1\uffff\1\u01be\2\u01bf\1\u01be\1\u01bf"+
			"\2\u01be\5\u01bf\2\u01be\1\u01bf\1\uffff\1\u01be\2\uffff\1\u01be\1\uffff"+
			"\4\u01be\1\uffff\2\u01be\1\uffff\4\u01be\1\uffff\1\u01bf\1\u01be\1\u01bf"+
			"\1\uffff\1\u01bf\1\uffff\3\u01bf\1\u01be\1\uffff\1\u01be\1\u01bf\3\u01be"+
			"\1\u01bf\2\u01be\1\u01bf\3\u01be\1\u01bf\3\u01be\1\uffff\1\u01be\2\u01bf"+
			"\1\u01be\1\uffff\1\u01be\1\uffff\1\u01be\1\uffff\1\u01be\1\u01bf\2\u01be"+
			"\1\uffff\3\u01bf\4\u01be\1\u01bf\1\uffff\2\u01bf\2\u01be\1\uffff\1\u01bf"+
			"\1\uffff\1\u01be\3\u01bf\1\uffff\2\u01be\1\uffff\2\u01bf\2\u01be\1\u01bf"+
			"\3\u01be\3\u01bf\1\uffff\2\u01bf\3\u01be\1\uffff\4\u01be\2\u01bf\1\uffff"+
			"\1\u01be\1\u01bf\3\u01be\1\u01bf\5\u01be\2\uffff\6\u01be\1\uffff\1\u01be"+
			"\1\u01bf\2\u01be\1\uffff\1\u01be\1\u01bf\1\u01be\1\u01bf\1\u01be\2\uffff"+
			"\1\u01be\1\uffff\3\u01bf\2\u01be\1\uffff\2\u01be\1\uffff\1\u01bf\2\u01be"+
			"\1\u01bf\1\u01be\2\uffff\1\u01be\1\u01bf\1\u01be\1\u01bf\1\u01be\1\u01bf"+
			"\1\u01be\1\u01bf\3\u01be\1\uffff\2\u01bf\7\u01be\1\u01bf\1\u01be\2\u01bf"+
			"\2\u01be\1\uffff\3\u01bf\3\u01be\1\uffff\4\u01be\1\u01bf\5\u01be\1\u01bf"+
			"\4\u01be\1\uffff\5\u01be\1\u01bf\1\u01be\1\uffff\3\u01be\1\uffff\1\u01bf"+
			"\1\u01be\1\u01bf\3\u01be\1\uffff\3\u01bf\1\u01be\1\uffff\1\u01be\1\u01bf"+
			"\1\u01be\1\uffff\3\u01be\1\u01bf\2\u01be\2\u01bf\3\u01be\1\u01bf\1\u01be"+
			"\1\uffff\1\u01be\2\uffff\1\u01be\1\uffff\1\u01bf\3\u01be\22\uffff\1\u01bc"+
			"\166\uffff\1\u01be\3\uffff\1\u01be\60\uffff\1\u01be\3\uffff\1\u01be\27"+
			"\uffff\1\u01be\3\uffff\1\u01be",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01c1\4\u01c2\2\u01c3\1\u01c2\1\uffff\1\u01c2\2\u01c3\1\u01c2\1\u01c3"+
			"\2\u01c2\5\u01c3\2\u01c2\1\u01c3\1\uffff\1\u01c2\2\uffff\1\u01c2\1\uffff"+
			"\4\u01c2\1\uffff\2\u01c2\1\uffff\4\u01c2\1\uffff\1\u01c3\1\u01c2\1\u01c3"+
			"\1\uffff\1\u01c3\1\uffff\3\u01c3\1\u01c2\1\uffff\1\u01c2\1\u01c3\3\u01c2"+
			"\1\u01c3\2\u01c2\1\u01c3\3\u01c2\1\u01c3\3\u01c2\1\uffff\1\u01c2\2\u01c3"+
			"\1\u01c2\1\uffff\1\u01c2\1\uffff\1\u01c2\1\uffff\1\u01c2\1\u01c3\2\u01c2"+
			"\1\uffff\3\u01c3\4\u01c2\1\u01c3\1\uffff\2\u01c3\2\u01c2\1\uffff\1\u01c3"+
			"\1\uffff\1\u01c2\3\u01c3\1\uffff\2\u01c2\1\uffff\2\u01c3\2\u01c2\1\u01c3"+
			"\3\u01c2\3\u01c3\1\uffff\2\u01c3\3\u01c2\1\uffff\4\u01c2\2\u01c3\1\uffff"+
			"\1\u01c2\1\u01c3\3\u01c2\1\u01c3\5\u01c2\2\uffff\6\u01c2\1\uffff\1\u01c2"+
			"\1\u01c3\2\u01c2\1\uffff\1\u01c2\1\u01c3\1\u01c2\1\u01c3\1\u01c2\2\uffff"+
			"\1\u01c2\1\uffff\3\u01c3\2\u01c2\1\uffff\2\u01c2\1\uffff\1\u01c3\2\u01c2"+
			"\1\u01c3\1\u01c2\2\uffff\1\u01c2\1\u01c3\1\u01c2\1\u01c3\1\u01c2\1\u01c3"+
			"\1\u01c2\1\u01c3\3\u01c2\1\uffff\2\u01c3\7\u01c2\1\u01c3\1\u01c2\2\u01c3"+
			"\2\u01c2\1\uffff\3\u01c3\3\u01c2\1\uffff\4\u01c2\1\u01c3\5\u01c2\1\u01c3"+
			"\4\u01c2\1\uffff\5\u01c2\1\u01c3\1\u01c2\1\uffff\3\u01c2\1\uffff\1\u01c3"+
			"\1\u01c2\1\u01c3\3\u01c2\1\uffff\3\u01c3\1\u01c2\1\uffff\1\u01c2\1\u01c3"+
			"\1\u01c2\1\uffff\3\u01c2\1\u01c3\2\u01c2\2\u01c3\3\u01c2\1\u01c3\1\u01c2"+
			"\1\uffff\1\u01c2\2\uffff\1\u01c2\1\uffff\1\u01c3\3\u01c2\22\uffff\1\u01c0"+
			"\166\uffff\1\u01c2\3\uffff\1\u01c2\60\uffff\1\u01c2\3\uffff\1\u01c2\27"+
			"\uffff\1\u01c2\3\uffff\1\u01c2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01c5\4\u01c6\2\u01c7\1\u01c6\1\uffff\1\u01c6\2\u01c7\1\u01c6\1\u01c7"+
			"\2\u01c6\5\u01c7\2\u01c6\1\u01c7\1\uffff\1\u01c6\2\uffff\1\u01c6\1\uffff"+
			"\4\u01c6\1\uffff\2\u01c6\1\uffff\4\u01c6\1\uffff\1\u01c7\1\u01c6\1\u01c7"+
			"\1\uffff\1\u01c7\1\uffff\3\u01c7\1\u01c6\1\uffff\1\u01c6\1\u01c7\3\u01c6"+
			"\1\u01c7\2\u01c6\1\u01c7\3\u01c6\1\u01c7\3\u01c6\1\uffff\1\u01c6\2\u01c7"+
			"\1\u01c6\1\uffff\1\u01c6\1\uffff\1\u01c6\1\uffff\1\u01c6\1\u01c7\2\u01c6"+
			"\1\uffff\3\u01c7\4\u01c6\1\u01c7\1\uffff\2\u01c7\2\u01c6\1\uffff\1\u01c7"+
			"\1\uffff\1\u01c6\3\u01c7\1\uffff\2\u01c6\1\uffff\2\u01c7\2\u01c6\1\u01c7"+
			"\3\u01c6\3\u01c7\1\uffff\2\u01c7\3\u01c6\1\uffff\4\u01c6\2\u01c7\1\uffff"+
			"\1\u01c6\1\u01c7\3\u01c6\1\u01c7\5\u01c6\2\uffff\6\u01c6\1\uffff\1\u01c6"+
			"\1\u01c7\2\u01c6\1\uffff\1\u01c6\1\u01c7\1\u01c6\1\u01c7\1\u01c6\2\uffff"+
			"\1\u01c6\1\uffff\3\u01c7\2\u01c6\1\uffff\2\u01c6\1\uffff\1\u01c7\2\u01c6"+
			"\1\u01c7\1\u01c6\2\uffff\1\u01c6\1\u01c7\1\u01c6\1\u01c7\1\u01c6\1\u01c7"+
			"\1\u01c6\1\u01c7\3\u01c6\1\uffff\2\u01c7\7\u01c6\1\u01c7\1\u01c6\2\u01c7"+
			"\2\u01c6\1\uffff\3\u01c7\3\u01c6\1\uffff\4\u01c6\1\u01c7\5\u01c6\1\u01c7"+
			"\4\u01c6\1\uffff\5\u01c6\1\u01c7\1\u01c6\1\uffff\3\u01c6\1\uffff\1\u01c7"+
			"\1\u01c6\1\u01c7\3\u01c6\1\uffff\3\u01c7\1\u01c6\1\uffff\1\u01c6\1\u01c7"+
			"\1\u01c6\1\uffff\3\u01c6\1\u01c7\2\u01c6\2\u01c7\3\u01c6\1\u01c7\1\u01c6"+
			"\1\uffff\1\u01c6\2\uffff\1\u01c6\1\uffff\1\u01c7\3\u01c6\22\uffff\1\u01c4"+
			"\166\uffff\1\u01c6\3\uffff\1\u01c6\60\uffff\1\u01c6\3\uffff\1\u01c6\27"+
			"\uffff\1\u01c6\3\uffff\1\u01c6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01c9\4\u01ca\2\u01cb\1\u01ca\1\uffff\1\u01ca\2\u01cb\1\u01ca\1\u01cb"+
			"\2\u01ca\5\u01cb\2\u01ca\1\u01cb\1\uffff\1\u01ca\2\uffff\1\u01ca\1\uffff"+
			"\4\u01ca\1\uffff\2\u01ca\1\uffff\4\u01ca\1\uffff\1\u01cb\1\u01ca\1\u01cb"+
			"\1\uffff\1\u01cb\1\uffff\3\u01cb\1\u01ca\1\uffff\1\u01ca\1\u01cb\3\u01ca"+
			"\1\u01cb\2\u01ca\1\u01cb\3\u01ca\1\u01cb\3\u01ca\1\uffff\1\u01ca\2\u01cb"+
			"\1\u01ca\1\uffff\1\u01ca\1\uffff\1\u01ca\1\uffff\1\u01ca\1\u01cb\2\u01ca"+
			"\1\uffff\3\u01cb\4\u01ca\1\u01cb\1\uffff\2\u01cb\2\u01ca\1\uffff\1\u01cb"+
			"\1\uffff\1\u01ca\3\u01cb\1\uffff\2\u01ca\1\uffff\2\u01cb\2\u01ca\1\u01cb"+
			"\3\u01ca\3\u01cb\1\uffff\2\u01cb\3\u01ca\1\uffff\4\u01ca\2\u01cb\1\uffff"+
			"\1\u01ca\1\u01cb\3\u01ca\1\u01cb\5\u01ca\2\uffff\6\u01ca\1\uffff\1\u01ca"+
			"\1\u01cb\2\u01ca\1\uffff\1\u01ca\1\u01cb\1\u01ca\1\u01cb\1\u01ca\2\uffff"+
			"\1\u01ca\1\uffff\3\u01cb\2\u01ca\1\uffff\2\u01ca\1\uffff\1\u01cb\2\u01ca"+
			"\1\u01cb\1\u01ca\2\uffff\1\u01ca\1\u01cb\1\u01ca\1\u01cb\1\u01ca\1\u01cb"+
			"\1\u01ca\1\u01cb\3\u01ca\1\uffff\2\u01cb\7\u01ca\1\u01cb\1\u01ca\2\u01cb"+
			"\2\u01ca\1\uffff\3\u01cb\3\u01ca\1\uffff\4\u01ca\1\u01cb\5\u01ca\1\u01cb"+
			"\4\u01ca\1\uffff\5\u01ca\1\u01cb\1\u01ca\1\uffff\3\u01ca\1\uffff\1\u01cb"+
			"\1\u01ca\1\u01cb\3\u01ca\1\uffff\3\u01cb\1\u01ca\1\uffff\1\u01ca\1\u01cb"+
			"\1\u01ca\1\uffff\3\u01ca\1\u01cb\2\u01ca\2\u01cb\3\u01ca\1\u01cb\1\u01ca"+
			"\1\uffff\1\u01ca\2\uffff\1\u01ca\1\uffff\1\u01cb\3\u01ca\22\uffff\1\u01c8"+
			"\166\uffff\1\u01ca\3\uffff\1\u01ca\60\uffff\1\u01ca\3\uffff\1\u01ca\27"+
			"\uffff\1\u01ca\3\uffff\1\u01ca",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01cd\4\u01ce\2\u01cf\1\u01ce\1\uffff\1\u01ce\2\u01cf\1\u01ce\1\u01cf"+
			"\2\u01ce\5\u01cf\2\u01ce\1\u01cf\1\uffff\1\u01ce\2\uffff\1\u01ce\1\uffff"+
			"\4\u01ce\1\uffff\2\u01ce\1\uffff\4\u01ce\1\uffff\1\u01cf\1\u01ce\1\u01cf"+
			"\1\uffff\1\u01cf\1\uffff\3\u01cf\1\u01ce\1\uffff\1\u01ce\1\u01cf\3\u01ce"+
			"\1\u01cf\2\u01ce\1\u01cf\3\u01ce\1\u01cf\3\u01ce\1\uffff\1\u01ce\2\u01cf"+
			"\1\u01ce\1\uffff\1\u01ce\1\uffff\1\u01ce\1\uffff\1\u01ce\1\u01cf\2\u01ce"+
			"\1\uffff\3\u01cf\4\u01ce\1\u01cf\1\uffff\2\u01cf\2\u01ce\1\uffff\1\u01cf"+
			"\1\uffff\1\u01ce\3\u01cf\1\uffff\2\u01ce\1\uffff\2\u01cf\2\u01ce\1\u01cf"+
			"\3\u01ce\3\u01cf\1\uffff\2\u01cf\3\u01ce\1\uffff\4\u01ce\2\u01cf\1\uffff"+
			"\1\u01ce\1\u01cf\3\u01ce\1\u01cf\5\u01ce\2\uffff\6\u01ce\1\uffff\1\u01ce"+
			"\1\u01cf\2\u01ce\1\uffff\1\u01ce\1\u01cf\1\u01ce\1\u01cf\1\u01ce\2\uffff"+
			"\1\u01ce\1\uffff\3\u01cf\2\u01ce\1\uffff\2\u01ce\1\uffff\1\u01cf\2\u01ce"+
			"\1\u01cf\1\u01ce\2\uffff\1\u01ce\1\u01cf\1\u01ce\1\u01cf\1\u01ce\1\u01cf"+
			"\1\u01ce\1\u01cf\3\u01ce\1\uffff\2\u01cf\7\u01ce\1\u01cf\1\u01ce\2\u01cf"+
			"\2\u01ce\1\uffff\3\u01cf\3\u01ce\1\uffff\4\u01ce\1\u01cf\5\u01ce\1\u01cf"+
			"\4\u01ce\1\uffff\5\u01ce\1\u01cf\1\u01ce\1\uffff\3\u01ce\1\uffff\1\u01cf"+
			"\1\u01ce\1\u01cf\3\u01ce\1\uffff\3\u01cf\1\u01ce\1\uffff\1\u01ce\1\u01cf"+
			"\1\u01ce\1\uffff\3\u01ce\1\u01cf\2\u01ce\2\u01cf\3\u01ce\1\u01cf\1\u01ce"+
			"\1\uffff\1\u01ce\2\uffff\1\u01ce\1\uffff\1\u01cf\3\u01ce\22\uffff\1\u01cc"+
			"\166\uffff\1\u01ce\3\uffff\1\u01ce\60\uffff\1\u01ce\3\uffff\1\u01ce\27"+
			"\uffff\1\u01ce\3\uffff\1\u01ce",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d1\4\u01d2\2\u01d3\1\u01d2\1\uffff\1\u01d2\2\u01d3\1\u01d2\1\u01d3"+
			"\2\u01d2\5\u01d3\2\u01d2\1\u01d3\1\uffff\1\u01d2\2\uffff\1\u01d2\1\uffff"+
			"\4\u01d2\1\uffff\2\u01d2\1\uffff\4\u01d2\1\uffff\1\u01d3\1\u01d2\1\u01d3"+
			"\1\uffff\1\u01d3\1\uffff\3\u01d3\1\u01d2\1\uffff\1\u01d2\1\u01d3\3\u01d2"+
			"\1\u01d3\2\u01d2\1\u01d3\3\u01d2\1\u01d3\3\u01d2\1\uffff\1\u01d2\2\u01d3"+
			"\1\u01d2\1\uffff\1\u01d2\1\uffff\1\u01d2\1\uffff\1\u01d2\1\u01d3\2\u01d2"+
			"\1\uffff\3\u01d3\4\u01d2\1\u01d3\1\uffff\2\u01d3\2\u01d2\1\uffff\1\u01d3"+
			"\1\uffff\1\u01d2\3\u01d3\1\uffff\2\u01d2\1\uffff\2\u01d3\2\u01d2\1\u01d3"+
			"\3\u01d2\3\u01d3\1\uffff\2\u01d3\3\u01d2\1\uffff\4\u01d2\2\u01d3\1\uffff"+
			"\1\u01d2\1\u01d3\3\u01d2\1\u01d3\5\u01d2\2\uffff\6\u01d2\1\uffff\1\u01d2"+
			"\1\u01d3\2\u01d2\1\uffff\1\u01d2\1\u01d3\1\u01d2\1\u01d3\1\u01d2\2\uffff"+
			"\1\u01d2\1\uffff\3\u01d3\2\u01d2\1\uffff\2\u01d2\1\uffff\1\u01d3\2\u01d2"+
			"\1\u01d3\1\u01d2\2\uffff\1\u01d2\1\u01d3\1\u01d2\1\u01d3\1\u01d2\1\u01d3"+
			"\1\u01d2\1\u01d3\3\u01d2\1\uffff\2\u01d3\7\u01d2\1\u01d3\1\u01d2\2\u01d3"+
			"\2\u01d2\1\uffff\3\u01d3\3\u01d2\1\uffff\4\u01d2\1\u01d3\5\u01d2\1\u01d3"+
			"\4\u01d2\1\uffff\5\u01d2\1\u01d3\1\u01d2\1\uffff\3\u01d2\1\uffff\1\u01d3"+
			"\1\u01d2\1\u01d3\3\u01d2\1\uffff\3\u01d3\1\u01d2\1\uffff\1\u01d2\1\u01d3"+
			"\1\u01d2\1\uffff\3\u01d2\1\u01d3\2\u01d2\2\u01d3\3\u01d2\1\u01d3\1\u01d2"+
			"\1\uffff\1\u01d2\2\uffff\1\u01d2\1\uffff\1\u01d3\3\u01d2\22\uffff\1\u01d0"+
			"\166\uffff\1\u01d2\3\uffff\1\u01d2\60\uffff\1\u01d2\3\uffff\1\u01d2\27"+
			"\uffff\1\u01d2\3\uffff\1\u01d2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d5\4\u01d6\2\u01d7\1\u01d6\1\uffff\1\u01d6\2\u01d7\1\u01d6\1\u01d7"+
			"\2\u01d6\5\u01d7\2\u01d6\1\u01d7\1\uffff\1\u01d6\2\uffff\1\u01d6\1\uffff"+
			"\4\u01d6\1\uffff\2\u01d6\1\uffff\4\u01d6\1\uffff\1\u01d7\1\u01d6\1\u01d7"+
			"\1\uffff\1\u01d7\1\uffff\3\u01d7\1\u01d6\1\uffff\1\u01d6\1\u01d7\3\u01d6"+
			"\1\u01d7\2\u01d6\1\u01d7\3\u01d6\1\u01d7\3\u01d6\1\uffff\1\u01d6\2\u01d7"+
			"\1\u01d6\1\uffff\1\u01d6\1\uffff\1\u01d6\1\uffff\1\u01d6\1\u01d7\2\u01d6"+
			"\1\uffff\3\u01d7\4\u01d6\1\u01d7\1\uffff\2\u01d7\2\u01d6\1\uffff\1\u01d7"+
			"\1\uffff\1\u01d6\3\u01d7\1\uffff\2\u01d6\1\uffff\2\u01d7\2\u01d6\1\u01d7"+
			"\3\u01d6\3\u01d7\1\uffff\2\u01d7\3\u01d6\1\uffff\4\u01d6\2\u01d7\1\uffff"+
			"\1\u01d6\1\u01d7\3\u01d6\1\u01d7\5\u01d6\2\uffff\6\u01d6\1\uffff\1\u01d6"+
			"\1\u01d7\2\u01d6\1\uffff\1\u01d6\1\u01d7\1\u01d6\1\u01d7\1\u01d6\2\uffff"+
			"\1\u01d6\1\uffff\3\u01d7\2\u01d6\1\uffff\2\u01d6\1\uffff\1\u01d7\2\u01d6"+
			"\1\u01d7\1\u01d6\2\uffff\1\u01d6\1\u01d7\1\u01d6\1\u01d7\1\u01d6\1\u01d7"+
			"\1\u01d6\1\u01d7\3\u01d6\1\uffff\2\u01d7\7\u01d6\1\u01d7\1\u01d6\2\u01d7"+
			"\2\u01d6\1\uffff\3\u01d7\3\u01d6\1\uffff\4\u01d6\1\u01d7\5\u01d6\1\u01d7"+
			"\4\u01d6\1\uffff\5\u01d6\1\u01d7\1\u01d6\1\uffff\3\u01d6\1\uffff\1\u01d7"+
			"\1\u01d6\1\u01d7\3\u01d6\1\uffff\3\u01d7\1\u01d6\1\uffff\1\u01d6\1\u01d7"+
			"\1\u01d6\1\uffff\3\u01d6\1\u01d7\2\u01d6\2\u01d7\3\u01d6\1\u01d7\1\u01d6"+
			"\1\uffff\1\u01d6\2\uffff\1\u01d6\1\uffff\1\u01d7\3\u01d6\22\uffff\1\u01d4"+
			"\166\uffff\1\u01d6\3\uffff\1\u01d6\60\uffff\1\u01d6\3\uffff\1\u01d6\27"+
			"\uffff\1\u01d6\3\uffff\1\u01d6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01d9\4\u01da\2\u01db\1\u01da\1\uffff\1\u01da\2\u01db\1\u01da\1\u01db"+
			"\2\u01da\5\u01db\2\u01da\1\u01db\1\uffff\1\u01da\2\uffff\1\u01da\1\uffff"+
			"\4\u01da\1\uffff\2\u01da\1\uffff\4\u01da\1\uffff\1\u01db\1\u01da\1\u01db"+
			"\1\uffff\1\u01db\1\uffff\3\u01db\1\u01da\1\uffff\1\u01da\1\u01db\3\u01da"+
			"\1\u01db\2\u01da\1\u01db\3\u01da\1\u01db\3\u01da\1\uffff\1\u01da\2\u01db"+
			"\1\u01da\1\uffff\1\u01da\1\uffff\1\u01da\1\uffff\1\u01da\1\u01db\2\u01da"+
			"\1\uffff\3\u01db\4\u01da\1\u01db\1\uffff\2\u01db\2\u01da\1\uffff\1\u01db"+
			"\1\uffff\1\u01da\3\u01db\1\uffff\2\u01da\1\uffff\2\u01db\2\u01da\1\u01db"+
			"\3\u01da\3\u01db\1\uffff\2\u01db\3\u01da\1\uffff\4\u01da\2\u01db\1\uffff"+
			"\1\u01da\1\u01db\3\u01da\1\u01db\5\u01da\2\uffff\6\u01da\1\uffff\1\u01da"+
			"\1\u01db\2\u01da\1\uffff\1\u01da\1\u01db\1\u01da\1\u01db\1\u01da\2\uffff"+
			"\1\u01da\1\uffff\3\u01db\2\u01da\1\uffff\2\u01da\1\uffff\1\u01db\2\u01da"+
			"\1\u01db\1\u01da\2\uffff\1\u01da\1\u01db\1\u01da\1\u01db\1\u01da\1\u01db"+
			"\1\u01da\1\u01db\3\u01da\1\uffff\2\u01db\7\u01da\1\u01db\1\u01da\2\u01db"+
			"\2\u01da\1\uffff\3\u01db\3\u01da\1\uffff\4\u01da\1\u01db\5\u01da\1\u01db"+
			"\4\u01da\1\uffff\5\u01da\1\u01db\1\u01da\1\uffff\3\u01da\1\uffff\1\u01db"+
			"\1\u01da\1\u01db\3\u01da\1\uffff\3\u01db\1\u01da\1\uffff\1\u01da\1\u01db"+
			"\1\u01da\1\uffff\3\u01da\1\u01db\2\u01da\2\u01db\3\u01da\1\u01db\1\u01da"+
			"\1\uffff\1\u01da\2\uffff\1\u01da\1\uffff\1\u01db\3\u01da\22\uffff\1\u01d8"+
			"\166\uffff\1\u01da\3\uffff\1\u01da\60\uffff\1\u01da\3\uffff\1\u01da\27"+
			"\uffff\1\u01da\3\uffff\1\u01da",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01dd\4\u01de\2\u01df\1\u01de\1\uffff\1\u01de\2\u01df\1\u01de\1\u01df"+
			"\2\u01de\5\u01df\2\u01de\1\u01df\1\uffff\1\u01de\2\uffff\1\u01de\1\uffff"+
			"\4\u01de\1\uffff\2\u01de\1\uffff\4\u01de\1\uffff\1\u01df\1\u01de\1\u01df"+
			"\1\uffff\1\u01df\1\uffff\3\u01df\1\u01de\1\uffff\1\u01de\1\u01df\3\u01de"+
			"\1\u01df\2\u01de\1\u01df\3\u01de\1\u01df\3\u01de\1\uffff\1\u01de\2\u01df"+
			"\1\u01de\1\uffff\1\u01de\1\uffff\1\u01de\1\uffff\1\u01de\1\u01df\2\u01de"+
			"\1\uffff\3\u01df\4\u01de\1\u01df\1\uffff\2\u01df\2\u01de\1\uffff\1\u01df"+
			"\1\uffff\1\u01de\3\u01df\1\uffff\2\u01de\1\uffff\2\u01df\2\u01de\1\u01df"+
			"\3\u01de\3\u01df\1\uffff\2\u01df\3\u01de\1\uffff\4\u01de\2\u01df\1\uffff"+
			"\1\u01de\1\u01df\3\u01de\1\u01df\5\u01de\2\uffff\6\u01de\1\uffff\1\u01de"+
			"\1\u01df\2\u01de\1\uffff\1\u01de\1\u01df\1\u01de\1\u01df\1\u01de\2\uffff"+
			"\1\u01de\1\uffff\3\u01df\2\u01de\1\uffff\2\u01de\1\uffff\1\u01df\2\u01de"+
			"\1\u01df\1\u01de\2\uffff\1\u01de\1\u01df\1\u01de\1\u01df\1\u01de\1\u01df"+
			"\1\u01de\1\u01df\3\u01de\1\uffff\2\u01df\7\u01de\1\u01df\1\u01de\2\u01df"+
			"\2\u01de\1\uffff\3\u01df\3\u01de\1\uffff\4\u01de\1\u01df\5\u01de\1\u01df"+
			"\4\u01de\1\uffff\5\u01de\1\u01df\1\u01de\1\uffff\3\u01de\1\uffff\1\u01df"+
			"\1\u01de\1\u01df\3\u01de\1\uffff\3\u01df\1\u01de\1\uffff\1\u01de\1\u01df"+
			"\1\u01de\1\uffff\3\u01de\1\u01df\2\u01de\2\u01df\3\u01de\1\u01df\1\u01de"+
			"\1\uffff\1\u01de\2\uffff\1\u01de\1\uffff\1\u01df\3\u01de\22\uffff\1\u01dc"+
			"\166\uffff\1\u01de\3\uffff\1\u01de\60\uffff\1\u01de\3\uffff\1\u01de\27"+
			"\uffff\1\u01de\3\uffff\1\u01de",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "150:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_0 = input.LA(1);
						 
						int index23_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_0==STAR) && (synpred2_SelectClauseParser())) {s = 1;}
						else if ( (LA23_0==Identifier) ) {s = 2;}
						else if ( (LA23_0==KW_STRUCT||LA23_0==KW_UNIONTYPE) ) {s = 3;}
						else if ( (LA23_0==KW_NULL) ) {s = 4;}
						else if ( (LA23_0==BigintLiteral||LA23_0==CharSetName||LA23_0==DecimalLiteral||(LA23_0 >= KW_CASE && LA23_0 <= KW_CAST)||LA23_0==KW_IF||LA23_0==KW_INTERVAL||LA23_0==KW_MAP||LA23_0==KW_NOT||LA23_0==LPAREN||LA23_0==MINUS||(LA23_0 >= Number && LA23_0 <= PLUS)||(LA23_0 >= SmallintLiteral && LA23_0 <= TinyintLiteral)) ) {s = 5;}
						else if ( (LA23_0==KW_DATE) ) {s = 8;}
						else if ( (LA23_0==KW_CURRENT_DATE) ) {s = 10;}
						else if ( (LA23_0==KW_TIMESTAMP) ) {s = 11;}
						else if ( (LA23_0==KW_CURRENT_TIMESTAMP) ) {s = 12;}
						else if ( (LA23_0==KW_TRUE) ) {s = 13;}
						else if ( (LA23_0==KW_FALSE) ) {s = 21;}
						else if ( (LA23_0==KW_ARRAY) ) {s = 22;}
						else if ( ((LA23_0 >= KW_ABORT && LA23_0 <= KW_AFTER)||LA23_0==KW_ANALYZE||LA23_0==KW_ARCHIVE||LA23_0==KW_ASC||(LA23_0 >= KW_AUTOCOMMIT && LA23_0 <= KW_BEFORE)||(LA23_0 >= KW_BUCKET && LA23_0 <= KW_BUCKETS)||LA23_0==KW_CASCADE||LA23_0==KW_CHANGE||(LA23_0 >= KW_CLUSTER && LA23_0 <= KW_COLLECTION)||(LA23_0 >= KW_COLUMNS && LA23_0 <= KW_COMMENT)||(LA23_0 >= KW_COMPACT && LA23_0 <= KW_CONCATENATE)||LA23_0==KW_CONTINUE||LA23_0==KW_DATA||LA23_0==KW_DATABASES||(LA23_0 >= KW_DATETIME && LA23_0 <= KW_DBPROPERTIES)||(LA23_0 >= KW_DEFERRED && LA23_0 <= KW_DEFINED)||(LA23_0 >= KW_DELIMITED && LA23_0 <= KW_DESC)||(LA23_0 >= KW_DIRECTORIES && LA23_0 <= KW_DISABLE)||LA23_0==KW_DISTRIBUTE||LA23_0==KW_ELEM_TYPE||LA23_0==KW_ENABLE||LA23_0==KW_ESCAPED||LA23_0==KW_EXCLUSIVE||(LA23_0 >= KW_EXPLAIN && LA23_0 <= KW_EXPORT)||(LA23_0 >= KW_FIELDS && LA23_0 <= KW_FIRST)||(LA23_0 >= KW_FORMAT && LA23_0 <= KW_FORMATTED)||LA23_0==KW_FUNCTIONS||(LA23_0 >= KW_HOUR && LA23_0 <= KW_IDXPROPERTIES)||(LA23_0 >= KW_INDEX && LA23_0 <= KW_INDEXES)||(LA23_0 >= KW_INPATH && LA23_0 <= KW_INPUTFORMAT)||(LA23_0 >= KW_ISOLATION && LA23_0 <= KW_JAR)||(LA23_0 >= KW_KEY && LA23_0 <= KW_LAST)||LA23_0==KW_LEVEL||(LA23_0 >= KW_LIMIT && LA23_0 <= KW_LOAD)||(LA23_0 >= KW_LOCATION && LA23_0 <= KW_LONG)||(LA23_0 >= KW_MAPJOIN && LA23_0 <= KW_MONTH)||LA23_0==KW_MSCK||(LA23_0 >= KW_NORELY && LA23_0 <= KW_NOSCAN)||LA23_0==KW_NOVALIDATE||LA23_0==KW_NULLS||LA23_0==KW_OFFSET||LA23_0==KW_OPTION||(LA23_0 >= KW_OUTPUTDRIVER && LA23_0 <= KW_OUTPUTFORMAT)||(LA23_0 >= KW_OVERWRITE && LA23_0 <= KW_OWNER)||(LA23_0 >= KW_PARTITIONED && LA23_0 <= KW_PARTITIONS)||LA23_0==KW_PLUS||LA23_0==KW_PRETTY||LA23_0==KW_PRINCIPALS||LA23_0==KW_PURGE||LA23_0==KW_READ||(LA23_0 >= KW_REBUILD && LA23_0 <= KW_RECORDWRITER)||(LA23_0 >= KW_RELOAD && LA23_0 <= KW_RESTRICT)||LA23_0==KW_REWRITE||(LA23_0 >= KW_ROLE && LA23_0 <= KW_ROLES)||(LA23_0 >= KW_SCHEMA && LA23_0 <= KW_SECOND)||(LA23_0 >= KW_SEMI && LA23_0 <= KW_SERVER)||(LA23_0 >= KW_SETS && LA23_0 <= KW_SKEWED)||(LA23_0 >= KW_SNAPSHOT && LA23_0 <= KW_SSL)||(LA23_0 >= KW_STATISTICS && LA23_0 <= KW_STRING)||LA23_0==KW_TABLES||(LA23_0 >= KW_TBLPROPERTIES && LA23_0 <= KW_TERMINATED)||LA23_0==KW_TINYINT||(LA23_0 >= KW_TOUCH && LA23_0 <= KW_TRANSACTIONS)||LA23_0==KW_UNARCHIVE||LA23_0==KW_UNDO||(LA23_0 >= KW_UNLOCK && LA23_0 <= KW_UNSIGNED)||(LA23_0 >= KW_URI && LA23_0 <= KW_USE)||(LA23_0 >= KW_UTC && LA23_0 <= KW_VALIDATE)||LA23_0==KW_VALUE_TYPE||LA23_0==KW_VIEW||LA23_0==KW_WHILE||(LA23_0 >= KW_WORK && LA23_0 <= KW_YEAR)||LA23_0==KW_HOLD_DDLTIME||LA23_0==KW_IGNORE||LA23_0==KW_NO_DROP||LA23_0==KW_OFFLINE||LA23_0==KW_PROTECTION||LA23_0==KW_READONLY) ) {s = 25;}
						else if ( ((LA23_0 >= KW_BIGINT && LA23_0 <= KW_BOOLEAN)||LA23_0==KW_DOUBLE||LA23_0==KW_FLOAT||LA23_0==KW_INT||LA23_0==KW_SMALLINT) ) {s = 26;}
						else if ( (LA23_0==KW_EXISTS) ) {s = 28;}
						else if ( ((LA23_0 >= KW_ALL && LA23_0 <= KW_ALTER)||LA23_0==KW_AS||LA23_0==KW_AUTHORIZATION||LA23_0==KW_BETWEEN||LA23_0==KW_BOTH||LA23_0==KW_BY||LA23_0==KW_CONSTRAINT||LA23_0==KW_CREATE||LA23_0==KW_CUBE||LA23_0==KW_CURSOR||LA23_0==KW_DECIMAL||LA23_0==KW_DELETE||LA23_0==KW_DESCRIBE||LA23_0==KW_DROP||LA23_0==KW_EXTERNAL||LA23_0==KW_FETCH||(LA23_0 >= KW_FOR && LA23_0 <= KW_FOREIGN)||LA23_0==KW_FULL||(LA23_0 >= KW_GRANT && LA23_0 <= KW_GROUPING)||(LA23_0 >= KW_IMPORT && LA23_0 <= KW_IN)||LA23_0==KW_INNER||LA23_0==KW_INSERT||LA23_0==KW_INTERSECT||(LA23_0 >= KW_INTO && LA23_0 <= KW_IS)||(LA23_0 >= KW_LATERAL && LA23_0 <= KW_LEFT)||LA23_0==KW_LIKE||LA23_0==KW_LOCAL||LA23_0==KW_NONE||LA23_0==KW_OF||(LA23_0 >= KW_ORDER && LA23_0 <= KW_OUTER)||LA23_0==KW_PARTITION||LA23_0==KW_PERCENT||LA23_0==KW_PRIMARY||LA23_0==KW_PROCEDURE||LA23_0==KW_RANGE||LA23_0==KW_READS||(LA23_0 >= KW_REFERENCES && LA23_0 <= KW_REGEXP)||LA23_0==KW_REVOKE||(LA23_0 >= KW_RIGHT && LA23_0 <= KW_RLIKE)||(LA23_0 >= KW_ROLLUP && LA23_0 <= KW_ROWS)||LA23_0==KW_SET||LA23_0==KW_TABLE||LA23_0==KW_TO||LA23_0==KW_TRIGGER||LA23_0==KW_TRUNCATE||LA23_0==KW_UNION||LA23_0==KW_UPDATE||(LA23_0 >= KW_USER && LA23_0 <= KW_USING)||LA23_0==KW_VALUES||LA23_0==KW_WITH) ) {s = 29;}
						 
						input.seek(index23_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_30 = input.LA(1);
						 
						int index23_30 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_30==STAR) && (synpred2_SelectClauseParser())) {s = 424;}
						else if ( (LA23_30==Identifier) ) {s = 425;}
						else if ( ((LA23_30 >= KW_ABORT && LA23_30 <= KW_AFTER)||LA23_30==KW_ANALYZE||LA23_30==KW_ARCHIVE||LA23_30==KW_ASC||(LA23_30 >= KW_AUTOCOMMIT && LA23_30 <= KW_BEFORE)||(LA23_30 >= KW_BUCKET && LA23_30 <= KW_BUCKETS)||LA23_30==KW_CASCADE||LA23_30==KW_CHANGE||(LA23_30 >= KW_CLUSTER && LA23_30 <= KW_COLLECTION)||(LA23_30 >= KW_COLUMNS && LA23_30 <= KW_COMMENT)||(LA23_30 >= KW_COMPACT && LA23_30 <= KW_CONCATENATE)||LA23_30==KW_CONTINUE||LA23_30==KW_DATA||LA23_30==KW_DATABASES||(LA23_30 >= KW_DATETIME && LA23_30 <= KW_DBPROPERTIES)||(LA23_30 >= KW_DEFERRED && LA23_30 <= KW_DEFINED)||(LA23_30 >= KW_DELIMITED && LA23_30 <= KW_DESC)||(LA23_30 >= KW_DIRECTORIES && LA23_30 <= KW_DISABLE)||LA23_30==KW_DISTRIBUTE||LA23_30==KW_ELEM_TYPE||LA23_30==KW_ENABLE||LA23_30==KW_ESCAPED||LA23_30==KW_EXCLUSIVE||(LA23_30 >= KW_EXPLAIN && LA23_30 <= KW_EXPORT)||(LA23_30 >= KW_FIELDS && LA23_30 <= KW_FIRST)||(LA23_30 >= KW_FORMAT && LA23_30 <= KW_FORMATTED)||LA23_30==KW_FUNCTIONS||(LA23_30 >= KW_HOUR && LA23_30 <= KW_IDXPROPERTIES)||(LA23_30 >= KW_INDEX && LA23_30 <= KW_INDEXES)||(LA23_30 >= KW_INPATH && LA23_30 <= KW_INPUTFORMAT)||(LA23_30 >= KW_ISOLATION && LA23_30 <= KW_JAR)||(LA23_30 >= KW_KEY && LA23_30 <= KW_LAST)||LA23_30==KW_LEVEL||(LA23_30 >= KW_LIMIT && LA23_30 <= KW_LOAD)||(LA23_30 >= KW_LOCATION && LA23_30 <= KW_LONG)||(LA23_30 >= KW_MAPJOIN && LA23_30 <= KW_MONTH)||LA23_30==KW_MSCK||(LA23_30 >= KW_NORELY && LA23_30 <= KW_NOSCAN)||LA23_30==KW_NOVALIDATE||LA23_30==KW_NULLS||LA23_30==KW_OFFSET||LA23_30==KW_OPTION||(LA23_30 >= KW_OUTPUTDRIVER && LA23_30 <= KW_OUTPUTFORMAT)||(LA23_30 >= KW_OVERWRITE && LA23_30 <= KW_OWNER)||(LA23_30 >= KW_PARTITIONED && LA23_30 <= KW_PARTITIONS)||LA23_30==KW_PLUS||LA23_30==KW_PRETTY||LA23_30==KW_PRINCIPALS||LA23_30==KW_PURGE||LA23_30==KW_READ||(LA23_30 >= KW_REBUILD && LA23_30 <= KW_RECORDWRITER)||(LA23_30 >= KW_RELOAD && LA23_30 <= KW_RESTRICT)||LA23_30==KW_REWRITE||(LA23_30 >= KW_ROLE && LA23_30 <= KW_ROLES)||(LA23_30 >= KW_SCHEMA && LA23_30 <= KW_SECOND)||(LA23_30 >= KW_SEMI && LA23_30 <= KW_SERVER)||(LA23_30 >= KW_SETS && LA23_30 <= KW_SKEWED)||(LA23_30 >= KW_SNAPSHOT && LA23_30 <= KW_SSL)||(LA23_30 >= KW_STATISTICS && LA23_30 <= KW_STRUCT)||LA23_30==KW_TABLES||(LA23_30 >= KW_TBLPROPERTIES && LA23_30 <= KW_TERMINATED)||LA23_30==KW_TINYINT||(LA23_30 >= KW_TOUCH && LA23_30 <= KW_TRANSACTIONS)||LA23_30==KW_UNARCHIVE||LA23_30==KW_UNDO||LA23_30==KW_UNIONTYPE||(LA23_30 >= KW_UNLOCK && LA23_30 <= KW_UNSIGNED)||(LA23_30 >= KW_URI && LA23_30 <= KW_USE)||(LA23_30 >= KW_UTC && LA23_30 <= KW_VALIDATE)||LA23_30==KW_VALUE_TYPE||LA23_30==KW_VIEW||LA23_30==KW_WHILE||(LA23_30 >= KW_WORK && LA23_30 <= KW_YEAR)||LA23_30==KW_HOLD_DDLTIME||LA23_30==KW_IGNORE||LA23_30==KW_NO_DROP||LA23_30==KW_OFFLINE||LA23_30==KW_PROTECTION||LA23_30==KW_READONLY) ) {s = 426;}
						else if ( ((LA23_30 >= KW_ALL && LA23_30 <= KW_ALTER)||(LA23_30 >= KW_ARRAY && LA23_30 <= KW_AS)||LA23_30==KW_AUTHORIZATION||(LA23_30 >= KW_BETWEEN && LA23_30 <= KW_BOTH)||LA23_30==KW_BY||LA23_30==KW_CONSTRAINT||LA23_30==KW_CREATE||LA23_30==KW_CUBE||(LA23_30 >= KW_CURRENT_DATE && LA23_30 <= KW_CURSOR)||LA23_30==KW_DATE||LA23_30==KW_DECIMAL||LA23_30==KW_DELETE||LA23_30==KW_DESCRIBE||(LA23_30 >= KW_DOUBLE && LA23_30 <= KW_DROP)||LA23_30==KW_EXISTS||(LA23_30 >= KW_EXTERNAL && LA23_30 <= KW_FETCH)||LA23_30==KW_FLOAT||(LA23_30 >= KW_FOR && LA23_30 <= KW_FOREIGN)||LA23_30==KW_FULL||(LA23_30 >= KW_GRANT && LA23_30 <= KW_GROUPING)||(LA23_30 >= KW_IMPORT && LA23_30 <= KW_IN)||LA23_30==KW_INNER||(LA23_30 >= KW_INSERT && LA23_30 <= KW_INTERSECT)||(LA23_30 >= KW_INTO && LA23_30 <= KW_IS)||(LA23_30 >= KW_LATERAL && LA23_30 <= KW_LEFT)||LA23_30==KW_LIKE||LA23_30==KW_LOCAL||LA23_30==KW_NONE||LA23_30==KW_NULL||LA23_30==KW_OF||(LA23_30 >= KW_ORDER && LA23_30 <= KW_OUTER)||LA23_30==KW_PARTITION||LA23_30==KW_PERCENT||LA23_30==KW_PRIMARY||LA23_30==KW_PROCEDURE||LA23_30==KW_RANGE||LA23_30==KW_READS||(LA23_30 >= KW_REFERENCES && LA23_30 <= KW_REGEXP)||LA23_30==KW_REVOKE||(LA23_30 >= KW_RIGHT && LA23_30 <= KW_RLIKE)||(LA23_30 >= KW_ROLLUP && LA23_30 <= KW_ROWS)||LA23_30==KW_SET||LA23_30==KW_SMALLINT||LA23_30==KW_TABLE||LA23_30==KW_TIMESTAMP||LA23_30==KW_TO||(LA23_30 >= KW_TRIGGER && LA23_30 <= KW_TRUNCATE)||LA23_30==KW_UNION||LA23_30==KW_UPDATE||(LA23_30 >= KW_USER && LA23_30 <= KW_USING)||LA23_30==KW_VALUES||LA23_30==KW_WITH) ) {s = 427;}
						 
						input.seek(index23_30);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_58 = input.LA(1);
						 
						int index23_58 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_58==STAR) && (synpred2_SelectClauseParser())) {s = 428;}
						else if ( (LA23_58==Identifier) ) {s = 429;}
						else if ( ((LA23_58 >= KW_ABORT && LA23_58 <= KW_AFTER)||LA23_58==KW_ANALYZE||LA23_58==KW_ARCHIVE||LA23_58==KW_ASC||(LA23_58 >= KW_AUTOCOMMIT && LA23_58 <= KW_BEFORE)||(LA23_58 >= KW_BUCKET && LA23_58 <= KW_BUCKETS)||LA23_58==KW_CASCADE||LA23_58==KW_CHANGE||(LA23_58 >= KW_CLUSTER && LA23_58 <= KW_COLLECTION)||(LA23_58 >= KW_COLUMNS && LA23_58 <= KW_COMMENT)||(LA23_58 >= KW_COMPACT && LA23_58 <= KW_CONCATENATE)||LA23_58==KW_CONTINUE||LA23_58==KW_DATA||LA23_58==KW_DATABASES||(LA23_58 >= KW_DATETIME && LA23_58 <= KW_DBPROPERTIES)||(LA23_58 >= KW_DEFERRED && LA23_58 <= KW_DEFINED)||(LA23_58 >= KW_DELIMITED && LA23_58 <= KW_DESC)||(LA23_58 >= KW_DIRECTORIES && LA23_58 <= KW_DISABLE)||LA23_58==KW_DISTRIBUTE||LA23_58==KW_ELEM_TYPE||LA23_58==KW_ENABLE||LA23_58==KW_ESCAPED||LA23_58==KW_EXCLUSIVE||(LA23_58 >= KW_EXPLAIN && LA23_58 <= KW_EXPORT)||(LA23_58 >= KW_FIELDS && LA23_58 <= KW_FIRST)||(LA23_58 >= KW_FORMAT && LA23_58 <= KW_FORMATTED)||LA23_58==KW_FUNCTIONS||(LA23_58 >= KW_HOUR && LA23_58 <= KW_IDXPROPERTIES)||(LA23_58 >= KW_INDEX && LA23_58 <= KW_INDEXES)||(LA23_58 >= KW_INPATH && LA23_58 <= KW_INPUTFORMAT)||(LA23_58 >= KW_ISOLATION && LA23_58 <= KW_JAR)||(LA23_58 >= KW_KEY && LA23_58 <= KW_LAST)||LA23_58==KW_LEVEL||(LA23_58 >= KW_LIMIT && LA23_58 <= KW_LOAD)||(LA23_58 >= KW_LOCATION && LA23_58 <= KW_LONG)||(LA23_58 >= KW_MAPJOIN && LA23_58 <= KW_MONTH)||LA23_58==KW_MSCK||(LA23_58 >= KW_NORELY && LA23_58 <= KW_NOSCAN)||LA23_58==KW_NOVALIDATE||LA23_58==KW_NULLS||LA23_58==KW_OFFSET||LA23_58==KW_OPTION||(LA23_58 >= KW_OUTPUTDRIVER && LA23_58 <= KW_OUTPUTFORMAT)||(LA23_58 >= KW_OVERWRITE && LA23_58 <= KW_OWNER)||(LA23_58 >= KW_PARTITIONED && LA23_58 <= KW_PARTITIONS)||LA23_58==KW_PLUS||LA23_58==KW_PRETTY||LA23_58==KW_PRINCIPALS||LA23_58==KW_PURGE||LA23_58==KW_READ||(LA23_58 >= KW_REBUILD && LA23_58 <= KW_RECORDWRITER)||(LA23_58 >= KW_RELOAD && LA23_58 <= KW_RESTRICT)||LA23_58==KW_REWRITE||(LA23_58 >= KW_ROLE && LA23_58 <= KW_ROLES)||(LA23_58 >= KW_SCHEMA && LA23_58 <= KW_SECOND)||(LA23_58 >= KW_SEMI && LA23_58 <= KW_SERVER)||(LA23_58 >= KW_SETS && LA23_58 <= KW_SKEWED)||(LA23_58 >= KW_SNAPSHOT && LA23_58 <= KW_SSL)||(LA23_58 >= KW_STATISTICS && LA23_58 <= KW_STRUCT)||LA23_58==KW_TABLES||(LA23_58 >= KW_TBLPROPERTIES && LA23_58 <= KW_TERMINATED)||LA23_58==KW_TINYINT||(LA23_58 >= KW_TOUCH && LA23_58 <= KW_TRANSACTIONS)||LA23_58==KW_UNARCHIVE||LA23_58==KW_UNDO||LA23_58==KW_UNIONTYPE||(LA23_58 >= KW_UNLOCK && LA23_58 <= KW_UNSIGNED)||(LA23_58 >= KW_URI && LA23_58 <= KW_USE)||(LA23_58 >= KW_UTC && LA23_58 <= KW_VALIDATE)||LA23_58==KW_VALUE_TYPE||LA23_58==KW_VIEW||LA23_58==KW_WHILE||(LA23_58 >= KW_WORK && LA23_58 <= KW_YEAR)||LA23_58==KW_HOLD_DDLTIME||LA23_58==KW_IGNORE||LA23_58==KW_NO_DROP||LA23_58==KW_OFFLINE||LA23_58==KW_PROTECTION||LA23_58==KW_READONLY) ) {s = 430;}
						else if ( ((LA23_58 >= KW_ALL && LA23_58 <= KW_ALTER)||(LA23_58 >= KW_ARRAY && LA23_58 <= KW_AS)||LA23_58==KW_AUTHORIZATION||(LA23_58 >= KW_BETWEEN && LA23_58 <= KW_BOTH)||LA23_58==KW_BY||LA23_58==KW_CONSTRAINT||LA23_58==KW_CREATE||LA23_58==KW_CUBE||(LA23_58 >= KW_CURRENT_DATE && LA23_58 <= KW_CURSOR)||LA23_58==KW_DATE||LA23_58==KW_DECIMAL||LA23_58==KW_DELETE||LA23_58==KW_DESCRIBE||(LA23_58 >= KW_DOUBLE && LA23_58 <= KW_DROP)||LA23_58==KW_EXISTS||(LA23_58 >= KW_EXTERNAL && LA23_58 <= KW_FETCH)||LA23_58==KW_FLOAT||(LA23_58 >= KW_FOR && LA23_58 <= KW_FOREIGN)||LA23_58==KW_FULL||(LA23_58 >= KW_GRANT && LA23_58 <= KW_GROUPING)||(LA23_58 >= KW_IMPORT && LA23_58 <= KW_IN)||LA23_58==KW_INNER||(LA23_58 >= KW_INSERT && LA23_58 <= KW_INTERSECT)||(LA23_58 >= KW_INTO && LA23_58 <= KW_IS)||(LA23_58 >= KW_LATERAL && LA23_58 <= KW_LEFT)||LA23_58==KW_LIKE||LA23_58==KW_LOCAL||LA23_58==KW_NONE||LA23_58==KW_NULL||LA23_58==KW_OF||(LA23_58 >= KW_ORDER && LA23_58 <= KW_OUTER)||LA23_58==KW_PARTITION||LA23_58==KW_PERCENT||LA23_58==KW_PRIMARY||LA23_58==KW_PROCEDURE||LA23_58==KW_RANGE||LA23_58==KW_READS||(LA23_58 >= KW_REFERENCES && LA23_58 <= KW_REGEXP)||LA23_58==KW_REVOKE||(LA23_58 >= KW_RIGHT && LA23_58 <= KW_RLIKE)||(LA23_58 >= KW_ROLLUP && LA23_58 <= KW_ROWS)||LA23_58==KW_SET||LA23_58==KW_SMALLINT||LA23_58==KW_TABLE||LA23_58==KW_TIMESTAMP||LA23_58==KW_TO||(LA23_58 >= KW_TRIGGER && LA23_58 <= KW_TRUNCATE)||LA23_58==KW_UNION||LA23_58==KW_UPDATE||(LA23_58 >= KW_USER && LA23_58 <= KW_USING)||LA23_58==KW_VALUES||LA23_58==KW_WITH) ) {s = 431;}
						 
						input.seek(index23_58);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA23_86 = input.LA(1);
						 
						int index23_86 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_86==STAR) && (synpred2_SelectClauseParser())) {s = 432;}
						else if ( (LA23_86==Identifier) ) {s = 433;}
						else if ( ((LA23_86 >= KW_ABORT && LA23_86 <= KW_AFTER)||LA23_86==KW_ANALYZE||LA23_86==KW_ARCHIVE||LA23_86==KW_ASC||(LA23_86 >= KW_AUTOCOMMIT && LA23_86 <= KW_BEFORE)||(LA23_86 >= KW_BUCKET && LA23_86 <= KW_BUCKETS)||LA23_86==KW_CASCADE||LA23_86==KW_CHANGE||(LA23_86 >= KW_CLUSTER && LA23_86 <= KW_COLLECTION)||(LA23_86 >= KW_COLUMNS && LA23_86 <= KW_COMMENT)||(LA23_86 >= KW_COMPACT && LA23_86 <= KW_CONCATENATE)||LA23_86==KW_CONTINUE||LA23_86==KW_DATA||LA23_86==KW_DATABASES||(LA23_86 >= KW_DATETIME && LA23_86 <= KW_DBPROPERTIES)||(LA23_86 >= KW_DEFERRED && LA23_86 <= KW_DEFINED)||(LA23_86 >= KW_DELIMITED && LA23_86 <= KW_DESC)||(LA23_86 >= KW_DIRECTORIES && LA23_86 <= KW_DISABLE)||LA23_86==KW_DISTRIBUTE||LA23_86==KW_ELEM_TYPE||LA23_86==KW_ENABLE||LA23_86==KW_ESCAPED||LA23_86==KW_EXCLUSIVE||(LA23_86 >= KW_EXPLAIN && LA23_86 <= KW_EXPORT)||(LA23_86 >= KW_FIELDS && LA23_86 <= KW_FIRST)||(LA23_86 >= KW_FORMAT && LA23_86 <= KW_FORMATTED)||LA23_86==KW_FUNCTIONS||(LA23_86 >= KW_HOUR && LA23_86 <= KW_IDXPROPERTIES)||(LA23_86 >= KW_INDEX && LA23_86 <= KW_INDEXES)||(LA23_86 >= KW_INPATH && LA23_86 <= KW_INPUTFORMAT)||(LA23_86 >= KW_ISOLATION && LA23_86 <= KW_JAR)||(LA23_86 >= KW_KEY && LA23_86 <= KW_LAST)||LA23_86==KW_LEVEL||(LA23_86 >= KW_LIMIT && LA23_86 <= KW_LOAD)||(LA23_86 >= KW_LOCATION && LA23_86 <= KW_LONG)||(LA23_86 >= KW_MAPJOIN && LA23_86 <= KW_MONTH)||LA23_86==KW_MSCK||(LA23_86 >= KW_NORELY && LA23_86 <= KW_NOSCAN)||LA23_86==KW_NOVALIDATE||LA23_86==KW_NULLS||LA23_86==KW_OFFSET||LA23_86==KW_OPTION||(LA23_86 >= KW_OUTPUTDRIVER && LA23_86 <= KW_OUTPUTFORMAT)||(LA23_86 >= KW_OVERWRITE && LA23_86 <= KW_OWNER)||(LA23_86 >= KW_PARTITIONED && LA23_86 <= KW_PARTITIONS)||LA23_86==KW_PLUS||LA23_86==KW_PRETTY||LA23_86==KW_PRINCIPALS||LA23_86==KW_PURGE||LA23_86==KW_READ||(LA23_86 >= KW_REBUILD && LA23_86 <= KW_RECORDWRITER)||(LA23_86 >= KW_RELOAD && LA23_86 <= KW_RESTRICT)||LA23_86==KW_REWRITE||(LA23_86 >= KW_ROLE && LA23_86 <= KW_ROLES)||(LA23_86 >= KW_SCHEMA && LA23_86 <= KW_SECOND)||(LA23_86 >= KW_SEMI && LA23_86 <= KW_SERVER)||(LA23_86 >= KW_SETS && LA23_86 <= KW_SKEWED)||(LA23_86 >= KW_SNAPSHOT && LA23_86 <= KW_SSL)||(LA23_86 >= KW_STATISTICS && LA23_86 <= KW_STRUCT)||LA23_86==KW_TABLES||(LA23_86 >= KW_TBLPROPERTIES && LA23_86 <= KW_TERMINATED)||LA23_86==KW_TINYINT||(LA23_86 >= KW_TOUCH && LA23_86 <= KW_TRANSACTIONS)||LA23_86==KW_UNARCHIVE||LA23_86==KW_UNDO||LA23_86==KW_UNIONTYPE||(LA23_86 >= KW_UNLOCK && LA23_86 <= KW_UNSIGNED)||(LA23_86 >= KW_URI && LA23_86 <= KW_USE)||(LA23_86 >= KW_UTC && LA23_86 <= KW_VALIDATE)||LA23_86==KW_VALUE_TYPE||LA23_86==KW_VIEW||LA23_86==KW_WHILE||(LA23_86 >= KW_WORK && LA23_86 <= KW_YEAR)||LA23_86==KW_HOLD_DDLTIME||LA23_86==KW_IGNORE||LA23_86==KW_NO_DROP||LA23_86==KW_OFFLINE||LA23_86==KW_PROTECTION||LA23_86==KW_READONLY) ) {s = 434;}
						else if ( ((LA23_86 >= KW_ALL && LA23_86 <= KW_ALTER)||(LA23_86 >= KW_ARRAY && LA23_86 <= KW_AS)||LA23_86==KW_AUTHORIZATION||(LA23_86 >= KW_BETWEEN && LA23_86 <= KW_BOTH)||LA23_86==KW_BY||LA23_86==KW_CONSTRAINT||LA23_86==KW_CREATE||LA23_86==KW_CUBE||(LA23_86 >= KW_CURRENT_DATE && LA23_86 <= KW_CURSOR)||LA23_86==KW_DATE||LA23_86==KW_DECIMAL||LA23_86==KW_DELETE||LA23_86==KW_DESCRIBE||(LA23_86 >= KW_DOUBLE && LA23_86 <= KW_DROP)||LA23_86==KW_EXISTS||(LA23_86 >= KW_EXTERNAL && LA23_86 <= KW_FETCH)||LA23_86==KW_FLOAT||(LA23_86 >= KW_FOR && LA23_86 <= KW_FOREIGN)||LA23_86==KW_FULL||(LA23_86 >= KW_GRANT && LA23_86 <= KW_GROUPING)||(LA23_86 >= KW_IMPORT && LA23_86 <= KW_IN)||LA23_86==KW_INNER||(LA23_86 >= KW_INSERT && LA23_86 <= KW_INTERSECT)||(LA23_86 >= KW_INTO && LA23_86 <= KW_IS)||(LA23_86 >= KW_LATERAL && LA23_86 <= KW_LEFT)||LA23_86==KW_LIKE||LA23_86==KW_LOCAL||LA23_86==KW_NONE||LA23_86==KW_NULL||LA23_86==KW_OF||(LA23_86 >= KW_ORDER && LA23_86 <= KW_OUTER)||LA23_86==KW_PARTITION||LA23_86==KW_PERCENT||LA23_86==KW_PRIMARY||LA23_86==KW_PROCEDURE||LA23_86==KW_RANGE||LA23_86==KW_READS||(LA23_86 >= KW_REFERENCES && LA23_86 <= KW_REGEXP)||LA23_86==KW_REVOKE||(LA23_86 >= KW_RIGHT && LA23_86 <= KW_RLIKE)||(LA23_86 >= KW_ROLLUP && LA23_86 <= KW_ROWS)||LA23_86==KW_SET||LA23_86==KW_SMALLINT||LA23_86==KW_TABLE||LA23_86==KW_TIMESTAMP||LA23_86==KW_TO||(LA23_86 >= KW_TRIGGER && LA23_86 <= KW_TRUNCATE)||LA23_86==KW_UNION||LA23_86==KW_UPDATE||(LA23_86 >= KW_USER && LA23_86 <= KW_USING)||LA23_86==KW_VALUES||LA23_86==KW_WITH) ) {s = 435;}
						 
						input.seek(index23_86);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA23_115 = input.LA(1);
						 
						int index23_115 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_115==STAR) && (synpred2_SelectClauseParser())) {s = 436;}
						else if ( (LA23_115==Identifier) ) {s = 437;}
						else if ( ((LA23_115 >= KW_ABORT && LA23_115 <= KW_AFTER)||LA23_115==KW_ANALYZE||LA23_115==KW_ARCHIVE||LA23_115==KW_ASC||(LA23_115 >= KW_AUTOCOMMIT && LA23_115 <= KW_BEFORE)||(LA23_115 >= KW_BUCKET && LA23_115 <= KW_BUCKETS)||LA23_115==KW_CASCADE||LA23_115==KW_CHANGE||(LA23_115 >= KW_CLUSTER && LA23_115 <= KW_COLLECTION)||(LA23_115 >= KW_COLUMNS && LA23_115 <= KW_COMMENT)||(LA23_115 >= KW_COMPACT && LA23_115 <= KW_CONCATENATE)||LA23_115==KW_CONTINUE||LA23_115==KW_DATA||LA23_115==KW_DATABASES||(LA23_115 >= KW_DATETIME && LA23_115 <= KW_DBPROPERTIES)||(LA23_115 >= KW_DEFERRED && LA23_115 <= KW_DEFINED)||(LA23_115 >= KW_DELIMITED && LA23_115 <= KW_DESC)||(LA23_115 >= KW_DIRECTORIES && LA23_115 <= KW_DISABLE)||LA23_115==KW_DISTRIBUTE||LA23_115==KW_ELEM_TYPE||LA23_115==KW_ENABLE||LA23_115==KW_ESCAPED||LA23_115==KW_EXCLUSIVE||(LA23_115 >= KW_EXPLAIN && LA23_115 <= KW_EXPORT)||(LA23_115 >= KW_FIELDS && LA23_115 <= KW_FIRST)||(LA23_115 >= KW_FORMAT && LA23_115 <= KW_FORMATTED)||LA23_115==KW_FUNCTIONS||(LA23_115 >= KW_HOUR && LA23_115 <= KW_IDXPROPERTIES)||(LA23_115 >= KW_INDEX && LA23_115 <= KW_INDEXES)||(LA23_115 >= KW_INPATH && LA23_115 <= KW_INPUTFORMAT)||(LA23_115 >= KW_ISOLATION && LA23_115 <= KW_JAR)||(LA23_115 >= KW_KEY && LA23_115 <= KW_LAST)||LA23_115==KW_LEVEL||(LA23_115 >= KW_LIMIT && LA23_115 <= KW_LOAD)||(LA23_115 >= KW_LOCATION && LA23_115 <= KW_LONG)||(LA23_115 >= KW_MAPJOIN && LA23_115 <= KW_MONTH)||LA23_115==KW_MSCK||(LA23_115 >= KW_NORELY && LA23_115 <= KW_NOSCAN)||LA23_115==KW_NOVALIDATE||LA23_115==KW_NULLS||LA23_115==KW_OFFSET||LA23_115==KW_OPTION||(LA23_115 >= KW_OUTPUTDRIVER && LA23_115 <= KW_OUTPUTFORMAT)||(LA23_115 >= KW_OVERWRITE && LA23_115 <= KW_OWNER)||(LA23_115 >= KW_PARTITIONED && LA23_115 <= KW_PARTITIONS)||LA23_115==KW_PLUS||LA23_115==KW_PRETTY||LA23_115==KW_PRINCIPALS||LA23_115==KW_PURGE||LA23_115==KW_READ||(LA23_115 >= KW_REBUILD && LA23_115 <= KW_RECORDWRITER)||(LA23_115 >= KW_RELOAD && LA23_115 <= KW_RESTRICT)||LA23_115==KW_REWRITE||(LA23_115 >= KW_ROLE && LA23_115 <= KW_ROLES)||(LA23_115 >= KW_SCHEMA && LA23_115 <= KW_SECOND)||(LA23_115 >= KW_SEMI && LA23_115 <= KW_SERVER)||(LA23_115 >= KW_SETS && LA23_115 <= KW_SKEWED)||(LA23_115 >= KW_SNAPSHOT && LA23_115 <= KW_SSL)||(LA23_115 >= KW_STATISTICS && LA23_115 <= KW_STRUCT)||LA23_115==KW_TABLES||(LA23_115 >= KW_TBLPROPERTIES && LA23_115 <= KW_TERMINATED)||LA23_115==KW_TINYINT||(LA23_115 >= KW_TOUCH && LA23_115 <= KW_TRANSACTIONS)||LA23_115==KW_UNARCHIVE||LA23_115==KW_UNDO||LA23_115==KW_UNIONTYPE||(LA23_115 >= KW_UNLOCK && LA23_115 <= KW_UNSIGNED)||(LA23_115 >= KW_URI && LA23_115 <= KW_USE)||(LA23_115 >= KW_UTC && LA23_115 <= KW_VALIDATE)||LA23_115==KW_VALUE_TYPE||LA23_115==KW_VIEW||LA23_115==KW_WHILE||(LA23_115 >= KW_WORK && LA23_115 <= KW_YEAR)||LA23_115==KW_HOLD_DDLTIME||LA23_115==KW_IGNORE||LA23_115==KW_NO_DROP||LA23_115==KW_OFFLINE||LA23_115==KW_PROTECTION||LA23_115==KW_READONLY) ) {s = 438;}
						else if ( ((LA23_115 >= KW_ALL && LA23_115 <= KW_ALTER)||(LA23_115 >= KW_ARRAY && LA23_115 <= KW_AS)||LA23_115==KW_AUTHORIZATION||(LA23_115 >= KW_BETWEEN && LA23_115 <= KW_BOTH)||LA23_115==KW_BY||LA23_115==KW_CONSTRAINT||LA23_115==KW_CREATE||LA23_115==KW_CUBE||(LA23_115 >= KW_CURRENT_DATE && LA23_115 <= KW_CURSOR)||LA23_115==KW_DATE||LA23_115==KW_DECIMAL||LA23_115==KW_DELETE||LA23_115==KW_DESCRIBE||(LA23_115 >= KW_DOUBLE && LA23_115 <= KW_DROP)||LA23_115==KW_EXISTS||(LA23_115 >= KW_EXTERNAL && LA23_115 <= KW_FETCH)||LA23_115==KW_FLOAT||(LA23_115 >= KW_FOR && LA23_115 <= KW_FOREIGN)||LA23_115==KW_FULL||(LA23_115 >= KW_GRANT && LA23_115 <= KW_GROUPING)||(LA23_115 >= KW_IMPORT && LA23_115 <= KW_IN)||LA23_115==KW_INNER||(LA23_115 >= KW_INSERT && LA23_115 <= KW_INTERSECT)||(LA23_115 >= KW_INTO && LA23_115 <= KW_IS)||(LA23_115 >= KW_LATERAL && LA23_115 <= KW_LEFT)||LA23_115==KW_LIKE||LA23_115==KW_LOCAL||LA23_115==KW_NONE||LA23_115==KW_NULL||LA23_115==KW_OF||(LA23_115 >= KW_ORDER && LA23_115 <= KW_OUTER)||LA23_115==KW_PARTITION||LA23_115==KW_PERCENT||LA23_115==KW_PRIMARY||LA23_115==KW_PROCEDURE||LA23_115==KW_RANGE||LA23_115==KW_READS||(LA23_115 >= KW_REFERENCES && LA23_115 <= KW_REGEXP)||LA23_115==KW_REVOKE||(LA23_115 >= KW_RIGHT && LA23_115 <= KW_RLIKE)||(LA23_115 >= KW_ROLLUP && LA23_115 <= KW_ROWS)||LA23_115==KW_SET||LA23_115==KW_SMALLINT||LA23_115==KW_TABLE||LA23_115==KW_TIMESTAMP||LA23_115==KW_TO||(LA23_115 >= KW_TRIGGER && LA23_115 <= KW_TRUNCATE)||LA23_115==KW_UNION||LA23_115==KW_UPDATE||(LA23_115 >= KW_USER && LA23_115 <= KW_USING)||LA23_115==KW_VALUES||LA23_115==KW_WITH) ) {s = 439;}
						 
						input.seek(index23_115);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA23_143 = input.LA(1);
						 
						int index23_143 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_143==STAR) && (synpred2_SelectClauseParser())) {s = 440;}
						else if ( (LA23_143==Identifier) ) {s = 441;}
						else if ( ((LA23_143 >= KW_ABORT && LA23_143 <= KW_AFTER)||LA23_143==KW_ANALYZE||LA23_143==KW_ARCHIVE||LA23_143==KW_ASC||(LA23_143 >= KW_AUTOCOMMIT && LA23_143 <= KW_BEFORE)||(LA23_143 >= KW_BUCKET && LA23_143 <= KW_BUCKETS)||LA23_143==KW_CASCADE||LA23_143==KW_CHANGE||(LA23_143 >= KW_CLUSTER && LA23_143 <= KW_COLLECTION)||(LA23_143 >= KW_COLUMNS && LA23_143 <= KW_COMMENT)||(LA23_143 >= KW_COMPACT && LA23_143 <= KW_CONCATENATE)||LA23_143==KW_CONTINUE||LA23_143==KW_DATA||LA23_143==KW_DATABASES||(LA23_143 >= KW_DATETIME && LA23_143 <= KW_DBPROPERTIES)||(LA23_143 >= KW_DEFERRED && LA23_143 <= KW_DEFINED)||(LA23_143 >= KW_DELIMITED && LA23_143 <= KW_DESC)||(LA23_143 >= KW_DIRECTORIES && LA23_143 <= KW_DISABLE)||LA23_143==KW_DISTRIBUTE||LA23_143==KW_ELEM_TYPE||LA23_143==KW_ENABLE||LA23_143==KW_ESCAPED||LA23_143==KW_EXCLUSIVE||(LA23_143 >= KW_EXPLAIN && LA23_143 <= KW_EXPORT)||(LA23_143 >= KW_FIELDS && LA23_143 <= KW_FIRST)||(LA23_143 >= KW_FORMAT && LA23_143 <= KW_FORMATTED)||LA23_143==KW_FUNCTIONS||(LA23_143 >= KW_HOUR && LA23_143 <= KW_IDXPROPERTIES)||(LA23_143 >= KW_INDEX && LA23_143 <= KW_INDEXES)||(LA23_143 >= KW_INPATH && LA23_143 <= KW_INPUTFORMAT)||(LA23_143 >= KW_ISOLATION && LA23_143 <= KW_JAR)||(LA23_143 >= KW_KEY && LA23_143 <= KW_LAST)||LA23_143==KW_LEVEL||(LA23_143 >= KW_LIMIT && LA23_143 <= KW_LOAD)||(LA23_143 >= KW_LOCATION && LA23_143 <= KW_LONG)||(LA23_143 >= KW_MAPJOIN && LA23_143 <= KW_MONTH)||LA23_143==KW_MSCK||(LA23_143 >= KW_NORELY && LA23_143 <= KW_NOSCAN)||LA23_143==KW_NOVALIDATE||LA23_143==KW_NULLS||LA23_143==KW_OFFSET||LA23_143==KW_OPTION||(LA23_143 >= KW_OUTPUTDRIVER && LA23_143 <= KW_OUTPUTFORMAT)||(LA23_143 >= KW_OVERWRITE && LA23_143 <= KW_OWNER)||(LA23_143 >= KW_PARTITIONED && LA23_143 <= KW_PARTITIONS)||LA23_143==KW_PLUS||LA23_143==KW_PRETTY||LA23_143==KW_PRINCIPALS||LA23_143==KW_PURGE||LA23_143==KW_READ||(LA23_143 >= KW_REBUILD && LA23_143 <= KW_RECORDWRITER)||(LA23_143 >= KW_RELOAD && LA23_143 <= KW_RESTRICT)||LA23_143==KW_REWRITE||(LA23_143 >= KW_ROLE && LA23_143 <= KW_ROLES)||(LA23_143 >= KW_SCHEMA && LA23_143 <= KW_SECOND)||(LA23_143 >= KW_SEMI && LA23_143 <= KW_SERVER)||(LA23_143 >= KW_SETS && LA23_143 <= KW_SKEWED)||(LA23_143 >= KW_SNAPSHOT && LA23_143 <= KW_SSL)||(LA23_143 >= KW_STATISTICS && LA23_143 <= KW_STRUCT)||LA23_143==KW_TABLES||(LA23_143 >= KW_TBLPROPERTIES && LA23_143 <= KW_TERMINATED)||LA23_143==KW_TINYINT||(LA23_143 >= KW_TOUCH && LA23_143 <= KW_TRANSACTIONS)||LA23_143==KW_UNARCHIVE||LA23_143==KW_UNDO||LA23_143==KW_UNIONTYPE||(LA23_143 >= KW_UNLOCK && LA23_143 <= KW_UNSIGNED)||(LA23_143 >= KW_URI && LA23_143 <= KW_USE)||(LA23_143 >= KW_UTC && LA23_143 <= KW_VALIDATE)||LA23_143==KW_VALUE_TYPE||LA23_143==KW_VIEW||LA23_143==KW_WHILE||(LA23_143 >= KW_WORK && LA23_143 <= KW_YEAR)||LA23_143==KW_HOLD_DDLTIME||LA23_143==KW_IGNORE||LA23_143==KW_NO_DROP||LA23_143==KW_OFFLINE||LA23_143==KW_PROTECTION||LA23_143==KW_READONLY) ) {s = 442;}
						else if ( ((LA23_143 >= KW_ALL && LA23_143 <= KW_ALTER)||(LA23_143 >= KW_ARRAY && LA23_143 <= KW_AS)||LA23_143==KW_AUTHORIZATION||(LA23_143 >= KW_BETWEEN && LA23_143 <= KW_BOTH)||LA23_143==KW_BY||LA23_143==KW_CONSTRAINT||LA23_143==KW_CREATE||LA23_143==KW_CUBE||(LA23_143 >= KW_CURRENT_DATE && LA23_143 <= KW_CURSOR)||LA23_143==KW_DATE||LA23_143==KW_DECIMAL||LA23_143==KW_DELETE||LA23_143==KW_DESCRIBE||(LA23_143 >= KW_DOUBLE && LA23_143 <= KW_DROP)||LA23_143==KW_EXISTS||(LA23_143 >= KW_EXTERNAL && LA23_143 <= KW_FETCH)||LA23_143==KW_FLOAT||(LA23_143 >= KW_FOR && LA23_143 <= KW_FOREIGN)||LA23_143==KW_FULL||(LA23_143 >= KW_GRANT && LA23_143 <= KW_GROUPING)||(LA23_143 >= KW_IMPORT && LA23_143 <= KW_IN)||LA23_143==KW_INNER||(LA23_143 >= KW_INSERT && LA23_143 <= KW_INTERSECT)||(LA23_143 >= KW_INTO && LA23_143 <= KW_IS)||(LA23_143 >= KW_LATERAL && LA23_143 <= KW_LEFT)||LA23_143==KW_LIKE||LA23_143==KW_LOCAL||LA23_143==KW_NONE||LA23_143==KW_NULL||LA23_143==KW_OF||(LA23_143 >= KW_ORDER && LA23_143 <= KW_OUTER)||LA23_143==KW_PARTITION||LA23_143==KW_PERCENT||LA23_143==KW_PRIMARY||LA23_143==KW_PROCEDURE||LA23_143==KW_RANGE||LA23_143==KW_READS||(LA23_143 >= KW_REFERENCES && LA23_143 <= KW_REGEXP)||LA23_143==KW_REVOKE||(LA23_143 >= KW_RIGHT && LA23_143 <= KW_RLIKE)||(LA23_143 >= KW_ROLLUP && LA23_143 <= KW_ROWS)||LA23_143==KW_SET||LA23_143==KW_SMALLINT||LA23_143==KW_TABLE||LA23_143==KW_TIMESTAMP||LA23_143==KW_TO||(LA23_143 >= KW_TRIGGER && LA23_143 <= KW_TRUNCATE)||LA23_143==KW_UNION||LA23_143==KW_UPDATE||(LA23_143 >= KW_USER && LA23_143 <= KW_USING)||LA23_143==KW_VALUES||LA23_143==KW_WITH) ) {s = 443;}
						 
						input.seek(index23_143);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA23_172 = input.LA(1);
						 
						int index23_172 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_172==STAR) && (synpred2_SelectClauseParser())) {s = 444;}
						else if ( (LA23_172==Identifier) ) {s = 445;}
						else if ( ((LA23_172 >= KW_ABORT && LA23_172 <= KW_AFTER)||LA23_172==KW_ANALYZE||LA23_172==KW_ARCHIVE||LA23_172==KW_ASC||(LA23_172 >= KW_AUTOCOMMIT && LA23_172 <= KW_BEFORE)||(LA23_172 >= KW_BUCKET && LA23_172 <= KW_BUCKETS)||LA23_172==KW_CASCADE||LA23_172==KW_CHANGE||(LA23_172 >= KW_CLUSTER && LA23_172 <= KW_COLLECTION)||(LA23_172 >= KW_COLUMNS && LA23_172 <= KW_COMMENT)||(LA23_172 >= KW_COMPACT && LA23_172 <= KW_CONCATENATE)||LA23_172==KW_CONTINUE||LA23_172==KW_DATA||LA23_172==KW_DATABASES||(LA23_172 >= KW_DATETIME && LA23_172 <= KW_DBPROPERTIES)||(LA23_172 >= KW_DEFERRED && LA23_172 <= KW_DEFINED)||(LA23_172 >= KW_DELIMITED && LA23_172 <= KW_DESC)||(LA23_172 >= KW_DIRECTORIES && LA23_172 <= KW_DISABLE)||LA23_172==KW_DISTRIBUTE||LA23_172==KW_ELEM_TYPE||LA23_172==KW_ENABLE||LA23_172==KW_ESCAPED||LA23_172==KW_EXCLUSIVE||(LA23_172 >= KW_EXPLAIN && LA23_172 <= KW_EXPORT)||(LA23_172 >= KW_FIELDS && LA23_172 <= KW_FIRST)||(LA23_172 >= KW_FORMAT && LA23_172 <= KW_FORMATTED)||LA23_172==KW_FUNCTIONS||(LA23_172 >= KW_HOUR && LA23_172 <= KW_IDXPROPERTIES)||(LA23_172 >= KW_INDEX && LA23_172 <= KW_INDEXES)||(LA23_172 >= KW_INPATH && LA23_172 <= KW_INPUTFORMAT)||(LA23_172 >= KW_ISOLATION && LA23_172 <= KW_JAR)||(LA23_172 >= KW_KEY && LA23_172 <= KW_LAST)||LA23_172==KW_LEVEL||(LA23_172 >= KW_LIMIT && LA23_172 <= KW_LOAD)||(LA23_172 >= KW_LOCATION && LA23_172 <= KW_LONG)||(LA23_172 >= KW_MAPJOIN && LA23_172 <= KW_MONTH)||LA23_172==KW_MSCK||(LA23_172 >= KW_NORELY && LA23_172 <= KW_NOSCAN)||LA23_172==KW_NOVALIDATE||LA23_172==KW_NULLS||LA23_172==KW_OFFSET||LA23_172==KW_OPTION||(LA23_172 >= KW_OUTPUTDRIVER && LA23_172 <= KW_OUTPUTFORMAT)||(LA23_172 >= KW_OVERWRITE && LA23_172 <= KW_OWNER)||(LA23_172 >= KW_PARTITIONED && LA23_172 <= KW_PARTITIONS)||LA23_172==KW_PLUS||LA23_172==KW_PRETTY||LA23_172==KW_PRINCIPALS||LA23_172==KW_PURGE||LA23_172==KW_READ||(LA23_172 >= KW_REBUILD && LA23_172 <= KW_RECORDWRITER)||(LA23_172 >= KW_RELOAD && LA23_172 <= KW_RESTRICT)||LA23_172==KW_REWRITE||(LA23_172 >= KW_ROLE && LA23_172 <= KW_ROLES)||(LA23_172 >= KW_SCHEMA && LA23_172 <= KW_SECOND)||(LA23_172 >= KW_SEMI && LA23_172 <= KW_SERVER)||(LA23_172 >= KW_SETS && LA23_172 <= KW_SKEWED)||(LA23_172 >= KW_SNAPSHOT && LA23_172 <= KW_SSL)||(LA23_172 >= KW_STATISTICS && LA23_172 <= KW_STRUCT)||LA23_172==KW_TABLES||(LA23_172 >= KW_TBLPROPERTIES && LA23_172 <= KW_TERMINATED)||LA23_172==KW_TINYINT||(LA23_172 >= KW_TOUCH && LA23_172 <= KW_TRANSACTIONS)||LA23_172==KW_UNARCHIVE||LA23_172==KW_UNDO||LA23_172==KW_UNIONTYPE||(LA23_172 >= KW_UNLOCK && LA23_172 <= KW_UNSIGNED)||(LA23_172 >= KW_URI && LA23_172 <= KW_USE)||(LA23_172 >= KW_UTC && LA23_172 <= KW_VALIDATE)||LA23_172==KW_VALUE_TYPE||LA23_172==KW_VIEW||LA23_172==KW_WHILE||(LA23_172 >= KW_WORK && LA23_172 <= KW_YEAR)||LA23_172==KW_HOLD_DDLTIME||LA23_172==KW_IGNORE||LA23_172==KW_NO_DROP||LA23_172==KW_OFFLINE||LA23_172==KW_PROTECTION||LA23_172==KW_READONLY) ) {s = 446;}
						else if ( ((LA23_172 >= KW_ALL && LA23_172 <= KW_ALTER)||(LA23_172 >= KW_ARRAY && LA23_172 <= KW_AS)||LA23_172==KW_AUTHORIZATION||(LA23_172 >= KW_BETWEEN && LA23_172 <= KW_BOTH)||LA23_172==KW_BY||LA23_172==KW_CONSTRAINT||LA23_172==KW_CREATE||LA23_172==KW_CUBE||(LA23_172 >= KW_CURRENT_DATE && LA23_172 <= KW_CURSOR)||LA23_172==KW_DATE||LA23_172==KW_DECIMAL||LA23_172==KW_DELETE||LA23_172==KW_DESCRIBE||(LA23_172 >= KW_DOUBLE && LA23_172 <= KW_DROP)||LA23_172==KW_EXISTS||(LA23_172 >= KW_EXTERNAL && LA23_172 <= KW_FETCH)||LA23_172==KW_FLOAT||(LA23_172 >= KW_FOR && LA23_172 <= KW_FOREIGN)||LA23_172==KW_FULL||(LA23_172 >= KW_GRANT && LA23_172 <= KW_GROUPING)||(LA23_172 >= KW_IMPORT && LA23_172 <= KW_IN)||LA23_172==KW_INNER||(LA23_172 >= KW_INSERT && LA23_172 <= KW_INTERSECT)||(LA23_172 >= KW_INTO && LA23_172 <= KW_IS)||(LA23_172 >= KW_LATERAL && LA23_172 <= KW_LEFT)||LA23_172==KW_LIKE||LA23_172==KW_LOCAL||LA23_172==KW_NONE||LA23_172==KW_NULL||LA23_172==KW_OF||(LA23_172 >= KW_ORDER && LA23_172 <= KW_OUTER)||LA23_172==KW_PARTITION||LA23_172==KW_PERCENT||LA23_172==KW_PRIMARY||LA23_172==KW_PROCEDURE||LA23_172==KW_RANGE||LA23_172==KW_READS||(LA23_172 >= KW_REFERENCES && LA23_172 <= KW_REGEXP)||LA23_172==KW_REVOKE||(LA23_172 >= KW_RIGHT && LA23_172 <= KW_RLIKE)||(LA23_172 >= KW_ROLLUP && LA23_172 <= KW_ROWS)||LA23_172==KW_SET||LA23_172==KW_SMALLINT||LA23_172==KW_TABLE||LA23_172==KW_TIMESTAMP||LA23_172==KW_TO||(LA23_172 >= KW_TRIGGER && LA23_172 <= KW_TRUNCATE)||LA23_172==KW_UNION||LA23_172==KW_UPDATE||(LA23_172 >= KW_USER && LA23_172 <= KW_USING)||LA23_172==KW_VALUES||LA23_172==KW_WITH) ) {s = 447;}
						 
						input.seek(index23_172);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA23_200 = input.LA(1);
						 
						int index23_200 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_200==STAR) && (synpred2_SelectClauseParser())) {s = 448;}
						else if ( (LA23_200==Identifier) ) {s = 449;}
						else if ( ((LA23_200 >= KW_ABORT && LA23_200 <= KW_AFTER)||LA23_200==KW_ANALYZE||LA23_200==KW_ARCHIVE||LA23_200==KW_ASC||(LA23_200 >= KW_AUTOCOMMIT && LA23_200 <= KW_BEFORE)||(LA23_200 >= KW_BUCKET && LA23_200 <= KW_BUCKETS)||LA23_200==KW_CASCADE||LA23_200==KW_CHANGE||(LA23_200 >= KW_CLUSTER && LA23_200 <= KW_COLLECTION)||(LA23_200 >= KW_COLUMNS && LA23_200 <= KW_COMMENT)||(LA23_200 >= KW_COMPACT && LA23_200 <= KW_CONCATENATE)||LA23_200==KW_CONTINUE||LA23_200==KW_DATA||LA23_200==KW_DATABASES||(LA23_200 >= KW_DATETIME && LA23_200 <= KW_DBPROPERTIES)||(LA23_200 >= KW_DEFERRED && LA23_200 <= KW_DEFINED)||(LA23_200 >= KW_DELIMITED && LA23_200 <= KW_DESC)||(LA23_200 >= KW_DIRECTORIES && LA23_200 <= KW_DISABLE)||LA23_200==KW_DISTRIBUTE||LA23_200==KW_ELEM_TYPE||LA23_200==KW_ENABLE||LA23_200==KW_ESCAPED||LA23_200==KW_EXCLUSIVE||(LA23_200 >= KW_EXPLAIN && LA23_200 <= KW_EXPORT)||(LA23_200 >= KW_FIELDS && LA23_200 <= KW_FIRST)||(LA23_200 >= KW_FORMAT && LA23_200 <= KW_FORMATTED)||LA23_200==KW_FUNCTIONS||(LA23_200 >= KW_HOUR && LA23_200 <= KW_IDXPROPERTIES)||(LA23_200 >= KW_INDEX && LA23_200 <= KW_INDEXES)||(LA23_200 >= KW_INPATH && LA23_200 <= KW_INPUTFORMAT)||(LA23_200 >= KW_ISOLATION && LA23_200 <= KW_JAR)||(LA23_200 >= KW_KEY && LA23_200 <= KW_LAST)||LA23_200==KW_LEVEL||(LA23_200 >= KW_LIMIT && LA23_200 <= KW_LOAD)||(LA23_200 >= KW_LOCATION && LA23_200 <= KW_LONG)||(LA23_200 >= KW_MAPJOIN && LA23_200 <= KW_MONTH)||LA23_200==KW_MSCK||(LA23_200 >= KW_NORELY && LA23_200 <= KW_NOSCAN)||LA23_200==KW_NOVALIDATE||LA23_200==KW_NULLS||LA23_200==KW_OFFSET||LA23_200==KW_OPTION||(LA23_200 >= KW_OUTPUTDRIVER && LA23_200 <= KW_OUTPUTFORMAT)||(LA23_200 >= KW_OVERWRITE && LA23_200 <= KW_OWNER)||(LA23_200 >= KW_PARTITIONED && LA23_200 <= KW_PARTITIONS)||LA23_200==KW_PLUS||LA23_200==KW_PRETTY||LA23_200==KW_PRINCIPALS||LA23_200==KW_PURGE||LA23_200==KW_READ||(LA23_200 >= KW_REBUILD && LA23_200 <= KW_RECORDWRITER)||(LA23_200 >= KW_RELOAD && LA23_200 <= KW_RESTRICT)||LA23_200==KW_REWRITE||(LA23_200 >= KW_ROLE && LA23_200 <= KW_ROLES)||(LA23_200 >= KW_SCHEMA && LA23_200 <= KW_SECOND)||(LA23_200 >= KW_SEMI && LA23_200 <= KW_SERVER)||(LA23_200 >= KW_SETS && LA23_200 <= KW_SKEWED)||(LA23_200 >= KW_SNAPSHOT && LA23_200 <= KW_SSL)||(LA23_200 >= KW_STATISTICS && LA23_200 <= KW_STRUCT)||LA23_200==KW_TABLES||(LA23_200 >= KW_TBLPROPERTIES && LA23_200 <= KW_TERMINATED)||LA23_200==KW_TINYINT||(LA23_200 >= KW_TOUCH && LA23_200 <= KW_TRANSACTIONS)||LA23_200==KW_UNARCHIVE||LA23_200==KW_UNDO||LA23_200==KW_UNIONTYPE||(LA23_200 >= KW_UNLOCK && LA23_200 <= KW_UNSIGNED)||(LA23_200 >= KW_URI && LA23_200 <= KW_USE)||(LA23_200 >= KW_UTC && LA23_200 <= KW_VALIDATE)||LA23_200==KW_VALUE_TYPE||LA23_200==KW_VIEW||LA23_200==KW_WHILE||(LA23_200 >= KW_WORK && LA23_200 <= KW_YEAR)||LA23_200==KW_HOLD_DDLTIME||LA23_200==KW_IGNORE||LA23_200==KW_NO_DROP||LA23_200==KW_OFFLINE||LA23_200==KW_PROTECTION||LA23_200==KW_READONLY) ) {s = 450;}
						else if ( ((LA23_200 >= KW_ALL && LA23_200 <= KW_ALTER)||(LA23_200 >= KW_ARRAY && LA23_200 <= KW_AS)||LA23_200==KW_AUTHORIZATION||(LA23_200 >= KW_BETWEEN && LA23_200 <= KW_BOTH)||LA23_200==KW_BY||LA23_200==KW_CONSTRAINT||LA23_200==KW_CREATE||LA23_200==KW_CUBE||(LA23_200 >= KW_CURRENT_DATE && LA23_200 <= KW_CURSOR)||LA23_200==KW_DATE||LA23_200==KW_DECIMAL||LA23_200==KW_DELETE||LA23_200==KW_DESCRIBE||(LA23_200 >= KW_DOUBLE && LA23_200 <= KW_DROP)||LA23_200==KW_EXISTS||(LA23_200 >= KW_EXTERNAL && LA23_200 <= KW_FETCH)||LA23_200==KW_FLOAT||(LA23_200 >= KW_FOR && LA23_200 <= KW_FOREIGN)||LA23_200==KW_FULL||(LA23_200 >= KW_GRANT && LA23_200 <= KW_GROUPING)||(LA23_200 >= KW_IMPORT && LA23_200 <= KW_IN)||LA23_200==KW_INNER||(LA23_200 >= KW_INSERT && LA23_200 <= KW_INTERSECT)||(LA23_200 >= KW_INTO && LA23_200 <= KW_IS)||(LA23_200 >= KW_LATERAL && LA23_200 <= KW_LEFT)||LA23_200==KW_LIKE||LA23_200==KW_LOCAL||LA23_200==KW_NONE||LA23_200==KW_NULL||LA23_200==KW_OF||(LA23_200 >= KW_ORDER && LA23_200 <= KW_OUTER)||LA23_200==KW_PARTITION||LA23_200==KW_PERCENT||LA23_200==KW_PRIMARY||LA23_200==KW_PROCEDURE||LA23_200==KW_RANGE||LA23_200==KW_READS||(LA23_200 >= KW_REFERENCES && LA23_200 <= KW_REGEXP)||LA23_200==KW_REVOKE||(LA23_200 >= KW_RIGHT && LA23_200 <= KW_RLIKE)||(LA23_200 >= KW_ROLLUP && LA23_200 <= KW_ROWS)||LA23_200==KW_SET||LA23_200==KW_SMALLINT||LA23_200==KW_TABLE||LA23_200==KW_TIMESTAMP||LA23_200==KW_TO||(LA23_200 >= KW_TRIGGER && LA23_200 <= KW_TRUNCATE)||LA23_200==KW_UNION||LA23_200==KW_UPDATE||(LA23_200 >= KW_USER && LA23_200 <= KW_USING)||LA23_200==KW_VALUES||LA23_200==KW_WITH) ) {s = 451;}
						 
						input.seek(index23_200);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA23_228 = input.LA(1);
						 
						int index23_228 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_228==STAR) && (synpred2_SelectClauseParser())) {s = 452;}
						else if ( (LA23_228==Identifier) ) {s = 453;}
						else if ( ((LA23_228 >= KW_ABORT && LA23_228 <= KW_AFTER)||LA23_228==KW_ANALYZE||LA23_228==KW_ARCHIVE||LA23_228==KW_ASC||(LA23_228 >= KW_AUTOCOMMIT && LA23_228 <= KW_BEFORE)||(LA23_228 >= KW_BUCKET && LA23_228 <= KW_BUCKETS)||LA23_228==KW_CASCADE||LA23_228==KW_CHANGE||(LA23_228 >= KW_CLUSTER && LA23_228 <= KW_COLLECTION)||(LA23_228 >= KW_COLUMNS && LA23_228 <= KW_COMMENT)||(LA23_228 >= KW_COMPACT && LA23_228 <= KW_CONCATENATE)||LA23_228==KW_CONTINUE||LA23_228==KW_DATA||LA23_228==KW_DATABASES||(LA23_228 >= KW_DATETIME && LA23_228 <= KW_DBPROPERTIES)||(LA23_228 >= KW_DEFERRED && LA23_228 <= KW_DEFINED)||(LA23_228 >= KW_DELIMITED && LA23_228 <= KW_DESC)||(LA23_228 >= KW_DIRECTORIES && LA23_228 <= KW_DISABLE)||LA23_228==KW_DISTRIBUTE||LA23_228==KW_ELEM_TYPE||LA23_228==KW_ENABLE||LA23_228==KW_ESCAPED||LA23_228==KW_EXCLUSIVE||(LA23_228 >= KW_EXPLAIN && LA23_228 <= KW_EXPORT)||(LA23_228 >= KW_FIELDS && LA23_228 <= KW_FIRST)||(LA23_228 >= KW_FORMAT && LA23_228 <= KW_FORMATTED)||LA23_228==KW_FUNCTIONS||(LA23_228 >= KW_HOUR && LA23_228 <= KW_IDXPROPERTIES)||(LA23_228 >= KW_INDEX && LA23_228 <= KW_INDEXES)||(LA23_228 >= KW_INPATH && LA23_228 <= KW_INPUTFORMAT)||(LA23_228 >= KW_ISOLATION && LA23_228 <= KW_JAR)||(LA23_228 >= KW_KEY && LA23_228 <= KW_LAST)||LA23_228==KW_LEVEL||(LA23_228 >= KW_LIMIT && LA23_228 <= KW_LOAD)||(LA23_228 >= KW_LOCATION && LA23_228 <= KW_LONG)||(LA23_228 >= KW_MAPJOIN && LA23_228 <= KW_MONTH)||LA23_228==KW_MSCK||(LA23_228 >= KW_NORELY && LA23_228 <= KW_NOSCAN)||LA23_228==KW_NOVALIDATE||LA23_228==KW_NULLS||LA23_228==KW_OFFSET||LA23_228==KW_OPTION||(LA23_228 >= KW_OUTPUTDRIVER && LA23_228 <= KW_OUTPUTFORMAT)||(LA23_228 >= KW_OVERWRITE && LA23_228 <= KW_OWNER)||(LA23_228 >= KW_PARTITIONED && LA23_228 <= KW_PARTITIONS)||LA23_228==KW_PLUS||LA23_228==KW_PRETTY||LA23_228==KW_PRINCIPALS||LA23_228==KW_PURGE||LA23_228==KW_READ||(LA23_228 >= KW_REBUILD && LA23_228 <= KW_RECORDWRITER)||(LA23_228 >= KW_RELOAD && LA23_228 <= KW_RESTRICT)||LA23_228==KW_REWRITE||(LA23_228 >= KW_ROLE && LA23_228 <= KW_ROLES)||(LA23_228 >= KW_SCHEMA && LA23_228 <= KW_SECOND)||(LA23_228 >= KW_SEMI && LA23_228 <= KW_SERVER)||(LA23_228 >= KW_SETS && LA23_228 <= KW_SKEWED)||(LA23_228 >= KW_SNAPSHOT && LA23_228 <= KW_SSL)||(LA23_228 >= KW_STATISTICS && LA23_228 <= KW_STRUCT)||LA23_228==KW_TABLES||(LA23_228 >= KW_TBLPROPERTIES && LA23_228 <= KW_TERMINATED)||LA23_228==KW_TINYINT||(LA23_228 >= KW_TOUCH && LA23_228 <= KW_TRANSACTIONS)||LA23_228==KW_UNARCHIVE||LA23_228==KW_UNDO||LA23_228==KW_UNIONTYPE||(LA23_228 >= KW_UNLOCK && LA23_228 <= KW_UNSIGNED)||(LA23_228 >= KW_URI && LA23_228 <= KW_USE)||(LA23_228 >= KW_UTC && LA23_228 <= KW_VALIDATE)||LA23_228==KW_VALUE_TYPE||LA23_228==KW_VIEW||LA23_228==KW_WHILE||(LA23_228 >= KW_WORK && LA23_228 <= KW_YEAR)||LA23_228==KW_HOLD_DDLTIME||LA23_228==KW_IGNORE||LA23_228==KW_NO_DROP||LA23_228==KW_OFFLINE||LA23_228==KW_PROTECTION||LA23_228==KW_READONLY) ) {s = 454;}
						else if ( ((LA23_228 >= KW_ALL && LA23_228 <= KW_ALTER)||(LA23_228 >= KW_ARRAY && LA23_228 <= KW_AS)||LA23_228==KW_AUTHORIZATION||(LA23_228 >= KW_BETWEEN && LA23_228 <= KW_BOTH)||LA23_228==KW_BY||LA23_228==KW_CONSTRAINT||LA23_228==KW_CREATE||LA23_228==KW_CUBE||(LA23_228 >= KW_CURRENT_DATE && LA23_228 <= KW_CURSOR)||LA23_228==KW_DATE||LA23_228==KW_DECIMAL||LA23_228==KW_DELETE||LA23_228==KW_DESCRIBE||(LA23_228 >= KW_DOUBLE && LA23_228 <= KW_DROP)||LA23_228==KW_EXISTS||(LA23_228 >= KW_EXTERNAL && LA23_228 <= KW_FETCH)||LA23_228==KW_FLOAT||(LA23_228 >= KW_FOR && LA23_228 <= KW_FOREIGN)||LA23_228==KW_FULL||(LA23_228 >= KW_GRANT && LA23_228 <= KW_GROUPING)||(LA23_228 >= KW_IMPORT && LA23_228 <= KW_IN)||LA23_228==KW_INNER||(LA23_228 >= KW_INSERT && LA23_228 <= KW_INTERSECT)||(LA23_228 >= KW_INTO && LA23_228 <= KW_IS)||(LA23_228 >= KW_LATERAL && LA23_228 <= KW_LEFT)||LA23_228==KW_LIKE||LA23_228==KW_LOCAL||LA23_228==KW_NONE||LA23_228==KW_NULL||LA23_228==KW_OF||(LA23_228 >= KW_ORDER && LA23_228 <= KW_OUTER)||LA23_228==KW_PARTITION||LA23_228==KW_PERCENT||LA23_228==KW_PRIMARY||LA23_228==KW_PROCEDURE||LA23_228==KW_RANGE||LA23_228==KW_READS||(LA23_228 >= KW_REFERENCES && LA23_228 <= KW_REGEXP)||LA23_228==KW_REVOKE||(LA23_228 >= KW_RIGHT && LA23_228 <= KW_RLIKE)||(LA23_228 >= KW_ROLLUP && LA23_228 <= KW_ROWS)||LA23_228==KW_SET||LA23_228==KW_SMALLINT||LA23_228==KW_TABLE||LA23_228==KW_TIMESTAMP||LA23_228==KW_TO||(LA23_228 >= KW_TRIGGER && LA23_228 <= KW_TRUNCATE)||LA23_228==KW_UNION||LA23_228==KW_UPDATE||(LA23_228 >= KW_USER && LA23_228 <= KW_USING)||LA23_228==KW_VALUES||LA23_228==KW_WITH) ) {s = 455;}
						 
						input.seek(index23_228);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA23_256 = input.LA(1);
						 
						int index23_256 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_256==STAR) && (synpred2_SelectClauseParser())) {s = 456;}
						else if ( (LA23_256==Identifier) ) {s = 457;}
						else if ( ((LA23_256 >= KW_ABORT && LA23_256 <= KW_AFTER)||LA23_256==KW_ANALYZE||LA23_256==KW_ARCHIVE||LA23_256==KW_ASC||(LA23_256 >= KW_AUTOCOMMIT && LA23_256 <= KW_BEFORE)||(LA23_256 >= KW_BUCKET && LA23_256 <= KW_BUCKETS)||LA23_256==KW_CASCADE||LA23_256==KW_CHANGE||(LA23_256 >= KW_CLUSTER && LA23_256 <= KW_COLLECTION)||(LA23_256 >= KW_COLUMNS && LA23_256 <= KW_COMMENT)||(LA23_256 >= KW_COMPACT && LA23_256 <= KW_CONCATENATE)||LA23_256==KW_CONTINUE||LA23_256==KW_DATA||LA23_256==KW_DATABASES||(LA23_256 >= KW_DATETIME && LA23_256 <= KW_DBPROPERTIES)||(LA23_256 >= KW_DEFERRED && LA23_256 <= KW_DEFINED)||(LA23_256 >= KW_DELIMITED && LA23_256 <= KW_DESC)||(LA23_256 >= KW_DIRECTORIES && LA23_256 <= KW_DISABLE)||LA23_256==KW_DISTRIBUTE||LA23_256==KW_ELEM_TYPE||LA23_256==KW_ENABLE||LA23_256==KW_ESCAPED||LA23_256==KW_EXCLUSIVE||(LA23_256 >= KW_EXPLAIN && LA23_256 <= KW_EXPORT)||(LA23_256 >= KW_FIELDS && LA23_256 <= KW_FIRST)||(LA23_256 >= KW_FORMAT && LA23_256 <= KW_FORMATTED)||LA23_256==KW_FUNCTIONS||(LA23_256 >= KW_HOUR && LA23_256 <= KW_IDXPROPERTIES)||(LA23_256 >= KW_INDEX && LA23_256 <= KW_INDEXES)||(LA23_256 >= KW_INPATH && LA23_256 <= KW_INPUTFORMAT)||(LA23_256 >= KW_ISOLATION && LA23_256 <= KW_JAR)||(LA23_256 >= KW_KEY && LA23_256 <= KW_LAST)||LA23_256==KW_LEVEL||(LA23_256 >= KW_LIMIT && LA23_256 <= KW_LOAD)||(LA23_256 >= KW_LOCATION && LA23_256 <= KW_LONG)||(LA23_256 >= KW_MAPJOIN && LA23_256 <= KW_MONTH)||LA23_256==KW_MSCK||(LA23_256 >= KW_NORELY && LA23_256 <= KW_NOSCAN)||LA23_256==KW_NOVALIDATE||LA23_256==KW_NULLS||LA23_256==KW_OFFSET||LA23_256==KW_OPTION||(LA23_256 >= KW_OUTPUTDRIVER && LA23_256 <= KW_OUTPUTFORMAT)||(LA23_256 >= KW_OVERWRITE && LA23_256 <= KW_OWNER)||(LA23_256 >= KW_PARTITIONED && LA23_256 <= KW_PARTITIONS)||LA23_256==KW_PLUS||LA23_256==KW_PRETTY||LA23_256==KW_PRINCIPALS||LA23_256==KW_PURGE||LA23_256==KW_READ||(LA23_256 >= KW_REBUILD && LA23_256 <= KW_RECORDWRITER)||(LA23_256 >= KW_RELOAD && LA23_256 <= KW_RESTRICT)||LA23_256==KW_REWRITE||(LA23_256 >= KW_ROLE && LA23_256 <= KW_ROLES)||(LA23_256 >= KW_SCHEMA && LA23_256 <= KW_SECOND)||(LA23_256 >= KW_SEMI && LA23_256 <= KW_SERVER)||(LA23_256 >= KW_SETS && LA23_256 <= KW_SKEWED)||(LA23_256 >= KW_SNAPSHOT && LA23_256 <= KW_SSL)||(LA23_256 >= KW_STATISTICS && LA23_256 <= KW_STRUCT)||LA23_256==KW_TABLES||(LA23_256 >= KW_TBLPROPERTIES && LA23_256 <= KW_TERMINATED)||LA23_256==KW_TINYINT||(LA23_256 >= KW_TOUCH && LA23_256 <= KW_TRANSACTIONS)||LA23_256==KW_UNARCHIVE||LA23_256==KW_UNDO||LA23_256==KW_UNIONTYPE||(LA23_256 >= KW_UNLOCK && LA23_256 <= KW_UNSIGNED)||(LA23_256 >= KW_URI && LA23_256 <= KW_USE)||(LA23_256 >= KW_UTC && LA23_256 <= KW_VALIDATE)||LA23_256==KW_VALUE_TYPE||LA23_256==KW_VIEW||LA23_256==KW_WHILE||(LA23_256 >= KW_WORK && LA23_256 <= KW_YEAR)||LA23_256==KW_HOLD_DDLTIME||LA23_256==KW_IGNORE||LA23_256==KW_NO_DROP||LA23_256==KW_OFFLINE||LA23_256==KW_PROTECTION||LA23_256==KW_READONLY) ) {s = 458;}
						else if ( ((LA23_256 >= KW_ALL && LA23_256 <= KW_ALTER)||(LA23_256 >= KW_ARRAY && LA23_256 <= KW_AS)||LA23_256==KW_AUTHORIZATION||(LA23_256 >= KW_BETWEEN && LA23_256 <= KW_BOTH)||LA23_256==KW_BY||LA23_256==KW_CONSTRAINT||LA23_256==KW_CREATE||LA23_256==KW_CUBE||(LA23_256 >= KW_CURRENT_DATE && LA23_256 <= KW_CURSOR)||LA23_256==KW_DATE||LA23_256==KW_DECIMAL||LA23_256==KW_DELETE||LA23_256==KW_DESCRIBE||(LA23_256 >= KW_DOUBLE && LA23_256 <= KW_DROP)||LA23_256==KW_EXISTS||(LA23_256 >= KW_EXTERNAL && LA23_256 <= KW_FETCH)||LA23_256==KW_FLOAT||(LA23_256 >= KW_FOR && LA23_256 <= KW_FOREIGN)||LA23_256==KW_FULL||(LA23_256 >= KW_GRANT && LA23_256 <= KW_GROUPING)||(LA23_256 >= KW_IMPORT && LA23_256 <= KW_IN)||LA23_256==KW_INNER||(LA23_256 >= KW_INSERT && LA23_256 <= KW_INTERSECT)||(LA23_256 >= KW_INTO && LA23_256 <= KW_IS)||(LA23_256 >= KW_LATERAL && LA23_256 <= KW_LEFT)||LA23_256==KW_LIKE||LA23_256==KW_LOCAL||LA23_256==KW_NONE||LA23_256==KW_NULL||LA23_256==KW_OF||(LA23_256 >= KW_ORDER && LA23_256 <= KW_OUTER)||LA23_256==KW_PARTITION||LA23_256==KW_PERCENT||LA23_256==KW_PRIMARY||LA23_256==KW_PROCEDURE||LA23_256==KW_RANGE||LA23_256==KW_READS||(LA23_256 >= KW_REFERENCES && LA23_256 <= KW_REGEXP)||LA23_256==KW_REVOKE||(LA23_256 >= KW_RIGHT && LA23_256 <= KW_RLIKE)||(LA23_256 >= KW_ROLLUP && LA23_256 <= KW_ROWS)||LA23_256==KW_SET||LA23_256==KW_SMALLINT||LA23_256==KW_TABLE||LA23_256==KW_TIMESTAMP||LA23_256==KW_TO||(LA23_256 >= KW_TRIGGER && LA23_256 <= KW_TRUNCATE)||LA23_256==KW_UNION||LA23_256==KW_UPDATE||(LA23_256 >= KW_USER && LA23_256 <= KW_USING)||LA23_256==KW_VALUES||LA23_256==KW_WITH) ) {s = 459;}
						 
						input.seek(index23_256);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA23_284 = input.LA(1);
						 
						int index23_284 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_284==STAR) && (synpred2_SelectClauseParser())) {s = 460;}
						else if ( (LA23_284==Identifier) ) {s = 461;}
						else if ( ((LA23_284 >= KW_ABORT && LA23_284 <= KW_AFTER)||LA23_284==KW_ANALYZE||LA23_284==KW_ARCHIVE||LA23_284==KW_ASC||(LA23_284 >= KW_AUTOCOMMIT && LA23_284 <= KW_BEFORE)||(LA23_284 >= KW_BUCKET && LA23_284 <= KW_BUCKETS)||LA23_284==KW_CASCADE||LA23_284==KW_CHANGE||(LA23_284 >= KW_CLUSTER && LA23_284 <= KW_COLLECTION)||(LA23_284 >= KW_COLUMNS && LA23_284 <= KW_COMMENT)||(LA23_284 >= KW_COMPACT && LA23_284 <= KW_CONCATENATE)||LA23_284==KW_CONTINUE||LA23_284==KW_DATA||LA23_284==KW_DATABASES||(LA23_284 >= KW_DATETIME && LA23_284 <= KW_DBPROPERTIES)||(LA23_284 >= KW_DEFERRED && LA23_284 <= KW_DEFINED)||(LA23_284 >= KW_DELIMITED && LA23_284 <= KW_DESC)||(LA23_284 >= KW_DIRECTORIES && LA23_284 <= KW_DISABLE)||LA23_284==KW_DISTRIBUTE||LA23_284==KW_ELEM_TYPE||LA23_284==KW_ENABLE||LA23_284==KW_ESCAPED||LA23_284==KW_EXCLUSIVE||(LA23_284 >= KW_EXPLAIN && LA23_284 <= KW_EXPORT)||(LA23_284 >= KW_FIELDS && LA23_284 <= KW_FIRST)||(LA23_284 >= KW_FORMAT && LA23_284 <= KW_FORMATTED)||LA23_284==KW_FUNCTIONS||(LA23_284 >= KW_HOUR && LA23_284 <= KW_IDXPROPERTIES)||(LA23_284 >= KW_INDEX && LA23_284 <= KW_INDEXES)||(LA23_284 >= KW_INPATH && LA23_284 <= KW_INPUTFORMAT)||(LA23_284 >= KW_ISOLATION && LA23_284 <= KW_JAR)||(LA23_284 >= KW_KEY && LA23_284 <= KW_LAST)||LA23_284==KW_LEVEL||(LA23_284 >= KW_LIMIT && LA23_284 <= KW_LOAD)||(LA23_284 >= KW_LOCATION && LA23_284 <= KW_LONG)||(LA23_284 >= KW_MAPJOIN && LA23_284 <= KW_MONTH)||LA23_284==KW_MSCK||(LA23_284 >= KW_NORELY && LA23_284 <= KW_NOSCAN)||LA23_284==KW_NOVALIDATE||LA23_284==KW_NULLS||LA23_284==KW_OFFSET||LA23_284==KW_OPTION||(LA23_284 >= KW_OUTPUTDRIVER && LA23_284 <= KW_OUTPUTFORMAT)||(LA23_284 >= KW_OVERWRITE && LA23_284 <= KW_OWNER)||(LA23_284 >= KW_PARTITIONED && LA23_284 <= KW_PARTITIONS)||LA23_284==KW_PLUS||LA23_284==KW_PRETTY||LA23_284==KW_PRINCIPALS||LA23_284==KW_PURGE||LA23_284==KW_READ||(LA23_284 >= KW_REBUILD && LA23_284 <= KW_RECORDWRITER)||(LA23_284 >= KW_RELOAD && LA23_284 <= KW_RESTRICT)||LA23_284==KW_REWRITE||(LA23_284 >= KW_ROLE && LA23_284 <= KW_ROLES)||(LA23_284 >= KW_SCHEMA && LA23_284 <= KW_SECOND)||(LA23_284 >= KW_SEMI && LA23_284 <= KW_SERVER)||(LA23_284 >= KW_SETS && LA23_284 <= KW_SKEWED)||(LA23_284 >= KW_SNAPSHOT && LA23_284 <= KW_SSL)||(LA23_284 >= KW_STATISTICS && LA23_284 <= KW_STRUCT)||LA23_284==KW_TABLES||(LA23_284 >= KW_TBLPROPERTIES && LA23_284 <= KW_TERMINATED)||LA23_284==KW_TINYINT||(LA23_284 >= KW_TOUCH && LA23_284 <= KW_TRANSACTIONS)||LA23_284==KW_UNARCHIVE||LA23_284==KW_UNDO||LA23_284==KW_UNIONTYPE||(LA23_284 >= KW_UNLOCK && LA23_284 <= KW_UNSIGNED)||(LA23_284 >= KW_URI && LA23_284 <= KW_USE)||(LA23_284 >= KW_UTC && LA23_284 <= KW_VALIDATE)||LA23_284==KW_VALUE_TYPE||LA23_284==KW_VIEW||LA23_284==KW_WHILE||(LA23_284 >= KW_WORK && LA23_284 <= KW_YEAR)||LA23_284==KW_HOLD_DDLTIME||LA23_284==KW_IGNORE||LA23_284==KW_NO_DROP||LA23_284==KW_OFFLINE||LA23_284==KW_PROTECTION||LA23_284==KW_READONLY) ) {s = 462;}
						else if ( ((LA23_284 >= KW_ALL && LA23_284 <= KW_ALTER)||(LA23_284 >= KW_ARRAY && LA23_284 <= KW_AS)||LA23_284==KW_AUTHORIZATION||(LA23_284 >= KW_BETWEEN && LA23_284 <= KW_BOTH)||LA23_284==KW_BY||LA23_284==KW_CONSTRAINT||LA23_284==KW_CREATE||LA23_284==KW_CUBE||(LA23_284 >= KW_CURRENT_DATE && LA23_284 <= KW_CURSOR)||LA23_284==KW_DATE||LA23_284==KW_DECIMAL||LA23_284==KW_DELETE||LA23_284==KW_DESCRIBE||(LA23_284 >= KW_DOUBLE && LA23_284 <= KW_DROP)||LA23_284==KW_EXISTS||(LA23_284 >= KW_EXTERNAL && LA23_284 <= KW_FETCH)||LA23_284==KW_FLOAT||(LA23_284 >= KW_FOR && LA23_284 <= KW_FOREIGN)||LA23_284==KW_FULL||(LA23_284 >= KW_GRANT && LA23_284 <= KW_GROUPING)||(LA23_284 >= KW_IMPORT && LA23_284 <= KW_IN)||LA23_284==KW_INNER||(LA23_284 >= KW_INSERT && LA23_284 <= KW_INTERSECT)||(LA23_284 >= KW_INTO && LA23_284 <= KW_IS)||(LA23_284 >= KW_LATERAL && LA23_284 <= KW_LEFT)||LA23_284==KW_LIKE||LA23_284==KW_LOCAL||LA23_284==KW_NONE||LA23_284==KW_NULL||LA23_284==KW_OF||(LA23_284 >= KW_ORDER && LA23_284 <= KW_OUTER)||LA23_284==KW_PARTITION||LA23_284==KW_PERCENT||LA23_284==KW_PRIMARY||LA23_284==KW_PROCEDURE||LA23_284==KW_RANGE||LA23_284==KW_READS||(LA23_284 >= KW_REFERENCES && LA23_284 <= KW_REGEXP)||LA23_284==KW_REVOKE||(LA23_284 >= KW_RIGHT && LA23_284 <= KW_RLIKE)||(LA23_284 >= KW_ROLLUP && LA23_284 <= KW_ROWS)||LA23_284==KW_SET||LA23_284==KW_SMALLINT||LA23_284==KW_TABLE||LA23_284==KW_TIMESTAMP||LA23_284==KW_TO||(LA23_284 >= KW_TRIGGER && LA23_284 <= KW_TRUNCATE)||LA23_284==KW_UNION||LA23_284==KW_UPDATE||(LA23_284 >= KW_USER && LA23_284 <= KW_USING)||LA23_284==KW_VALUES||LA23_284==KW_WITH) ) {s = 463;}
						 
						input.seek(index23_284);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA23_312 = input.LA(1);
						 
						int index23_312 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_312==STAR) && (synpred2_SelectClauseParser())) {s = 464;}
						else if ( (LA23_312==Identifier) ) {s = 465;}
						else if ( ((LA23_312 >= KW_ABORT && LA23_312 <= KW_AFTER)||LA23_312==KW_ANALYZE||LA23_312==KW_ARCHIVE||LA23_312==KW_ASC||(LA23_312 >= KW_AUTOCOMMIT && LA23_312 <= KW_BEFORE)||(LA23_312 >= KW_BUCKET && LA23_312 <= KW_BUCKETS)||LA23_312==KW_CASCADE||LA23_312==KW_CHANGE||(LA23_312 >= KW_CLUSTER && LA23_312 <= KW_COLLECTION)||(LA23_312 >= KW_COLUMNS && LA23_312 <= KW_COMMENT)||(LA23_312 >= KW_COMPACT && LA23_312 <= KW_CONCATENATE)||LA23_312==KW_CONTINUE||LA23_312==KW_DATA||LA23_312==KW_DATABASES||(LA23_312 >= KW_DATETIME && LA23_312 <= KW_DBPROPERTIES)||(LA23_312 >= KW_DEFERRED && LA23_312 <= KW_DEFINED)||(LA23_312 >= KW_DELIMITED && LA23_312 <= KW_DESC)||(LA23_312 >= KW_DIRECTORIES && LA23_312 <= KW_DISABLE)||LA23_312==KW_DISTRIBUTE||LA23_312==KW_ELEM_TYPE||LA23_312==KW_ENABLE||LA23_312==KW_ESCAPED||LA23_312==KW_EXCLUSIVE||(LA23_312 >= KW_EXPLAIN && LA23_312 <= KW_EXPORT)||(LA23_312 >= KW_FIELDS && LA23_312 <= KW_FIRST)||(LA23_312 >= KW_FORMAT && LA23_312 <= KW_FORMATTED)||LA23_312==KW_FUNCTIONS||(LA23_312 >= KW_HOUR && LA23_312 <= KW_IDXPROPERTIES)||(LA23_312 >= KW_INDEX && LA23_312 <= KW_INDEXES)||(LA23_312 >= KW_INPATH && LA23_312 <= KW_INPUTFORMAT)||(LA23_312 >= KW_ISOLATION && LA23_312 <= KW_JAR)||(LA23_312 >= KW_KEY && LA23_312 <= KW_LAST)||LA23_312==KW_LEVEL||(LA23_312 >= KW_LIMIT && LA23_312 <= KW_LOAD)||(LA23_312 >= KW_LOCATION && LA23_312 <= KW_LONG)||(LA23_312 >= KW_MAPJOIN && LA23_312 <= KW_MONTH)||LA23_312==KW_MSCK||(LA23_312 >= KW_NORELY && LA23_312 <= KW_NOSCAN)||LA23_312==KW_NOVALIDATE||LA23_312==KW_NULLS||LA23_312==KW_OFFSET||LA23_312==KW_OPTION||(LA23_312 >= KW_OUTPUTDRIVER && LA23_312 <= KW_OUTPUTFORMAT)||(LA23_312 >= KW_OVERWRITE && LA23_312 <= KW_OWNER)||(LA23_312 >= KW_PARTITIONED && LA23_312 <= KW_PARTITIONS)||LA23_312==KW_PLUS||LA23_312==KW_PRETTY||LA23_312==KW_PRINCIPALS||LA23_312==KW_PURGE||LA23_312==KW_READ||(LA23_312 >= KW_REBUILD && LA23_312 <= KW_RECORDWRITER)||(LA23_312 >= KW_RELOAD && LA23_312 <= KW_RESTRICT)||LA23_312==KW_REWRITE||(LA23_312 >= KW_ROLE && LA23_312 <= KW_ROLES)||(LA23_312 >= KW_SCHEMA && LA23_312 <= KW_SECOND)||(LA23_312 >= KW_SEMI && LA23_312 <= KW_SERVER)||(LA23_312 >= KW_SETS && LA23_312 <= KW_SKEWED)||(LA23_312 >= KW_SNAPSHOT && LA23_312 <= KW_SSL)||(LA23_312 >= KW_STATISTICS && LA23_312 <= KW_STRUCT)||LA23_312==KW_TABLES||(LA23_312 >= KW_TBLPROPERTIES && LA23_312 <= KW_TERMINATED)||LA23_312==KW_TINYINT||(LA23_312 >= KW_TOUCH && LA23_312 <= KW_TRANSACTIONS)||LA23_312==KW_UNARCHIVE||LA23_312==KW_UNDO||LA23_312==KW_UNIONTYPE||(LA23_312 >= KW_UNLOCK && LA23_312 <= KW_UNSIGNED)||(LA23_312 >= KW_URI && LA23_312 <= KW_USE)||(LA23_312 >= KW_UTC && LA23_312 <= KW_VALIDATE)||LA23_312==KW_VALUE_TYPE||LA23_312==KW_VIEW||LA23_312==KW_WHILE||(LA23_312 >= KW_WORK && LA23_312 <= KW_YEAR)||LA23_312==KW_HOLD_DDLTIME||LA23_312==KW_IGNORE||LA23_312==KW_NO_DROP||LA23_312==KW_OFFLINE||LA23_312==KW_PROTECTION||LA23_312==KW_READONLY) ) {s = 466;}
						else if ( ((LA23_312 >= KW_ALL && LA23_312 <= KW_ALTER)||(LA23_312 >= KW_ARRAY && LA23_312 <= KW_AS)||LA23_312==KW_AUTHORIZATION||(LA23_312 >= KW_BETWEEN && LA23_312 <= KW_BOTH)||LA23_312==KW_BY||LA23_312==KW_CONSTRAINT||LA23_312==KW_CREATE||LA23_312==KW_CUBE||(LA23_312 >= KW_CURRENT_DATE && LA23_312 <= KW_CURSOR)||LA23_312==KW_DATE||LA23_312==KW_DECIMAL||LA23_312==KW_DELETE||LA23_312==KW_DESCRIBE||(LA23_312 >= KW_DOUBLE && LA23_312 <= KW_DROP)||LA23_312==KW_EXISTS||(LA23_312 >= KW_EXTERNAL && LA23_312 <= KW_FETCH)||LA23_312==KW_FLOAT||(LA23_312 >= KW_FOR && LA23_312 <= KW_FOREIGN)||LA23_312==KW_FULL||(LA23_312 >= KW_GRANT && LA23_312 <= KW_GROUPING)||(LA23_312 >= KW_IMPORT && LA23_312 <= KW_IN)||LA23_312==KW_INNER||(LA23_312 >= KW_INSERT && LA23_312 <= KW_INTERSECT)||(LA23_312 >= KW_INTO && LA23_312 <= KW_IS)||(LA23_312 >= KW_LATERAL && LA23_312 <= KW_LEFT)||LA23_312==KW_LIKE||LA23_312==KW_LOCAL||LA23_312==KW_NONE||LA23_312==KW_NULL||LA23_312==KW_OF||(LA23_312 >= KW_ORDER && LA23_312 <= KW_OUTER)||LA23_312==KW_PARTITION||LA23_312==KW_PERCENT||LA23_312==KW_PRIMARY||LA23_312==KW_PROCEDURE||LA23_312==KW_RANGE||LA23_312==KW_READS||(LA23_312 >= KW_REFERENCES && LA23_312 <= KW_REGEXP)||LA23_312==KW_REVOKE||(LA23_312 >= KW_RIGHT && LA23_312 <= KW_RLIKE)||(LA23_312 >= KW_ROLLUP && LA23_312 <= KW_ROWS)||LA23_312==KW_SET||LA23_312==KW_SMALLINT||LA23_312==KW_TABLE||LA23_312==KW_TIMESTAMP||LA23_312==KW_TO||(LA23_312 >= KW_TRIGGER && LA23_312 <= KW_TRUNCATE)||LA23_312==KW_UNION||LA23_312==KW_UPDATE||(LA23_312 >= KW_USER && LA23_312 <= KW_USING)||LA23_312==KW_VALUES||LA23_312==KW_WITH) ) {s = 467;}
						 
						input.seek(index23_312);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA23_340 = input.LA(1);
						 
						int index23_340 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_340==STAR) && (synpred2_SelectClauseParser())) {s = 468;}
						else if ( (LA23_340==Identifier) ) {s = 469;}
						else if ( ((LA23_340 >= KW_ABORT && LA23_340 <= KW_AFTER)||LA23_340==KW_ANALYZE||LA23_340==KW_ARCHIVE||LA23_340==KW_ASC||(LA23_340 >= KW_AUTOCOMMIT && LA23_340 <= KW_BEFORE)||(LA23_340 >= KW_BUCKET && LA23_340 <= KW_BUCKETS)||LA23_340==KW_CASCADE||LA23_340==KW_CHANGE||(LA23_340 >= KW_CLUSTER && LA23_340 <= KW_COLLECTION)||(LA23_340 >= KW_COLUMNS && LA23_340 <= KW_COMMENT)||(LA23_340 >= KW_COMPACT && LA23_340 <= KW_CONCATENATE)||LA23_340==KW_CONTINUE||LA23_340==KW_DATA||LA23_340==KW_DATABASES||(LA23_340 >= KW_DATETIME && LA23_340 <= KW_DBPROPERTIES)||(LA23_340 >= KW_DEFERRED && LA23_340 <= KW_DEFINED)||(LA23_340 >= KW_DELIMITED && LA23_340 <= KW_DESC)||(LA23_340 >= KW_DIRECTORIES && LA23_340 <= KW_DISABLE)||LA23_340==KW_DISTRIBUTE||LA23_340==KW_ELEM_TYPE||LA23_340==KW_ENABLE||LA23_340==KW_ESCAPED||LA23_340==KW_EXCLUSIVE||(LA23_340 >= KW_EXPLAIN && LA23_340 <= KW_EXPORT)||(LA23_340 >= KW_FIELDS && LA23_340 <= KW_FIRST)||(LA23_340 >= KW_FORMAT && LA23_340 <= KW_FORMATTED)||LA23_340==KW_FUNCTIONS||(LA23_340 >= KW_HOUR && LA23_340 <= KW_IDXPROPERTIES)||(LA23_340 >= KW_INDEX && LA23_340 <= KW_INDEXES)||(LA23_340 >= KW_INPATH && LA23_340 <= KW_INPUTFORMAT)||(LA23_340 >= KW_ISOLATION && LA23_340 <= KW_JAR)||(LA23_340 >= KW_KEY && LA23_340 <= KW_LAST)||LA23_340==KW_LEVEL||(LA23_340 >= KW_LIMIT && LA23_340 <= KW_LOAD)||(LA23_340 >= KW_LOCATION && LA23_340 <= KW_LONG)||(LA23_340 >= KW_MAPJOIN && LA23_340 <= KW_MONTH)||LA23_340==KW_MSCK||(LA23_340 >= KW_NORELY && LA23_340 <= KW_NOSCAN)||LA23_340==KW_NOVALIDATE||LA23_340==KW_NULLS||LA23_340==KW_OFFSET||LA23_340==KW_OPTION||(LA23_340 >= KW_OUTPUTDRIVER && LA23_340 <= KW_OUTPUTFORMAT)||(LA23_340 >= KW_OVERWRITE && LA23_340 <= KW_OWNER)||(LA23_340 >= KW_PARTITIONED && LA23_340 <= KW_PARTITIONS)||LA23_340==KW_PLUS||LA23_340==KW_PRETTY||LA23_340==KW_PRINCIPALS||LA23_340==KW_PURGE||LA23_340==KW_READ||(LA23_340 >= KW_REBUILD && LA23_340 <= KW_RECORDWRITER)||(LA23_340 >= KW_RELOAD && LA23_340 <= KW_RESTRICT)||LA23_340==KW_REWRITE||(LA23_340 >= KW_ROLE && LA23_340 <= KW_ROLES)||(LA23_340 >= KW_SCHEMA && LA23_340 <= KW_SECOND)||(LA23_340 >= KW_SEMI && LA23_340 <= KW_SERVER)||(LA23_340 >= KW_SETS && LA23_340 <= KW_SKEWED)||(LA23_340 >= KW_SNAPSHOT && LA23_340 <= KW_SSL)||(LA23_340 >= KW_STATISTICS && LA23_340 <= KW_STRUCT)||LA23_340==KW_TABLES||(LA23_340 >= KW_TBLPROPERTIES && LA23_340 <= KW_TERMINATED)||LA23_340==KW_TINYINT||(LA23_340 >= KW_TOUCH && LA23_340 <= KW_TRANSACTIONS)||LA23_340==KW_UNARCHIVE||LA23_340==KW_UNDO||LA23_340==KW_UNIONTYPE||(LA23_340 >= KW_UNLOCK && LA23_340 <= KW_UNSIGNED)||(LA23_340 >= KW_URI && LA23_340 <= KW_USE)||(LA23_340 >= KW_UTC && LA23_340 <= KW_VALIDATE)||LA23_340==KW_VALUE_TYPE||LA23_340==KW_VIEW||LA23_340==KW_WHILE||(LA23_340 >= KW_WORK && LA23_340 <= KW_YEAR)||LA23_340==KW_HOLD_DDLTIME||LA23_340==KW_IGNORE||LA23_340==KW_NO_DROP||LA23_340==KW_OFFLINE||LA23_340==KW_PROTECTION||LA23_340==KW_READONLY) ) {s = 470;}
						else if ( ((LA23_340 >= KW_ALL && LA23_340 <= KW_ALTER)||(LA23_340 >= KW_ARRAY && LA23_340 <= KW_AS)||LA23_340==KW_AUTHORIZATION||(LA23_340 >= KW_BETWEEN && LA23_340 <= KW_BOTH)||LA23_340==KW_BY||LA23_340==KW_CONSTRAINT||LA23_340==KW_CREATE||LA23_340==KW_CUBE||(LA23_340 >= KW_CURRENT_DATE && LA23_340 <= KW_CURSOR)||LA23_340==KW_DATE||LA23_340==KW_DECIMAL||LA23_340==KW_DELETE||LA23_340==KW_DESCRIBE||(LA23_340 >= KW_DOUBLE && LA23_340 <= KW_DROP)||LA23_340==KW_EXISTS||(LA23_340 >= KW_EXTERNAL && LA23_340 <= KW_FETCH)||LA23_340==KW_FLOAT||(LA23_340 >= KW_FOR && LA23_340 <= KW_FOREIGN)||LA23_340==KW_FULL||(LA23_340 >= KW_GRANT && LA23_340 <= KW_GROUPING)||(LA23_340 >= KW_IMPORT && LA23_340 <= KW_IN)||LA23_340==KW_INNER||(LA23_340 >= KW_INSERT && LA23_340 <= KW_INTERSECT)||(LA23_340 >= KW_INTO && LA23_340 <= KW_IS)||(LA23_340 >= KW_LATERAL && LA23_340 <= KW_LEFT)||LA23_340==KW_LIKE||LA23_340==KW_LOCAL||LA23_340==KW_NONE||LA23_340==KW_NULL||LA23_340==KW_OF||(LA23_340 >= KW_ORDER && LA23_340 <= KW_OUTER)||LA23_340==KW_PARTITION||LA23_340==KW_PERCENT||LA23_340==KW_PRIMARY||LA23_340==KW_PROCEDURE||LA23_340==KW_RANGE||LA23_340==KW_READS||(LA23_340 >= KW_REFERENCES && LA23_340 <= KW_REGEXP)||LA23_340==KW_REVOKE||(LA23_340 >= KW_RIGHT && LA23_340 <= KW_RLIKE)||(LA23_340 >= KW_ROLLUP && LA23_340 <= KW_ROWS)||LA23_340==KW_SET||LA23_340==KW_SMALLINT||LA23_340==KW_TABLE||LA23_340==KW_TIMESTAMP||LA23_340==KW_TO||(LA23_340 >= KW_TRIGGER && LA23_340 <= KW_TRUNCATE)||LA23_340==KW_UNION||LA23_340==KW_UPDATE||(LA23_340 >= KW_USER && LA23_340 <= KW_USING)||LA23_340==KW_VALUES||LA23_340==KW_WITH) ) {s = 471;}
						 
						input.seek(index23_340);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA23_368 = input.LA(1);
						 
						int index23_368 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_368==STAR) && (synpred2_SelectClauseParser())) {s = 472;}
						else if ( (LA23_368==Identifier) ) {s = 473;}
						else if ( ((LA23_368 >= KW_ABORT && LA23_368 <= KW_AFTER)||LA23_368==KW_ANALYZE||LA23_368==KW_ARCHIVE||LA23_368==KW_ASC||(LA23_368 >= KW_AUTOCOMMIT && LA23_368 <= KW_BEFORE)||(LA23_368 >= KW_BUCKET && LA23_368 <= KW_BUCKETS)||LA23_368==KW_CASCADE||LA23_368==KW_CHANGE||(LA23_368 >= KW_CLUSTER && LA23_368 <= KW_COLLECTION)||(LA23_368 >= KW_COLUMNS && LA23_368 <= KW_COMMENT)||(LA23_368 >= KW_COMPACT && LA23_368 <= KW_CONCATENATE)||LA23_368==KW_CONTINUE||LA23_368==KW_DATA||LA23_368==KW_DATABASES||(LA23_368 >= KW_DATETIME && LA23_368 <= KW_DBPROPERTIES)||(LA23_368 >= KW_DEFERRED && LA23_368 <= KW_DEFINED)||(LA23_368 >= KW_DELIMITED && LA23_368 <= KW_DESC)||(LA23_368 >= KW_DIRECTORIES && LA23_368 <= KW_DISABLE)||LA23_368==KW_DISTRIBUTE||LA23_368==KW_ELEM_TYPE||LA23_368==KW_ENABLE||LA23_368==KW_ESCAPED||LA23_368==KW_EXCLUSIVE||(LA23_368 >= KW_EXPLAIN && LA23_368 <= KW_EXPORT)||(LA23_368 >= KW_FIELDS && LA23_368 <= KW_FIRST)||(LA23_368 >= KW_FORMAT && LA23_368 <= KW_FORMATTED)||LA23_368==KW_FUNCTIONS||(LA23_368 >= KW_HOUR && LA23_368 <= KW_IDXPROPERTIES)||(LA23_368 >= KW_INDEX && LA23_368 <= KW_INDEXES)||(LA23_368 >= KW_INPATH && LA23_368 <= KW_INPUTFORMAT)||(LA23_368 >= KW_ISOLATION && LA23_368 <= KW_JAR)||(LA23_368 >= KW_KEY && LA23_368 <= KW_LAST)||LA23_368==KW_LEVEL||(LA23_368 >= KW_LIMIT && LA23_368 <= KW_LOAD)||(LA23_368 >= KW_LOCATION && LA23_368 <= KW_LONG)||(LA23_368 >= KW_MAPJOIN && LA23_368 <= KW_MONTH)||LA23_368==KW_MSCK||(LA23_368 >= KW_NORELY && LA23_368 <= KW_NOSCAN)||LA23_368==KW_NOVALIDATE||LA23_368==KW_NULLS||LA23_368==KW_OFFSET||LA23_368==KW_OPTION||(LA23_368 >= KW_OUTPUTDRIVER && LA23_368 <= KW_OUTPUTFORMAT)||(LA23_368 >= KW_OVERWRITE && LA23_368 <= KW_OWNER)||(LA23_368 >= KW_PARTITIONED && LA23_368 <= KW_PARTITIONS)||LA23_368==KW_PLUS||LA23_368==KW_PRETTY||LA23_368==KW_PRINCIPALS||LA23_368==KW_PURGE||LA23_368==KW_READ||(LA23_368 >= KW_REBUILD && LA23_368 <= KW_RECORDWRITER)||(LA23_368 >= KW_RELOAD && LA23_368 <= KW_RESTRICT)||LA23_368==KW_REWRITE||(LA23_368 >= KW_ROLE && LA23_368 <= KW_ROLES)||(LA23_368 >= KW_SCHEMA && LA23_368 <= KW_SECOND)||(LA23_368 >= KW_SEMI && LA23_368 <= KW_SERVER)||(LA23_368 >= KW_SETS && LA23_368 <= KW_SKEWED)||(LA23_368 >= KW_SNAPSHOT && LA23_368 <= KW_SSL)||(LA23_368 >= KW_STATISTICS && LA23_368 <= KW_STRUCT)||LA23_368==KW_TABLES||(LA23_368 >= KW_TBLPROPERTIES && LA23_368 <= KW_TERMINATED)||LA23_368==KW_TINYINT||(LA23_368 >= KW_TOUCH && LA23_368 <= KW_TRANSACTIONS)||LA23_368==KW_UNARCHIVE||LA23_368==KW_UNDO||LA23_368==KW_UNIONTYPE||(LA23_368 >= KW_UNLOCK && LA23_368 <= KW_UNSIGNED)||(LA23_368 >= KW_URI && LA23_368 <= KW_USE)||(LA23_368 >= KW_UTC && LA23_368 <= KW_VALIDATE)||LA23_368==KW_VALUE_TYPE||LA23_368==KW_VIEW||LA23_368==KW_WHILE||(LA23_368 >= KW_WORK && LA23_368 <= KW_YEAR)||LA23_368==KW_HOLD_DDLTIME||LA23_368==KW_IGNORE||LA23_368==KW_NO_DROP||LA23_368==KW_OFFLINE||LA23_368==KW_PROTECTION||LA23_368==KW_READONLY) ) {s = 474;}
						else if ( ((LA23_368 >= KW_ALL && LA23_368 <= KW_ALTER)||(LA23_368 >= KW_ARRAY && LA23_368 <= KW_AS)||LA23_368==KW_AUTHORIZATION||(LA23_368 >= KW_BETWEEN && LA23_368 <= KW_BOTH)||LA23_368==KW_BY||LA23_368==KW_CONSTRAINT||LA23_368==KW_CREATE||LA23_368==KW_CUBE||(LA23_368 >= KW_CURRENT_DATE && LA23_368 <= KW_CURSOR)||LA23_368==KW_DATE||LA23_368==KW_DECIMAL||LA23_368==KW_DELETE||LA23_368==KW_DESCRIBE||(LA23_368 >= KW_DOUBLE && LA23_368 <= KW_DROP)||LA23_368==KW_EXISTS||(LA23_368 >= KW_EXTERNAL && LA23_368 <= KW_FETCH)||LA23_368==KW_FLOAT||(LA23_368 >= KW_FOR && LA23_368 <= KW_FOREIGN)||LA23_368==KW_FULL||(LA23_368 >= KW_GRANT && LA23_368 <= KW_GROUPING)||(LA23_368 >= KW_IMPORT && LA23_368 <= KW_IN)||LA23_368==KW_INNER||(LA23_368 >= KW_INSERT && LA23_368 <= KW_INTERSECT)||(LA23_368 >= KW_INTO && LA23_368 <= KW_IS)||(LA23_368 >= KW_LATERAL && LA23_368 <= KW_LEFT)||LA23_368==KW_LIKE||LA23_368==KW_LOCAL||LA23_368==KW_NONE||LA23_368==KW_NULL||LA23_368==KW_OF||(LA23_368 >= KW_ORDER && LA23_368 <= KW_OUTER)||LA23_368==KW_PARTITION||LA23_368==KW_PERCENT||LA23_368==KW_PRIMARY||LA23_368==KW_PROCEDURE||LA23_368==KW_RANGE||LA23_368==KW_READS||(LA23_368 >= KW_REFERENCES && LA23_368 <= KW_REGEXP)||LA23_368==KW_REVOKE||(LA23_368 >= KW_RIGHT && LA23_368 <= KW_RLIKE)||(LA23_368 >= KW_ROLLUP && LA23_368 <= KW_ROWS)||LA23_368==KW_SET||LA23_368==KW_SMALLINT||LA23_368==KW_TABLE||LA23_368==KW_TIMESTAMP||LA23_368==KW_TO||(LA23_368 >= KW_TRIGGER && LA23_368 <= KW_TRUNCATE)||LA23_368==KW_UNION||LA23_368==KW_UPDATE||(LA23_368 >= KW_USER && LA23_368 <= KW_USING)||LA23_368==KW_VALUES||LA23_368==KW_WITH) ) {s = 475;}
						 
						input.seek(index23_368);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA23_396 = input.LA(1);
						 
						int index23_396 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_396==STAR) && (synpred2_SelectClauseParser())) {s = 476;}
						else if ( (LA23_396==Identifier) ) {s = 477;}
						else if ( ((LA23_396 >= KW_ABORT && LA23_396 <= KW_AFTER)||LA23_396==KW_ANALYZE||LA23_396==KW_ARCHIVE||LA23_396==KW_ASC||(LA23_396 >= KW_AUTOCOMMIT && LA23_396 <= KW_BEFORE)||(LA23_396 >= KW_BUCKET && LA23_396 <= KW_BUCKETS)||LA23_396==KW_CASCADE||LA23_396==KW_CHANGE||(LA23_396 >= KW_CLUSTER && LA23_396 <= KW_COLLECTION)||(LA23_396 >= KW_COLUMNS && LA23_396 <= KW_COMMENT)||(LA23_396 >= KW_COMPACT && LA23_396 <= KW_CONCATENATE)||LA23_396==KW_CONTINUE||LA23_396==KW_DATA||LA23_396==KW_DATABASES||(LA23_396 >= KW_DATETIME && LA23_396 <= KW_DBPROPERTIES)||(LA23_396 >= KW_DEFERRED && LA23_396 <= KW_DEFINED)||(LA23_396 >= KW_DELIMITED && LA23_396 <= KW_DESC)||(LA23_396 >= KW_DIRECTORIES && LA23_396 <= KW_DISABLE)||LA23_396==KW_DISTRIBUTE||LA23_396==KW_ELEM_TYPE||LA23_396==KW_ENABLE||LA23_396==KW_ESCAPED||LA23_396==KW_EXCLUSIVE||(LA23_396 >= KW_EXPLAIN && LA23_396 <= KW_EXPORT)||(LA23_396 >= KW_FIELDS && LA23_396 <= KW_FIRST)||(LA23_396 >= KW_FORMAT && LA23_396 <= KW_FORMATTED)||LA23_396==KW_FUNCTIONS||(LA23_396 >= KW_HOUR && LA23_396 <= KW_IDXPROPERTIES)||(LA23_396 >= KW_INDEX && LA23_396 <= KW_INDEXES)||(LA23_396 >= KW_INPATH && LA23_396 <= KW_INPUTFORMAT)||(LA23_396 >= KW_ISOLATION && LA23_396 <= KW_JAR)||(LA23_396 >= KW_KEY && LA23_396 <= KW_LAST)||LA23_396==KW_LEVEL||(LA23_396 >= KW_LIMIT && LA23_396 <= KW_LOAD)||(LA23_396 >= KW_LOCATION && LA23_396 <= KW_LONG)||(LA23_396 >= KW_MAPJOIN && LA23_396 <= KW_MONTH)||LA23_396==KW_MSCK||(LA23_396 >= KW_NORELY && LA23_396 <= KW_NOSCAN)||LA23_396==KW_NOVALIDATE||LA23_396==KW_NULLS||LA23_396==KW_OFFSET||LA23_396==KW_OPTION||(LA23_396 >= KW_OUTPUTDRIVER && LA23_396 <= KW_OUTPUTFORMAT)||(LA23_396 >= KW_OVERWRITE && LA23_396 <= KW_OWNER)||(LA23_396 >= KW_PARTITIONED && LA23_396 <= KW_PARTITIONS)||LA23_396==KW_PLUS||LA23_396==KW_PRETTY||LA23_396==KW_PRINCIPALS||LA23_396==KW_PURGE||LA23_396==KW_READ||(LA23_396 >= KW_REBUILD && LA23_396 <= KW_RECORDWRITER)||(LA23_396 >= KW_RELOAD && LA23_396 <= KW_RESTRICT)||LA23_396==KW_REWRITE||(LA23_396 >= KW_ROLE && LA23_396 <= KW_ROLES)||(LA23_396 >= KW_SCHEMA && LA23_396 <= KW_SECOND)||(LA23_396 >= KW_SEMI && LA23_396 <= KW_SERVER)||(LA23_396 >= KW_SETS && LA23_396 <= KW_SKEWED)||(LA23_396 >= KW_SNAPSHOT && LA23_396 <= KW_SSL)||(LA23_396 >= KW_STATISTICS && LA23_396 <= KW_STRUCT)||LA23_396==KW_TABLES||(LA23_396 >= KW_TBLPROPERTIES && LA23_396 <= KW_TERMINATED)||LA23_396==KW_TINYINT||(LA23_396 >= KW_TOUCH && LA23_396 <= KW_TRANSACTIONS)||LA23_396==KW_UNARCHIVE||LA23_396==KW_UNDO||LA23_396==KW_UNIONTYPE||(LA23_396 >= KW_UNLOCK && LA23_396 <= KW_UNSIGNED)||(LA23_396 >= KW_URI && LA23_396 <= KW_USE)||(LA23_396 >= KW_UTC && LA23_396 <= KW_VALIDATE)||LA23_396==KW_VALUE_TYPE||LA23_396==KW_VIEW||LA23_396==KW_WHILE||(LA23_396 >= KW_WORK && LA23_396 <= KW_YEAR)||LA23_396==KW_HOLD_DDLTIME||LA23_396==KW_IGNORE||LA23_396==KW_NO_DROP||LA23_396==KW_OFFLINE||LA23_396==KW_PROTECTION||LA23_396==KW_READONLY) ) {s = 478;}
						else if ( ((LA23_396 >= KW_ALL && LA23_396 <= KW_ALTER)||(LA23_396 >= KW_ARRAY && LA23_396 <= KW_AS)||LA23_396==KW_AUTHORIZATION||(LA23_396 >= KW_BETWEEN && LA23_396 <= KW_BOTH)||LA23_396==KW_BY||LA23_396==KW_CONSTRAINT||LA23_396==KW_CREATE||LA23_396==KW_CUBE||(LA23_396 >= KW_CURRENT_DATE && LA23_396 <= KW_CURSOR)||LA23_396==KW_DATE||LA23_396==KW_DECIMAL||LA23_396==KW_DELETE||LA23_396==KW_DESCRIBE||(LA23_396 >= KW_DOUBLE && LA23_396 <= KW_DROP)||LA23_396==KW_EXISTS||(LA23_396 >= KW_EXTERNAL && LA23_396 <= KW_FETCH)||LA23_396==KW_FLOAT||(LA23_396 >= KW_FOR && LA23_396 <= KW_FOREIGN)||LA23_396==KW_FULL||(LA23_396 >= KW_GRANT && LA23_396 <= KW_GROUPING)||(LA23_396 >= KW_IMPORT && LA23_396 <= KW_IN)||LA23_396==KW_INNER||(LA23_396 >= KW_INSERT && LA23_396 <= KW_INTERSECT)||(LA23_396 >= KW_INTO && LA23_396 <= KW_IS)||(LA23_396 >= KW_LATERAL && LA23_396 <= KW_LEFT)||LA23_396==KW_LIKE||LA23_396==KW_LOCAL||LA23_396==KW_NONE||LA23_396==KW_NULL||LA23_396==KW_OF||(LA23_396 >= KW_ORDER && LA23_396 <= KW_OUTER)||LA23_396==KW_PARTITION||LA23_396==KW_PERCENT||LA23_396==KW_PRIMARY||LA23_396==KW_PROCEDURE||LA23_396==KW_RANGE||LA23_396==KW_READS||(LA23_396 >= KW_REFERENCES && LA23_396 <= KW_REGEXP)||LA23_396==KW_REVOKE||(LA23_396 >= KW_RIGHT && LA23_396 <= KW_RLIKE)||(LA23_396 >= KW_ROLLUP && LA23_396 <= KW_ROWS)||LA23_396==KW_SET||LA23_396==KW_SMALLINT||LA23_396==KW_TABLE||LA23_396==KW_TIMESTAMP||LA23_396==KW_TO||(LA23_396 >= KW_TRIGGER && LA23_396 <= KW_TRUNCATE)||LA23_396==KW_UNION||LA23_396==KW_UPDATE||(LA23_396 >= KW_USER && LA23_396 <= KW_USING)||LA23_396==KW_VALUES||LA23_396==KW_WITH) ) {s = 479;}
						 
						input.seek(index23_396);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA23_425 = input.LA(1);
						 
						int index23_425 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_425);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA23_426 = input.LA(1);
						 
						int index23_426 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_426);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA23_427 = input.LA(1);
						 
						int index23_427 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_427);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA23_429 = input.LA(1);
						 
						int index23_429 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_429);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA23_430 = input.LA(1);
						 
						int index23_430 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_430);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA23_431 = input.LA(1);
						 
						int index23_431 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_431);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA23_433 = input.LA(1);
						 
						int index23_433 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_433);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA23_434 = input.LA(1);
						 
						int index23_434 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_434);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA23_435 = input.LA(1);
						 
						int index23_435 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_435);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA23_437 = input.LA(1);
						 
						int index23_437 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_437);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA23_438 = input.LA(1);
						 
						int index23_438 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_438);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA23_439 = input.LA(1);
						 
						int index23_439 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_439);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA23_441 = input.LA(1);
						 
						int index23_441 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_441);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA23_442 = input.LA(1);
						 
						int index23_442 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_442);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA23_443 = input.LA(1);
						 
						int index23_443 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_443);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA23_445 = input.LA(1);
						 
						int index23_445 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_445);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA23_446 = input.LA(1);
						 
						int index23_446 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_446);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA23_447 = input.LA(1);
						 
						int index23_447 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_447);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA23_449 = input.LA(1);
						 
						int index23_449 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_449);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA23_450 = input.LA(1);
						 
						int index23_450 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_450);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA23_451 = input.LA(1);
						 
						int index23_451 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_451);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA23_453 = input.LA(1);
						 
						int index23_453 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_453);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA23_454 = input.LA(1);
						 
						int index23_454 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_454);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA23_455 = input.LA(1);
						 
						int index23_455 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_455);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA23_457 = input.LA(1);
						 
						int index23_457 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_457);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA23_458 = input.LA(1);
						 
						int index23_458 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_458);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA23_459 = input.LA(1);
						 
						int index23_459 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_459);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA23_461 = input.LA(1);
						 
						int index23_461 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_461);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA23_462 = input.LA(1);
						 
						int index23_462 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_462);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA23_463 = input.LA(1);
						 
						int index23_463 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_463);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA23_465 = input.LA(1);
						 
						int index23_465 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_465);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA23_466 = input.LA(1);
						 
						int index23_466 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_466);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA23_467 = input.LA(1);
						 
						int index23_467 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 476;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index23_467);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA23_469 = input.LA(1);
						 
						int index23_469 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_469);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA23_470 = input.LA(1);
						 
						int index23_470 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_470);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA23_471 = input.LA(1);
						 
						int index23_471 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_471);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA23_473 = input.LA(1);
						 
						int index23_473 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_473);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA23_474 = input.LA(1);
						 
						int index23_474 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_474);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA23_475 = input.LA(1);
						 
						int index23_475 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_475);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA23_477 = input.LA(1);
						 
						int index23_477 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_477);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA23_478 = input.LA(1);
						 
						int index23_478 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_478);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA23_479 = input.LA(1);
						 
						int index23_479 = input.index();
						input.rewind();
						s = -1;
						if ( ((synpred2_SelectClauseParser()&&(useSQL11ReservedKeywordsForIdentifier()))) ) {s = 476;}
						else if ( ((useSQL11ReservedKeywordsForIdentifier())) ) {s = 5;}
						 
						input.seek(index23_479);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA26_eotS =
		"\121\uffff";
	static final String DFA26_eofS =
		"\121\uffff";
	static final String DFA26_minS =
		"\1\32\1\uffff\3\61\1\52\2\61\1\uffff\1\52\107\uffff";
	static final String DFA26_maxS =
		"\1\u0216\1\uffff\6\u0146\1\uffff\1\u0146\107\uffff";
	static final String DFA26_acceptS =
		"\1\uffff\1\1\11\uffff\1\2\105\uffff";
	static final String DFA26_specialS =
		"\121\uffff}>";
	static final String[] DFA26_transitionS = {
			"\10\1\1\uffff\17\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\7\3\1\1\uffff\2"+
			"\1\1\uffff\4\1\1\uffff\3\1\1\uffff\1\1\1\uffff\4\1\1\uffff\20\1\1\uffff"+
			"\1\2\3\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\10\1\1\uffff\4\1"+
			"\1\uffff\1\1\1\uffff\4\1\1\uffff\2\1\1\uffff\13\1\1\uffff\5\1\1\uffff"+
			"\6\1\1\uffff\13\1\2\uffff\6\1\1\uffff\4\1\1\uffff\5\1\2\uffff\1\1\1\uffff"+
			"\1\4\4\1\1\uffff\2\1\1\uffff\1\3\4\1\2\uffff\5\1\1\11\5\1\1\uffff\17"+
			"\1\1\uffff\2\1\1\5\3\1\1\uffff\14\1\1\6\2\1\1\uffff\7\1\1\uffff\3\1\1"+
			"\uffff\6\1\1\uffff\4\1\1\uffff\3\1\1\uffff\15\1\1\uffff\1\1\2\uffff\1"+
			"\1\1\uffff\4\1\16\uffff\1\13\172\uffff\1\1\3\uffff\1\1\60\uffff\1\1\3"+
			"\uffff\1\1\27\uffff\1\1\3\uffff\1\1",
			"",
			"\1\13\6\uffff\1\1\50\uffff\1\1\140\uffff\1\1\10\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\20\uffff\1\1\104\uffff\1\1",
			"\1\13\6\uffff\1\1\50\uffff\1\1\140\uffff\1\1\10\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\20\uffff\1\1\104\uffff\1\1",
			"\1\13\6\uffff\1\1\50\uffff\1\1\140\uffff\1\1\10\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\20\uffff\1\1\104\uffff\1\1",
			"\1\13\15\uffff\1\1\21\uffff\1\13\26\uffff\1\1\140\uffff\1\1\10\uffff"+
			"\1\1\13\uffff\1\1\30\uffff\1\1\20\uffff\1\1\32\uffff\1\13\44\uffff\1"+
			"\13\4\uffff\1\1",
			"\1\13\6\uffff\1\1\50\uffff\1\1\140\uffff\1\1\10\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\20\uffff\1\1\104\uffff\1\1",
			"\1\13\6\uffff\1\1\50\uffff\1\1\140\uffff\1\1\10\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\20\uffff\1\1\104\uffff\1\1",
			"",
			"\1\13\15\uffff\1\1\21\uffff\1\13\26\uffff\1\1\140\uffff\1\1\10\uffff"+
			"\1\1\13\uffff\1\1\30\uffff\1\1\20\uffff\1\1\32\uffff\1\13\44\uffff\1"+
			"\13\4\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "185:26: ( identifier )?";
		}
	}

	public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0x6F7BFFFBFC04A080L,0xAF7FBD5FFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEFFEEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_hintClause_in_selectClause73 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5FFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEFFEEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800010000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STAR_in_hintClause422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_hintClause424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_hintList_in_hintClause426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STAR_in_hintClause428 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DIVIDE_in_hintClause430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintItem_in_hintList469 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_hintList472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_hintItem_in_hintList474 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_hintName_in_hintItem512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_hintItem515 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_hintArgs_in_hintItem517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_hintItem519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs610 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_hintArgs613 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_hintArgName_in_hintArgs615 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_identifier_in_hintArgName657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectItem694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectItem716 = new BitSet(new long[]{0x6F4BFFFBFC000002L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem726 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_selectItem729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_selectItem737 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_selectItem739 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_selectItem742 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_selectItem744 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_selectItem748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_trfmClause803 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800010000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause818 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800010000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_recordWriter_in_trfmClause834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_USING_in_trfmClause840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_StringLiteral_in_trfmClause842 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_KW_AS_in_trfmClause850 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_LPAREN_in_trfmClause854 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_trfmClause864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800008000000L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_recordReader_in_trfmClause890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectExpression959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectExpression971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList1002 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_selectExpressionList1005 = new BitSet(new long[]{0x6F7BFFFBFC042080L,0xAF7FBD5EFFFF7AEFL,0x3FF7F7FF7EFFFFF7L,0xFFEFDFFFDFFCFB7DL,0x48F4BFFEEF7EEFEFL,0x0000000000007C06L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList1007 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_KW_WINDOW_in_window_clause1046 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1048 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_window_clause1051 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause1053 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_identifier_in_window_defn1089 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_KW_AS_in_window_defn1091 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x08F4BFFEEF7EEFEFL,0x0000000000000000L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_window_specification_in_window_defn1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_window_specification1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_window_specification1135 = new BitSet(new long[]{0x6F4BFFFBFC000000L,0xAF7FBD5EFFFF7AEFL,0x3EF7E7FF7EFBFFB7L,0xFFEFDFFFDFFCFB7DL,0x00F4BFFEEF7EEFEFL,0x0000000000000040L,0x0000000000000000L,0x0440000000000022L,0x0000000000440000L});
	public static final BitSet FOLLOW_identifier_in_window_specification1137 = new BitSet(new long[]{0x0100000000000000L,0x0000000200000000L,0x0000000000000000L,0x0001000000800804L,0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_partitioningSpec_in_window_specification1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000800000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_window_frame_in_window_specification1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_window_specification1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_range_expression_in_window_frame1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_value_expression_in_window_frame1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression1218 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1224 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_range_expression1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1282 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1288 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_value_expression1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1395 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_boundary1437 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser954 = new BitSet(new long[]{0x0000000000000002L});
}
