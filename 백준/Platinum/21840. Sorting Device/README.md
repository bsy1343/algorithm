# [Platinum V] Sorting Device - 21840

[문제 링크](https://www.acmicpc.net/problem/21840)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 3, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>After being stuck at home for months because of covid, you decided to explore the contents of your parent&rsquo;s basement. Among numerous useless items, you found one peculiar object - a sorting device from the sixties that was used to teach sorting algorithms. The device consists of N ordered slots that get initialized with distinct integers once the device is turned on, and a screen for tracking cost. As a user, you can perform swap operations. One swap operation allows you to swap elements at positions i and j for a total cost of A&times;|i&minus;j|+B, where A, B are parameters written on the back of the device. Since you&rsquo;ve been studying your sorting algorithms, you definitely know how to sort the numbers with the smallest possible cost. Right?</p>

### 입력

<p>The first line contains a single integer N (1 &le; N &le; 2 &middot; 10<sup>5</sup>) - the number of slots the machine has. The next line has N space-separated integers up to 10<sup>9</sup> in absolute value that the machine generated after you turned it on. The last line has two positive integers A, B from the machine specs. 1 &le; A, B &le; 1 000.</p>

### 출력

<p>In the first line, output the smallest cost needed to sort the sequence. In the second line, output K - the number of swaps needed to do that. In the next K lines output the description of the swaps that need to be done. In each line output two numbers - indices of elements to be swapped, separated by a space. Indices start with one. If two or more sequences have the same total cost, you can output any of them.</p>