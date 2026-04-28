# [Bronze I] Reading Digits - 13858

[문제 링크](https://www.acmicpc.net/problem/13858)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 256 MB

### 통계

제출: 140, 정답: 117, 맞힌 사람: 98, 정답 비율: 88.288%

### 분류

구현, 문자열

### 문제 설명

<p>Bob has a very special way of encoding strings formed with digits. For instance, he encodes &ldquo;1211&rdquo; as: &ldquo;one of one, one of two, two of one&rdquo;, or, more precisely: &ldquo;111221&rdquo;. Bob&rsquo;s encoding of the latter string is: &ldquo;312211&rdquo;. We call this a &ldquo;two-times re-encoding of 1211&rdquo;. Bob likes repeating this process several times.</p>

<p>You are given a string of digits which represents the &ldquo;kth re-encoding of a string s&rdquo;. The string s contains only non-zero digits (i.e. [1-9]). Also, it is not possible to have a sequence of more than 9 repeating digits in s. You must find the digit which lays on the pos position (starting from 0) of the string s.</p>

### 입력

<p>The input consists of two lines. The first line contains the values k and pos. The second line contains the k th re-encoding of s. We have 1 &lt; k &lt; 40,&nbsp;0 &le; pos &le; 100000, and pos &lt; |s| &le; 200000.</p>

### 출력

<p>The output is the digit from position pos of s.</p>