# [Gold III] Herding - 6837

[문제 링크](https://www.acmicpc.net/problem/6837)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 25, 맞힌 사람: 25, 정답 비율: 54.348%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 분리 집합, 함수형 그래프

### 문제 설명

<p>Oh no! A number of stray cats have been let loose in the city, and as the City Cat Catcher, you have been assigned the vital task of retrieving all of the cats. This is an ideal opportunity to test your latest invention, a cat trap which is guaranteed to retrieve every cat which walks into a square-shaped subsection of the city.</p>

<p>Fortunately, you have the assistance of one of the world&rsquo;s foremost cat psychologists, who has the amazing ability of predicting, given a square subsection of the city, exactly which of the four cardinal directions (north, east, south or west) the cat will head. While this information is handy, you still don&rsquo;t know where all the cats currently are.</p>

<p>In order to prove the cost-effectiveness of your method to the City it would, of course, be important to minimize the number of traps used.</p>

### 입력

<p>The input will begin with a line consisting of two numbers n and m, separated by a space (1 &le; n, m &le; 1000). The city will be an n &times; m grid of square subsections. The next n lines will each consist of a string of length m, consisting of the letters &lsquo;N&rsquo;, &lsquo;E&rsquo;, &lsquo;S&rsquo;, or &lsquo;W&rsquo;, representing north, east, south and west, respectively. (The first character of the first line will be the northwesternmost point.) The direction in the square is the direction which cats will head if they are in that square. The cat psychologist assures you that cats have no interest in leaving the city.</p>

### 출력

<p>Output the minimum number of traps needed.</p>