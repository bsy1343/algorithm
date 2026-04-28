# [Gold IV] Painter - 4625

[문제 링크](https://www.acmicpc.net/problem/4625)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 40, 맞힌 사람: 35, 정답 비율: 72.917%

### 분류

수학, 구현, 자료 구조, 그리디 알고리즘, 브루트포스 알고리즘, 이분 탐색, 시뮬레이션, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<p>The local toy store sells small fingerpainting kits with between three and twelve 50ml bottles of paint, each a different color. The paints are bright and fun to work with, and have the useful property that if you mix X ml each of any three different colors, you get X ml of gray. (The paints are thick and &quot;airy&quot;, almost like cake frosting, and when you mix them together the volume doesn&#39;t increase, the paint just gets more dense.) None of the individual colors are gray; the only way to get gray is by mixing exactly three distinct colors, but it doesn&#39;t matter which three. Your friend Emily is an elementary school teacher and every Friday she does a fingerpainting project with her class. Given the number of different colors needed, the amount of each color, and the amount of gray, your job is to calculate the number of kits needed for her class.</p>

### 입력

<p>The input consists of one or more test cases, followed by a line containing only zero that signals the end of the input. Each test case consists of a single line of five or more integers, which are separated by a space. The first integer N is the number of different colors (3 &le; N &le; 12). Following that are N different nonnegative integers, each at most 1,000, that specify the amount of each color needed. Last is a nonnegative integer G &le; 1,000 that specifies the amount of gray needed. All quantities are in ml.</p>

### 출력

<p>For each test case, output the smallest number of fingerpainting kits sufficient to provide the required amounts of all the colors and gray. Note that all grays are considered equal, so in order to find the minimum number of kits for a test case you may need to make grays using different combinations of three distinct colors.</p>