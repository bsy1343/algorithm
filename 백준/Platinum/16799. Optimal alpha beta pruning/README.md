# [Platinum I] Optimal alpha beta pruning - 16799

[문제 링크](https://www.acmicpc.net/problem/16799)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Fox Ciel is developing an artificial intelligence (AI) for a game. This game is described as a game tree T with n vertices. Each node in the game has an evaluation value which shows how good a situation is. This value is the same as maximum value of child nodes&rsquo; values multiplied by -1. Values on leaf nodes are evaluated with Ciel&rsquo;s special function -- which is a bit heavy. So, she will use alpha-beta pruning for getting root node&rsquo;s evaluation value to decrease the number of leaf nodes to be calculated.</p>

<p>By the way, changing evaluation order of child nodes affects the number of calculation on the leaf nodes. Therefore, Ciel wants to know the minimum and maximum number of times to calculate in leaf nodes when she could evaluate child node in arbitrary order. She asked you to calculate minimum evaluation number of times and maximum evaluation number of times in leaf nodes.</p>

<p>Ciel uses following algotithm:</p>

<pre>
function negamax(node, &alpha;, &beta;)
    if node is a terminal node
        return value of leaf node
    else
        foreach child of node
            val := -negamax(child, -&beta;, -&alpha;)
            if val &gt;= &beta;
                return val
            if val &gt; &alpha;
                &alpha; := val
        return &alpha;
</pre>

<p>[NOTE] <a href="http://en.wikipedia.org/wiki/Negamax">negamax algorithm</a></p>

### 입력

<p>Input follows following format:</p>

<pre>
<var>n</var>
<var>p<sub>1</sub></var> <var>p<sub>2</sub></var> ... <var>p<sub>n</sub></var>
<var>k<sub>1</sub></var> <var>t<sub>11</sub></var> <var>t<sub>12</sub></var> ... <var>t<sub>1k</sub></var>
:
:
<var>k<sub>n</sub></var> <var>t<sub>n1</sub></var> <var>t<sub>n2</sub></var> ... <var>t<sub>nk</sub></var>
</pre>

<p>The first line contains an integer <var>n</var>, which means the number of vertices in game tree T. The second line contains <var>n</var> integers <var>p<sub>i</sub></var>, which means the evaluation value of vertex <var>i</var>. Then, next <var>n</var> lines which contain the information of game tree T. <var>k<sub>i</sub></var> is the number of child nodes of vertex <var>i</var>, and <var>t<sub>ij</sub></var> is the indices of the child node of vertex <var>i</var>.</p>

<p>Input follows following constraints:</p>

<ul>
	<li><var>2 &le; n &le; 100</var></li>
	<li><var>-10,000 &le; p<sub>i</sub> &le; 10,000</var></li>
	<li><var>0 &le; k<sub>i</sub> &le; 5</var></li>
	<li><var>2 &le; t<sub>ij</sub> &le; n</var></li>
	<li>Index of root node is <var>1</var>.</li>
	<li>Evaluation value except leaf node is always <var>0</var>. This does not mean the evaluation values of non-leaf nodes are <var>0</var>. You have to calculate them if necessary.</li>
	<li>Leaf node sometimes have evaluation value of <var>0</var>.</li>
	<li>Game tree T is tree structure.</li>
</ul>

### 출력

<p>Print the minimum evaluation number of times and the maximum evaluation number of times in leaf node. Please separated by whitespace between minimum and maximum.</p>

<pre>
minimum maximum</pre>