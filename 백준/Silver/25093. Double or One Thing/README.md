# [Silver I] Double or One Thing - 25093

[문제 링크](https://www.acmicpc.net/problem/25093)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 207, 정답: 128, 맞힌 사람: 119, 정답 비율: 65.027%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>You are given a string of uppercase English letters. You can highlight any number of the letters (possibly all or none of them). The highlighted letters do not need to be consecutive. Then, a new string is produced by processing the letters from left to right: non-highlighted letters are appended once to the new string, while highlighted letters are appended twice.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25093.%E2%80%85Double%E2%80%85or%E2%80%85One%E2%80%85Thing/0d9329be.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25093.%E2%80%85Double%E2%80%85or%E2%80%85One%E2%80%85Thing/0d9329be.png" data-original-src="https://upload.acmicpc.net/4411ea59-17d3-4d3e-9d18-bb47d191340b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 444px; height: 21px;" /></p>

<p>For example, if the initial string is <code>HELLOWORLD</code>, you could highlight the <code>H</code>, the first and last <code>L</code>s and the last <code>O</code> to obtain <code><span style="background-color: #fee183;">H</span>E<span style="background-color: #fee183;">L</span>LOW<span style="background-color: #fee183;">O</span>R<span style="background-color: #fee183;">L</span>D</code> &rArr; <code>HHELLLOWOORLLD</code>. Similarly, if you highlight nothing, you obtain <code>HELLOWORLD</code>, and if you highlight all of the letters, you obtain <code>HHEELLLLOOWWOORRLLDD</code>. Notice how each occurrence of the same letter can be highlighted independently.</p>

<p>Given a string, there are multiple strings that can be obtained as a result of this process, depending on the highlighting choices. Among all of those strings, output the one that appears first in alphabetical (also known as lexicographical) order.</p>

<p>Note: A string $s$ appears before a different string $t$ in alphabetical order if $s$ is a prefix of $t$ or if at the first place $s$ and $t$ differ, the letter in $s$ is earlier in the alphabet than the letter in $t$. For example, these strings are in alphabetical order: <code>CODE</code>, <code>HELLO</code>, <code>HI</code>, <code>HIM</code>, <code>HOME</code>, <code>JAM</code>.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case is described in a single line containing a single string $S$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the string that comes first alphabetically from the set of strings that can be produced from $S$ by the process described above.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>Each character of $S$ is an uppercase letter from the English alphabet.</li>
</ul>

### 힌트

<p>In Sample Case #1, these are all the strings that can be obtained, in alphabetical order: <code>PEEEEL</code>, <code>PEEEELL</code>, <code>PEEEL</code>, <code>PEEELL</code>, <code>PEEL</code>, <code>PEELL</code>, <code>PPEEEEL</code>, <code>PPEEEELL</code>, <code>PPEEEL</code>, <code>PPEEELL</code>, <code>PPEEL</code>, and <code>PPEELL</code>.</p>

<p>In Sample Case #2, every string that can be obtained contains only <code>A</code>s. The shortest of those is alphabetically first, because it is a prefix of all others.</p>

<p>In Sample Case #3, there are $1024$ possible strings which can be generated from <code>CODEJAMDAY</code> out of which <code>CCODDEEJAAMDAAY</code> is the lexicographically smallest one.</p>