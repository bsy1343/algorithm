# [Gold III] Cash Machine - 3797

[문제 링크](https://www.acmicpc.net/problem/3797)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 13, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>A Bank plans to install a machine for cash withdrawal. The machine is able to deliver appropriate &clubs;&nbsp;bills for a requested cash amount. The machine uses exactly N distinct bill denominations, say D<sub>k</sub>, k=1,N, and for each denomination D<sub>k</sub> the machine has a supply of n<sub>k</sub> bills. For example,</p>

<p style="text-align: center;">N=3, n<sub>1</sub>=10, D<sub>1</sub>=100, n<sub>2</sub>=4, D<sub>2</sub>=50, n<sub>3</sub>=5, D<sub>3</sub>=10</p>

<p>means the machine has a supply of 10 bills of &clubs;100 each, 4 bills of &clubs;50 each, and 5 bills of &clubs;10 each.</p>

<p>Call cash the requested amount of cash the machine should deliver and write a program that computes the maximum amount of cash less than or equal to cash that can be effectively delivered according to the available bill supply of the machine.</p>

### 입력

<p>Each data set in the file stands for a particular transaction and has the format:</p>

<p style="text-align: center;">cash N n<sub>1</sub> D<sub>1</sub> n<sub>2</sub> D<sub>2</sub> ... n<sub>N</sub> D<sub>N</sub></p>

<p>where 0 &le; cash &le; 100000 is the amount of cash requested, 0 &le; N &le; 10 is the number of bill denominations and 0 &le; n<sub>k</sub> &le; 1000 is the number of available bills for the D<sub>k</sub> denomination, 1 &le; D<sub>k</sub> &le; 1000, k=1,N. White spaces can occur freely between the numbers in the input. The input data are correct.</p>

### 출력

<p>For each set of data the program prints the result to the standard output on a separate line.</p>

### 힌트

<p>The first data set designates a transaction where the amount of cash requested is &clubs;735. The machine contains 3 bill denominations: 4 bills of &clubs;125, 6 bills of &clubs;5, and 3 bills of &clubs;350. The machine can deliver the exact amount of requested cash.</p>

<p>In the second case the bill supply of the machine does not fit the exact amount of cash requested. The maximum cash that can be delivered is &clubs;630. Notice that there can be several possibilities to combine the bills in the machine for matching the delivered cash.</p>

<p>In the third case the machine is empty and no cash is delivered. In the fourth case the amount of cash requested is &clubs;0 and, therefore, the machine delivers no cash.</p>