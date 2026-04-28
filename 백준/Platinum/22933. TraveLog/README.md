# [Platinum IV] TraveLog - 22933

[문제 링크](https://www.acmicpc.net/problem/22933)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 215, 정답: 55, 맞힌 사람: 46, 정답 비율: 25.989%

### 분류

다이나믹 프로그래밍, 그래프 이론, 이분 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>After a long time apart, Alice and Bob have reunited. They live in a country with $n$ cities, creatively named city $1$ to city $n$. Bob drove from his home in city $1$ to Alice&#39;s home in city $n$.</p>

<p>When Alice asked Bob which path he took, he was stunned to find he didn&#39;t remember. Bob is efficient, and drove without stopping, and knows there is no path faster than the one he took. He also has a brand new National Adventuring Company (NAC) TraveLog! Every time Bob drives through a city, the TraveLog records the time between when he left city $1$ and when he arrived in the current city.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3c8a7bfa-7c22-4c69-9a45-af71d66f8496/-/preview/" /></p>

<p>In the above layout, there are two possible fastest paths Bob can take from city $1$ to city $n$: $1 \to 2 \to 3 \to 5$ or $1 \to 4 \to 5$. Both paths take a total of $9$ units of time. The first path would have a TraveLog of $0, 3, 7, 9$, and the second would have a TraveLog of $0, 5, 9$.</p>

<p>Unfortunately, the memory in Bob&#39;s TraveLog is corrupted. Bob thinks that some of the times are gone, and the remaining times are shuffled arbitrarily. Given what remains of the TraveLog, can you reconstruct Bob&#39;s path?</p>

### 입력

<p>The first line of input contains three integers $n$ ($2 \le n \le 2 \cdot 10^{5}$), $m$ ($1 \le m \le 3 \cdot 10^{5}$) and \mbox{$d$ ($1 \le d \le n$)}, where $n$ is the number of cities in the country, $m$ is the number of one-way roads between those cities, and $d$ is the number of times remaining in Bob&#39;s corrupted TraveLog. The cities are identified by number, $1$ through $n$. Bob lives in city $1$, and Alice lives in city $n$.</p>

<p>Each of the next $m$ lines contains three integers $u$, $v$ ($1 \le u,v \le n, u \ne v$) and $h$ ($1 \le h \le 10^{6}$). Each line describes a one-way road from city $u$ to city $v$ that takes $h$ units of time to traverse. There is guaranteed to be at least one path from city $1$ to city $n$. There may be several roads between any given pair of cities.</p>

<p>Each of the next $d$ lines contains a single integer $t$ ($0 \le t \le 10^{18}$). This is what remains of Bob&#39;s TraveLog. Each line is a record of the amount of time Bob took driving from city $1$ to another city on his path. These values are guaranteed to be distinct.</p>

### 출력

<p>The output format depends on the number of paths consistent with Bob&#39;s TraveLog.</p>

<ul>
	<li>If there is no path consistent with Bob&#39;s TraveLog, output $0$.</li>
	<li>If multiple paths are consistent with Bob&#39;s TraveLog, output $1$.</li>
	<li>Otherwise, on the first line, output the number of cities on Bob&#39;s path. On subsequent lines, output the cities Bob visited, one per line, in the order he visited them.</li>
</ul>