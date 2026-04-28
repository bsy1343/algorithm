# [Platinum II] Swapping Brackets - 30302

[문제 링크](https://www.acmicpc.net/problem/30302)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 34, 맞힌 사람: 32, 정답 비율: 51.613%

### 분류

조합론, 다이나믹 프로그래밍, 그리디 알고리즘, 수학

### 문제 설명

<p>You are given a bracket sequence consisting of $N$ open brackets and $N$ closed brackets. Let $S$ be a <strong>nonempty</strong> set of integers between $1$ and $2N$, inclusively. You can choose two indices in $S$, not necessarily adjacent, and swap the brackets of the bracket sequence at those two positions.</p>

<p>Find the number of $S$ that can result in a proper bracket sequence by repeatedly applying this operation arbitrary number of times.</p>

### 입력

<p>The first line contains one integer $N$.</p>

<p>The second line contains a string of $2N$ brackets, either <code>(</code> or <code>)</code>.</p>

### 출력

<p>Print the number of all possible $S$ in modulo $998\, 244\, 353$. $998\, 244\, 353$ is a prime number.</p>

### 제한

<ul>
	<li>$1\leq N\leq 3000$</li>
	<li>Given bracket sequence contains $N$ open brackets and $N$ closed brackets.</li>
</ul>