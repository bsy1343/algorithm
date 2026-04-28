# [Platinum V] Inverting Huffman - 9533

[문제 링크](https://www.acmicpc.net/problem/9533)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 91, 정답: 17, 맞힌 사람: 17, 정답 비율: 28.814%

### 분류

자료 구조, 그리디 알고리즘

### 문제 설명

<p>Static Huffman coding is an encoding algorithm used mainly for text compression. Given a text of certain size made of N different characters, the algorithm chooses N codes, one for each different character. The text is compressed using these codes. To choose the codes, the algorithm builds a binary rooted tree having N leaves. For N &ge; 2 the tree can be built as follows.</p>

<ol>
	<li>For each different character in the text build a tree containing just a single node, and assign to it a weight coincident with the number of occurrences of the character within the text.</li>
	<li>Build a set s containing the above N trees.</li>
	<li>While s contains more than one tree:
	<ol style="list-style-type:lower-alpha">
		<li>Choose t1 &isin; s with minimum weight and remove it from s.</li>
		<li>Choose t2 &isin; s with minimum weight and remove it from s.</li>
		<li>Build a new tree t with t1 as its left subtree and t2 as its right subtree, and assign to t the sums of the weights of t1 and t2.</li>
		<li>Include t into s.</li>
	</ol>
	</li>
	<li>Return the only tree that remains in s.</li>
</ol>

<p>For the text &ldquo;abracadabra&rdquo;, the tree produced by the above procedure can look like the one on the left of the following picture, where each internal node is labeled with the weight of the subtree rooted at that node. Notice that the obtained tree can also look like the one on the right of the picture, among others, because at steps 3a and 3b the set s may contain several trees with minimum weight.</p>

<p><img alt="" src="/upload/images2/inverthuff.png" style="height:180px; width:525px" /></p>

<p>For each different character in the text, its code depends on the path that exists, in the final tree, from the root to the leaf corresponding to the character. The length of the code is the number of edges in that path (which is coincident with the number of internal nodes in the path). Assuming the tree on the left was built by the algorithm, the code for &ldquo;r&rdquo; has length 3 while the code for &ldquo;d&rdquo; has length 4.</p>

<p>Your task is, given the lengths of the N codes chosen by the algorithm, find the minimum size (total number of characters) that the text can have so as the generated codes have those N lengths.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 50) representing the number of different characters that appear in the text. The second line contains N integers L<sub>i</sub> indicating the lengths of the codes chosen by Huffman algorithm for the different characters (1 &le; L<sub>i</sub> &le; 50 for i = 1, 2, ... , N). You may assume that there exists at least one tree, built as described, that produces codes with the given lengths</p>

### 출력

<p>Output a line with an integer representing the minimum size (total number of characters) that the text can have so as the generated codes have the given lengths.</p>