# [Gold IV] Pen Counts - 3945

[문제 링크](https://www.acmicpc.net/problem/3945)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 36, 맞힌 사람: 32, 정답 비율: 69.565%

### 분류

수학

### 문제 설명

<p>Chicken farmer Xiaoyan is getting three new chickens, Lucy, Charlie and CC. She wants to build a chicken pen so that each chicken has its own, unobstructed view of the countryside. The pen will have three straight sides; this will give each chicken its own side so it can pace back and forth without interfering with the other chickens. Xiaoyan finds a roll of chicken wire (fencing) in the barn that is exactly N feet long. She wants to figure out how many different ways she can make a three sided chicken pen such that each side is an integral number of feet, and she uses the entire roll of fence. Different rotations of the same pen are the same, however, reflections of a pen may be different (see below).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3945.%E2%80%85Pen%E2%80%85Counts/d9013096.png" data-original-src="https://www.acmicpc.net/upload/images/pencount.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:321px; width:747px" /></p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the length of the roll of fence, N, (3 &lt;= N &lt;= 10000).</p>

### 출력

<p>For each data set there is a single line of output. It contains an integer which is the total number of different three-sided chicken pen configurations that can be made using the entire roll of fence.</p>