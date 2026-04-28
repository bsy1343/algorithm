# [Platinum III] Counting swaps (Hard) - 27663

[문제 링크](https://www.acmicpc.net/problem/27663)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 순열 사이클 분할, 페르마의 소정리

### 문제 설명

<p>Just like yesterday (in problem U of the practice session), Bob is busy, so Alice keeps on playing some single-player games and puzzles. In her newest puzzle she has a permutation of numbers from 1 to <em>n</em>. The goal of the puzzle is to sort the permutation using the smallest possible number of swaps.</p>

<p>Instead of simply solving the puzzle, Alice is wondering about the probability of winning it just by playing at random. In order to answer this question, she needs to know <em>the number of optimal solutions</em> to her puzzle.</p>

<p>You are given a permutation <em>p</em><sub>1</sub>, &hellip;, <em>p</em><sub><em>n</em></sub> of the numbers 1 through <em>n</em>. In each step you can choose two numbers <em>x</em> &lt; <em>y</em> and swap <em>p</em><sub><em>x</em></sub> with <em>p</em><sub><em>y</em></sub>.</p>

<p>Let <em>m</em> be the minimum number of such swaps needed to sort the given permutation. Compute the number of different sequences of exactly <em>m</em> swaps that sort the given permutation. Since this number may be large, compute it modulo 10<sup>9</sup> + 9.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of two lines. The first line contains the integer <em>n</em>. The second line contains the sequence <em>p</em><sub>1</sub>, &hellip;, <em>p</em><sub><em>n</em></sub>: a permutation of 1, &hellip;, <em>n</em>.</p>

### 출력

<p>For each test case, output a single line with a single integer: x mod (10<sup>9</sup> + 9), where <em>x</em> is the number of ways to sort the given sequence using as few swaps as possible.</p>

### 제한

<ul>
	<li>1 &le; <em>n</em> &le; 10<sup>5</sup></li>
</ul>

### 힌트

<p>In the first test case, we can sort the permutation in two swaps. We can make the first swap arbitrarily; for each of them, there&rsquo;s exactly one optimal second swap. For example, one of the three shortest solutions is &ldquo;swap p<sub>1</sub> with p<sub>2</sub> and then swap p<sub>1</sub> with p<sub>3</sub>&rdquo;.</p>

<p>In the second test case, the optimal solution involves swapping p<sub>1</sub> with p<sub>2</sub> and swapping p<sub>3</sub> with p<sub>4</sub>. We can do these two swaps in either order.</p>

<p>The third sequence is already sorted. The optimal number of swaps is 0, and thus the only optimal solution is an empty sequence of swaps.</p>