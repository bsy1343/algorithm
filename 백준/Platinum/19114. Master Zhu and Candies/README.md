# [Platinum III] Master Zhu and Candies - 19114

[문제 링크](https://www.acmicpc.net/problem/19114)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 45, 맞힌 사람: 37, 정답 비율: 51.389%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Master Zhu puts $n$ heaps of candies on the table. Two players are playing the following game: on their turn, each player can either pick any positive number of candies from the same heap, or split some heap into three smaller non-empty heaps. Player who picks the last candy wins.</p>

<p>Master Zhu wants you to find out which player will win the game if both play optimally.</p>

### 입력

<p>The first line of input contains an integer $n$ indicating the number of heaps ($1 \le n \le 10^6$). The next line contains $n$ integers $s_1, \ldots, s_n$ representing the number of candies in each heap ($1 \le s_i \le 10^9$).</p>

### 출력

<p>If the first player wins, print &quot;<code>First</code>&quot;, otherwise print &quot;<code>Second</code>&quot;.</p>