# [Gold IV] Faulty Traffic Light - 32907

[문제 링크](https://www.acmicpc.net/problem/32907)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

구현, 런타임 전의 전처리, 애드 혹

### 문제 설명

<p>Near Vlad's home, there is a pedestrian traffic light that shows the remaining time to cross the road. The number displayed by the traffic light decreases by 1 every second. However, one day, Vlad approached the crossing and could not believe his eyes: the traffic light switched from 35 to 36!</p>

<p>Vlad was very surprised, but his astonishment faded in the next second: instead of 37 or any other number, the traffic light displayed something that was not a number at all. It turned out that one of the indicators of the traffic light was broken and never lit up. Hence, the number 39 looked like 35, and 38 looked like 36 (see Figures 1-3). After that, Vlad wondered: just how long can this illusion of the traffic light "ticking up by 1" every second last?</p>

<p style="text-align: center;">Figures 1-3. The behavior of the traffic light from the moment it switched to 39 until the moment it switched to 37: expected is on the top, actual is on the bottom. Lit indicators are colored green (looks gray when printed in black and white), functioning but not currently lit indicators are colored white, and the broken indicator is hatched.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td style="width: 33%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/9a82d496.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32907-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 200px;"></td>
			<td style="width: 34%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/2f9bb3fa.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32907-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 200px;"></td>
			<td style="width: 33%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/5b806d18.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32907-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 200px;"></td>
		</tr>
		<tr>
			<td>39 looks like 35</td>
			<td>38 looks like 36</td>
			<td>37 looks like nonsense</td>
		</tr>
	</tbody>
</table>

<p>For example, in the above situation, the illusion has lasted for exactly 1 second: from the moment the traffic light "switched from 35 to 36" (actually from 39 to 38) until the moment the traffic light started showing nonsense. Strictly speaking, the traffic light has "ticked up by 1" for $k$ seconds if it has consecutively displayed $x$, $x+1$, $\ldots$, $x+k$.</p>

<p>You are faced with the following task. The traffic light shows two digits. Both digits are "drawn" in the standard way using seven "stick-like" indicators: four of them are vertical and three are horizontal (see Figure 4).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/9579f096.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32907-4.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 441px; height: 75px;"></p>

<p style="text-align: center;">Figure 4. How the digits look on a functioning traffic light</p>

<p>Each indicator is either functioning (works as it should) or broken (never lights up). The color switching of the traffic light always works correctly and always destroys the illusion of "ticking up". You are given exactly $99$ seconds to cross the road. Hence, a functioning traffic light consecutively shows $99$, $98$, $97$, $\ldots$, $2$ and $1$. It <strong>does not</strong> show $0$, and, instead, immediately switches to another color.</p>

<p>An important note: the traffic light <strong>does not show leading zeros</strong>, meaning that, on a functioning traffic light, the number $6$ is displayed as a single six in the second digit, not as "06". Figures 5-6 show how the numbers $6$ and $37$ are displayed on a functioning traffic light.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/c6273bb4.png" data-original-src="https://boja.mercury.kr/assets/problem/32907-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 95px; height: 75px;"></td>
			<td style="width: 50%;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/134e341b.png" data-original-src="https://boja.mercury.kr/assets/problem/32907-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 95px; height: 75px;"></td>
		</tr>
		<tr>
			<td>Figure 5. The number 6 on a functioning traffic light</td>
			<td>Figure 6. The number 37 on a functioning traffic light</td>
		</tr>
	</tbody>
</table>

<p>If such an illusion cannot be created at all (for example, when the traffic light always shows nonsense), then the answer is considered to be $0$.</p>

<p>Summing up, the task can be formalized as follows. Find the largest non-negative $k$ such that there exists at least one $y$ such that $k + 1 \leqslant y \leqslant 99$ and the numbers $y$, $y-1$, $\ldots$, $y-k$ look as the numbers $x$, $x+1$, $\ldots$, $x+k$ due to the broken indicators. If such a number $k$ does not exist, then the answer should be $0$.</p>

### 입력

<p>The first line contains a string of seven characters, with each being either "0" or "1". They describe the states of the indicators in the first digit of the displayed number according to the order in Figure 7: the first character corresponds to the top horizontal indicator, the second to the upper left vertical indicator, the third to the upper right vertical indicator, the fourth to the middle horizontal indicator, the fifth to the lower left vertical indicator, the sixth to the lower right vertical indicator, and the seventh to the bottom horizontal indicator. A "1" means that the corresponding indicator is functioning, and a "0" means that it is broken.</p>

<p>The second line describes the state of the indicators in the second digit of the displayed number in a similar manner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32907.%E2%80%85Faulty%E2%80%85Traffic%E2%80%85Light/597bbb63.png" data-original-src="https://boja.mercury.kr/assets/problem/32907-7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 63px; height: 100px;"></p>

<p style="text-align: center;">Figure 7. The order of indicators</p>

### 출력

<p>Print a single integer: the answer to the problem.</p>

### 힌트

<p>The first example is the situation discussed in the statement. The statement shows how the illusion can last for one second. It can be shown that it cannot last longer.</p>

<p>In the second example, additionally, the second and fifth (left vertical) indicators in the first digit are broken. The answer of $1$ is still achieved in the same way ($39$ looks like $35$, and $38$ looks like $36$).</p>

<p>In the third example, the answer is $0$. Note that $90$ on such a traffic light looks like $51$, and $89$ looks like $61$, which is greater than $51$. However, these two consecutive displays of the traffic light do <strong>not</strong> form an illusion of length $1$, as the numbers $51$ and $61$ are not consecutive.</p>

<p>In the fourth example, all indicators are broken, and therefore, the traffic light never displays a correctly written number. According to the statement, in this case, the output should be $0$.</p>