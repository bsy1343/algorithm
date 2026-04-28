# [Gold III] All in good fun! - 23468

[문제 링크](https://www.acmicpc.net/problem/23468)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 14, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

기하학

### 문제 설명

<p>Policeman Biteusz loves pranking his friends from the police station. For example, his last joke was signing up his friend Bajteusz for patrolling the city on all Sundays and holidays left this year. However, Biteusz hasn&rsquo;t been so happy since he heard about the new work. Biteusz have to patrol three designated streets. Roads in Bajtocja are straight and no two streets are parallel, so he will have to patrol some, perhaps degenerate to a point, triangle. The policeman will stand at the best place possible, so to minimalize the maximum distance, which he&#39;d possibly have to travel, when called to run to the specified street. Biteusz has been wondering how far he will have to run when called. Help him and calculate the minimum distance!</p>

### 입력

<p>In the first line one integer $Z \le 10^4$ is given, denoting number of testcases described in following lines.&nbsp;</p>

<p>The first line of the each test case contains $3$ --- the number of roads in Bajtocja. Each of the next $3$ lines contains three integers $a_i$, $b_i$, $c_i$, the description of the $i$-th road, meaning that the road is a line fulfilling the equation: $$a_{i}x + b_{i}y + c_i = 0$$</p>

### 출력

<p>For each test case you should print the minimum distance, which Biteusz will have to travel. Your answer will be accepted, if the absolute or relative error wouldn&#39;t exceed $10^{-6}$.</p>

### 제한

<ul>
	<li>$|a_i|, |b_i|, |c_i| \leq 10^{6}$</li>
	<li>$|a_i|+|b_i| &gt; 0$</li>
	<li>No two given lines are parallel.</li>
</ul>