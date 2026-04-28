# [Gold II] Extended Lights Out - 6363

[문제 링크](https://www.acmicpc.net/problem/6363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 34, 맞힌 사람: 28, 정답 비율: 87.500%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>&nbsp;</p>

<p>In an extended version of the game Lights Out&reg;, is a puzzle with 5 rows of 6 buttons each (the actual puzzle has 5 rows of 5 buttons each). Each button has a light. When a button is pressed, that button and each of its (up to four) neighbors above, below, right and left, has the state of its light reversed. (If on, the light is turned off; if off, the light is turned on.) Buttons in the corners change the state of 3 buttons; buttons on an edge change the state of 4 buttons and other buttons change the state of 5. For example, if the buttons marked X on the left below were to be pressed, the display would change to the image on the right.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6363.%E2%80%85Extended%E2%80%85Lights%E2%80%85Out/0a0cb2c3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6363.%E2%80%85Extended%E2%80%85Lights%E2%80%85Out/0a0cb2c3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6363/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:149px; width:449px" /></p>

<p>The aim of the game is, starting from any initial set of lights on in the display, to press buttons to get the display to a state where all lights are off. When adjacent buttons are pressed, the action of one button can undo the effect of another. For instance, in the display below, pressing buttons marked X in the left display results in the right display. Note that the buttons in row 2 column 3 and row 2 column 5 both change the state of the button in row 2 column 4, so that, in the end, its state is unchanged.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6363.%E2%80%85Extended%E2%80%85Lights%E2%80%85Out/177a7e5e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6363.%E2%80%85Extended%E2%80%85Lights%E2%80%85Out/177a7e5e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6363/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:454px" /></p>

<p>Note:</p>

<ol>
	<li>It does not matter what order the buttons are pressed.</li>
	<li>If a button is pressed a second time, it exactly cancels the effect of the first press, so no button ever need be pressed more than once.</li>
	<li>As illustrated in the second diagram, all the lights in the first row may be turned off, by pressing the corresponding buttons in the second row. By repeating this process in each row, all the lights in the first four rows may be turned out. Similarly, by pressing buttons in columns 2, 3 &hellip;, all lights in the first 5 columns may be turned off.</li>
</ol>

<p>Write a program to solve the puzzle.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input is a positive integer n which is the number of puzzles that follow. Each puzzle will be five lines, each of which has six 0&rsquo;s or 1&rsquo;s separated by one or more spaces. A 0 indicates that the light is off, while a 1 indicates that the light is on initially.</p>

### 출력

<p>For each puzzle, the output consists of a line with the string: &ldquo;PUZZLE #m&rdquo;, where m is the index of the puzzle in the input file. Following that line, is a puzzle-like display (in the same format as the input) . In this case, 1&rsquo;s indicate buttons that must be pressed to solve the puzzle, while 0&rsquo;s indicate buttons, which are not pressed. There should be exactly one space between each 0 or 1 in the output puzzle-like display.</p>