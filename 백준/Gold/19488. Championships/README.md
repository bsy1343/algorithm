# [Gold II] Championships - 19488

[문제 링크](https://www.acmicpc.net/problem/19488)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 83, 정답: 44, 맞힌 사람: 38, 정답 비율: 50.000%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 그래프 탐색, 정렬, 깊이 우선 탐색, 분리 집합

### 문제 설명

<p>The Computer Sports World Championships is the most important event in the calendar of every electronic entertainment fan. This year, the championships will be held in the kingdom of Byteotia. The organizing committee, appointed by the king Byteasar, is facing a difficult task -- it has to decide in which Byteotian cities competitions will take place. There are $n$ cities in Byteotia (numbered $1$ through $n$) connected by $m$ two-way roads.</p>

<p>The committee hopes that the championship will attract crowds of fans from all over the world. Obviously, the fans will travel frequently between the cities to watch the competitions of various e-sport types. The priority is therefore that the set of cities, hosting the championships events, is <em>well connected</em>.</p>

<p>We call a set of cities $S$ well connected, if:</p>

<ol>
	<li>From every city of the set $S$ there are at least $d$ direct connections to other cities of $S$.</li>
	<li>Between any two cities of $S$ there exists a route running only through the cities belonging to the set $S$.</li>
</ol>

<p>Additionally, to minimize the average number of visitors in each city, the committee would prefer the chosen set to be possibly large.</p>

### 입력

<p>The first line of the input contains three integers $n$, $m$ and $d$ ($2\leq n\leq 200\,000$, $1\leq m\leq 200\,000$, $1\leq d &lt; n$) denoting the the number of cities, the number of roads in Byteotia and the parameter $d$, respectively. Next $m$ lines describe the Byteotian roads. The $i$-th of these lines contains two integers $a_i$ and $b_i$ ($1\leq a_i,b_i\leq n$, $a_i\neq b_i$) indicating that the $i$-th road connects the cities numbered $a_i$ and $b_i$. Each pair of cities is connected by at most one direct road.</p>

### 출력

<p>If it is not possible to choose a set of cities of Byteotia that is well connected, the only line of the output should contain the word &quot;<code>NIE</code>&quot; (Polish for <em>no</em>).</p>

<p>Otherwise, the output should contain the most numerous set of cities that is well connected, in the following format. The first line should contain the number $k$ denoting the size of the found set. The second line should contain $k$ numbers representing the cities belonging to the set, in ascending order.</p>

<p>In case there are multiple solutions, your program can output any of them.</p>