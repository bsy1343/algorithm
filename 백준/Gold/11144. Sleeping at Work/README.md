# [Gold III] Sleeping at Work - 11144

[문제 링크](https://www.acmicpc.net/problem/11144)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 20, 맞힌 사람: 15, 정답 비율: 37.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are at work. Unfortunately, there is a programming competition immediately after your working hours. In order to perform well, you need some sleep at work to regain as much energy as possible. Your workday is N minutes long, and each minute has an energy value, e<sub>0</sub>, e<sub>1</sub>, . . . , e<sub>N&minus;1</sub>. Your sleep requirement is exactly M minutes, but you can only sleep for a maximum of R minutes in a row before your boss notices. There is a bonus if you sleep for several minutes in a row; the i-th minute in a row will have its energy value multiplied by i. For instance, if you sleep for three minutes having energy values of 10, 10 and 9, you will gain 10 + 2 &middot; 10 + 3 &middot; 9 = 57 energy. After you have slept for M minutes, you are fully rested and cannot sleep any more that day. You have decided to write a computer program which calculates the maximum amount of energy you can gain during a given workday.</p>

### 입력

<p>The first line of input contains a single integer T, the number of test cases to follow. Each test case begins with a line containing three integer numbers, N, the number of minutes in your workday, M, the sleep requirement in number of minutes, and R, the maximum number of minutes in a row you can sleep before your boss notices. Then follows a line containing N numbers, e<sub>0</sub>, e<sub>1</sub>, . . . , e<sub>N&minus;1</sub>, each minute&rsquo;s energy value.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; N &le; 500</li>
	<li>0 &lt; M &le; 50</li>
	<li>0 &lt; R &le; 50</li>
	<li>0 &le; e<sub>i</sub> &le; 100</li>
	<li>You can only start and stop sleeping exactly when the minute indicator on the clock changes.</li>
</ul>

### 출력

<p>For each test case output one line containing a single number, the highest amount of energy that can be gained by sleeping a total of M minutes, or output impossible if it is not possible to get the required amount of sleep.</p>