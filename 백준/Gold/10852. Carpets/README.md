# [Gold I] Carpets - 10852

[문제 링크](https://www.acmicpc.net/problem/10852)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 105, 정답: 42, 맞힌 사람: 30, 정답 비율: 37.500%

### 분류

구현, 브루트포스 알고리즘, 백트래킹, 재귀

### 문제 설명

<p>The computer science Professor Toving Liles loves the floor tiles in his office so much that he wants to protect them from damage by careless students. Therefore, he would like to buy cheap small rectangular carpets from the supermarket and cover the floor such that:</p>

<ol>
	<li>The entire floor is covered.</li>
	<li>The carpets do not overlap.</li>
	<li>The carpets are rotated arbitrarily.</li>
	<li>No carpet is cut into pieces.</li>
</ol>

<p>But when checking the supermarket&rsquo;s stock he begins to wonder whether he can accomplish his plan at all. Can you help him?</p>

### 입력

<p>The first line contains two integers W and H describing the size of his room (1 &le; W, H &le; 100). The second line contains an integer c, denoting the number of different carpet colors the supermarket has in stock (1 &le; c &le; 7).</p>

<p>Each of the following c lines consists of three integers a<sub>i</sub>, w<sub>i</sub>, and h<sub>i</sub>, which means: the supermarket&rsquo;s stock contains ai carpets of size w<sub>i</sub>, hi and color i (1 &le; a<sub>i</sub> &le; 7; 1 &le; w<sub>i</sub> &le; 100; 1 &le; h<sub>i</sub> &le; 100).</p>

<p>The supermarket has at most 7 carpets, i.e. &Sigma;<sub>i</sub>a<sub>i</sub> &le; 7.</p>

### 출력

<p>For the given room dimensions and the supermarket&rsquo;s stock of carpets, print &ldquo;yes&rdquo; if it is possible to cover the room with carpets as specified above and &ldquo;no&rdquo; otherwise.</p>