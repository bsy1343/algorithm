# [Platinum V] In Search of the Lost Array - 32457

[문제 링크](https://www.acmicpc.net/problem/32457)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 63, 맞힌 사람: 49, 정답 비율: 76.562%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>In a forgotten realm, a group of adventurers stumbles upon a set of mysterious scrolls hidden deep within an ancient library. These scrolls hold the secrets of a powerful numerical array that controls the magic of the realm. However, the scrolls have been damaged over time, and only fragments remain. Specifically, the adventurers discover a sequence of numbers representing the products of adjacent elements of an unknown array $A$.</p>

<p>The original array $A$ consists of $n$ integers $a_1, a_2,\dots ,a_n$ where $1 ≤ a_i ≤ 100$ for $1 ≤ i ≤ n$. The only information remaining on the scrolls is a sequence of $n - 1$ integers $b_1, b_2,\dots ,b_{n-1}$, which are unordered products of adjacent elements from $A$. In other words: $$\{b_1, b_2,\dots ,b_{n-1}\} = \{a_1 \times a_2, a_2 \times a_3, \dots ,a_{n-1} \times a_n\}$$</p>

<p>Your task is to help the adventurers reconstruct one possible original array $A$. If there are multiple valid arrays $A$ that could result in the same sequence $b$, you may output any of them.</p>

### 입력

<p>The first line contains a single integer $n$, representing the length of the array $A$. The second line contains $n - 1$ space-separated integers $b_1, b_2,\dots ,b_{n-1}$, representing the products of adjacent elements in the array $A$.</p>

### 출력

<p>If there is no such array $A$, then print <code>No</code> on a line. Otherwise, print <code>Yes</code> on the first line. Then, output $n$ space-separated integers $a_1, a_2,\dots ,a_n$ on the second line, where $\{b_1, b_2,\dots ,b_{n-1}\} = \{a_1 \times a_2, a_2 \times a_3, \dots ,a_{n-1} \times a_n\}$.</p>

### 제한

<ul>
	<li>$1 &lt; n ≤ 18$. 	$1 ≤ a_i ≤ 100$ for $i \in \{1, 2,\dots ,n\}$</li>
	<li>$1 ≤ b_i ≤ 10000$ for$i \in \{1, 2,\dots ,n-1\}$</li>
</ul>