# [Gold II] All in the Family - 21150

[문제 링크](https://www.acmicpc.net/problem/21150)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 26, 맞힌 사람: 9, 정답 비율: 28.125%

### 분류

많은 조건 분기, 자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 구현, 최소 공통 조상, 트리, 집합과 맵

### 문제 설명

<p>The scientists working at the Family Genetics Institute are tracing the spread of a hereditary disease through family trees. &nbsp;They have started by listing the family members that have the disease, and the parent who passed the disease on to each child (we will assume that each child gets the disease from only one parent). &nbsp;However, the scientists are confused about the names of different family relationships. &nbsp;Parents, grandparents, and siblings they have a handle on. &nbsp;But a relationship like &quot;third cousin, twice removed&quot; has been hard for them to wrap their heads around. &nbsp; After much discussion they came up with some definitions that cleared things up.</p>

<p>Suppose we have two people conveniently named $A$ and $B$ and their closest common ancestor is named $C$ (what are the odds!). &nbsp;We say that $A$ is <em>$m$ generations removed from $C$\/</em> if there are $m$ direct descendants from $C$ ending with $A$. &nbsp;Thus if $A$ is the daughter of $C$ she is $1$ generation removed; if she is the granddaughter of $C$ she is $2$ generations removed, and so on. &nbsp;Any person is $0$ generations removed from themselves.</p>

<p>Now let $A$ be $m$ generations removed from $C$ and $B$ be $n$ generations removed from $C$ where $m \leq n$. &nbsp;We can determine the relationship between $A$ and $B$ using the following rules:</p>

<ol>
	<li>if $m = 0$ then $B$ is the child of $A$ if $n=1$ or the $\mbox{great}^{n-2}$ grandchild of $A$ if $n &gt; 1$.</li>
	<li>if $0 &lt; m = n$ then $A$ and $B$ are siblings if $n=1$ or $(n-1)$-th cousins if $n &gt; 1$.</li>
	<li>if $0 &lt; m &lt; n$ then $A$ and $B$ are $(m-1)$-th cousins $(n-m)$ times removed.</li>
</ol>

<p>Notice that if $m = 1$ and $n = 2$ we get the interestingly named &quot;$0$th cousins, $1$ time removed&quot; for the relationships we typically describe as &quot;aunt/uncle&quot; or &quot;niece/nephew&quot;.</p>

<p>Figure 1 below shows some examples for two new people named (what else) $D$ and $E$.</p>

<table class="table table-bordered table-center-70 th-center">
	<thead>
		<tr>
			<th colspan="2"># of generations removed&nbsp;from common ancestor</th>
			<th rowspan="2">Relationship</th>
		</tr>
		<tr>
			<th>$D$</th>
			<th>$E$</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>$0$</th>
			<th>$1$</th>
			<td>$E$ is the child of $D$</td>
		</tr>
		<tr>
			<th>$4$</th>
			<th>$0$</th>
			<td>$D$ is the great great grandchild of $E$</td>
		</tr>
		<tr>
			<th>$3$</th>
			<th>$3$</th>
			<td>$D$ and $E$ are $2$nd cousins</td>
		</tr>
		<tr>
			<th>$9$</th>
			<th>$8$</th>
			<td>$D$ and $E$ are $7$th cousins, $1$ time removed</td>
		</tr>
		<tr>
			<th>$1$</th>
			<th>$4$</th>
			<td>$D$ and $E$ are $0$th cousins, $3$ times removed</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure 1:&nbsp;Some example relationships</p>

<p>The scientists have given you the description of a family tree and pairs of people in the tree and have asked you to determine the relationships between members of each pair.</p>

### 입력

<p>Input begins with a line containing two positive integers $t$ $p$ ($t \leq 100, p \leq 1\,000$) specifying the &nbsp;number of tree descriptions (described below) and the number of query pairs. &nbsp;Following these are $t$ lines, each with one tree description. &nbsp;Each tree description will be of the form $s_0$ $d$ $s_1$ $s_2 \ldots s_d$ indicating that person $s_0$ has $d$ children named $s_1$ through $s_d$. &nbsp;All names are unique and contain only alphabetic characters. &nbsp;Tree descriptions may be given in any order (i.e., the root of the entire tree may not necessarily be in the very first tree description). &nbsp;No name will appear more than once as $s_0$ in the tree descriptions. &nbsp;All the tree descriptions will combine to form exactly one tree, and the tree will have at least $2$ nodes and at most $100$ nodes.</p>

<p>Following this are $p$ lines of the form $s_i$ $s_j$ where $s_i \neq s_j$ and both names are guaranteed to be in the tree.</p>

### 출력

<p>Output the relationship for each pair of people, one per line, using the formats shown in Figure 1. &nbsp;Always output $s_i$&#39;s name first for each pair except when $s_j$ is the direct descendant of $s_i$ (as in the first example in Figure 1). &nbsp;For the $n$-th ordinal number output <code>$n$th</code> except for $n=1,2,3,21,22,23,31,32,33,\ldots$ &nbsp;in which case you should output <code>1st</code>, <code>2nd</code>, <code>3rd</code>, <code>21st</code>, <code>22nd</code>, <code>23rd</code>, <code>31st</code>, <code>32nd</code>, <code>33rd</code>, etc. &nbsp;Also be sure to use <code>times</code> for all times removed except one, where you should use the word <code>time</code>.</p>