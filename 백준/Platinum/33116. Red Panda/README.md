# [Platinum V] Red Panda - 33116

[문제 링크](https://www.acmicpc.net/problem/33116)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 1, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>You and your pet red panda live in a one-dimensional world. Your red panda really loves eating apples. There are $N$ boxes (numbered from $1$ to $N$), each containing an apple. Box $i$ is located at point $A_i$. Unfortunately, all the boxes are locked. Luckily, you know the location of all keys; key $i$ that can unlock box $i$ is located at point $B_i$.</p>

<p>Currently, both you and your red panda are at point $S$. You want to gather all the apples <strong>and bring them back</strong> to point $S$ for your red panda. At any time, you can carry any number of keys and apples.</p>

<p>The distance between two points $p$ and $q$ is $|p - q|$. Determine the minimum total distance you need to cover to bring all the $N$ apples to point $S$.</p>

### 입력

<p>The first line consists of two integers $N$ $S$ ($1 ≤ N ≤ 100\, 000$; $-10^9 ≤ S ≤ 10^9$).</p>

<p>Each of the next $N$ lines consists of two integers $A_i$ $B_i$ ($-10^9 ≤ A_i , B_i ≤ 10^9$).</p>

### 출력

<p>Output a single integer representing the minimum total distance you need to cover to bring back all the $N$ apples to point $S$.</p>