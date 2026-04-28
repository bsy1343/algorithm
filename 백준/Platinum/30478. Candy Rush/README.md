# [Platinum I] Candy Rush - 30478

[문제 링크](https://www.acmicpc.net/problem/30478)

### 성능 요약

시간 제한: 2.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 128, 정답: 40, 맞힌 사람: 33, 정답 비율: 37.500%

### 분류

자료 구조, 집합과 맵, 누적 합, 해싱

### 문제 설명

<p>It&rsquo;s rush hour! You&rsquo;ve called it a day at work, and you need to buy candies for all your family members before the mall closes.</p>

<p>Exclusivity and uniformity are characteristics highly valued by your family, and in order to impress them, you&rsquo;ve come up with a plan. All the candies given to each family member should be from a single brand, and no other family member should receive candies from that same brand. Additionally, you don&rsquo;t want to admit you love some more than others, so you want everyone to receive the same number of candies.</p>

<p>The mall has a store that sells candies from K different brands. Coincidentally, your family consists of exactly K members. This may seem too easy, but of course there&rsquo;s a catch.</p>

<p>The store displays its candies aligned on a single shelf. You don&rsquo;t have time to select candies individually; instead, you want to buy a group of contiguous candies to complete your task efficiently. This means that when you purchase any pair of candies, you must also buy all the candies located between them on the shelf.</p>

<p>What is the maximum number of candies that you can buy?</p>

### 입력

<p>The first line contains two integers N and K (1 &le; N, K &le; 4 &times; 10<sup>5</sup>), indicating respectively the number of candies on the shelf and the number of family members. Candy brands are identified by distinct integers from 1 to K.</p>

<p>The second line contains N integers C<sub>1</sub>, C<sub>2</sub>, ..., C<sub>N</sub> (1 &le; C<sub>i</sub> &le; K for i = 1, 2, . . . , N), denoting the brand of each candy on the shelf, in left-to-right order.</p>

### 출력

<p>Output a single line with an integer indicating the maximum number of candies that you can buy to your family. Recall that no family member can receive two different candy brands, and no candy brand can be purchased for two different family members. Additionally, each family member must receive the same number of candies, and the candies must be purchased as a contiguous block from the shelf.</p>