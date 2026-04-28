# [Platinum II] Candies - 3355

[문제 링크](https://www.acmicpc.net/problem/3355)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 10, 맞힌 사람: 8, 정답 비율: 33.333%

### 분류

비트마스킹, 다이나믹 프로그래밍

### 문제 설명

<p>Kristian works as a shopkeeper and sells candies. There are N packages in his shop and each of them may contain a different number of candies. When a customer comes and asks for K candies, Kristian has to bring some packages, such that the total number of candies in those packages is equal to K. If he is unable to do this, for example if someone asks for 4 candies and there are only 5 packages with 3 candies in each of them, often the customer gets upset and leaves.</p>

<p>Because of that, Kristian wanted to know how many different options he could provide to the next customer with the packages he currently has. He managed to solve this problem and now he is wondering what to do to improve the result. He wants to open one package and change the number of candies in it so that the total number of distinct options he can offer to the customer will increase as much as possible.</p>

### 입력

<p>The first line of the input contains one integer N (2 &le; N &le; 100). The second line contains a sequence of N integers B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 7 000) separated by single spaces and describing the numbers of candies in each package.</p>

### 출력

<p>The first and only line of the text file candies.out should contain two integers P and Q separated by a single space. They mean that Kristian should take a package with P candies and change the number of candies in it to Q. P has to be equal to one of Bi . Since there can be many optimal results, output the one with P as small as possible. Among all results with the minimal P, choose the smallest possible Q. You can assume that Kristian can increase the total number of distinct orders he can serve by altering a single package.</p>