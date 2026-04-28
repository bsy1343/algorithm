# [Gold IV] Convention - 16766

[문제 링크](https://www.acmicpc.net/problem/16766)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1278, 정답: 559, 맞힌 사람: 445, 정답 비율: 46.695%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Farmer John is hosting a new bovine grass-eating convention at his farm!</p>

<p>Cows from all over the world are arriving at the local airport to attend the convention and eat grass. Specifically, there are $N$ cows arriving at the airport ($1 \leq N \leq 10^5$) and cow $i$ arrives at time $t_i$ ($0 \leq t_i \leq 10^9$). Farmer John has arranged $M$ ($1 \leq M \leq 10^5$) buses to transport the cows from the airport. Each bus can hold up to $C$ cows in it ($1 \leq C \leq N$). Farmer John is waiting with the buses at the airport and would like to assign the arriving cows to the buses. A bus can leave at the time when the last cow on it arrives. Farmer John wants to be a good host and so does not want to keep the arriving cows waiting at the airport too long. What is the smallest possible value of the maximum waiting time of any one arriving cow if Farmer John coordinates his buses optimally? A cow&rsquo;s waiting time is the difference between her arrival time and the departure of her assigned bus.</p>

<p>It is guaranteed that $MC \geq N$.</p>

### 입력

<p>The first line contains three space separated integers $N$, $M$, and $C$. The next line contains $N$ space separated integers representing the arrival time of each cow.</p>

### 출력

<p>Please write one line containing the optimal minimum maximum waiting time for any one arriving cow.</p>

### 힌트

<p>If the two cows arriving at time 1 go in one bus, cows arriving at times 3 and 4 in the second, and cows arriving at times 10 and 14 in the third, the longest time a cow has to wait is 4 time units (the cow arriving at time 10 waits from time 10 to time 14).</p>