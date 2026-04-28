# [Silver IV] String Matching - 9188

[문제 링크](https://www.acmicpc.net/problem/9188)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 46, 맞힌 사람: 39, 정답 비율: 69.643%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>It&#39;s easy to tell if two words are identical - just check the letters. But how do you tell if two words are almost identical? &nbsp;And how close is &quot;almost&quot;?</p>

<p>There are lots of techniques for approximate word matching. &nbsp;One is to determine the best substring match, which is the number of common letters when the words are compared letter-by-letter. &nbsp;The key to this approach is that the words can overlap in any way. &nbsp;For example, consider the words CAPILLARY and MARSUPIAL. &nbsp;One way to compare them is to overlay them:</p>

<pre>
CAPILLARY
MARSUPIAL</pre>

<p>There is only one common letter (A). &nbsp;Better is the following overlay:</p>

<pre>
CAPILLARY
     MARSUPIAL</pre>

<p>with two common letters (A and R), but the best is:</p>

<pre>
   CAPILLARY
MARSUPIAL</pre>

<p>Which has three common letters (P, I and L).</p>

<p>The approximation measure appx(word1, word2) for two words is given by:</p>

<pre>
     common letters * 2
-----------------------------
length(word1) + length(word2)
</pre>

<p>Thus, for this example, appx(CAPILLARY, MARSUPIAL) = 6 / (9 + 9) = 1/3. &nbsp;Obviously, for any word W appx(W, W) = 1, which is a nice property, while words with no common letters have an appx value of 0.</p>

### 입력

<p>The input for your program will be a series of words, two per line, until the end-of-file flag of -1. &nbsp;Using the above technique, you are to calculate appx() for the pair of words on the line and print the result.&nbsp;The words will all be uppercase.</p>

### 출력

<p>Print the value for appx() for each pair as a reduced fraction.&nbsp;Fractions reducing to zero or one should have no denominator.</p>