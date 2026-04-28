# [Platinum III] Odd Binomial Coefficients - 11219

[문제 링크](https://www.acmicpc.net/problem/11219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 87, 정답: 51, 맞힌 사람: 38, 정답 비율: 61.290%

### 분류

조합론, 분할 정복, 수학

### 문제 설명

<p>You might be familiar with the binomial coefficient \(\binom{m}{k}\) defined as \(\binom{m}{k} = \frac{m!}{k!(m-k)!}\), where \(m\) and \(k\) are non-negative integers and \(k \le m\). Let \(T_2\left(n\right)\) be the number of odd binomial coefficients such that \(0 \le k \le m &lt; n \). The most useful mathematical inequality you will learn during this competition is</p>

<p>\[0.812556n^{\log_2{3}} \le T_2\left(n\right) \le n^{\log_2{3}}\]</p>

<p>Emma doesn&rsquo;t like such imprecise inequalities and would like to calculate \(T_2\left(n\right)\) exactly. Can you help her?</p>

### 입력

<p>The input contains one line with one integer \(n\), \(1 \le n \le 10^{11}\).</p>

### 출력

<p>Output one line with the value of \(T_2\left(n\right)\).</p>