# [Platinum V] Password - 27415

[문제 링크](https://www.acmicpc.net/problem/27415)

### 성능 요약

시간 제한: 1.6 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>Due to his paranoia about security, Sam decided to pick a long password for his e-mail account that contains only small letters of the English alphabet. However, he realized that he had a high risk of forgetting his password, so he decided to encode it into 2 strings, also containing only small letters of the English alphabet. He wrote these strings on a piece of paper and hid the paper under his bed. Sam chose the strings A and B such that the password S is the anagram of B that appears as a subsequence of A and is lexicographically minimal.</p>

<p>We say that a string B = b<sub>1</sub>b<sub>2</sub>...b<sub>|B|</sub> is a subsequence of A = a<sub>1</sub>a<sub>2</sub>...a<sub>|A|</sub> if and only if there exists a sequence of strictly increasing indices n<sub>1</sub>, n<sub>2</sub>, ..., n<sub>|B|</sub> such that a<sub>n<sub>i</sub></sub>=b<sub>i</sub> for i = 1, 2, ..., <sub>|B|</sub>.</p>

<p>We say that A is lexicographically smaller than B if and only if there exists an index n &lt; |A| such that a<sub>i</sub>=b<sub>i</sub> for i = 1, 2, ..., n and a<sub>n+1</sub> &lt; b<sub>n+1</sub>.</p>

<p>We say that S is an anagram of B if S and B contain the same letters and in the same quantities, but possibly in different orders.</p>

<p>As expected, Sam forgot his password one week later and now he is struggling to get it back, so he asks for your help. Write a program that can find his password for him.</p>

<p>Given the two strings A and B, print out Sam&#39;s password based on the restrictions above.</p>

### 입력

<p>The input has exactly one line containing the 2 strings A and B separated by one whitespace.</p>

### 출력

<p>The output should contain one line representing Sam&#39;s password. In case there is no solution, you should print out the word &ldquo;impossible&rdquo; (without the quotation marks).</p>