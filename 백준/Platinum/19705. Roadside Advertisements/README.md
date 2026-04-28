# [Platinum I] Roadside Advertisements - 19705

[문제 링크](https://www.acmicpc.net/problem/19705)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 18, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

그래프 이론, 트리, 최소 스패닝 트리, 최소 공통 조상, Heavy-light 분할

### 문제 설명

<p>Singapore National Olympiad in Informatics (SG NOI) celebrates its 20-th version in year 2017 (this year). This year, we are grateful to have FIVE (5) different sponsors (in alphabetical order): Garena, IMDA, Lee Foundation, Micron, and the organizer+sponsor: School of Computing (SoC).</p>

<p>Associate Professor Tan Sun Teck, the SG NOI chairman, wants to put roadside advertisements on roads connecting these 5 sponsors. He would like to ensure that any person affiliated with SG NOI will see an SG NOI-related advertisement on every road they traverse whenever they travel between their offices (e.g. for the important weekly NOI meetings). Thus, any road on the shortest path connecting any pair of the 5 sponsors should have a roadside advertisement installed.</p>

<p>For each road in Singapore, the cost of putting an advertisement on that road is known in advance. The overall cost of this advertising campaign is the sum of these costs. Prof Tan wants to find the minimum cost required to achieve his objective.</p>

<p>By the way, the roads in <em>this version of Singapore</em> have an interesting property where there is exactly one possible path between any two landmarks in Singapore.</p>

### 입력

<p>The first line of input contains one positive integer V.</p>

<p>The next V &minus; 1 lines of input will each contain 3 integers: u, v, w that denotes that landmark u and landmark v in Singapore are connected with a road and installing a roadside advert in this road costs w SGD.</p>

<p>It is guaranteed that 0 &le; u, v &lt; V and 1 &le; w &le; 1 000.</p>

<p>Then, there will be another line with one positive integer Q, denoting the number of queries. Afterwards, there will be Q lines with 5 integers each, denoting the location of the 5 sponsors of SG NOI: landmarks {a, b, c, d, e}.</p>

<p>It is guaranteed that a, b, c, d and e are pairwise different.</p>

### 출력

<p>For each query, your program must output one line with a single integer to standard output: the minimum cost for Prof Tan&rsquo;s roadside advertisement campaign.</p>

### 제한

<ul>
	<li>5 &le; V &le; 50 000</li>
	<li>1 &le; Q &le; 10 000</li>
</ul>