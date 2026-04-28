# [Silver III] d1000000 - 25090

[문제 링크](https://www.acmicpc.net/problem/25090)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 211, 정답: 186, 맞힌 사람: 145, 정답 비율: 88.957%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>While the most typical type of dice have $6$ sides, each of which shows a different integer $1$ through $6$, there are many games that use other types. In particular, a $dk$ is a die with $k$ sides, each of which shows a different integer $1$ through $k$. A $d6$ is a typical die, a $d4$ has four sides, and a $d1000000$ has one million sides.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25090.%E2%80%85d1000000/45597248.png" data-original-src="https://upload.acmicpc.net/71c9cbbf-a002-47f1-8afa-4843d4be1ca0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In this problem, we start with a collection of $N$ dice. The $i$-th die is a $dS_i$, that is, it has $S_i$ sides showing integers $1$ through $S_i$. A straight of length $ℓ$ starting at $x$ is the list of integers $x,x+1,\dots ,x+(ℓ-1)$. We want to choose some of the dice (possibly all) and pick one number from each to form a straight. What is the longest straight we can form in this way?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case is described in two lines. The first line of a test case contains a single integer $N$, the number of dice in the game. The second line contains $N$ integers $S_1,S_2, \dots ,S_N$, each representing the number of sides of a different die.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum number of input dice that can be put in a straight.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are multiple ways to form a straight using all $4$ dice. One possible way is shown in the image above.</p>

<p>In Sample Case #2, since none of the dice can show an integer greater than $5$, there is no way to have a straight with more than 55 dice. There are multiple ways to form a straight with exactly $5$ dice. For example, pick the integers $4$ and $5$ for both $d5$⁠&#39;s and then integers $1$, $2$, and $3$ for three of the $d4$⁠&#39;s to form $1$, $2$, $3$, $4$, $5$.</p>

<p>In Sample Case #3, it is possible to form the straight $1$, $2$, $3$, $4$, $5$, $6$, $7$, $8$, $9$ by discarding one $d4$ and using the $d4$⁠&#39;s, $d5$, and $d6$ to get $1$ through $4$; the $d7$⁠&#39;s to get $5$ through $7$; and the $d10$⁠&#39;s to get $8$ and $9$. There is no way to form a straight of length $10$, so this is the best that can be done.</p>

<p>In Sample Case #4, we can only form a straight of length $1$, but we can do so by picking any integer for the $d10$ we are given.</p>