# [Platinum IV] Fundraising - 15057

[문제 링크](https://www.acmicpc.net/problem/15057)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 45, 맞힌 사람: 42, 정답 비율: 46.667%

### 분류

값 / 좌표 압축, 자료 구조, 세그먼트 트리

### 문제 설명

<p>A prestigious politician aiming for presidency next year is planning a fundraising dinner for her campaign. She has a list of some wealthy people in the country and wants to invite them in a way that the amount of money raised is as great as possible.</p>

<p>Sometimes wealthy people have futile behavior and don&rsquo;t like the idea that someone richer or prettier than them exists. Every time someone like this meets another person who is strictly prettier, but not strictly richer, then an argument ensues. Likewise, if they meet another person who is strictly richer, but not strictly prettier, an argument occurs as well. These two situations are the only possible causes of an argument involving two persons. Thus, two persons do not have an argument if one of them is strictly prettier and strictly richer than the other. Also, two persons do not have an argument if they are equally rich and equally pretty.</p>

<p>Since the presidential candidate wants to raise as much money as possible, an argument should be avoided at all costs, as it could ruin the campaign. Given the characteristics of some wealthy people in the country, you must find a guest list that maximizes the donations while ensuring that no argument will happen during the dinner.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 10<sup>5</sup>) representing the number of possible guests with known characteristics. Each of the next N lines describes a possible guest with three integers B, F and D (1 &le; B, F, D &le; 10<sup>9</sup>), indicating respectively the person&rsquo;s beauty, his/her fortune, and how much this person will donate if invited.</p>

### 출력

<p>Output a single line with an integer indicating the maximum sum of donations if guests are invited so that no argument will happen during the dinner.</p>