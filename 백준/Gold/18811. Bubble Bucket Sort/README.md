# [Gold IV] Bubble Bucket Sort - 18811

[문제 링크](https://www.acmicpc.net/problem/18811)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 38, 맞힌 사람: 35, 정답 비율: 38.462%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Belinda loves blowing bubbles! After a long day of blowing bubbles, Belinda thinks it would be a good idea to sort the bubbles into buckets to store for the winter.</p>

<p>Each bubble must be placed in a bucket and she would like the bubbles in each bucket to be as close to the same size as possible. The score of a bucket is the square of the difference in size of the largest and smallest bubble in that bucket. Belinda may put as many or as few bubbles into each bucket as she wishes. If a bucket is empty, its score is 0.</p>

<p>For example, if the buckets contained: [1, 2, 3], [3, 5], [4, 4], the total score would be (3 &minus; 1)<sup>2</sup> + (5 &minus; 3)<sup>2</sup> + (4 &minus; 4)<sup>2</sup> = 8. Given the sizes of the bubbles, what is the minimum total score that Belinda can achieve?</p>

### 입력

<p>The first line contains two integers n (1 &le; n &le; 200), which is the number of bubbles, and b (1 &le; b &le; 200), which is the number of buckets.</p>

<p>The next n lines describe the bubbles. Each of these lines contains a single integer k (1 &le; k &le; 10<sup>9</sup>), which is the size of this bubble.</p>

### 출력

<p>Display the minimum total score that Belinda can achieve.</p>