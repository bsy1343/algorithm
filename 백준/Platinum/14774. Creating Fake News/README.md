# [Platinum V] Creating Fake News - 14774

[문제 링크](https://www.acmicpc.net/problem/14774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 3, 정답 비율: 33.333%

### 분류

수학, 그래프 이론, 그래프 탐색, 선형대수학, 가우스 소거법

### 문제 설명

<p>Now that we understand (from the previous problem) how fake news spreads through a social network, we can try to leverage this knowledge to create the perfect piece of fake news to reach everyone in the social network. For the context of this problem, designing a piece of news means choosing the best c<sub>i</sub>, which are now allowed to be fractional numbers.</p>

<p>The model will be exactly the same as in the previous problem (so make sure you have at least read that problem), with two exceptions: (1) The content description of the news story you create (the c<sub>i</sub>) can be floating point numbers now. (2) The fake news piece can start at multiple individuals, which you (the fake news spammer) get to choose. Note that it must be the same piece of fake news that you start at all these individuals.</p>

<p>In some settings, it will be impossible to create a single piece of fake news that everyone will like; you should note when that happens. Otherwise, output the smallest number of individuals you need to start your fake news piece at to reach everyone.</p>

### 입력

<p>The first line is the number K of input data sets, followed by K data sets, each of the following form:</p>

<p>The input format is the same as for the previous problem, except you will not be given a line describing a piece of fake news (since you are supposed to create it).</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the minimum number of people you need to start your fake news at to reach everyone. If it is impossible to reach everyone, output &ldquo;Impossible&rdquo; instead.</p>

<p>Each data set should be followed by a blank line.</p>