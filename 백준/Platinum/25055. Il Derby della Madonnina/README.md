# [Platinum I] Il Derby della Madonnina - 25055

[문제 링크](https://www.acmicpc.net/problem/25055)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 124, 정답: 59, 맞힌 사람: 55, 정답 비율: 49.107%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>The derby between Milan and Inter is happening soon, and you have been chosen as the assistant referee for the match, also known as linesman. Your task is to move along the touch-line, namely the side of the field, always looking very carefully at the match to check for offside positions and other offences.</p>

<p>Football is an extremely serious matter in Italy, and thus it is fundamental that you keep very close track of the ball for as much time as possible. This means that you want to maximise the number of kicks which you monitor closely. You are able to monitor closely a kick if, when it happens, you are in the position along the touch-line with minimum distance from the place where the kick happens.</p>

<p>Fortunately, expert analysts have been able to accurately predict all the kicks which will occur during the game. That is, you have been given two lists of integers, $t_1$, $\dots$, $t_n$ and $a_1$, $\dots$, $a_n$, indicating that $t_i$ seconds after the beginning of the match the ball will be kicked and you can monitor closely such kick if you are at the position $a_i$ along the touch-line.</p>

<p>At the beginning of the game you start at position $0$ and the maximum speed at which you can walk along the touch-line is $v$ units per second (i.e., you can change your position by at most $v$ each second). What is the maximum number of kicks that you can monitor closely?</p>

### 입력

<p>The first line contains two integers $n$ and $v$ ($1 &le; n &le; 2 &middot; 10^5$, $1 &le; v &le; 10^6$) &mdash; the number of kicks that will take place and your maximum speed. The second line contains $n$ integers $t_1$, $\dots$, $t_n$&nbsp;($1 &le; t_i &le; 10^9$) &mdash; the times of the kicks in the match. The sequence of times is guaranteed to be strictly increasing, i.e., $t_1 &lt; t_2 &lt; \cdots &lt; t_n$. The third line contains $n$ integers $a_1$, $\dots$, $a_n$ ($-10^9 &le; a_i &le; 10^9$) &mdash; the positions along the touch-line where you have to be to monitor closely each kick.</p>

### 출력

<p>Print the maximum number of kicks that you can monitor closely.</p>