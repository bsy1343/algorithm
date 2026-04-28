# [Gold V] Subprime Fibonacci Sequence - 16558

[문제 링크](https://www.acmicpc.net/problem/16558)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 25, 맞힌 사람: 20, 정답 비율: 64.516%

### 분류

수학, 구현, 자료 구조, 정수론, 집합과 맵, 시뮬레이션, 소수 판정

### 문제 설명

<p>The Subprime function, SP(n) of a positive integer n, is defined by:</p>

<p style="text-align: center;">SP(n) = n if n is 1 or a prime</p>

<p>Otherwise,</p>

<p style="text-align: center;">SP(n) = n/p where p is the smallest prime dividing n</p>

<p>A Subprime Fibonacci sequence, a<sub>n</sub>, is defined by:</p>

<p style="text-align: center;">a<sub>0</sub> and a<sub>1</sub> are arbitrary<br />
a<sub>n+1</sub> = SP(a<sub>n</sub> + a<sub>n-1</sub>)</p>

<p>For example:</p>

<p style="text-align: center;">0, 1, 1, 2, 3, 5, 4, 3, 7, 5, 6, 11, 17, 14, 31, 15, &hellip;</p>

<p>Unlike the standard Fibonacci sequence which grows exponentially, a Subprime Fibonacci sequence usually eventually repeats.</p>

<p>Write a program which takes as input the initial values a<sub>0</sub> and a<sub>1</sub> and a number of terms to compute n and determines whether the sequence starting with a<sub>0</sub> and a<sub>1</sub> repeats in the first n terms.</p>

<p>The sequence repeats if there are integers k and m with k &lt; m &lt; n for which,</p>

<p style="text-align: center;">a<sub>k</sub> = a<sub>m</sub> and a<sub>k-1</sub> = a<sub>m-1</sub></p>

<p>The length of the repeating sequence is (m &ndash; k) if there is no integer j, k &lt; j &lt; m with a<sub>j</sub> = a<sub>m</sub> and a<sub>j-1</sub> = a<sub>m-1</sub>. I.e. the sequence from k to m is the shortest repeating sequence.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by the maximum number, n (0 &lt; n &le; 1000), of terms to compute followed by the initial values a<sub>0</sub> and a<sub>1</sub> in that order, (0 &lt; a<sub>0</sub>, a<sub>1</sub> &le; 1000).</p>

### 출력

<p>For each data set there are multiple lines of output.</p>

<p>If a repeating sequence is found, the first line of output contains the data set number, K, followed by the index m where the sequence first repeated followed by the length of the shortest repeating subsequence. The following lines of output contain the (length + 2) terms of the sequence from term (k-1) to term (m), 20 terms to a line (except possibly for the last line).</p>

<p>If a repeating sequence is not found in the first n terms, the first line of output contains the data set number, K, followed by the number of terms n followed by the digit 0. The following line contains only the value a<sub>n</sub> of the sequence at n (the (n+1)<sup>th</sup> term).</p>