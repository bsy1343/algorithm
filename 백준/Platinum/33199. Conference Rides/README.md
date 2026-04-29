# [Platinum III] Conference Rides - 33199

[문제 링크](https://www.acmicpc.net/problem/33199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 45, 정답: 18, 맞힌 사람: 15, 정답 비율: 42.857%

### 분류

이분 매칭, 이분 탐색

### 문제 설명

<p>There are $n$ attendees in a conference, numbered $1$ through $n$. Each of the first $m$ attendees (numbered $1$ through $m$) has a car to drive home after the event. The remaining $n - m$ attendees who do not have a car, are going to get a ride to their homes with the help of the first $m$ attendees. Each of the first $m$ attendees can pick up at most one other attendee (from attendees $m + 1$ to $n$) and drive them to their house before going to their own home. You are given the distance matrix $D$ of the $n + 1$ locations (the conference hall and $n$ attendees’ homes). Find a way for attendees with cars to drive the attendees without cars home, such that the time it takes for all attendees to arrive at their homes is minimized. The distance matrix $D$ is an $(n+ 1) \times (n+ 1)$ matrix where $D[i][j]$ denotes the estimated time of transportation from location $i$ to location $j$. Location $i$ (for $1 \le i \le n$) denotes the home of the $i$<sup>th</sup> attendee and the conference hall is positioned at location $n + 1$.</p>

### 입력

<p>The input starts with a line containing two integers $n$ and $m$, ($1 \le n \le 500$ and $1 \le m \le n$). It is guaranteed that $2m \ge n$.</p>

<p>The following $n+1$ lines specify the distance matrix $D$, each containing $n+1$ integers. The $j$<sup>th</sup> number from the $i + 1$<sup>th</sup> line of the input (for $1 \le i, j \le n + 1$) specifies $D[i][j]$ ($0 \le D[i][j] \le 10^8$). It is guaranteed that $D[i][k] \le D[i][j] + D[j][k]$ for any $1 \le i, j, k \le n + 1$, and also $D[i][j] = 0$ for $i = j$, but $D[i][j]$ is not necessarily equal to $D[j][i]$.</p>

### 출력

<p>In the first line of output, print the minimum time it takes for all attendees to arrive at their homes. In the next $m$ lines, each line $i$ (for $1 \le i \le m$) should contain a single non-negative integer $t_i$, denoting the driving schedule of the $i$<sup>th</sup> attendee. If $t_i = 0$, the attendee drives directly to their home without picking up any other attendees. Otherwise ($t_i &gt; 0$), the $i$<sup>th</sup> attendee picks up the attendee $t_i$ and takes them to their home before driving to their own home. Each attendee must be transferred by exactly one car.</p>