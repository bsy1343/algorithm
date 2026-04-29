# [Platinum IV] Alchembit Exam - 33113

[문제 링크](https://www.acmicpc.net/problem/33113)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 비트마스킹, 우선순위 큐, 자료 구조

### 문제 설명

<p>As a modern alchemy student, you are taking an exam in Alchembit, a hybrid between alchemy and modern technology. In the exam, you are given $N$ potions (numbered from $1$ to $N$) where potion $i$ has a potency of an integer $A_i$. You start the exam with a score of $0$.</p>

<p>You can increase your score by doing the following procedure.</p>

<ol>
	<li>Suppose there are $n$ potions remaining. Choose an interval $[l, r]$ where $1 ≤ l &lt; r ≤ n$.</li>
	<li>By choosing the interval $[l, r]$, your score will be increased by $A_l \,\&amp;\, A_{l+1} \,\&amp;\, \dots \,\&amp;\, A_r$, where the symbol $\&amp;$ represents the bitwise AND operator.</li>
	<li>Next, fuse potions $l, l + 1, \dots , r$ into one new potion with a potency of $A_l \,\&amp;\, A_{l+1} \,\&amp;\, \dots \,\&amp;\, A_r$.</li>
	<li>The potions are then renumbered as follows: the newly fused potion becomes potion $l$, and potions $r + 1, r + 2, \dots , n$ are renumbered as $l+ 1, l+ 2, \dots , l+ (n-r)$. Potions numbered $1, 2, \dots , l-1$ remain unchanged.</li>
</ol>

<p>For example, if you have $5$ potions with potencies $A = [19, 12, 10, 20, 23]$, and you choose interval $[2, 3]$, then your score will be increased by $12 \,\&amp;\, 10 = 8$. Then, potions $2$ and $3$ are fused into a new potion with a potency of $12 \,\&amp;\, 10 = 8$. After the renumbering procedure (step 4), A becomes $[19, 8, 20, 23]$.</p>

<p>You can perform the above procedure until there is only one potion left. Determine the maximum score that you can achieve.</p>

### 입력

<p>The first line consists of an integer $N$ ($2 ≤ N ≤ 100\, 000$).</p>

<p>The second line consists of $N$ integers $A_i$ ($0 ≤ A_i &lt; 2^{30}$).</p>

### 출력

<p>Output a single integer representing the maximum score that you can get.</p>