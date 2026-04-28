# [Platinum III] Sjekira - 20203

[문제 링크](https://www.acmicpc.net/problem/20203)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 61, 맞힌 사람: 54, 정답 비율: 62.069%

### 분류

자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>Mirko is tired of his stressful CEO job in a well-known multinational software company. With a golden parachute of several million dollars, he decided to live a simple life and move to Gorski Kotar. However, winters in the remote village he just moved in are tough. None of his neighbours were born after WWII, so he is destined to chop firewood himself.</p>

<p>Today, he is going to chop his first trunk. Before chopping, he labels the parts of the trunk which are small enough to fit in a fireplace, and measures their hardness.</p>

<p>Mirko is a programmer, so he notices that the parts and the connections between them form a <strong>tree graph</strong>.</p>

<p>The damage on his axe resulting from cutting a connection on the trunk is equal to the <strong>sum of the maximal hardnesses in the two connected components formed by cutting the connection</strong>.</p>

<p>Mirko has only one axe, so he wants the total damage to be as small as possible. He wants to know <strong>the minimal total damage</strong> on the axe, if he cuts the whole trunk into single parts which fit in a fireplace.</p>

### 입력

<p>The first line contains an integer n, the number of parts. The parts are labeled by integers from 1 to n.</p>

<p>The second line contains n integers t<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10<sup>9</sup>). The number t<sub>i</sub> is the hardness of the part labeled i.</p>

<p>Each of the following n &minus; 1 lines contains two integers x and y (1 &le; x, y &le; n) &ndash; labels of parts that are directly connected.</p>

### 출력

<p>Output the minimal total damage after n &minus; 1 cuts.</p>

### 제한

<p>In all subtasks it holds that 1 &le; n &le; 100 000.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>There are two ways to cut this trunk. He can first cut the connection (1, 2), which causes 1 + 3 = 4 damage, and then cut the connection (2, 3), which causes 2 + 3 = 5 damage. The total damage is 9 in this case.</p>

<p>Otherwise, he can first cut (2, 3), and then (1, 2). The total damage in that case (2 + 3) + (1 + 2) = 8.</p>