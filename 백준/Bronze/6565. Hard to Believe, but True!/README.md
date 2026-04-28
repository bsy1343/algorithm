# [Bronze II] Hard to Believe, but True! - 6565

[문제 링크](https://www.acmicpc.net/problem/6565)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 319, 정답: 232, 맞힌 사람: 204, 정답 비율: 72.598%

### 분류

수학, 구현, 문자열, 사칙연산, 파싱

### 문제 설명

<p>The fight goes on, whether to store numbers starting with their most significant digit or their least significant digit. Sometimes this is also called the &quot;Endian War&quot;. The battleground dates far back into the early days of computer science. Joe Stoy, in his (by the way excellent) book &quot;Denotational Semantics&quot;, tells following story:</p>

<blockquote>&quot;The decision which way round the digits run is, of course, mathematically trivial. Indeed, one early British computer had numbers running from right to left (because the spot on an oscilloscope tube runs from left to right, but in serial logic the least significant digits are dealt with first). Turing used to mystify audiences at public lectures when, quite by accident, he would slip into this mode even for decimal arithmetic, and write things like <code>73+42=16</code>. The next version of the machine was made more conventional simply by crossing the <em>x</em>-deflection wires: this, however, worried the engineers, whose waveforms were all backwards. That problem was in turn solved by providing a little window so that the engineers (who tended to be behind the computer anyway) could view the oscilloscope screen from the back.

<p>&nbsp;</p>

<p>[C. Strachey - private communication.]&quot;</p>
</blockquote>

<p>You will play the role of the audience and judge on the truth value of Turing&#39;s equations.</p>

### 입력

<p>The input contains several test cases. Each specifies on a single line a Turing equation. A Turing equation has the form <code>&quot;</code><em>a</em><code>+</code><em>b</em><code>=</code><em>c</em><code>&quot;</code>, where <em>a, b, c</em> are numbers made up of the digits <em>0,...,9</em>. Each number will consist of at most <em>7</em> digits. This includes possible leading or trailing zeros. The equation <code>&quot;0+0=0&quot;</code> will finish the input and has to be processed, too. The equations will not contain any spaces.</p>

### 출력

<p>For each test case generate a line containing the word <code>&quot;True&quot;</code> or the word <code>&quot;False&quot;</code>, if the equation is true or false, respectively, in Turing&#39;s interpretation, i.e. the numbers being read backwards.</p>