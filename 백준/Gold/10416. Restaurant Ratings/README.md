# [Gold II] Restaurant Ratings - 10416

[문제 링크](https://www.acmicpc.net/problem/10416)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 32, 정답: 23, 맞힌 사람: 21, 정답 비율: 80.769%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>A famous travel web site has designed a new restaurant rating system. Each restaurant is rated by one of n (1 &le; n &le; 15) critics, each giving the restaurant a nonnegative numeric rating (higher score means better). Some of these critics are more influential than others.</p>

<p>The restaurants in each city are ranked as follows. First, sum up the ratings given by all the critics for a restaurant. A restaurant with a higher total sum is always better than one with a lower total sum. For restaurants with the same total sum, we rank them based on the ratings given by critic 1. If there is a tie, then we break ties by the ratings by critic 2, etc.</p>

<p>A restaurant owner received the ratings for his restaurant, and is curious about how it ranks in the city. He does not know the ratings of all the other restaurants in the city, so he would estimate this by computing the maximum number of different ratings that is no better than the one received by the restaurant. You are asked to write a program to answer his question.</p>

### 입력

<p>The input consists of a number of cases. Each case is specified on one line. On each line, the first integer is n, followed by n integers containing the ratings given by the n critics (in order). You may assume that the total sum of ratings for each restaurant is at most 30. The input is terminated by a line containing n = 0.</p>

### 출력

<p>For each input, print the number of different ratings that is no better than the given rating. You may assume that the output fits in a 64-bit signed integer.</p>