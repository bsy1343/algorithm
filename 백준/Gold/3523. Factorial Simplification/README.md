# [Gold IV] Factorial Simplification - 3523

[문제 링크](https://www.acmicpc.net/problem/3523)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 20, 맞힌 사람: 19, 정답 비율: 35.849%

### 분류

수학, 구현, 정수론, 소수 판정, 소인수분해

### 문제 설명

<p>Peter is working on a combinatorial problem. He has carried out quite lengthy derivations and got a resulting formula that is a ratio of two products of factorials like this:</p>

<p>\[ \frac{p_1!p_2! \dots p_n!}{q_1!q_2! \dots q_m!}\]</p>

<p>This does not surprise Peter, since factorials appear quite often in various combinatorial formulae, because \(n!\) represents the number of transpositions of \(n\) elements &mdash; one of the basic combinatorial objects.</p>

<p>However, Peter might have made a mistake in his derivations. He knows that the result should be an integer number and he needs to check this first. For an integer result Peter wants to simplify this formula to get a better feeling of its actual combinatorial significance. He wants to represent the same number as a product of factorials like this.</p>

<p>\[r_1!^{s_1}r_2!^{s_2} \dots r_k!^{s_k}t\]</p>

<p>where all \(r_i\) are distinct integer numbers greater than one in the descending order (\(r_i\) &gt; \(r_{i+1}\) &gt; 1), si and \(t\) are positive integers. Among all the possible representations in this form, Peter is interested in one where \(r_1\) is the largest possible number, among those in the one where \(s_1\) is the largest possible number; among those in the one where \(r_2\) is the largest possible number; among those in the one where \(s_2\) is the largest possible number; etc, until the remaining \(t\) cannot be further represented in this form. Peter does not care about the actual value of \(t\). He wants to know what is the factorial-product part of his result.</p>

### 입력

<p>The first line of the input file contains two integer numbers \(n\) and \(m\) (1 &le; \(n\), \(m\) &le; 1000). The second line of the input file contains \(n\) integer numbers \(p_i\) (1 &le; \(p_i\) &le; 10 000) separated by spaces. The third line of the input file contains \(m\) integer numbers \(q_i\) (1 &le; \(q_i\) &le; 10 000) separated by spaces.</p>

### 출력

<p>On the first line of the output write a single integer number \(k\). Write \(k\) = &minus;1 if the ratio of the given factorial products is not an integer. Write \(k\) = 0 if the ratio is an integer but it cannot be represented in the desired form. Write \(k\) &gt; 0 followed by \(k\) lines if the ratio can be represented by a factorial product as described in the problem statement. On each of the following \(k\) lines write two integers \(r_i\) and \(s_i\) (for \(i\) = 1...\(k\)) separated by a space</p>