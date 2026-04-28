# [Gold III] Bitwise Kingdom - 22673

[문제 링크](https://www.acmicpc.net/problem/22673)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

조합론, 그리디 알고리즘, 수학

### 문제 설명

<p>In the Bitwise Kingdom, located somewhere in the universe, there are exactly 2<sup><i>N</i></sup>&nbsp;citizens living and each of them has a unique identification string that represents his or her class in the society. An identification string is a binary string of length&nbsp;<i>N</i>&nbsp;which consists of characters &lsquo;0&rsquo; or &lsquo;1&rsquo;. The order of classes is defined among the citizens by the following criteria:</p>

<ol>
	<li>Citizens identified by a string containing a greater number of ones are ranked higher. For example, &ldquo;011&rdquo; indicates a higher class than &ldquo;100&rdquo;.</li>
	<li>Among those who have identification strings with the same number of ones, citizens identified by a lexicographically greater identification string are ranked higher. For example, &ldquo;110&rdquo; indicates a higher class than &ldquo;101&rdquo;.</li>
</ol>

<p>For example, if&nbsp;<i>N</i>&nbsp;= 3, there are 8 (= 2<sup>3</sup>) people in the country, and their identification strings are &ldquo;000&rdquo;, &ldquo;001&rdquo;, &ldquo;010&rdquo;, &ldquo;100&rdquo;, &ldquo;011&rdquo;, &ldquo;101&rdquo;, &ldquo;110&rdquo;, and &ldquo;111&rdquo; (from the lowest class to the highest).</p>

<p>You are given two numbers&nbsp;<i>N</i>&nbsp;(1 &le;&nbsp;<i>N</i>&nbsp;&le; 60) and&nbsp;<i>M</i>&nbsp;(1 &le;&nbsp;<i>M</i>&nbsp;&le; 2<sup><i>N</i></sup>), and you want to resolve the identification string of the person of the&nbsp;<i>M</i>-th lowest class among 2<sup><i>N</i></sup>&nbsp;citizens. Can you write a program to solve this problem?</p>

### 입력

<p>The input consists of multiple datasets.</p>

<p>Each dataset consists of a line which contains two integers&nbsp;<i>N</i>&nbsp;and&nbsp;<i>M</i>&nbsp;in this order, separated with a single space. The input does not contain any other extra characters such as leading or trailing spaces.</p>

<p>The end of input is indicated by a line with two zeros. This line is not part of any datasets.</p>

### 출력

<p>For each dataset, print the identification string of the person of the&nbsp;<i>M</i>-th lowest class in one line. Your program may not omit any leading zeros in the answer.</p>