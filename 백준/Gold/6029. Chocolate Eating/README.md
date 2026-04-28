# [Gold IV] Chocolate Eating - 6029

[문제 링크](https://www.acmicpc.net/problem/6029)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 129, 정답: 20, 맞힌 사람: 18, 정답 비율: 21.176%

### 분류

이분 탐색, 그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>Bessie has received N (1 &lt;= N &lt;= 50,000) chocolates from the bulls, but doesn&#39;t want to eat them too quickly, so she wants to plan out her chocolate eating schedule for the next D (1 &lt;= D &lt;= 50,000) days in order to maximize her minimum happiness level over the set of those days.</p>

<p>Bessie&#39;s happiness level is an integer that starts at 0 and halves (rounding down if necessary) over night as she sleeps. However, when she eats chocolate i, her happiness level increases by integer H_i (1 &lt;= H_i &lt;= 1,000,000). If she eats chocolates on a day, her happiness for that day is considered the happiness level after she eats the chocolates. Bessie insists that she eat the chocolates in the order that she received them.</p>

<p>If more than one optimal solution exists, print any one of them.</p>

<p>Consider a sequence of 5 chocolates to be eaten over a period of 5 days; they respectively bring happiness (10, 40, 13, 22, 7).</p>

<p>If Bessie eats the first chocolate (10 happiness) on the first day and then waits to eat the others, her happiness level is 10 after the first day.</p>

<p>Here is the complete schedule which turns out to maximize her minimum happiness:</p>

<pre>
  Day  Wakeup happiness   Happiness from eating   Bedtime happiness
   1            0                10+40                  50
   2           25                 ---                   25
   3           12                  13                   25
   4           12                  22                   34 
   5           17                   7                   24</pre>

<p>The minimum bedtime happiness is 24, which turns out to be the best Bessie can do.</p>

### 입력

<ul>
	<li>Line 1: Two space separated integers: N and D</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, the highest Bessie&#39;s minimum happiness can be over the next D days</li>
	<li>Lines 2..N+1: Line i+1 contains an integer that is the day on which Bessie eats chocolate i</li>
</ul>

<p>&nbsp;</p>