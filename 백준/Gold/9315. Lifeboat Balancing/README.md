# [Gold IV] Lifeboat Balancing - 9315

[문제 링크](https://www.acmicpc.net/problem/9315)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 146, 정답: 16, 맞힌 사람: 7, 정답 비율: 6.796%

### 분류

배낭 문제

### 문제 설명

<p>Six Virginia Tech engineers recently designed and built a large cruise ship. Because of its many obvious flaws, it has just begun to sink on its first voyage. There are two lifeboats on board, each of which can fit half of the passengers on board. The only problem is that the total weight of the people on each of the lifeboats needs to be as equal as possible so that neither lifeboat weighs too much and risks sinking. It is your job to determine how people should be distributed between lifeboats so that the weight is as equal as possible and there is an equal number of people on each boat. All passengers must make it onto a lifeboat.</p>

### 입력

<p>The first number in the input will be C, the number of test cases.</p>

<p>For each of the C following test cases, the first line will be an integer N, the total number of people that need to go on the lifeboats ( 1 &le; N &le; 5000 ). The following N lines will contain an integer weight, W, representing the weight of one passenger ( 1 &le; W &le; 1000 ).</p>

### 출력

<p>For each of the test cases, determine the sum of the weights of all the people on each lifeboat given the most equal distribution of weights. If the weights on each boat are not equal, then output the lower number first. Both weights should be output on the same line, separated by a space.</p>