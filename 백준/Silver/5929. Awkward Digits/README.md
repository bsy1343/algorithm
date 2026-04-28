# [Silver V] Awkward Digits - 5929

[문제 링크](https://www.acmicpc.net/problem/5929)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 321, 정답: 230, 맞힌 사람: 202, 정답 비율: 70.139%

### 분류

수학, 구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Bessie the cow is just learning how to convert numbers between different bases, but she keeps making errors since she cannot easily hold a pen between her two front hooves.</p><p>Whenever Bessie converts a number to a new base and writes down the result, she always writes one of the digits wrong.  For example, if she converts the number 14 into binary (i.e., base 2), the correct result should be &quot;1110&quot;, but she might instead write down &quot;0110&quot; or &quot;1111&quot;.  Bessie never accidentally adds or deletes digits, so she might write down a number with a leading digit of &quot;0&quot; if this is the digit she gets wrong.</p><p>Given Bessie&apos;s output when converting a number N into base 2 and base 3, please determine the correct original value of N (in base 10). You can assume N is at most 1 billion, and that there is a unique solution for N.</p><p>Please feel welcome to consult any on-line reference you wish regarding base-2 and base-3 numbers, if these concepts are new to you.</p>

### 입력

<ul><li>Line 1: The base-2 representation of N, with one digit written incorrectly.</li><li>Line 2: The base-3 representation of N, with one digit written incorrectly.</li></ul>

### 출력

<ul><li>Line 1: The correct value of N.</li></ul>

### 힌트

<h4>Input Details</h4><p>When Bessie incorrectly converts N into base 2, she writes down &quot;1010&quot;.  When she incorrectly converts N into base 3, she writes down &quot;212&quot;.</p><h4>Output Details</h4><p>The correct value of N is 14 (&quot;1110&quot; in base 2, &quot;112&quot; in base 3).</p>