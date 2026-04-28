# [Gold II] The Agency - 4027

[문제 링크](https://www.acmicpc.net/problem/4027)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 8, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>Following in the footsteps of a number of flight searching startups you want to create the first interplanetary travel website. Your first problem is to quickly find the cheapest way to travel between two planets. You have an advantage over your competitors because you have realized that all the planets and the flights between them have a special structure. Each planet is represented by a string of N bits and there is a flight between two planets if their N-bit strings differ in exactly one position.</p>

<p>The cost of a flight is the cost of landing on the destination planet. If the ith character in a planet&rsquo;s string is a 1 then the ith tax must be paid to land. The cost of landing on a planet is the sum of the applicable taxes.</p>

<p>Given the starting planet, ending planet, and cost of the ith tax compute the cheapest set of flights to get from the starting planet to the ending planet.</p>

### 입력

<p>Input for each test case will consist of two lines. The first line will have N (1 &le; N &le; 1,000), the number of bits representing a planet; S, a string of N zeroes and ones representing the starting planet; and E, a string representing the ending planet in the same format. The second line will contain N integers the ith of which is the cost of the ith tax. All costs will be between 1 and 1,000,000. The input will be terminated by a line with a single 0.</p>

### 출력

<p>For each test case output one number, the minimum cost to get from the starting planet to the ending planet, using the format given below.</p>