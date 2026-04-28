# [Platinum V] Vera And LCS - 15440

[문제 링크](https://www.acmicpc.net/problem/15440)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 92, 정답: 40, 맞힌 사람: 38, 정답 비율: 55.882%

### 분류

문자열, 애드 혹, 해 구성하기, 최장 공통 부분 수열 문제

### 문제 설명

<p>Vera is learning about the longest common subsequence problem.</p>

<p>A string is a (possibly empty) sequence of lowercase letters. A subsequence of a string S is a string obtained by deleting some letters of S (possibly none or all). For example &ldquo;vra&rdquo;, &ldquo;a&rdquo;, &ldquo;&rdquo;, and &ldquo;vera&rdquo; are all subsequences of &ldquo;vera&rdquo;. The longest common subsequence (LCS) of two strings, A and B, is a string that is a subsequence of both A and B that has the maximum length among all strings that are a subsequence of both A and B. There could be multiple LCS for two given strings. For example a LCS of &ldquo;vera&rdquo; and &ldquo;eats&rdquo; is &ldquo;ea&rdquo;.</p>

<p>For homework she was given two strings A and B, both of length N and she had to determine the length of the LCS of A and B. She determined the answer to be K but lost B. Given A and K, help her find a possible value of B. It is possible that Vera may have made a mistake and no such B exists, in that case output &ldquo;WRONGANSWER&quot;(without quotes).</p>

### 입력

<p>The input will be in the format:</p>

<pre>
N K
A</pre>

<p>Constraints:</p>

<ul>
	<li>1 &le; N &le; 2000</li>
	<li>0 &le; K &le; 2000</li>
	<li>N, K are integers</li>
	<li>A consists of N lowercase letters</li>
</ul>

### 출력

<p>Output one line consisting of the string B of N lowercase letters, or &ldquo;W RONGANSW ER&rdquo; if no B is valid. If there are multiple correct B output any of them.</p>

### 힌트

<p>For the first example, another possible answer is &ldquo;uber&rdquo;.</p>