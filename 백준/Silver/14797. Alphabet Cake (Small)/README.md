# [Silver I] Alphabet Cake (Small) - 14797

[문제 링크](https://www.acmicpc.net/problem/14797)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 144, 정답: 106, 맞힌 사람: 86, 정답 비율: 72.269%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 해 구성하기, 백트래킹

### 문제 설명

<p>You are catering a party for some children, and you are serving them a cake in the shape of a grid with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns. Your assistant has started to decorate the cake by writing every child&#39;s initial in icing on exactly one cell of the cake. Each cell contains at most one initial, and since no two children share the same initial, no initial appears more than once on the cake.</p>

<p>Each child wants a single rectangular (grid-aligned) piece of cake that has their initial and no other child&#39;s initial(s). Can you find a way to assign every blank cell of the cake to one child, such that this goal is accomplished? It is guaranteed that this is always possible. There is no need to split the cake evenly among the children, and one or more of them may even get a 1-by-1 piece; this will be a valuable life lesson about unfairness.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with two integers&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>. Then, there are&nbsp;<strong>R</strong>&nbsp;more lines of&nbsp;<strong>C</strong>characters each, representing the cake. Each character is either an uppercase English letter (which means that your assistant has already added that letter to that cell) or&nbsp;<code>?</code>(which means that that cell is blank).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>There is at least one letter in the input grid.</li>
	<li>No letter appears in more than one cell in the input grid.</li>
	<li>It is guaranteed that at least one answer exists for each test case.</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 12.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 12.</li>
	<li><strong>R</strong>&nbsp;&times;&nbsp;<strong>C</strong>&nbsp;&le; 12.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:</code>&nbsp;and nothing else. Then output&nbsp;<strong>R</strong>more lines of&nbsp;<strong>C</strong>&nbsp;characters each. Your output grid must be identical to the input grid, but with&nbsp;<em>every</em>&nbsp;<code>?</code>&nbsp;replaced with an uppercase English letter, representing that that cell appears in the slice for the child who has that initial. You may not add letters that did not originally appear in the input. In your grid, for each letter, the region formed by all the cells containing that letter must be a single grid-aligned rectangle.</p>

<p>If there are multiple possible answers, you may output any of them.</p>

### 힌트

<p>The sample output displays one set of answers to the sample cases. Other answers may be possible.</p>