# [Silver I] Classrooms and Calculators - 34438

[문제 링크](https://www.acmicpc.net/problem/34438)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 33, 정답: 22, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

매개 변수 탐색, 수학, 유클리드 호제법, 이분 탐색, 정수론, 포함 배제의 원리

### 문제 설명

<p>You're trying to organize a group of yourself and $3$ friends to play a campaign of your favorite tabletop game, Classrooms &amp; Calculators. Your schedule is free every day, but your friends all have some scheduling conflicts. Let today be day $0$, tomorrow be day $1$, etc. Your first friend can't play today or every $d_1$ days after today, your second friend can't play today or every $d_2$ days after today, and your third friend can't play today or every $d_3$ days after today. You can only play on a day if nobody has a conflict, and you always play on days with no conflicts. For example, if $d_1 = 3$, $d_2 = 4$, and $d_3 = 5$, in the first $10$ days you would play on days $1$, $2$, and $7$, but not on days $0$, $3$, $4$, $5$, $6$, $8$, $9$, and $10$.</p>

<p>Your campaign's Classroom Teacher has told you that it will take $n$ days of playing to complete the campaign; can you determine the number of the day you finish the campaign?</p>

### 입력

<p>The first line of the input contains the values of $d_1, d_2$, and $d_3$ (each between $2$ and $50$, inclusive), each separated by a single space, describing your friends' schedule conflicts. The second line contains $n$, the number of days you will need to play on to complete the campaign $(1 \le n \le 5\cdot10^8)$.</p>

<p>You are guaranteed that the values of $d_1$, $d_2$, and $d_3$ are such that you can complete the campaign in finite time.</p>

### 출력

<p>You should output a single number, the number of the day on which you finish the campaign.</p>