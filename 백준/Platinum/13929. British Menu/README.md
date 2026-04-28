# [Platinum I] British Menu - 13929

[문제 링크](https://www.acmicpc.net/problem/13929)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 120, 정답: 47, 맞힌 사람: 31, 정답 비율: 43.662%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 강한 연결 요소

### 문제 설명

<p>Since you are in Britain, you definitely want to try British food. Unfortunately you will only have a single free evening, so you decided to try all the food you can get in one run. You plan a gigantic meal where you eat one British dish after the other. Clearly not every order of dishes is appropriate. For example, it is not acceptable to eat Blood Pudding directly after Cornish Hevva Cake, but it would be perfectly fine if you chose to eat Baked Beans in between.</p>

<p>You have compiled a comprehensive list of British dishes. For each dish you have also decided which other dishes are fit to be eaten directly afterwards. A menu is a sequence of dishes such that each dish (except the first) is fit to be eaten directly after the previous dish.</p>

<p>After some time studying the list of dishes, you noticed something odd: Whenever it is possible to find a menu in which a dish occurs twice (for example dishes A, then B, then C, then dish A again), there can be at most four different types of dishes between the dish that occurred twice &ndash; excluding that dish itself. For example, it is impossible to find a menu like A, B, C, D, E, F, A, but it may be possible to find menus like A, B, C, B, C, B, C, B, C, B, A or A, B, C, D, E, A, B, C, D, E, A.</p>

<p>But who wants to eat the same dish twice anyway? Clearly, you want to know how many dishes there can be in a menu without repeating any dish!</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers n, m (1 &le; n &le; 10<sup>5</sup> , 1 &le; m &le; 10<sup>6</sup> ), the number of dishes and compatibilities.</li>
	<li>m lines, each containing two integers a and b (1 &le; a, b &le; n), indicating that you can eat dish b immediately after dish a.</li>
</ul>

<p>Dishes are numbered from 1 to n in no particular order, and the compatibilities satisfy the constraint described above.</p>

### 출력

<p>A single integer indicating the maximum number of courses in a menu without repeated dishes.</p>