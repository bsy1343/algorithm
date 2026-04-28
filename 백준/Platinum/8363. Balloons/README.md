# [Platinum I] Balloons - 8363

[문제 링크](https://www.acmicpc.net/problem/8363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 22, 맞힌 사람: 13, 정답 비율: 39.394%

### 분류

수학, 자료 구조, 세그먼트 트리, 두 포인터

### 문제 설명

<p>A group of children came to a toy store. Each of them would like to buy a number of balloons. The children like diversity - none of them wants to have two balloons of the same colour. Help the shop-assistant to check whether orders of all children can be completed within the current assortment of the store.</p>

<p>Write a program that:</p>

<ul>
	<li>reads a description of the store&#39;s assortment and the orders made by children from the standard input,</li>
	<li>checks whether all children can be made happy,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(1 &le; <em>n</em> &le; 200 000, 2 &le; <em>m</em> &le; 200 000), separated by a single space and denoting the number of different colours of balloons that are present in the store and the number of children. The second line of input contains <em>n</em>&nbsp;integers <em>a<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 1 000 000&nbsp;for 1 &le; <em>i</em> &le; <em>n</em>), separated by single spaces and denoting the quantities of balloons of respective colours. The third line of input contains <em>m</em>&nbsp;integers <em>b<sub>i</sub></em>&nbsp;(1 &le; <em>b<sub>i</sub></em> &le; 1 000 000&nbsp;for 1 &le; <em>i</em> &le; <em>m</em>), separated by single spaces and denoting the orders of respective children; <em>b<sub>i</sub></em> = <em>k</em>&nbsp;means that the <em>i</em>-th child would like to buy <em>k</em>&nbsp;balloons, all having different colours.</p>

### 출력

<p>The first and only line of output should contain a single word&nbsp;<code>TAK</code>&nbsp;(i.e.&nbsp;<i>yes</i>&nbsp;in Polish), if orders of all children can be completed, and&nbsp;<code>NIE</code>&nbsp;(i.e.&nbsp;<i>no</i>&nbsp;in Polish) otherwise.</p>