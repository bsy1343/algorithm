# [Platinum V] Gems in the maze - 27698

[문제 링크](https://www.acmicpc.net/problem/27698)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 134, 정답: 13, 맞힌 사람: 9, 정답 비율: 7.087%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 그래프 이론, 정수론, 스택, 함수형 그래프

### 문제 설명

<p>Scrooge McDuck has a new plan how to increase his wealth. He found ancient ruins with an extraordinary maze. This maze consists of n chambers. The chambers are numbered 0 through n &minus; 1. Each chamber contains exactly one gem. Chambers are connected by one-way tunnels. Each chamber has exactly two outgoing tunnels: one leads to the chamber with number (a &sdot; v<sup>2</sup> + b &sdot; v + c) modn, the other will bring you out of the maze.</p>

<p>You can enter the maze at any location, move along the tunnels and collect the gems. But once you leave the maze, you&rsquo;ll trigger a self-destruct mechanism &ndash; the ceiling of the maze will collapse and all the gems that you did not collect will be lost forever.</p>

<p>Scrooge wants to know the maximum number of gems he can take from the maze.</p>

### 입력

<p>The ﬁrst line of the input ﬁle contains four integers a, b, c, and n &ndash; the numbers that describe one particular maze.</p>

### 출력

<p>Output a single line containing a single integer &ndash; the maximum number of gems that can be taken from the maze.</p>

### 힌트

<p>The starting chamber matters. For instance, assume that in the ﬁrst example test case Scrooge starts in the chamber 0. His only two options are a tunnel that leads back to chamber 0 and a tunnel that leads outside &ndash; not much of a choice. A much better strategy is to start in the chamber 2 and follow the path 2 &rarr; 8 &rarr; 16 &rarr; 32 &rarr; 0 &rarr; outside.</p>