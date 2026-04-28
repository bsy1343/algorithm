# [Silver III] Nano alarm-clocks - 31362

[문제 링크](https://www.acmicpc.net/problem/31362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 32, 맞힌 사람: 16, 정답 비율: 44.444%

### 분류

수학, 누적 합

### 문제 설명

<p>An old watchmaker has $n$ stopped nano alarm-clocks numbered with integers from $1$ to $n$. Nano alarm-clocks count time in hours, and in one hour there are million minutes, each minute lasting a million seconds. In order to repair them all the watchmaker should synchronize the time on all nano alarm-clocks. In order to do this he moves clock hands a certain time forward (may be zero time). Let&rsquo;s name this time shift a transfer time.</p>

<p>Your task is to calculate the minimal total transfer time required for all nano alarm-clocks to show the same time.</p>

### 입력

<p>The first line contains a single integer $n$ --- the number of nano alarm-clocks ($2 \le n \le 10^5$). In each $i$-th of the next $n$ lines the time $h$, $m$, $s$, shown on the $i$-th clock. Integers $h$, $m$ and $s$ show the number of hours, minutes and seconds respectively. ($0 \le h &lt; 12$, $0 \le m &lt; 10^6$, $0 \le s &lt; 10^6$).</p>

### 출력

<p>Output three integers separated with spaces $h$, $m$ and $s$ --- total minimal transfer time, where $h$, $m$ and $s$ --- number of hours, minutes and seconds respectively ($0 \le m &lt; 10^6$, $0 \le s &lt; 10^6$).</p>