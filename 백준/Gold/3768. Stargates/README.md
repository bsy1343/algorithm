# [Gold II] Stargates - 3768

[문제 링크](https://www.acmicpc.net/problem/3768)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>&quot;A Long Time Ago, in a Galaxy Far, Far Away...&quot; one advanced civilization discovered a manner of instant traveling between solar systems. Since that moment, they have devoted all their efforts to constructing pairs of stargates that connect distant planets. Soon enough communication network became so complex that they require help to maintain information about the connected worlds.</p>

<p>Write a program that will help them maintain information about the connected systems and we will make sure that the best of your solutions will be forwarded to their space-time continuum. Planets A and B are connected if there is a direct stargate connection between them, or there is a planet sequence P<sub>1</sub>, P<sub>2</sub>, ..., P<sub>n</sub> where P<sub>1</sub>=A, P<sub>n</sub>=B and there is a direct stargate connection between P<sub>k</sub> and P<sub>k-1</sub>, k &isin; {2..n} . Connections are bidirectional. There can be multiple connection paths between two planets.</p>

### 입력

<p>Input file consist of multiple data sets. Each data set occupies one or more lines. There are no empty lines in the input file. Each line starts with a single letter &lsquo;D&rsquo;, &lsquo;C&rsquo; or &lsquo;Q&rsquo; (upper or lower case) followed by 1 to 5 integers with following meaning:</p>

<ul>
	<li>&lsquo;D&rsquo; (define) has only one argument which defines number of planets N considered in following data set (N&lt;=6000000, planets are numerated from 1..N).</li>
	<li>&lsquo;C&rsquo; (connect) creates a connection between a given pair(s) of planets.</li>
	<li>&lsquo;Q&rsquo; (query) examines if a given pair(s) of planets are connected.</li>
</ul>

<p>Both &lsquo;C&rsquo; and &lsquo;Q&rsquo; command (&lsquo;X&rsquo; in following text) share the same syntax:</p>

<ul>
	<li>X src dst &ndash; Creates a connection (or query) between given pair of planets (src, dst).</li>
	<li>X src dst nnn &ndash; Creates a connection (or query) between src planet and nnn consecutive planets numerated from dst.</li>
</ul>

<p>Example: X 1 100 3 creates following links (1,100), (1,101), (1,102).</p>

<ul>
	<li>X src dst nnn step &ndash; Creates a connection (or query) between src planet and nnn planets numerated from dst with given step.</li>
</ul>

<p>Example: X 1 100 3 5 creates following links (1,100), (1,105), (1,110).</p>

<ul>
	<li>X src dst nnn dststep srcstep &ndash; Creates a connection (or query) between nnn pairs of planets numerated from src with srcstep and dst with dststep respectively.</li>
</ul>

<p>Example: X 1 100 3 5 15 creates following links (1,100), (16,105), (31,110).</p>

### 출력

<p>Output file contains one line pre each query (&lsquo;Q&rsquo;) line in the input file. Each line contains two numbers separated by space dash space sequence. First value represents number of connected planet pairs from appropriate query while second represents number of disconnected planet pairs.</p>