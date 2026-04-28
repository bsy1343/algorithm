# [Silver I] A Rational Sequence - 11526

[문제 링크](https://www.acmicpc.net/problem/11526)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 126, 정답: 104, 맞힌 사람: 85, 정답 비율: 90.426%

### 분류

수학, 재귀

### 문제 설명

<p>A sequence of positive rational numbers is defined as follows:</p>

<p>An infinite full binary tree labeled by positive rational numbers is defined by:</p>

<ul>
	<li>The label of the root is 1/1.</li>
	<li>The left child of label p/q is p/(p+q).</li>
	<li>The right child of label p/q is (p+q)/q.</li>
</ul>

<p>The top of the tree is shown in the following figure:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/11526.%E2%80%85A%E2%80%85Rational%E2%80%85Sequence/f7ce5e1b.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/11526.%E2%80%85A%E2%80%85Rational%E2%80%85Sequence/f7ce5e1b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11526/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:291px; width:564px" /></p>

<p>The sequence is defined by doing a level order (breadth first) traversal of the tree (indicated by the light dashed line). So that:</p>

<p>F(1) = 1/1, F(2) = 1/2, F(3) = 2/1, F(4) = 1/3, F(5) = 3/2, F(6) = 2/3, &hellip;</p>

<p>Write a program which finds the value of n for which F(n) is p/q for inputs p and q.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, a single space, the numerator, p, a forward slash (/) and the denominator, q, of the desired fraction.</p>

### 출력

<p>For each data set there is a single line of output. It contains the data set number, K, followed by a single space which is then followed by the value of n for which F(n) is p/q. Inputs will be chosen so n will fit in a 32-bit integer.</p>