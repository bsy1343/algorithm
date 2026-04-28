# [Silver III] Captain Hammer (Small) - 12084

[문제 링크](https://www.acmicpc.net/problem/12084)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 300, 정답: 101, 맞힌 사람: 48, 정답 비율: 30.000%

### 분류

수학, 이분 탐색, 물리학

### 문제 설명

<p>The Hamjet is a true marvel of aircraft engineering. It is a jet airplane with a single engine so powerful that it burns all of its fuel instantly during takeoff. The Hamjet doesn&#39;t have any wings because who needs them when the fuselage is made of a special Wonderflonium isotope that makes it impervious to harm.</p>

<p>Piloting the Hamjet is a not a job for your typical, meek-bodied superhero. That&#39;s why the Hamjet belongs to Captain Hammer, who is himself impervious to harm. The G-forces that the pilot endures when taking a trip in the Hamjet are legen-dary.</p>

<p>The Hamjet takes off at an angle of &theta; degrees up and a speed of&nbsp;<strong>V</strong>&nbsp;meters per second.&nbsp;<strong>V</strong>is a fixed value that is determined by the awesome power of the Hamjet engine and the capacity of its fuel tank. The destination is&nbsp;<strong>D</strong>&nbsp;meters away. Your job is to program the Hamjet&#39;s computer to calculate &theta; given&nbsp;<strong>V</strong>&nbsp;and&nbsp;<strong>D</strong>.</p>

<p>Fortunately, the Hamjet&#39;s Wondeflonium hull is impervious to air friction. Even more fortunately, the Hamjet doesn&#39;t fly too far or too high, so you can assume that the Earth is flat, and that the acceleration due to gravity is a constant 9.8&nbsp;m/s<sup>2</sup>&nbsp;down.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each line will contain two positive integers --&nbsp;<strong>V</strong>&nbsp;and&nbsp;<strong>D</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 4500;</li>
	<li>1 &le;&nbsp;<strong>V</strong>&nbsp;&le; 300;</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 10000;</li>
	<li>It is guaranteed that each test case will be solvable.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &theta;&quot;, where x is the case number (starting from 1) and &theta; is in degrees up from the the horizontal. If there are several possible answers, output the smallest positive one.</p>

<p>An answer will be considered correct if it is within 10<sup>-6</sup>&nbsp;of the exact answer, in absolute or relative error. See the&nbsp;<a href="https://code.google.com/codejam/faq.html#floating_point" style="color: rgb(85, 26, 139);" target="_blank">FAQ</a>&nbsp;for an explanation of what that means, and what formats of floating-point numbers we accept.</p>