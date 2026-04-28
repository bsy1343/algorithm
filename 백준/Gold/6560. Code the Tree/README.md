# [Gold IV] Code the Tree - 6560

[문제 링크](https://www.acmicpc.net/problem/6560)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 103, 정답: 28, 맞힌 사람: 23, 정답 비율: 37.097%

### 분류

구현, 그래프 이론, 자료 구조, 문자열, 트리, 시뮬레이션, 파싱, 스택

### 문제 설명

<p>A tree (i.e. a connected graph without cycles) with vertices numbered by the integers <em>1, 2, ..., n</em> is given. The &quot;Prufer&quot; code of such a tree is built as follows: the leaf (a vertex that is incident to only one edge) with the minimal number is taken. This leaf, together with its incident edge is removed from the graph, while the number of the vertex that was adjacent to the leaf is written down. In the obtained graph, this procedure is repeated, until there is only one vertex left (which, by the way, always has number <em>n</em>). The written down sequence of <em>n-1</em> numbers is called the Prufer code of the tree.</p>

<p>Your task is, given a tree, to compute its Prufer code. The tree is denoted by a word of the language specified by the following grammar:</p>

<pre>
T ::= &quot;(&quot; N S &quot;)&quot;
S ::= &quot; &quot; T S
    | empty
N ::= number
</pre>

<p>That is, trees have parentheses around them, and a number denoting the identifier of the root vertex, followed by arbitrarily many (maybe none) subtrees separated by a single space character. As an example, take a look at the tree in the figure below which is denoted in the first line of the sample input. To generate further sample input, you may use your solution to Problem D.</p>

<p>&nbsp;</p>

<p>Note that, according to the definition given above, the root of a tree may be a leaf as well. It is only for the ease of denotation that we designate some vertex to be the root. Usually, what we are dealing here with is called an &quot;unrooted tree&quot;.</p>

### 입력

<p>The input contains several test cases. Each test case specifies a tree as described above on one line of the input file. Input is terminated by EOF. You may assume that <em>1&lt;=n&lt;=50</em>.</p>

### 출력

<p>For each test case generate a single line containing the Prufer code of the specified tree. Separate numbers by a single space. Do not print any spaces at the end of the line</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6560.%E2%80%85Code%E2%80%85the%E2%80%85Tree/14ba1a54.gif" data-original-src="https://www.acmicpc.net/upload/images2/code.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:159px; width:222px" /></p>