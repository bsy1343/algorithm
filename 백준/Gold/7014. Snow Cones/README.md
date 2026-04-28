# [Gold III] Snow Cones - 7014

[문제 링크](https://www.acmicpc.net/problem/7014)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 99, 정답: 22, 맞힌 사람: 22, 정답 비율: 25.581%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>After the snowstorm, there is quite the abundance of fresh snow all around. To celebrate the end of the storm, a local school decides to make snow cones with the fresh snow. The school acquires large quantities of two different snow cone syrup flavors, and takes all the kids&rsquo; flavor requests. The children then line up and are handed their snow cones. But in all the chaos, the snow cones get mixed up, and the kids are not necessarily handed the flavors that they had requested. Fortunately, the correct numbers of each flavor are handed out, and so the kids decide to trade with each other to get the flavor they want.</p>

<p>The kids would like to minimize the time it takes until everyone has the flavor they want and thus want to trade as efficiently as possible. During a time step, neighboring kids in line may trade cones, and multiple trades may occur in parallel, but each kid may only participate in at most one trade in that time step.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each with two lines. The first line in a data set is a sequence of N characters, 1 &le; N &le; 1000, indicating the flavors handed out. The second line indicates the flavors that were actually requested and is a sequence of the same N characters, but they may be out of order. The two flavors are always represented as the upper case letters &lsquo;X&rsquo; and &lsquo;O&rsquo;. The counts of the two flavors in the first line will always equal the counts in the second line.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. One the next line, output the minimum number of time steps that are required until each kid ends up with the correct flavor. Each data set should be followed by a blank line.</p>