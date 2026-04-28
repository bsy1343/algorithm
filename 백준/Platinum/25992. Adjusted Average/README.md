# [Platinum V] Adjusted Average - 25992

[문제 링크](https://www.acmicpc.net/problem/25992)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 189, 정답: 42, 맞힌 사람: 36, 정답 비율: 31.034%

### 분류

자료 구조, 브루트포스 알고리즘, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>As a student of the Biology And Probability Course at your university, you have just performed an experiment as part of the practical assignments. However, your results do not look very nice: you had hoped that the average of your samples would be different from what it is now.</p>

<p>To improve your results, you decide to let some of your samples &quot;magically disappear&quot; (i.e., dump them in the waste bin). In order to not raise suspicion with your teacher, you can remove only a few of your samples. How close can you possibly get to your desired average?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $k$, and $\overline{x}$ ($2 \leq n \leq 1500$, $1 \leq k \leq 4$, $k &lt; n$, $\left| \overline{x} \right| \leq 10^9$), the number of samples, the number of samples that may be removed, and the average you think looks the nicest.</li>
	<li>One line with $n$ integers $x$ ($\left| x \right| \leq 10^9$), representing the samples.</li>
</ul>

### 출력

<p>Output the minimal absolute difference between $\overline{x}$ and the average you can obtain by removing at most $k$ samples from the dataset.</p>

<p>Your answer should have an <em>absolute</em> error of at most $10^{-4}$.</p>