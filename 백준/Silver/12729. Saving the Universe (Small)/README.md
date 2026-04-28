# [Silver II] Saving the Universe (Small) - 12729

[문제 링크](https://www.acmicpc.net/problem/12729)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 191, 정답: 78, 맞힌 사람: 74, 정답 비율: 45.679%

### 분류

비트마스킹, 그리디 알고리즘, 문자열

### 문제 설명

<p>The urban legend goes that if you go to the Google homepage and search for &quot;Google&quot;, the universe will implode. We have a secret to share... It is true! Please don&#39;t try it, or tell anyone. All right, maybe not. We are just kidding.</p>

<p>The same is not true for a universe far far away. In that universe, if you search on any search engine for that search engine&#39;s name, the universe does implode!</p>

<p>To combat this, people came up with an interesting solution. All queries are pooled together. They are passed to a central system that decides which query goes to which search engine. The central system sends a series of queries to one search engine, and can switch to another at any time. Queries must be processed in the order they&#39;re received. The central system must never send a query to a search engine whose name matches the query. In order to reduce costs, the number of switches should be minimized.</p>

<p>Your task is to tell us how many times the central system will have to switch between search engines, assuming that we program it optimally.</p>

### 입력

<p>The first line of the input file contains the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>Each case starts with the number&nbsp;<strong>S</strong>&nbsp;-- the number of search engines. The next&nbsp;<strong>S</strong>&nbsp;lines each contain the name of a search engine. Each search engine name is no more than one hundred characters long and contains only uppercase letters, lowercase letters, spaces, and numbers. There will not be two search engines with the same name.</p>

<p>The following line contains a number&nbsp;<strong>Q</strong>&nbsp;-- the number of incoming queries. The next&nbsp;<strong>Q</strong>lines will each contain a query. Each query will be the name of a search engine in the case.</p>

<p>Limits</p>

<ul>
	<li>0 &lt;&nbsp;<strong>N</strong>&nbsp;&le; 20</li>
	<li>2 &le;&nbsp;<strong>S</strong>&nbsp;&le; 10</li>
	<li>0 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 100</li>
</ul>

### 출력

<p>For each input case, you should output:</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the number of search engine switches. Do not count the initial choice of a search engine as a switch.</p>

### 힌트

<p>In the first case, one possible solution is to start by using Dont Ask, and switch to NSM after query number 8.<br />
For the second case, you can use B9, and not need to make any switches.</p>