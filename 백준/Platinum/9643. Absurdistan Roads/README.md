# [Platinum III] Absurdistan Roads - 9643

[문제 링크](https://www.acmicpc.net/problem/9643)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 105, 정답: 32, 맞힌 사람: 25, 정답 비율: 30.488%

### 분류

그래프 이론, 그리디 알고리즘, 해 구성하기, 최단 경로, 최소 스패닝 트리

### 문제 설명

<p>The people of Absurdistan discovered how to build roads only last year. After the discovery, every city decided to build their own road connecting their city with another city. Each newly built road can be used in both directions.</p>

<p>Absurdistan is full of surprising coincidences. It took all N cities precisely one year to build their roads. And even more surprisingly, in the end it was possible to travel from every city to every other city using the newly built roads.</p>

<p>You bought a tourist guide which does not have a map of the country with the new roads. It only contains a huge table with the shortest distances between all pairs of cities using the newly built roads. You would like to know between which pairs of cities there are roads and how long they are, because you want to reconstruct the map of the N newly built roads from the table of shortest distances.</p>

<p>You get a table of shortest distances between all pairs of cities in Absurdistan using the N roads built last year. From this table, you must reconstruct the road network of Absurdistan. There might be multiple road networks with N roads with that same table of shortest distances, but you are happy with any one of those networks.</p>

### 입력

<p>For each test case:</p>

<ul>
	<li>A line containing an integer N (2 &le; N &le; 2000) &ndash; the number of cities and roads.</li>
	<li>N lines with N numbers each. The j-th number of the i-th line is the shortest distance from city i to city j. All distances between two distinct cities will be positive and at most 1 000 000. The distance from i to i will always be 0 and the distance from i to j will be the same as the distance from j to i.</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>Print N lines with three integers &lsquo;a b c&rsquo; denoting that there is a road between cities 1 &le; a &le; N and 1 &le; b &le; N of length 1 &le; c &le; 1 000 000, where a &ne; b. If there are multiple solutions, you can print any one and you can print the roads in any order. At least one solution is guaranteed to exist.</li>
</ul>

<p>Print a blank line between every two test cases.</p>