# [Gold III] Base Numbers - 6682

[문제 링크](https://www.acmicpc.net/problem/6682)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍

### 문제 설명

<p>Any integer number can be written as a sequence of digits. The most popular system is decimal, which uses ten digits (its base is 10). Besides, other systems with different bases can be used. For instance, the binary system (with the base of 2) is often used in relation to computers.</p>

<p>Generally, if we have a non-negative integer number n expressed as a sequence of digits&nbsp;</p>

<p style="text-align: center;">d<sub>k</sub> d<sub>k-1</sub> ... d<sub>2</sub> d<sub>1</sub> d<sub>0</sub></p>

<p>in the system with the base r (r &gt; 1), then the value of the number is&nbsp;</p>

<p style="text-align: center;">n = d<sub>k</sub>&middot;r<sup>k</sup> + d<sub>k-1</sub>&middot;r<sup>k-1</sup> + ... + d<sub>2</sub>&middot;r<sup>2</sup> + d<sub>1</sub>.r + d<sub>0</sub>.</p>

<p>Under any circumstances, each digit must be smaller than the base, 0 &nbsp;&lt;= d<sub>i</sub> &lt; r for every i, 0 &nbsp;&lt;= i &lt;= k.</p>

<p>Some problems arise when we use bases greater than 10, because then we need more than 10 popular digits. A common solution is to use letters for &quot;digits&quot; greater than 9. Although this solution pushes limits a little further, it does not avoid the problem itself -- the set of letters is still very limited. Thus, higher bases could not be used.</p>

<p>Another solution is to write every digit separately as a number in the decimal system. For example, the hexadecimal number 1A8D (in usual notation) can be written as &quot;(1-10-8-13)<sub>16</sub>&quot;. Please note that the number is always followed by the base value (even in the decimal system) to avoid misinterpretations. This number format is called a decimal-encoded notation in this text.</p>

<p>A number in the decimal-encoded notation is considered valid only if it contains no unnecessary zeros, i.e., additional leading zeros cannot appear in the base value or in any of the digits. Moreover, all digits must always be smaller than the base value. Thus, &quot;(1-0-0-0)<sub>7</sub>&quot;, &quot;(4-7689)<sub>7690</sub>&quot;, and &quot;(0)<sub>16</sub>&quot; are valid decimal-encoded numbers, on the other hand, &quot;(0-3-6)<sub>8</sub>&quot;, &quot;(1-02-3)<sub>6</sub>&quot;, &quot;(3-2-1)<sub>07</sub>&quot;, and &quot;(9)<sub>6</sub>&quot; are invalid.</p>

<p>Due to some implementation reasons, ACM stores some data in valid decimal-encoded formats with various bases. Due to a software bug, a file containing a set of such numbers was damaged. All decimal digits has been preserved in the right order, but all of the dashes and parentheses were lost. Thus, each representation of a number was transformed to a code consisting of decimal digits only. Unfortunately, these codes are very ambiguous, most of them could represent many different numbers. For instance, &quot;1234&quot; could stand for &quot;(1-2-3)<sub>4</sub>&quot;, &quot;(12)<sub>34</sub>&quot;, &quot;(1-2)<sub>34</sub>&quot;, or &quot;(1)<sub>234</sub>&quot;. Your task is to determine the number of different representations that a code could stand for.</p>

### 입력

<p>The input file consists of several lines. Each line contains one code, i.e., the string consisting of decimal digits. The maximum length of any code is 35, the minimum length is 1. The last line of the input file contains a single hash character (&quot;#&quot;).</p>

<p>&nbsp;</p>

### 출력

<p>For each code, output a single line of text. If there is no valid representation of a number resulting in the given code, print a single line containing the text &quot;The code CCC is invalid.&quot;. Otherwise, print the text &quot;The code CCC can represent X numbers.&quot;. Replace CCC with the given code. Replace X with the total number of different representations in the decimal-encoded notation that would result in the given code when dashes and parentheses are removed. Note that the representations of numbers are considered different even if they result in the same value.</p>

<p>&nbsp;</p>