# [Gold I] Annoying Alliterations - 32584

[문제 링크](https://www.acmicpc.net/problem/32584)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 19, 맞힌 사람: 14, 정답 비율: 46.667%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 깊이 우선 탐색, 다이나믹 프로그래밍, 자료 구조, 트라이, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Bajtazar is a member of the jury for the Find Your Palace Contest, a prestigious programming competition that offers a luxurious palace to the winner. He is now trying to come up with a name for his problem. According to Bajtazar, a good problem name consists of exactly two words. Additionally, Bajtazar finds alliterations very annoying, so he will remove the first letter from both words until the first letter of the two words is different or one of them becomes empty. After this operation, Bajtazar defines the <em>goodness</em> of the problem name as the sum of lengths of the two words.</p>

<p>He has prepared a list of $n$ words, and started to wonder what is the maximum goodness that can be achieved using the words from the list. Bajtazar himself does not have time to answer that question as he is busy reinforcing the tests with nasty edge cases. Help Bajtazar by finding the maximum goodness that can be achieved.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2\leq n\leq 2\cdot10^5$), the number of words.</li>
	<li>$n$ lines, each with a word $w$ ($1\leq |w|\leq 10^6$). Each word only consists of English lowercase letters (<code>a-z</code>).</li>
</ul>

<p>The total number of characters in the $n$ words is at most $10^6$.</p>

### 출력

<p>Output the maximum goodness that can be achieved.</p>