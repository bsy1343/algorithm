# [Platinum V] Pinball Ranking - 6880

[문제 링크](https://www.acmicpc.net/problem/6880)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 20, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

자료 구조, 정렬, 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>Pinball is an arcade game in which an individual player controls a silver ball by means of flippers, with the objective of accumulating as many points as possible. At the end of each game, the player&#39;s score and rank are displayed. The score, an integer between $0$ and $1\,000\,000\,000$, is that achieved by the player in the game just ended. The rank is displayed as &quot;$r$ of $n$&quot;. $n$ is the total number of games ever played on the machine, and $r$ is the position of the score for the just-ended game within this set.</p>

<p><em>More precisely, $r$ is one greater than the number of games whose score exceeds that of the game just ended.</em></p>

### 입력

<p>You are to implement the pinball machine&#39;s ranking algorithm. The first line of input contains a positive integer, $t$, the total number of games played in the lifetime of the machine. $t$ lines follow, given the scores of these games, in chronological order.</p>

### 출력

<p>You are to output the average of the ranks up to an absolute error of $10^{-2}$ that would be displayed on the board.</p>

<p>At least one test case will have $t \le 100$. All test cases will have $t \le 100\,000$.</p>

### 힌트

<p>The pinball screen would display (in turn):</p>

<pre>
1 of 1
1 of 2
2 of 3
2 of 4
5 of 5</pre>

<p>The average rank is $(1+1+2+2+5)/5 = 2.20$.</p>