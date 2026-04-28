# [Gold II] New Keyboard - 16271

[문제 링크](https://www.acmicpc.net/problem/16271)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Petya has bought a new keyboard. It supports n layouts, each layout allows to input some subset of characters of the lowercase English alphabet. Layouts are enumerated from 1 to n.</p>

<p>Petya wants to type some message now, it consists of m lowercase letters of the English alphabet. Initially the first layout is active. Petya can do one of the following two actions:</p>

<ul>
	<li>Switch layout to the next one. If the current layout is i, the new layout will have number i mod n&thinsp;+&thinsp;1, where mod denotes the remainder of the division. If the previous action was also layout switch, this action takes b milliseconds, in the other case it takes a milliseconds.</li>
	<li>Type a character. Petya can add the typed character to the end of the current message. He spends c milliseconds for this action.</li>
</ul>

<p>Help Petya to find out what minimal time he needs to type the message, or detect that it is impossible to type the message using his new keyboard. The final layout of the keyboard doesn&#39;t matter.</p>

### 입력

<p>The first line of the input data contains four integers n, a, b and c &mdash; the number of layouts, the number of milliseconds, to switch the layout without a previous switch, to switch the layout after a switch, and to type a character, respectively (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;2&thinsp;000, 1&thinsp;&le;&thinsp;b&thinsp;&le;&thinsp;a&thinsp;&le;&thinsp;10<sup>9</sup>, 1&thinsp;&le;&thinsp;c&thinsp;&le;&thinsp;10<sup>9</sup>).</p>

<p>The following n lines describe the layouts. Each layout is described by a string that contains all lowercase characters of the English alphabet that can be typed using this layout. Each character is specified at most once for each layout. Characters in each string are ordered alphabetically.</p>

<p>The last line contains a string s &mdash; the message that the Petya wants to type (length of s is from 1 to 2&thinsp;000, inclusive). The string s consists of lowercase English letters.</p>

### 출력

<p>Output one integer &mdash; the minimum number of milliseconds needed to type the message. Output &thinsp;-&thinsp;1 if it is impossible to type the message.</p>