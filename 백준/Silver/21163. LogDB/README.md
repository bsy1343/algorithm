# [Silver I] LogDB - 21163

[문제 링크](https://www.acmicpc.net/problem/21163)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 16, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>A LogDB database is filled with facts. A fact is a name with a body consisting of a parenthesized list of names. This is &nbsp;similar to a function call:&nbsp;</p>

<p>\[ fact1(arg1, arg2 ,arg\_3,4,4) thing(p1,arg2,p3). \]</p>

<p>$fact1$ is the name of the fact and the list of names in the body are the arguments of the fact. $thing$ is another fact.</p>

<p>The names in the list are separated by commas and optional whitespace. There will be at least one name in the list.</p>

<p>Names consist of alphanumeric characters (a-z,A-Z,0-9) plus &#39;$\_$&#39;. However, the name of a fact and the names in the body cannot start with an &#39;$\_$&#39;.</p>

<p>Names, parentheses, and commas may be preceded and followed by whitespace. However a fact or query cannot be split across lines.</p>

<p>Facts with different numbers of arguments are different facts.</p>

<p>A fact may appear multiple times in the database.</p>

<p>Queries are like facts except the argument list can contain variables. Variables are names that start with &#39;$\_$&#39;. &nbsp;</p>

<p>A query searches the database for facts with the same name as the query that have the same number of arguments as the query and where the names in the fact body match the names in the query body in their respective positions.</p>

<p>A variable consisting of only &#39;$\_$&#39; is special and will match any name.</p>

<p>A variable other than &#39;$\_$&#39; will also match any name but if that variable appears more than once in a query, the names in the fact must be the same.</p>

<p>A query: \[ fact1(arg1,\_,\_,\_check,\_check) \]</p>

<p>will match $fact1(arg1, arg2 ,arg\_3,4,4)$.</p>

<p>Variables are only defined in the query they appear in. They are not necessarily related if they are in different queries.</p>

### 입력

<p>The input consists of two sections: facts and queries. Judged data has no syntax errors.</p>

<p>The fact section consists of a series of lines of at most $200$ characters. That section is terminated by a blank line. Each line consists of facts which may (or may not) be separated by whitespace. The fact section will consist of no more than $200$ lines.</p>

<p>The query section consists of a series of lines of at most $200$ characters. That section is terminated by end-of-file. &nbsp;Each line is a query. The query section will consist of no more than $200$ lines.</p>

### 출력

<p>For each query print the number of facts returned by the query as an integer with no leading or trailing whitespace and no unnecessary leading zeros. If a matching fact appears multiple times in the database, count each occurrence.</p>