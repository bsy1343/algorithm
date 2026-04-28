# [Gold IV] WiFi - 4189

[문제 링크](https://www.acmicpc.net/problem/4189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 39, 맞힌 사람: 27, 정답 비율: 49.091%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>One day, the residents of Main Street got together and decided that they would install wireless internet on their street, with coverage for every house. Now they need your help to decide where they should place the wireless access points. They would like to have as strong a signal as possible in every house, but they have only a limited budget for purchasing access points. They would like to place the available access points so that the maximum distance between any house and the access point closest to it is as small as possible.</p>

<p>Main Street is a perfectly straight road. The street number of each house is the number of metres from the end of the street to the house. For example, the house at address 123 Main Street is exactly 123 metres from the end of the street.</p>

### 입력

<p>The first line of input contains an integer specifying the number of test cases to follow. The first line of each test case contains two positive integers n, the number of access points that the residents can buy, and m, the number of houses on Main Street. The following m lines contain the house numbers of the houses on Main Street, one house number on each line. There will be no more than 100 000 houses on Main Street, and the house numbers will be no larger than one million.</p>

### 출력

<p>For each test case, output a line containing one number, the maximum distance between any house and the access point nearest to it. Round the number to the nearest tenth of a metre, and output it with exactly one digit after the decimal point.</p>