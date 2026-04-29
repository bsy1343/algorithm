# [Silver II] Game of Nines - 35363

[문제 링크](https://www.acmicpc.net/problem/35363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 10, 정답 비율: 50.000%

### 분류

수학, 애드 혹, 유클리드 호제법, 정수론

### 문제 설명

<p>You are playing a simple game of adding digits. You are given a list of single digits between $0$ and $8$ (inclusive). In each move, you may choose any two digits $a$ and $b$, add $a$ to $b$, and replace $b$ with the sum $a + b$. If $a + b \geq 10$, keep only the units digit (e.g. $5 + 8$ becomes $3$; $4 + 6$ becomes $0$). Whenever the sum is $9$, the result is eliminated immediately and cannot participate in further additions. Note that you cannot add a digit to itself. However, you may choose two digits $a$ and $b$ that have the same value.</p>

<p>Your goal is to eliminate as many digits as possible, using any number of moves.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2 \leq n \leq 1\, 000$), the number of digits. Each of the next $n$ lines contains a single digit between $0$ and $8$, forming the initial list of digits.</p>

### 출력

<p>Output a single integer, the minimum number of digits that will remain if you play optimally to eliminate as many digits as possible.</p>