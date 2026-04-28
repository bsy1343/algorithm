# [Platinum I] Monkey and Apple-trees - 11843

[문제 링크](https://www.acmicpc.net/problem/11843)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 182, 정답: 72, 맞힌 사람: 42, 정답 비율: 35.294%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Everyone knows that the yummiest fruit in the world is an apple. Even the monkey Chris knows that. There are many apple-trees in the a forest located along the river and numerated consecutively starting from 1. Sometimes Chris comes to the forest, chooses a group of apple-trees growing consecutively (selected interval) and counts the amount of apple-trees with red-ripen apples among them. Sometimes apples on a few consecutive apple-trees have red-ripen before his next arrival.</p>

<p>You have to answer how many apple-trees in the selected interval have red-ripen apples at each Chris&#39;s arrival. At the beginning all the apples are unripen</p>

### 입력

<p>In the first line of input file an integer M is given - number of events (1 &le; M &le; 100000). The following M lines contain description of events - each contains three integers D<sub>i</sub>, X<sub>i</sub>, Y<sub>i</sub> (1 &le; D<sub>i</sub> &le; 2, X<sub>i</sub> &le; Y<sub>i</sub>). If the D<sub>i</sub> = 1, then the event is Chris&#39;s arrival, if the D<sub>i</sub> = 2 - red-ripening of all apples in the selected interval of the apple-trees. Other two numbers X<sub>i</sub> and Y<sub>i</sub>, describe the interval for the event.</p>

<p>For calculating the limits of the interval there is an additional number C. At the beginning C = 0. An interval for the event is interval from X<sub>i</sub>+C to Y<sub>i</sub>+C inclusively. It&#39;s guaranteed that 1 &le; X<sub>i</sub>+C, Y<sub>i</sub>+C &le; 10<sup>9</sup>.</p>

<p>If the event is apples red-ripening then C doesn&#39;t change. If the event is Chris&#39;s arrival, then as the result C becomes equal to the amount of red-ripen apple-trees he has counted.</p>

### 출력

<p>For each of Chris&#39;s arrival output one line with one number in it - the task answer.</p>