# [Platinum I] Logistics - 18360

[문제 링크](https://www.acmicpc.net/problem/18360)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 32, 맞힌 사람: 24, 정답 비율: 57.143%

### 분류

값 / 좌표 압축, 자료 구조, 그리디 알고리즘, 오프라인 쿼리, 세그먼트 트리

### 문제 설명

<p>Byteasar owns a logistics company. Its clients often have the company transport vast amounts of goods, which do not fit in a single truck. In such cases, Byteasar sends a convoy. Sometimes, there are more drivers than trucks in a convoy, with the spare drivers riding along as passengers. We assume that each truck can carry arbitrarily many passengers. The drivers can choose to stop the convoy at any moment. Before resuming the journey, the drivers can embark any of the trucks, and change behind the wheel. There are neither lower nor upper bounds on the number of stops along the way.</p>

<p>To increase road traffic safety, the Byteotian Ministry of Transport has mandated limits on the time a truck driver can spend behind the wheel. Each driver, having passed their periodic psychophysical tests, receives an entry in their driving license that tells how many kilometers they can spend behind the wheel on a single trip.</p>

<p>Byteasar has asked you to write a program that would help him manage his team of n truck drivers. The program must handle the following two types of events:</p>

<ul>
	<li>Update of the entry in the i-th driver&rsquo;s license. We assume that no driver has any entry in their driving license initially. Before receiving one, a driver cannot drive a truck.</li>
	<li>A query regarding the possibility of sending a convoy of c trucks on a route that is s kilometers long. As mentioned before, en route, the drivers can ride as passengers, and can freely swap. The shipments are handled sequentially, i.e., the next convoy sets out only once the previous one has returned.</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers, n and m (1 &le; n, m &le; 1 000 000), separated by a single space, specifying the number of drivers and events respectively. The m lines that follow specify the events.</p>

<p>In case of an entry update, the line contains the letter U and two integers, k and a (1 &le; k &le; n, 0 &le; a &le; 1 000 000 000), indicating that the k-th driver can drive (behind the wheel) a kilometers in one trip from this point on. In case of a query, the line contains the letter Z and two integers, c and s (1 &le; c &le; n, 1 &le; s &le; 1 000 000 000), indicating a query about sending a convoy of c trucks on a route of s kilometers.</p>

<p>In tests worth 33% of the total score, the additional condition n, m &le; 1000 holds. In tests worth 66% of the total score, the additional condition a, s &le; 1 000 000 holds.</p>

### 출력

<p>If the input contains z queries, then z lines should be printed to the standard output: the i-th one should contain the word TAK (Polish for YES) or NIE (Polish for NO), depending on the answer to the i-th input query.</p>