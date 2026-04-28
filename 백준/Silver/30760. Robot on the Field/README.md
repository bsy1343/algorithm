# [Silver III] Robot on the Field - 30760

[문제 링크](https://www.acmicpc.net/problem/30760)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

구현, 그리디 알고리즘, 문자열, 시뮬레이션

### 문제 설명

<p>Andrysha is fond of computer games. He recently he found another exciting game:</p>

<p>Game world is an infinity plane, divided into cells. Each cell has its own game coordinates. Player controls a robot, initially located in the cell with coordinates $(0, 0)$. Player is able to move robot left, up, right and down by pressing keyboard buttons. In fact:</p>

<ul>
	<li>every time button &#39;<code>L</code>&#39; is pressed, the first coordinate of the robot position decreases by $1$.</li>
	<li>every time button &#39;<code>U</code>&#39; is pressed, the second coordinate of the robot position increases by $1$.</li>
	<li>every time button &#39;<code>R</code>&#39; is pressed, the first coordinate of the robot position increases by $1$.</li>
	<li>every time button &#39;<code>D</code>&#39; is pressed, the second coordinate of the robot position decreases by $1$.</li>
</ul>

<p>The goal is to move robot to some given cell $(x, y)$. Though the game sounds easy, Andrysha was unable to finish it and asked his friend Zhenya for help. Zhenya told him a sequence of pressings of the buttons that he used, but this hint didn&#39;t help (maybe Zhenya had a different target cell)! Andrysha went mad and slammed keyboard so hard that broke some buttons. Broken buttons no longer react on pressings and this might be really helpful!</p>

<p>Andrysha wants to find out, if he can finish the game using Zhenya&#39;s instructions and breaking some buttons at some moments of time. Pressing broken button doesn&#39;t affect the robot. Andrysha can break any button before any pressure of any button or after any pressure of any button. Moreover, he can break several buttons (even all of them) at the same time. He also can break buttons before the very first pressure. He always breaks all the remaining buttons at the end of the game.</p>

### 입력

<p>The first line of the input contains one integer $n$ ($1 \le n \le 1\,000\,000$) --- the length of the Zhenya&#39;s list of instructions. </p>

<p>The following line contains $n$ characters &#39;<code>L</code>&#39;, &#39;<code>U</code>&#39;, &#39;<code>R</code>&#39;, &#39;<code>D</code>&#39; --- list of the instructions. </p>

<p>The third line of the input contains two integers $x$ and $y$ ($-1\,000\,000 \le x, y \le 1\,000\,000$), denoting coordinates of the target cell, where the robot should be located after performing all the instructions.</p>

### 출력

<p>If there is no way Andrysha can succeed, print one integer $-1$.</p>

<p>Otherwise output four integers from $0$ to $n$, denoting the moment of time when Andrysha should break buttons &quot;<code>L</code>&quot;, &quot;<code>U</code>&quot;, &quot;<code>R</code>&quot;, &quot;<code>D</code>&quot;, respectively. If a button should be broken before all pressings, print $0$ for it. As Andrysha breaks all working buttons after game, <strong>every printed number</strong> should be between $0$ and $n$.</p>

<p>If there is more than one solution, print any of them.</p>

### 힌트

<p>In the first sample, the destination cell is too far from the starting cell, so the robot can&#39;t reach it in four or less pressings.</p>

<p>In the second sample, all buttons can be broken before the beginning of the game, so robot will stay at the starting-destination point.</p>

<p>In the third sample, if all buttons are broken according to the answer, the resulting sequence of robot&#39;s actions will be the <code>LURDRD</code> and robot will reach the destination.</p>