# [Gold IV] Powerbase Format - 9217

[문제 링크](https://www.acmicpc.net/problem/9217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>Rather than the familiar right-to-left place-weighted system for printed numbers, powerbase representation writes digits from left to right with the rule that a digit d in position p has the value of d raised to the power p. For example, the integer that we would normally write as 100 would be represented in powerbase form as 983 because 9<sup>1</sup> + 8<sup>2</sup> + 3<sup>3</sup> is one hundred.</p>

<p>Powerbase format has the advantage that there is no need to know (or assume) what radix (base) a number is written in. For example 100 in a place-weighted scheme could represent one hundred (if the radix is ten) or four (if the radix is two). But 983 in powerbase format can only ever represent one hundred.</p>

<p>The lack of a radix also frees up the matter of which digits are available. Powerbase numbers are frequently written without 0 or 1 digits, but could in principle be written with any particular digit set. However, restricting the available digits may mean that particular values have no powerbase representation, or at least none shorter than a small number of digits. For example if numbers are written in powerbase format using digits 2 to 8, all values from 2 to 10,000 can be represented using no more than 7 digits (with only 31 of them needing the full 7-digit form). However, if only digits 2 to 7 are used there is no powerbase representation (of any length) for the value 25.</p>

<p>Your task is to write a program to find integer values that do not have a powerbase representation shorter than a specified number of digits when a particular digit set is used.</p>

### 입력

<p>Input will consist of specifications for a series of tests. Information for each test begins with a line containing two integers, separated by a single space character, that specify the first and last value to check. Each value is 1 &lt;= n &lt;= 100000, and the last value is not smaller than the first. A line containing two zeros terminates the input.</p>

<p>The second line for each test contains an integer 2 &lt;= n &lt;= 15 that specifies the maximum length of the powerbase representation that should be considered. The third and final line for each test contains a string that specifies which digits can be used in the powerbase representation. The contents of the digit string can include the numeric characters 0 to 9 and the uppercase letters A to Z, which represent digit values 10 to 35. The characters in the digit string are arranged in order of strictly increasing digit value.&nbsp;</p>

<p>For example the input specification</p>

<pre>
100 2000
5
1248GW</pre>

<p>describes a test of the integers from 100 to 2000 (both inclusive), looking for values that can be represented in powerbase form using no more than 5 digits, where allowable digit values are 1, 2, 4, 8, 16, and 32.</p>

### 출력

<p>Output should consist of one line for each test comprising the test number (formatted as shown) followed by a single space and the number of values in the test range that cannot be represented under the specified conditions for length and digit values.</p>