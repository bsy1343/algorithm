# [Platinum V] Physical Distancing - 21842

[문제 링크](https://www.acmicpc.net/problem/21842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

그래프 이론, 그래프 탐색, 기하학, 이분 탐색

### 문제 설명

<p>To prevent the spread of Covid-19, people are asked to keep their distance from other people, who could be infected. Some experts recommend a distance of 2 metres, others 6 feet, and still others 1.5 metres. In some crowded settings, these recommended distances may not be possible. In any setting, maximizing the distance minimizes the risk of getting infected.</p>

<p>You need to walk down a crowded hallway in which other people are standing. Determine the maximum possible distance that you can maintain from all the other people while still being able to navigate from one end of the hallway to the other. (Assume that you and every other person is a point with zero area.)</p>

### 입력

<p>The first line contains three space-separated integers L, W, N, the length and width of the hallway and the number of people standing in it, with 0 &lt; L, W &le; 100 and 1 &le; N &le; 100. Each of these integers is between 0 and 100, inclusive. The following N lines each contain two integers X, Y , the coordinates of the location of each person, with 0 &le; X &le; L and 0 &le; Y &le; W.</p>

### 출력

<p>Output a single number, the maximum distance that you can maintain from any other person while navigating the length of the hallway. Your answer will be considered correct if the absolute or relative error to the judge&rsquo;s answer is within 10<sup>&minus;4</sup>.</p>