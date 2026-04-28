# [Gold IV] Cheese Towers - 6020

[문제 링크](https://www.acmicpc.net/problem/6020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 19, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Farmer John wants to save some blocks of his cows&#39; delicious Wisconsin cheese varieties in his cellar for the coming winter. He has room for one tower of cheese in his cellar, and that tower&#39;s height can be at most T (1 &lt;= T &lt;= 1,000). The cows have provided him with a virtually unlimited number of blocks of each kind of N (1 &lt;= N &lt;= 100) different types of cheese (conveniently numbered 1..N). He&#39;d like to store (subject to the constraints of height) the most valuable set of blocks he possibly can. The cows will sell the rest to support the orphan calves association.</p>

<p>Each block of the i-th type of cheese has some value V_i (1 &lt;= V_i &lt;= 1,000,000) and some height H_i (5 &lt;= H_i &lt;= T), which is always a multiple of 5.</p>

<p>Cheese compresses. A block of cheese that has height greater than or equal to K (1 &lt;= K &lt;= T) is considered &quot;large&quot; and will crush any and all of the cheese blocks (even other large ones) located below it in the tower. A crushed block of cheese doesn&#39;t lose any value, but its height reduces to just 4/5 of its old height. Because the height of a block of cheese is always a multiple of 5, the height of a crushed block of cheese will always be an integer. A block of cheese is either crushed or not crushed; having multiple large blocks above it does not crush it more. Only tall blocks of cheese crush other blocks; aggregate height of a tower does not affect whether a block is crushed or not.</p>

<p>What is the total value of the best cheese tower FJ can construct?</p>

<p>Consider, for example, a cheese tower whose maximum height can be 53 to be build from three types of cheese blocks. Large blocks are those that are greater than or equal to 25. Below is a chart of the values and heights of the various cheese blocks he stacks:</p>

<pre>
           Type    Value      Height
             1      100         25
             2       20          5
             3       40         10</pre>

<p>FJ constructs the following tower:</p>

<pre>
            Type Height Value
      top -&gt; [1]   25    100
             [2]    4     20   &lt;- crushed by [1] above
             [3]    8     40   &lt;- crushed by [1] above
             [3]    8     40   &lt;- crushed by [1] above
   bottom -&gt; [3]    8     40   &lt;- crushed by [1] above</pre>

<p>The topmost cheese block is so large that the blocks below it are crushed. The total height is:</p>

<pre>
        25 + 4 + 8 + 8 + 8 = 53</pre>

<p>The total height does not exceed 53 and thus is &#39;legal&#39;. The total value is:</p>

<pre>
       100 + 20 + 40 + 40 + 40 = 240.</pre>

<p>This is the best tower for this particular set of cheese blocks.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, T, and K</li>
	<li>Lines 2..N+1: Line i+1 contains two space separated integers: V_i and H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The value of the best tower FJ can build</li>
</ul>

<p>&nbsp;</p>