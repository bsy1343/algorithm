# [Platinum I] Within Arm's Reach - 13957

[문제 링크](https://www.acmicpc.net/problem/13957)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 110, 정답: 37, 맞힌 사람: 30, 정답 비율: 52.632%

### 분류

기하학, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Joao wants to jon the robotic football team of his university. However, since he knows little about robotics and mathematics, he decided to build a 2-dimensional robotic arm to bootstrap his knowledge.&nbsp;</p>

<p>The robotic arm is composed of N segments of various lengths. The segments can form any angle between them, including configurations that make it appear to self-intersect when viewed from above. The robotic arm works great, but it is not trivial to position the arm&#39;s tip as close as possible to given x, y target coordinates with so many joints to control. Can you help Joao?</p>

<p>Given the robotic arm description and target coordinates relative to the arm&#39;s origin, calculate a configuration that places the arm&#39;s tip as close as possible to the target.&nbsp;</p>

### 입력

<p>The first line contains N, the number of segments composing the robotic arm. N lines follow, each with an integer L<sub>i</sub> describing the length of the ith segment from the fixed point until the arm&#39;s tip. There is one more line with 2 integers: the x, y coordinates of the target point to reach.</p>

### 출력

<p>The output should contain N lines, each containing two real numbers x<sub>i</sub>, y<sub>i</sub> indicationg the coordinates of the tip of the ith segment.</p>

<p>The length of the ith segment computed from the solution and input L<sub>i</sub> may not differ by more than 0.01. Similarly, the absolute error between the solution&#39;s distance to the target and the minimum possible distance to the target cannot exceed 0.01.</p>

<p>Note that, in general, there are many solutions. Your program may output any of them.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; N &le; 20 Number of segments in the robotic arm</li>
	<li>1 &le; L<sub>i</sub> &le; 1000 Length of the ith segment</li>
	<li>-20000 &le; x,y &le; 20000 Target coordinates to attempt to reach</li>
</ul>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13957.%E2%80%85Within%E2%80%85Arm's%E2%80%85Reach/ae40f298.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13957.%E2%80%85Within%E2%80%85Arm's%E2%80%85Reach/fbe7e9ec.png" data-original-src="https://boja.mercury.kr/assets/problem/13957-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:111px; width:220px" /></p>