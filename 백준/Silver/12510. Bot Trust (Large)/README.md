# [Silver IV] Bot Trust (Large) - 12510

[문제 링크](https://www.acmicpc.net/problem/12510)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 104, 정답: 84, 맞힌 사람: 76, 정답 비율: 80.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Blue and Orange are friendly robots. An evil computer mastermind has locked them up in separate hallways to test them, and then possibly give them cake.</p>

<p>Each hallway contains 100 buttons labeled with the positive integers {1, 2, ..., 100}. Button k is always k meters from the start of the hallway, and the robots both begin at button 1. Over the period of one second, a robot can walk one meter in either direction, or it can press the button at its position once, or it can stay at its position and not press the button. To complete the test, the robots need to push a certain sequence of buttons in a certain order. Both robots know the full sequence in advance. How fast can they complete it?</p>

<p>For example, let&#39;s consider the following button sequence:</p>

<p><code>&nbsp;&nbsp;&nbsp;O 2, B 1, B 2, O 4</code></p>

<p>Here,&nbsp;<code>O 2</code>&nbsp;means button 2 in Orange&#39;s hallway,&nbsp;<code>B 1</code>&nbsp;means button 1 in Blue&#39;s hallway, and so on. The robots can push this sequence of buttons in 6 seconds using the strategy shown below:</p>

<pre>
Time | Orange                  | Blue
-----+------------------+-----------------
  1      | Move to button 2 | Stay at button 1
  2     | Push button 2       | Stay at button 1
  3     | Move to button 3  | Push button 1
  4     | Move to button 4  | Move to button 2
  5     | Stay at button 4     | Push button 2
  6     | Push button 4        | Stay at button 2
</pre>

<p>Note that Blue has to wait until Orange has completely finished pushing&nbsp;<code>O 2</code>&nbsp;before it can start pushing&nbsp;<code>B 1</code>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case consists of a single line beginning with a positive integer&nbsp;<strong>N</strong>, representing the number of buttons that need to be pressed. This is followed by&nbsp;<strong>N</strong>&nbsp;terms of the form &quot;<strong>R</strong><sub>i</sub><strong>P</strong><sub>i</sub>&quot; where&nbsp;<strong>R</strong><sub>i</sub>&nbsp;is a robot color (always &#39;O&#39; or &#39;B&#39;), and&nbsp;<strong>P</strong><sub>i</sub>&nbsp;is a button position.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>P</strong><sub>i</sub>&nbsp;&le; 100 for all i.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of seconds required for the robots to push the given buttons, in order.</p>