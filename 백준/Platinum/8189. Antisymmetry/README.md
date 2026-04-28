# [Platinum III] Antisymmetry - 8189

[문제 링크](https://www.acmicpc.net/problem/8189)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 203, 정답: 97, 맞힌 사람: 87, 정답 비율: 51.176%

### 분류

문자열, 매내처

### 문제 설명

<p>Byteasar studies certain strings of zeroes and ones. Let x be such a string. By x<sup>R</sup> we will denote the reversed (i.e., &quot;read backwards&quot;) string x, and by \( \bar {x}&nbsp;\) we will denote the string obtained from x by changing all the zeroes to ones and ones to zeroes.</p>

<p>Byteasar is interested in antisymmetry, while all things symmetric bore him. Antisymmetry however is not a mere lack of symmetry. We will say that a (nonempty) string x is antisymmetric if, for every position i in x, the i-th last character is different than the i-th (first) character. In particular, a string x consisting of zeroes and ones is antisymmetric if and only if \( x = {\bar {x}}^R \). For example, the strings 00001111 and 010101 are antisymmetric, while 1001 is not.</p>

<p>In a given string consisting of zeroes and ones we would like to determine the number of contiguous nonempty antisymmetric fragments. Different fragments corresponding to the same substrings should be counted multiple times.</p>

### 입력

<p>The first line of the standard input contains an integer n (1 &le; n &le; 500,000) that denotes the length of the string. The second line gives a string of 0 and/or 1 of length n. There are no spaces in the string.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer, namely the number of contiguous (non empty) fragments of the given string that are antisymmetric.</p>

### 힌트

<p>Antisymmetric fragments are: 01 (occurs twice), 10 (also twice), 0101, 1100, and 001011.</p>