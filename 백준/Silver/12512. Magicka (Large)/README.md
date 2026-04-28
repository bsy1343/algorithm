# [Silver III] Magicka (Large) - 12512

[문제 링크](https://www.acmicpc.net/problem/12512)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 101, 정답: 55, 맞힌 사람: 47, 정답 비율: 63.514%

### 분류

브루트포스 알고리즘, 자료 구조, 구현, 시뮬레이션, 스택, 문자열

### 문제 설명

<p>As a wizard, you can&nbsp;<strong>invoke</strong>&nbsp;eight elements, which are the &quot;base&quot; elements. Each base element is a single character from {Q, W, E, R, A, S, D, F}. When you invoke an element, it gets appended to your&nbsp;<strong>element list</strong>. For example: if you invoke W and then invoke A, (we&#39;ll call that &quot;invoking WA&quot; for short) then your element list will be [W, A].</p>

<p>We will specify pairs of base elements that&nbsp;<strong>combine</strong>&nbsp;to form non-base elements (the other 18 capital letters). For example, Q and F might combine to form T. If the two elements from a pair appear at the end of the element list, then both elements of the pair will be immediately removed, and they will be replaced by the element they form. In the example above, if the element list looks like [A, Q, F] or [A, F, Q] at any point, it will become [A, T].</p>

<p>We will specify pairs of base elements that are&nbsp;<strong>opposed</strong>&nbsp;to each other. After you invoke an element, if it isn&#39;t immediately combined to form another element, and it is opposed to something in your element list, then your whole element list will be cleared.</p>

<p>For example, suppose Q and F combine to make T. R and F are opposed to each other. Then invoking the following things (in order, from left to right) will have the following results:</p>

<ul>
	<li>QF &rarr; [T] (Q and F combine to form T)</li>
	<li>QEF &rarr; [Q, E, F] (Q and F can&#39;t combine because they were never at the end of the element list together)</li>
	<li>RFE &rarr; [E] (F and R are opposed, so the list is cleared; then E is invoked)</li>
	<li>REF &rarr; [] (F and R are opposed, so the list is cleared)</li>
	<li>RQF &rarr; [R, T] (QF combine to make T, so the list is not cleared)</li>
	<li>RFQ &rarr; [Q] (F and R are opposed, so the list is cleared)</li>
</ul>

<p>Given a list of elements to invoke, what will be in the element list when you&#39;re done?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of a single line, containing the following space-separated elements in order:</p>

<p>First an integer&nbsp;<strong>C</strong>, followed by&nbsp;<strong>C</strong>&nbsp;strings, each containing three characters: two base elements followed by a non-base element. This indicates that the two base elements combine to form the non-base element. Next will come an integer&nbsp;<strong>D</strong>, followed by&nbsp;<strong>D</strong>&nbsp;strings, each containing two characters: two base elements that are opposed to each other. Finally there will be an integer&nbsp;<strong>N</strong>, followed by a single string containing&nbsp;<strong>N</strong>&nbsp;characters: the series of base elements you are to invoke. You will invoke them in the order they appear in the string (leftmost character first, and so on), one at a time.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>Each pair of base elements may only appear together in one combination, though they may appear in a combination and also be opposed to each other.</li>
	<li>No base element may be opposed to itself.</li>
	<li>Unlike in the computer game Magicka, there is no limit to the length of the element list.</li>
	<li>0 &le;&nbsp;<strong>C</strong>&nbsp;&le; 36.</li>
	<li>0 &le;&nbsp;<strong>D</strong>&nbsp;&le; 28.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is a list in the format &quot;[e<sub>0</sub>, e<sub>1</sub>, ...]&quot; where e<sub>i</sub>&nbsp;is the i<sup>th</sup>&nbsp;element of the final element list. Please see the sample output for examples.</p>