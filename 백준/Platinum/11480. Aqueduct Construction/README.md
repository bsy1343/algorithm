# [Platinum III] Aqueduct Construction - 11480

[문제 링크](https://www.acmicpc.net/problem/11480)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 72, 정답: 18, 맞힌 사람: 16, 정답 비율: 23.188%

### 분류

최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p>After conquering Britannia, the great Roman general Agricola decided all of his new cities should take advantage of the natural springs found aplenty. He appointed his advisor Wessus Waterus to try to find a way to get each town a fresh supply of water.</p>

<p>There are many springs and many towns and between each are the natural hills and valleys of Roman Britain. Wessus doesn&rsquo;t want to waste the Imperial coin. He has been tasked with linking each town to a spring by a series of aqueducts using as little material as possible. Water, as we know, only flows downhill so any aqueduct must go from a higher point to a lower; intervening hills, springs and towns are no problem since they can be tunnelled through and on. The only requirement is that all aqueduct components start and end on hilltops.</p>

<p>Any spring must only serve one town, but the Romans are clever enough to find a way for aqueducts to pass each other. Roman engineering is excellent, but has its limits: aqueducts can only be of a limited length.</p>

### 입력

<ul>
	<li>One line containing four integers: n, s, t and q where 0 &lt; n &le; 500 is the number of hills, 1 &le; s &le; 40 is the number of springs, 1 &le; t &le; s is the number of towns and q (1 &le; q &le; 3 &times; 10<sup>6</sup>) is the maximum aqueduct length.</li>
	<li>N more lines, each giving the space-separated integers x<sub>i</sub>, y<sub>i</sub>, h<sub>i</sub>: the coordinates and height of a hill (0 &le; |x|, |y|, h &le; 10<sup>6</sup>). These hills are numbered 1 to n in the order given.</li>
	<li>One line containing s space-separated integers i<sub>j</sub> (1 &le; i<sub>j</sub> &le; n), each representing the number of a hill on which a spring can be found.</li>
	<li>One line containing t space-separated integers i<sub>j</sub> (1 &le; i<sub>j</sub> &le; n), each giving the number of a hill on which the town can be found.</li>
</ul>

<p>Each hill may only have at most one spring or one town.</p>

### 출력

<p>Output one line with one real number, denoting the minimum total length of all aqueducts needed to supply each town with fresh water from its own unique spring or IMPOSSIBLE if there is no way to achieve this. Your answer should be correct up to an absolute or relative precision of 10<sup>&minus;6</sup>.</p>