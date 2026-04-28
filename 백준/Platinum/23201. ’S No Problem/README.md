# [Platinum I] ’S No Problem - 23201

[문제 링크](https://www.acmicpc.net/problem/23201)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 100, 정답: 55, 맞힌 사람: 40, 정답 비율: 52.632%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>The Yllihc Engineering and Technological Institute (YETI), located in northern Snowblovia, has two problems: snow and money. Specifically, they have too much of the former and not enough of the latter. Every winter (and fall and spring, for that matter) the campus is covered with blankets of snow, and the sidewalks connecting campus buildings become impassable. To continue functioning, YETI needs to clear the snow from the sidewalks connecting the buildings of the campus. Since budget is an issue, these sidewalks are a minimal set that allow a path to exist between any two buildings.</p>

<p>With the money saved by not building more sidewalks, YETI bought two snow blowers. To clear the snow with them, two staff members take the two snow blowers out of the buildings (or building) they are stored in, and push them along the sidewalks, clearing the snow. Each sidewalk must be traversed at least once. Each snow blower, after it has finished, is stored in the building it is currently next to (and, during the next snowfall, the snow blowers will be pushed in the reverse direction&mdash;and so on, throughout the eleven months of the snow season).</p>

<p>The YETI maintenance crew want to choose the storage buildings of the snow blowers and design the routes along which they will be pushed, so that they minimize the total distance the two machines will travel out in the cold (to protect both the precious equipment and the staff members from freezing). Note that the routes might involve pushing along already-cleared sidewalks, as seen in Figure J.1, which shows an optimal solution for the sidewalk layout of Sample Input 1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23201.%E2%80%85%E2%80%99S%E2%80%85No%E2%80%85Problem/90e165f2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23201.%E2%80%85%E2%80%99S%E2%80%85No%E2%80%85Problem/90e165f2.png" data-original-src="https://upload.acmicpc.net/4435e202-6b06-48c0-9a67-9b54809fe19f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 242px; height: 132px;" /></p>

<p style="text-align: center;">Figure J.1: Illustration of Sample Input 1 showing one possible pair of optimal routes.</p>

<p>YETI would ask their Computer Science Department to figure this out, but it was wiped out in the Great Blizzard of &rsquo;06, so they have come to you for help.</p>

### 입력

<p>The first line of input contains an integer n (4 &le; n &le; 100 000), the number of buildings on the YETI campus. Buildings are numbered from 1 to n. Each of the remaining n &minus; 1 lines contains three integers a, b, and d indicating that a sidewalk exists between buildings a and b (1 &le; a, b &le; n; a &ne;&nbsp;b) of length d (1 &le; d &le; 500).</p>

### 출력

<p>Output the minimum total distance the snow blowers must travel to remove snow from all sidewalks.</p>