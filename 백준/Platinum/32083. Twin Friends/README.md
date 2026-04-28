# [Platinum II] Twin Friends - 32083

[문제 링크](https://www.acmicpc.net/problem/32083)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 64, 맞힌 사람: 41, 정답 비율: 65.079%

### 분류

수학, 다이나믹 프로그래밍, 누적 합, 조합론

### 문제 설명

<p>You meet two new friends who are twins. The name of the elder twin is $A$, which consists of $N$ characters. While the name of the younger twin is $B$, which consists of $M$ characters. It is known that $N &le; M$.</p>

<p>You want to call each of them with a nickname. For the elder twin, you want to pick any permutation of $A$ as the nickname. For the younger twin, you want to remove exactly $M - N$ characters from any permutation of $B$. Denote the nicknames of the elder twin and the younger twin as $A&#39;$ and $B&#39;$, respectively.</p>

<p>You want the nicknames to satisfy the following requirement. For each i that satisfies $1 &le; i &le; N$, $B&#39;_i$ must be equal to either $A&#39;_i$ or the next letter that follows alphabetically after $A&#39;_i$ (if such a next letter exists).</p>

<p>Determine the number of different pairs of nicknames $(A&#39; , B&#39; )$ that satisfy the requirement. Two pairs of nicknames are considered different if at least one of the nicknames are different. As the result might be large, find the answer modulo $998\, 244\, 353$.</p>

### 입력

<p>The first line consists of two integers $N$ $M$ ($1 &le; N &le; M &le; 200\, 000$).</p>

<p>The second line consists of a string $A$ of length $N$.</p>

<p>The third line consists of a string $B$ of length $M$.</p>

<p>All strings consist of only upper-case letters.</p>

### 출력

<p>Output a single integer representing number of different pairs $(A&#39; , B&#39; )$ that satisfy the requirement, modulo $998\, 244\, 353$.</p>