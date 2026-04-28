# [Platinum III] LaLa and Lamp - 28006

[문제 링크](https://www.acmicpc.net/problem/28006)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

해 구성하기

### 문제 설명

<p>When $\color{blue}{\text{LaLa}}$ laid down on her pet $\color{brown}{\text{Leo}}$&#39;s back to fall asleep, she noticed that the lamp is all messed up, which must have been the act of her sister $\color{purple}{\text{LiLi}}$.</p>

<p>The lamp can be modeled as a regular triangular grid where each cell contains a bulb which is either <strong>on</strong> or <strong>off</strong>.</p>

<p>$\color{blue}{\text{LaLa}}$ wants to turn off the lamp (that is, set the state of all bulbs to off). $\color{blue}{\text{LaLa}}$ can pick any of the three directions parallel to the side of a lamp, pick any row parallel to that direction, and then flip the state of all the bulbs in the row (on to off and off to on) with her $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$. $\color{blue}{\text{LaLa}}$ also could just walk over to the lamp and manually turn every bulb off, but she would prefer not to.</p>

<p>Write a program that determines whether $\color{blue}{\text{LaLa}}$ can turn off the lamp with her $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$.</p>

### 입력

<p>The input is given in the following format:</p>

<blockquote>
<p>$N$</p>

<p>$S_0$</p>

<p>$S_1$</p>

<p>$\vdots$</p>

<p>$S_{N-1}$</p>
</blockquote>

<p>where $N$ is the number of bulbs in a side of the lamp, and $S_i$ is the binary string of length $i+1$ representing the initial states of bulbs in the $i$-th row, where the $j$-th character of $S_i$ is &#39;1&#39; if and only if the $j$-th bulb is on.</p>

<p>The input satisfies the following constraint:</p>

<ul>
	<li>$N$ is an integer.</li>
	<li>$2 \le N \le 2\,000$</li>
</ul>

### 출력

<p>If $\color{blue}{\text{LaLa}}$ can turn off the lamp with $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$, print a single string &quot;Yes&quot;. Otherwise, print a single string &quot;No&quot;. You may print each character in either case (lower or upper).</p>

### 힌트

<p>The following illustrates a sequence of $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$ $\color{blue}{\text{LaLa}}$ should cast to turn off the lamp given in the sample. Empty circles denote the bulbs that are off, yellow circles denote the bulbs that are on, and red line is the choosen row for $\color{red}{\text{m}} \color{brown}{\text{a}} \color{orange}{\text{g}} \color{blue}{\text{i}} \color{magenta} {\text{c}}$.</p>

<table class="table table-bordered th-center td-center">
	<tbody>
		<tr>
			<th>Step 0</th>
			<th>Step 1</th>
			<th>Step 2</th>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/1688ed12.png" data-original-src="https://upload.acmicpc.net/599af414-58b4-4172-9e5c-6803de239ec6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 306px; height: 253px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/d8572009.png" data-original-src="https://upload.acmicpc.net/e98f9be3-d589-46b7-bb70-2060d2d573e1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 277px; height: 233px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/654d6f5c.png" data-original-src="https://upload.acmicpc.net/4bf2abbd-f37e-4e2b-a60e-8d8521a52662/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 257px; height: 244px;" /></td>
		</tr>
		<tr>
			<th>Step 3</th>
			<th>Step 4</th>
			<th>Step 5</th>
		</tr>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/67a067d6.png" data-original-src="https://upload.acmicpc.net/6b8b77bc-b0f7-4e96-aa28-3db81d058b40/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 261px; height: 243px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/736b299f.png" data-original-src="https://upload.acmicpc.net/8ab5f9ba-dfb1-4725-96f9-4902ec92f920/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 248px; height: 223px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/9d179fe1.png" data-original-src="https://upload.acmicpc.net/e6775132-9ad0-42a5-86e6-9c556a08931a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 254px; height: 239px;" /></td>
		</tr>
		<tr>
			<th colspan="3">Step 6</th>
		</tr>
		<tr>
			<td colspan="3"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28006.%E2%80%85LaLa%E2%80%85and%E2%80%85Lamp/2a577eaf.png" data-original-src="https://upload.acmicpc.net/0c160b1f-2618-4262-a6be-37129affe289/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 242px;" /></td>
		</tr>
	</tbody>
</table>