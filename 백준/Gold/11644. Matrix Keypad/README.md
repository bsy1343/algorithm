# [Gold V] Matrix Keypad - 11644

[문제 링크](https://www.acmicpc.net/problem/11644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 20, 정답 비율: 66.667%

### 분류

애드 혹

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11644.%E2%80%85Matrix%E2%80%85Keypad/6d16ee91.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11644.%E2%80%85Matrix%E2%80%85Keypad/6d16ee91.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11644/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:285px; width:206px" />A matrix keypad consists of an r &times; c grid of buttons. Additionally, there is one wire for each row and one wire for each column. These wires are exposed through pins so the keypad can be connected to a larger circuit.</p>

<p>When a button at row i and column j is pressed, the wire for row i and the wire for column j will carry an electrical current. If just a single button is pressed, it can be identified by sequentially checking if a current can be detected at each row wire and at each column wire.</p>

<p>Unfortunately, when multiple buttons are pressed at the same time, it may not be possible to uniquely identify which buttons are pressed. The only information you can have is this: for each wire, whether there is at least one button along that wire being pressed.</p>

<p>The software you are using to detect which buttons are pressed was poorly implemented. After probing the keypad, it stores the information in an r &times; c grid of 0/1 values. The value stored in row i and column j of this grid is 1 if there is at least one button in row i and at least one (possibly different) button in column j that is pressed. Otherwise, the value that is stored at this position is 0.</p>

<p>Your job is to interpret as much information from such a grid as possible. Determine which buttons are definitely pressed and which buttons are definitely not pressed.</p>

### 입력

<p>The first line of input contains a single positive integer T &le; 200 indicating the number of test cases. The first line of each test case contains two integers r and c where 1 &le; r &le; 10 and 1 &le; c &le; 10. This indicates that the keypad is an r &times; c grid of buttons.</p>

<p>The remaining r lines of a test case describe the grid. The ith row contains a string of consecutive 0 and 1 characters. These will not be separated by spaces.</p>

### 출력

<p>For each test case, output the following. If there is no combination of button presses on the keypad that would produce this 0/1 grid then simply output a line containing the word impossible</p>

<p>Otherwise, you should output r lines, each containing a string of length c. This should describe a grid where the character at row i and column j is:</p>

<ul>
	<li>N if no button combination that produces the input grid has the jth button on row i being pressed.</li>
	<li>P if all button combinations that produce the input grid have the jth button on row i being pressed.</li>
	<li>I if some, but not all, button combinations that produce the input grid have the jth button on row i being pressed.</li>
</ul>

<p>Finally, the last line of each test case should be followed by the string ---------- (10 dashes).</p>