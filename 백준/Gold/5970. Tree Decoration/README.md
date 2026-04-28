# [Gold III] Tree Decoration - 5970

[문제 링크](https://www.acmicpc.net/problem/5970)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 22, 맞힌 사람: 21, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John is decorating his Spring Equinox Tree (like a Christmas tree but popular about three months later). It can be modeled as a rooted mathematical tree with N (1 &lt;= N &lt;= 100,000) elements, labeled 1...N, with element 1 as the root of the tree. Each tree element e &gt; 1 has a parent, P_e (1 &lt;= P_e &lt;= N). Element 1 has no parent (denoted &#39;-1&#39; in the input), of course, because it is the root of the tree.</p>

<p>Each element i has a corresponding subtree (potentially of size 1) rooted there. FJ would like to make sure that the subtree corresponding to element i has a total of at least C_i (0 &lt;= C_i &lt;= 10,000,000) ornaments scattered among its members. He would also like to minimize the total amount of time it takes him to place all the ornaments (it takes time K*T_i to place K ornaments at element i (1 &lt;= T_i &lt;= 100)).</p>

<p>Help FJ determine the minimum amount of time it takes to place ornaments that satisfy the constraints. &nbsp;Note that this answer might not fit into a 32-bit integer, but it will fit into a signed 64-bit integer.</p>

<p>For example, consider the tree below where nodes located higher on the display are parents of connected lower nodes (1 is the root):</p>

<pre>
               1 
               |
               2
               |
               5
              / \
             4   3</pre>

<p>Suppose that FJ has the following subtree constraints:</p>

<pre>
                  Minimum ornaments the subtree requires
                    |     Time to install an ornament
       Subtree      |       |
        root   |   C_i  |  T_i
       --------+--------+-------
          1    |    9   |   3
          2    |    2   |   2
          3    |    3   |   2
          4    |    1   |   4
          5    |    3   |   3</pre>

<p>Then FJ can place all the ornaments as shown below, for a total cost of 20:</p>

<pre>
            1 [0/9(0)]     legend: element# [ornaments here/
            |                      total ornaments in subtree(node install time)]
            2 [3/9(6)]
            |
            5 [0/6(0)]
           / \
 [1/1(4)] 4   3 [5/5(10)]</pre>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains three space-separated integers: P_i, C_i, and T_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer: The minimum time to place all the ornaments</li>
</ul>

<p>&nbsp;</p>