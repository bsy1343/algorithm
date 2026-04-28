# [Gold II] Ezlulu - 26492

[문제 링크](https://www.acmicpc.net/problem/26492)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 29, 정답 비율: 50.000%

### 분류

자료 구조, 그리디 알고리즘, 해 구성하기, 덱

### 문제 설명

<p>The Info(1)cup Kingdom hosts the largest cook-off in history. Two of the kingdom&rsquo;s largest chefs, Lulu and Tanaka both want to prove that they are the best chef in the kingdom. However, the cooking contest is a bit strange: it involves breaking plates. Each contestant receives $n$ plates of <strong>distinct</strong> sizes, where each has a certain value. Formally, you receive $n$ plates, ordered from largest to smallest, and their values $v_1, \dots , v_n$. Now, each contestant stacks the plates in any order they want. When a plate is added to the stack, all plates that are <strong>smaller</strong> than it are broken and removed from the stack. The <em>score</em> of the current plate is calculated as <em>number_of_plates_broken</em> &times; $v_i$, if the value of the plate is $v_i$. The total score of a contestant&rsquo;s performance is the sum of the scores for each of the plates. After hearing about this task, Tanaka says to Lulu: &ldquo;Beating you will be ez, Lulu&rdquo;. Help Lulu beat Tanaka by finding the best possible order in which to put the plates on the stack.</p>

### 입력

<p>The first line of the input contains $n$, the number of plates. The next line contains $v_1, \dots , v_n$.</p>

### 출력

<p>The first line of the output contains a single integer which is the maximum score Lulu can make.</p>

<p>The second contains the order in which Lulu should insert the plates in order to achieve this score. For example, if the order is &ldquo;add the third plate, then the first, then the second&rdquo;, the output should contain <code>3 1 2</code>. If there are multiple orders you can print any one of them.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 200\,000$.</li>
	<li>$1 &le; v_i &le; 1\,000\,000\,000$.</li>
	<li>If only the maximum score is correct, then only 50% of the points for the test are awarded.</li>
</ul>