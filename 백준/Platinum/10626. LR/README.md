# [Platinum V] LR - 10626

[문제 링크](https://www.acmicpc.net/problem/10626)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 20, 맞힌 사람: 18, 정답 비율: 48.649%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 문자열, 브루트포스 알고리즘, 그래프 탐색, 많은 조건 분기, 깊이 우선 탐색, 파싱, 재귀

### 문제 설명

<p>JAG Kingdom will hold a contest called ICPC (Interesting Contest for Producing Calculation).</p>

<p>At the contest, you are given a string composed of <code>?</code>s and <em>usable characters</em>. You should replace all <code>?</code>s in the string with the usable characters to make the string valid mathematical expression, before submitting it. The usable characters are <code>L</code>, <code>R</code>, <code>(</code>, <code>)</code>, <code>,</code>, <code>0</code>, <code>1</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, <code>7</code>, <code>8</code>, and <code>9</code>.</p>

<p>For example, suppose that you are given the string &quot;R(??3,??1?78??1?)?&quot;, then you can submit &quot;R(123,L(1678,213))&quot; as an example.</p>

<p>The submitted string will be scored as follows.</p>

<ul>
	<li>
	<p>Let \(L\) and \(R\) be functions defined by \(L(x,y)=x\), \(R(x,y)=y\), where \(x\) and \(y\) are non-negative integers.</p>
	</li>
	<li>
	<p>The submitted string will be regarded as a mathematical expression, whose value will be the score. For example, the score of the string &quot;R(123,L(1678,213))&quot; is \(R(123,L(1678,213)) = R(123,1678) = 1678\).</p>
	</li>
	<li>
	<p>If the string cannot be evaluated as a mathematical expression about the functions \(L\) and \(R\), the string will be rejected. For example, &quot;R&quot;, &quot;R(3)&quot;, &quot;R(3,2&quot;, &quot;R(3,2,4)&quot; and &quot;LR(3,2)&quot; are all invalid.</p>
	</li>
	<li>
	<p>And strings that contain numbers with extra leading zeros, will be rejected. For example, &quot;R(04,18)&quot; is invalid, while &quot;R(0,18)&quot; is valid.</p>
	</li>
</ul>

<p>The winner of the contest will be the person getting the highest score. Your friend Jagger, who is going to join the contest, wants to be the winner. You are asked by Jagger to make the program finding the possible highest score for the input string.</p>

### 입력

<p>The input contains one string in a line, whose length \(N\) is between \(1\) and \(50\), inclusive.</p>

<p>You can assume that each element in the string is one of <code>L</code>, <code>R</code>, <code>(</code>, <code>)</code>, <code>,</code>, <code>0</code>, <code>1</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, <code>7</code>, <code>8</code>, <code>9</code>, or <code>?</code>.</p>

### 출력

<p>Display the possible highest score in a line for the given string.</p>

<p>If it&#39;s impossible to get valid strings for the input string, print &quot;invalid&quot; in a line.</p>