# [Silver I] Dead Fraction - 4322

[문제 링크](https://www.acmicpc.net/problem/4322)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 123, 정답: 41, 맞힌 사람: 37, 정답 비율: 34.906%

### 분류

수학, 문자열, 브루트포스 알고리즘, 정수론, 파싱, 유클리드 호제법

### 문제 설명

<p>Mike is frantically scrambling to finish his thesis at the last minute. He needs to assemble all his research notes into vaguely coherent form in the next 3 days. Unfortunately, he notices that he had been extremely sloppy in his calculations. Whenever he needed to perform arithmetic, he just plugged it into a calculator and scribbled down as much of the answer as he felt was relevant. Whenever a repeating fraction was displayed, Mike simply reccorded the first few digits followed by &quot;...&quot;. For instance, instead of &quot;1/3&quot; he might have written down &quot;0.3333...&quot;. Unfortunately, his results require exact fractions! He doesn&#39;t have time to redo every calculation, so he needs you to write a program (and FAST!) to automatically deduce the original fractions.</p>

<p>To make this tenable, he assumes that the original fraction is always the simplest one that produces the given sequence of digits; by simplest, he means the the one with smallest denominator. Also, he assumes that he did not neglect to write down important digits; no digit from the repeating portion of the decimal expansion was left unrecorded (even if this repeating portion was all zeroes).</p>

### 입력

<p>There are several test cases. For each test case there is one line of input of the form &quot;0.dddd...&quot; where dddd is a string of 1 to 9 digits, not all zero. A line containing 0 follows the last case.</p>

### 출력

<p>For each case, output the original fraction.</p>

### 힌트

<p>Note that an exact decimal fraction has two repeating expansions (e.g. 1/5 = 0.2000... = 0.19999...).</p>

<p>&nbsp;</p>