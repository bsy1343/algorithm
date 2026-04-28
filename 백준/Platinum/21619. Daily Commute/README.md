# [Platinum V] Daily Commute - 21619

[문제 링크](https://www.acmicpc.net/problem/21619)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 22, 맞힌 사람: 17, 정답 비율: 53.125%

### 분류

자료 구조, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 너비 우선 탐색, 최단 경로, 해시를 사용한 집합과 맵, 데이크스트라, 트리를 사용한 집합과 맵, 우선순위 큐

### 문제 설명

<p>Toronto has N subway stations, numbered from 1 to N. You start at station 1, and every day, you need to reach station N to get to school.</p>

<p>There are W <em>one-way</em> walkways running amongst the stations, the i<sup>th</sup> of which allows you to walk from station A<sub>i</sub> to a different station B<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N, A<sub>i</sub> &ne; B<sub>i</sub>) in 1 minute. There may be multiple walkways connecting any given pair of stations.</p>

<p>The subway line follows a certain route through the N stations, starting at station 1 and visiting each station once. Initially, this route consists of stations S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>N</sub>, in that order. S<sub>1</sub> = 1, and S<sub>2</sub>, . . . , S<sub>N</sub> is a permutation of the integers 2, . . . , N. Only one subway train runs along this route per day, departing from station 1 at 6am in the morning and taking 1 minute to reach each subsequent station. This means that, m minutes after 6am, the train will be at station S<sub>m+1</sub> (or at station S<sub>N</sub> if m &ge; N &minus; 1).</p>

<p>Over a period of D days, however, the subway line&rsquo;s route will keep changing. At the start of the i<sup>th</sup> day, the X<sub>i</sub><sup>th</sup> station and Y<sub>i</sub><sup>th</sup> station (2 &le; X<sub>i</sub>, Y<sub>i</sub> &le; N, X<sub>i</sub> &ne;&nbsp;Y<sub>i</sub>) in the route will be swapped. Note that, after each such change, the route will still begin at station 1 and will visit all N stations once each. Changes will carry over to subsequent days &ndash; the route will not automatically reset itself back to S<sub>1</sub>, . . . , S<sub>N</sub>.</p>

<p>On each of these D days, you&rsquo;d like to determine how quickly you can get to school so you can begin learning things. On the i<sup>th</sup> day, starting at 6am in the morning (after the i<sup>th</sup> update to the subway line&rsquo;s route), you&rsquo;ll begin your daily trip to station N. Each minute, you may either ride the subway to its next stop (if you&rsquo;re currently at the same station as the train and it hasn&rsquo;t already completed its route), take a walkway from your current station to another one, or wait at your current station. Note that your trip begins at the same time as the train&rsquo;s route, meaning that you may choose to immediately ride it if you&rsquo;d like to, and that you may choose to leave and then get back on the train during your trip.</p>

### 입력

<p>The first line contains three space-separated integers, N, W, and D.</p>

<p>The next W lines each contain two space-separated integers, A<sub>i</sub> and B<sub>i</sub> (1 &le; i &le; W).</p>

<p>The next line contains the N space-separated integers, S<sub>1</sub>, . . . , S<sub>N</sub>, which form the initial permutation of stations.</p>

<p>The next D lines each contain two space-separated integers, X<sub>i</sub> and Y<sub>i</sub> (1 &le; i &le; D).</p>

### 출력

<p>The output is D lines, with one integer per line. The i<sup>th</sup> line is the minimum number of minutes required to reach station N on the i<sup>th</sup> day (1 &le; i &le; D).</p>

### 제한

<ul>
	<li>3 &le; N &le; 200 000</li>
	<li>0 &le; W &le; 200 000</li>
	<li>1 &le; D &le; 200 000</li>
</ul>