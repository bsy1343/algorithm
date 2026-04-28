# [Platinum V] Automorphisms - 8046

[문제 링크](https://www.acmicpc.net/problem/8046)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 14, 맞힌 사람: 9, 정답 비율: 18.750%

### 분류

수학, 애드 혹, 조합론, 순열 사이클 분할

### 문제 설명

<p>A tournament is a directed graph in which:</p>

<ul>
	<li>for each two different vertices &nbsp;and &nbsp;there exsits exactly one edge between them (i.e. either u&rarr;v or v&rarr;u),</li>
	<li>there are no loops (i.e. for each vertex u there is no edge u&rarr;u).</li>
</ul>

<p>Let p denote any permutation of the set of tournament&#39;s vertices. (A permutation of a finite set is an injective function from X to X.) The permutation p is called an automorphism, if for each two different vertices u and v the direction of the edge between u and v is the same as the direction of the edge between p(u) and p(v) (i.e. u&rarr;v is an edge in the tournament if and only if p(u)&rarr;p(v) is an edge in this tournament). For a given permutation p, we want to know for how many tournaments this permutation is an automorphism.</p>

<p>Let&#39;s take the set of vertices 1,&hellip;,4 and the permutation p: p(1)=2, p(2)=4, p(3)=3, p(4)=1. There are only four tournaments for which this permutation is an automorphism:</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8046/1.gif" style="height:91px; width:395px" /></p>

<p>Write a program which:</p>

<ul>
	<li>reads the description of a permutation of an n-element set from the standard input,</li>
	<li>computes t, the number of different n-element tournaments for which this permutation is an automorphism,</li>
	<li>writes to the standard output the remainder of dividing t by 1,000</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n, 1 &le; n &le; 10,000, which is the number of vertices. In the following n lines there is a description of a permutation p. We assume that vertices are numbered from 1 to n. In line (k+1) there is a value of the permutation p for the vertex k (i.e. the value p(k)).</p>

### 출력

<p>In the first and only line of the standard output there should be one integer equal to the remainder of dividing t (the number of different n-vertex tournaments for which p is an automorphism) by 1,000.</p>