# [Platinum IV] Weight Overflow - 19724

[문제 링크](https://www.acmicpc.net/problem/19724)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 12, 맞힌 사람: 10, 정답 비율: 25.641%

### 분류

애드 혹

### 문제 설명

<p>John has recently bought an electronic balance scale from a well-known website. The scale has two plates that you can put items to. After you put some items to the scale it shows which of the plates outweighs another one, or tells that the weights on the plates are equal, and the scale is balanced.&nbsp;</p>

<p>John has started experimenting with the scale and found out that weighing results are quite strange sometimes. It turns out that the scale calculates the total weight of the items at each plate in grams and then compares the resulting values. However, since the software was written by former sport programmers, the scale calculates the weight of the items at the plate modulo some integer $m$.</p>

<p>John has $n$ special weights, the $i$-th weight has the mass of $a_i$ grams. He wants the scale to tell him that it is balanced by putting some of these weights to the scale plates.</p>

<p>Help John decide which weights he needs to put to the scale plates. He should put at least one weight to the scale.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ --- the number of weights John has, and the modulo for weight calculation ($1 \le n \le 25$; $1 \le m &lt; 4 \cdot 10^7$).</p>

<p>The next line contains $n$ integers $a_1, \ldots, a_n$ --- masses of the weights John has ($1 \le a_i \le 10^9$).</p>

### 출력

<p>If there exists an answer, print $k$ --- the number of weights that John should put to the first plate, at the first line. The second line must contain the numbers of these weights.</p>

<p>Then print $m$ --- the number of weights that John should put to the second plate. Print the numbers of these weights at the next line.</p>

<p>Weights are numbered from $1$ to $n$ in the order they are given in input.</p>

<p>If there is no answer, print a single number &quot;$-1$&quot;.</p>