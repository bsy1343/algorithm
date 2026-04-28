# [Gold II] Trees - 23425

[문제 링크](https://www.acmicpc.net/problem/23425)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

그리디 알고리즘, 정렬, 문자열, 트리

### 문제 설명

<p>Vasya has gone deep into the graph theory. He&#39;s read a chapter about trees, and a problem has been bothering him: he must build a rooted tree with $N$ nodes, with each node, except the leaf nodes, having strictly $K$ children. The answer must be written as a list of edges; of all possible variants, he must find the lexicographically minimal one.</p>

<p>The list of edges is written into a string in the following manner. Each edge is described by a pair of integers --- the numbers of nodes, which the edge connects. These two numbers must be written without leading zeroes, and there must be strictly one space character between them. The string consists of the descriptions of all $N-1$ edges of the graph, written consecutively and separated by a single space character. It is assumed that all nodes are numbered from $1$ to $N$, the root being number $1$.</p>

<p>Vasya must find a lexicographically minimal string, which can be obtained in this manner for a rooted tree of the required kind. In lexicographical comparison assume that the space as a character is smaller than all digits.</p>

<p>For instance, let&#39;s build a tree with $5$ nodes, with all non-leaf nodes having $2$ children. A tree with edges $(1, 4), (1, 5), (4, 3), (4, 2)$ fits the requirement. The list of its edges can be written in a string in different ways:</p>

<ul>
	<li><code>4 2 4 3 1 4 1 5</code></li>
	<li><code>2 4 3 4 1 4 1 5</code></li>
	<li><code>1 4 1 5 2 4 3 4</code></li>
</ul>

<p>Here, each variant is smaller than the preceding one, but none are optimal. With these values of $N$ and $K$ the lexicographically minimal string <code>1 2 1 3 2 4 2 5</code> is produced by a different tree.</p>

<p>Help Vasya solve this task, he&#39;s got a test on graph theory coming up!</p>

### 입력

<p>The first line of the input file contains two integers $N$ and $K$, where $N$ --- is the number of nodes in the required tree, $K$ --- is the number of children of non-leaf nodes ($2 \le N \le 10^5$, $1 \le K \le 10^5$).</p>

### 출력

<p>If the tree with the specified parameters does not exist, print the word <code>No</code> into the only line of the output file.</p>

<p>Otherwise, in the first line of the output file, print the word <code>Yes</code>; in the second line, print the required lexicographically minimal string.</p>