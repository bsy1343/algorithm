# [Silver IV] String Transformations - 5219

[문제 링크](https://www.acmicpc.net/problem/5219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 99, 정답: 58, 맞힌 사람: 49, 정답 비율: 61.250%

### 분류

구현, 문자열

### 문제 설명

<p>The Avengers are looking for ways to encrypt their messages, to hide information from their many opponents. Iron Man suggests the following approach.</p>

<p>Given several string transformation rules, transform a target string. Each string transformation rule (production) transforms a single letter into two letters, and is applied to the first occurrence of the letter in the target string. If the letter does not appear then the string is unchanged. Once a new string is produced, it is used as the target string of the next transformation rule, until no rules are left.</p>

<p>For instance, the production A &rarr; OA applied to the string &rdquo;CAT&rdquo; would yield the string &rdquo;COAT&rdquo;. Applied to the string &rdquo;DATA&rdquo; it would yield the string &rdquo;DOATA&rdquo;.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). Each test case consists of two lines. The first line contains a number of transformation rules as pairs of words lhsrhs where lhs is a single letter, and rhs is two letters. The second line contains the list of words to be transformed. You may assume all words are in capital letters.</p>

### 출력

<p>For each test case, you are to output the transformed words in their original order, separated by spaces on a single line.</p>