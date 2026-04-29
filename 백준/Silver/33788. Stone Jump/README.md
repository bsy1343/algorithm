# [Silver V] Stone Jump - 33788

[문제 링크](https://www.acmicpc.net/problem/33788)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 56, 정답: 44, 맞힌 사람: 39, 정답 비율: 78.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>There are $n$ stones in a row, each marked with $L$ or $R$. You can jump from an $L$ stone to any stone to its left, and from an $R$ stone to any stone to its right. </p>

<p>More formally, for a stone at position $1 \le i \le n$, if it is marked with $L$, you can jump to any stone $j$ where $1 \le j &lt; i$, and if it is marked with $R$, you can jump to any stone $j$ where $i &lt; j \le n$. </p>

<p>Your goal is to find a sequence of jumps such that you visit every stone exactly once. If you can start at any stone of your choice, is this possible?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33788.%E2%80%85Stone%E2%80%85Jump/ad22c328.png" data-original-src="https://boja.mercury.kr/assets/problem/33788-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 94px;"></p>

<p style="text-align: center;">One example of a valid path visiting each stone once, starting from the second stone</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the number of stones.</p>

<p>The next line of each test case contains a string $s$ consisting of $n$ characters <code>L</code> and <code>R</code>,  indicating whether stone $i$ is marked with $L$ or $R$.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case print "YES" (without quotes) if it is possible, and "NO" (without quotes) otherwise.</p>

### 힌트

<p>In the second sample case, $n=1$, so you can start on the first stone, at which point you have visited all stones and completed your path.</p>

<p>In the fourth sample case, it can be shown that no valid path exists.</p>