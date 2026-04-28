# [Silver I] ZMIJA - 10644

[문제 링크](https://www.acmicpc.net/problem/10644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 141, 정답: 63, 맞힌 사람: 51, 정답 비율: 47.222%

### 분류

애드 혹

### 문제 설명

<p>Mirko is making a clone of the popular computer game &quot;Snake&quot;. In the game, you control the movement of a snake on a screen with dimensions of R &middot; S pixels. The objective of the game is to collect all the apples.</p>

<p>Unfortunately, Mirko&rsquo;s implementation isn&rsquo;t that great and the gameplay is different than the original. Here is a description of Mirko&rsquo;s game:</p>

<ul>
	<li>unlike the original, the apples don&rsquo;t appear randomly on the screen, but instead you know the positions of all apples at the beginning of the game</li>
	<li>at the beginning of the game, the snake is located in the lower left pixel of the screen and is facing right</li>
	<li>there are two buttons in the game, denoted with A and B</li>
	<li>when you press the button A, the snake moves forward by 1 pixel in the direction which it is currently facing. If that move would cause the snake to go off screen, nothing happens.</li>
	<li>when you press the button B, the snake moves up by 1 pixel and changes the direction it&rsquo;s facing by 180&deg;</li>
	<li>when the snake moves to a pixel containing an apple, it eats the apple but doesn&rsquo;t grow like in the original game</li>
</ul>

<p>You have the following task: for given positions of apples at the beginning of the game, determine the smallest number of button presses it takes for the snake to collect all the apples.</p>

### 입력

<p>The first line of input contains the integers R and S (2 &le; R, S &le; 1 000), the height and width of the screen.</p>

<p>Each of the following R lines contains exactly S characters. These characters represent the content of the screen. Pixels with apples on them are denoted with &rsquo;J&rsquo; and empty pixels are denoted with &rsquo;.&rsquo;.</p>

<p>The lower left corner contains the character &rsquo;Z&rsquo; that represents the snake in its initial position.</p>

### 출력

<p>The first and only line of output must contain the required minimal number of button presses.</p>

### 힌트

<p>Clarification of the first example: The shortest sequence of button presses needed for the snake to collect all the apples is BBAAABB.</p>