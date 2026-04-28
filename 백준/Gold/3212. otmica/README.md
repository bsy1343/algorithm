# [Gold IV] otmica - 3212

[문제 링크](https://www.acmicpc.net/problem/3212)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

구현

### 문제 설명

<p>Bob was kidnapped at a street intersection in a city he is unfamiliar with. Kidnappers put him in the car and started driving to their secret hideout. They knew that Bob is unfamiliar with the city so they didn&rsquo;t blindfold him. Bob decided to remember the way.</p>

<p>City consists of matrix of skyscrapers. There is a street between every two neighboring skyscrapers. Streets are numbered starting from number 1 from top to down and from left to right.</p>

<p>When kidnappers drive through a street, Bob secretly notes down height of the skyscraper to the left of the car and to the right of the car. After the car drives through the intersection, Bob again notes the heights and so on. On every intersection, driver can turn left, go straight, turn right or turn back. When they reached the hideout, Bob sent an SMS with all the heights to the police.</p>

<p>Write the program that will help the police to determine coordinates of the intersection where kidnapper&#39;s hideout is.</p>

### 입력

<p>In the first row there are two integers R and S, 3 &le; R, S &le; 100, number of rows and columns of matrix of skyscrapers in the city.</p>

<p>In the next R rows there are S integers per row, heights of the skyscrapers. Every skyscraper is tall at least 1 and at most 10,000.</p>

<p>In the next row there is an integer N, 1 &le; N &le; 10,000, length of the path kidnappers drove Bob on.</p>

<p>In the next row there are N numbers, heights of the skyscrapers which Bob saw on the left of the car.</p>

<p>In the next row there are N numbers, heights of the skyscrapers which Bob saw on the right of the car.</p>

### 출력

<p>In first and only row you should write coordinates (first row, then column) of the intersection where kidnapper&#39;s hideout is. If there are multiple solutions, write any one of them.</p>