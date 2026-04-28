# [Platinum II] Mutant Vaccine - 21839

[문제 링크](https://www.acmicpc.net/problem/21839)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 14, 맞힌 사람: 12, 정답 비율: 16.667%

### 분류

자료 구조, 문자열, 이분 탐색, 집합과 맵, 해시를 사용한 집합과 맵, 매개 변수 탐색, 해싱, 접미사 배열과 LCP 배열

### 문제 설명

<p>Dr. Icey Peacie is working on a vaccine for Covid-19. One difficulty with vaccines is that viruses mutate, so there are many different strains circulating. Dr. Peacie wants the vaccine to target a part of the genetic sequence of the virus that all the strains have in common. Can you find the longest piece of RNA that occurs in all of the strains?</p>

### 입력

<p>The first line of input contains an integer N, the number of strains of the virus, with 1 &le; N &le; 100. The next N lines each contain the genetic sequence of a strain of the virus, a string of the letters <code>A</code>, <code>C</code>, <code>G</code>, and <code>T</code>. Each string has length between 1 and 10 000.</p>

### 출력

<p>Output a single line containing the longest string that occurs as a substring of all of the strains. If there is more than one such longest string, output the one that occurs earliest in the first strain.</p>