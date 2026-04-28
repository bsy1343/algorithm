# [Platinum II] Radio Prize - 18152

[문제 링크](https://www.acmicpc.net/problem/18152)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 33, 맞힌 사람: 30, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>All boring tree-shaped lands are alike, while all exciting tree-shaped lands are exciting in their own special ways. What makes Treeland more exciting than the other tree-shaped lands are the raddest radio hosts in the local area: Root and Leaf. Every morning on FM 32.33 (repeating of course), Root and Leaf of The Full Depth Morning Show serve up the hottest celebrity gossip and traffic updates.</p>

<p>The region of Treeland is made of n cities, connected by n &minus; 1 roads such that between every pair of cities there is exactly one simple path. The ith road connects cities u<sub>i</sub> and v<sub>i</sub>, and has a toll of w<sub>i</sub>.</p>

<p>To reward their loyal listeners, The Full Depth Morning Show is giving away a number of travel packages! Root and Leaf will choose n &minus; 1 lucky residents from the city that sends them the most fan mail. Each of those residents then gets a distinct ticket to a different city in Treeland.</p>

<p>Each city in Treeland has its own tax on prizes: t<sub>i</sub>. Let d<sub>u,v</sub> be the sum of the tolls on each road on the only simple path from city u to v. For a trip from city u to city v, the cost of that trip is then (t<sub>u</sub> + t<sub>v</sub>)d<sub>u,v</sub>.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18152.%E2%80%85Radio%E2%80%85Prize/c6e68964.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18152.%E2%80%85Radio%E2%80%85Prize/c6e68964.png" data-original-src="https://upload.acmicpc.net/a2a1897b-8772-4f40-ab12-ce5f47b565c1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 456px; height: 142px;" /></p>

<p style="text-align: center;">Figure A.1: The map of Treeland corresponding to the first sample input.</p>

<p>The shock jocks haven&rsquo;t quite thought through how much their prize is worth. They need to prepare a report to the radio executives, to summarize the expected costs. For each city that could win the prize, what is the total cost of purchasing all the tickets?</p>

### 입력

<p>The first line of input is a single integer n (1 &le; n &le; 100 000). The next line has n space-separated integers t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 1 000), the tax in each city. The following n &minus; 1 lines each have 3 integers, u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>, meaning the ith road connects cities u<sub>i</sub> and v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n), with a toll of w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 1 000).</p>

### 출력

<p>Output n lines. On the ith line, output a single integer: the cost of purchasing tickets if city i wins the contest.</p>