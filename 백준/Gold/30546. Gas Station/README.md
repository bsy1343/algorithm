# [Gold I] Gas Station - 30546

[문제 링크](https://www.acmicpc.net/problem/30546)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>You are a late night attendant at a busy gas station. You can only go home after all the cars have topped up their fuel tanks and left the gas station. The gas station you work at has $P$ gas pump columns, counting from left to right, and each column has two gas pumps, pump A and pump B. A pump can serve cars with left side fuel doors on its right side, or cars with right side fuel doors on its left side. A pump can serve a car on its left side and a car on its right side simultaneously. Thus, each pump column has two lanes for cars.</p>

<p>Cars arriving at the gas station follow strict rules. A car will go to the leftmost open lane that is suitable for its fuel door side. If there are no open lanes, the car will queue up for the suitable lane with the shortest queue. If there are multiple lanes with the shortest queue, the car will queue up in the leftmost one. Once a car has joined a queue, it cannot switch to a different one. After cars leave after refueling and a lane becomes open, the next car in the queue for that lane will go to use a pump.</p>

<p>A lane is open if pump A is available. If pump B is available but pump A is occupied, the lane is not open. When a car goes to an open lane, if both pumps are available, the car will go to pump B, otherwise it will go to pump A. If a car arrives at the same time as some other cars have just finished filling up and left, the new car waits for all other cars in the queues to move to the open pumps (if any) before deciding where to queue. When a car leaves from a pump A, but the pump B ahead of it is occupied, the car is stil able to leave immediately.</p>

<p>You know that Car $i$ arrives at time $t_i$, requires just under $f_i$ minutes to fill up and leave, and has its fuel door on the $s_i$ side.</p>

<p>Knowing all this, you want to know when you will be able to go home.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30546.%E2%80%85Gas%E2%80%85Station/235fb86e.png" data-original-src="https://upload.acmicpc.net/a2edeba9-3a8b-4f43-b3de-2a9090fc5eda/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 256px; width: 228px;" /></p>

### 입력

<p>The first line of input contains two space separated integers, $1\leq P\leq 10$, the number of gas pump columns, and $1\leq N\leq1000$, the total number of cars that will arrive.</p>

<p>The next $N$ lines each contains two integers $1\leq t_i\leq10^{5}$, $1\leq f_i\leq100$, and a single character <code>R</code> or <code>L</code> for $s_i$, all separated by a space.</p>

<p>It is guaranteed that $t_i &lt; t_{i+1}$ for all $1 \leq i &lt; N$.</p>

### 출력

<p>Output $N$ lines containing the time when each car leaves the gas station, in the order that the cars are listed in the input.</p>