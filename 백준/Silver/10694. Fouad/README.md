# [Silver IV] Fouad - 10694

[문제 링크](https://www.acmicpc.net/problem/10694)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 160, 정답: 33, 맞힌 사람: 26, 정답 비율: 26.804%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>In one of the national contests, the ACPC steering committee decided that the top 7 teams in the contest would all receive a monetary prize of equal value and that the total amount of the prize money would be written on the banner dedicated to the contest sponsor. The prize value written on the banner would be spelled using a number of 3D digits placed next to each other, the problem is that Abdulrahman Jamal Abouelkhair (a student in the AAST in Alexandria, a member in the ROV team in the AAST and a member of the media team in the ACPC) only found a few remaining digits in the nearby stores and bought all of them. Mohamed Fouad, the deputy regional director of the ACPC, decided that he does not want to waste resources by throwing away any of the digits, and Abdulrahman bought them without asking as usual, can you tell him how many numbers can be formed with these exact digits (without leading zeros) such that each number can be divided equally between the seven teams.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by T lines, each test case is a single line containing a string of at most 9 and at least 1 digit (from &lsquo;0&rsquo; to &lsquo;9&rsquo;) which are the digits to use (might contain leading zeros).</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without the quotes) where n is the test case number (starting from 1) followed by a space then R which is the answer for how many numbers that can be formed from these digits and are divisible by 7.</p>