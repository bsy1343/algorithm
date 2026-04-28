# [Platinum II] Ah, It's Yesterday Once More - 21252

[문제 링크](https://www.acmicpc.net/problem/21252)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 6, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

애드 혹, 무작위화

### 문제 설명

<p>In 2018, hosted by Nanjing University of Aeronautics and Astronautics (NUAA), the <em>International Collegiate Programming Contest</em> (ICPC) regional was held in Nanjing again after a few years&#39; gap. There were over $400$ teams in the contest and team <em>Power of Two</em> from Tsinghua University won the champion.</p>

<p>Two years have passed and after the great success in 2018 and 2019, NUAA continues to hold the ICPC Nanjing Regional in 2020. Although we can&#39;t gather in Nanjing this time due to the pandemic, we should still be grateful for the hard work done by all staff and volunteers for this contest. Thank you all for your great contribution to this contest!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21252.%E2%80%85Ah%2C%E2%80%85It's%E2%80%85Yesterday%E2%80%85Once%E2%80%85More/cb106066.png" data-original-src="https://upload.acmicpc.net/9e1af66b-3e67-4d6b-bd86-7d582a4b848f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 341px;" /></p>

<p style="text-align: center;">The 2018 ICPC Asia Nanjing Regional Contest</p>

<p>In the 2018 contest, problem K, <em>Kangaroo Puzzle</em>, requires the contestants to construct an operation sequence for the game. Let&#39;s first recall the content of that problem:</p>

<blockquote>
<p>The puzzle is a grid with $n$ rows and $m$ columns ($1 \le n, m \le 20$) and there are some (at least $2$) kangaroos standing in the puzzle. The player&#39;s goal is to control them to get together. There are some walls in some cells and the kangaroos cannot enter the cells with walls. The other cells are empty. The kangaroos can move from an empty cell to an adjacent empty cell in four directions: up, down, left, and right. It&#39;s guaranteed that kangaroos can reach from any empty cell to any other empty cells by going through adjacent empty cells. It is also guaranteed that there is no cycle in the puzzle -- that is, it&#39;s impossible that one kangaroo can move from an empty cell, pass by several distinct empty cells, and then back to the original cell.</p>

<p>There is exactly one kangaroo in every empty cell in the beginning and the player can control the kangaroos by pressing the button U, D, L, R on the keyboard. The kangaroos will move simultaneously according to the button you press. For instance, if you press the button R, a kangaroo would move one cell to the right if it exists and is empty, and will stay still if it does not exist or is not empty.</p>

<p>In this problem, the contestant needs to construct an operating sequence of at most $5 \times 10^4$ steps consisting of U, D, L, R only. If after operating these steps in order there are still two kangaroos standing in different cells, the contestant will be given a &quot;Wrong Answer&quot; verdict.</p>
</blockquote>

<p>Our dear friend, Kotori, also took part in the contest and submitted a code of randomized algorithm. To her surprise, this simple solution is judged as a correct answer. We now present her solution as follows:</p>

<pre>
#include &lt;bits/stdc++.h&gt;
char s[5] = &#39;UDLR&#39;;
using namespace std;
int main()
{
  srand(time(NULL));
  for (int i = 1; i &lt;= 50000; i++) putchar(s[rand() % 4]);
  return 0;
}</pre>

<p>For contestants who are not familiar with C and C++: the above code will output a random string of length $5 \times 10^4$ consisting only of characters &#39;U&#39;, &#39;D&#39;, &#39;L&#39; and &#39;R&#39;, where each character has equal probability to appear in each position in the string.</p>

<p>Kotori suspects that things might not be that simple for this problem, so right now, in this <em>2020 ICPC Nanjing Regional</em> contest, you need to construct an input data to hack her solution. Due to the randomness, your input data only needs to satisfy a successful hacking rate of at least $25\%$. Formally speaking, we&#39;ve prepared $500$ randomly generated string according Kotori&#39;s code and will use them as the controlling sequence against your answer. For your answer to be accepted there should be at least $125$ times that after using your answer as the map of cells and the whole controlling sequence is executed, there are still kangaroos in different cells.</p>

<p>Note that your input data should be completely legal. That is to say,</p>

<ul>
	<li>The map in your answer should not be larger than $20 \times 20$;</li>
	<li>Your answer should contain at least two empty cells;</li>
	<li>All empty cells in your answer should be reachable starting from any empty cell;</li>
	<li>No cycles consisting of empty cells are allowed.</li>
</ul>

### 입력

<p>There is no input for this problem. You&#39;re on your own!</p>

### 출력

<p>You should first output one line containing two integers $n$ and $m$ ($1 \le n, m \le 20$) separated by a space, indicating the number of rows and columns of the map in your answer.</p>

<p>You should then output $n$ lines where the $i$-th line contains a binary string $s_{i,1}s_{i,2}\cdots s_{i,m}$ ($s_{i,j} \in \{\text{&#39;0&#39;}, \text{&#39;1&#39;}\}$) of length $m$. If $s_{i,j} = \text{&#39;1&#39;}$ then the cell in the $i$-th row and the $j$-th column is empty; Otherwise that corresponding cell contains a wall and cannot be entered.</p>

<p>Note again that your answer only need to achieve a successful hacking rate of at least $25\%$. Not that hard isn&#39;t it?</p>

### 힌트

<p>The sample output we provide you is (obviously) incorrect. It only serves the purpose of showing you the output format. This is a $3 \times 4$ map with $4$ walls, so there will be $8$ kangaroos in the empty cells at the beginning.</p>