# [Gold IV] Expected Value - 18546

[문제 링크](https://www.acmicpc.net/problem/18546)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 16 MB (추가 메모리 없음)

### 통계

제출: 114, 정답: 43, 맞힌 사람: 38, 정답 비율: 43.678%

### 분류

수학, 조합론, 확률론

### 문제 설명

<p>Here is a game played with sequence a<sub>1</sub>, . . . , a<sub>n</sub>. On each turn, the player chooses some position i &lt; n uniformly at random, replaces the element a<sub>i</sub> with a<sub>i</sub> &minus; a<sub>i+1</sub>, and then removes the element a<sub>i+1</sub> from the sequence. This continues until there is only one element left. What is the expected value of the last element?</p>

### 입력

<p>The first line of input contains a single integer n (2 &le; n &le; 4000).</p>

<p>The second line of input contains n integers a<sub>1</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 4000).</p>

### 출력

<p>If the answer is P/Q such that P and Q are coprime, output a single integer which is (P &middot; Q<sup>&minus;1</sup>) mod (109 + 7). It is guaranteed that Q ≢&nbsp;0 (mod 10<sup>9</sup> + 7).</p>

### 힌트

<p>Pay attention to the non-standard memory limit.</p>