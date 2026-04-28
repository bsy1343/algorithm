# [Silver I] Balls of Buma - 19219

[문제 링크](https://www.acmicpc.net/problem/19219)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 51, 맞힌 사람: 50, 정답 비율: 69.444%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>Balph is learning to play a game called Buma. In this game, he is given a row of colored balls. He has to choose the color of one new ball and the place to insert it (between two balls, or to the left of all the balls, or to the right of all the balls).</p>

<p>When the ball is inserted the following happens repeatedly: if some segment of balls of the same color became longer as a result of a previous action and its length became at least $3$, then all the balls of this segment are eliminated.&nbsp;</p>

<p>Consider, for example, a row of balls &#39;<code>AAABBBWWBB</code>&#39;. Suppose Balph chooses a ball of color &#39;<code>W</code>&#39; and the place to insert it after the sixth ball, i. e. to the left of the two &#39;<code>W</code>&#39;s. After Balph inserts this ball, the balls of color &#39;<code>W</code>&#39; are eliminated, since this segment was made longer and has length $3$ now, so the row becomes &#39;<code>AAABBBBB</code>&#39;. The balls of color &#39;<code>B</code>&#39; are eliminated now, because the segment of balls of color &#39;<code>B</code>&#39; became longer and has length $5$ now. Thus, the row becomes &#39;<code>AAA</code>&#39;. However, none of the balls are eliminated now, because there is no elongated segment.</p>

<p>Help Balph count the number of possible ways to choose a color of a new ball and a place to insert it that leads to the elimination of all the balls.</p>

### 입력

<p>The only line contains a non-empty string of uppercase English letters of length at most $3 \cdot 10^5$. Each letter represents a ball with the corresponding color.</p>

### 출력

<p>Output the number of ways to choose a color and a position of a new ball in order to eliminate all the balls.</p>