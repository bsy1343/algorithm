# [Platinum I] Minimalist Security - 8233

[문제 링크](https://www.acmicpc.net/problem/8233)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 162, 정답: 29, 맞힌 사람: 26, 정답 비율: 18.841%

### 분류

수학, 구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 많은 조건 분기, 깊이 우선 탐색

### 문제 설명

<p>A map of Mafiatown&#39;s road network is given. The network consists of intersections and bidirectional streets that connect them. The streets cross only at the intersections, but they may lead through tunnels or flyovers. Each pair of intersections is linked by at most one street. At every intersection v there is a police station manned by p(v) policemen. A street linking the intersections u and v is considered safe if there are at least b(u,v) &nbsp;policemen in total in the two stations at the streets ends. Initially p(u)+p(v) &ge; b(u,v) holds for every street.</p>

<p>However, due to an ongoing crisis the mayor Byteasar has ordained the Minimalist Security Act (MSA), which states that:</p>

<ul>
	<li>a certain number (which may be zero) of policemen is to be laid off from each police station (we denote the number of policemen laid off from the station at the intersection by z(v)),</li>
	<li>after the layoff, the total number of the policemen at both ends of every street connecting some two intersections, say u and v, should equal b(u,v) exactly, i.e.: p(u)-z(u)+p(v)-z(v)=b(u,v).</li>
</ul>

<p>These rules do not determine uniquely how many policemen are to be laid off. Byteasar wonders what is the minimum and the maximum number of laid off policemen (the sum of z values over all intersections) that complies with aforementioned rules.</p>

### 입력

<p>In the first line of the standard input there are two integers, n and m (1 &le; n &le; 500,000, 0 &le; m &le; 3,000,000), separated by a single space, that denote the number of intersections and the number of streets in Mafiatown, respectively. The intersections are numbered from 1 to n. In the second line n nonnegative integers separated by single spaces are given. These are the numbers of policemen currently employed at successive stations, i.e., the values p(1), p(2), ..., p(n) (0 &le; p(i) &le; 10<sup>6</sup>).</p>

<p>Each of the following m lines describes a single bidirectional street. Such description consists of three integers, u<sub>i</sub>, v<sub>i</sub>, b(u<sub>i</sub>,v<sub>i</sub>) (1 &le; u<sub>i</sub>,v<sub>i</sub> &le; n, u<sub>i</sub>&ne;v<sub>i</sub>, 0 &le; b(u<sub>i</sub>,v<sub>i</sub>) &le; 10<sup>6</sup>), separated by single spaces, that denote respectively: the numbers of the intersections at the ends of the street and the minimum total number of policemen that have to man the stations at those intersections.</p>

<p>In tests worth 56% of points the conditions n &le; 2,000 and m &le; 8,000 hold in addition.</p>

### 출력

<p>If Byteasar&#39;s ordinance can be carried out, your program should print, on the standard output, exactly one line with two integers separated by a single space. The numbers should be the minimum and the maximum number of policemen that should be laid off in order to carry out the ordinance.</p>

<p>If carrying out the ordinance is impossible, your program should print a single line containing the word NIE (Polish for no).</p>