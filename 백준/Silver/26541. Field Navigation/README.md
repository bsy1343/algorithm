# [Silver I] Field Navigation - 26541

[문제 링크](https://www.acmicpc.net/problem/26541)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 32, 맞힌 사람: 24, 정답 비율: 88.889%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>Your field has become quite cluttered, and you just realized you left your best hat out in the middle of the pasture. You have to go retrieve it before it stays out any longer than it already has, but you&rsquo;re also lazy. And there are many obstacles in the way. You have a sickle to cut tall grass, and an axe to chop up any wood in the way, as well as a hammer to destroy rocks you can&rsquo;t get through, but you don&rsquo;t want to have to carry them all. Given the location of your hat and the layout of the field and all the obstacles, determine the minimum number of tools you&rsquo;ll have to bring to reach your prized hat.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will start with a single integer s denoting the side length of your square field. The next s lines will consist of a map of your field, with &lsquo;.&rsquo; denoting open space, &lsquo;X&rsquo; denoting your hat, &lsquo;S&rsquo; denoting your starting position leaving your house, &lsquo;R&rsquo; denoting a rock, &lsquo;B&rsquo; denoting a branch, and &lsquo;G&rsquo; denoting tall grass. You can only move up, down, left, and right. No diagonals.</p>

### 출력

<p>For each test case, output the minimum number of tools needed to retrieve your hat.</p>