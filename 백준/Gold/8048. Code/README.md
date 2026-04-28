# [Gold I] Code - 8048

[문제 링크](https://www.acmicpc.net/problem/8048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 재귀, 트리

### 문제 설명

<p>A binary tree can either be empty or consist of one vertex, with two trees linked to it. These two trees are called a left and a right subtree. In each vertex there is one letter from the English alphabet. The vertex which is not a subtree of any vertex, is called a root. We say that a tree is a Binary Search Tree (BST) if for each vertex the following condition is satisfied: all letters in the left subtree precede in alphabetical order the letter in the root, and all letters from the right subtree follow the letter in the root. A code of a BST is:</p>

<p>&nbsp;&nbsp; &nbsp;either an empty string (containing 0 letters) when the tree is empty<br />
&nbsp;&nbsp; &nbsp;or a string beginning with the letter from the root, followed by the code of the left subtree, followed by the code of the right subtree.</p>

<p>Let us consider all -vertex BSTs containing in their vertices k initial letters of the English alphabet. Suppose we have a list of these codes written in alphabetical order. (n,k)-code is the n-th code on this list.</p>

<p>For example :&nbsp;</p>

<p>There are exactly fourteen 4-vertex BSTs. These are (in alphabetical order):</p>

<p>&nbsp;&nbsp; &nbsp;abcd abdc acbd adbc adcb bacd badc cabd cbad dabc dacb dbac dcab dcba</p>

<p>The string badc is the (7,4)-code and it corresponds to the BST printed below:<br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8048.%E2%80%85Code/42e3e0e6.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8048/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:133px; width:160px" /></p>

<p>
Write a program which:</p>

<ul>
	<li>reads the numbers &nbsp;and &nbsp;from the standard input,</li>
	<li>finds the (n,k)-code,</li>
	<li>writes it to the standard output.</li>
</ul>

### 입력

<p>In the first and only line of the standard input there are exactly two positive integers n and k, separated by a single space, 1 &le; k &le; 19. The number n is not greater than the number of codes of BST with k vertices.</p>

### 출력

<p>In the first and only line of the standard output there should be exactly one word (written in small letters) being the (n,k)-code.</p>

<p>&nbsp;</p>