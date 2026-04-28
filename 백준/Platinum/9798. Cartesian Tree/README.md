# [Platinum V] Cartesian Tree - 9798

[문제 링크](https://www.acmicpc.net/problem/9798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 143, 정답: 66, 맞힌 사람: 54, 정답 비율: 56.250%

### 분류

자료 구조, 트리, 세그먼트 트리, 집합과 맵, 스택, 데카르트 트리

### 문제 설명

<p>Let us consider a special type of a binary search tree, called a cartesian tree. Recall that a binary search tree is a rooted ordered binary tree, such that for its every node x the following condition is satisfied: each node in its left subtree has the key less then the key of x, and each node in its right subtree has the key greater then the key of x.</p>

<p>That is, if we denote left subtree of the node x by L(x), its right subtree by R(x) and its key by k<sub>x</sub> then for each node x we have</p>

<ul>
	<li>if y &isin; L(x) then k<sub>y</sub> &lt; k<sub>x</sub></li>
	<li>if z &isin; R(x) then k<sub>z</sub> &gt; k<sub>x</sub></li>
</ul>

<p>The binary search tree is called cartesian if its every node x in addition to the main key k<sub>x</sub> also has an auxiliary key that we will denote by a<sub>x</sub>, and for these keys the heap condition is satisfied, that is</p>

<ul>
	<li>if y is the parent of x then a<sub>y</sub> &lt; a<sub>x</sub></li>
</ul>

<p>Thus a cartesian tree is a binary rooted ordered tree, such that each of its nodes has a pair of two keys (k, a) and three conditions described are satisfied.</p>

<p>Given a set of pairs, construct a cartesian tree out of them, or detect that it is not possible.</p>

### 입력

<p>The first line of the input file contains an integer number N -- the number of pairs you should build cartesian tree out of (1 &le; N &le; 50 000). The following N lines contain two numbers each -- given pairs (k<sub>i</sub>, a<sub>i</sub>). For each pair |k<sub>i</sub>|, |a<sub>i</sub>| &le; 30 000. All main keys and all auxiliary keys are different, i.e. k<sub>i</sub> &ne;&nbsp;k<sub>j</sub> and a<sub>i</sub> &ne; a<sub>j</sub> for each i &ne; j.</p>

### 출력

<p>On the first line of the output file print YES if it is possible to build a cartesian tree out of given pairs or NO if it is not. If the answer is positive, on the following N lines output the tree. Let nodes be numbered from 1 to N corresponding to pairs they contain as they are given in the input file. For each node output three numbers -- its parent, its left child and its right child. If the node has no parent or no corresponding child, output 0 instead.</p>

<p>The input ensure these is only one possible tree.</p>