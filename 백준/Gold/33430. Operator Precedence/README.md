# [Gold III] Operator Precedence - 33430

[문제 링크](https://www.acmicpc.net/problem/33430)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Randias is facing his primary school homework:</p>

<p>Find a nonzero integer sequence $a$ of length $2n$ satisfying</p>

<p>\begin{alignat*}{26} (&amp;a_1 &amp;\times&amp; &amp;a_2&amp;)&amp;+&amp;(&amp;a_3&amp; &amp;\times&amp; &amp;a_4&amp;)&amp;+&amp; &amp; \ldots &amp; &amp; &amp;+&amp;(&amp;a_{2n-1}&amp; &amp;\times&amp; a_{2n}&amp;)\\ = &amp;a_1 &amp;\times&amp;(&amp;a_2&amp; &amp;+&amp; &amp;a_3&amp;)&amp;\times&amp;(&amp;a_4&amp; &amp;+&amp; a_5)\times&amp; \ldots &amp; \times&amp;(a_{2n-2} &amp;+&amp; &amp;a_{2n-1}&amp;)&amp;\times&amp; a_{2n}&amp;\ne 0\text{.} \end{alignat*}</p>

<p>In shorter form, $\sum\limits_{i=1}^n a_{2i-1} a_{2i} = a_1 a_{2n} \prod\limits_{i=2}^{n} (a_{2i-2} + a_{2i-1}) \ne 0$.</p>

<p>Of course, Randias knows how to solve it. But he wants to give you a test. Can you solve the question above?</p>

### 입력

<p>Each test contains multiple test cases. The first line contains a single integer $t$ ($1 \leq t \leq 10^5$) denoting the number of test cases.</p>

<p>For each test case, the only line contains a single integer $n$ ($2 \le n \le 10^5$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output one line with $2 n$ integers: $a_1, a_2, \ldots, a_{2n}$ ($1 \le |a_i| \le 10^{10}$).</p>

<p>It can be shown that the answer always exists.</p>

<p>If there are several possible answers, output any one of them.</p>