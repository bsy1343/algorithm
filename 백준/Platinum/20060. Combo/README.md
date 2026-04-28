# [Platinum IV] Combo - 20060

[문제 링크](https://www.acmicpc.net/problem/20060)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 358, 정답: 128, 맞힌 사람: 124, 정답 비율: 37.126%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>You are playing an action video game. The game controller has buttons, <code>A</code>, <code>B</code>, <code>X</code>, and <code>Y</code>. In this game, you can get coins with combo moves. You can make a combo move by pressing buttons in sequence.</p>

<p>This game has a secret sequence of buttons, which can be represented as a string <em>S</em> of those characters. You don&#39;t know the string <em>S</em>, but you know its length <em>N</em>.</p>

<p><strong>You also know that the first character of <em>S</em> never reappears in it.</strong> For example, <em>S</em> can be &quot;<code>ABXYY</code>&quot; or &quot;<code>XYYAA</code>&quot;, but cannot be &quot;<code>AAAAA</code>&quot; or &quot;<code>BXYBX</code>&quot;.</p>

<p>You can press a sequence of up to 4<em>N</em> buttons for a combo move. Let <em>p</em> be the string which represents the sequence of the buttons you pressed. The number of coins you get for this move is calculated as the length of the longest prefix of <em>S</em> which is also a substring of <em>p</em>. A substring of a string <em>t</em> is a contiguous (possibly empty) sequence of characters within <em>t</em>. A prefix of <em>t</em> is a substring of that is empty or contains the first character of <em>t</em>.</p>

<p>For example, if <em>S</em> is &quot;<code>ABXYY</code>&quot; and p is &quot;<code>XXYYABYABXAY</code>&quot;, you will get 3 coins because &quot;<code>ABX</code>&quot; is the longest prefix of <em>S</em> that is also a substring of <em>p</em>.</p>

<p>Your task is to determine the secret string <em>S</em> using few combo moves.</p>

### 입력



### 출력



### 제한

<ul>
	<li>1 &le; <em>N</em> &le; 2 000</li>
	<li>Each character of the string <em>S</em> is <code>A</code>, <code>B</code>, <code>X</code>, or <code>Y</code>.</li>
	<li>The first character of <em>S</em> never reappears in <em>S</em>.</li>
</ul>

### 힌트

<p>Note that your score for each subtask is the minimum of the scores for the test cases in the subtask.</p>