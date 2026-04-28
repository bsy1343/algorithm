# [Platinum II] Fireworks in RightAngleles - 3348

[문제 링크](https://www.acmicpc.net/problem/3348)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 38, 맞힌 사람: 28, 정답 비율: 73.684%

### 분류

수학, 정렬, 스위핑

### 문제 설명

<p>In the city of RightAngleles streets are built as an infinite square grid &ndash; any two of them are either parallel or perpendicular to each other and the distance between two nearest parallel streets is the same (let&rsquo;s denote this distance as one unit). All streets that are oriented in West-East direction are called horizontal streets and are numbered by consecutive integers in South-North direction. All streets that are oriented in South-North direction are called vertical streets and are numbered by consecutive integers in West-East direction.</p>

<p>Every citizen lives in a house with entrance located at one particular horizontal and vertical street intersection. There may be several citizens living in the same house.</p>

<p>Mayor of RightAngleles would like to brush up his popularity by organizing a fireworks display at an intersection of the main horizontal street (labelled with number 0) and some vertical street. It is known where the citizens interested in coming and enjoying the fireworks live. Fireworks will be seen along both streets at which intersection the display will take place; furthermore, due to safety reasons during the display observers must be at least S units away from the intersection from which the fireworks are launched. Thus, if the fireworks will be launched from the intersection with vertical street V, then every interested citizen must come to an intersection on the main horizontal street (with number 0) or the vertical street V no closer than S units from the intersection of the main horizontal street and vertical street V. For example, if S=2, then observing may be done from any intersection on the main horizontal street, except the ones that intersect with streets V-1, V, and V+1, and from all intersections on the vertical street V, except the ones that intersect with horizontal streets -1, 0, and 1.</p>

<p>The overall positive influence of fireworks is strongly related to the total distance which citizens need to move to observe the display. Therefore, the intersection for the fireworks must be chosen in a way to minimize this total distance.</p>

<p>For example, if S=2 and there are seven citizens whose locations are shown on the map (there are two of them in (-4;8)), then the best place for the fireworks is the main street intersection with 8th vertical street; in this case the total distance which citizens need to move is 9 units.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3348.%E2%80%85Fireworks%E2%80%85in%E2%80%85RightAngleles/577237b2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3348/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:221px; width:368px" /></p>

<p>Write a program which calculates the minimum possible total distance (in units) which citizens have to move to observe the fireworks.</p>

### 입력

<p>Input data is given in standard input. The first line contains two positive integers separated by spaces: the number of citizens N (N&le;10<sup>5</sup>) and the safety distance S (S&le;10<sup>6</sup>) in units. The next N lines contain the descriptions of the locations of citizens. Each of these lines contains two integers H<sub>i</sub> and V<sub>i</sub> separated by a space; H<sub>i</sub> and V<sub>i</sub> (-10<sup>9</sup> &le;H<sub>i</sub>,V<sub>i</sub>&le;10<sup>9</sup>) denote the numbers of the horizontal and vertical street, respectively, of the intersection where the entrance to the i-th citizen&rsquo;s house is located.</p>

### 출력

<p>The first and only line of output&nbsp;must contain exactly one integer &ndash; the minimum total distance (in units) which citizens must move to observe the fireworks.</p>