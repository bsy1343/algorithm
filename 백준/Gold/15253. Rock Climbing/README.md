# [Gold IV] Rock Climbing - 15253

[문제 링크](https://www.acmicpc.net/problem/15253)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 13, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 많은 조건 분기

### 문제 설명

<p>As of 2020, rock climbing will for the first time be an Olympic sport. In rock climbing you have a wall (natural or man made) with little holes and protrusions that you can use to put your fingers or toes. By combining good technique and careful planning with strength, your goal is to reach a particular spot, typically the top of the wall. Often, the planning aspect is quite complex, since you need to make sure that a limb is available to put somewhere useful for the next step. It&rsquo;s no accident that rock climbing is very popular with math and CS folks &mdash; after solving this problem, you will know why.</p>

<p>We model the rock climbing planning problem as follows: you will be given a number of 2-D coordinate locations. Those are places that you could use to put your toes or hold on with your fingers. In each step, you can move exactly one of your limbs to a new location, but there are constraints on how far away your limbs can be from each other. Specifically, your arms cannot be more than 2 units apart, and neither can your feet. Your left arm and left foot cannot be more than 3 units apart, and neither can your right arm and right foot. And your left arm and right foot cannot be more than 4 units apart, and neither can your right arm and left foot. You can never have two limbs in the same location. Finally, at any given time, both of your feet must be no higher than both of your hands, meaning that their y-coordinates are no bigger than the hands&rsquo; y-coordinates.</p>

<p>You will always start with your left foot in location 1, right foot in location 2, left hand in location 3, and right hand in location 4. (We will ensure that this is always legal.) You have climbed the wall when one of your limbs reaches location n. Your goal is to do so in as few moves as possible.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains one integer 4 &le; n &le; 30 (the number of places to put your limbs). This is followed by a line with 2n doubles x<sub>i</sub>, y<sub>i</sub>; here, x<sub>i</sub>, y<sub>i</sub> are the coordinates of location i.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the minimum number of moves until one of your limbs touches location n for the first time. If there is no way to get to location n, output &ldquo;Impossible&rdquo; instead.</p>

<p>Each data set should be followed by a blank line.</p>