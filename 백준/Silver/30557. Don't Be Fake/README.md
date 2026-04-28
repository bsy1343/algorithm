# [Silver III] Don't Be Fake - 30557

[문제 링크](https://www.acmicpc.net/problem/30557)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 36, 맞힌 사람: 29, 정답 비율: 82.857%

### 분류

구현, 누적 합, 시뮬레이션

### 문제 설명

<p>DontBeFake is an app where people get a notification at a random point in time, and they have to take a picture of what they are doing right now.</p>

<p>You have $N$ friends on DontBeFake. Each friend has a set of intervals of seconds $[L, R]$ when they are available. If they get a notification at second $s$ and they are available, they will take a picture and you will get to see it. Because the DontBeFake app is slow and so is taking a picture, even if they are available a second later, they will not have time to take the picture. All friends live in the same time zone and will get one notification at exactly the same time in the day. All times are specified as seconds from midnight.</p>

<p>You want to know what is the maximum number of pictures you can view in the day, over all possible seconds that the notification can arrive. In addition, you also want to know how many different seconds the notification could arrive for the maximum number of pictures to be taken.</p>

### 입력

<p>Input begins with a line containing the integer $N$ ($1 \leq N \leq 50$). The next $N$ lines each describes the set of available intervals for the $N$ friends. Each such line starts with an integer $M$ ($1 \leq M \leq 10$) followed by $M$ pairs of integers $L_i$, $R_i$ ($L_i \leq R_i$) meaning that the friend is available between $L_i$ and $R_i$ seconds, inclusive. It is guaranteed that $R_i &lt; L_{i+1}$ for all $1 \leq i &lt; M$, so that the intervals do not overlap. It is also guaranteed that $0 \leq L_i, R_i &lt; 86\,400$.</p>

### 출력

<p>Output on the first line the maximum number of pictures you can view in the day. On the second line, output the total number of seconds the notification could arrive for the maximum number of pictures to be taken.</p>