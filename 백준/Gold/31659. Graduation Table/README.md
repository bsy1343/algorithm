# [Gold III] Graduation Table - 31659

[문제 링크](https://www.acmicpc.net/problem/31659)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>You have been asked to organize the computing science graduation banquet. There are $n$ people attending the banquet, and they must all be seated around a large circular table. As it turns out, some pairs of attendees are friends and wish to sit next to each other. Thankfully, since all the attendees are computing science majors, none have more than 2 friends.</p>

<p>While there is no official way to request seating arrangements, these pairs have come to you privately and offered you a bribe if you fulfill their request. You care about your integrity, but you also care about money, so you will only accept bribes if you can fulfill the pair&rsquo;s request. You wish to maximize the amount of money you can earn by accepting the most profitable set of bribes.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1 \leq N \leq 5000$) and $M$ ($0 \leq M \leq N$), indicating the number of banquet attendees and the number of seating requests, respectively. Then $M$ lines follow, each containing three integers $u$, $v$ ($1 \leq u &lt; v \leq n$), and $c$ ($1 \leq c \leq 10^8$) indicating that attendees $u$ and $v$ are willing to pay you $c$ dollars to sit next to each other.</p>

<p>It is guaranteed that any pair will submit at most one request to sit with each other, and each individual attendee will appear in at most two requests.</p>

### 출력

<p>Output the maximum number of dollars you can make over all possible seating arrangements.</p>