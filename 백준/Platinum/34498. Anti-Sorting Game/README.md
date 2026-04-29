# [Platinum IV] Anti-Sorting Game - 34498

[문제 링크](https://www.acmicpc.net/problem/34498)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

게임 이론

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Busy Beaver and Lazy Lemur are playing a game on a binary string $s$ that is initially not sorted. In this game, they take turns choosing some subsequence<sup>1</sup> that isn't sorted, and sort it in place. Formally, they select indices $b_1 &lt; b_2 &lt; \dots &lt; b_k$ such that the string $s_{b_1}s_{b_2}\dots s_{b_k}$ is not sorted, and sort only these characters of the original string.</p>

<p>It can be shown that no matter how the two players move, the string will become sorted after a finite number of turns. When this happens, the player who made the final move loses, and the other player wins.</p>

<p>Busy Beaver needs your help to beat Lazy Lemur. Given the starting string, determine whether or not Busy Beaver should choose to go first or second, then make a series of moves that wins against the judge.</p>

<hr>
<p><sup>1</sup>A sequence $a$ is a subsequence of a sequence $b$ if $a$ can be obtained from $b$ by the deletion of several (possibly, zero or all) elements.</p>

### 입력



### 출력

