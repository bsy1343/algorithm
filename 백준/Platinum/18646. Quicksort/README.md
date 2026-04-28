# [Platinum IV] Quicksort - 18646

[문제 링크](https://www.acmicpc.net/problem/18646)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 17, 맞힌 사람: 17, 정답 비율: 34.694%

### 분류

정렬, 애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>You are given an array of numbers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> printed on a set of cards that is arranged in a row, and need to sort it in non-decreasing order. The cards are pretty big, so one person can only swap two adjacent cards. However, you have as many people available to do the swapping as you need, as long as they don&rsquo;t try to swap the same card, so in one step you can do swaps on an arbitrary disjoint set of pairs of adjacent cards.</p>

<p>More formally, in one step you can choose a set of indices i<sub>1</sub>, i<sub>2</sub>, . . . , i<sub>k</sub> such that i<sub>1</sub> + 2 &le; i<sub>2</sub>, i<sub>2</sub> + 2 &le; i<sub>3</sub>, . . . , i<sub>k&minus;1</sub> + 2 &le; i<sub>k</sub>, and swap a<sub>i<sub>1</sub></sub> with a<sub>i<sub>1</sub>+1</sub>, a<sub>i<sub>2</sub></sub> with a<sub>i<sub>2</sub>+1</sub>, . . . , a<sub>i<sub>k</sub></sub> with a<sub>i<sub>k</sub>+1</sub>.</p>

<p>Your goal is to sort the given array in non-decreasing order in at most n steps. Note that you don&rsquo;t need to minimize the number of steps.</p>

### 입력

<p>The input contains multiple test cases. The first line of the input contains the number t of test cases. Each test case is then described with two lines. The first of those lines contains the size n of the array, 1 &le; n &le; 100. The second of those lines contains the elements of the array a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. The elements of the array are integers between 1 and 10<sup>9</sup>, inclusive.</p>

<p>The sum of values of n in the input does not exceed 1000.</p>

### 출력

<p>Print the outputs for all test cases in order. For each test case, first print the number m (0 &le; m &le; n) of steps that you use to sort the array on a line of its own. On each of the next m lines describe one step with the number k (0 &le; k &le; &lfloor;n/2&rfloor;) of pairs being swapped followed by the indices i<sub>1</sub>, i<sub>2</sub>, . . . , i<sub>k</sub> of the first elements of each pair, printed in increasing order.</p>