# [Silver IV] Speed Typing - 24839

[문제 링크](https://www.acmicpc.net/problem/24839)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 370, 정답: 209, 맞힌 사람: 158, 정답 비율: 58.736%

### 분류

구현, 그리디 알고리즘, 문자열

### 문제 설명

<p>Barbara is a speed typer. In order to check her typing speed, she performs a speed test. She is given a string&nbsp;$I$&nbsp;that she is supposed to type.</p>

<p>While Barbara is typing, she may make some mistakes, such as pressing the wrong key. As her typing speed is important to her, she does not want to spend additional time correcting the mistakes, so she continues to type with the errors until she finishes the speed test. After she finishes the speed test, she produces a&nbsp;$P$.</p>

<p>Now she wonders how many extra letters she needs to delete in order to get&nbsp;$I$&nbsp;from&nbsp;$P$. It is possible that Barbara made a mistake and&nbsp;$P$&nbsp;cannot be converted back to&nbsp;$I$&nbsp;just by deleting some letters. In particular, it is possible that Barbara missed some letters.</p>

<p>Help Barbara find out how many extra letters she needs to remove in order to obtain&nbsp;$I$&nbsp;or if&nbsp;$I$&nbsp;cannot be obtained from&nbsp;$P$&nbsp;by removing letters then output&nbsp;<code>IMPOSSIBLE</code>.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>Each test case has&nbsp;$2$&nbsp;lines. The first line of each test case is an input string&nbsp;$I$&nbsp;(that denotes the string that the typing test has provided). The next line is the produced string&nbsp;$P$&nbsp;(that Barbara has entered).</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from&nbsp;$1$) and&nbsp;$y$&nbsp;is the number of extra letters that need to be removed in order to obtain&nbsp;$I$. If it is not possible to obtain&nbsp;$I$&nbsp;then output&nbsp;<code>IMPOSSIBLE</code>&nbsp;as&nbsp;$y$.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>Both the strings contain letters from&nbsp;<code>a</code>-<code>z</code>&nbsp;and&nbsp;<code>A</code>-<code>Z</code>.</li>
	<li>Length of the given strings will be&nbsp;$1 &le; |I|,|P| &le; 10^5$.</li>
	<li style="display: block; width: 0px; height: 0px; padding: 0px; border: 0px; margin: 0px; position: absolute; top: 0px; left: -9999px; opacity: 0; overflow: hidden;">&nbsp;</li>
</ul>