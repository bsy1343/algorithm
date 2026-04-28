# [Gold IV] Ice cream samples - 14983

[문제 링크](https://www.acmicpc.net/problem/14983)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 16, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

두 포인터

### 문제 설명

<p>To encourage visitors active movement among the attractions, a circular path with ice cream stands was built in the park some time ago. A discount system common for all stands was also introduced. When a customer buys ice cream at some stand, he is automatically granted a discount for one day at the next stand on the path. When visitors start at any stand and follow systematically the discount directions to the next stands, they eventually traverse the whole circular path and return back to the stand they started at.</p>

<p>Ice creams of various brands are sold at the stands. Additionally, each stand sells a nice sample box which contains small samples of popular ice cream brands. The number of samples in the box depends on the stand and various stands may put different brands into their sample boxes. Each box contains samples of one or more brands. A brand may be represented by one or more samples in the box, or it may be completely missing. Each stand sells only one type of sample box (the brands of the samples in the box are always the same for that particular stand).</p>

<p>Quido and Hugo are going to exploit the discount system for their own benefit. They decided to start at some stand and then continue in the direction of the discounts buying one ice cream sample box at each stand they visit in a consecutive sequence. Their goal is to collect at least one sample of each ice cream brand sold in the park. Simultaneously, to respect their stomach capacities, they want to minimize the total number of ice cream samples they buy.</p>

### 입력

<p>There are more test cases. Each case starts with a line containing two integers N, K separated by space (1 &le; N, K &le; 10<sup>6</sup>). N is the number of ice cream stands, K is the total number of different ice cream brands sold at all stands. The brands are labeled by numbers 1, 2, . . . , K. Next, there are N lines describing stands in their visiting order. Each such line contains the list of brands of all ice cream samples sold in the sample box at that particular stand. Each list starts with one positive integer L, describing its length, followed by L integers. Each list item represents the brand of one ice cream sample in the sample box sold at this stand. You may assume that even if a visitor buys one sample box at each stand, he/she will collect at most 10<sup>7</sup> ice cream samples.</p>

### 출력

<p>For each test case, print a single line with one integer denoting the minimum number of ice cream samples Quido and Hugo have to buy in order to obtain a sample of each ice cream brand sold in the park. If it is impossible to obtain samples of all brands output &minus;1.</p>