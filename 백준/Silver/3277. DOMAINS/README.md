# [Silver IV] DOMAINS - 3277

[문제 링크](https://www.acmicpc.net/problem/3277)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 68, 맞힌 사람: 59, 정답 비율: 74.684%

### 분류

자료 구조, 문자열, 집합과 맵, 트리를 사용한 집합과 맵, 파싱

### 문제 설명

<p>Dave likes to surf on Internet and visit many interesting web sites. He stores addresses of web pages he visited in a file.</p>

<p>Make a program that will help Dave to determine the most often visited domains. Also, the program should find how often Dave visited them.</p>

### 입력

<p>The first line of input file contains a natural number N, 1 &le; N &le; 100, the number of addresses.</p>

<p>Each of the following N lines contains one simplified address. A simplified address may begin with a prefix &#39;<code>http://</code>&#39;, after which comes one or more words separated with dot (&#39;<code>.</code>&#39;). That part of an address represents a name of a computer. After that may came a path consisting of character &#39;<code>/</code>&#39; followed by one or more words also separated with character &#39;<code>/</code>&#39;. Each word is a sequence of one or more small letters of English alphabet (<code>a&ndash;z</code>). Domain name is the last word in a name of a computer and consists of three characters at most.</p>

<p>Every address will consist of 50 characters at most.</p>

### 출력

<p>The first line of output file should contain the number of visits to the most often visited domain(s).</p>

<p>The second line should contain all the most often visited domains in any order. Every two domains should be separated by one space character.</p>