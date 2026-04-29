# [Gold V] 67 - 34908

[문제 링크](https://www.acmicpc.net/problem/34908)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 40, 정답: 27, 맞힌 사람: 26, 정답 비율: 66.667%

### 분류

수학, 애드 혹, 유클리드 호제법, 정수론

### 문제 설명

<p><em>The MITIT Winter 2025-26 contest takes place on December <strong>6-7</strong>, 2025.</em></p>

<p><em>This is an interactive problem.</em></p>

<p>Busy Beaver has a secret array $a_1, \dots, a_N$, where $1 \leq a_i \leq 10^9$ for all $i$ and <strong>every two elements are coprime</strong>. (Two integers are <em>coprime</em> if the only positive integer dividing both is $1$.)</p>

<p>You may ask up to $100$ queries of the following form:</p>

<ul>
<li>Pick two distinct indices $i$ and $j$. In response, you will receive the product $a_i \times a_j$.</li>
</ul>

<p>Let $Q$ be the maximum number of queries you use to determine Busy Beaver's array. For full points, you must have $Q \leq \mathbf{67}$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $T$ ($1 \leq T \leq 1000$) --- the number of test cases.</p>

<p>The first line of each test case contains an integer $N$ ($5 \leq N \leq 100$). After reading this line, you should begin the interaction.</p>

### 출력



### 힌트

<p>During an actual run the solution does not know the hidden array; it is shown here only to justify the sample.</p>

<p>In the first test case, the judge prints <code>5</code>, so $N=5$. Its hidden array is $[7,11,6,5,17]$.</p>

<ul>
<li>The program asks <code>? 1 2</code> and receives <code>77</code> from $7\times 11$.</li>
<li>It asks <code>? 3 4</code> and receives <code>30</code> from $6\times 5$.</li>
<li>It asks <code>? 4 5</code> and receives <code>85</code> from $5\times 17$.</li>
</ul>

<p>The program then correctly outputs <code>! 7 11 6 5 17</code>.</p>

<p>In the second test case, the judge prints <code>5</code>. Its hidden array is $[1,40,61,41,69]$.</p>

<p>The program asks <code>? 1 5</code> and receives <code>69</code> from $1\times 69$. It then outputs <code>! 1 40 61 41 69</code>, which matches the judge's array.</p>

<p>This illustrates one valid interaction sequence; any correct determination of the array using allowed queries is acceptable.</p>