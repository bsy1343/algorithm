# [Silver V] King's Inspection - 19718

[문제 링크](https://www.acmicpc.net/problem/19718)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 208, 정답: 116, 맞힌 사람: 82, 정답 비율: 51.899%

### 분류

수학, 사칙연산

### 문제 설명

<p>The Far Far Away Kingdom treasury is in trouble --- the King is coming with an inspection. It is known that the King likes order. So the chief treasurer needs to put the three chests that store the Kingdom gold coins in order. He looked into the chests and found out that they contain $a$, $b$ and $c$ coins, respectively. But the King would definitely like the chests to contain the same number of coins each.</p>

<p>To make the number of coins equal, the chief treasurer started to put additional coins to them with both hands. Each second he chooses two distinct chests and adds one more coin to each one of them.</p>

<p>Help the chief treasurer find out how many seconds he needs to make the number of coins in the chests equal.</p>

### 입력

<p>Input contains three lines.</p>

<p>The first line contains an integer $a$.</p>

<p>The second line contains an integer $b$.</p>

<p>The third line contains an integer $c$ ($1 \le a, b, c \le 5\cdot 10^8$).</p>

### 출력

<p>Output one integer --- the minimum number of seconds that the chief treasurer needs to make the number of coins in the chests equal.</p>

### 힌트

<p>One optimal strategy for the first test is the following: first, add a coin to chests $1$ and $3$, then add a coin to chests $1$ and $2$, and again to chests $1$ and $2$.</p>

<p>All chests in the second test already contain equal number of coins.</p>