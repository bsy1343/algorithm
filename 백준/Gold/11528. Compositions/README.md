# [Gold V] Compositions - 11528

[문제 링크](https://www.acmicpc.net/problem/11528)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 89, 정답: 76, 맞힌 사람: 64, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>A composition of an integer n is an ordered set of integers which sum to n. Two compositions with the same elements but in different orders are considered different (this distinguishes compositions from partitions). For example, all the compositions of the first few integers are:</p>

<pre>
1: {1}
2: {1+1, 2}
3: {1+1+1, 1+2, 2+1, 3}
4: {1+1+1+1, 1+1+2, 1+2+1, 1+3, 2+1+1, 2+2, 3+1, 4}</pre>

<p>Note that 1+2 and 2+1 each count as distinct compositions of 3. As you may have suspected, there are 2<sup>(n-1)</sup> compositions of n.</p>

<p>In this problem, we set conditions on the elements of the compositions of n. A composition misses a set S if no element of the composition is in the set S. For example, the compositions of the first few integers which miss the set of even integers are:</p>

<pre>
1: {1}
2: {1+1}
3: {1+1+1, 3}
4: {1+1+1+1, 1+3, 3+1}</pre>

<p>No odd integer can have a composition missing the set of odd integers and any composition of an even integer consisting of only even integers must be 2 times a composition of n/2.</p>

<p>For this problem you will write a program to compute the number of compositions of an input integer n which miss the elements of the arithmetic sequence {m + i*k | i = 0,1,&hellip;}</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by the three space separated integers n, m and k with (1 &le; n &le; 30) and (0 &le; m &lt; k &lt; 30).</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the data set number, K, followed by a single space followed by the number of compositions of n which miss the specified sequence.</p>