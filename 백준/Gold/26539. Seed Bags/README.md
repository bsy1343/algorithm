# [Gold IV] Seed Bags - 26539

[문제 링크](https://www.acmicpc.net/problem/26539)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

백트래킹

### 문제 설명

<p>Looking at the space you&rsquo;ve allotted for your garden, you begin to wonder how many bags of seeds you&rsquo;ll need to buy in order to fill it. It&rsquo;s a little complicated though, as you plant seeds in a unique way. To plant your seeds, you simply throw the bag in the air, and the seeds land around you in a 3x3 square. Given the layout of your garden, and in which areas you would like crops to grow, determine how many bags of seeds are required. If some seeds land where you don&rsquo;t want them to grow, no worries. You just won&rsquo;t water those. It&rsquo;s also acceptable for an area to be overlapped with multiple bags of seeds.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will start with a single integer s (1&le;s&le;8) denoting the side length of your square garden. The next s lines will represent the layout of your garden. A &lsquo;.&rsquo; will represent a spot that does not need to be seeded, while an &lsquo;x&rsquo; will represent an area which you want to plant seeds in.</p>

### 출력

<p>For each test case, output the minimum number of seed bags you need to plant your garden.</p>