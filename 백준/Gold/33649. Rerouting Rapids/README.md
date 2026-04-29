# [Gold III] Rerouting Rapids - 33649

[문제 링크](https://www.acmicpc.net/problem/33649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 매개 변수 탐색, 이분 탐색, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>The famous East Manitoba river that flows through Edmonton consists of $N$ rapids. The river is a popular rafting destination, with many visitors coming to the river each summer. When a visitor enters a rapid $i$, the current will take them to some unique other rapid $p_i$, except when $i$ is the end of the river. Because water can only flow downhill, visitors can never flow back into the rapid at which they started. It is often the case that multiple rapids $j$, $j'$ flow into the same rapid $p_j=p_{j'}$.</p>

<p>Unfortunately, there have been many collisions lately in rapids that have many other rapids feeding into them, as many visitors may enter the same rapid at similar times, each being fed into it by a different rapid. You work for the City of Edmonton and have been tasked with rerouting some rapids to decrease the rate of collisions. If it’s possible for a visitor to start at some rapid $i$ and eventually reach another rapid $j$, you may shortcut rapid $i$ to lead directly into rapid $j$, setting $p_i=j$.</p>

<p>You wish to reroute rapids in this manner to minimize the maximum number of rapids feeding into any given rapid. Report this minimum number.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33649.%E2%80%85Rerouting%E2%80%85Rapids/e72e2842.png" data-original-src="https://boja.mercury.kr/assets/problem/33649-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 135px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the second sample case. By rerouting rapid $3$ to lead directly to rapid $1$, all rapids now have at most two rapids feeding into them.</p>

### 입력

<p>The first line of input contains one integer $N$, the number of rapids in the river ($1≤N≤10^5$). The second line contains $N$ integers $p_1,p_2,\dots ,p_n$ ($0≤p_i≤N$). If $1≤p_i≤N$, then $p_i$ is the rapid that the $i$th rapid feeds into. Otherwise, if $p_i=0$, then the $i$th rapid is at the end of the river. It is guaranteed that $p_i=0$ for exactly one of the indices $1≤i≤N$, and there is no way to start at the $i$th rapid and eventually return to it for any $i$.</p>

### 출력

<p>Output the minimum possible highest number of rapids feeding into any given rapid, subject to rerouting as described above.</p>