# [Platinum II] Xingqiu's Joke - 31184

[문제 링크](https://www.acmicpc.net/problem/31184)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 13, 맞힌 사람: 8, 정답 비율: 21.053%

### 분류

데이크스트라, 그래프 이론, 그리디 알고리즘, 수학, 정수론, 최단 경로

### 문제 설명

<p>Once again, Xingqiu hides Chongyun&#39;s ice cream into a box with a strange lock. Liyue&#39;s summer has been always very hot and Chongyun suffers more because of his excessive yang (positive) energy, so he needs that ice cream desperately.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31184.%E2%80%85Xingqiu's%E2%80%85Joke/1bb97d4c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31184.%E2%80%85Xingqiu's%E2%80%85Joke/1bb97d4c.png" data-original-src="https://upload.acmicpc.net/524addc7-e912-4d5e-af19-c577a3e3e6c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 411px; height: 276px;" /></p>

<p style="text-align: center;">Pixiv ID: 86787400</p>

<p>There are two integers $a$ and $b$ on the lock. Chongyun can perform the following three types of operations any number of times:</p>

<ul>
	<li>Minus $1$ from both $a$ and $b$;</li>
	<li>Plus $1$ to both $a$ and $b$;</li>
	<li>Divide both $a$ and $b$ by one of their common <strong>prime</strong> factor (that is to say, divide them by a <strong>prime</strong> $g$ where $a$ and $b$ are both divisible by $g$).</li>
</ul>

<p>The box will be unlocked if either $a$ or $b$ or both become $1$. To help Chongyun gets the ice cream back as quickly as possible, please tell him the minimum number of operations needed to unlock the box.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 \le T \le 300$) indicating the number of test cases. For each test case:</p>

<p>The first and only line contains two integers $a$ and $b$ ($1 \le a, b \le 10^9$, $a \ne b$).</p>

### 출력

<p>For each test case output one line containing one integer indicating the minimum number of operations to make $a$ or $b$ or both equal $1$.</p>

### 힌트

<p>For the first sample test case, the optimal way is $(4, 7) \rightarrow (3, 6) \rightarrow (1, 2)$.</p>

<p>For the second sample test case, the optimal way is to apply the first type of operation $7$ times.</p>

<p>For the third sample test case, the optimal way is $(32, 84) \rightarrow (16, 42) \rightarrow (15, 41) \rightarrow (14, 40) \rightarrow (13, 39) \rightarrow (1, 3)$.</p>

<p>For the fourth sample test case, the optimal way is $(11, 35) \rightarrow (12, 36) \rightarrow (6, 18) \rightarrow (2, 6) \rightarrow (1, 3)$.</p>