# [Platinum V] Erratic Lights - 35076

[문제 링크](https://www.acmicpc.net/problem/35076)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 15, 맞힌 사람: 14, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 조합론, 확률론

### 문제 설명

<p>You have almost finished setting up your stall for the Christmas market after many days of work. There is only one thing left to do: plugging in the string of lights. As you plug in the cord, you notice that you have brought the wrong lights -- you planned to bring a string of blue lights, but instead, the lights are coloured in red, green, and blue! While leaning against your stall in despair, you accidentally bump into one of the light bulbs, and it immediately changes colour. You notice that every time you touch a light bulb, it randomly takes one of the three colours, each with equal probability.</p>

<p>The market starts in five hours already, and there is no way you have enough time to get this string of lights off the stall and install the one you wanted. At the very least, you want all the lights to have the same colour, no matter which colour that is. What is the minimal expected number of times you need to touch a light bulb to make all of them have the same colour?</p>

<p>For example, consider the first sample input and say you touch the red light until it turns blue. Every time you touch it, the new colour is either red, green, or blue. The expected number of times you need to touch it until it becomes blue is $3$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1 \leq n \leq 100$), the number of bulbs on the string of lights.</li>
<li>One line with $n$ characters, each character being either '<code>r</code>', '<code>g</code>', or '<code>b</code>', indicating the colours of the light bulbs at the start.</li>
</ul>

### 출력

<p>Output the expected number of times you need to touch a light bulb to make all of them have the same colour, assuming an optimal strategy that tries to minimize the expected number of touches.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>