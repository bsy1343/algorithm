# [Platinum V] Yungom - 6262

[문제 링크](https://www.acmicpc.net/problem/6262)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 10, 맞힌 사람: 6, 정답 비율: 26.087%

### 분류

자료 구조, 다이나믹 프로그래밍, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>After getting her Ph.D in Cooking with her research paper on &quot;How to Prepare a Pizza&quot;, and another Ph.D in Medicine for finding cures for H.I.V and Alzheimers, Dae Jang Guem (Called Yungom in Persian) decided to solve yet another open problem in Information Theory that even Shanon (the father of Information Theory) failed to solve. She is going to construct a language of n words with d given characters c<sub>1</sub>, c<sub>2</sub>, &hellip;, c<sub>d</sub>. This language should be prefix free which means that there is no pair of words like (s, t) in which the word s is a prefix of t. Each character c<sub>i</sub> has a usage cost of w<sub>i</sub>. The cost of a word s with the length l is the sum of the costs of its l characters. For example, if c<sub>1</sub>=a; c<sub>2</sub>=b; w<sub>1</sub>=1 and w<sub>2</sub>=10, the cost of word &quot;aba&quot; is 1+10+1=12. Similarly, the cost of a language with n words is equal to the sum of the costs of its n words. For example, the cost of language &ldquo;ab&rdquo;; &ldquo;bbb&rdquo;; &ldquo;baaa&rdquo; is 11+30+13=54. Like her previous jobs, Yungom is going to do this task perfectly which means that she wants to find the minimum cost, prefix free language with n words.</p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing two integers n (1 &le; n &le; 200) and d (1 &le; d &le; 200). The next line contains nonnegative integers w<sub>1</sub>,w<sub>2</sub>, &hellip;, w<sub>d</sub>. The input is terminated by a line containing two zero numbers.</p>

### 출력

<p>For each test case, you should print the minimum cost of a prefix free language with n words and d characters.</p>