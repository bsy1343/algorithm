# [Gold III] Air Cownditioning - 23879

[문제 링크](https://www.acmicpc.net/problem/23879)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 720, 정답: 353, 맞힌 사람: 293, 정답 비율: 52.043%

### 분류

그리디 알고리즘

### 문제 설명

<p>Farmer John&#39;s cows $N$ are very particular about the room temperature in their barn. Some cows like the temperature to be on the cooler side, while others prefer more warmth.</p>

<p>Farmer John&#39;s barn contains a sequence of $N$ stalls, numbered $1 \ldots N$, each containing a single cow. The $i$-th cow prefers the temperature of her stall to be $p_i$, and right now the temperature in her stall is $t_i$. In order to make sure every cow is comfortable, Farmer John installs a new air conditioning system that is controlled in a somewhat interesting way. He can send commands to the system telling it to either raise or lower the temperature in a consecutive series of stalls by 1 unit --- for example &quot;raise the temperature in stalls $5 \ldots 8$ by 1 unit&quot;. The series of stalls could be as short as just a single stall.</p>

<p>Please help Farmer John determine the minimum number of commands he needs to send his new air conditioning system so that every cow&#39;s stall is at the ideal temperature for its resident cow.</p>

### 입력

<p>The first line of input contains $N$. The next line contains the $N$ non-negative integers $p_1 \ldots p_N$, separated by spaces. The final line contains the $N$ non-negative integers $t_1 \ldots t_N$.</p>

### 출력

<p>Please write a single integer as output containing the minimum number of commands Farmer John needs to use.</p>

### 제한

<ul>
	<li>$N \leq 100,000$</li>
	<li>Temperature values are at most $10,000$.</li>
</ul>