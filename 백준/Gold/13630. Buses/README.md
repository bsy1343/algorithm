# [Gold II] Buses - 13630

[문제 링크](https://www.acmicpc.net/problem/13630)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 24, 맞힌 사람: 19, 정답 비율: 86.364%

### 분류

조합론, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Programming competitions usually require infrastructure and organization on the part of those responsible. A problem that frequently must be solved is regarding transportation. While participating in a recent competition, Ricardinho watched the buses and micro-buses used in the transportation of competitors, all lined up one behind the other as competitors disembarked. The vehicles were all from the same company, although had different paintings. Ricardinho began to wonder how many ways that line could be formed using buses and minibuse from that company.</p>

<p>Each bus is 10 meters long, each minibus is 5 meters long. Given the total length of a line of buses and minibuses, and the number of different colors each buse or minibus may be painted, Ricardinho wants to know in how many ways such a line can be formed.</p>

### 입력

<p>The input contains a single line, containing three integers N, K and L, representing respectively the total length, in meters, of the line Ricky is considering, K indicates the number of different colors for micro-buses, and L represents the number of different colors for buses. Note that, as integers N, K and L may be very large, the use of 64 bits integers is recommended.</p>

<p>Restrictions</p>

<ul>
	<li>5 &le; N &le; 10<sup>15</sup> and N is multiple of 5</li>
	<li>1 &le; K &le; 10<sup>15</sup></li>
	<li>1 &le; L &le; 10<sup>15</sup></li>
</ul>

### 출력

<p>As the number of different ways of forming the line can be very large, Ricardinho is interested in the last 6 digits of that quantity. Thus, your program should produce a single line containing exactly 6 digits, corresponding to the last digits of the solution.</p>