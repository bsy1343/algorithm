# [Gold II] Map Colouring - 11630

[문제 링크](https://www.acmicpc.net/problem/11630)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 63, 정답: 32, 맞힌 사람: 25, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A map maker wants to colour different countries or provinces on his maps using different colours. That is, he wants to colour countries that share a common border with a different colour. He has heard that any map can be coloured with four colours, but even after a lot of puzzling he is unable to colour some of his maps using four colours. Interested in the problem, and hoping that he can publish four-coloured maps, the map maker visits you for help.</p>

<p>After inspecting his maps you explain to the map maker that not every map can be coloured with four colours. You tell him that when countries are made up of different nonconnected parts (such as Alaska and the rest of the United States), it can be the case that one needs more colours. Also, if the maps contains a quadripoint (a point where four countries touch), it can also be the case that one needs more colours. The same is true when more than four countries meet in one point.</p>

<p>Disappointed, the map maker asks you whether you cannot help him in quickly deciding how many colours he needs. While you try to explain that this is a quite difficult question, he shows you his maps. After a lot of persuasion by him, and the realisation that all his maps are actually very small, you agree to make a computer program for him. You agree to write a program for his small maps (at most 16 countries) that determines whether his map can be coloured with 1, 2, 3, 4 or more colours. This program should still work if there are non-connected countries, quadripoints, etc.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with two space-separated integers C and B, indicating the number of countries C (1 &le; C &le; 16) and the number of borders B (0 &le; B &le; 120).</li>
	<li>B lines with two space-separated integers i and j (0 &le; i, j &le; C &minus; 1 and i &ne;&nbsp;j), indicating that there is a border between country i and country j.</li>
</ul>

### 출력

<p>For each test case, output a single line containing either an integer K, or the string &rsquo;many&rsquo;. Your program should output the integer K, where K is the minimum number of colours needed to colour the map if this number is 1, 2, 3 or 4. Your program should output &rsquo;many&rsquo; if this number is larger.</p>