# [Silver III] Halfway - 15118

[문제 링크](https://www.acmicpc.net/problem/15118)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 447, 정답: 162, 맞힌 사람: 125, 정답 비율: 35.920%

### 분류

수학, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>A friend of yours has written a program that compares every pair of a list of items. With n items, it works as follows. First, it prints a 1, and it compares item 1 to items 2, 3, 4, . . . , n. It then prints a 2, and compares item 2 to items 3, 4, 5, . . . , n. It continues like that until every pair of items has been compared exactly once. If it compares item x to item y, it will not later compare item y to item x. Also, it does not compare any item to itself.</p>

<p>Your friend wants to know when his program is halfway done. For a program that makes an odd number of total comparisons, this is when it is doing the middle comparison. For a program that makes an even number of total comparisons, this is when it is doing the first of the two middle comparisons.</p>

<p>What will the last number printed be when the program is halfway done?</p>

<p>Note that since the earlier items have more comparisons than the later items, the answer is not simply n/2.</p>

### 입력

<p>The input consists of a single line containing the integer n (2 &le; n &le; 10<sup>9</sup>).</p>

### 출력

<p>Print, on a single line, the last number your friend&rsquo;s program prints when it is halfway done.</p>