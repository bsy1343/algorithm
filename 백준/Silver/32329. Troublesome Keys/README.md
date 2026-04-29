# [Silver II] Troublesome Keys - 32329

[문제 링크](https://www.acmicpc.net/problem/32329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 36, 맞힌 사람: 29, 정답 비율: 49.153%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>As Alex is typing, their keyboard is acting strangely. Two letter keys are causing trouble:</p>

<ul>
	<li>One letter key displays the same wrong letter each time it is pressed. Alex calls this key the silly key. Oddly, Alex never actually tries to type the wrong letter displayed by the silly key.</li>
	<li>Another letter key doesn’t display anything when it is pressed. Alex calls this key the quiet key.</li>
</ul>

<p>Alex presses the silly key at least once but they don’t necessarily press the quiet key.</p>

<p>Your job is to determine the troublesome keys and the wrong letter that is displayed. Luckily, this is possible because Alex never presses the silly key immediately after pressing the quiet key and Alex never presses the quiet key immediately after pressing the silly key.</p>

### 입력

<p>There will be two lines of input. The first line of input represents the N keys Alex presses on the keyboard. The second line of input represents the letters displayed on the screen.</p>

<p>Both lines of input will only contain lowercase letters of the alphabet.</p>

### 출력

<p>There will be two lines of output.</p>

<p>On the first line, output the letter corresponding to the silly key and the wrong letter displayed on the screen when it is pressed, separated by a single space.</p>

<p>On the second line, output the letter corresponding to the quiet key if it is pressed. Output the dash character (<code>-</code>) if the quiet key is not pressed.</p>