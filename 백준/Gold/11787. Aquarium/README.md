# [Gold II] Aquarium - 11787

[문제 링크](https://www.acmicpc.net/problem/11787)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 75, 정답: 45, 맞힌 사람: 43, 정답 비율: 58.904%

### 분류

구현, 자료 구조, 그래프 이론, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>There were different types of fish in your aquarium. But they did not go along well with each other. So there had been Fish-War-1 among them. It was a complete mess. Lot of fishes died, many of them hid in some mountain, some were eaten by other fishes and so on. So you decided to compartmentalize your aquarium. You divided your aquarium into R x C grids, that is R rows and C columns. Then you inserted walls into each cell. The walls are slanted, that is it goes from north-east corner to south-west corner or north-west corner to south-east corner. They look like &ldquo;/&rdquo; or &ldquo;\&rdquo; respectively. Many years passed since the war. Now the fishes want to unite again. They want to bring down the walls. They measured the strength of each of the walls. What is the minimum amount of strength they need to spend to unite all the compartments?</p>

<p>For example, in the following 2 x 2 grid, they can spend 7 + 9 + 12 = 28 unit strength to unite the 4 compartments. And this is the minimum.&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11787/1.png" style="height:294px; width:292px" /></p>

### 입력

<p>First line of the input contains number of test case T (&lt;= 20). Hence follows T test cases.</p>

<p>First line of the test case describes number of row R and number of columns C (1 &lt;= R, C &lt;= 100). Next R lines describe the walls. Each of these lines contains C characters and the characters are either &ldquo;/&rdquo; or &ldquo;\&rdquo;. Next R lines contain C positive integers, each describes the strength of the wall at the corresponding cell. The strength of a wall would be at most 10,000.&nbsp;</p>

### 출력

<p>For each test case output the case number and the minimum amount of strength to unite all the compartments in the aquarium.&nbsp;</p>