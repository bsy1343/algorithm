# [Silver I] Oops, It's Yesterday Twice More - 31175

[문제 링크](https://www.acmicpc.net/problem/31175)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 32, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

구현, 해 구성하기

### 문제 설명

<p>After the great success in 2018, 2019, and 2020, Nanjing University of Aeronautics and Astronautics (NUAA) will host the <em>International Collegiate Programming Contest</em> (ICPC) Nanjing regional for the fourth time.</p>

<p>Team <strong><em>Power of Two</em></strong> and team <strong><em>Three Hold Two</em></strong> won the champion for Tsinghua University in 2018 and 2019. In 2020, team <strong><em>Inverted Cross</em></strong> from Peking University won the champion. In 2021, there are around $700$ teams including <strong>the defending champion</strong> participating in the contest. We are so excited to see who will win this year!</p>

<p>Although we can&#39;t gather in Nanjing this time due to the pandemic, we should still be grateful for the hard work done by all staff and volunteers for this contest. Thank you all for your great contribution to this contest!</p>

<p>In the 2018 contest, problem K, <strong><em>Kangaroo Puzzle</em></strong>, requires the contestants to construct an operation sequence for the game:</p>

<blockquote>
<p>The puzzle is a grid with $n$ rows and $m$ columns ($1 \le n, m \le 20$) and there are some (at least $2$) kangaroos standing in the puzzle. The player&#39;s goal is to control them to get together. There are some walls in some cells and the kangaroos cannot enter the cells with walls. The other cells are empty. The kangaroos can move from an empty cell to an adjacent empty cell in four directions: up, down, left, and right.</p>

<p>There is exactly one kangaroo in every empty cell in the beginning and the player can control the kangaroos by pressing the button U, D, L, R on the keyboard. The kangaroos will move simultaneously according to the button you press.</p>

<p>The contestant needs to construct an operating sequence of at most $5 \times 10^4$ steps consisting of U, D, L, R only to achieve the goal.</p>
</blockquote>

<p>In the 2020 contest, problem A, <strong><em>Ah, It&#39;s Yesterday Once More</em></strong>, requires the contestants to construct an input map to hack the following code of the problem described before:</p>

<pre>
#include &lt;bits/stdc++.h&gt;
using namespace std;
string s = &quot;UDLR&quot;;
int main()
{
  srand(time(NULL));
  for (int i = 1; i &le; 50000; i++) putchar(s[rand() % 4]);
  return 0;
}
</pre>

<p>Now in the 2021 contest, Paimon prepares another version of the problem for you. You are given a grid with $n$ rows and $n$ columns ($2 \leq n \leq 500$). All cells are empty and there is one kangaroo standing in each cell.</p>

<p>Similarly, you can control the kangaroos by pressing the button U, D, L, R on the keyboard. The kangaroos will move simultaneously according to the button you press. Specifically, for any kangaroo located in the cell on the $i$-th row and the $j$-th column, indicated by $(i,j)$:</p>

<ol>
	<li>Button U: it will move to $(i-1,j)$ if $i&gt;1$. Otherwise, it will stay in the same grid.</li>
	<li>Button D: it will move to $(i+1,j)$ if $i&lt;n$. Otherwise, it will stay in the same grid.</li>
	<li>Button L: it will move to $(i,j-1)$ if $j&gt;1$. Otherwise, it will stay in the same grid.</li>
	<li>Button R: it will move to $(i,j+1)$ if $j&lt;n$. Otherwise, it will stay in the same grid.</li>
</ol>

<p>You need to construct an operating sequence consisting only of characters &#39;U&#39;, &#39;D&#39;, &#39;L&#39;, and &#39;R&#39;. After applying it, you must make sure every kangaroo will gather at the specific cell $(a,b)$. The length of the operating sequence cannot exceed $3(n-1)$.</p>

### 입력

<p>There is only one test case in each test file.</p>

<p>The first and only line of the input contains three integers $n$, $a$, $b$ ($2 \leq n \leq 500$, $ 1 \leq a,b \leq n$) indicating the size of the grid and the target cell.</p>

### 출력

<p>Output a string consisting only of characters &#39;U&#39;, &#39;D&#39;, &#39;L&#39; and &#39;R&#39; in one line. And its length mustn&#39;t exceed $3(n-1)$. It can be proved that the answer always exists.</p>