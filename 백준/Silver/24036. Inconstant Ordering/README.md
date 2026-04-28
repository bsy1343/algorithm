# [Silver III] Inconstant Ordering - 24036

[문제 링크](https://www.acmicpc.net/problem/24036)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 19, 맞힌 사람: 17, 정답 비율: 45.946%

### 분류

애드 혹, 그리디 알고리즘, 문자열

### 문제 설명

<p>We want to build a string with English alphabet uppercase letters in sorted order. However, we want the order to be sometimes strictly increasing and sometimes strictly decreasing.</p>

<p>The first letter of the string must be&nbsp;<code>A</code>. After that, the string must contain one or more blocks of letters. The $i$-th block must contain exactly&nbsp;$L_i$&nbsp;letters. Each letter in the&nbsp;$i$-th block must be later in the alphabet than its preceding letter in the string if&nbsp;$i$&nbsp;is odd and earlier in the alphabet than its preceding letter if&nbsp;$i$&nbsp;is even. Notice that for the first letter of a block, its preceding letter exists, even though it is not in the block. Strings that follow all of these rules are called valid. There can be multiple valid strings, and we want to find the alphabetically first one.</p>

<p>For example, if there are&nbsp;$2$&nbsp;blocks of sizes&nbsp;$L_1=2$&nbsp;and&nbsp;$L_2=3$, the string must have exactly&nbsp;$1+L_1+L_2=1+2+3=6$&nbsp;letters (the&nbsp;$1$&nbsp;is for the initial&nbsp;<code>A</code>). The strings&nbsp;<code>XYZYBA</code>,&nbsp;<code>AZYCBA</code>&nbsp;and&nbsp;<code>AYZYBB</code>&nbsp;are not valid for this case because they violate the required starting letter condition, and the ordering conditions in the first and second block, respectively. The string&nbsp;<code>AYZYBA</code>&nbsp;is valid. The string&nbsp;<code>ABDCBA</code>&nbsp;is also valid and, moreover, it is the alphabetically first valid string.</p>

<p>Given the sizes of the blocks, output the valid string that comes first in alphabetical order in the list of all valid strings. It can be shown that, for all inputs within the given limits, at least one valid string exists.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case is described with two lines. The first line of a test case contains a single integer&nbsp;$N$, the number of blocks. The second line contains&nbsp;$N$&nbsp;integers&nbsp;$L_1,L_2, \cdots ,L_N$, the number of letters each block must have, in order.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the valid string that comes first in alphabetical order. It is guaranteed that at least one valid string exists.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;L_i&le;25$, for all $i$.</li>
</ul>