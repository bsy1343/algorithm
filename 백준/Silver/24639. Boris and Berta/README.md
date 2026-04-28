# [Silver IV] Boris and Berta - 24639

[문제 링크](https://www.acmicpc.net/problem/24639)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 218, 정답: 62, 맞힌 사람: 57, 정답 비율: 27.670%

### 분류

수학, 사칙연산

### 문제 설명

<p>Boris is making a quest for his sister Berta. One of the tasks is to find a point on the map that is $n$ meters to the north from their house. But it&#39;s too easy if $n$ is specified directly. Boris decided to use miles and cables to specify the distance.</p>

<p>He found out that there are a lot of different miles: from a $500$-meter Chinese mile (called <em>li</em>) up to a $11\,299$-meter Norwegian mile (called <em>mil</em>). And a cable length can be anywhere from $169$ to $220$ meters.</p>

<p>Boris decided to use an $m$-meter mile and a $c$-meter cable. Now he wants to represent the $n$-meter distance as &quot;$M$ miles and $C$ cables&quot; with non-negative integers $M$ and $C$ as precisely as possible --- that is, he wants to minimize $|M\cdot m+C\cdot c-n|$. Help him!</p>

### 입력

<p>Three lines contain an integer each: $n$ --- the distance to represent, $m$ --- the chosen length of a mile, and $c$ --- the chosen length of a cable ($1 \le n \le 10^9$; $500 \le m \le 11\,299$; $169 \le c \le 220$). All values are given in meters.</p>

### 출력

<p>Print two non-negative integers $M$ and $C$ --- the best approximation for the distance of $n$ meters using the chosen mile and cable lengths. If there are multiple best approximations, print any of them.</p>

### 힌트

<p>There are two correct answers to the second example test: &quot;<code>1 6</code>&quot; and &quot;<code>3 1</code>&quot;.</p>