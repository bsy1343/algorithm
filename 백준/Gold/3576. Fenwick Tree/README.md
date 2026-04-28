# [Gold I] Fenwick Tree - 3576

[문제 링크](https://www.acmicpc.net/problem/3576)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 139, 정답: 70, 맞힌 사람: 47, 정답 비율: 47.959%

### 분류

그리디 알고리즘, 해 구성하기, 비트마스킹

### 문제 설명

<p>Fenwick tree is a data structure effectively supporting <em>prefix sum</em> queries.</p>

<p>For a number $t$ denote as $h(t)$ maximal $k$ such that $t$ is divisible by $2^k$. For example, $h(24) = 3$, $h(5) = 0$. Let $l(t) = 2^{h(t)}$, for example, $l(24) = 8, l(5) = 1$.</p>

<p>Consider array $a[1], a[2], \dots , a[n]$ of integer numbers. Fenwick&nbsp;tree for this array is the array $b[1], b[2], \dots&nbsp;, b[n]$ such that $$b[i] = \sum_{j=i-l(i)+1}^{i}{a[j]}\text{.}$$</p>

<p>So</p>

<p>$$\begin{align*}&amp; b[1] = a[1], \\ &amp; b[2] = a[1] + a[2], \\ &amp; b[3] = a[3], \\ &amp; b[4] = a[1] + a[2] + a[3] + a[4], \\ &amp; b[5] = a[5], \\ &amp; b[6] = a[5] + a[6], \\ &amp; \ldots \end{align*}$$</p>

<p>For example, the Fenwick tree for the array $$a = (3,&minus;1,4,1,&minus;5,9)$$ is the array $$&nbsp;b = (3,2,4,7,&minus;5,4)\text{.}$$</p>

<p>Let us call an array <em>self-fenwick</em> if it coincides with its Fenwick tree. For example, the array above is not self-fenwick, but the array a = (0, &minus;1, 1, 1, 0, 9) is self-fenwick.</p>

<p>You are given an array a. You are allowed to change values of some elements without changing their order to get a new array a&prime; which must be self-fenwick. Find the way to do it by changing as few elements as possible.</p>

### 입력

<p>The first line of the input file contains n &mdash; the number of elements in the array (1 &le; n &le; 100 000). The second line contains n integer numbers &mdash; the elements of the array. The elements do not exceed 10<sup>9</sup> by their absolute values.</p>

### 출력

<p>Output n numbers &mdash; the elements of the array a&prime;. If there are several solutions, output any one.</p>