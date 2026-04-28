# [Silver IV] Snapper Chain (Large) - 12590

[문제 링크](https://www.acmicpc.net/problem/12590)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 76, 맞힌 사람: 69, 정답 비율: 75.824%

### 분류

수학, 비트마스킹

### 문제 설명

<p>The&nbsp;<em>Snapper</em>&nbsp;is a clever little device that, on one side, plugs its input plug into an output socket, and, on the other side, exposes an output socket for plugging in a light or other device.</p>

<p>When a&nbsp;<em>Snapper</em>&nbsp;is in the ON state and is receiving power from its input plug, then the device connected to its output socket is receiving power as well. When you snap your fingers -- making a clicking sound -- any&nbsp;<em>Snapper</em>&nbsp;receiving power at the time of the snap toggles between the ON and OFF states.</p>

<p>In hopes of destroying the universe by means of a singularity, I have purchased&nbsp;<strong>N</strong><em>Snapper</em>&nbsp;devices and chained them together by plugging the first one into a power socket, the second one into the first one, and so on. The light is plugged into the&nbsp;<strong>N</strong>th&nbsp;<em>Snapper</em>.</p>

<p>Initially, all the&nbsp;<em>Snapper</em>s are in the OFF state, so only the first one is receiving power from the socket, and the light is off. I snap my fingers once, which toggles the first&nbsp;<em>Snapper</em>&nbsp;into the ON state and gives power to the second one. I snap my fingers again, which toggles both&nbsp;<em>Snapper</em>s and then promptly cuts power off from the second one, leaving it in the ON state, but with no power. I snap my fingers the third time, which toggles the first&nbsp;<em>Snapper</em>again and gives power to the second one. Now both&nbsp;<em>Snapper</em>s are in the ON state, and if my light is plugged into the second&nbsp;<em>Snapper</em>&nbsp;it will be&nbsp;<em>on</em>.</p>

<p>I keep doing this for hours. Will the light be&nbsp;<em>on</em>&nbsp;or&nbsp;<em>off</em>&nbsp;after I have snapped my fingers&nbsp;<strong>K</strong>times? The light is&nbsp;<em>on</em>&nbsp;if and only if it&#39;s receiving power from the&nbsp;<em>Snapper</em>&nbsp;it&#39;s plugged into.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each one contains two integers,&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10,000.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 30;</li>
	<li>0 &le;&nbsp;<strong>K</strong>&nbsp;&le; 10<sup>8</sup>;</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is either &quot;ON&quot; or &quot;OFF&quot;, indicating the state of the light bulb.</p>