# [Silver II] Radix 3 - 22793

[문제 링크](https://www.acmicpc.net/problem/22793)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 54, 맞힌 사람: 52, 정답 비율: 47.273%

### 분류

수학, 구현

### 문제 설명

<p>The Great Sand Council (GSC) of the planet Phleebutt (apologies to Sierra) have devised a base 3 number system to suit their physiology. The symbols used to represent the three valid digits of their number system are &lsquo;0&rsquo;, &lsquo;1&rsquo;, and &lsquo;-&rsquo;, following the unusual configuration of their hands (don&rsquo;t ask). The decimal counterparts of the three symbols are, respectively, 0, 1 and &minus;1.</p>

<p>Each position in a number has a value three times greater than the position immediately to its right. For example, the number &lsquo;10-&rsquo; has the value 8 in decimal, since 1&times;9+ 0&times;3+ (&minus;1)&times; = 8. Similarly, the number &lsquo;-1&rsquo; has the decimal value &minus;2, since (&minus;1)&times;3+1 = &minus;2. GSC representations of integers never start with a digit of zero, except for &lsquo;0&rsquo; (a single zero) which has the decimal value 0.</p>

<p>You have to write a program that can convert 32-bit signed decimal integers into their equivalent GSC representations.</p>

### 입력

<p>Your program will receive a list of integers as input. Each integer will appear in a separate line and be between &minus;2<sup>31</sup> and 2<sup>31</sup> &minus; 1. The end of list is indicated by the end of file.</p>

### 출력

<p>You have to echo the input numbers followed by their GSC representations, as shown in the Sample Output (including all extra symbols).</p>