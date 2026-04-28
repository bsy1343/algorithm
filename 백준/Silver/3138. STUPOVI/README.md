# [Silver II] STUPOVI - 3138

[문제 링크](https://www.acmicpc.net/problem/3138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 29, 맞힌 사람: 29, 정답 비율: 49.153%

### 분류

구현, 자료 구조, 우선순위 큐

### 문제 설명

<p>Due to the big number of cars parked on the sidewalk and problems they cause for the pedestrians, the city government decided to separate some parts of the sidewalk from the road with little pillars.&nbsp;</p>

<p>The sidewalk is divided into parts 1 meter long. The sidewalk is represented as a string where a dot (&#39;.&#39;) means that someone can park on that location and an &#39;X&#39; represents the location of a pillar (which stops the cars from parking there).&nbsp;</p>

<p>All the cars in the town are L meters long. To park on the sidewalk, they need at least L consecutive meters without pillars.&nbsp;</p>

<p>For example, if the string &#39;..X...X..&#39; represents the sidewalk, and the car is 2 meters long, there are 4 different spots where the car can be parked (starting at the first, fourth, fifth and eighth meters).&nbsp;</p>

<p>As the number of available pillars is limited (there are only N available), the government wants to put the pillars so that:&nbsp;</p>

<ol>
	<li>The number of different available parking spots is the smallest possible.&nbsp;</li>
	<li>If there are multiple ways to meet the first condition, choose one that requires the least number of additional pillars to be placed.&nbsp;</li>
</ol>

<p>Write a program that, given the number of available pillars N, the length of the cars in meters L and the current layout of the sidewalk, finds any arrangement that satisfies both conditions.&nbsp;</p>

### 입력

<p>The first line of input contains two integers, N and L (1 &le; N, L &le; 100), the number of available pillars and the length of the cars in meters.&nbsp;</p>

<p>The second line consists of up to 100 characters that describe the current layout of the sidewalk. Each character represents a meter of the sidewalk. The capital letter &#39;X&#39; represents a meter that cannot beused for parking because a pillar is already there. The character &#39;.&#39; represents a meter which is currently free and can currently be used for parking.&nbsp;</p>

### 출력

<p>Output the layout of the sidewalk after placing additional pillars (if needed), in the same format as in the input.&nbsp;</p>

<p>Note: The solution may not be unique.&nbsp;</p>

### 힌트

<p>Clarification for first sample: although we have three pillars available, we can place two so that no car can park.</p>

<p>Clarification for second sample: if we choose this final layout, there are four different locations for a car to park. There is no better arrangement.</p>