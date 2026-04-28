# [Silver II] Parse the Syntax Tree - 26450

[문제 링크](https://www.acmicpc.net/problem/26450)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 41, 맞힌 사람: 37, 정답 비율: 72.549%

### 분류

사칙연산, 그래프 이론, 그래프 탐색, 구현, 수학, 재귀

### 문제 설명

<p>To evaluate a program efficiently, a language processor often transforms it into a syntax tree. In this problem you are given a syntax tree of a mathematical expression using ASCII characters. Please evaluate the expression</p>

<p>The syntax tree we consider in this problem is a rooted binary tree where each node has either zero or two children. If a node has zero children, it is an integer node that corresponds to a single integer between 0 and 9, inclusive. On the other hand, if a node has two children, the node is a binary operation node that corresponds to a binary operation of either addition, subtraction or multiplication. In this case the left and right children correspond to the left and right operands of the binary operation, respectively. For example, Figure B.1 represents the syntax tree of expression $(9-4) * ((7*2)+5)$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26450.%E2%80%85Parse%E2%80%85the%E2%80%85Syntax%E2%80%85Tree/5812ed02.png" data-original-src="https://upload.acmicpc.net/40bd83b1-d6d8-4531-85d9-f150f7411ebd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure B.1: Example of a syntax tree</p>

<p>To represent such a syntax tree using ASCII characters, you are given $H$ strings of $W$ characters. Each character is either &lsquo;<code>+</code>&#39;, &lsquo;<code>-</code>&#39;, &lsquo;<code>*</code>&#39;, a digit between &lsquo;<code>0</code>&#39; and &lsquo;<code>9</code>&#39;, or a period that represents a blank. For example, here is the representation of the syntax tree of Figure B.1.</p>

<pre>
...*.....
.-.....+.
9.4..*..5
....7.2..</pre>

<p>Figure B.2 shows the rules (similar to Backus-Naur Form) of such representation of a syntax tree.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26450.%E2%80%85Parse%E2%80%85the%E2%80%85Syntax%E2%80%85Tree/8f3750e3.png" data-original-src="https://upload.acmicpc.net/8e59413d-69c0-4c8a-ae1d-a25c187704ec/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure B.2: Rules of the representation of a syntax tree</p>

<p>More precisely, the rules are defined as follows.</p>

<ul>
	<li>A &ldquo;cell&quot; is a rectangular region of characters that corresponds to a single node (i.e., either an integer node or a binary operation node) of a syntax tree.</li>
	<li>A cell corresponding to an integer node contains only a single digit that is the same integer of the node. The height and width of such a cell are 1.</li>
	<li>A cell $c$ corresponding to a binary operation node $v$ contains a single operator and two other cells as children. More precisely, let $v_1$ and $v_2$ be the left and right children of the binary operation node, respectively. And let $c_1$ and $c_2$ be the cells that correspond to $v_1$ and $v_2$, respectively. The height of $c$ is $\max{(h_1, h_2)} + 1$ where $h_1$ and $h_2$ are the heights of $c_1$ and $c_2$, respectively. On the other hand, the width of $c$ is $w_1 + w_2 + 1$ where $w_1$ and $w_2$ are the widths of $c_1$ and $c_2$, respectively. The topmost row of $c$ consists of $w_1$ periods followed by an operator followed by $w_2$ periods where the operator is either &lsquo;<code>+</code>&#39;, &lsquo;<code>-</code>&#39; or &lsquo;<code>*</code>&#39;. $c_1$ is located from the second to the $(h_1+1)$-st rows (from the top) and the first to the $w_1$-st columns (from the left) of $c$. Similarly, $c_2$ is located from the second to the $(h_2+1)$-st rows (from the top) and the $(w_1+2)$-nd to the $(w_1+w_2+1)$-st columns (from the left) of $c$. Note that although $c_1$ and $c_2$ may have different heights, their top borders are always aligned.</li>
	<li>It is guaranteed by the above rules that no two cells <em>partially</em> overlap each other. In other words, when two cells overlap, then one of them completely contains the other.</li>
	<li>Any other characters that are not restricted by the above rules are filled by periods.</li>
	<li>The entire region of characters is the &ldquo;root&quot; cell. In other words, the cell corresponding to the root node of the syntax tree has height $H$ and width $W$.</li>
</ul>

<p>Your task is to calculate the mathematical expression that corresponds to the given syntax tree formatted by the above rules.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$H$ $W$</p>

<p>$s_1$</p>

<p>$\vdots$</p>

<p>$s_H$</p>
</blockquote>

<p>The first line contains two integers $H$ and $W$ ($1 \le H, W \le 37$), which represent the height and width of the representation of the given syntax tree. The following $H$ lines consist of strings of length $W$ where each character is either &lsquo;<code>+</code>&#39;, &lsquo;<code>-</code>&#39;, &lsquo;<code>*</code>&#39;, a digit between &lsquo;<code>0</code>&#39; and &lsquo;<code>9</code>&#39;, or a period. It is guaranteed that these strings represent a syntax tree of a mathematical expression in a valid form.</p>

### 출력

<p>Print the calculation result of the mathematical expression that corresponds to the given input.</p>