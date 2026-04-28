# [Platinum I] Biochips - 11841

[문제 링크](https://www.acmicpc.net/problem/11841)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 223, 정답: 131, 맞힌 사람: 33, 정답 비율: 44.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Scientists discovered a biochip, which can divide itself into several new biochips. Herewith the parent-biochip disappears. Each biochip has its own size of memory, the size does not depend on the parent memory size. Then the biochip might be either used (stopping its division), or it will continue division in a similar manner.</p>

<p>Scientists prepared tree-like schemes of biochip-division process and they know the exact structure of the tree consisting of N elements, including the memory size of each of possible biochips descendants.</p>

<p>Make a program to choose from the tree exactly M biochips total memory size of which is the biggest possible. Pay attention to the fact that when we are choosing a biochip, we can&#39;t choose neither any of its ancestors nor descendants.</p>

### 입력

<p>The first line of input file contains two integers N and M - number of elements of the tree and number of biochips to be chosen (1 &le; N &le; 200 000, 1 &le; M &le; 500).</p>

<p>The following N lines contain two non-negative integers each: number of the parent in the tree and the size of the chip&#39;s memory x (0 &le; x &le; 1000). Each biochip has a unique number ranging from 1 to N inclusively. The line with i number includes information about a biochip with number i &minus; 1. Just one biochip doesn&#39;t have a parent and it&#39;s parent is written as 0.</p>

<p>It&#39;s guaranteed that it&#39;s possible to choose M biochips.</p>

### 출력

<p>Output file consists of one integer - maximal possible amount of memory of M chosen biochips.</p>