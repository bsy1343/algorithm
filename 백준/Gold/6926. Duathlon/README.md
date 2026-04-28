# [Gold II] Duathlon - 6926

[문제 링크](https://www.acmicpc.net/problem/6926)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 105, 정답: 34, 맞힌 사람: 7, 정답 비율: 20.588%

### 분류

수학, 삼분 탐색

### 문제 설명

<p>A duathlon is a race that involves running $r$ km and cycling $k$ km. $n$ contestants have entered the race; each contestant has different running and cycling speeds. One of the contestants has bribed the organizers to set $r$ and $k$ so that he can win by the maximum margin. You are to determine if this is possible and, if so, give $r$ and $k$.</p>

### 입력

<p>The first line of input contains an integer $t$, the total distance of the race, in km. That is, $r + k = t$. The next line contains an integer $n$, the number of competitors. For each contestant, a line follows with two real numbers giving the running and cycling speed for that contestant. The last line of input gives the running and cycling speed of the contestant who has bribed the organizers. You may assume $t$ does not exceed $100$ km and $n$ does not exceed $20$.</p>

### 출력

<p>If it is possible to fix the race as described above, print a message giving $r$ and $k$, and the amount by which the cheater will win the race, accurate to two decimal places as in the sample below. If it is not possible, print <code>The cheater cannot win.</code>.</p>