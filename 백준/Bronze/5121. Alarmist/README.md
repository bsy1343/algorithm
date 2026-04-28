# [Bronze II] Alarmist - 5121

[문제 링크](https://www.acmicpc.net/problem/5121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 187, 정답: 136, 맞힌 사람: 118, 정답 비율: 73.750%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>aAs an end-of-the-world alarmist, you&rsquo;re always looking for new data to support your end-of-the-world theories. A common form of data is a series of scalar samples over time, for instance the outdoor temperature taken at one second intervals for an entire day, or the height of the tide measured every minute for a month. Given such a sampling, you&rsquo;d like to check if the difference between the maximum sample and minimum sample is large, that way you can yell and scream that the world has undergone serious change and thus is about to end.</p>

<p>The problem is, such data sets often contain some erroneous samples whose scalar values are too large or too small, due to transient errors in monitoring equipment. In order to make your claims more believable, you want to smooth out these erroneous values by calculating what&rsquo;s called a moving average. Given a series of n samples s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>n</sub> and a window size w where w &le; n, a moving average consists of n &minus; w + 1 elements. The first element of the moving average is the average of the first w samples s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>w</sub>. The second element of the moving average is the average of the same window, except shifted one element forward, i.e. the average of samples s<sub>2</sub>, s<sub>3</sub>, ..., s<sub>w+1</sub>. And so on. For simplicity, round each element of the moving average down to the nearest equal or lesser integer.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains the integers n and w, the number of samples and the window size, respectively, where 1 &le; n &le; 100 and 1 &le; w &le; n. The next line contains n non-negative integers representing the samples. Each sample is at most 1000.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the absolute difference between the maximum and minimum element of the moving average. Each data set should be followed by a blank line.</p>