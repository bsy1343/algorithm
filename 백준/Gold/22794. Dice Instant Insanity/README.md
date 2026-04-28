# [Gold II] Dice Instant Insanity - 22794

[문제 링크](https://www.acmicpc.net/problem/22794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Instant Insanity is a puzzle played with four cubes. Each face of the cubes is colored with red, blue, green, or yellow. The goal of this puzzle is to arrange the four cubes in a line so that all four colors appear on every long side of the line.</p>

<p>Now let us consider the modified version of Instant Insanity. In the modified version, we play with six different dice instead of four colored cubes. Each die has all numbers from one to six, but the sum of numbers on the opposite faces is not always seven. Our goal is to arrange the six dice in a line so that all six numbers appear on every long side. The figure below illustrates how the dice should be arranged.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22794.%E2%80%85Dice%E2%80%85Instant%E2%80%85Insanity/27289b2d.png" data-original-src="https://upload.acmicpc.net/cea61557-19a4-463f-add8-b3faad8f52b3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 294px; height: 184px;" /></p>

<p>In this problem, you are required to count up the number of different ways to arrange given six dice on the condition described above.</p>

<p>Two arrangements should be regarded as same if one can be obtained by</p>

<ul>
	<li>changing the order of the dice of the other, and/or</li>
	<li>rotating the other entirely.</li>
</ul>

<p>Note that the appearance does not matter to identity of arrangments. In other words, arrangements should be regarded as different if the numbers even on faces inside the line of dice are different (except for the case mentioned above, of course).</p>

### 입력

<p>The first line of the input contains an integer that indicates the number of data sets.</p>

<p>The rest of the input is a series of data sets. A data set consists of six lines. Each line represents a die and contains six integers that indicates the numbers on the top, forward, right, left, backword, and bottom faces of the die respectively.</p>

<p>No pair of dice in the same data set are identical, that is, have rotation so that the numbers on every pair of corresponding face match.</p>

### 출력

<p>Print the number of arrangements in a line for each data set.</p>