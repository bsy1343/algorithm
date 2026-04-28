# [Platinum II] Maximal Orders of Permutations - 7996

[문제 링크](https://www.acmicpc.net/problem/7996)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 34, 맞힌 사람: 21, 정답 비율: 29.167%

### 분류

수학, 배낭 문제, 순열 사이클 분할

### 문제 설명

<p>A permutation of n elements is a one-to-one function (injection) &pi;:{1,2,&hellip;,n}⟼{1,2,&hellip;,n}. An order of permutation &pi; is the minimal k &ge; 1, such that for all i=1,2,&hellip;,n we have:</p>

<p>&pi;(&pi;(&hellip;(&pi;(i))&hellip;))=i</p>

<p>i.e. &pi; composed with itself k times becomes identity function. For example, the order of the permutation of 3 elements &pi;(1)=3,&pi;(2)=2,&pi;(3)=1 is 2, because &pi;(&pi;(1))=1,&pi;(&pi;(2))=2,&pi;(&pi;(3))=3.</p>

<p>For a given n let us consider permutations of n-elements having the the largest order possible. For example, the maximal order of a permutation of 5 elements is 6. An example of a permutation of 5 elements whose order is 6 is &pi;(1)=4,&pi;(2)=5,&pi;(3)=2,&pi;(4)=1,&pi;(5)=3.</p>

<p>Among all permutations of n elements having the maximal order, we would like to find the earliest one (in a lexicographical order). Being more precise, we say a permutation &pi; of n elements is earlier than a permutation &sigma; of n elements, if there exists i, such that &pi;(j)= &sigma;(j) for all j &lt; i and &pi;(i) &lt; &sigma;(i). The earliest permutation of 5 elements having an order 6 is &pi;(1)=2,&pi;(2)=1,&pi;(3)=4,&pi;(4)=5,&pi;(5)=3.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input a set of integers n<sub>1</sub>,n<sub>2</sub>,&hellip;,n<sub>d</sub>,</li>
	<li>for each number n<sub>i</sub>(for i=1,2,&hellip;,d) determines the earliest permutation of ni elements having the maximal order,</li>
	<li>writes the determined permutations to the standard output.</li>
</ul>

### 입력

<p>There is one positive integer d in the first line of the standard input, 1 &le; d &le; 10. In the following d lines there are positive integers n<sub>1</sub>,n<sub>2</sub>,&hellip;,n<sub>d</sub>, one per line, 1 &le; n<sub>i</sub> &le; 10,000.</p>

### 출력

<p>Your programme should write d lines to the standard output. The i&rsquo;th line should contain a sequence of integers separated by spaces, forming the least permutation of n<sub>i</sub> elements having the maximal order, i.e. the sequence &pi;(1),&pi;(2),&hellip;,&pi;(n<sub>i</sub>), where p denotes this permutation.</p>