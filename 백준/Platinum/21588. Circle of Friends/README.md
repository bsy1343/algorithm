# [Platinum I] Circle of Friends - 21588

[문제 링크](https://www.acmicpc.net/problem/21588)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 20, 맞힌 사람: 17, 정답 비율: 26.984%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>There is a posse of friends sitting in a circle. Each friend is holding a card containing a positive integer.</p>

<p>You would like to split the circle of friends into one or more groups. Each group must be a contiguous subsection of the circle. In addition, for each group, the bitwise <em>AND</em> of all values on the cards of the members of the group, taken together, must be nonzero.</p>

<p>Count the number of ways you could split the circle of friends into groups.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \le n \le 2 \cdot 10^5$), which is the number of friends in the circle.</p>

<p>Each of the next $n$ lines contains a single integer $a$ ($1 \le a &lt; 2^{60}$). These are the positive integers on the cards held by the friends in the circle, in the order that the friends are sitting. Note that since they&rsquo;re in a circle, the last friend in the list is sitting next to the first friend in the list.</p>

### 출력

<p>Output a single integer, which is the number of ways to split the circle of friends into groups. Since this number may be very large, output it modulo 998,244,353.</p>