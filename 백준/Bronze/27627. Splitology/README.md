# [Bronze II] Splitology - 27627

[문제 링크](https://www.acmicpc.net/problem/27627)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 277, 정답: 190, 맞힌 사람: 174, 정답 비율: 68.504%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Yosef is a peculiar fellow. He introduced the idea to study a string by splitting it into two, and he called it Splitology. Why split a string? We do not know. Didn&rsquo;t we say that Yosef is a weird one?</p>

<p>Yosef is interested in one particular type of string, a palindrome. A palindrome is a string that is the same for both forwards and backwards. Example of palindrome strings are &ldquo;ada&rdquo;, &ldquo;taat&rdquo;, and &ldquo;radar&rdquo;. On the other hand, string such as &ldquo;taman&rdquo; is not a palindrome; notice that &ldquo;taman&rdquo; becomes &ldquo;namat&rdquo; if read backwards and it&rsquo;s not the same as &ldquo;taman&rdquo;.</p>

<p>As the idea of Splitology is still new, Yosef is investigating whether a string can be split into two non-empty strings such that each string is a palindrome.</p>

<p>For example, the string &ldquo;malamini&rdquo; can be split into &ldquo;malam&rdquo; and &ldquo;ini&rdquo; while both of them are palindrome. Another example is &ldquo;ababab&rdquo;. It can be split into &ldquo;aba&rdquo; and &ldquo;bab&rdquo;, and both of them are palindrome. Note that &ldquo;ababab&rdquo; can also be split into another pair of palindrome strings, e.g., &ldquo;ababa&rdquo; and &ldquo;b&rdquo;, or &ldquo;a&rdquo; and &ldquo;babab&rdquo;.</p>

<p>Gunawan, a friend of Yosef, is also a peculiar one. When he learned about Splitology, he asks Yosef whether the string &ldquo;irvinganteng&rdquo; can be split into two palindrome strings. The answer is of course no. It can be proven that such a string cannot be split into two palindrome strings.</p>

<p>Given a string S, determine whether it can be split into two non-empty palindrome strings. If the answer is yes, then output two palindrome strings A and B where the concatenation of A and B is S, i.e. S = A + B. If the answer is no, then simply output &ldquo;NO&rdquo; without quotes.</p>

### 입력

<p>Input contains a string S in a line representing the given string. String S contains only lowercase alphabetical characters (a-z) and its length is between 2 and 500, inclusive.</p>

### 출력

<p>If S cannot be split into two palindrome strings, then output &ldquo;NO&rdquo; in a line. Otherwise, output two palindrome strings A and B in a line separated by a single space such that S = A + B. If there is more than one way to split S into two palindrome strings, you only need to output (any) one pair of A and B.</p>